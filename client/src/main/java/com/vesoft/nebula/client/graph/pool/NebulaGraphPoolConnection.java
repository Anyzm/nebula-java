/* Copyright (c) 2020 vesoft inc. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */

package com.vesoft.nebula.client.graph.pool;

import com.facebook.thrift.TException;
import com.facebook.thrift.transport.TTransport;
import com.vesoft.nebula.client.graph.ConnectionException;
import com.vesoft.nebula.client.graph.GraphExecuteUtils;
import com.vesoft.nebula.client.graph.NGQLException;
import com.vesoft.nebula.client.graph.NebulaGraphConnection;
import com.vesoft.nebula.client.graph.ResultSet;
import com.vesoft.nebula.graph.GraphService;
import java.util.Objects;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author huangzhaolai-jk
 * @version 1.0.0
 * @Description NebulaGraphPoolConnection
 * @Date 2020/3/17 - 13:57
 */
public class NebulaGraphPoolConnection implements NebulaGraphConnection {

    private final Logger log = LogManager.getLogger(NebulaGraphPoolConnection.class);

    private GraphService.Client graphClient;

    private TTransport transport;

    private long sessionId;

    private int executionRetry;

    NebulaGraphPoolConnection(GraphService.Client graphClient,
                              TTransport transport,
                              long sessionId,
                              int executionRetry) {
        this.graphClient = graphClient;
        this.transport = transport;
        this.sessionId = sessionId;
        this.executionRetry = executionRetry;
    }

    @Override
    public int switchSpace(String space) {
        return execute(String.format("USE %s", space));
    }

    @Override
    public int execute(String statement) {
        return GraphExecuteUtils.execute(this.transport, this.graphClient,
                this.sessionId, statement, this.executionRetry);
    }

    @Override
    public ResultSet executeQuery(String statement) throws ConnectionException,
            NGQLException, TException {
        return GraphExecuteUtils.executeQuery(this.transport, this.graphClient,
                this.sessionId, statement);
    }

    @Override
    public void close() {
        try {
            this.graphClient.signout(this.sessionId);
        } catch (TException e) {
            this.log.error("Disconnect error: " + e.getMessage());
        } finally {
            if (this.transport != null) {
                this.transport.close();
            }
        }
    }

    @Override
    public boolean isOpened() {
        return this.transport != null && this.transport.isOpen();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NebulaGraphPoolConnection that = (NebulaGraphPoolConnection) o;
        return this.sessionId == that.sessionId
                && Objects.equals(this.graphClient, that.graphClient)
                && Objects.equals(this.transport, that.transport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.graphClient, this.transport, this.sessionId);
    }
}