package com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo extends MessageNano	// class@001154
{
    public int loopCount;
    public int translateX;
    public int translateY;
    public UserInfos$PicUrl[] webpUrl;
    public static LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo[] _emptyArray;

    public void LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo(){
       super();
       this.clear();
    }
    public static LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo[] emptyArray(){
       if (LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo._emptyArray == null) {
             LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo[] liveActivity = new LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo[0];
             LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo._emptyArray = liveActivity;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo._emptyArray;
    }
    public static LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo().mergeFrom(p0);
    }
    public static LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo(), p0);
    }
    public LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo clear(){
       this.webpUrl = UserInfos$PicUrl.emptyArray();
       this.translateX = 0;
       this.translateY = 0;
       this.loopCount = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo twebpUrl = this.webpUrl;
       if (twebpUrl != null && twebpUrl.length > 0) {
          int i1 = 0;
          LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo twebpUrl1 = this.webpUrl;
          while (i1 < twebpUrl1.length) {
             object oobject = twebpUrl1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       twebpUrl = this.translateX;
       if (twebpUrl != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, twebpUrl);
       }
       twebpUrl = this.translateY;
       if (twebpUrl != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, twebpUrl);
       }
       twebpUrl = this.loopCount;
       if (twebpUrl != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, twebpUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.loopCount = p0.readUInt32();
                   }
                }else {
                   this.translateY = p0.readInt32();
                }
             }else {
                this.translateX = p0.readInt32();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo twebpUrl = this.webpUrl;
             int i2 = (twebpUrl == null)? 0: twebpUrl.length;
             i = i + i2;
             UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
             if (i2) {
                System.arraycopy(twebpUrl, 0, picUrlArray, 0, i2);
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
             this.webpUrl = picUrlArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo twebpUrl = this.webpUrl;
       if (twebpUrl != null && twebpUrl.length > 0) {
          int i = 0;
          LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo twebpUrl1 = this.webpUrl;
          while (i < twebpUrl1.length) {
             object oobject = twebpUrl1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       twebpUrl = this.translateX;
       if (twebpUrl != null) {
          p0.writeInt32(2, twebpUrl);
       }
       twebpUrl = this.translateY;
       if (twebpUrl != null) {
          p0.writeInt32(3, twebpUrl);
       }
       twebpUrl = this.loopCount;
       if (twebpUrl != null) {
          p0.writeUInt32(4, twebpUrl);
       }
       super.writeTo(p0);
       return;
    }
}
