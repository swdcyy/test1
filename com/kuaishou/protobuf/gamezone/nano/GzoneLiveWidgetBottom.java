package com.kuaishou.protobuf.gamezone.nano.GzoneLiveWidgetBottom;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class GzoneLiveWidgetBottom extends MessageNano	// class@000bc7
{
    public UserInfos$PicUrl[] picUrl;
    public String text;
    public static GzoneLiveWidgetBottom[] _emptyArray;

    public void GzoneLiveWidgetBottom(){
       super();
       this.clear();
    }
    public static GzoneLiveWidgetBottom[] emptyArray(){
       if (GzoneLiveWidgetBottom._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (GzoneLiveWidgetBottom._emptyArray == null) {
             GzoneLiveWidgetBottom[] gzoneLiveWid = new GzoneLiveWidgetBottom[0];
             GzoneLiveWidgetBottom._emptyArray = gzoneLiveWid;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return GzoneLiveWidgetBottom._emptyArray;
    }
    public static GzoneLiveWidgetBottom parseFrom(CodedInputByteBufferNano p0){
       return new GzoneLiveWidgetBottom().mergeFrom(p0);
    }
    public static GzoneLiveWidgetBottom parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new GzoneLiveWidgetBottom(), p0);
    }
    public GzoneLiveWidgetBottom clear(){
       this.text = "";
       this.picUrl = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.text).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.text);
       }
       GzoneLiveWidgetBottom tpicUrl = this.picUrl;
       if (tpicUrl != null && tpicUrl.length > 0) {
          int i1 = 0;
          GzoneLiveWidgetBottom tpicUrl1 = this.picUrl;
          while (i1 < tpicUrl1.length) {
             object oobject = tpicUrl1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public GzoneLiveWidgetBottom mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                GzoneLiveWidgetBottom tpicUrl = this.picUrl;
                int i2 = (tpicUrl == null)? 0: tpicUrl.length;
                i = i + i2;
                UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tpicUrl, 0, picUrlArray, 0, i2);
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
                this.picUrl = picUrlArray;
             }
          }else {
             this.text = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.text).equals("")) {
          p0.writeString(1, this.text);
       }
       GzoneLiveWidgetBottom tpicUrl = this.picUrl;
       if (tpicUrl != null && tpicUrl.length > 0) {
          int i = 0;
          GzoneLiveWidgetBottom tpicUrl1 = this.picUrl;
          while (i < tpicUrl1.length) {
             object oobject = tpicUrl1[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
