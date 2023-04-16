package com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo extends MessageNano	// class@001178
{
    public UserInfos$PicUrl[] buttonBgPict;
    public String textColor;
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo[] _emptyArray;

    public void LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo(){
       super();
       this.clear();
    }
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo[] emptyArray(){
       if (LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo._emptyArray == null) {
             LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo[] uCustomRedPa = new LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo[0];
             LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo._emptyArray = uCustomRedPa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo._emptyArray;
    }
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo().mergeFrom(p0);
    }
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo(), p0);
    }
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo clear(){
       this.buttonBgPict = UserInfos$PicUrl.emptyArray();
       this.textColor = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo tbuttonBgPic = this.buttonBgPict;
       if (tbuttonBgPic != null && tbuttonBgPic.length > 0) {
          int i1 = 0;
          LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo tbuttonBgPic1 = this.buttonBgPict;
          while (i1 < tbuttonBgPic1.length) {
             object oobject = tbuttonBgPic1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.textColor).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.textColor);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.textColor = p0.readString();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo tbuttonBgPic = this.buttonBgPict;
             int i2 = (tbuttonBgPic == null)? 0: tbuttonBgPic.length;
             i = i + i2;
             UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
             if (i2) {
                System.arraycopy(tbuttonBgPic, 0, picUrlArray, 0, i2);
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
             this.buttonBgPict = picUrlArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo tbuttonBgPic = this.buttonBgPict;
       if (tbuttonBgPic != null && tbuttonBgPic.length > 0) {
          int i = 0;
          LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo tbuttonBgPic1 = this.buttonBgPict;
          while (i < tbuttonBgPic1.length) {
             object oobject = tbuttonBgPic1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.textColor).equals("")) {
          p0.writeString(2, this.textColor);
       }
       super.writeTo(p0);
       return;
    }
}
