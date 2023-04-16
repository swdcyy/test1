package com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$FoldMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$ContentWithStyle;

public final class LiveDistrictRankFinalBattle$FoldMessage extends MessageNano	// class@001184
{
    public UserInfos$PicUrl[] arrowUrl;
    public LiveDistrictRankFinalBattle$ContentWithStyle contentWithStyle;
    public UserInfos$PicUrl[] dynamicArrowUrl;
    public String extraInfo;
    public UserInfos$PicUrl[] iconUrl;
    public static LiveDistrictRankFinalBattle$FoldMessage[] _emptyArray;

    public void LiveDistrictRankFinalBattle$FoldMessage(){
       super();
       this.clear();
    }
    public static LiveDistrictRankFinalBattle$FoldMessage[] emptyArray(){
       if (LiveDistrictRankFinalBattle$FoldMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveDistrictRankFinalBattle$FoldMessage._emptyArray == null) {
             LiveDistrictRankFinalBattle$FoldMessage[] uFoldMessage = new LiveDistrictRankFinalBattle$FoldMessage[0];
             LiveDistrictRankFinalBattle$FoldMessage._emptyArray = uFoldMessage;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveDistrictRankFinalBattle$FoldMessage._emptyArray;
    }
    public static LiveDistrictRankFinalBattle$FoldMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveDistrictRankFinalBattle$FoldMessage().mergeFrom(p0);
    }
    public static LiveDistrictRankFinalBattle$FoldMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveDistrictRankFinalBattle$FoldMessage(), p0);
    }
    public LiveDistrictRankFinalBattle$FoldMessage clear(){
       this.iconUrl = UserInfos$PicUrl.emptyArray();
       this.contentWithStyle = null;
       this.arrowUrl = UserInfos$PicUrl.emptyArray();
       this.extraInfo = "";
       this.dynamicArrowUrl = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       LiveDistrictRankFinalBattle$FoldMessage ticonUrl1;
       object oobject;
       int i = super.computeSerializedSize();
       LiveDistrictRankFinalBattle$FoldMessage ticonUrl = this.iconUrl;
       int i1 = 0;
       if (ticonUrl != null && ticonUrl.length > 0) {
          i2 = 0;
          ticonUrl1 = this.iconUrl;
          while (i2 < ticonUrl1.length) {
             oobject = ticonUrl1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i2 = i2 + 1;
          }
       }
       ticonUrl = this.contentWithStyle;
       if (ticonUrl != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, ticonUrl);
       }
       ticonUrl = this.arrowUrl;
       if (ticonUrl != null && ticonUrl.length > 0) {
          i2 = 0;
          ticonUrl1 = this.arrowUrl;
          while (i2 < ticonUrl1.length) {
             oobject = ticonUrl1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.extraInfo).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.extraInfo);
       }
       ticonUrl = this.dynamicArrowUrl;
       if (ticonUrl != null && ticonUrl.length > 0) {
          ticonUrl = this.dynamicArrowUrl;
          while (i1 < ticonUrl.length) {
             object oobject1 = ticonUrl[i1];
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
    public LiveDistrictRankFinalBattle$FoldMessage mergeFrom(CodedInputByteBufferNano p0){
       LiveDistrictRankFinalBattle$FoldMessage tdynamicArro;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 18) {
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
                         tdynamicArro = this.dynamicArrowUrl;
                         i2 = (tdynamicArro == null)? 0: tdynamicArro.length;
                         i = i + i2;
                         picUrlArray = new UserInfos$PicUrl[i];
                         if (i2) {
                            System.arraycopy(tdynamicArro, 0, picUrlArray, 0, i2);
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
                         this.dynamicArrowUrl = picUrlArray;
                      }
                   }else {
                      this.extraInfo = p0.readString();
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   tdynamicArro = this.arrowUrl;
                   i2 = (tdynamicArro == null)? 0: tdynamicArro.length;
                   i = i + i2;
                   picUrlArray = new UserInfos$PicUrl[i];
                   if (i2) {
                      System.arraycopy(tdynamicArro, 0, picUrlArray, 0, i2);
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
                   this.arrowUrl = picUrlArray;
                }
             }else if(this.contentWithStyle == null){
                this.contentWithStyle = new LiveDistrictRankFinalBattle$ContentWithStyle();
             }
             p0.readMessage(this.contentWithStyle);
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             tdynamicArro = this.iconUrl;
             i2 = (tdynamicArro == null)? 0: tdynamicArro.length;
             i = i + i2;
             picUrlArray = new UserInfos$PicUrl[i];
             if (i2) {
                System.arraycopy(tdynamicArro, 0, picUrlArray, 0, i2);
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
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i1;
       LiveDistrictRankFinalBattle$FoldMessage ticonUrl1;
       object oobject;
       LiveDistrictRankFinalBattle$FoldMessage ticonUrl = this.iconUrl;
       int i = 0;
       if (ticonUrl != null && ticonUrl.length > 0) {
          i1 = 0;
          ticonUrl1 = this.iconUrl;
          while (i1 < ticonUrl1.length) {
             oobject = ticonUrl1[i1];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ticonUrl = this.contentWithStyle;
       if (ticonUrl != null) {
          p0.writeMessage(2, ticonUrl);
       }
       ticonUrl = this.arrowUrl;
       if (ticonUrl != null && ticonUrl.length > 0) {
          i1 = 0;
          ticonUrl1 = this.arrowUrl;
          while (i1 < ticonUrl1.length) {
             oobject = ticonUrl1[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.extraInfo).equals("")) {
          p0.writeString(4, this.extraInfo);
       }
       ticonUrl = this.dynamicArrowUrl;
       if (ticonUrl != null && ticonUrl.length > 0) {
          ticonUrl = this.dynamicArrowUrl;
          while (i < ticonUrl.length) {
             object oobject1 = ticonUrl[i];
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
