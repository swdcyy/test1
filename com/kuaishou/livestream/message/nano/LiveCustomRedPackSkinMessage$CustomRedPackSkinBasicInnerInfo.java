package com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo extends MessageNano	// class@001177
{
    public UserInfos$PicUrl[] innerBgPict;
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo[] _emptyArray;

    public void LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo(){
       super();
       this.clear();
    }
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo[] emptyArray(){
       if (LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo._emptyArray == null) {
             LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo[] uCustomRedPa = new LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo[0];
             LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo._emptyArray = uCustomRedPa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo._emptyArray;
    }
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo().mergeFrom(p0);
    }
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo(), p0);
    }
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo clear(){
       this.innerBgPict = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo tinnerBgPict = this.innerBgPict;
       if (tinnerBgPict != null && tinnerBgPict.length > 0) {
          int i1 = 0;
          LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo tinnerBgPict1 = this.innerBgPict;
          while (i1 < tinnerBgPict1.length) {
             object oobject = tinnerBgPict1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo tinnerBgPict = this.innerBgPict;
             int i2 = (tinnerBgPict == null)? 0: tinnerBgPict.length;
             i = i + i2;
             UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
             if (i2) {
                System.arraycopy(tinnerBgPict, 0, picUrlArray, 0, i2);
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
             this.innerBgPict = picUrlArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo tinnerBgPict = this.innerBgPict;
       if (tinnerBgPict != null && tinnerBgPict.length > 0) {
          int i = 0;
          LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo tinnerBgPict1 = this.innerBgPict;
          while (i < tinnerBgPict1.length) {
             object oobject = tinnerBgPict1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
