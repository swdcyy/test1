package com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShow;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$TreasureBoxItem;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShowPage;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$MagicEffectsInfo;
import java.lang.System;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kuaishou.livestream.message.nano.LiveRedPackSkinMessage$RedPackSkinTheme;

public final class LiveTreasureBoxMessage$LiveTreasureBoxShow extends MessageNano	// class@0013ae
{
    public String appendDesc;
    public String appendRouteUrl;
    public int authorMaxAutoShowTimes;
    public boolean autoShow;
    public long autoShowTime;
    public int bizType;
    public int boxType;
    public String clickAvatarUrl;
    public UserInfos$PicUrl[] contributorHeadIcon;
    public UserInfos$UserInfo contributorInfo;
    public boolean disableAuthorAutoShow;
    public boolean disableDirectFollow;
    public boolean disableFollowShow;
    public boolean enableAppend;
    public boolean enableContributorDisplay;
    public Map extraMessage;
    public long grabTime;
    public String grabUrl;
    public LiveTreasureBoxMessage$TreasureBoxItem[] item;
    public LiveTreasureBoxMessage$MagicEffectsInfo magicEffects;
    public long queryReserveMaxDelayMs;
    public String redPackName;
    public long reserveRequestMaxDelayMs;
    public UserInfos$PicUrl[] shadowUrl;
    public long showDeadline;
    public LiveTreasureBoxMessage$LiveTreasureBoxShowPage[] showPage;
    public LiveRedPackSkinMessage$RedPackSkinTheme skinTheme;
    public long startShowPendantTime;
    public long startShowTime;
    public String tokenUrl;
    public String topLuckyUrl;
    public long totalKsCoin;
    public String treasureBoxId;
    public String unShowMessage;
    public UserInfos$UserInfo userInfo;
    public static LiveTreasureBoxMessage$LiveTreasureBoxShow[] _emptyArray;

