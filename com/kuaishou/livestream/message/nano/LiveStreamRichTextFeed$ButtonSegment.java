package com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$ButtonSegment;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamRichTextFeed$ButtonSegment extends MessageNano	// class@001392
{
    public String actionLink;
    public int actionType;
    public String text;
    public String textColor;
    public String traceMessage;
    public static LiveStreamRichTextFeed$ButtonSegment[] _emptyArray;

    public void LiveStreamRichTextFeed$ButtonSegment(){
       super();
       this.clear();
    }
    public static LiveStreamRichTextFeed$ButtonSegment[] emptyArray(){
       if (LiveStreamRichTextFeed$ButtonSegment._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamRichTextFeed$ButtonSegment._emptyArray == null) {
             LiveStreamRichTextFeed$ButtonSegment[] uButtonSegme = new LiveStreamRichTextFeed$ButtonSegment[0];
             LiveStreamRichTextFeed$ButtonSegment._emptyArray = uButtonSegme;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamRichTextFeed$ButtonSegment._emptyArray;
    }
    public static LiveStreamRichTextFeed$ButtonSegment parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamRichTextFeed$ButtonSegment().mergeFrom(p0);
    }
    public static LiveStreamRichTextFeed$ButtonSegment parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamRichTextFeed$ButtonSegment(), p0);
    }
    public LiveStreamRichTextFeed$ButtonSegment clear(){
       this.text = "";
       this.textColor = "";
       this.actionType = 0;
       this.actionLink = "";
       this.traceMessage = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.text).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.text);
       }
       if (!(this.textColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.textColor);
       }
       LiveStreamRichTextFeed$ButtonSegment tactionType = this.actionType;
       if (tactionType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tactionType);
       }
       if (!(this.actionLink).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.actionLink);
       }
       if (!(this.traceMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.traceMessage);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamRichTextFeed$ButtonSegment mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.traceMessage = p0.readString();
                      }
                   }else {
                      this.actionLink = p0.readString();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && (i != 2 && i != 3))) {
                      continue ;
                   }else {
                      this.actionType = i;
                   }
                }
             }else {
                this.textColor = p0.readString();
             }
          }else {
             this.text = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.text).equals(str)) {
          p0.writeString(1, this.text);
       }
       if (!(this.textColor).equals(str)) {
          p0.writeString(2, this.textColor);
       }
       LiveStreamRichTextFeed$ButtonSegment tactionType = this.actionType;
       if (tactionType != null) {
          p0.writeInt32(3, tactionType);
       }
       if (!(this.actionLink).equals(str)) {
          p0.writeString(4, this.actionLink);
       }
       if (!(this.traceMessage).equals(str)) {
          p0.writeString(5, this.traceMessage);
       }
       super.writeTo(p0);
       return;
    }
}
