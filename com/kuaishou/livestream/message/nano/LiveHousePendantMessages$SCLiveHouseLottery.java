package com.kuaishou.livestream.message.nano.LiveHousePendantMessages$SCLiveHouseLottery;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.System;
import com.kuaishou.livestream.message.nano.LiveHousePendantMessages$LiveHouseLotteryPopUp;
import com.kuaishou.livestream.message.nano.LiveHousePendantMessages$LiveHouseLotteryRule;
import com.kuaishou.livestream.message.nano.LiveHousePendantMessages$LiveHouseLotteryDesc;

public final class LiveHousePendantMessages$SCLiveHouseLottery extends MessageNano	// class@0011c8
{
    public long[] awardUserId;
    public String bgImg;
    public LiveHousePendantMessages$LiveHouseLotteryDesc desc;
    public LiveHousePendantMessages$LiveHouseLotteryPopUp noAwardPopUp;
    public LiveHousePendantMessages$LiveHouseLotteryRule rule;
    public String skipUrl;
    public String subTitle;
    public String title;
    public static LiveHousePendantMessages$SCLiveHouseLottery[] _emptyArray;

    public void LiveHousePendantMessages$SCLiveHouseLottery(){
       super();
       this.clear();
    }
    public static LiveHousePendantMessages$SCLiveHouseLottery[] emptyArray(){
       if (LiveHousePendantMessages$SCLiveHouseLottery._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveHousePendantMessages$SCLiveHouseLottery._emptyArray == null) {
             LiveHousePendantMessages$SCLiveHouseLottery[] sCLiveHouseL = new LiveHousePendantMessages$SCLiveHouseLottery[0];
             LiveHousePendantMessages$SCLiveHouseLottery._emptyArray = sCLiveHouseL;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveHousePendantMessages$SCLiveHouseLottery._emptyArray;
    }
    public static LiveHousePendantMessages$SCLiveHouseLottery parseFrom(CodedInputByteBufferNano p0){
       return new LiveHousePendantMessages$SCLiveHouseLottery().mergeFrom(p0);
    }
    public static LiveHousePendantMessages$SCLiveHouseLottery parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveHousePendantMessages$SCLiveHouseLottery(), p0);
    }
    public LiveHousePendantMessages$SCLiveHouseLottery clear(){
       this.title = "";
       this.subTitle = "";
       this.desc = null;
       this.bgImg = "";
       this.skipUrl = "";
       this.rule = null;
       this.noAwardPopUp = null;
       this.awardUserId = WireFormatNano.EMPTY_LONG_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.title);
       }
       if (!(this.subTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.subTitle);
       }
       LiveHousePendantMessages$SCLiveHouseLottery tdesc = this.desc;
       if (tdesc != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tdesc);
       }
       if (!(this.bgImg).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.bgImg);
       }
       if (!(this.skipUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.skipUrl);
       }
       tdesc = this.rule;
       if (tdesc != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tdesc);
       }
       tdesc = this.noAwardPopUp;
       if (tdesc != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tdesc);
       }
       tdesc = this.awardUserId;
       if (tdesc != null && tdesc.length > 0) {
          int i1 = 0;
          int i2 = 0;
          LiveHousePendantMessages$SCLiveHouseLottery tawardUserId = this.awardUserId;
          while (i1 < tawardUserId.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeInt64SizeNoTag(tawardUserId[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (tawardUserId.length * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveHousePendantMessages$SCLiveHouseLottery mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       LiveHousePendantMessages$SCLiveHouseLottery tawardUserId;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 58) {
                               int i1 = 64;
                               if (i != i1) {
                                  if (i != 66) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     i = p0.pushLimit(p0.readRawVarint32());
                                     i1 = p0.getPosition();
                                     i2 = 0;
                                     while (p0.getBytesUntilLimit() > 0) {
                                        p0.readInt64();
                                        i2 = i2 + 1;
                                     }
                                     p0.rewindToPosition(i1);
                                     tawardUserId = this.awardUserId;
                                     int i3 = (tawardUserId == null)? 0: tawardUserId.length;
                                     i2 = i2 + i3;
                                     long[] olongArray = new long[i2];
                                     if (i3) {
                                        System.arraycopy(tawardUserId, 0, olongArray, 0, i3);
                                     }
                                     while (i3 < i2) {
                                        olongArray[i3] = p0.readInt64();
                                        i3 = i3 + 1;
                                     }
                                     this.awardUserId = olongArray;
                                     p0.popLimit(i);
                                  }
                               }else {
                                  i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                                  tawardUserId = this.awardUserId;
                                  i2 = (tawardUserId == null)? 0: tawardUserId.length;
                                  i = i + i2;
                                  long[] olongArray1 = new long[i];
                                  if (i2) {
                                     System.arraycopy(tawardUserId, 0, olongArray1, 0, i2);
                                  }
                                  i1 = i - 1;
                                  while (i2 < i1) {
                                     olongArray1[i2] = p0.readInt64();
                                     p0.readTag();
                                     i2 = i2 + 1;
                                  }
                                  olongArray1[i2] = p0.readInt64();
                                  this.awardUserId = olongArray1;
                               }
                            }else if(this.noAwardPopUp == null){
                               this.noAwardPopUp = new LiveHousePendantMessages$LiveHouseLotteryPopUp();
                            }
                            p0.readMessage(this.noAwardPopUp);
                         }else if(this.rule == null){
                            this.rule = new LiveHousePendantMessages$LiveHouseLotteryRule();
                         }
                         p0.readMessage(this.rule);
                      }else {
                         this.skipUrl = p0.readString();
                      }
                   }else {
                      this.bgImg = p0.readString();
                   }
                }else if(this.desc == null){
                   this.desc = new LiveHousePendantMessages$LiveHouseLotteryDesc();
                }
                p0.readMessage(this.desc);
             }else {
                this.subTitle = p0.readString();
             }
          }else {
             this.title = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.title).equals(str)) {
          p0.writeString(1, this.title);
       }
       if (!(this.subTitle).equals(str)) {
          p0.writeString(2, this.subTitle);
       }
       LiveHousePendantMessages$SCLiveHouseLottery tdesc = this.desc;
       if (tdesc != null) {
          p0.writeMessage(3, tdesc);
       }
       if (!(this.bgImg).equals(str)) {
          p0.writeString(4, this.bgImg);
       }
       if (!(this.skipUrl).equals(str)) {
          p0.writeString(5, this.skipUrl);
       }
       tdesc = this.rule;
       if (tdesc != null) {
          p0.writeMessage(6, tdesc);
       }
       tdesc = this.noAwardPopUp;
       if (tdesc != null) {
          p0.writeMessage(7, tdesc);
       }
       tdesc = this.awardUserId;
       if (tdesc != null && tdesc.length > 0) {
          int i = 0;
          LiveHousePendantMessages$SCLiveHouseLottery tawardUserId = this.awardUserId;
          while (i < tawardUserId.length) {
             p0.writeInt64(8, tawardUserId[i]);
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
