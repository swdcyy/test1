package com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser extends MessageNano	// class@001114
{
    public String gender;
    public boolean paidServing;
    public long userId;
    public static LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser[] _emptyArray;

    public void LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser(){
       super();
       this.clear();
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser[] emptyArray(){
       if (LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser._emptyArray == null) {
             LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser[] sCLiveBlindD = new LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser[0];
             LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser._emptyArray = sCLiveBlindD;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser._emptyArray;
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser parseFrom(CodedInputByteBufferNano p0){
       return new LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser().mergeFrom(p0);
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser(), p0);
    }
    public LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser clear(){
       this.userId = 0;
       this.paidServing = false;
       this.gender = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser tuserId = this.userId;
       if (tuserId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tuserId);
       }
       tuserId = this.paidServing;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tuserId);
       }
       if (!(this.gender).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.gender);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.gender = p0.readString();
                }
             }else {
                this.paidServing = p0.readBool();
             }
          }else {
             this.userId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart$LiveBlindDateChatServiceUser tuserId = this.userId;
       if (tuserId) {
          p0.writeUInt64(1, tuserId);
       }
       tuserId = this.paidServing;
       if (tuserId != null) {
          p0.writeBool(2, tuserId);
       }
       if (!(this.gender).equals("")) {
          p0.writeString(3, this.gender);
       }
       super.writeTo(p0);
       return;
    }
}
