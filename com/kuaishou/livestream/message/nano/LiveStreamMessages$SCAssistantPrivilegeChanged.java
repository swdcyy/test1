package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCAssistantPrivilegeChanged;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$SCAssistantPrivilegeChanged extends MessageNano	// class@001322
{
    public UserInfos$UserInfo user;
    public static LiveStreamMessages$SCAssistantPrivilegeChanged[] _emptyArray;

    public void LiveStreamMessages$SCAssistantPrivilegeChanged(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCAssistantPrivilegeChanged[] emptyArray(){
       if (LiveStreamMessages$SCAssistantPrivilegeChanged._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCAssistantPrivilegeChanged._emptyArray == null) {
             LiveStreamMessages$SCAssistantPrivilegeChanged[] sCAssistantP = new LiveStreamMessages$SCAssistantPrivilegeChanged[0];
             LiveStreamMessages$SCAssistantPrivilegeChanged._emptyArray = sCAssistantP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCAssistantPrivilegeChanged._emptyArray;
    }
    public static LiveStreamMessages$SCAssistantPrivilegeChanged parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCAssistantPrivilegeChanged().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCAssistantPrivilegeChanged parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCAssistantPrivilegeChanged(), p0);
    }
    public LiveStreamMessages$SCAssistantPrivilegeChanged clear(){
       this.user = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCAssistantPrivilegeChanged tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCAssistantPrivilegeChanged mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else if(this.user == null){
             this.user = new UserInfos$UserInfo();
          }
          p0.readMessage(this.user);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCAssistantPrivilegeChanged tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(1, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
