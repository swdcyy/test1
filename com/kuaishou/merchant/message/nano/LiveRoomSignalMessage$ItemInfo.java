package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$ItemInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.System;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$ItemCurrency;

public final class LiveRoomSignalMessage$ItemInfo extends MessageNano	// class@001c4e
{
    public String appletJumpUrl;
    public String bigHotSaleAnimatePics;
    public UserInfos$PicUrl[] bigHotSaleAnimateUrl;
    public String buttonDesc;
    public String buttonText;
    public UserInfos$PicUrl[] buyButtonImageUrl;
    public String[] buyButtonUrlList;
    public int currency;
    public String extraMap;
    public UserInfos$PicUrl[] imageUrl;
    public LiveRoomSignalMessage$ItemCurrency itemCurrency;
    public String itemId;
    public String[] itemUrlList;
    public String jumpUrl;
    public String originPrice;
    public String price;
    public String pricePrefix;
    public String priceSuffix;
    public long saleEndTime;
    public int saleType;
    public int[] showIcon;
    public String smallHotSaleAnimatePics;
    public UserInfos$PicUrl[] smallHotSaleAnimateUrl;
    public int sourceType;
    public String title;
    public static LiveRoomSignalMessage$ItemInfo[] _emptyArray;

    public void LiveRoomSignalMessage$ItemInfo(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$ItemInfo[] emptyArray(){
       if (LiveRoomSignalMessage$ItemInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$ItemInfo._emptyArray == null) {
             LiveRoomSignalMessage$ItemInfo[] itemInfoArra = new LiveRoomSignalMessage$ItemInfo[0];
             LiveRoomSignalMessage$ItemInfo._emptyArray = itemInfoArra;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$ItemInfo._emptyArray;
    }
    public static LiveRoomSignalMessage$ItemInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$ItemInfo().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$ItemInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$ItemInfo(), p0);
    }
    public LiveRoomSignalMessage$ItemInfo clear(){
       this.itemId = "";
       this.imageUrl = UserInfos$PicUrl.emptyArray();
       this.title = "";
       this.price = "";
       this.showIcon = WireFormatNano.EMPTY_INT_ARRAY;
       this.jumpUrl = "";
       this.saleType = 0;
       this.extraMap = "";
       this.originPrice = "";
       this.pricePrefix = "";
       this.currency = 0;
       this.priceSuffix = "";
       String[] eMPTY_STRING = WireFormatNano.EMPTY_STRING_ARRAY;
       this.itemUrlList = eMPTY_STRING;
       this.appletJumpUrl = "";
       this.saleEndTime = 0;
       this.buyButtonUrlList = eMPTY_STRING;
       this.buyButtonImageUrl = UserInfos$PicUrl.emptyArray();
       this.sourceType = 0;
       this.buttonText = "";
       this.buttonDesc = "";
       this.itemCurrency = null;
       this.smallHotSaleAnimatePics = "";
       this.bigHotSaleAnimatePics = "";
       this.smallHotSaleAnimateUrl = UserInfos$PicUrl.emptyArray();
       this.bigHotSaleAnimateUrl = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i4;
       LiveRoomSignalMessage$ItemInfo timageUrl1;
       int i5;
       LiveRoomSignalMessage$ItemInfo tshowIcon;
       int i = super.computeSerializedSize();
       String str = "";
       int i1 = 1;
       if (!(this.itemId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(i1, this.itemId);
       }
       LiveRoomSignalMessage$ItemInfo timageUrl = this.imageUrl;
       int i2 = 2;
       int i3 = 0;
       if (timageUrl != null && timageUrl.length > 0) {
          i4 = 0;
          timageUrl1 = this.imageUrl;
          while (i4 < timageUrl1.length) {
             object oobject = timageUrl1[i4];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(i2, oobject);
             }
             i4 = i4 + 1;
          }
       }
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.title);
       }
       if (!(this.price).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.price);
       }
       timageUrl = this.showIcon;
       if (timageUrl != null && timageUrl.length > 0) {
          i4 = 0;
          i5 = 0;
          tshowIcon = this.showIcon;
          while (i4 < tshowIcon.length) {
             i5 = i5 + CodedOutputByteBufferNano.computeUInt32SizeNoTag(tshowIcon[i4]);
             i4 = i4 + 1;
          }
          i = (i + i5) + (tshowIcon.length * 1);
       }
       if (!(this.jumpUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.jumpUrl);
       }
       timageUrl = this.saleType;
       if (timageUrl != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, timageUrl);
       }
       if (!(this.extraMap).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.extraMap);
       }
       if (!(this.originPrice).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.originPrice);
       }
       if (!(this.pricePrefix).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.pricePrefix);
       }
       timageUrl = this.currency;
       if (timageUrl != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(11, timageUrl);
       }
       if (!(this.priceSuffix).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.priceSuffix);
       }
       timageUrl = this.itemUrlList;
       if (timageUrl != null && timageUrl.length > 0) {
          i4 = 0;
          i5 = 0;
          int i6 = 0;
          LiveRoomSignalMessage$ItemInfo titemUrlList = this.itemUrlList;
          while (i4 < titemUrlList.length) {
             object oobject1 = titemUrlList[i4];
             if (oobject1 != null) {
                i6 = i6 + 1;
                i5 = i5 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject1);
             }
             i4 = i4 + 1;
          }
          i = (i + i5) + (i6 * 1);
       }
       if (!(this.appletJumpUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.appletJumpUrl);
       }
       timageUrl1 = this.saleEndTime;
       if (timageUrl1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(15, timageUrl1);
       }
       timageUrl = this.buyButtonUrlList;
       if (timageUrl != null && timageUrl.length > 0) {
          i4 = 0;
          i1 = 0;
          i5 = 0;
          tshowIcon = this.buyButtonUrlList;
          while (i4 < tshowIcon.length) {
             object oobject2 = tshowIcon[i4];
             if (oobject2 != null) {
                i5 = i5 + 1;
                i1 = i1 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject2);
             }
             i4 = i4 + 1;
          }
          i = (i + i1) + (i5 * 2);
       }
       timageUrl = this.buyButtonImageUrl;
       if (timageUrl != null && timageUrl.length > 0) {
          i4 = 0;
          LiveRoomSignalMessage$ItemInfo tbuyButtonIm = this.buyButtonImageUrl;
          while (i4 < tbuyButtonIm.length) {
             object oobject3 = tbuyButtonIm[i4];
             if (oobject3 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(17, oobject3);
             }
             i4 = i4 + 1;
          }
       }
       timageUrl = this.sourceType;
       if (timageUrl != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(18, timageUrl);
       }
       if (!(this.buttonText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(19, this.buttonText);
       }
       if (!(this.buttonDesc).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(20, this.buttonDesc);
       }
       timageUrl = this.itemCurrency;
       if (timageUrl != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(21, timageUrl);
       }
       if (!(this.smallHotSaleAnimatePics).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(22, this.smallHotSaleAnimatePics);
       }
       if (!(this.bigHotSaleAnimatePics).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(23, this.bigHotSaleAnimatePics);
       }
       timageUrl = this.smallHotSaleAnimateUrl;
       if (timageUrl != null && timageUrl.length > 0) {
          i4 = 0;
          LiveRoomSignalMessage$ItemInfo tsmallHotSal = this.smallHotSaleAnimateUrl;
          while (i4 < tsmallHotSal.length) {
             object oobject4 = tsmallHotSal[i4];
             if (oobject4 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(24, oobject4);
             }
             i4 = i4 + 1;
          }
       }
       timageUrl = this.bigHotSaleAnimateUrl;
       if (timageUrl != null && timageUrl.length > 0) {
          timageUrl = this.bigHotSaleAnimateUrl;
          while (i3 < timageUrl.length) {
             object oobject5 = timageUrl[i3];
             if (oobject5 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(25, oobject5);
             }
             i3 = i3 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$ItemInfo mergeFrom(CodedInputByteBufferNano p0){
       LiveRoomSignalMessage$ItemInfo timageUrl;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       String[] stringArray;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                this.itemId = p0.readString();
                break;
              case 18:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 18);
                timageUrl = this.imageUrl;
                i2 = (timageUrl == null)? 0: timageUrl.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(timageUrl, i1, picUrlArray, i1, i2);
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
                this.imageUrl = picUrlArray;
                break;
              case 26:
                this.title = p0.readString();
                break;
              case '"':
                this.price = p0.readString();
                break;
              case '(':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 40);
                timageUrl = this.showIcon;
                i2 = (timageUrl == null)? 0: timageUrl.length;
                i = i + i2;
                int[] ointArray = new int[i];
                if (i2) {
                   System.arraycopy(timageUrl, i1, ointArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   ointArray[i2] = p0.readUInt32();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                ointArray[i2] = p0.readUInt32();
                this.showIcon = ointArray;
                break;
              case '*':
                i = p0.pushLimit(p0.readRawVarint32());
                int position = p0.getPosition();
                i2 = 0;
                while (p0.getBytesUntilLimit() > 0) {
                   p0.readUInt32();
                   i2 = i2 + 1;
                }
                p0.rewindToPosition(position);
                timageUrl = this.showIcon;
                int i3 = (timageUrl == null)? 0: timageUrl.length;
                i2 = i2 + i3;
                int[] ointArray1 = new int[i2];
                if (i3) {
                   System.arraycopy(timageUrl, i1, ointArray1, i1, i3);
                }
                while (i3 < i2) {
                   ointArray1[i3] = p0.readUInt32();
                   i3 = i3 + 1;
                }
                this.showIcon = ointArray1;
                p0.popLimit(i);
                break;
              case '2':
                this.jumpUrl = p0.readString();
                break;
              case '8':
                this.saleType = p0.readUInt32();
                break;
              case 'B':
                this.extraMap = p0.readString();
                break;
              case 'J':
                this.originPrice = p0.readString();
                break;
              case 'R':
                this.pricePrefix = p0.readString();
                break;
              case 'X':
                i = p0.readInt32();
                if (i && i != 1) {
                   continue ;
                }else {
                   this.currency = i;
                }
                break;
              case 'b':
                this.priceSuffix = p0.readString();
                break;
              case 'j':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 106);
                timageUrl = this.itemUrlList;
                i2 = (timageUrl == null)? 0: timageUrl.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(timageUrl, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.itemUrlList = stringArray;
                break;
              case 'r':
                this.appletJumpUrl = p0.readString();
                break;
              case 'x':
                this.saleEndTime = p0.readUInt64();
                break;
              case 130:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 130);
                timageUrl = this.buyButtonUrlList;
                i2 = (timageUrl == null)? 0: timageUrl.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(timageUrl, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.buyButtonUrlList = stringArray;
                break;
              case 138:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 138);
                timageUrl = this.buyButtonImageUrl;
                i2 = (timageUrl == null)? 0: timageUrl.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(timageUrl, i1, picUrlArray, i1, i2);
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
                this.buyButtonImageUrl = picUrlArray;
                break;
              case 144:
                this.sourceType = p0.readUInt32();
                break;
              case 154:
                this.buttonText = p0.readString();
                break;
              case 162:
                this.buttonDesc = p0.readString();
                break;
              case 170:
                if (this.itemCurrency == null) {
                   this.itemCurrency = new LiveRoomSignalMessage$ItemCurrency();
                }
                p0.readMessage(this.itemCurrency);
                break;
              case 178:
                this.smallHotSaleAnimatePics = p0.readString();
                break;
              case 186:
                this.bigHotSaleAnimatePics = p0.readString();
                break;
              case 194:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 194);
                timageUrl = this.smallHotSaleAnimateUrl;
                i2 = (timageUrl == null)? 0: timageUrl.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(timageUrl, i1, picUrlArray, i1, i2);
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
                this.smallHotSaleAnimateUrl = picUrlArray;
                break;
              case 202:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 202);
                timageUrl = this.bigHotSaleAnimateUrl;
                i2 = (timageUrl == null)? 0: timageUrl.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(timageUrl, i1, picUrlArray, i1, i2);
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
                this.bigHotSaleAnimateUrl = picUrlArray;
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
       LiveRoomSignalMessage$ItemInfo timageUrl1;
       object oobject;
       String str = "";
       if (!(this.itemId).equals(str)) {
          p0.writeString(1, this.itemId);
       }
       LiveRoomSignalMessage$ItemInfo timageUrl = this.imageUrl;
       int i = 0;
       if (timageUrl != null && timageUrl.length > 0) {
          i1 = 0;
          timageUrl1 = this.imageUrl;
          while (i1 < timageUrl1.length) {
             oobject = timageUrl1[i1];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.title).equals(str)) {
          p0.writeString(3, this.title);
       }
       if (!(this.price).equals(str)) {
          p0.writeString(4, this.price);
       }
       timageUrl = this.showIcon;
       if (timageUrl != null && timageUrl.length > 0) {
          i1 = 0;
          timageUrl1 = this.showIcon;
          while (i1 < timageUrl1.length) {
             p0.writeUInt32(5, timageUrl1[i1]);
             i1 = i1 + 1;
          }
       }
       if (!(this.jumpUrl).equals(str)) {
          p0.writeString(6, this.jumpUrl);
       }
       timageUrl = this.saleType;
       if (timageUrl != null) {
          p0.writeUInt32(7, timageUrl);
       }
       if (!(this.extraMap).equals(str)) {
          p0.writeString(8, this.extraMap);
       }
       if (!(this.originPrice).equals(str)) {
          p0.writeString(9, this.originPrice);
       }
       if (!(this.pricePrefix).equals(str)) {
          p0.writeString(10, this.pricePrefix);
       }
       timageUrl = this.currency;
       if (timageUrl != null) {
          p0.writeInt32(11, timageUrl);
       }
       if (!(this.priceSuffix).equals(str)) {
          p0.writeString(12, this.priceSuffix);
       }
       timageUrl = this.itemUrlList;
       if (timageUrl != null && timageUrl.length > 0) {
          i1 = 0;
          timageUrl1 = this.itemUrlList;
          while (i1 < timageUrl1.length) {
             oobject = timageUrl1[i1];
             if (oobject != null) {
                p0.writeString(13, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.appletJumpUrl).equals(str)) {
          p0.writeString(14, this.appletJumpUrl);
       }
       timageUrl1 = this.saleEndTime;
       if (timageUrl1) {
          p0.writeUInt64(15, timageUrl1);
       }
       timageUrl = this.buyButtonUrlList;
       if (timageUrl != null && timageUrl.length > 0) {
          i1 = 0;
          timageUrl1 = this.buyButtonUrlList;
          while (i1 < timageUrl1.length) {
             oobject = timageUrl1[i1];
             if (oobject != null) {
                p0.writeString(16, oobject);
             }
             i1 = i1 + 1;
          }
       }
       timageUrl = this.buyButtonImageUrl;
       if (timageUrl != null && timageUrl.length > 0) {
          i1 = 0;
          timageUrl1 = this.buyButtonImageUrl;
          while (i1 < timageUrl1.length) {
             oobject = timageUrl1[i1];
             if (oobject != null) {
                p0.writeMessage(17, oobject);
             }
             i1 = i1 + 1;
          }
       }
       timageUrl = this.sourceType;
       if (timageUrl != null) {
          p0.writeUInt32(18, timageUrl);
       }
       if (!(this.buttonText).equals(str)) {
          p0.writeString(19, this.buttonText);
       }
       if (!(this.buttonDesc).equals(str)) {
          p0.writeString(20, this.buttonDesc);
       }
       timageUrl = this.itemCurrency;
       if (timageUrl != null) {
          p0.writeMessage(21, timageUrl);
       }
       if (!(this.smallHotSaleAnimatePics).equals(str)) {
          p0.writeString(22, this.smallHotSaleAnimatePics);
       }
       if (!(this.bigHotSaleAnimatePics).equals(str)) {
          p0.writeString(23, this.bigHotSaleAnimatePics);
       }
       timageUrl = this.smallHotSaleAnimateUrl;
       if (timageUrl != null && timageUrl.length > 0) {
          i1 = 0;
          LiveRoomSignalMessage$ItemInfo tsmallHotSal = this.smallHotSaleAnimateUrl;
          while (i1 < tsmallHotSal.length) {
             object oobject1 = tsmallHotSal[i1];
             if (oobject1 != null) {
                p0.writeMessage(24, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       timageUrl = this.bigHotSaleAnimateUrl;
       if (timageUrl != null && timageUrl.length > 0) {
          timageUrl = this.bigHotSaleAnimateUrl;
          while (i < timageUrl.length) {
             object oobject2 = timageUrl[i];
             if (oobject2 != null) {
                p0.writeMessage(25, oobject2);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
