package com.kuaishou.client.log.content.packages.nano.ClientContent$LiveRobotRequestPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$LiveRobotRequestPackage extends MessageNano	// class@00127b
{
    public long receiveResponseTimestamp;
    public long sendRequestTimestamp;
    public static ClientContent$LiveRobotRequestPackage[] _emptyArray;

    public void ClientContent$LiveRobotRequestPackage(){
       super();
       this.clear();
    }
    public static ClientContent$LiveRobotRequestPackage[] emptyArray(){
       if (ClientContent$LiveRobotRequestPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$LiveRobotRequestPackage._emptyArray == null) {
             ClientContent$LiveRobotRequestPackage[] liveRobotReq = new ClientContent$LiveRobotRequestPackage[0];
             ClientContent$LiveRobotRequestPackage._emptyArray = liveRobotReq;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$LiveRobotRequestPackage._emptyArray;
    }
    public static ClientContent$LiveRobotRequestPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$LiveRobotRequestPackage().mergeFrom(p0);
    }
    public static ClientContent$LiveRobotRequestPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$LiveRobotRequestPackage(), p0);
    }
    public ClientContent$LiveRobotRequestPackage clear(){
       this.sendRequestTimestamp = 0;
       this.receiveResponseTimestamp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$LiveRobotRequestPackage tsendRequest = this.sendRequestTimestamp;
       int i1 = 0;
       if (tsendRequest - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tsendRequest);
       }
       tsendRequest = this.receiveResponseTimestamp;
       if (tsendRequest - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tsendRequest);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$LiveRobotRequestPackage mergeFrom(CodedInputByteBufferNano p0){
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
                this.receiveResponseTimestamp = p0.readUInt64();
             }
          }else {
             this.sendRequestTimestamp = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$LiveRobotRequestPackage tsendRequest = this.sendRequestTimestamp;
       int i = 0;
       if (tsendRequest - i) {
          p0.writeUInt64(1, tsendRequest);
       }
       tsendRequest = this.receiveResponseTimestamp;
       if (tsendRequest - i) {
          p0.writeUInt64(2, tsendRequest);
       }
       super.writeTo(p0);
       return;
    }
}
