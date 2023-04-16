package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$AuctionInfoSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$AuctionBidInfo;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$CustomizedPriceIncrementConfig;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$ItemInfo;

public final class LiveRoomSignalMessage$AuctionInfoSignal extends MessageNano	// class@001c40
{
    public LiveRoomSignalMessage$AuctionBidInfo[] bidInfos;
    public int bidPersonCount;
    public String bidRule;
    public String bidStartPrice;
    public String comment;
    public int delayDurationSecond;
    public int delayEndDurationSecond;
    public long duration;
    public String endPrice;
    public long endTime;
    public boolean hasAuctionSuspendFeature;
    public boolean hasEnableDelayEndDuration;
    public long id;
    public LiveRoomSignalMessage$ItemInfo itemInfo;
    public boolean needQueryActivityLabel;
    public String nowPrice;
    public long orderId;
    public long orderOverTimeMillis;
    public LiveRoomSignalMessage$CustomizedPriceIncrementConfig[] priceIncrConfig;
    public int priceIncrement;
    public int priceIncrementMode;
    public long realEndTime;
    public long requestDelayMills;
    public int requestDelaySecond;
    public String serviceFeeText;
    public long startTime;
    public String toPayUrl;
    public String toastSpeechcraft;
    public boolean useComment;
    public UserInfos$PicUrl[] userHeadUrl;
    public long userId;
    public String userName;
    public static LiveRoomSignalMessage$AuctionInfoSignal[] _emptyArray;

