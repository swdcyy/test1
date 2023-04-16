package com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$UnfoldSubMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$ContentWithStyle;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveDistrictRankFinalBattle$UnfoldSubMessage extends MessageNano	// class@00118c
{
    public UserInfos$PicUrl[] arrowUrl;
    public LiveDistrictRankFinalBattle$ContentWithStyle[] contentWithStyle;
    public UserInfos$PicUrl[] dynamicArrowUrl;
    public static LiveDistrictRankFinalBattle$UnfoldSubMessage[] _emptyArray;

    public void LiveDistrictRankFinalBattle$UnfoldSubMessage(){
       super();
       this.clear();
    }
    public static LiveDistrictRankFinalBattle$UnfoldSubMessage[] emptyArray(){
       if (LiveDistrictRankFinalBattle$UnfoldSubMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveDistrictRankFinalBattle$UnfoldSubMessage._emptyArray == null) {
             LiveDistrictRankFinalBattle$UnfoldSubMessage[] unfoldSubMes = new LiveDistrictRankFinalBattle$UnfoldSubMessage[0];
             LiveDistrictRankFinalBattle$UnfoldSubMessage._emptyArray = unfoldSubMes;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveDistrictRankFinalBattle$UnfoldSubMessage._emptyArray;
    }
    public static LiveDistrictRankFinalBattle$UnfoldSubMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveDistrictRankFinalBattle$UnfoldSubMessage().mergeFrom(p0);
    }
    public static LiveDistrictRankFinalBattle$UnfoldSubMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveDistrictRankFinalBattle$UnfoldSubMessage(), p0);
    }
    public LiveDistrictRankFinalBattle$UnfoldSubMessage clear(){
       this.contentWithStyle = LiveDistrictRankFinalBattle$ContentWithStyle.emptyArray();
       this.arrowUrl = UserInfos$PicUrl.emptyArray();
       this.dynamicArrowUrl = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       LiveDistrictRankFinalBattle$UnfoldSubMessage tcontentWith1;
       object oobject;
       int i = super.computeSerializedSize();
       LiveDistrictRankFinalBattle$UnfoldSubMessage tcontentWith = this.contentWithStyle;
       int i1 = 0;
       if (tcontentWith != null && tcontentWith.length > 0) {
          i2 = 0;
          tcontentWith1 = this.contentWithStyle;
          while (i2 < tcontentWith1.length) {
             oobject = tcontentWith1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tcontentWith = this.arrowUrl;
       if (tcontentWith != null && tcontentWith.length > 0) {
          i2 = 0;
          tcontentWith1 = this.arrowUrl;
          while (i2 < tcontentWith1.length) {
             oobject = tcontentWith1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tcontentWith = this.dynamicArrowUrl;
       if (tcontentWith != null && tcontentWith.length > 0) {
          tcontentWith = this.dynamicArrowUrl;
          while (i1 < tcontentWith.length) {
             object oobject1 = tcontentWith[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveDistrictRankFinalBattle$UnfoldSubMessage mergeFrom(CodedInputByteBufferNano p0){
       LiveDistrictRankFinalBattle$UnfoldSubMessage tdynamicArro;
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
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             tdynamicArro = this.contentWithStyle;
             i2 = (tdynamicArro == null)? 0: tdynamicArro.length;
             i = i + i2;
             LiveDistrictRankFinalBattle$ContentWithStyle[] uContentWith = new LiveDistrictRankFinalBattle$ContentWithStyle[i];
             if (i2) {
                System.arraycopy(tdynamicArro, 0, uContentWith, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uContentWith[i2] = new LiveDistrictRankFinalBattle$ContentWithStyle();
                p0.readMessage(uContentWith[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uContentWith[i2] = new LiveDistrictRankFinalBattle$ContentWithStyle();
             p0.readMessage(uContentWith[i2]);
             this.contentWithStyle = uContentWith;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i1;
       LiveDistrictRankFinalBattle$UnfoldSubMessage tcontentWith1;
       object oobject;
       LiveDistrictRankFinalBattle$UnfoldSubMessage tcontentWith = this.contentWithStyle;
       int i = 0;
       if (tcontentWith != null && tcontentWith.length > 0) {
          i1 = 0;
          tcontentWith1 = this.contentWithStyle;
          while (i1 < tcontentWith1.length) {
             oobject = tcontentWith1[i1];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tcontentWith = this.arrowUrl;
       if (tcontentWith != null && tcontentWith.length > 0) {
          i1 = 0;
          tcontentWith1 = this.arrowUrl;
          while (i1 < tcontentWith1.length) {
             oobject = tcontentWith1[i1];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tcontentWith = this.dynamicArrowUrl;
       if (tcontentWith != null && tcontentWith.length > 0) {
          tcontentWith = this.dynamicArrowUrl;
          while (i < tcontentWith.length) {
             object oobject1 = tcontentWith[i];
             if (oobject1 != null) {
                p0.writeMessage(3, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
