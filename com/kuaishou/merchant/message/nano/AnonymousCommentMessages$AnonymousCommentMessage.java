package com.kuaishou.merchant.message.nano.AnonymousCommentMessages$AnonymousCommentMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class AnonymousCommentMessages$AnonymousCommentMessage extends MessageNano	// class@001c35
{
    public boolean anonymous;
    public int showNameType;
    public static AnonymousCommentMessages$AnonymousCommentMessage[] _emptyArray;

    public void AnonymousCommentMessages$AnonymousCommentMessage(){
       super();
       this.clear();
    }
    public static AnonymousCommentMessages$AnonymousCommentMessage[] emptyArray(){
       if (AnonymousCommentMessages$AnonymousCommentMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (AnonymousCommentMessages$AnonymousCommentMessage._emptyArray == null) {
             AnonymousCommentMessages$AnonymousCommentMessage[] uAnonymousCo = new AnonymousCommentMessages$AnonymousCommentMessage[0];
             AnonymousCommentMessages$AnonymousCommentMessage._emptyArray = uAnonymousCo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return AnonymousCommentMessages$AnonymousCommentMessage._emptyArray;
    }
    public static AnonymousCommentMessages$AnonymousCommentMessage parseFrom(CodedInputByteBufferNano p0){
       return new AnonymousCommentMessages$AnonymousCommentMessage().mergeFrom(p0);
    }
    public static AnonymousCommentMessages$AnonymousCommentMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new AnonymousCommentMessages$AnonymousCommentMessage(), p0);
    }
    public AnonymousCommentMessages$AnonymousCommentMessage clear(){
       this.anonymous = false;
       this.showNameType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       AnonymousCommentMessages$AnonymousCommentMessage tanonymous = this.anonymous;
       if (tanonymous != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tanonymous);
       }
       tanonymous = this.showNameType;
       if (tanonymous != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tanonymous);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public AnonymousCommentMessages$AnonymousCommentMessage mergeFrom(CodedInputByteBufferNano p0){
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
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.showNameType = i;
                }
             }
          }else {
             this.anonymous = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       AnonymousCommentMessages$AnonymousCommentMessage tanonymous = this.anonymous;
       if (tanonymous != null) {
          p0.writeBool(1, tanonymous);
       }
       tanonymous = this.showNameType;
       if (tanonymous != null) {
          p0.writeInt32(2, tanonymous);
       }
       super.writeTo(p0);
       return;
    }
}