    public void LiveRoomSignalMessage$AuctionInfoSignal(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$AuctionInfoSignal[] emptyArray(){
       if (LiveRoomSignalMessage$AuctionInfoSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$AuctionInfoSignal._emptyArray == null) {
             LiveRoomSignalMessage$AuctionInfoSignal[] uAuctionInfo = new LiveRoomSignalMessage$AuctionInfoSignal[0];
             LiveRoomSignalMessage$AuctionInfoSignal._emptyArray = uAuctionInfo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$AuctionInfoSignal._emptyArray;
    }
    public static LiveRoomSignalMessage$AuctionInfoSignal parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$AuctionInfoSignal().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$AuctionInfoSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$AuctionInfoSignal(), p0);
    }
    public LiveRoomSignalMessage$AuctionInfoSignal clear(){
       this.id = 0;
       this.itemInfo = null;
       this.startTime = 0;
       this.duration = 0;
       this.endTime = 0;
       this.bidStartPrice = "";
       this.priceIncrement = 0;
       this.bidRule = "";
       this.delayEndDurationSecond = 0;
       this.delayDurationSecond = 0;
       this.requestDelaySecond = 0;
       this.nowPrice = "";
       this.bidInfos = LiveRoomSignalMessage$AuctionBidInfo.emptyArray();
       this.bidPersonCount = 0;
       this.endPrice = "";
       this.toPayUrl = "";
       this.userHeadUrl = UserInfos$PicUrl.emptyArray();
       this.userId = 0;
       this.userName = "";
       this.orderOverTimeMillis = 0;
       this.orderId = 0;
       this.toastSpeechcraft = "";
       this.useComment = false;
       this.comment = "";
       this.needQueryActivityLabel = false;
       this.requestDelayMills = 0;
       this.hasAuctionSuspendFeature = false;
       this.hasEnableDelayEndDuration = false;
       this.realEndTime = 0;
       this.serviceFeeText = "";
       this.priceIncrementMode = 0;
       this.priceIncrConfig = LiveRoomSignalMessage$CustomizedPriceIncrementConfig.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       LiveRoomSignalMessage$AuctionInfoSignal tbidInfos;
       object oobject;
       int i = super.computeSerializedSize();
       LiveRoomSignalMessage$AuctionInfoSignal tid = this.id;
       if (tid) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tid);
       }
       tid = this.itemInfo;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tid);
       }
       tid = this.startTime;
       if (tid) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tid);
       }
       tid = this.duration;
       if (tid) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tid);
       }
       tid = this.endTime;
       if (tid) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tid);
       }
       String str = "";
       if (!(this.bidStartPrice).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.bidStartPrice);
       }
       tid = this.priceIncrement;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tid);
       }
       if (!(this.bidRule).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.bidRule);
       }
       tid = this.delayEndDurationSecond;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(9, tid);
       }
       tid = this.delayDurationSecond;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(10, tid);
       }
       tid = this.requestDelaySecond;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(11, tid);
       }
       if (!(this.nowPrice).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.nowPrice);
       }
       tid = this.bidInfos;
       int i1 = 0;
       if (tid != null && tid.length > 0) {
          i2 = 0;
          tbidInfos = this.bidInfos;
          while (i2 < tbidInfos.length) {
             oobject = tbidInfos[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(13, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tid = this.bidPersonCount;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(14, tid);
       }
       if (!(this.endPrice).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.endPrice);
       }
       if (!(this.toPayUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(16, this.toPayUrl);
       }
       tid = this.userHeadUrl;
       if (tid != null && tid.length > 0) {
          i2 = 0;
          tbidInfos = this.userHeadUrl;
          while (i2 < tbidInfos.length) {
             oobject = tbidInfos[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(17, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tbidInfos = this.userId;
       if (tbidInfos) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(18, tbidInfos);
       }
       if (!(this.userName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(19, this.userName);
       }
       tbidInfos = this.orderOverTimeMillis;
       if (tbidInfos) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(20, tbidInfos);
       }
       tbidInfos = this.orderId;
       if (tbidInfos) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(21, tbidInfos);
       }
       if (!(this.toastSpeechcraft).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(22, this.toastSpeechcraft);
       }
       tid = this.useComment;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(23, tid);
       }
       if (!(this.comment).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(24, this.comment);
       }
       tid = this.needQueryActivityLabel;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(25, tid);
       }
       tbidInfos = this.requestDelayMills;
       if (tbidInfos) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(26, tbidInfos);
       }
       tid = this.hasAuctionSuspendFeature;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(27, tid);
       }
       tid = this.hasEnableDelayEndDuration;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(28, tid);
       }
       tbidInfos = this.realEndTime;
       if (tbidInfos) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(29, tbidInfos);
       }
       if (!(this.serviceFeeText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(30, this.serviceFeeText);
       }
       tid = this.priceIncrementMode;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(31, tid);
       }
       tid = this.priceIncrConfig;
       if (tid != null && tid.length > 0) {
          tid = this.priceIncrConfig;
          while (i1 < tid.length) {
             object oobject1 = tid[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(32, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$AuctionInfoSignal mergeFrom(CodedInputByteBufferNano p0){
       LiveRoomSignalMessage$AuctionInfoSignal tbidInfos;
       int i2;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 8:
                this.id = p0.readUInt64();
                break;
              case 18:
                if (this.itemInfo == null) {
                   this.itemInfo = new LiveRoomSignalMessage$ItemInfo();
                }
                p0.readMessage(this.itemInfo);
                break;
              case 24:
                this.startTime = p0.readUInt64();
                break;
              case 32:
                this.duration = p0.readUInt64();
                break;
              case '(':
                this.endTime = p0.readUInt64();
                break;
              case '2':
                this.bidStartPrice = p0.readString();
                break;
              case '8':
                this.priceIncrement = p0.readUInt32();
                break;
              case 'B':
                this.bidRule = p0.readString();
                break;
              case 'H':
                this.delayEndDurationSecond = p0.readUInt32();
                break;
              case 'P':
                this.delayDurationSecond = p0.readUInt32();
                break;
              case 'X':
                this.requestDelaySecond = p0.readUInt32();
                break;
              case 'b':
                this.nowPrice = p0.readString();
                break;
              case 'j':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 106);
                tbidInfos = this.bidInfos;
                i2 = (tbidInfos == null)? 0: tbidInfos.length;
                i = i + i2;
                LiveRoomSignalMessage$AuctionBidInfo[] uAuctionBidI = new LiveRoomSignalMessage$AuctionBidInfo[i];
                if (i2) {
                   System.arraycopy(tbidInfos, i1, uAuctionBidI, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uAuctionBidI[i2] = new LiveRoomSignalMessage$AuctionBidInfo();
                   p0.readMessage(uAuctionBidI[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uAuctionBidI[i2] = new LiveRoomSignalMessage$AuctionBidInfo();
                p0.readMessage(uAuctionBidI[i2]);
                this.bidInfos = uAuctionBidI;
                break;
              case 'p':
                this.bidPersonCount = p0.readUInt32();
                break;
              case 'z':
                this.endPrice = p0.readString();
                break;
              case 130:
                this.toPayUrl = p0.readString();
                break;
              case 138:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 138);
                tbidInfos = this.userHeadUrl;
                i2 = (tbidInfos == null)? 0: tbidInfos.length;
                i = i + i2;
                UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tbidInfos, i1, picUrlArray, i1, i2);
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
                this.userHeadUrl = picUrlArray;
                break;
              case 144:
                this.userId = p0.readUInt64();
                break;
              case 154:
                this.userName = p0.readString();
                break;
              case 160:
                this.orderOverTimeMillis = p0.readUInt64();
                break;
              case 168:
                this.orderId = p0.readUInt64();
                break;
              case 178:
                this.toastSpeechcraft = p0.readString();
                break;
              case 184:
                this.useComment = p0.readBool();
                break;
              case 194:
                this.comment = p0.readString();
                break;
              case 200:
                this.needQueryActivityLabel = p0.readBool();
                break;
              case 208:
                this.requestDelayMills = p0.readUInt64();
                break;
              case 216:
                this.hasAuctionSuspendFeature = p0.readBool();
                break;
              case 224:
                this.hasEnableDelayEndDuration = p0.readBool();
                break;
              case 232:
                this.realEndTime = p0.readUInt64();
                break;
              case 242:
                this.serviceFeeText = p0.readString();
                break;
              case 248:
                this.priceIncrementMode = p0.readUInt32();
                break;
              case 258:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 258);
                tbidInfos = this.priceIncrConfig;
                i2 = (tbidInfos == null)? 0: tbidInfos.length;
                i = i + i2;
                LiveRoomSignalMessage$CustomizedPriceIncrementConfig[] uCustomizedP = new LiveRoomSignalMessage$CustomizedPriceIncrementConfig[i];
                if (i2) {
                   System.arraycopy(tbidInfos, i1, uCustomizedP, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uCustomizedP[i2] = new LiveRoomSignalMessage$CustomizedPriceIncrementConfig();
                   p0.readMessage(uCustomizedP[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uCustomizedP[i2] = new LiveRoomSignalMessage$CustomizedPriceIncrementConfig();
                p0.readMessage(uCustomizedP[i2]);
                this.priceIncrConfig = uCustomizedP;
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
       int i1;
       LiveRoomSignalMessage$AuctionInfoSignal tbidInfos;
       object oobject;
       LiveRoomSignalMessage$AuctionInfoSignal tid = this.id;
       if (tid) {
          p0.writeUInt64(1, tid);
       }
       tid = this.itemInfo;
       if (tid != null) {
          p0.writeMessage(2, tid);
       }
       tid = this.startTime;
       if (tid) {
          p0.writeUInt64(3, tid);
       }
       tid = this.duration;
       if (tid) {
          p0.writeUInt64(4, tid);
       }
       tid = this.endTime;
       if (tid) {
          p0.writeUInt64(5, tid);
       }
       String str = "";
       if (!(this.bidStartPrice).equals(str)) {
          p0.writeString(6, this.bidStartPrice);
       }
       tid = this.priceIncrement;
       if (tid != null) {
          p0.writeUInt32(7, tid);
       }
       if (!(this.bidRule).equals(str)) {
          p0.writeString(8, this.bidRule);
       }
       tid = this.delayEndDurationSecond;
       if (tid != null) {
          p0.writeUInt32(9, tid);
       }
       tid = this.delayDurationSecond;
       if (tid != null) {
          p0.writeUInt32(10, tid);
       }
       tid = this.requestDelaySecond;
       if (tid != null) {
          p0.writeUInt32(11, tid);
       }
       if (!(this.nowPrice).equals(str)) {
          p0.writeString(12, this.nowPrice);
       }
       tid = this.bidInfos;
       int i = 0;
       if (tid != null && tid.length > 0) {
          i1 = 0;
          tbidInfos = this.bidInfos;
          while (i1 < tbidInfos.length) {
             oobject = tbidInfos[i1];
             if (oobject != null) {
                p0.writeMessage(13, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tid = this.bidPersonCount;
       if (tid != null) {
          p0.writeUInt32(14, tid);
       }
       if (!(this.endPrice).equals(str)) {
          p0.writeString(15, this.endPrice);
       }
       if (!(this.toPayUrl).equals(str)) {
          p0.writeString(16, this.toPayUrl);
       }
       tid = this.userHeadUrl;
       if (tid != null && tid.length > 0) {
          i1 = 0;
          tbidInfos = this.userHeadUrl;
          while (i1 < tbidInfos.length) {
             oobject = tbidInfos[i1];
             if (oobject != null) {
                p0.writeMessage(17, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tbidInfos = this.userId;
       if (tbidInfos) {
          p0.writeUInt64(18, tbidInfos);
       }
       if (!(this.userName).equals(str)) {
          p0.writeString(19, this.userName);
       }
       tbidInfos = this.orderOverTimeMillis;
       if (tbidInfos) {
          p0.writeUInt64(20, tbidInfos);
       }
       tbidInfos = this.orderId;
       if (tbidInfos) {
          p0.writeUInt64(21, tbidInfos);
       }
       if (!(this.toastSpeechcraft).equals(str)) {
          p0.writeString(22, this.toastSpeechcraft);
       }
       tid = this.useComment;
       if (tid != null) {
          p0.writeBool(23, tid);
       }
       if (!(this.comment).equals(str)) {
          p0.writeString(24, this.comment);
       }
       tid = this.needQueryActivityLabel;
       if (tid != null) {
          p0.writeBool(25, tid);
       }
       tbidInfos = this.requestDelayMills;
       if (tbidInfos) {
          p0.writeUInt64(26, tbidInfos);
       }
       tid = this.hasAuctionSuspendFeature;
       if (tid != null) {
          p0.writeBool(27, tid);
       }
       tid = this.hasEnableDelayEndDuration;
       if (tid != null) {
          p0.writeBool(28, tid);
       }
       tbidInfos = this.realEndTime;
       if (tbidInfos) {
          p0.writeUInt64(29, tbidInfos);
       }
       if (!(this.serviceFeeText).equals(str)) {
          p0.writeString(30, this.serviceFeeText);
       }
       tid = this.priceIncrementMode;
       if (tid != null) {
          p0.writeUInt32(31, tid);
       }
       tid = this.priceIncrConfig;
       if (tid != null && tid.length > 0) {
          tid = this.priceIncrConfig;
          while (i < tid.length) {
             object oobject1 = tid[i];
             if (oobject1 != null) {
                p0.writeMessage(32, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
