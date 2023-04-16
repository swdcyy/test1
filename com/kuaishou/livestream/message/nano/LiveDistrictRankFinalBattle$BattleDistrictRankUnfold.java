package com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$BattleDistrictRankUnfold;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$UnfoldMessage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$ContentWithStyle;
import java.lang.System;

public final class LiveDistrictRankFinalBattle$BattleDistrictRankUnfold extends MessageNano	// class@001182
{
    public UserInfos$PicUrl[] backgroundPicUrl;
    public String countDownColor;
    public LiveDistrictRankFinalBattle$ContentWithStyle countDownText;
    public UserInfos$PicUrl[] foldPicUrl;
    public UserInfos$PicUrl[] iconUrl;
    public LiveDistrictRankFinalBattle$UnfoldMessage[] unfoldMessage;
    public LiveDistrictRankFinalBattle$ContentWithStyle waitEndText;
    public LiveDistrictRankFinalBattle$ContentWithStyle waitRemindText;
    public static LiveDistrictRankFinalBattle$BattleDistrictRankUnfold[] _emptyArray;

    public void LiveDistrictRankFinalBattle$BattleDistrictRankUnfold(){
       super();
       this.clear();
    }
    public static LiveDistrictRankFinalBattle$BattleDistrictRankUnfold[] emptyArray(){
       if (LiveDistrictRankFinalBattle$BattleDistrictRankUnfold._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveDistrictRankFinalBattle$BattleDistrictRankUnfold._emptyArray == null) {
             LiveDistrictRankFinalBattle$BattleDistrictRankUnfold[] uBattleDistr = new LiveDistrictRankFinalBattle$BattleDistrictRankUnfold[0];
             LiveDistrictRankFinalBattle$BattleDistrictRankUnfold._emptyArray = uBattleDistr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveDistrictRankFinalBattle$BattleDistrictRankUnfold._emptyArray;
    }
    public static LiveDistrictRankFinalBattle$BattleDistrictRankUnfold parseFrom(CodedInputByteBufferNano p0){
       return new LiveDistrictRankFinalBattle$BattleDistrictRankUnfold().mergeFrom(p0);
    }
    public static LiveDistrictRankFinalBattle$BattleDistrictRankUnfold parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveDistrictRankFinalBattle$BattleDistrictRankUnfold(), p0);
    }
    public LiveDistrictRankFinalBattle$BattleDistrictRankUnfold clear(){
       this.backgroundPicUrl = UserInfos$PicUrl.emptyArray();
       this.foldPicUrl = UserInfos$PicUrl.emptyArray();
       this.unfoldMessage = LiveDistrictRankFinalBattle$UnfoldMessage.emptyArray();
       this.countDownText = null;
       this.countDownColor = "";
       this.iconUrl = UserInfos$PicUrl.emptyArray();
       this.waitEndText = null;
       this.waitRemindText = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       LiveDistrictRankFinalBattle$BattleDistrictRankUnfold tbackgroundP1;
       object oobject;
       int i = super.computeSerializedSize();
       LiveDistrictRankFinalBattle$BattleDistrictRankUnfold tbackgroundP = this.backgroundPicUrl;
       int i1 = 0;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          i2 = 0;
          tbackgroundP1 = this.backgroundPicUrl;
          while (i2 < tbackgroundP1.length) {
             oobject = tbackgroundP1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tbackgroundP = this.foldPicUrl;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          i2 = 0;
          tbackgroundP1 = this.foldPicUrl;
          while (i2 < tbackgroundP1.length) {
             oobject = tbackgroundP1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tbackgroundP = this.unfoldMessage;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          i2 = 0;
          tbackgroundP1 = this.unfoldMessage;
          while (i2 < tbackgroundP1.length) {
             oobject = tbackgroundP1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tbackgroundP = this.countDownText;
       if (tbackgroundP != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tbackgroundP);
       }
       if (!(this.countDownColor).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.countDownColor);
       }
       tbackgroundP = this.iconUrl;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          tbackgroundP = this.iconUrl;
          while (i1 < tbackgroundP.length) {
             object oobject1 = tbackgroundP[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tbackgroundP = this.waitEndText;
       if (tbackgroundP != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tbackgroundP);
       }
       tbackgroundP = this.waitRemindText;
       if (tbackgroundP != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, tbackgroundP);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveDistrictRankFinalBattle$BattleDistrictRankUnfold mergeFrom(CodedInputByteBufferNano p0){
       LiveDistrictRankFinalBattle$BattleDistrictRankUnfold ticonUrl;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             i1 = 18;
             if (i != i1) {
                i1 = 26;
                if (i != i1) {
                   if (i != 34) {
                      if (i != 42) {
                         i1 = 50;
                         if (i != i1) {
                            if (i != 58) {
                               if (i != 66) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else if(this.waitRemindText == null){
                                  this.waitRemindText = new LiveDistrictRankFinalBattle$ContentWithStyle();
                               }
                               p0.readMessage(this.waitRemindText);
                            }else if(this.waitEndText == null){
                               this.waitEndText = new LiveDistrictRankFinalBattle$ContentWithStyle();
                            }
                            p0.readMessage(this.waitEndText);
                         }else {
                            i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                            ticonUrl = this.iconUrl;
                            i2 = (ticonUrl == null)? 0: ticonUrl.length;
                            i = i + i2;
                            picUrlArray = new UserInfos$PicUrl[i];
                            if (i2) {
                               System.arraycopy(ticonUrl, 0, picUrlArray, 0, i2);
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
                            this.iconUrl = picUrlArray;
                         }
                      }else {
                         this.countDownColor = p0.readString();
                      }
                   }else if(this.countDownText == null){
                      this.countDownText = new LiveDistrictRankFinalBattle$ContentWithStyle();
                   }
                   p0.readMessage(this.countDownText);
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   ticonUrl = this.unfoldMessage;
                   i2 = (ticonUrl == null)? 0: ticonUrl.length;
                   i = i + i2;
                   LiveDistrictRankFinalBattle$UnfoldMessage[] unfoldMessag = new LiveDistrictRankFinalBattle$UnfoldMessage[i];
                   if (i2) {
                      System.arraycopy(ticonUrl, 0, unfoldMessag, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      unfoldMessag[i2] = new LiveDistrictRankFinalBattle$UnfoldMessage();
                      p0.readMessage(unfoldMessag[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   unfoldMessag[i2] = new LiveDistrictRankFinalBattle$UnfoldMessage();
                   p0.readMessage(unfoldMessag[i2]);
                   this.unfoldMessage = unfoldMessag;
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                ticonUrl = this.foldPicUrl;
                i2 = (ticonUrl == null)? 0: ticonUrl.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(ticonUrl, 0, picUrlArray, 0, i2);
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
                this.foldPicUrl = picUrlArray;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             ticonUrl = this.backgroundPicUrl;
             i2 = (ticonUrl == null)? 0: ticonUrl.length;
             i = i + i2;
             picUrlArray = new UserInfos$PicUrl[i];
             if (i2) {
                System.arraycopy(ticonUrl, 0, picUrlArray, 0, i2);
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
       int i1;
       LiveDistrictRankFinalBattle$BattleDistrictRankUnfold tbackgroundP1;
       object oobject;
       LiveDistrictRankFinalBattle$BattleDistrictRankUnfold tbackgroundP = this.backgroundPicUrl;
       int i = 0;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          i1 = 0;
          tbackgroundP1 = this.backgroundPicUrl;
          while (i1 < tbackgroundP1.length) {
             oobject = tbackgroundP1[i1];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tbackgroundP = this.foldPicUrl;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          i1 = 0;
          tbackgroundP1 = this.foldPicUrl;
          while (i1 < tbackgroundP1.length) {
             oobject = tbackgroundP1[i1];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tbackgroundP = this.unfoldMessage;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          i1 = 0;
          tbackgroundP1 = this.unfoldMessage;
          while (i1 < tbackgroundP1.length) {
             oobject = tbackgroundP1[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tbackgroundP = this.countDownText;
       if (tbackgroundP != null) {
          p0.writeMessage(4, tbackgroundP);
       }
       if (!(this.countDownColor).equals("")) {
          p0.writeString(5, this.countDownColor);
       }
       tbackgroundP = this.iconUrl;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          tbackgroundP = this.iconUrl;
          while (i < tbackgroundP.length) {
             object oobject1 = tbackgroundP[i];
             if (oobject1 != null) {
                p0.writeMessage(6, oobject1);
             }
             i = i + 1;
          }
       }
       tbackgroundP = this.waitEndText;
       if (tbackgroundP != null) {
          p0.writeMessage(7, tbackgroundP);
       }
       tbackgroundP = this.waitRemindText;
       if (tbackgroundP != null) {
          p0.writeMessage(8, tbackgroundP);
       }
       super.writeTo(p0);
       return;
    }
}
