package com.kuaishou.client.log.stat.packages.nano.ClientStat$EdgeStringList;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.System;

public final class ClientStat$EdgeStringList extends MessageNano	// class@0013d4
{
    public String[] stringListValue;
    public static ClientStat$EdgeStringList[] _emptyArray;

    public void ClientStat$EdgeStringList(){
       super();
       this.clear();
    }
    public static ClientStat$EdgeStringList[] emptyArray(){
       if (ClientStat$EdgeStringList._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$EdgeStringList._emptyArray == null) {
             ClientStat$EdgeStringList[] uEdgeStringL = new ClientStat$EdgeStringList[0];
             ClientStat$EdgeStringList._emptyArray = uEdgeStringL;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$EdgeStringList._emptyArray;
    }
    public static ClientStat$EdgeStringList parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$EdgeStringList().mergeFrom(p0);
    }
    public static ClientStat$EdgeStringList parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$EdgeStringList(), p0);
    }
    public ClientStat$EdgeStringList clear(){
       this.stringListValue = WireFormatNano.EMPTY_STRING_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$EdgeStringList tstringListV = this.stringListValue;
       if (tstringListV != null && tstringListV.length > 0) {
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          ClientStat$EdgeStringList tstringListV1 = this.stringListValue;
          while (i1 < tstringListV1.length) {
             object oobject = tstringListV1[i1];
             if (oobject != null) {
                i3 = i3 + 1;
                i2 = i2 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i1 = i1 + 1;
          }
          i = (i + i2) + (i3 * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$EdgeStringList mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             ClientStat$EdgeStringList tstringListV = this.stringListValue;
             int i2 = (tstringListV == null)? 0: tstringListV.length;
             i = i + i2;
             String[] stringArray = new String[i];
             if (i2) {
                System.arraycopy(tstringListV, 0, stringArray, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                stringArray[i2] = p0.readString();
                p0.readTag();
                i2 = i2 + 1;
             }
             stringArray[i2] = p0.readString();
             this.stringListValue = stringArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$EdgeStringList tstringListV = this.stringListValue;
       if (tstringListV != null && tstringListV.length > 0) {
          int i = 0;
          ClientStat$EdgeStringList tstringListV1 = this.stringListValue;
          while (i < tstringListV1.length) {
             object oobject = tstringListV1[i];
             if (oobject != null) {
                p0.writeString(1, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
