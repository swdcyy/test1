package com.kuaishou.livestream.message.nano.SCCommentZoneRichText;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichTextMessage$CommentRichTextMessage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class SCCommentZoneRichText extends MessageNano	// class@0013f1
{
    public LiveCommentRichTextMessage$CommentRichTextMessage[] message;
    public static SCCommentZoneRichText[] _emptyArray;

    public void SCCommentZoneRichText(){
       super();
       this.clear();
    }
    public static SCCommentZoneRichText[] emptyArray(){
       if (SCCommentZoneRichText._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCCommentZoneRichText._emptyArray == null) {
             SCCommentZoneRichText[] sCCommentZon = new SCCommentZoneRichText[0];
             SCCommentZoneRichText._emptyArray = sCCommentZon;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCCommentZoneRichText._emptyArray;
    }
    public static SCCommentZoneRichText parseFrom(CodedInputByteBufferNano p0){
       return new SCCommentZoneRichText().mergeFrom(p0);
    }
    public static SCCommentZoneRichText parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCCommentZoneRichText(), p0);
    }
    public SCCommentZoneRichText clear(){
       this.message = LiveCommentRichTextMessage$CommentRichTextMessage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCCommentZoneRichText tmessage = this.message;
       if (tmessage != null && tmessage.length > 0) {
          int i1 = 0;
          SCCommentZoneRichText tmessage1 = this.message;
          while (i1 < tmessage1.length) {
             object oobject = tmessage1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCCommentZoneRichText mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             SCCommentZoneRichText tmessage = this.message;
             int i2 = (tmessage == null)? 0: tmessage.length;
             i = i + i2;
             LiveCommentRichTextMessage$CommentRichTextMessage[] uCommentRich = new LiveCommentRichTextMessage$CommentRichTextMessage[i];
             if (i2) {
                System.arraycopy(tmessage, 0, uCommentRich, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uCommentRich[i2] = new LiveCommentRichTextMessage$CommentRichTextMessage();
                p0.readMessage(uCommentRich[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uCommentRich[i2] = new LiveCommentRichTextMessage$CommentRichTextMessage();
             p0.readMessage(uCommentRich[i2]);
             this.message = uCommentRich;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCCommentZoneRichText tmessage = this.message;
       if (tmessage != null && tmessage.length > 0) {
          int i = 0;
          SCCommentZoneRichText tmessage1 = this.message;
          while (i < tmessage1.length) {
             object oobject = tmessage1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
