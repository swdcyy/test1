package com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$PlainSegment;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamRichTextFeed$PlainSegment extends MessageNano	// class@001395
{
    public String color;
    public String text;
    public static LiveStreamRichTextFeed$PlainSegment[] _emptyArray;

    public void LiveStreamRichTextFeed$PlainSegment(){
       super();
       this.clear();
    }
    public static LiveStreamRichTextFeed$PlainSegment[] emptyArray(){
       if (LiveStreamRichTextFeed$PlainSegment._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamRichTextFeed$PlainSegment._emptyArray == null) {
             LiveStreamRichTextFeed$PlainSegment[] plainSegment = new LiveStreamRichTextFeed$PlainSegment[0];
             LiveStreamRichTextFeed$PlainSegment._emptyArray = plainSegment;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamRichTextFeed$PlainSegment._emptyArray;
    }
    public static LiveStreamRichTextFeed$PlainSegment parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamRichTextFeed$PlainSegment().mergeFrom(p0);
    }
    public static LiveStreamRichTextFeed$PlainSegment parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamRichTextFeed$PlainSegment(), p0);
    }
    public LiveStreamRichTextFeed$PlainSegment clear(){
       this.text = "";
       this.color = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.text).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.text);
       }
       if (!(this.color).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.color);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamRichTextFeed$PlainSegment mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.color = p0.readString();
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
       if (!(this.color).equals(str)) {
          p0.writeString(2, this.color);
       }
       super.writeTo(p0);
       return;
    }
}
