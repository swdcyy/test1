package com.kuaishou.livestream.message.nano.LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage extends MessageNano	// class@00129d
{
    public int fontFamily;
    public int fontSize;
    public String text;
    public String textColor;
    public static LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage[] _emptyArray;

    public void LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage(){
       super();
       this.clear();
    }
    public static LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage[] emptyArray(){
       if (LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage._emptyArray == null) {
             LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage[] sCLiveSellin = new LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage[0];
             LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage._emptyArray = sCLiveSellin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage._emptyArray;
    }
    public static LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage().mergeFrom(p0);
    }
    public static LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage(), p0);
    }
    public LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage clear(){
       this.textColor = "";
       this.text = "";
       this.fontSize = 0;
       this.fontFamily = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.textColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.textColor);
       }
       if (!(this.text).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.text);
       }
       LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage tfontSize = this.fontSize;
       if (tfontSize != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tfontSize);
       }
       tfontSize = this.fontFamily;
       if (tfontSize != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tfontSize);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage mergeFrom(CodedInputByteBufferNano p0){
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
                      i = p0.readInt32();
                      if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                         continue ;
                      }else {
                         this.fontFamily = i;
                      }
                   }
                }else {
                   this.fontSize = p0.readUInt32();
                }
             }else {
                this.text = p0.readString();
             }
          }else {
             this.textColor = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.textColor).equals(str)) {
          p0.writeString(1, this.textColor);
       }
       if (!(this.text).equals(str)) {
          p0.writeString(2, this.text);
       }
       LiveSellingChatMessage$SCLiveSellingChatIndicator$SCSellingChatRichTextMessage tfontSize = this.fontSize;
       if (tfontSize != null) {
          p0.writeUInt32(3, tfontSize);
       }
       tfontSize = this.fontFamily;
       if (tfontSize != null) {
          p0.writeInt32(4, tfontSize);
       }
       super.writeTo(p0);
       return;
    }
}
