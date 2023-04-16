package com.kuaishou.client.log.stat.packages.nano.ClientStat$EdgeFloatList;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;
import com.google.protobuf.nano.CodedOutputByteBufferNano;

public final class ClientStat$EdgeFloatList extends MessageNano	// class@0013ce
{
    public float[] floatListValue;
    public static ClientStat$EdgeFloatList[] _emptyArray;

    public void ClientStat$EdgeFloatList(){
       super();
       this.clear();
    }
    public static ClientStat$EdgeFloatList[] emptyArray(){
       if (ClientStat$EdgeFloatList._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$EdgeFloatList._emptyArray == null) {
             ClientStat$EdgeFloatList[] uEdgeFloatLi = new ClientStat$EdgeFloatList[0];
             ClientStat$EdgeFloatList._emptyArray = uEdgeFloatLi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$EdgeFloatList._emptyArray;
    }
    public static ClientStat$EdgeFloatList parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$EdgeFloatList().mergeFrom(p0);
    }
    public static ClientStat$EdgeFloatList parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$EdgeFloatList(), p0);
    }
    public ClientStat$EdgeFloatList clear(){
       this.floatListValue = WireFormatNano.EMPTY_FLOAT_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$EdgeFloatList tfloatListVa = this.floatListValue;
       if (tfloatListVa != null && tfloatListVa.length > 0) {
          i = (i + (tfloatListVa.length * 4)) + (tfloatListVa.length * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$EdgeFloatList mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 0;
          if (i != 10) {
             i2 = 13;
             if (i != i2) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i2);
                ClientStat$EdgeFloatList tfloatListVa = this.floatListValue;
                int i3 = (tfloatListVa == null)? 0: tfloatListVa.length;
                i = i + i3;
                float[] uofloatArray = new float[i];
                if (i3) {
                   System.arraycopy(tfloatListVa, i1, uofloatArray, i1, i3);
                }
                i2 = i - 1;
                while (i3 < i2) {
                   uofloatArray[i3] = p0.readFloat();
                   p0.readTag();
                   i3 = i3 + 1;
                }
                uofloatArray[i3] = p0.readFloat();
                this.floatListValue = uofloatArray;
             }
          }else {
             i = p0.readRawVarint32();
             i2 = p0.pushLimit(i);
             i = i / 4;
             ClientStat$EdgeFloatList tfloatListVa1 = this.floatListValue;
             int i4 = (tfloatListVa1 == null)? 0: tfloatListVa1.length;
             i = i + i4;
             float[] uofloatArray1 = new float[i];
             if (i4) {
                System.arraycopy(tfloatListVa1, i1, uofloatArray1, i1, i4);
             }
             while (i4 < i) {
                uofloatArray1[i4] = p0.readFloat();
                i4 = i4 + 1;
             }
             this.floatListValue = uofloatArray1;
             p0.popLimit(i2);
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$EdgeFloatList tfloatListVa = this.floatListValue;
       if (tfloatListVa != null && tfloatListVa.length > 0) {
          int i = 0;
          ClientStat$EdgeFloatList tfloatListVa1 = this.floatListValue;
          while (i < tfloatListVa1.length) {
             p0.writeFloat(1, tfloatListVa1[i]);
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
