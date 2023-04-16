package com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant$PendantImageInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant$PendantImageInfo extends MessageNano	// class@00111a
{
    public UserInfos$PicUrl[] backgroundImgUrl;
    public UserInfos$PicUrl[] buttonImgUrl;
    public UserInfos$PicUrl[] topImgUrl;
    public static LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant$PendantImageInfo[] _emptyArray;

    public void LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant$PendantImageInfo(){
       super();
       this.clear();
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant$PendantImageInfo[] emptyArray(){
       if (LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant$PendantImageInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant$PendantImageInfo._emptyArray == null) {
             LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant$PendantImageInfo[] sCLiveBlindD = new LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant$PendantImageInfo[0];
             LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant$PendantImageInfo._emptyArray = sCLiveBlindD;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant$PendantImageInfo._emptyArray;
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant$PendantImageInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant$PendantImageInfo().mergeFrom(p0);
    }
    public static LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant$PendantImageInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant$PendantImageInfo(), p0);
    }
    public LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant$PendantImageInfo clear(){
       this.backgroundImgUrl = UserInfos$PicUrl.emptyArray();
       this.topImgUrl = UserInfos$PicUrl.emptyArray();
       this.buttonImgUrl = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant$PendantImageInfo tbackgroundI1;
       object oobject;
       int i = super.computeSerializedSize();
       LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant$PendantImageInfo tbackgroundI = this.backgroundImgUrl;
       int i1 = 0;
       if (tbackgroundI != null && tbackgroundI.length > 0) {
          i2 = 0;
          tbackgroundI1 = this.backgroundImgUrl;
          while (i2 < tbackgroundI1.length) {
             oobject = tbackgroundI1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tbackgroundI = this.topImgUrl;
       if (tbackgroundI != null && tbackgroundI.length > 0) {
          i2 = 0;
          tbackgroundI1 = this.topImgUrl;
          while (i2 < tbackgroundI1.length) {
             oobject = tbackgroundI1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tbackgroundI = this.buttonImgUrl;
       if (tbackgroundI != null && tbackgroundI.length > 0) {
          tbackgroundI = this.buttonImgUrl;
          while (i1 < tbackgroundI.length) {
             object oobject1 = tbackgroundI[i1];
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
    public LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant$PendantImageInfo mergeFrom(CodedInputByteBufferNano p0){
       LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant$PendantImageInfo tbuttonImgUr;
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
                   tbuttonImgUr = this.buttonImgUrl;
                   i2 = (tbuttonImgUr == null)? 0: tbuttonImgUr.length;
                   i = i + i2;
                   picUrlArray = new UserInfos$PicUrl[i];
                   if (i2) {
                      System.arraycopy(tbuttonImgUr, 0, picUrlArray, 0, i2);
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
                   this.buttonImgUrl = picUrlArray;
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                tbuttonImgUr = this.topImgUrl;
                i2 = (tbuttonImgUr == null)? 0: tbuttonImgUr.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tbuttonImgUr, 0, picUrlArray, 0, i2);
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
                this.topImgUrl = picUrlArray;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             tbuttonImgUr = this.backgroundImgUrl;
             i2 = (tbuttonImgUr == null)? 0: tbuttonImgUr.length;
             i = i + i2;
             picUrlArray = new UserInfos$PicUrl[i];
             if (i2) {
                System.arraycopy(tbuttonImgUr, 0, picUrlArray, 0, i2);
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
             this.backgroundImgUrl = picUrlArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i1;
       LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant$PendantImageInfo tbackgroundI1;
       object oobject;
       LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant$PendantImageInfo tbackgroundI = this.backgroundImgUrl;
       int i = 0;
       if (tbackgroundI != null && tbackgroundI.length > 0) {
          i1 = 0;
          tbackgroundI1 = this.backgroundImgUrl;
          while (i1 < tbackgroundI1.length) {
             oobject = tbackgroundI1[i1];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tbackgroundI = this.topImgUrl;
       if (tbackgroundI != null && tbackgroundI.length > 0) {
          i1 = 0;
          tbackgroundI1 = this.topImgUrl;
          while (i1 < tbackgroundI1.length) {
             oobject = tbackgroundI1[i1];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tbackgroundI = this.buttonImgUrl;
       if (tbackgroundI != null && tbackgroundI.length > 0) {
          tbackgroundI = this.buttonImgUrl;
          while (i < tbackgroundI.length) {
             object oobject1 = tbackgroundI[i];
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
