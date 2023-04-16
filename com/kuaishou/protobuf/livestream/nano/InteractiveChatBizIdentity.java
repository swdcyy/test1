package com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class InteractiveChatBizIdentity extends MessageNano	// class@000c0f
{
    public String bizId;
    public int bizType;
    public String chatId;
    public static InteractiveChatBizIdentity[] _emptyArray;

    public void InteractiveChatBizIdentity(){
       super();
       this.clear();
    }
    public static InteractiveChatBizIdentity[] emptyArray(){
       if (InteractiveChatBizIdentity._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (InteractiveChatBizIdentity._emptyArray == null) {
             InteractiveChatBizIdentity[] interactiveC = new InteractiveChatBizIdentity[0];
             InteractiveChatBizIdentity._emptyArray = interactiveC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return InteractiveChatBizIdentity._emptyArray;
    }
    public static InteractiveChatBizIdentity parseFrom(CodedInputByteBufferNano p0){
       return new InteractiveChatBizIdentity().mergeFrom(p0);
    }
    public static InteractiveChatBizIdentity parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new InteractiveChatBizIdentity(), p0);
    }
    public InteractiveChatBizIdentity clear(){
       this.bizType = 0;
       this.chatId = "";
       this.bizId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       InteractiveChatBizIdentity tbizType = this.bizType;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tbizType);
       }
       String str = "";
       if (!(this.chatId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.chatId);
       }
       if (!(this.bizId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.bizId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public InteractiveChatBizIdentity mergeFrom(CodedInputByteBufferNano p0){
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
                   this.bizId = p0.readString();
                }
             }else {
                this.chatId = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && (i != 3 && (i != 4 && i != 5))))) {
                continue ;
             }else {
                this.bizType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       InteractiveChatBizIdentity tbizType = this.bizType;
       if (tbizType != null) {
          p0.writeInt32(1, tbizType);
       }
       String str = "";
       if (!(this.chatId).equals(str)) {
          p0.writeString(2, this.chatId);
       }
       if (!(this.bizId).equals(str)) {
          p0.writeString(3, this.bizId);
       }
       super.writeTo(p0);
       return;
    }
}
