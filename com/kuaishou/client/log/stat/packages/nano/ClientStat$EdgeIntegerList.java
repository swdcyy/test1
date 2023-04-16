package com.kuaishou.client.log.stat.packages.nano.ClientStat$EdgeIntegerList;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.System;

public final class ClientStat$EdgeIntegerList extends MessageNano	// class@0013cf
{
    public long[] intListValue;
    public static ClientStat$EdgeIntegerList[] _emptyArray;

    public void ClientStat$EdgeIntegerList(){
       super();
       this.clear();
    }
    public static ClientStat$EdgeIntegerList[] emptyArray(){
       if (ClientStat$EdgeIntegerList._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$EdgeIntegerList._emptyArray == null) {
             ClientStat$EdgeIntegerList[] uEdgeInteger = new ClientStat$EdgeIntegerList[0];
             ClientStat$EdgeIntegerList._emptyArray = uEdgeInteger;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$EdgeIntegerList._emptyArray;
    }
    public static ClientStat$EdgeIntegerList parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$EdgeIntegerList().mergeFrom(p0);
    }
    public static ClientStat$EdgeIntegerList parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$EdgeIntegerList(), p0);
    }
    public ClientStat$EdgeIntegerList clear(){
       this.intListValue = WireFormatNano.EMPTY_LONG_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$EdgeIntegerList tintListValu = this.intListValue;
       if (tintListValu != null && tintListValu.length > 0) {
          int i1 = 0;
          int i2 = 0;
          ClientStat$EdgeIntegerList tintListValu1 = this.intListValue;
          while (i1 < tintListValu1.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeInt64SizeNoTag(tintListValu1[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (tintListValu1.length * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$EdgeIntegerList mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       ClientStat$EdgeIntegerList tintListValu;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 8;
          if (i != i1) {
             if (i != 10) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = p0.pushLimit(p0.readRawVarint32());
                i1 = p0.getPosition();
                i2 = 0;
                while (p0.getBytesUntilLimit() > 0) {
                   p0.readInt64();
                   i2 = i2 + 1;
                }
                p0.rewindToPosition(i1);
                tintListValu = this.intListValue;
                int i3 = (tintListValu == null)? 0: tintListValu.length;
                i2 = i2 + i3;
                long[] olongArray = new long[i2];
                if (i3) {
                   System.arraycopy(tintListValu, 0, olongArray, 0, i3);
                }
                while (i3 < i2) {
                   olongArray[i3] = p0.readInt64();
                   i3 = i3 + 1;
                }
                this.intListValue = olongArray;
                p0.popLimit(i);
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             tintListValu = this.intListValue;
             i2 = (tintListValu == null)? 0: tintListValu.length;
             i = i + i2;
             long[] olongArray1 = new long[i];
             if (i2) {
                System.arraycopy(tintListValu, 0, olongArray1, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                olongArray1[i2] = p0.readInt64();
                p0.readTag();
                i2 = i2 + 1;
             }
             olongArray1[i2] = p0.readInt64();
             this.intListValue = olongArray1;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$EdgeIntegerList tintListValu = this.intListValue;
       if (tintListValu != null && tintListValu.length > 0) {
          int i = 0;
          ClientStat$EdgeIntegerList tintListValu1 = this.intListValue;
          while (i < tintListValu1.length) {
             p0.writeInt64(1, tintListValu1[i]);
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
