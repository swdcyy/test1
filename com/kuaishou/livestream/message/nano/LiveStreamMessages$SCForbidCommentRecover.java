package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCForbidCommentRecover;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$SCForbidCommentRecover extends MessageNano	// class@00132f
{
    public int operatorType;
    public long time;
    public UserInfos$UserInfo user;
    public static LiveStreamMessages$SCForbidCommentRecover[] _emptyArray;

    public void LiveStreamMessages$SCForbidCommentRecover(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCForbidCommentRecover[] emptyArray(){
       if (LiveStreamMessages$SCForbidCommentRecover._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCForbidCommentRecover._emptyArray == null) {
             LiveStreamMessages$SCForbidCommentRecover[] sCForbidComm = new LiveStreamMessages$SCForbidCommentRecover[0];
             LiveStreamMessages$SCForbidCommentRecover._emptyArray = sCForbidComm;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCForbidCommentRecover._emptyArray;
    }
    public static LiveStreamMessages$SCForbidCommentRecover parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCForbidCommentRecover().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCForbidCommentRecover parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCForbidCommentRecover(), p0);
    }
    public LiveStreamMessages$SCForbidCommentRecover clear(){
       this.time = 0;
       this.user = null;
       this.operatorType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCForbidCommentRecover ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       ttime = this.user;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, ttime);
       }
       ttime = this.operatorType;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCForbidCommentRecover mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && (i != 2 && i != 3))) {
                      continue ;
                   }else {
                      this.operatorType = i;
                   }
                }
             }else if(this.user == null){
                this.user = new UserInfos$UserInfo();
             }
             p0.readMessage(this.user);
          }else {
             this.time = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCForbidCommentRecover ttime = this.time;
       if (ttime) {
          p0.writeUInt64(1, ttime);
       }
       ttime = this.user;
       if (ttime != null) {
          p0.writeMessage(2, ttime);
       }
       ttime = this.operatorType;
       if (ttime != null) {
          p0.writeInt32(3, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
