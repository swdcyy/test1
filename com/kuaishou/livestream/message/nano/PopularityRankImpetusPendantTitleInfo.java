package com.kuaishou.livestream.message.nano.PopularityRankImpetusPendantTitleInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;
import com.kuaishou.livestream.message.nano.ImpetusPendantContentWithStyle;

public final class PopularityRankImpetusPendantTitleInfo extends MessageNano	// class@0013e3
{
    public UserInfos$PicUrl[] iconPicUrl;
    public boolean tailWaitCountTime;
    public ImpetusPendantContentWithStyle titleText;
    public static PopularityRankImpetusPendantTitleInfo[] _emptyArray;

    public void PopularityRankImpetusPendantTitleInfo(){
       super();
       this.clear();
    }
    public static PopularityRankImpetusPendantTitleInfo[] emptyArray(){
       if (PopularityRankImpetusPendantTitleInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (PopularityRankImpetusPendantTitleInfo._emptyArray == null) {
             PopularityRankImpetusPendantTitleInfo[] popularityRa = new PopularityRankImpetusPendantTitleInfo[0];
             PopularityRankImpetusPendantTitleInfo._emptyArray = popularityRa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return PopularityRankImpetusPendantTitleInfo._emptyArray;
    }
    public static PopularityRankImpetusPendantTitleInfo parseFrom(CodedInputByteBufferNano p0){
       return new PopularityRankImpetusPendantTitleInfo().mergeFrom(p0);
    }
    public static PopularityRankImpetusPendantTitleInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new PopularityRankImpetusPendantTitleInfo(), p0);
    }
    public PopularityRankImpetusPendantTitleInfo clear(){
       this.titleText = null;
       this.tailWaitCountTime = false;
       this.iconPicUrl = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       PopularityRankImpetusPendantTitleInfo ttitleText = this.titleText;
       if (ttitleText != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, ttitleText);
       }
       ttitleText = this.tailWaitCountTime;
       if (ttitleText != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, ttitleText);
       }
       ttitleText = this.iconPicUrl;
       if (ttitleText != null && ttitleText.length > 0) {
          int i1 = 0;
          PopularityRankImpetusPendantTitleInfo ticonPicUrl = this.iconPicUrl;
          while (i1 < ticonPicUrl.length) {
             object oobject = ticonPicUrl[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public PopularityRankImpetusPendantTitleInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                int i1 = 26;
                if (i != i1) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   PopularityRankImpetusPendantTitleInfo ticonPicUrl = this.iconPicUrl;
                   int i2 = (ticonPicUrl == null)? 0: ticonPicUrl.length;
                   i = i + i2;
                   UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                   if (i2) {
                      System.arraycopy(ticonPicUrl, 0, picUrlArray, 0, i2);
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
                   this.iconPicUrl = picUrlArray;
                }
             }else {
                this.tailWaitCountTime = p0.readBool();
             }
          }else if(this.titleText == null){
             this.titleText = new ImpetusPendantContentWithStyle();
          }
          p0.readMessage(this.titleText);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       PopularityRankImpetusPendantTitleInfo ttitleText = this.titleText;
       if (ttitleText != null) {
          p0.writeMessage(1, ttitleText);
       }
       ttitleText = this.tailWaitCountTime;
       if (ttitleText != null) {
          p0.writeBool(2, ttitleText);
       }
       ttitleText = this.iconPicUrl;
       if (ttitleText != null && ttitleText.length > 0) {
          int i = 0;
          PopularityRankImpetusPendantTitleInfo ticonPicUrl = this.iconPicUrl;
          while (i < ticonPicUrl.length) {
             object oobject = ticonPicUrl[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
