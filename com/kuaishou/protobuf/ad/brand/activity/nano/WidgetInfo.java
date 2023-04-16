package com.kuaishou.protobuf.ad.brand.activity.nano.WidgetInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class WidgetInfo extends MessageNano	// class@000b98
{
    public UserInfos$PicUrl[] imgUrl;
    public String jumpUrl;
    public String title;
    public static WidgetInfo[] _emptyArray;

    public void WidgetInfo(){
       super();
       this.clear();
    }
    public static WidgetInfo[] emptyArray(){
       if (WidgetInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (WidgetInfo._emptyArray == null) {
             WidgetInfo[] widgetInfoAr = new WidgetInfo[0];
             WidgetInfo._emptyArray = widgetInfoAr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return WidgetInfo._emptyArray;
    }
    public static WidgetInfo parseFrom(CodedInputByteBufferNano p0){
       return new WidgetInfo().mergeFrom(p0);
    }
    public static WidgetInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new WidgetInfo(), p0);
    }
    public WidgetInfo clear(){
       this.title = "";
       this.imgUrl = UserInfos$PicUrl.emptyArray();
       this.jumpUrl = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.title);
       }
       WidgetInfo timgUrl = this.imgUrl;
       if (timgUrl != null && timgUrl.length > 0) {
          int i1 = 0;
          WidgetInfo timgUrl1 = this.imgUrl;
          while (i1 < timgUrl1.length) {
             object oobject = timgUrl1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.jumpUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.jumpUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public WidgetInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.jumpUrl = p0.readString();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                WidgetInfo timgUrl = this.imgUrl;
                int i2 = (timgUrl == null)? 0: timgUrl.length;
                i = i + i2;
                UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(timgUrl, 0, picUrlArray, 0, i2);
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
                this.imgUrl = picUrlArray;
             }
          }else {
             this.title = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.title).equals(str)) {
          p0.writeString(1, this.title);
       }
       WidgetInfo timgUrl = this.imgUrl;
       if (timgUrl != null && timgUrl.length > 0) {
          int i = 0;
          WidgetInfo timgUrl1 = this.imgUrl;
          while (i < timgUrl1.length) {
             object oobject = timgUrl1[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.jumpUrl).equals(str)) {
          p0.writeString(3, this.jumpUrl);
       }
       super.writeTo(p0);
       return;
    }
}
