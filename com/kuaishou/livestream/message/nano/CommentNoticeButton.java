package com.kuaishou.livestream.message.nano.CommentNoticeButton;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Float;
import com.google.protobuf.nano.WireFormatNano;

public final class CommentNoticeButton extends MessageNano	// class@0010a1
{
    public float heightPercent;
    public String text;
    public String url;
    public String webUrl;
    public static CommentNoticeButton[] _emptyArray;

    public void CommentNoticeButton(){
       super();
       this.clear();
    }
    public static CommentNoticeButton[] emptyArray(){
       if (CommentNoticeButton._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (CommentNoticeButton._emptyArray == null) {
             CommentNoticeButton[] uCommentNoti = new CommentNoticeButton[0];
             CommentNoticeButton._emptyArray = uCommentNoti;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return CommentNoticeButton._emptyArray;
    }
    public static CommentNoticeButton parseFrom(CodedInputByteBufferNano p0){
       return new CommentNoticeButton().mergeFrom(p0);
    }
    public static CommentNoticeButton parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new CommentNoticeButton(), p0);
    }
    public CommentNoticeButton clear(){
       this.text = "";
       this.url = "";
       this.webUrl = "";
       this.heightPercent = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.text).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.text);
       }
       if (!(this.url).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.url);
       }
       if (!(this.webUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.webUrl);
       }
       if (Float.floatToIntBits(this.heightPercent) != Float.floatToIntBits(0)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(4, this.heightPercent);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public CommentNoticeButton mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 37) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.heightPercent = p0.readFloat();
                   }
                }else {
                   this.webUrl = p0.readString();
                }
             }else {
                this.url = p0.readString();
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
       if (!(this.url).equals(str)) {
          p0.writeString(2, this.url);
       }
       if (!(this.webUrl).equals(str)) {
          p0.writeString(3, this.webUrl);
       }
       if (Float.floatToIntBits(this.heightPercent) != Float.floatToIntBits(0)) {
          p0.writeFloat(4, this.heightPercent);
       }
       super.writeTo(p0);
       return;
    }
}
