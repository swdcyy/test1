package com.kuaishou.client.log.stat.packages.nano.ClientStat$WakelockInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$WakelockInfo extends MessageNano	// class@001446
{
    public int backgroundAcquireCnt;
    public int backgroundReleaseCnt;
    public static ClientStat$WakelockInfo[] _emptyArray;

    public void ClientStat$WakelockInfo(){
       super();
       this.clear();
    }
    public static ClientStat$WakelockInfo[] emptyArray(){
       if (ClientStat$WakelockInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$WakelockInfo._emptyArray == null) {
             ClientStat$WakelockInfo[] wakelockInfo = new ClientStat$WakelockInfo[0];
             ClientStat$WakelockInfo._emptyArray = wakelockInfo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$WakelockInfo._emptyArray;
    }
    public static ClientStat$WakelockInfo parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$WakelockInfo().mergeFrom(p0);
    }
    public static ClientStat$WakelockInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$WakelockInfo(), p0);
    }
    public ClientStat$WakelockInfo clear(){
       this.backgroundAcquireCnt = 0;
       this.backgroundReleaseCnt = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$WakelockInfo tbackgroundA = this.backgroundAcquireCnt;
       if (tbackgroundA != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tbackgroundA);
       }
       tbackgroundA = this.backgroundReleaseCnt;
       if (tbackgroundA != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tbackgroundA);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$WakelockInfo mergeFrom(CodedInputByteBufferNano p0){
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
                this.backgroundReleaseCnt = p0.readInt32();
             }
          }else {
             this.backgroundAcquireCnt = p0.readInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$WakelockInfo tbackgroundA = this.backgroundAcquireCnt;
       if (tbackgroundA != null) {
          p0.writeInt32(1, tbackgroundA);
       }
       tbackgroundA = this.backgroundReleaseCnt;
       if (tbackgroundA != null) {
          p0.writeInt32(2, tbackgroundA);
       }
       super.writeTo(p0);
       return;
    }
}