    public void LiveTreasureBoxMessage$LiveTreasureBoxShow(){
       super();
       this.clear();
    }
    public static LiveTreasureBoxMessage$LiveTreasureBoxShow[] emptyArray(){
       if (LiveTreasureBoxMessage$LiveTreasureBoxShow._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveTreasureBoxMessage$LiveTreasureBoxShow._emptyArray == null) {
             LiveTreasureBoxMessage$LiveTreasureBoxShow[] liveTreasure = new LiveTreasureBoxMessage$LiveTreasureBoxShow[0];
             LiveTreasureBoxMessage$LiveTreasureBoxShow._emptyArray = liveTreasure;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveTreasureBoxMessage$LiveTreasureBoxShow._emptyArray;
    }
    public static LiveTreasureBoxMessage$LiveTreasureBoxShow parseFrom(CodedInputByteBufferNano p0){
       return new LiveTreasureBoxMessage$LiveTreasureBoxShow().mergeFrom(p0);
    }
    public static LiveTreasureBoxMessage$LiveTreasureBoxShow parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveTreasureBoxMessage$LiveTreasureBoxShow(), p0);
    }
    public LiveTreasureBoxMessage$LiveTreasureBoxShow clear(){
       this.treasureBoxId = "";
       this.bizType = 0;
       this.boxType = 0;
       this.skinTheme = null;
       this.item = LiveTreasureBoxMessage$TreasureBoxItem.emptyArray();
       this.totalKsCoin = 0;
       this.unShowMessage = "";
       this.showPage = LiveTreasureBoxMessage$LiveTreasureBoxShowPage.emptyArray();
       this.extraMessage = null;
       this.autoShow = false;
       this.showDeadline = 0;
       this.userInfo = null;
       this.grabTime = 0;
       this.startShowTime = 0;
       this.autoShowTime = 0;
       this.contributorInfo = null;
       this.enableContributorDisplay = false;
       this.shadowUrl = UserInfos$PicUrl.emptyArray();
       this.contributorHeadIcon = UserInfos$PicUrl.emptyArray();
       this.disableAuthorAutoShow = false;
       this.disableDirectFollow = false;
       this.authorMaxAutoShowTimes = 0;
       this.redPackName = "";
       this.startShowPendantTime = 0;
       this.disableFollowShow = false;
       this.magicEffects = null;
       this.enableAppend = false;
       this.appendDesc = "";
       this.appendRouteUrl = "";
       this.grabUrl = "";
       this.topLuckyUrl = "";
       this.tokenUrl = "";
       this.clickAvatarUrl = "";
       this.queryReserveMaxDelayMs = 0;
       this.reserveRequestMaxDelayMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       LiveTreasureBoxMessage$LiveTreasureBoxShow titem;
       object oobject;
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.treasureBoxId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.treasureBoxId);
       }
       LiveTreasureBoxMessage$LiveTreasureBoxShow tbizType = this.bizType;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tbizType);
       }
       tbizType = this.boxType;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tbizType);
       }
       tbizType = this.skinTheme;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tbizType);
       }
       tbizType = this.item;
       int i1 = 0;
       if (tbizType != null && tbizType.length > 0) {
          i2 = 0;
          titem = this.item;
          while (i2 < titem.length) {
             oobject = titem[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i2 = i2 + 1;
          }
       }
       titem = this.totalKsCoin;
       if (titem) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, titem);
       }
       if (!(this.unShowMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.unShowMessage);
       }
       tbizType = this.showPage;
       if (tbizType != null && tbizType.length > 0) {
          i2 = 0;
          titem = this.showPage;
          while (i2 < titem.length) {
             oobject = titem[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(8, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tbizType = this.extraMessage;
       if (tbizType != null) {
          i = i + InternalNano.computeMapFieldSize(tbizType, 9, 9, 9);
       }
       tbizType = this.autoShow;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, tbizType);
       }
       titem = this.showDeadline;
       if (titem) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, titem);
       }
       tbizType = this.userInfo;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(12, tbizType);
       }
       titem = this.grabTime;
       if (titem) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(13, titem);
       }
       titem = this.startShowTime;
       if (titem) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(14, titem);
       }
       titem = this.autoShowTime;
       if (titem) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(15, titem);
       }
       tbizType = this.contributorInfo;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(16, tbizType);
       }
       tbizType = this.enableContributorDisplay;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(17, tbizType);
       }
       tbizType = this.shadowUrl;
       if (tbizType != null && tbizType.length > 0) {
          i2 = 0;
          titem = this.shadowUrl;
          while (i2 < titem.length) {
             oobject = titem[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(18, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tbizType = this.contributorHeadIcon;
       if (tbizType != null && tbizType.length > 0) {
          tbizType = this.contributorHeadIcon;
          while (i1 < tbizType.length) {
             object oobject1 = tbizType[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(19, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tbizType = this.disableAuthorAutoShow;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(20, tbizType);
       }
       tbizType = this.disableDirectFollow;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(21, tbizType);
       }
       tbizType = this.authorMaxAutoShowTimes;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(22, tbizType);
       }
       if (!(this.redPackName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(23, this.redPackName);
       }
       LiveTreasureBoxMessage$LiveTreasureBoxShow tstartShowPe = this.startShowPendantTime;
       if (tstartShowPe) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(24, tstartShowPe);
       }
       tbizType = this.disableFollowShow;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(25, tbizType);
       }
       tbizType = this.magicEffects;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(26, tbizType);
       }
       tbizType = this.enableAppend;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(27, tbizType);
       }
       if (!(this.appendDesc).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(28, this.appendDesc);
       }
       if (!(this.appendRouteUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(29, this.appendRouteUrl);
       }
       if (!(this.grabUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(30, this.grabUrl);
       }
       if (!(this.topLuckyUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(31, this.topLuckyUrl);
       }
       if (!(this.tokenUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(32, this.tokenUrl);
       }
       if (!(this.clickAvatarUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(33, this.clickAvatarUrl);
       }
       tbizType = this.queryReserveMaxDelayMs;
       if (tbizType) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(34, tbizType);
       }
       tbizType = this.reserveRequestMaxDelayMs;
       if (tbizType) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(35, tbizType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveTreasureBoxMessage$LiveTreasureBoxShow mergeFrom(CodedInputByteBufferNano p0){
       LiveTreasureBoxMessage$LiveTreasureBoxShow titem;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                this.treasureBoxId = p0.readString();
                break;
              case 16:
                this.bizType = p0.readUInt32();
                break;
              case 24:
                this.boxType = p0.readUInt32();
                break;
              case '"':
                if (this.skinTheme == null) {
                   this.skinTheme = new LiveRedPackSkinMessage$RedPackSkinTheme();
                }
                p0.readMessage(this.skinTheme);
                break;
              case '*':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 42);
                titem = this.item;
                i2 = (titem == null)? 0: titem.length;
                i = i + i2;
                LiveTreasureBoxMessage$TreasureBoxItem[] treasureBoxI = new LiveTreasureBoxMessage$TreasureBoxItem[i];
                if (i2) {
                   System.arraycopy(titem, i1, treasureBoxI, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   treasureBoxI[i2] = new LiveTreasureBoxMessage$TreasureBoxItem();
                   p0.readMessage(treasureBoxI[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                treasureBoxI[i2] = new LiveTreasureBoxMessage$TreasureBoxItem();
                p0.readMessage(treasureBoxI[i2]);
                this.item = treasureBoxI;
                break;
              case '0':
                this.totalKsCoin = p0.readUInt64();
                break;
              case ':':
                this.unShowMessage = p0.readString();
                break;
              case 'B':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 66);
                titem = this.showPage;
                i2 = (titem == null)? 0: titem.length;
                i = i + i2;
                LiveTreasureBoxMessage$LiveTreasureBoxShowPage[] liveTreasure = new LiveTreasureBoxMessage$LiveTreasureBoxShowPage[i];
                if (i2) {
                   System.arraycopy(titem, i1, liveTreasure, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveTreasure[i2] = new LiveTreasureBoxMessage$LiveTreasureBoxShowPage();
                   p0.readMessage(liveTreasure[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveTreasure[i2] = new LiveTreasureBoxMessage$LiveTreasureBoxShowPage();
                p0.readMessage(liveTreasure[i2]);
                this.showPage = liveTreasure;
                break;
              case 'J':
                this.extraMessage = InternalNano.mergeMapEntry(p0, this.extraMessage, mapFactory, 9, 9, null, 10, 18);
                break;
              case 'P':
                this.autoShow = p0.readBool();
                break;
              case 'X':
                this.showDeadline = p0.readUInt64();
                break;
              case 'b':
                if (this.userInfo == null) {
                   this.userInfo = new UserInfos$UserInfo();
                }
                p0.readMessage(this.userInfo);
                break;
              case 'h':
                this.grabTime = p0.readInt64();
                break;
              case 'p':
                this.startShowTime = p0.readInt64();
                break;
              case 'x':
                this.autoShowTime = p0.readInt64();
                break;
              case 130:
                if (this.contributorInfo == null) {
                   this.contributorInfo = new UserInfos$UserInfo();
                }
                p0.readMessage(this.contributorInfo);
                break;
              case 136:
                this.enableContributorDisplay = p0.readBool();
                break;
              case 146:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 146);
                titem = this.shadowUrl;
                i2 = (titem == null)? 0: titem.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(titem, i1, picUrlArray, i1, i2);
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
                this.shadowUrl = picUrlArray;
                break;
              case 154:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 154);
                titem = this.contributorHeadIcon;
                i2 = (titem == null)? 0: titem.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(titem, i1, picUrlArray, i1, i2);
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
                this.contributorHeadIcon = picUrlArray;
                break;
              case 160:
                this.disableAuthorAutoShow = p0.readBool();
                break;
              case 168:
                this.disableDirectFollow = p0.readBool();
                break;
              case 176:
                this.authorMaxAutoShowTimes = p0.readUInt32();
                break;
              case 186:
                this.redPackName = p0.readString();
                break;
              case 192:
                this.startShowPendantTime = p0.readUInt64();
                break;
              case 200:
                this.disableFollowShow = p0.readBool();
                break;
              case 210:
                if (this.magicEffects == null) {
                   this.magicEffects = new LiveTreasureBoxMessage$MagicEffectsInfo();
                }
                p0.readMessage(this.magicEffects);
                break;
              case 216:
                this.enableAppend = p0.readBool();
                break;
              case 226:
                this.appendDesc = p0.readString();
                break;
              case 234:
                this.appendRouteUrl = p0.readString();
                break;
              case 242:
                this.grabUrl = p0.readString();
                break;
              case 250:
                this.topLuckyUrl = p0.readString();
                break;
              case 258:
                this.tokenUrl = p0.readString();
                break;
              case 266:
                this.clickAvatarUrl = p0.readString();
                break;
              case 272:
                this.queryReserveMaxDelayMs = p0.readUInt64();
                break;
              case 280:
                this.reserveRequestMaxDelayMs = p0.readUInt64();
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
       LiveTreasureBoxMessage$LiveTreasureBoxShow titem;
       object oobject;
       String str = "";
       if (!(this.treasureBoxId).equals(str)) {
          p0.writeString(1, this.treasureBoxId);
       }
       LiveTreasureBoxMessage$LiveTreasureBoxShow tbizType = this.bizType;
       if (tbizType != null) {
          p0.writeUInt32(2, tbizType);
       }
       tbizType = this.boxType;
       if (tbizType != null) {
          p0.writeUInt32(3, tbizType);
       }
       tbizType = this.skinTheme;
       if (tbizType != null) {
          p0.writeMessage(4, tbizType);
       }
       tbizType = this.item;
       int i = 0;
       if (tbizType != null && tbizType.length > 0) {
          i1 = 0;
          titem = this.item;
          while (i1 < titem.length) {
             oobject = titem[i1];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       titem = this.totalKsCoin;
       if (titem) {
          p0.writeUInt64(6, titem);
       }
       if (!(this.unShowMessage).equals(str)) {
          p0.writeString(7, this.unShowMessage);
       }
       tbizType = this.showPage;
       if (tbizType != null && tbizType.length > 0) {
          i1 = 0;
          titem = this.showPage;
          while (i1 < titem.length) {
             oobject = titem[i1];
             if (oobject != null) {
                p0.writeMessage(8, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tbizType = this.extraMessage;
       if (tbizType != null) {
          InternalNano.serializeMapField(p0, tbizType, 9, 9, 9);
       }
       tbizType = this.autoShow;
       if (tbizType != null) {
          p0.writeBool(10, tbizType);
       }
       titem = this.showDeadline;
       if (titem) {
          p0.writeUInt64(11, titem);
       }
       tbizType = this.userInfo;
       if (tbizType != null) {
          p0.writeMessage(12, tbizType);
       }
       titem = this.grabTime;
       if (titem) {
          p0.writeInt64(13, titem);
       }
       titem = this.startShowTime;
       if (titem) {
          p0.writeInt64(14, titem);
       }
       titem = this.autoShowTime;
       if (titem) {
          p0.writeInt64(15, titem);
       }
       tbizType = this.contributorInfo;
       if (tbizType != null) {
          p0.writeMessage(16, tbizType);
       }
       tbizType = this.enableContributorDisplay;
       if (tbizType != null) {
          p0.writeBool(17, tbizType);
       }
       tbizType = this.shadowUrl;
       if (tbizType != null && tbizType.length > 0) {
          i1 = 0;
          titem = this.shadowUrl;
          while (i1 < titem.length) {
             oobject = titem[i1];
             if (oobject != null) {
                p0.writeMessage(18, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tbizType = this.contributorHeadIcon;
       if (tbizType != null && tbizType.length > 0) {
          tbizType = this.contributorHeadIcon;
          while (i < tbizType.length) {
             object oobject1 = tbizType[i];
             if (oobject1 != null) {
                p0.writeMessage(19, oobject1);
             }
             i = i + 1;
          }
       }
       tbizType = this.disableAuthorAutoShow;
       if (tbizType != null) {
          p0.writeBool(20, tbizType);
       }
       tbizType = this.disableDirectFollow;
       if (tbizType != null) {
          p0.writeBool(21, tbizType);
       }
       tbizType = this.authorMaxAutoShowTimes;
       if (tbizType != null) {
          p0.writeUInt32(22, tbizType);
       }
       if (!(this.redPackName).equals(str)) {
          p0.writeString(23, this.redPackName);
       }
       LiveTreasureBoxMessage$LiveTreasureBoxShow tstartShowPe = this.startShowPendantTime;
       if (tstartShowPe) {
          p0.writeUInt64(24, tstartShowPe);
       }
       tbizType = this.disableFollowShow;
       if (tbizType != null) {
          p0.writeBool(25, tbizType);
       }
       tbizType = this.magicEffects;
       if (tbizType != null) {
          p0.writeMessage(26, tbizType);
       }
       tbizType = this.enableAppend;
       if (tbizType != null) {
          p0.writeBool(27, tbizType);
       }
       if (!(this.appendDesc).equals(str)) {
          p0.writeString(28, this.appendDesc);
       }
       if (!(this.appendRouteUrl).equals(str)) {
          p0.writeString(29, this.appendRouteUrl);
       }
       if (!(this.grabUrl).equals(str)) {
          p0.writeString(30, this.grabUrl);
       }
       if (!(this.topLuckyUrl).equals(str)) {
          p0.writeString(31, this.topLuckyUrl);
       }
       if (!(this.tokenUrl).equals(str)) {
          p0.writeString(32, this.tokenUrl);
       }
       if (!(this.clickAvatarUrl).equals(str)) {
          p0.writeString(33, this.clickAvatarUrl);
       }
       tbizType = this.queryReserveMaxDelayMs;
       if (tbizType) {
          p0.writeUInt64(34, tbizType);
       }
       tbizType = this.reserveRequestMaxDelayMs;
       if (tbizType) {
          p0.writeUInt64(35, tbizType);
       }
       super.writeTo(p0);
       return;
    }
}
