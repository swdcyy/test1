package com.kuaishou.livestream.message.nano.ClickCommentNoticeEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Float;
import com.google.protobuf.nano.WireFormatNano;

public final class ClickCommentNoticeEvent extends MessageNano	// class@00109e
{
    public boolean fullScreen;
    public float heightPercent;
    public String url;
    public String webUrl;
    public static ClickCommentNoticeEvent[] _emptyArray;

    public void ClickCommentNoticeEvent(){
       super();
       this.clear();
    }
    public static ClickCommentNoticeEvent[] emptyArray(){
       if (ClickCommentNoticeEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClickCommentNoticeEvent._emptyArray == null) {
             ClickCommentNoticeEvent[] uClickCommen = new ClickCommentNoticeEvent[0];
             ClickCommentNoticeEvent._emptyArray = uClickCommen;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClickCommentNoticeEvent._emptyArray;
    }
    public static ClickCommentNoticeEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClickCommentNoticeEvent().mergeFrom(p0);
    }
    public static ClickCommentNoticeEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClickCommentNoticeEvent(), p0);
    }
    public ClickCommentNoticeEvent clear(){
       this.url = "";
       this.fullScreen = false;
       this.heightPercent = 0;
       this.webUrl = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.url).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.url);
       }
       ClickCommentNoticeEvent tfullScreen = this.fullScreen;
       if (tfullScreen != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tfullScreen);
       }
       if (Float.floatToIntBits(this.heightPercent) != Float.floatToIntBits(0)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(3, this.heightPercent);
       }
       if (!(this.webUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.webUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClickCommentNoticeEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 29) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.webUrl = p0.readString();
                   }
                }else {
                   this.heightPercent = p0.readFloat();
                }
             }else {
                this.fullScreen = p0.readBool();
             }
          }else {
             this.url = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.url).equals(str)) {
          p0.writeString(1, this.url);
       }
       ClickCommentNoticeEvent tfullScreen = this.fullScreen;
       if (tfullScreen != null) {
          p0.writeBool(2, tfullScreen);
       }
       if (Float.floatToIntBits(this.heightPercent) != Float.floatToIntBits(0)) {
          p0.writeFloat(3, this.heightPercent);
       }
       if (!(this.webUrl).equals(str)) {
          p0.writeString(4, this.webUrl);
       }
       super.writeTo(p0);
       return;
    }
}
