package com.kuaishou.livestream.message.nano.LiveSticker;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.Double;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveSticker extends MessageNano	// class@0012b4
{
    public double bottomMarginScale;
    public String content;
    public String fontColor;
    public int fontSize;
    public double height;
    public long id;
    public double leftMarginScale;
    public int maxRow;
    public double rightMarginScale;
    public int stickerType;
    public double textViewLeftMargin;
    public double textViewTopMargin;
    public double topMarginScale;
    public UserInfos$PicUrl[] url;
    public double width;
    public static LiveSticker[] _emptyArray;

    public void LiveSticker(){
       super();
       this.clear();
    }
    public static LiveSticker[] emptyArray(){
       if (LiveSticker._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveSticker._emptyArray == null) {
             LiveSticker[] liveStickerA = new LiveSticker[0];
             LiveSticker._emptyArray = liveStickerA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveSticker._emptyArray;
    }
    public static LiveSticker parseFrom(CodedInputByteBufferNano p0){
       return new LiveSticker().mergeFrom(p0);
    }
    public static LiveSticker parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveSticker(), p0);
    }
    public LiveSticker clear(){
       this.id = 0;
       this.stickerType = 0;
       this.url = UserInfos$PicUrl.emptyArray();
       this.content = "";
       this.height = 0;
       this.width = 0;
       this.topMarginScale = 0;
       this.leftMarginScale = 0;
       this.textViewLeftMargin = 0;
       this.textViewTopMargin = 0;
       this.fontSize = 0;
       this.fontColor = "";
       this.maxRow = 0;
       this.rightMarginScale = 0;
       this.bottomMarginScale = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveSticker tid = this.id;
       if (tid) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tid);
       }
       tid = this.stickerType;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tid);
       }
       tid = this.url;
       if (tid != null && tid.length > 0) {
          int i1 = 0;
          LiveSticker turl = this.url;
          while (i1 < turl.length) {
             object oobject = turl[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       String str = "";
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.content);
       }
       double d = 0;
       if (Double.doubleToLongBits(this.height) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(5, this.height);
       }
       if (Double.doubleToLongBits(this.width) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(6, this.width);
       }
       if (Double.doubleToLongBits(this.topMarginScale) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(7, this.topMarginScale);
       }
       if (Double.doubleToLongBits(this.leftMarginScale) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(8, this.leftMarginScale);
       }
       if (Double.doubleToLongBits(this.textViewLeftMargin) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(9, this.textViewLeftMargin);
       }
       if (Double.doubleToLongBits(this.textViewTopMargin) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(10, this.textViewTopMargin);
       }
       tid = this.fontSize;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(11, tid);
       }
       if (!(this.fontColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.fontColor);
       }
       tid = this.maxRow;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(13, tid);
       }
       if (Double.doubleToLongBits(this.rightMarginScale) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(14, this.rightMarginScale);
       }
       if (Double.doubleToLongBits(this.bottomMarginScale) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(15, this.bottomMarginScale);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveSticker mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                this.id = p0.readUInt64();
                break;
              case 16:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.stickerType = i;
                }
                break;
              case 26:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 26);
                LiveSticker turl = this.url;
                int i1 = (turl == null)? 0: turl.length;
                i = i + i1;
                UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(turl, 0, picUrlArray, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   picUrlArray[i1] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                picUrlArray[i1] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i1]);
                this.url = picUrlArray;
                break;
              case '"':
                this.content = p0.readString();
                break;
              case ')':
                this.height = p0.readDouble();
                break;
              case '1':
                this.width = p0.readDouble();
                break;
              case '9':
                this.topMarginScale = p0.readDouble();
                break;
              case 'A':
                this.leftMarginScale = p0.readDouble();
                break;
              case 'I':
                this.textViewLeftMargin = p0.readDouble();
                break;
              case 'Q':
                this.textViewTopMargin = p0.readDouble();
                break;
              case 'X':
                this.fontSize = p0.readUInt32();
                break;
              case 'b':
                this.fontColor = p0.readString();
                break;
              case 'h':
                this.maxRow = p0.readUInt32();
                break;
              case 'q':
                this.rightMarginScale = p0.readDouble();
                break;
              case 'y':
                this.bottomMarginScale = p0.readDouble();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveSticker tid = this.id;
       if (tid) {
          p0.writeUInt64(1, tid);
       }
       tid = this.stickerType;
       if (tid != null) {
          p0.writeInt32(2, tid);
       }
       tid = this.url;
       if (tid != null && tid.length > 0) {
          int i = 0;
          LiveSticker turl = this.url;
          while (i < turl.length) {
             object oobject = turl[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       String str = "";
       if (!(this.content).equals(str)) {
          p0.writeString(4, this.content);
       }
       double d = 0;
       if (Double.doubleToLongBits(this.height) - Double.doubleToLongBits(d)) {
          p0.writeDouble(5, this.height);
       }
       if (Double.doubleToLongBits(this.width) - Double.doubleToLongBits(d)) {
          p0.writeDouble(6, this.width);
       }
       if (Double.doubleToLongBits(this.topMarginScale) - Double.doubleToLongBits(d)) {
          p0.writeDouble(7, this.topMarginScale);
       }
       if (Double.doubleToLongBits(this.leftMarginScale) - Double.doubleToLongBits(d)) {
          p0.writeDouble(8, this.leftMarginScale);
       }
       if (Double.doubleToLongBits(this.textViewLeftMargin) - Double.doubleToLongBits(d)) {
          p0.writeDouble(9, this.textViewLeftMargin);
       }
       if (Double.doubleToLongBits(this.textViewTopMargin) - Double.doubleToLongBits(d)) {
          p0.writeDouble(10, this.textViewTopMargin);
       }
       tid = this.fontSize;
       if (tid != null) {
          p0.writeUInt32(11, tid);
       }
       if (!(this.fontColor).equals(str)) {
          p0.writeString(12, this.fontColor);
       }
       tid = this.maxRow;
       if (tid != null) {
          p0.writeUInt32(13, tid);
       }
       if (Double.doubleToLongBits(this.rightMarginScale) - Double.doubleToLongBits(d)) {
          p0.writeDouble(14, this.rightMarginScale);
       }
       if (Double.doubleToLongBits(this.bottomMarginScale) - Double.doubleToLongBits(d)) {
          p0.writeDouble(15, this.bottomMarginScale);
       }
       super.writeTo(p0);
       return;
    }
}
