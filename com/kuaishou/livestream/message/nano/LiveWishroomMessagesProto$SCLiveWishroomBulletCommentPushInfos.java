package com.kuaishou.livestream.message.nano.LiveWishroomMessagesProto$SCLiveWishroomBulletCommentPushInfos;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveWishroomMessagesProto$SCLiveWishroomBulletCommentPushInfos extends MessageNano	// class@0013db
{
    public LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo[] bulletCommentPushInfo;
    public static LiveWishroomMessagesProto$SCLiveWishroomBulletCommentPushInfos[] _emptyArray;

    public void LiveWishroomMessagesProto$SCLiveWishroomBulletCommentPushInfos(){
       super();
       this.clear();
    }
    public static LiveWishroomMessagesProto$SCLiveWishroomBulletCommentPushInfos[] emptyArray(){
       if (LiveWishroomMessagesProto$SCLiveWishroomBulletCommentPushInfos._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveWishroomMessagesProto$SCLiveWishroomBulletCommentPushInfos._emptyArray == null) {
             LiveWishroomMessagesProto$SCLiveWishroomBulletCommentPushInfos[] sCLiveWishro = new LiveWishroomMessagesProto$SCLiveWishroomBulletCommentPushInfos[0];
             LiveWishroomMessagesProto$SCLiveWishroomBulletCommentPushInfos._emptyArray = sCLiveWishro;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveWishroomMessagesProto$SCLiveWishroomBulletCommentPushInfos._emptyArray;
    }
    public static LiveWishroomMessagesProto$SCLiveWishroomBulletCommentPushInfos parseFrom(CodedInputByteBufferNano p0){
       return new LiveWishroomMessagesProto$SCLiveWishroomBulletCommentPushInfos().mergeFrom(p0);
    }
    public static LiveWishroomMessagesProto$SCLiveWishroomBulletCommentPushInfos parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveWishroomMessagesProto$SCLiveWishroomBulletCommentPushInfos(), p0);
    }
    public LiveWishroomMessagesProto$SCLiveWishroomBulletCommentPushInfos clear(){
       this.bulletCommentPushInfo = LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveWishroomMessagesProto$SCLiveWishroomBulletCommentPushInfos tbulletComme = this.bulletCommentPushInfo;
       if (tbulletComme != null && tbulletComme.length > 0) {
          int i1 = 0;
          LiveWishroomMessagesProto$SCLiveWishroomBulletCommentPushInfos tbulletComme1 = this.bulletCommentPushInfo;
          while (i1 < tbulletComme1.length) {
             object oobject = tbulletComme1[i1];
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
    public LiveWishroomMessagesProto$SCLiveWishroomBulletCommentPushInfos mergeFrom(CodedInputByteBufferNano p0){
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
             LiveWishroomMessagesProto$SCLiveWishroomBulletCommentPushInfos tbulletComme = this.bulletCommentPushInfo;
             int i2 = (tbulletComme == null)? 0: tbulletComme.length;
             i = i + i2;
             LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo[] liveWishroom = new LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo[i];
             if (i2) {
                System.arraycopy(tbulletComme, 0, liveWishroom, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                liveWishroom[i2] = new LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo();
                p0.readMessage(liveWishroom[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             liveWishroom[i2] = new LiveWishroomMessagesProto$LiveWishroomBulletCommentPushInfo();
             p0.readMessage(liveWishroom[i2]);
             this.bulletCommentPushInfo = liveWishroom;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveWishroomMessagesProto$SCLiveWishroomBulletCommentPushInfos tbulletComme = this.bulletCommentPushInfo;
       if (tbulletComme != null && tbulletComme.length > 0) {
          int i = 0;
          LiveWishroomMessagesProto$SCLiveWishroomBulletCommentPushInfos tbulletComme1 = this.bulletCommentPushInfo;
          while (i < tbulletComme1.length) {
             object oobject = tbulletComme1[i];
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
