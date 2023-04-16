package com.kuaishou.livestream.message.nano.LiveDragonBoatEnterRoom;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveDragonBoatEnterRoom extends MessageNano	// class@001194
{
    public int activityType;
    public LiveAudienceState senderState;
    public int type;
    public UserInfos$UserInfo user;
    public static LiveDragonBoatEnterRoom[] _emptyArray;

    public void LiveDragonBoatEnterRoom(){
       super();
       this.clear();
    }
    public static LiveDragonBoatEnterRoom[] emptyArray(){
       if (LiveDragonBoatEnterRoom._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveDragonBoatEnterRoom._emptyArray == null) {
             LiveDragonBoatEnterRoom[] liveDragonBo = new LiveDragonBoatEnterRoom[0];
             LiveDragonBoatEnterRoom._emptyArray = liveDragonBo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveDragonBoatEnterRoom._emptyArray;
    }
    public static LiveDragonBoatEnterRoom parseFrom(CodedInputByteBufferNano p0){
       return new LiveDragonBoatEnterRoom().mergeFrom(p0);
    }
    public static LiveDragonBoatEnterRoom parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveDragonBoatEnterRoom(), p0);
    }
    public LiveDragonBoatEnterRoom clear(){
       this.user = null;
       this.senderState = null;
       this.type = 0;
       this.activityType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveDragonBoatEnterRoom tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tuser);
       }
       tuser = this.senderState;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tuser);
       }
       tuser = this.type;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tuser);
       }
       tuser = this.activityType;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveDragonBoatEnterRoom mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.activityType = p0.readUInt32();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && i != 2)) {
                      continue ;
                   }else {
                      this.type = i;
                   }
                }
             }else if(this.senderState == null){
                this.senderState = new LiveAudienceState();
             }
             p0.readMessage(this.senderState);
          }else if(this.user == null){
             this.user = new UserInfos$UserInfo();
          }
          p0.readMessage(this.user);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveDragonBoatEnterRoom tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(1, tuser);
       }
       tuser = this.senderState;
       if (tuser != null) {
          p0.writeMessage(2, tuser);
       }
       tuser = this.type;
       if (tuser != null) {
          p0.writeInt32(3, tuser);
       }
       tuser = this.activityType;
       if (tuser != null) {
          p0.writeUInt32(4, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
