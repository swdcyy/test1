package com.kuaishou.protobuf.gamezone.nano.SCGzoneGiftLotteryNotify;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.gamezone.nano.GzoneGiftLotteryPrize;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCGzoneGiftLotteryNotify extends MessageNano	// class@000bd5
{
    public UserInfos$PicUrl[] backgroundUrl;
    public String buttonTxt;
    public String buttonUrl;
    public int giftId;
    public long kshellBalance;
    public long liveStreamId;
    public GzoneGiftLotteryPrize[] prize;
    public String prizePackageTxt;
    public String prizePackageUrl;
    public long serverTimeMills;
    public String title;
    public static SCGzoneGiftLotteryNotify[] _emptyArray;

    public void SCGzoneGiftLotteryNotify(){
       super();
       this.clear();
    }
    public static SCGzoneGiftLotteryNotify[] emptyArray(){
       if (SCGzoneGiftLotteryNotify._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGzoneGiftLotteryNotify._emptyArray == null) {
             SCGzoneGiftLotteryNotify[] sCGzoneGiftL = new SCGzoneGiftLotteryNotify[0];
             SCGzoneGiftLotteryNotify._emptyArray = sCGzoneGiftL;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGzoneGiftLotteryNotify._emptyArray;
    }
    public static SCGzoneGiftLotteryNotify parseFrom(CodedInputByteBufferNano p0){
       return new SCGzoneGiftLotteryNotify().mergeFrom(p0);
    }
    public static SCGzoneGiftLotteryNotify parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGzoneGiftLotteryNotify(), p0);
    }
    public SCGzoneGiftLotteryNotify clear(){
       this.title = "";
       this.prize = GzoneGiftLotteryPrize.emptyArray();
       this.prizePackageTxt = "";
       this.prizePackageUrl = "";
       this.buttonTxt = "";
       this.buttonUrl = "";
       this.giftId = 0;
       this.liveStreamId = 0;
       this.backgroundUrl = UserInfos$PicUrl.emptyArray();
       this.kshellBalance = 0;
       this.serverTimeMills = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.title);
       }
       SCGzoneGiftLotteryNotify tprize = this.prize;
       int i1 = 0;
       if (tprize != null && tprize.length > 0) {
          int i2 = 0;
          SCGzoneGiftLotteryNotify tprize1 = this.prize;
          while (i2 < tprize1.length) {
             object oobject = tprize1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.prizePackageTxt).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.prizePackageTxt);
       }
       if (!(this.prizePackageUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.prizePackageUrl);
       }
       if (!(this.buttonTxt).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.buttonTxt);
       }
       if (!(this.buttonUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.buttonUrl);
       }
       tprize = this.giftId;
       if (tprize != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tprize);
       }
       tprize = this.liveStreamId;
       if (tprize) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tprize);
       }
       tprize = this.backgroundUrl;
       if (tprize != null && tprize.length > 0) {
          tprize = this.backgroundUrl;
          while (i1 < tprize.length) {
             object oobject1 = tprize[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(9, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tprize = this.kshellBalance;
       if (tprize) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(10, tprize);
       }
       tprize = this.serverTimeMills;
       if (tprize) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, tprize);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGzoneGiftLotteryNotify mergeFrom(CodedInputByteBufferNano p0){
       SCGzoneGiftLotteryNotify tprize;
       int i2;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                this.title = p0.readString();
                break;
              case 18:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 18);
                tprize = this.prize;
                i2 = (tprize == null)? 0: tprize.length;
                i = i + i2;
                GzoneGiftLotteryPrize[] gzoneGiftLot = new GzoneGiftLotteryPrize[i];
                if (i2) {
                   System.arraycopy(tprize, i1, gzoneGiftLot, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   gzoneGiftLot[i2] = new GzoneGiftLotteryPrize();
                   p0.readMessage(gzoneGiftLot[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                gzoneGiftLot[i2] = new GzoneGiftLotteryPrize();
                p0.readMessage(gzoneGiftLot[i2]);
                this.prize = gzoneGiftLot;
                break;
              case 26:
                this.prizePackageTxt = p0.readString();
                break;
              case '"':
                this.prizePackageUrl = p0.readString();
                break;
              case '*':
                this.buttonTxt = p0.readString();
                break;
              case '2':
                this.buttonUrl = p0.readString();
                break;
              case '8':
                this.giftId = p0.readUInt32();
                break;
              case '@':
                this.liveStreamId = p0.readUInt64();
                break;
              case 'J':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 74);
                tprize = this.backgroundUrl;
                i2 = (tprize == null)? 0: tprize.length;
                i = i + i2;
                UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tprize, i1, picUrlArray, i1, i2);
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
                break;
              case 'P':
                this.kshellBalance = p0.readUInt64();
                break;
              case 'X':
                this.serverTimeMills = p0.readUInt64();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.title).equals(str)) {
          p0.writeString(1, this.title);
       }
       SCGzoneGiftLotteryNotify tprize = this.prize;
       int i = 0;
       if (tprize != null && tprize.length > 0) {
          int i1 = 0;
          SCGzoneGiftLotteryNotify tprize1 = this.prize;
          while (i1 < tprize1.length) {
             object oobject = tprize1[i1];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.prizePackageTxt).equals(str)) {
          p0.writeString(3, this.prizePackageTxt);
       }
       if (!(this.prizePackageUrl).equals(str)) {
          p0.writeString(4, this.prizePackageUrl);
       }
       if (!(this.buttonTxt).equals(str)) {
          p0.writeString(5, this.buttonTxt);
       }
       if (!(this.buttonUrl).equals(str)) {
          p0.writeString(6, this.buttonUrl);
       }
       tprize = this.giftId;
       if (tprize != null) {
          p0.writeUInt32(7, tprize);
       }
       tprize = this.liveStreamId;
       if (tprize) {
          p0.writeUInt64(8, tprize);
       }
       tprize = this.backgroundUrl;
       if (tprize != null && tprize.length > 0) {
          tprize = this.backgroundUrl;
          while (i < tprize.length) {
             object oobject1 = tprize[i];
             if (oobject1 != null) {
                p0.writeMessage(9, oobject1);
             }
             i = i + 1;
          }
       }
       tprize = this.kshellBalance;
       if (tprize) {
          p0.writeUInt64(10, tprize);
       }
       tprize = this.serverTimeMills;
       if (tprize) {
          p0.writeUInt64(11, tprize);
       }
       super.writeTo(p0);
       return;
    }
}
