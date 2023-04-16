package com.kuaishou.livestream.message.nano.PopularityRankImpetusPendantUnfold;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.kuaishou.livestream.message.nano.ImpetusPendantUnfoldMessage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.PopularityRankImpetusPendantTitleInfo;
import com.kuaishou.livestream.message.nano.ImpetusPendantContentWithStyle;
import java.lang.Object;
import java.lang.System;

public final class PopularityRankImpetusPendantUnfold extends MessageNano	// class@0013e4
{
    public UserInfos$PicUrl[] backgroundPicUrl;
    public ImpetusPendantContentWithStyle countDownText;
    public PopularityRankImpetusPendantTitleInfo titleInfo;
    public ImpetusPendantUnfoldMessage[] unfoldMessage;
    public static PopularityRankImpetusPendantUnfold[] _emptyArray;

    public void PopularityRankImpetusPendantUnfold(){
       super();
       this.clear();
    }
    public static PopularityRankImpetusPendantUnfold[] emptyArray(){
       if (PopularityRankImpetusPendantUnfold._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (PopularityRankImpetusPendantUnfold._emptyArray == null) {
             PopularityRankImpetusPendantUnfold[] popularityRa = new PopularityRankImpetusPendantUnfold[0];
             PopularityRankImpetusPendantUnfold._emptyArray = popularityRa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return PopularityRankImpetusPendantUnfold._emptyArray;
    }
    public static PopularityRankImpetusPendantUnfold parseFrom(CodedInputByteBufferNano p0){
       return new PopularityRankImpetusPendantUnfold().mergeFrom(p0);
    }
    public static PopularityRankImpetusPendantUnfold parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new PopularityRankImpetusPendantUnfold(), p0);
    }
    public PopularityRankImpetusPendantUnfold clear(){
       this.backgroundPicUrl = UserInfos$PicUrl.emptyArray();
       this.unfoldMessage = ImpetusPendantUnfoldMessage.emptyArray();
       this.countDownText = null;
       this.titleInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       PopularityRankImpetusPendantUnfold tbackgroundP = this.backgroundPicUrl;
       int i1 = 0;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          int i2 = 0;
          PopularityRankImpetusPendantUnfold tbackgroundP1 = this.backgroundPicUrl;
          while (i2 < tbackgroundP1.length) {
             object oobject = tbackgroundP1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tbackgroundP = this.unfoldMessage;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          tbackgroundP = this.unfoldMessage;
          while (i1 < tbackgroundP.length) {
             object oobject1 = tbackgroundP[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tbackgroundP = this.countDownText;
       if (tbackgroundP != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tbackgroundP);
       }
       tbackgroundP = this.titleInfo;
       if (tbackgroundP != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tbackgroundP);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public PopularityRankImpetusPendantUnfold mergeFrom(CodedInputByteBufferNano p0){
       PopularityRankImpetusPendantUnfold tunfoldMessa;
       int i2;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             i1 = 18;
             if (i != i1) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else if(this.titleInfo == null){
                      this.titleInfo = new PopularityRankImpetusPendantTitleInfo();
                   }
                   p0.readMessage(this.titleInfo);
                }else if(this.countDownText == null){
                   this.countDownText = new ImpetusPendantContentWithStyle();
                }
                p0.readMessage(this.countDownText);
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                tunfoldMessa = this.unfoldMessage;
                i2 = (tunfoldMessa == null)? 0: tunfoldMessa.length;
                i = i + i2;
                ImpetusPendantUnfoldMessage[] impetusPenda = new ImpetusPendantUnfoldMessage[i];
                if (i2) {
                   System.arraycopy(tunfoldMessa, 0, impetusPenda, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   impetusPenda[i2] = new ImpetusPendantUnfoldMessage();
                   p0.readMessage(impetusPenda[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                impetusPenda[i2] = new ImpetusPendantUnfoldMessage();
                p0.readMessage(impetusPenda[i2]);
                this.unfoldMessage = impetusPenda;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             tunfoldMessa = this.backgroundPicUrl;
             i2 = (tunfoldMessa == null)? 0: tunfoldMessa.length;
             i = i + i2;
             UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
             if (i2) {
                System.arraycopy(tunfoldMessa, 0, picUrlArray, 0, i2);
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
             this.backgroundPicUrl = picUrlArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       PopularityRankImpetusPendantUnfold tbackgroundP = this.backgroundPicUrl;
       int i = 0;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          int i1 = 0;
          PopularityRankImpetusPendantUnfold tbackgroundP1 = this.backgroundPicUrl;
          while (i1 < tbackgroundP1.length) {
             object oobject = tbackgroundP1[i1];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tbackgroundP = this.unfoldMessage;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          tbackgroundP = this.unfoldMessage;
          while (i < tbackgroundP.length) {
             object oobject1 = tbackgroundP[i];
             if (oobject1 != null) {
                p0.writeMessage(2, oobject1);
             }
             i = i + 1;
          }
       }
       tbackgroundP = this.countDownText;
       if (tbackgroundP != null) {
          p0.writeMessage(3, tbackgroundP);
       }
       tbackgroundP = this.titleInfo;
       if (tbackgroundP != null) {
          p0.writeMessage(4, tbackgroundP);
       }
       super.writeTo(p0);
       return;
    }
}
