package com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo extends MessageNano	// class@00117a
{
    public UserInfos$PicUrl[] luckyResultBgPict;
    public UserInfos$PicUrl[] resultInnerBgPict;
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo[] _emptyArray;

    public void LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo(){
       super();
       this.clear();
    }
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo[] emptyArray(){
       if (LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo._emptyArray == null) {
             LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo[] uCustomRedPa = new LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo[0];
             LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo._emptyArray = uCustomRedPa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo._emptyArray;
    }
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo().mergeFrom(p0);
    }
    public static LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo(), p0);
    }
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo clear(){
       this.resultInnerBgPict = UserInfos$PicUrl.emptyArray();
       this.luckyResultBgPict = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo tresultInner = this.resultInnerBgPict;
       int i1 = 0;
       if (tresultInner != null && tresultInner.length > 0) {
          int i2 = 0;
          LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo tresultInner1 = this.resultInnerBgPict;
          while (i2 < tresultInner1.length) {
             object oobject = tresultInner1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tresultInner = this.luckyResultBgPict;
       if (tresultInner != null && tresultInner.length > 0) {
          tresultInner = this.luckyResultBgPict;
          while (i1 < tresultInner.length) {
             object oobject1 = tresultInner[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo mergeFrom(CodedInputByteBufferNano p0){
       LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo tluckyResult;
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
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                tluckyResult = this.luckyResultBgPict;
                i2 = (tluckyResult == null)? 0: tluckyResult.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tluckyResult, 0, picUrlArray, 0, i2);
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
                this.luckyResultBgPict = picUrlArray;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             tluckyResult = this.resultInnerBgPict;
             i2 = (tluckyResult == null)? 0: tluckyResult.length;
             i = i + i2;
             picUrlArray = new UserInfos$PicUrl[i];
             if (i2) {
                System.arraycopy(tluckyResult, 0, picUrlArray, 0, i2);
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
             this.resultInnerBgPict = picUrlArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo tresultInner = this.resultInnerBgPict;
       int i = 0;
       if (tresultInner != null && tresultInner.length > 0) {
          int i1 = 0;
          LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo tresultInner1 = this.resultInnerBgPict;
          while (i1 < tresultInner1.length) {
             object oobject = tresultInner1[i1];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tresultInner = this.luckyResultBgPict;
       if (tresultInner != null && tresultInner.length > 0) {
          tresultInner = this.luckyResultBgPict;
          while (i < tresultInner.length) {
             object oobject1 = tresultInner[i];
             if (oobject1 != null) {
                p0.writeMessage(2, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
