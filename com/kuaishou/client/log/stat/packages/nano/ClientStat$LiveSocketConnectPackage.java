package com.kuaishou.client.log.stat.packages.nano.ClientStat$LiveSocketConnectPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$LiveSocketConnectPackage extends MessageNano	// class@001404
{
    public boolean connected;
    public long endTime;
    public long startTime;
    public static ClientStat$LiveSocketConnectPackage[] _emptyArray;

    public void ClientStat$LiveSocketConnectPackage(){
       super();
       this.clear();
    }
    public static ClientStat$LiveSocketConnectPackage[] emptyArray(){
       if (ClientStat$LiveSocketConnectPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$LiveSocketConnectPackage._emptyArray == null) {
             ClientStat$LiveSocketConnectPackage[] liveSocketCo = new ClientStat$LiveSocketConnectPackage[0];
             ClientStat$LiveSocketConnectPackage._emptyArray = liveSocketCo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$LiveSocketConnectPackage._emptyArray;
    }
    public static ClientStat$LiveSocketConnectPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$LiveSocketConnectPackage().mergeFrom(p0);
    }
    public static ClientStat$LiveSocketConnectPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$LiveSocketConnectPackage(), p0);
    }
    public ClientStat$LiveSocketConnectPackage clear(){
       this.startTime = 0;
       this.endTime = 0;
       this.connected = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$LiveSocketConnectPackage tstartTime = this.startTime;
       int i1 = 0;
       if (tstartTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tstartTime);
       }
       tstartTime = this.endTime;
       if (tstartTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tstartTime);
       }
       tstartTime = this.connected;
       if (tstartTime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tstartTime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$LiveSocketConnectPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.connected = p0.readBool();
                }
             }else {
                this.endTime = p0.readUInt64();
             }
          }else {
             this.startTime = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$LiveSocketConnectPackage tstartTime = this.startTime;
       int i = 0;
       if (tstartTime - i) {
          p0.writeUInt64(1, tstartTime);
       }
       tstartTime = this.endTime;
       if (tstartTime - i) {
          p0.writeUInt64(2, tstartTime);
       }
       tstartTime = this.connected;
       if (tstartTime != null) {
          p0.writeBool(3, tstartTime);
       }
       super.writeTo(p0);
       return;
    }
}
