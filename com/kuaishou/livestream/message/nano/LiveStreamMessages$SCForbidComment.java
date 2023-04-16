package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCForbidComment;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$SCForbidComment extends MessageNano	// class@00132e
{
    public long duration;
    public int operatorType;
    public long startTime;
    public long time;
    public UserInfos$UserInfo user;
    public static LiveStreamMessages$SCForbidComment[] _emptyArray;

    public void LiveStreamMessages$SCForbidComment(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCForbidComment[] emptyArray(){
       if (LiveStreamMessages$SCForbidComment._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCForbidComment._emptyArray == null) {
             LiveStreamMessages$SCForbidComment[] sCForbidComm = new LiveStreamMessages$SCForbidComment[0];
             LiveStreamMessages$SCForbidComment._emptyArray = sCForbidComm;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCForbidComment._emptyArray;
    }
    public static LiveStreamMessages$SCForbidComment parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCForbidComment().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCForbidComment parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCForbidComment(), p0);
    }
    public LiveStreamMessages$SCForbidComment clear(){
       this.time = 0;
       this.user = null;
       this.operatorType = 0;
       this.startTime = 0;
       this.duration = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCForbidComment ttime = this.time;
       int i1 = 0;
       if (ttime - i1) {
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
       ttime = this.startTime;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttime);
       }
       ttime = this.duration;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCForbidComment mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.duration = p0.readUInt64();
                      }
                   }else {
                      this.startTime = p0.readUInt64();
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
       LiveStreamMessages$SCForbidComment ttime = this.time;
       int i = 0;
       if (ttime - i) {
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
       ttime = this.startTime;
       if (ttime - i) {
          p0.writeUInt64(4, ttime);
       }
       ttime = this.duration;
       if (ttime - i) {
          p0.writeUInt64(5, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
