package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCAssistantStatus;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$SCAssistantStatus extends MessageNano	// class@001323
{
    public boolean disableShowToast;
    public boolean isAdmin;
    public int liveAssistantType;
    public UserInfos$UserInfo user;
    public static LiveStreamMessages$SCAssistantStatus[] _emptyArray;

    public void LiveStreamMessages$SCAssistantStatus(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCAssistantStatus[] emptyArray(){
       if (LiveStreamMessages$SCAssistantStatus._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCAssistantStatus._emptyArray == null) {
             LiveStreamMessages$SCAssistantStatus[] sCAssistantS = new LiveStreamMessages$SCAssistantStatus[0];
             LiveStreamMessages$SCAssistantStatus._emptyArray = sCAssistantS;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCAssistantStatus._emptyArray;
    }
    public static LiveStreamMessages$SCAssistantStatus parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCAssistantStatus().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCAssistantStatus parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCAssistantStatus(), p0);
    }
    public LiveStreamMessages$SCAssistantStatus clear(){
       this.user = null;
       this.isAdmin = false;
       this.liveAssistantType = 0;
       this.disableShowToast = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCAssistantStatus tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tuser);
       }
       tuser = this.isAdmin;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tuser);
       }
       tuser = this.liveAssistantType;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tuser);
       }
       tuser = this.disableShowToast;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCAssistantStatus mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.disableShowToast = p0.readBool();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && i != 2)) {
                      continue ;
                   }else {
                      this.liveAssistantType = i;
                   }
                }
             }else {
                this.isAdmin = p0.readBool();
             }
          }else if(this.user == null){
             this.user = new UserInfos$UserInfo();
          }
          p0.readMessage(this.user);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCAssistantStatus tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(1, tuser);
       }
       tuser = this.isAdmin;
       if (tuser != null) {
          p0.writeBool(2, tuser);
       }
       tuser = this.liveAssistantType;
       if (tuser != null) {
          p0.writeInt32(3, tuser);
       }
       tuser = this.disableShowToast;
       if (tuser != null) {
          p0.writeBool(4, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
