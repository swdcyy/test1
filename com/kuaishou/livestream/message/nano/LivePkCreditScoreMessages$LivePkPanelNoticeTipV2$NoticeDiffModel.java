package com.kuaishou.livestream.message.nano.LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel extends MessageNano	// class@00120c
{
    public UserInfos$PicUrl[] backgroundUrl;
    public String clickActionUrl;
    public static LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel[] _emptyArray;

    public void LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel(){
       super();
       this.clear();
    }
    public static LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel[] emptyArray(){
       if (LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel._emptyArray == null) {
             LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel[] livePkPanelN = new LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel[0];
             LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel._emptyArray = livePkPanelN;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel._emptyArray;
    }
    public static LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel parseFrom(CodedInputByteBufferNano p0){
       return new LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel().mergeFrom(p0);
    }
    public static LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel(), p0);
    }
    public LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel clear(){
       this.backgroundUrl = UserInfos$PicUrl.emptyArray();
       this.clickActionUrl = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel tbackgroundU = this.backgroundUrl;
       if (tbackgroundU != null && tbackgroundU.length > 0) {
          int i1 = 0;
          LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel tbackgroundU1 = this.backgroundUrl;
          while (i1 < tbackgroundU1.length) {
             object oobject = tbackgroundU1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.clickActionUrl).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.clickActionUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel mergeFrom(CodedInputByteBufferNano p0){
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
                this.clickActionUrl = p0.readString();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel tbackgroundU = this.backgroundUrl;
             int i2 = (tbackgroundU == null)? 0: tbackgroundU.length;
             i = i + i2;
             UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
             if (i2) {
                System.arraycopy(tbackgroundU, 0, picUrlArray, 0, i2);
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
             this.backgroundUrl = picUrlArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel tbackgroundU = this.backgroundUrl;
       if (tbackgroundU != null && tbackgroundU.length > 0) {
          int i = 0;
          LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel tbackgroundU1 = this.backgroundUrl;
          while (i < tbackgroundU1.length) {
             object oobject = tbackgroundU1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.clickActionUrl).equals("")) {
          p0.writeString(2, this.clickActionUrl);
       }
       super.writeTo(p0);
       return;
    }
}
