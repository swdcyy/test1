package com.kuaishou.client.log.stat.packages.nano.ClientStat$AlarmInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$AlarmInfo extends MessageNano	// class@0013a5
{
    public int backgroundAlarmCnt;
    public int totalAlarmCnt;
    public static ClientStat$AlarmInfo[] _emptyArray;

    public void ClientStat$AlarmInfo(){
       super();
       this.clear();
    }
    public static ClientStat$AlarmInfo[] emptyArray(){
       if (ClientStat$AlarmInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$AlarmInfo._emptyArray == null) {
             ClientStat$AlarmInfo[] uAlarmInfoAr = new ClientStat$AlarmInfo[0];
             ClientStat$AlarmInfo._emptyArray = uAlarmInfoAr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$AlarmInfo._emptyArray;
    }
    public static ClientStat$AlarmInfo parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$AlarmInfo().mergeFrom(p0);
    }
    public static ClientStat$AlarmInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$AlarmInfo(), p0);
    }
    public ClientStat$AlarmInfo clear(){
       this.backgroundAlarmCnt = 0;
       this.totalAlarmCnt = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$AlarmInfo tbackgroundA = this.backgroundAlarmCnt;
       if (tbackgroundA != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tbackgroundA);
       }
       tbackgroundA = this.totalAlarmCnt;
       if (tbackgroundA != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tbackgroundA);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$AlarmInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.totalAlarmCnt = p0.readInt32();
             }
          }else {
             this.backgroundAlarmCnt = p0.readInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$AlarmInfo tbackgroundA = this.backgroundAlarmCnt;
       if (tbackgroundA != null) {
          p0.writeInt32(1, tbackgroundA);
       }
       tbackgroundA = this.totalAlarmCnt;
       if (tbackgroundA != null) {
          p0.writeInt32(2, tbackgroundA);
       }
       super.writeTo(p0);
       return;
    }
}
