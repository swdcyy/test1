package com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$BattleDistrictRankFold;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$FoldMessage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$ContentWithStyle;

public final class LiveDistrictRankFinalBattle$BattleDistrictRankFold extends MessageNano	// class@001181
{
    public UserInfos$PicUrl[] backgroundPicUrl;
    public LiveDistrictRankFinalBattle$FoldMessage[] foldMessage;
    public UserInfos$PicUrl[] unfoldPicUrl;
    public LiveDistrictRankFinalBattle$ContentWithStyle waitEndText;
    public UserInfos$PicUrl[] waitIconUrl;
    public static LiveDistrictRankFinalBattle$BattleDistrictRankFold[] _emptyArray;

    public void LiveDistrictRankFinalBattle$BattleDistrictRankFold(){
       super();
       this.clear();
    }
    public static LiveDistrictRankFinalBattle$BattleDistrictRankFold[] emptyArray(){
       if (LiveDistrictRankFinalBattle$BattleDistrictRankFold._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveDistrictRankFinalBattle$BattleDistrictRankFold._emptyArray == null) {
             LiveDistrictRankFinalBattle$BattleDistrictRankFold[] uBattleDistr = new LiveDistrictRankFinalBattle$BattleDistrictRankFold[0];
             LiveDistrictRankFinalBattle$BattleDistrictRankFold._emptyArray = uBattleDistr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveDistrictRankFinalBattle$BattleDistrictRankFold._emptyArray;
    }
    public static LiveDistrictRankFinalBattle$BattleDistrictRankFold parseFrom(CodedInputByteBufferNano p0){
       return new LiveDistrictRankFinalBattle$BattleDistrictRankFold().mergeFrom(p0);
    }
    public static LiveDistrictRankFinalBattle$BattleDistrictRankFold parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveDistrictRankFinalBattle$BattleDistrictRankFold(), p0);
    }
    public LiveDistrictRankFinalBattle$BattleDistrictRankFold clear(){
       this.backgroundPicUrl = UserInfos$PicUrl.emptyArray();
       this.unfoldPicUrl = UserInfos$PicUrl.emptyArray();
       this.foldMessage = LiveDistrictRankFinalBattle$FoldMessage.emptyArray();
       this.waitEndText = null;
       this.waitIconUrl = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       LiveDistrictRankFinalBattle$BattleDistrictRankFold tbackgroundP1;
       object oobject;
       int i = super.computeSerializedSize();
       LiveDistrictRankFinalBattle$BattleDistrictRankFold tbackgroundP = this.backgroundPicUrl;
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
       tbackgroundP = this.unfoldPicUrl;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          i2 = 0;
          tbackgroundP1 = this.unfoldPicUrl;
          while (i2 < tbackgroundP1.length) {
             oobject = tbackgroundP1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tbackgroundP = this.foldMessage;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          i2 = 0;
          tbackgroundP1 = this.foldMessage;
          while (i2 < tbackgroundP1.length) {
             oobject = tbackgroundP1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tbackgroundP = this.waitEndText;
       if (tbackgroundP != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tbackgroundP);
       }
       tbackgroundP = this.waitIconUrl;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          tbackgroundP = this.waitIconUrl;
          while (i1 < tbackgroundP.length) {
             object oobject1 = tbackgroundP[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveDistrictRankFinalBattle$BattleDistrictRankFold mergeFrom(CodedInputByteBufferNano p0){
       LiveDistrictRankFinalBattle$BattleDistrictRankFold twaitIconUrl;
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
                      i1 = 42;
                      if (i != i1) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                         twaitIconUrl = this.waitIconUrl;
                         i2 = (twaitIconUrl == null)? 0: twaitIconUrl.length;
                         i = i + i2;
                         picUrlArray = new UserInfos$PicUrl[i];
                         if (i2) {
                            System.arraycopy(twaitIconUrl, 0, picUrlArray, 0, i2);
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
                         this.waitIconUrl = picUrlArray;
                      }
                   }else if(this.waitEndText == null){
                      this.waitEndText = new LiveDistrictRankFinalBattle$ContentWithStyle();
                   }
                   p0.readMessage(this.waitEndText);
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   twaitIconUrl = this.foldMessage;
                   i2 = (twaitIconUrl == null)? 0: twaitIconUrl.length;
                   i = i + i2;
                   LiveDistrictRankFinalBattle$FoldMessage[] uFoldMessage = new LiveDistrictRankFinalBattle$FoldMessage[i];
                   if (i2) {
                      System.arraycopy(twaitIconUrl, 0, uFoldMessage, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      uFoldMessage[i2] = new LiveDistrictRankFinalBattle$FoldMessage();
                      p0.readMessage(uFoldMessage[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   uFoldMessage[i2] = new LiveDistrictRankFinalBattle$FoldMessage();
                   p0.readMessage(uFoldMessage[i2]);
                   this.foldMessage = uFoldMessage;
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                twaitIconUrl = this.unfoldPicUrl;
                i2 = (twaitIconUrl == null)? 0: twaitIconUrl.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(twaitIconUrl, 0, picUrlArray, 0, i2);
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
                this.unfoldPicUrl = picUrlArray;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             twaitIconUrl = this.backgroundPicUrl;
             i2 = (twaitIconUrl == null)? 0: twaitIconUrl.length;
             i = i + i2;
             picUrlArray = new UserInfos$PicUrl[i];
             if (i2) {
                System.arraycopy(twaitIconUrl, 0, picUrlArray, 0, i2);
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
       LiveDistrictRankFinalBattle$BattleDistrictRankFold tbackgroundP1;
       object oobject;
       LiveDistrictRankFinalBattle$BattleDistrictRankFold tbackgroundP = this.backgroundPicUrl;
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
       tbackgroundP = this.unfoldPicUrl;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          i1 = 0;
          tbackgroundP1 = this.unfoldPicUrl;
          while (i1 < tbackgroundP1.length) {
             oobject = tbackgroundP1[i1];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tbackgroundP = this.foldMessage;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          i1 = 0;
          tbackgroundP1 = this.foldMessage;
          while (i1 < tbackgroundP1.length) {
             oobject = tbackgroundP1[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tbackgroundP = this.waitEndText;
       if (tbackgroundP != null) {
          p0.writeMessage(4, tbackgroundP);
       }
       tbackgroundP = this.waitIconUrl;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          tbackgroundP = this.waitIconUrl;
          while (i < tbackgroundP.length) {
             object oobject1 = tbackgroundP[i];
             if (oobject1 != null) {
                p0.writeMessage(5, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
