package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$GatherPopularityItemInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.System;

public final class LiveRoomSignalMessage$GatherPopularityItemInfo extends MessageNano	// class@001c4a
{
    public String desc;
    public UserInfos$PicUrl[] imageUrl;
    public boolean isLive;
    public String itemId;
    public String[] itemUrlList;
    public String jumpUrl;
    public String price;
    public String priceDesc;
    public UserInfos$PicUrl[] tagCdnUrl;
    public String tagImageUrl;
    public String title;
    public static LiveRoomSignalMessage$GatherPopularityItemInfo[] _emptyArray;

    public void LiveRoomSignalMessage$GatherPopularityItemInfo(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$GatherPopularityItemInfo[] emptyArray(){
       if (LiveRoomSignalMessage$GatherPopularityItemInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$GatherPopularityItemInfo._emptyArray == null) {
             LiveRoomSignalMessage$GatherPopularityItemInfo[] gatherPopula = new LiveRoomSignalMessage$GatherPopularityItemInfo[0];
             LiveRoomSignalMessage$GatherPopularityItemInfo._emptyArray = gatherPopula;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$GatherPopularityItemInfo._emptyArray;
    }
    public static LiveRoomSignalMessage$GatherPopularityItemInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$GatherPopularityItemInfo().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$GatherPopularityItemInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$GatherPopularityItemInfo(), p0);
    }
    public LiveRoomSignalMessage$GatherPopularityItemInfo clear(){
       this.imageUrl = UserInfos$PicUrl.emptyArray();
       this.title = "";
       this.price = "";
       this.desc = "";
       this.itemId = "";
       this.priceDesc = "";
       this.isLive = false;
       this.jumpUrl = "";
       this.itemUrlList = WireFormatNano.EMPTY_STRING_ARRAY;
       this.tagImageUrl = "";
       this.tagCdnUrl = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i3;
       int i = super.computeSerializedSize();
       LiveRoomSignalMessage$GatherPopularityItemInfo timageUrl = this.imageUrl;
       int i1 = 0;
       int i2 = 1;
       if (timageUrl != null && timageUrl.length > 0) {
          i3 = 0;
          LiveRoomSignalMessage$GatherPopularityItemInfo timageUrl1 = this.imageUrl;
          while (i3 < timageUrl1.length) {
             object oobject = timageUrl1[i3];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(i2, oobject);
             }
             i3 = i3 + 1;
          }
       }
       if (!(this.title).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.title);
       }
       if (!(this.price).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.price);
       }
       if (!(this.desc).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.desc);
       }
       if (!(this.itemId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.itemId);
       }
       if (!(this.priceDesc).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.priceDesc);
       }
       timageUrl = this.isLive;
       if (timageUrl != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, timageUrl);
       }
       if (!(this.jumpUrl).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.jumpUrl);
       }
       timageUrl = this.itemUrlList;
       if (timageUrl != null && timageUrl.length > 0) {
          i3 = 0;
          int i4 = 0;
          int i5 = 0;
          LiveRoomSignalMessage$GatherPopularityItemInfo titemUrlList = this.itemUrlList;
          while (i3 < titemUrlList.length) {
             object oobject1 = titemUrlList[i3];
             if (oobject1 != null) {
                i5 = i5 + 1;
                i4 = i4 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject1);
             }
             i3 = i3 + 1;
          }
          i = (i + i4) + (i5 * 1);
       }
       if (!(this.tagImageUrl).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.tagImageUrl);
       }
       timageUrl = this.tagCdnUrl;
       if (timageUrl != null && timageUrl.length > 0) {
          timageUrl = this.tagCdnUrl;
          while (i1 < timageUrl.length) {
             object oobject2 = timageUrl[i1];
             if (oobject2 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(11, oobject2);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$GatherPopularityItemInfo mergeFrom(CodedInputByteBufferNano p0){
       LiveRoomSignalMessage$GatherPopularityItemInfo timageUrl;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 10);
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
              case 18:
                this.title = p0.readString();
                break;
              case 26:
                this.price = p0.readString();
                break;
              case '"':
                this.desc = p0.readString();
                break;
              case '*':
                this.itemId = p0.readString();
                break;
              case '2':
                this.priceDesc = p0.readString();
                break;
              case '8':
                this.isLive = p0.readBool();
                break;
              case 'B':
                this.jumpUrl = p0.readString();
                break;
              case 'J':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 74);
                timageUrl = this.itemUrlList;
                i2 = (timageUrl == null)? 0: timageUrl.length;
                i = i + i2;
                String[] stringArray = new String[i];
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
              case 'R':
                this.tagImageUrl = p0.readString();
                break;
              case 'Z':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 90);
                timageUrl = this.tagCdnUrl;
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
                this.tagCdnUrl = picUrlArray;
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
       LiveRoomSignalMessage$GatherPopularityItemInfo timageUrl = this.imageUrl;
       int i = 0;
       if (timageUrl != null && timageUrl.length > 0) {
          i1 = 0;
          LiveRoomSignalMessage$GatherPopularityItemInfo timageUrl1 = this.imageUrl;
          while (i1 < timageUrl1.length) {
             object oobject = timageUrl1[i1];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       String str = "";
       if (!(this.title).equals(str)) {
          p0.writeString(2, this.title);
       }
       if (!(this.price).equals(str)) {
          p0.writeString(3, this.price);
       }
       if (!(this.desc).equals(str)) {
          p0.writeString(4, this.desc);
       }
       if (!(this.itemId).equals(str)) {
          p0.writeString(5, this.itemId);
       }
       if (!(this.priceDesc).equals(str)) {
          p0.writeString(6, this.priceDesc);
       }
       timageUrl = this.isLive;
       if (timageUrl != null) {
          p0.writeBool(7, timageUrl);
       }
       if (!(this.jumpUrl).equals(str)) {
          p0.writeString(8, this.jumpUrl);
       }
       timageUrl = this.itemUrlList;
       if (timageUrl != null && timageUrl.length > 0) {
          i1 = 0;
          LiveRoomSignalMessage$GatherPopularityItemInfo titemUrlList = this.itemUrlList;
          while (i1 < titemUrlList.length) {
             object oobject1 = titemUrlList[i1];
             if (oobject1 != null) {
                p0.writeString(9, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.tagImageUrl).equals(str)) {
          p0.writeString(10, this.tagImageUrl);
       }
       timageUrl = this.tagCdnUrl;
       if (timageUrl != null && timageUrl.length > 0) {
          timageUrl = this.tagCdnUrl;
          while (i < timageUrl.length) {
             object oobject2 = timageUrl[i];
             if (oobject2 != null) {
                p0.writeMessage(11, oobject2);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
