/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.storage;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class EdgeKey implements TBase, java.io.Serializable, Cloneable, Comparable<EdgeKey> {
  private static final TStruct STRUCT_DESC = new TStruct("EdgeKey");
  private static final TField SRC_FIELD_DESC = new TField("src", TType.I64, (short)1);
  private static final TField EDGE_TYPE_FIELD_DESC = new TField("edge_type", TType.I32, (short)2);
  private static final TField RANKING_FIELD_DESC = new TField("ranking", TType.I64, (short)3);
  private static final TField DST_FIELD_DESC = new TField("dst", TType.I64, (short)4);

  public long src;
  public int edge_type;
  public long ranking;
  public long dst;
  public static final int SRC = 1;
  public static final int EDGE_TYPE = 2;
  public static final int RANKING = 3;
  public static final int DST = 4;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __SRC_ISSET_ID = 0;
  private static final int __EDGE_TYPE_ISSET_ID = 1;
  private static final int __RANKING_ISSET_ID = 2;
  private static final int __DST_ISSET_ID = 3;
  private BitSet __isset_bit_vector = new BitSet(4);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SRC, new FieldMetaData("src", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(EDGE_TYPE, new FieldMetaData("edge_type", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(RANKING, new FieldMetaData("ranking", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(DST, new FieldMetaData("dst", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(EdgeKey.class, metaDataMap);
  }

  public EdgeKey() {
  }

  public EdgeKey(
    long src,
    int edge_type,
    long ranking,
    long dst)
  {
    this();
    this.src = src;
    setSrcIsSet(true);
    this.edge_type = edge_type;
    setEdge_typeIsSet(true);
    this.ranking = ranking;
    setRankingIsSet(true);
    this.dst = dst;
    setDstIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EdgeKey(EdgeKey other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.src = TBaseHelper.deepCopy(other.src);
    this.edge_type = TBaseHelper.deepCopy(other.edge_type);
    this.ranking = TBaseHelper.deepCopy(other.ranking);
    this.dst = TBaseHelper.deepCopy(other.dst);
  }

  public EdgeKey deepCopy() {
    return new EdgeKey(this);
  }

  @Deprecated
  public EdgeKey clone() {
    return new EdgeKey(this);
  }

  public long  getSrc() {
    return this.src;
  }

  public EdgeKey setSrc(long src) {
    this.src = src;
    setSrcIsSet(true);
    return this;
  }

  public void unsetSrc() {
    __isset_bit_vector.clear(__SRC_ISSET_ID);
  }

  // Returns true if field src is set (has been assigned a value) and false otherwise
  public boolean isSetSrc() {
    return __isset_bit_vector.get(__SRC_ISSET_ID);
  }

  public void setSrcIsSet(boolean value) {
    __isset_bit_vector.set(__SRC_ISSET_ID, value);
  }

  public int  getEdge_type() {
    return this.edge_type;
  }

  public EdgeKey setEdge_type(int edge_type) {
    this.edge_type = edge_type;
    setEdge_typeIsSet(true);
    return this;
  }

  public void unsetEdge_type() {
    __isset_bit_vector.clear(__EDGE_TYPE_ISSET_ID);
  }

  // Returns true if field edge_type is set (has been assigned a value) and false otherwise
  public boolean isSetEdge_type() {
    return __isset_bit_vector.get(__EDGE_TYPE_ISSET_ID);
  }

  public void setEdge_typeIsSet(boolean value) {
    __isset_bit_vector.set(__EDGE_TYPE_ISSET_ID, value);
  }

  public long  getRanking() {
    return this.ranking;
  }

  public EdgeKey setRanking(long ranking) {
    this.ranking = ranking;
    setRankingIsSet(true);
    return this;
  }

  public void unsetRanking() {
    __isset_bit_vector.clear(__RANKING_ISSET_ID);
  }

  // Returns true if field ranking is set (has been assigned a value) and false otherwise
  public boolean isSetRanking() {
    return __isset_bit_vector.get(__RANKING_ISSET_ID);
  }

  public void setRankingIsSet(boolean value) {
    __isset_bit_vector.set(__RANKING_ISSET_ID, value);
  }

  public long  getDst() {
    return this.dst;
  }

  public EdgeKey setDst(long dst) {
    this.dst = dst;
    setDstIsSet(true);
    return this;
  }

  public void unsetDst() {
    __isset_bit_vector.clear(__DST_ISSET_ID);
  }

  // Returns true if field dst is set (has been assigned a value) and false otherwise
  public boolean isSetDst() {
    return __isset_bit_vector.get(__DST_ISSET_ID);
  }

  public void setDstIsSet(boolean value) {
    __isset_bit_vector.set(__DST_ISSET_ID, value);
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case SRC:
      if (value == null) {
        unsetSrc();
      } else {
        setSrc((Long)value);
      }
      break;

    case EDGE_TYPE:
      if (value == null) {
        unsetEdge_type();
      } else {
        setEdge_type((Integer)value);
      }
      break;

    case RANKING:
      if (value == null) {
        unsetRanking();
      } else {
        setRanking((Long)value);
      }
      break;

    case DST:
      if (value == null) {
        unsetDst();
      } else {
        setDst((Long)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case SRC:
      return new Long(getSrc());

    case EDGE_TYPE:
      return new Integer(getEdge_type());

    case RANKING:
      return new Long(getRanking());

    case DST:
      return new Long(getDst());

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case SRC:
      return isSetSrc();
    case EDGE_TYPE:
      return isSetEdge_type();
    case RANKING:
      return isSetRanking();
    case DST:
      return isSetDst();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EdgeKey)
      return this.equals((EdgeKey)that);
    return false;
  }

  public boolean equals(EdgeKey that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_src = true;
    boolean that_present_src = true;
    if (this_present_src || that_present_src) {
      if (!(this_present_src && that_present_src))
        return false;
      if (!TBaseHelper.equalsNobinary(this.src, that.src))
        return false;
    }

    boolean this_present_edge_type = true;
    boolean that_present_edge_type = true;
    if (this_present_edge_type || that_present_edge_type) {
      if (!(this_present_edge_type && that_present_edge_type))
        return false;
      if (!TBaseHelper.equalsNobinary(this.edge_type, that.edge_type))
        return false;
    }

    boolean this_present_ranking = true;
    boolean that_present_ranking = true;
    if (this_present_ranking || that_present_ranking) {
      if (!(this_present_ranking && that_present_ranking))
        return false;
      if (!TBaseHelper.equalsNobinary(this.ranking, that.ranking))
        return false;
    }

    boolean this_present_dst = true;
    boolean that_present_dst = true;
    if (this_present_dst || that_present_dst) {
      if (!(this_present_dst && that_present_dst))
        return false;
      if (!TBaseHelper.equalsNobinary(this.dst, that.dst))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_src = true;
    builder.append(present_src);
    if (present_src)
      builder.append(src);

    boolean present_edge_type = true;
    builder.append(present_edge_type);
    if (present_edge_type)
      builder.append(edge_type);

    boolean present_ranking = true;
    builder.append(present_ranking);
    if (present_ranking)
      builder.append(ranking);

    boolean present_dst = true;
    builder.append(present_dst);
    if (present_dst)
      builder.append(dst);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(EdgeKey other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSrc()).compareTo(other.isSetSrc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(src, other.src);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetEdge_type()).compareTo(other.isSetEdge_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(edge_type, other.edge_type);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetRanking()).compareTo(other.isSetRanking());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(ranking, other.ranking);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetDst()).compareTo(other.isSetDst());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(dst, other.dst);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case SRC:
          if (field.type == TType.I64) {
            this.src = iprot.readI64();
            setSrcIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case EDGE_TYPE:
          if (field.type == TType.I32) {
            this.edge_type = iprot.readI32();
            setEdge_typeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case RANKING:
          if (field.type == TType.I64) {
            this.ranking = iprot.readI64();
            setRankingIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case DST:
          if (field.type == TType.I64) {
            this.dst = iprot.readI64();
            setDstIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(SRC_FIELD_DESC);
    oprot.writeI64(this.src);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(EDGE_TYPE_FIELD_DESC);
    oprot.writeI32(this.edge_type);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(RANKING_FIELD_DESC);
    oprot.writeI64(this.ranking);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(DST_FIELD_DESC);
    oprot.writeI64(this.dst);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("EdgeKey");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("src");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getSrc(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("edge_type");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getEdge_type(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("ranking");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getRanking(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("dst");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getDst(), indent + 1, prettyPrint));
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

