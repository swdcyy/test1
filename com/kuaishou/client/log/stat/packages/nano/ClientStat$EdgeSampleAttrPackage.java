package com.kuaishou.client.log.stat.packages.nano.ClientStat$EdgeSampleAttrPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EdgeIntegerList;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EdgeFloatList;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EdgeStringList;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.System;

public final class ClientStat$EdgeSampleAttrPackage extends MessageNano	// class@0013d3
{
    public ClientStat$EdgeFloatList[] float2DListValue;
    public float[] floatListValue;
    public float floatSingleValue;
    public ClientStat$EdgeIntegerList[] int2DListValue;
    public long[] intListValue;
    public long intSingleValue;
    public String name;
    public ClientStat$EdgeStringList[] string2DListValue;
    public String[] stringListValue;
    public String stringSingleValue;
    public int type;
    public static ClientStat$EdgeSampleAttrPackage[] _emptyArray;

    public void ClientStat$EdgeSampleAttrPackage(){
       super();
       this.clear();
    }
    public static ClientStat$EdgeSampleAttrPackage[] emptyArray(){
       if (ClientStat$EdgeSampleAttrPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$EdgeSampleAttrPackage._emptyArray == null) {
             ClientStat$EdgeSampleAttrPackage[] uEdgeSampleA = new ClientStat$EdgeSampleAttrPackage[0];
             ClientStat$EdgeSampleAttrPackage._emptyArray = uEdgeSampleA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$EdgeSampleAttrPackage._emptyArray;
    }
    public static ClientStat$EdgeSampleAttrPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$EdgeSampleAttrPackage().mergeFrom(p0);
    }
    public static ClientStat$EdgeSampleAttrPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$EdgeSampleAttrPackage(), p0);
    }
    public ClientStat$EdgeSampleAttrPackage clear(){
       this.type = 0;
       this.name = "";
       this.intSingleValue = 0;
       this.floatSingleValue = 0;
       this.stringSingleValue = "";
       this.intListValue = WireFormatNano.EMPTY_LONG_ARRAY;
       this.floatListValue = WireFormatNano.EMPTY_FLOAT_ARRAY;
       this.stringListValue = WireFormatNano.EMPTY_STRING_ARRAY;
       this.int2DListValue = ClientStat$EdgeIntegerList.emptyArray();
       this.float2DListValue = ClientStat$EdgeFloatList.emptyArray();
       this.string2DListValue = ClientStat$EdgeStringList.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i4;
       int i5;
       ClientStat$EdgeSampleAttrPackage tintListValu;
       ClientStat$EdgeSampleAttrPackage tint2DListVa;
       object oobject1;
       int i = super.computeSerializedSize();
       ClientStat$EdgeSampleAttrPackage ttype = this.type;
       int i1 = 1;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(i1, ttype);
       }
       String str = "";
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.name);
       }
       ClientStat$EdgeSampleAttrPackage tintSingleVa = this.intSingleValue;
       if (tintSingleVa - null) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(3, tintSingleVa);
       }
       int i2 = 4;
       if (Float.floatToIntBits(this.floatSingleValue) != Float.floatToIntBits(0)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(i2, this.floatSingleValue);
       }
       if (!(this.stringSingleValue).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.stringSingleValue);
       }
       ttype = this.intListValue;
       int i3 = 0;
       if (ttype != null && ttype.length > 0) {
          i4 = 0;
          i5 = 0;
          tintListValu = this.intListValue;
          while (i4 < tintListValu.length) {
             i5 = i5 + CodedOutputByteBufferNano.computeInt64SizeNoTag(tintListValu[i4]);
             i4 = i4 + 1;
          }
          i = (i + i5) + (tintListValu.length * 1);
       }
       ttype = this.floatListValue;
       if (ttype != null && ttype.length > 0) {
          i = (i + (ttype.length * 4)) + (ttype.length * 1);
       }
       ttype = this.stringListValue;
       if (ttype != null && ttype.length > 0) {
          i4 = 0;
          i5 = 0;
          i2 = 0;
          tintListValu = this.stringListValue;
          while (i4 < tintListValu.length) {
             object oobject = tintListValu[i4];
             if (oobject != null) {
                i2 = i2 + 1;
                i5 = i5 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i4 = i4 + 1;
          }
          i = (i + i5) + (i2 * 1);
       }
       ttype = this.int2DListValue;
       if (ttype != null && ttype.length > 0) {
          i4 = 0;
          tint2DListVa = this.int2DListValue;
          while (i4 < tint2DListVa.length) {
             oobject1 = tint2DListVa[i4];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(9, oobject1);
             }
             i4 = i4 + 1;
          }
       }
       ttype = this.float2DListValue;
       if (ttype != null && ttype.length > 0) {
          i4 = 0;
          tint2DListVa = this.float2DListValue;
          while (i4 < tint2DListVa.length) {
             oobject1 = tint2DListVa[i4];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(10, oobject1);
             }
             i4 = i4 + 1;
          }
       }
       ttype = this.string2DListValue;
       if (ttype != null && ttype.length > 0) {
          ttype = this.string2DListValue;
          while (i3 < ttype.length) {
             object oobject2 = ttype[i3];
             if (oobject2 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(11, oobject2);
             }
             i3 = i3 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$EdgeSampleAttrPackage mergeFrom(CodedInputByteBufferNano p0){
       ClientStat$EdgeSampleAttrPackage tintListValu;
       int i2;
       int position;
       int i3;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 8:
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 1:
                      break;
                    default:
                }
                this.type = i;
                break;
              case 18:
                this.name = p0.readString();
                break;
              case 24:
                this.intSingleValue = p0.readInt64();
                break;
              case '%':
                this.floatSingleValue = p0.readFloat();
                break;
              case '*':
                this.stringSingleValue = p0.readString();
                break;
              case '0':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 48);
                tintListValu = this.intListValue;
                i2 = (tintListValu == null)? 0: tintListValu.length;
                i = i + i2;
                long[] olongArray = new long[i];
                if (i2) {
                   System.arraycopy(tintListValu, i1, olongArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   olongArray[i2] = p0.readInt64();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                olongArray[i2] = p0.readInt64();
                this.intListValue = olongArray;
                break;
              case '2':
                i = p0.pushLimit(p0.readRawVarint32());
                position = p0.getPosition();
                i2 = 0;
                while (p0.getBytesUntilLimit() > 0) {
                   p0.readInt64();
                   i2 = i2 + 1;
                }
                p0.rewindToPosition(position);
                tintListValu = this.intListValue;
                i3 = (tintListValu == null)? 0: tintListValu.length;
                i2 = i2 + i3;
                long[] olongArray1 = new long[i2];
                if (i3) {
                   System.arraycopy(tintListValu, i1, olongArray1, i1, i3);
                }
                while (i3 < i2) {
                   olongArray1[i3] = p0.readInt64();
                   i3 = i3 + 1;
                }
                this.intListValue = olongArray1;
                p0.popLimit(i);
                break;
              case ':':
                i = p0.readRawVarint32();
                position = p0.pushLimit(i);
                i = i / 4;
                ClientStat$EdgeSampleAttrPackage tfloatListVa = this.floatListValue;
                i3 = (tfloatListVa == null)? 0: tfloatListVa.length;
                i = i + i3;
                float[] uofloatArray = new float[i];
                if (i3) {
                   System.arraycopy(tfloatListVa, i1, uofloatArray, i1, i3);
                }
                while (i3 < i) {
                   uofloatArray[i3] = p0.readFloat();
                   i3 = i3 + 1;
                }
                this.floatListValue = uofloatArray;
                p0.popLimit(position);
                break;
              case '=':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 61);
                tintListValu = this.floatListValue;
                i2 = (tintListValu == null)? 0: tintListValu.length;
                i = i + i2;
                float[] uofloatArray1 = new float[i];
                if (i2) {
                   System.arraycopy(tintListValu, i1, uofloatArray1, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uofloatArray1[i2] = p0.readFloat();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uofloatArray1[i2] = p0.readFloat();
                this.floatListValue = uofloatArray1;
                break;
              case 'B':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 66);
                tintListValu = this.stringListValue;
                i2 = (tintListValu == null)? 0: tintListValu.length;
                i = i + i2;
                String[] stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tintListValu, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.stringListValue = stringArray;
                break;
              case 'J':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 74);
                tintListValu = this.int2DListValue;
                i2 = (tintListValu == null)? 0: tintListValu.length;
                i = i + i2;
                ClientStat$EdgeIntegerList[] uEdgeInteger = new ClientStat$EdgeIntegerList[i];
                if (i2) {
                   System.arraycopy(tintListValu, i1, uEdgeInteger, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uEdgeInteger[i2] = new ClientStat$EdgeIntegerList();
                   p0.readMessage(uEdgeInteger[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uEdgeInteger[i2] = new ClientStat$EdgeIntegerList();
                p0.readMessage(uEdgeInteger[i2]);
                this.int2DListValue = uEdgeInteger;
                break;
              case 'R':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 82);
                tintListValu = this.float2DListValue;
                i2 = (tintListValu == null)? 0: tintListValu.length;
                i = i + i2;
                ClientStat$EdgeFloatList[] uEdgeFloatLi = new ClientStat$EdgeFloatList[i];
                if (i2) {
                   System.arraycopy(tintListValu, i1, uEdgeFloatLi, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uEdgeFloatLi[i2] = new ClientStat$EdgeFloatList();
                   p0.readMessage(uEdgeFloatLi[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uEdgeFloatLi[i2] = new ClientStat$EdgeFloatList();
                p0.readMessage(uEdgeFloatLi[i2]);
                this.float2DListValue = uEdgeFloatLi;
                break;
              case 'Z':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 90);
                tintListValu = this.string2DListValue;
                i2 = (tintListValu == null)? 0: tintListValu.length;
                i = i + i2;
                ClientStat$EdgeStringList[] uEdgeStringL = new ClientStat$EdgeStringList[i];
                if (i2) {
                   System.arraycopy(tintListValu, i1, uEdgeStringL, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uEdgeStringL[i2] = new ClientStat$EdgeStringList();
                   p0.readMessage(uEdgeStringL[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uEdgeStringL[i2] = new ClientStat$EdgeStringList();
                p0.readMessage(uEdgeStringL[i2]);
                this.string2DListValue = uEdgeStringL;
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i1;
       object oobject;
       ClientStat$EdgeSampleAttrPackage ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       String str = "";
       if (!(this.name).equals(str)) {
          p0.writeString(2, this.name);
       }
       ClientStat$EdgeSampleAttrPackage tintSingleVa = this.intSingleValue;
       if (tintSingleVa) {
          p0.writeInt64(3, tintSingleVa);
       }
       if (Float.floatToIntBits(this.floatSingleValue) != Float.floatToIntBits(0)) {
          p0.writeFloat(4, this.floatSingleValue);
       }
       if (!(this.stringSingleValue).equals(str)) {
          p0.writeString(5, this.stringSingleValue);
       }
       ttype = this.intListValue;
       int i = 0;
       if (ttype != null && ttype.length > 0) {
          i1 = 0;
          tintSingleVa = this.intListValue;
          while (i1 < tintSingleVa.length) {
             p0.writeInt64(6, tintSingleVa[i1]);
             i1 = i1 + 1;
          }
       }
       ttype = this.floatListValue;
       if (ttype != null && ttype.length > 0) {
          i1 = 0;
          tintSingleVa = this.floatListValue;
          while (i1 < tintSingleVa.length) {
             p0.writeFloat(7, tintSingleVa[i1]);
             i1 = i1 + 1;
          }
       }
       ttype = this.stringListValue;
       if (ttype != null && ttype.length > 0) {
          i1 = 0;
          tintSingleVa = this.stringListValue;
          while (i1 < tintSingleVa.length) {
             oobject = tintSingleVa[i1];
             if (oobject != null) {
                p0.writeString(8, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ttype = this.int2DListValue;
       if (ttype != null && ttype.length > 0) {
          i1 = 0;
          tintSingleVa = this.int2DListValue;
          while (i1 < tintSingleVa.length) {
             oobject = tintSingleVa[i1];
             if (oobject != null) {
                p0.writeMessage(9, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ttype = this.float2DListValue;
       if (ttype != null && ttype.length > 0) {
          i1 = 0;
          tintSingleVa = this.float2DListValue;
          while (i1 < tintSingleVa.length) {
             oobject = tintSingleVa[i1];
             if (oobject != null) {
                p0.writeMessage(10, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ttype = this.string2DListValue;
       if (ttype != null && ttype.length > 0) {
          ttype = this.string2DListValue;
          while (i < ttype.length) {
             object oobject1 = ttype[i];
             if (oobject1 != null) {
                p0.writeMessage(11, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
