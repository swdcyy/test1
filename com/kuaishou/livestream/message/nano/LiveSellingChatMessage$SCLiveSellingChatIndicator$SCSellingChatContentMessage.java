package com.kuaishou.livestream.message.nano.LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage extends MessageNano	// class@00129c
{
    public LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage[] spanText;
    public static LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage[] _emptyArray;

    public void LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage(){
       super();
       this.clear();
    }
    public static LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage[] emptyArray(){
       if (LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage._emptyArray == null) {
             LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage[] sCLiveSellin = new LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage[0];
             LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage._emptyArray = sCLiveSellin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage._emptyArray;
    }
    public static LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage().mergeFrom(p0);
    }
    public static LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage(), p0);
    }
    public LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage clear(){
       this.spanText = LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage tspanText = this.spanText;
       if (tspanText != null && tspanText.length > 0) {
          int i1 = 0;
          LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage tspanText1 = this.spanText;
          while (i1 < tspanText1.length) {
             object oobject = tspanText1[i1];
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
    public LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage mergeFrom(CodedInputByteBufferNano p0){
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
             LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage tspanText = this.spanText;
             int i2 = (tspanText == null)? 0: tspanText.length;
             i = i + i2;
             LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage[] sCLiveSellin = new LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage[i];
             if (i2) {
                System.arraycopy(tspanText, 0, sCLiveSellin, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                sCLiveSellin[i2] = new LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage();
                p0.readMessage(sCLiveSellin[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             sCLiveSellin[i2] = new LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage();
             p0.readMessage(sCLiveSellin[i2]);
             this.spanText = sCLiveSellin;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage tspanText = this.spanText;
       if (tspanText != null && tspanText.length > 0) {
          int i = 0;
          LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage tspanText1 = this.spanText;
          while (i < tspanText1.length) {
             object oobject = tspanText1[i];
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
