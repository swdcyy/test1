package com.kuaishou.livestream.message.nano.LiveSellingChatMessage$SCLiveSellingChatIndicator;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage;
import com.kuaishou.livestream.message.nano.LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveSellingChatMessage$SCLiveSellingChatIndicator extends MessageNano	// class@00129e
{
    public String bizId;
    public int bizType;
    public LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage[] content;
    public LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage[] title;
    public static LiveSellingChatMessage$SCLiveSellingChatIndicator[] _emptyArray;

    public void LiveSellingChatMessage$SCLiveSellingChatIndicator(){
       super();
       this.clear();
    }
    public static LiveSellingChatMessage$SCLiveSellingChatIndicator[] emptyArray(){
       if (LiveSellingChatMessage$SCLiveSellingChatIndicator._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveSellingChatMessage$SCLiveSellingChatIndicator._emptyArray == null) {
             LiveSellingChatMessage$SCLiveSellingChatIndicator[] sCLiveSellin = new LiveSellingChatMessage$SCLiveSellingChatIndicator[0];
             LiveSellingChatMessage$SCLiveSellingChatIndicator._emptyArray = sCLiveSellin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveSellingChatMessage$SCLiveSellingChatIndicator._emptyArray;
    }
    public static LiveSellingChatMessage$SCLiveSellingChatIndicator parseFrom(CodedInputByteBufferNano p0){
       return new LiveSellingChatMessage$SCLiveSellingChatIndicator().mergeFrom(p0);
    }
    public static LiveSellingChatMessage$SCLiveSellingChatIndicator parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveSellingChatMessage$SCLiveSellingChatIndicator(), p0);
    }
    public LiveSellingChatMessage$SCLiveSellingChatIndicator clear(){
       this.bizType = 0;
       this.bizId = "";
       this.title = LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage.emptyArray();
       this.content = LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveSellingChatMessage$SCLiveSellingChatIndicator tbizType = this.bizType;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tbizType);
       }
       if (!(this.bizId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.bizId);
       }
       tbizType = this.title;
       int i1 = 0;
       if (tbizType != null && tbizType.length > 0) {
          int i2 = 0;
          LiveSellingChatMessage$SCLiveSellingChatIndicator ttitle = this.title;
          while (i2 < ttitle.length) {
             object oobject = ttitle[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tbizType = this.content;
       if (tbizType != null && tbizType.length > 0) {
          tbizType = this.content;
          while (i1 < tbizType.length) {
             object oobject1 = tbizType[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveSellingChatMessage$SCLiveSellingChatIndicator mergeFrom(CodedInputByteBufferNano p0){
       LiveSellingChatMessage$SCLiveSellingChatIndicator tcontent;
       int i2;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                int i1 = 26;
                if (i != i1) {
                   i1 = 34;
                   if (i != i1) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      tcontent = this.content;
                      i2 = (tcontent == null)? 0: tcontent.length;
                      i = i + i2;
                      LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage[] sCLiveSellin = new LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage[i];
                      if (i2) {
                         System.arraycopy(tcontent, 0, sCLiveSellin, 0, i2);
                      }
                      i1 = i - 1;
                      while (i2 < i1) {
                         sCLiveSellin[i2] = new LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage();
                         p0.readMessage(sCLiveSellin[i2]);
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      sCLiveSellin[i2] = new LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatContentMessage();
                      p0.readMessage(sCLiveSellin[i2]);
                      this.content = sCLiveSellin;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   tcontent = this.title;
                   i2 = (tcontent == null)? 0: tcontent.length;
                   i = i + i2;
                   LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage[] sCLiveSellin1 = new LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage[i];
                   if (i2) {
                      System.arraycopy(tcontent, 0, sCLiveSellin1, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      sCLiveSellin1[i2] = new LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage();
                      p0.readMessage(sCLiveSellin1[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   sCLiveSellin1[i2] = new LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage();
                   p0.readMessage(sCLiveSellin1[i2]);
                   this.title = sCLiveSellin1;
                }
             }else {
                this.bizId = p0.readString();
             }
          }else {
             this.bizType = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveSellingChatMessage$SCLiveSellingChatIndicator tbizType = this.bizType;
       if (tbizType != null) {
          p0.writeUInt32(1, tbizType);
       }
       if (!(this.bizId).equals("")) {
          p0.writeString(2, this.bizId);
       }
       tbizType = this.title;
       int i = 0;
       if (tbizType != null && tbizType.length > 0) {
          int i1 = 0;
          LiveSellingChatMessage$SCLiveSellingChatIndicator ttitle = this.title;
          while (i1 < ttitle.length) {
             object oobject = ttitle[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tbizType = this.content;
       if (tbizType != null && tbizType.length > 0) {
          tbizType = this.content;
          while (i < tbizType.length) {
             object oobject1 = tbizType[i];
             if (oobject1 != null) {
                p0.writeMessage(4, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
