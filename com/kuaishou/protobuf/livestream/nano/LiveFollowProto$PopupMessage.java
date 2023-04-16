package com.kuaishou.protobuf.livestream.nano.LiveFollowProto$PopupMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFollowProto$PopupMessage extends MessageNano	// class@000c8b
{
    public String note;
    public String toast;
    public long userId;
    public static LiveFollowProto$PopupMessage[] _emptyArray;

    public void LiveFollowProto$PopupMessage(){
       super();
       this.clear();
    }
    public static LiveFollowProto$PopupMessage[] emptyArray(){
       if (LiveFollowProto$PopupMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFollowProto$PopupMessage._emptyArray == null) {
             LiveFollowProto$PopupMessage[] popupMessage = new LiveFollowProto$PopupMessage[0];
             LiveFollowProto$PopupMessage._emptyArray = popupMessage;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFollowProto$PopupMessage._emptyArray;
    }
    public static LiveFollowProto$PopupMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveFollowProto$PopupMessage().mergeFrom(p0);
    }
    public static LiveFollowProto$PopupMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFollowProto$PopupMessage(), p0);
    }
    public LiveFollowProto$PopupMessage clear(){
       this.userId = 0;
       this.note = "";
       this.toast = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFollowProto$PopupMessage tuserId = this.userId;
       if (tuserId - null) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tuserId);
       }
       String str = "";
       if (!(this.note).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.note);
       }
       if (!(this.toast).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.toast);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFollowProto$PopupMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.toast = p0.readString();
                }
             }else {
                this.note = p0.readString();
             }
          }else {
             this.userId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFollowProto$PopupMessage tuserId = this.userId;
       if (tuserId - null) {
          p0.writeUInt64(1, tuserId);
       }
       String str = "";
       if (!(this.note).equals(str)) {
          p0.writeString(2, this.note);
       }
       if (!(this.toast).equals(str)) {
          p0.writeString(3, this.toast);
       }
       super.writeTo(p0);
       return;
    }
}
