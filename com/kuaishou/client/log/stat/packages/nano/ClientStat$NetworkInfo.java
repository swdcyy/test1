package com.kuaishou.client.log.stat.packages.nano.ClientStat$NetworkInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$NetworkInfo extends MessageNano	// class@00140c
{
    public long rxBytes;
    public long txBytes;
    public static ClientStat$NetworkInfo[] _emptyArray;

    public void ClientStat$NetworkInfo(){
       super();
       this.clear();
    }
    public static ClientStat$NetworkInfo[] emptyArray(){
       if (ClientStat$NetworkInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$NetworkInfo._emptyArray == null) {
             ClientStat$NetworkInfo[] networkInfoA = new ClientStat$NetworkInfo[0];
             ClientStat$NetworkInfo._emptyArray = networkInfoA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$NetworkInfo._emptyArray;
    }
    public static ClientStat$NetworkInfo parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$NetworkInfo().mergeFrom(p0);
    }
    public static ClientStat$NetworkInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$NetworkInfo(), p0);
    }
    public ClientStat$NetworkInfo clear(){
       this.rxBytes = 0;
       this.txBytes = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$NetworkInfo trxBytes = this.rxBytes;
       int i1 = 0;
       if (trxBytes - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(1, trxBytes);
       }
       trxBytes = this.txBytes;
       if (trxBytes - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(2, trxBytes);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$NetworkInfo mergeFrom(CodedInputByteBufferNano p0){
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
                this.txBytes = p0.readInt64();
             }
          }else {
             this.rxBytes = p0.readInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$NetworkInfo trxBytes = this.rxBytes;
       int i = 0;
       if (trxBytes - i) {
          p0.writeInt64(1, trxBytes);
       }
       trxBytes = this.txBytes;
       if (trxBytes - i) {
          p0.writeInt64(2, trxBytes);
       }
       super.writeTo(p0);
       return;
    }
}
