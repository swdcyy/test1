package com.kuaishou.protobuf.gamezone.nano.GzoneGiftLotteryPrize;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class GzoneGiftLotteryPrize extends MessageNano	// class@000bc6
{
    public String bottomBackgroundColor;
    public String bottomTxt;
    public int count;
    public UserInfos$PicUrl[] prizeIcon;
    public int prizeId;
    public String prizeName;
    public int prizeValue;
    public static GzoneGiftLotteryPrize[] _emptyArray;

    public void GzoneGiftLotteryPrize(){
       super();
       this.clear();
    }
    public static GzoneGiftLotteryPrize[] emptyArray(){
       if (GzoneGiftLotteryPrize._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (GzoneGiftLotteryPrize._emptyArray == null) {
             GzoneGiftLotteryPrize[] gzoneGiftLot = new GzoneGiftLotteryPrize[0];
             GzoneGiftLotteryPrize._emptyArray = gzoneGiftLot;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return GzoneGiftLotteryPrize._emptyArray;
    }
    public static GzoneGiftLotteryPrize parseFrom(CodedInputByteBufferNano p0){
       return new GzoneGiftLotteryPrize().mergeFrom(p0);
    }
    public static GzoneGiftLotteryPrize parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new GzoneGiftLotteryPrize(), p0);
    }
    public GzoneGiftLotteryPrize clear(){
       this.prizeId = 0;
       this.prizeName = "";
       this.prizeIcon = UserInfos$PicUrl.emptyArray();
       this.count = 0;
       this.bottomTxt = "";
       this.bottomBackgroundColor = "";
       this.prizeValue = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       GzoneGiftLotteryPrize tprizeId = this.prizeId;
       if (tprizeId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tprizeId);
       }
       String str = "";
       if (!(this.prizeName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.prizeName);
       }
       tprizeId = this.prizeIcon;
       if (tprizeId != null && tprizeId.length > 0) {
          int i1 = 0;
          GzoneGiftLotteryPrize tprizeIcon = this.prizeIcon;
          while (i1 < tprizeIcon.length) {
             object oobject = tprizeIcon[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tprizeId = this.count;
       if (tprizeId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tprizeId);
       }
       if (!(this.bottomTxt).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.bottomTxt);
       }
       if (!(this.bottomBackgroundColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.bottomBackgroundColor);
       }
       tprizeId = this.prizeValue;
       if (tprizeId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tprizeId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public GzoneGiftLotteryPrize mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                int i1 = 26;
                if (i != i1) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 56) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.prizeValue = p0.readUInt32();
                            }
                         }else {
                            this.bottomBackgroundColor = p0.readString();
                         }
                      }else {
                         this.bottomTxt = p0.readString();
                      }
                   }else {
                      this.count = p0.readUInt32();
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   GzoneGiftLotteryPrize tprizeIcon = this.prizeIcon;
                   int i2 = (tprizeIcon == null)? 0: tprizeIcon.length;
                   i = i + i2;
                   UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                   if (i2) {
                      System.arraycopy(tprizeIcon, 0, picUrlArray, 0, i2);
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
                   this.prizeIcon = picUrlArray;
                }
             }else {
                this.prizeName = p0.readString();
             }
          }else {
             this.prizeId = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       GzoneGiftLotteryPrize tprizeId = this.prizeId;
       if (tprizeId != null) {
          p0.writeUInt32(1, tprizeId);
       }
       String str = "";
       if (!(this.prizeName).equals(str)) {
          p0.writeString(2, this.prizeName);
       }
       tprizeId = this.prizeIcon;
       if (tprizeId != null && tprizeId.length > 0) {
          int i = 0;
          GzoneGiftLotteryPrize tprizeIcon = this.prizeIcon;
          while (i < tprizeIcon.length) {
             object oobject = tprizeIcon[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       tprizeId = this.count;
       if (tprizeId != null) {
          p0.writeUInt32(4, tprizeId);
       }
       if (!(this.bottomTxt).equals(str)) {
          p0.writeString(5, this.bottomTxt);
       }
       if (!(this.bottomBackgroundColor).equals(str)) {
          p0.writeString(6, this.bottomBackgroundColor);
       }
       tprizeId = this.prizeValue;
       if (tprizeId != null) {
          p0.writeUInt32(7, tprizeId);
       }
       super.writeTo(p0);
       return;
    }
}
