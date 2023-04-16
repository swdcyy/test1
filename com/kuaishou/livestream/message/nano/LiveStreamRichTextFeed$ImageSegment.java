package com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$ImageSegment;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveStreamRichTextFeed$ImageSegment extends MessageNano	// class@001394
{
    public String alternativeColor;
    public String alternativeText;
    public UserInfos$PicUrl[] imageUrls;
    public static LiveStreamRichTextFeed$ImageSegment[] _emptyArray;

    public void LiveStreamRichTextFeed$ImageSegment(){
       super();
       this.clear();
    }
    public static LiveStreamRichTextFeed$ImageSegment[] emptyArray(){
       if (LiveStreamRichTextFeed$ImageSegment._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamRichTextFeed$ImageSegment._emptyArray == null) {
             LiveStreamRichTextFeed$ImageSegment[] imageSegment = new LiveStreamRichTextFeed$ImageSegment[0];
             LiveStreamRichTextFeed$ImageSegment._emptyArray = imageSegment;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamRichTextFeed$ImageSegment._emptyArray;
    }
    public static LiveStreamRichTextFeed$ImageSegment parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamRichTextFeed$ImageSegment().mergeFrom(p0);
    }
    public static LiveStreamRichTextFeed$ImageSegment parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamRichTextFeed$ImageSegment(), p0);
    }
    public LiveStreamRichTextFeed$ImageSegment clear(){
       this.imageUrls = UserInfos$PicUrl.emptyArray();
       this.alternativeText = "";
       this.alternativeColor = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamRichTextFeed$ImageSegment timageUrls = this.imageUrls;
       if (timageUrls != null && timageUrls.length > 0) {
          int i1 = 0;
          LiveStreamRichTextFeed$ImageSegment timageUrls1 = this.imageUrls;
          while (i1 < timageUrls1.length) {
             object oobject = timageUrls1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       String str = "";
       if (!(this.alternativeText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.alternativeText);
       }
       if (!(this.alternativeColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.alternativeColor);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamRichTextFeed$ImageSegment mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.alternativeColor = p0.readString();
                }
             }else {
                this.alternativeText = p0.readString();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveStreamRichTextFeed$ImageSegment timageUrls = this.imageUrls;
             int i2 = (timageUrls == null)? 0: timageUrls.length;
             i = i + i2;
             UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
             if (i2) {
                System.arraycopy(timageUrls, 0, picUrlArray, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                picUrlArray[i2] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             picUrlArray[i2] = new UserInfos$PicUrl();
             p0.readMessage(picUrlArray[i2]);
             this.imageUrls = picUrlArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamRichTextFeed$ImageSegment timageUrls = this.imageUrls;
       if (timageUrls != null && timageUrls.length > 0) {
          int i = 0;
          LiveStreamRichTextFeed$ImageSegment timageUrls1 = this.imageUrls;
          while (i < timageUrls1.length) {
             object oobject = timageUrls1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       String str = "";
       if (!(this.alternativeText).equals(str)) {
          p0.writeString(2, this.alternativeText);
       }
       if (!(this.alternativeColor).equals(str)) {
          p0.writeString(3, this.alternativeColor);
       }
       super.writeTo(p0);
       return;
    }
}
