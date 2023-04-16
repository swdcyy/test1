package com.kuaishou.protobuf.livestream.nano.LiveOverRoomMessageDisplayInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import java.lang.System;

public final class LiveOverRoomMessageDisplayInfo extends MessageNano	// class@000cd0
{
    public long backgroundDuration;
    public String[] backgroundWebp;
    public String[] backgroundWebpV2;
    public int bizTypeValue;
    public String broadcastInfo;
    public String defaultPreloadAfterFileName;
    public String defaultPreloadBeforeFileName;
    public long displayDuration;
    public String displayText;
    public int displayType;
    public String[] displayUrl;
    public boolean enableBackgroundWebpV2;
    public boolean enableDisplayLiveIcon;
    public boolean enableHeadIconInCircle;
    public boolean enablePreload;
    public String exptag;
    public Map extraMessage;
    public UserInfos$PicUrl[] headUrl;
    public String[] iconUrl;
    public String link;
    public String linkV2;
    public String noticeText;
    public String preloadAfterFileName;
    public String preloadBeforeFileName;
    public String serverExpTag;
    public String toLiveStreamId;
    public String userName;
    public static LiveOverRoomMessageDisplayInfo[] _emptyArray;

    public void LiveOverRoomMessageDisplayInfo(){
       super();
       this.clear();
    }
    public static LiveOverRoomMessageDisplayInfo[] emptyArray(){
       if (LiveOverRoomMessageDisplayInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveOverRoomMessageDisplayInfo._emptyArray == null) {
             LiveOverRoomMessageDisplayInfo[] liveOverRoom = new LiveOverRoomMessageDisplayInfo[0];
             LiveOverRoomMessageDisplayInfo._emptyArray = liveOverRoom;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveOverRoomMessageDisplayInfo._emptyArray;
    }
    public static LiveOverRoomMessageDisplayInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveOverRoomMessageDisplayInfo().mergeFrom(p0);
    }
    public static LiveOverRoomMessageDisplayInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveOverRoomMessageDisplayInfo(), p0);
    }
    public LiveOverRoomMessageDisplayInfo clear(){
       this.displayType = 0;
       String[] eMPTY_STRING = WireFormatNano.EMPTY_STRING_ARRAY;
       this.displayUrl = eMPTY_STRING;
       this.displayText = "";
       this.displayDuration = 0;
       this.iconUrl = eMPTY_STRING;
       this.noticeText = "";
       this.backgroundWebp = eMPTY_STRING;
       this.backgroundDuration = 0;
       this.link = "";
       this.userName = "";
       this.exptag = "";
       this.toLiveStreamId = "";
       this.broadcastInfo = "";
       this.bizTypeValue = 0;
       this.serverExpTag = "";
       this.extraMessage = null;
       this.enableDisplayLiveIcon = false;
       this.linkV2 = "";
       this.enableHeadIconInCircle = false;
       this.headUrl = UserInfos$PicUrl.emptyArray();
       this.backgroundWebpV2 = eMPTY_STRING;
       this.enableBackgroundWebpV2 = false;
       this.enablePreload = false;
       this.preloadBeforeFileName = "";
       this.defaultPreloadBeforeFileName = "";
       this.preloadAfterFileName = "";
       this.defaultPreloadAfterFileName = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i3;
       int i5;
       int i6;
       LiveOverRoomMessageDisplayInfo ticonUrl;
       object oobject1;
       int i = super.computeSerializedSize();
       LiveOverRoomMessageDisplayInfo tdisplayType = this.displayType;
       int i1 = 1;
       if (tdisplayType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(i1, tdisplayType);
       }
       tdisplayType = this.displayUrl;
       int i2 = 0;
       if (tdisplayType != null && tdisplayType.length > 0) {
          i3 = 0;
          int i4 = 0;
          i5 = 0;
          LiveOverRoomMessageDisplayInfo tdisplayUrl = this.displayUrl;
          while (i3 < tdisplayUrl.length) {
             object oobject = tdisplayUrl[i3];
             if (oobject != null) {
                i5 = i5 + 1;
                i4 = i4 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i3 = i3 + 1;
          }
          i = (i + i4) + (i5 * 1);
       }
       if (!(this.displayText).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.displayText);
       }
       LiveOverRoomMessageDisplayInfo tdisplayDura = this.displayDuration;
       if (tdisplayDura) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tdisplayDura);
       }
       tdisplayType = this.iconUrl;
       if (tdisplayType != null && tdisplayType.length > 0) {
          i3 = 0;
          i5 = 0;
          i6 = 0;
          ticonUrl = this.iconUrl;
          while (i3 < ticonUrl.length) {
             oobject1 = ticonUrl[i3];
             if (oobject1 != null) {
                i6 = i6 + 1;
                i5 = i5 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject1);
             }
             i3 = i3 + 1;
          }
          i = (i + i5) + (i6 * 1);
       }
       if (!(this.noticeText).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.noticeText);
       }
       tdisplayType = this.backgroundWebp;
       if (tdisplayType != null && tdisplayType.length > 0) {
          i3 = 0;
          i5 = 0;
          i6 = 0;
          ticonUrl = this.backgroundWebp;
          while (i3 < ticonUrl.length) {
             oobject1 = ticonUrl[i3];
             if (oobject1 != null) {
                i6 = i6 + 1;
                i5 = i5 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject1);
             }
             i3 = i3 + 1;
          }
          i = (i + i5) + (i6 * 1);
       }
       tdisplayType = this.backgroundDuration;
       if (tdisplayType) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tdisplayType);
       }
       i1 = 9;
       if (!(this.link).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(i1, this.link);
       }
       if (!(this.userName).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.userName);
       }
       if (!(this.exptag).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.exptag);
       }
       if (!(this.toLiveStreamId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.toLiveStreamId);
       }
       if (!(this.broadcastInfo).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.broadcastInfo);
       }
       tdisplayType = this.bizTypeValue;
       if (tdisplayType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(14, tdisplayType);
       }
       if (!(this.serverExpTag).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.serverExpTag);
       }
       tdisplayType = this.extraMessage;
       if (tdisplayType != null) {
          i = i + InternalNano.computeMapFieldSize(tdisplayType, 16, i1, i1);
       }
       tdisplayType = this.enableDisplayLiveIcon;
       if (tdisplayType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(17, tdisplayType);
       }
       if (!(this.linkV2).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(18, this.linkV2);
       }
       tdisplayType = this.enableHeadIconInCircle;
       if (tdisplayType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(19, tdisplayType);
       }
       tdisplayType = this.headUrl;
       if (tdisplayType != null && tdisplayType.length > 0) {
          i3 = 0;
          LiveOverRoomMessageDisplayInfo theadUrl = this.headUrl;
          while (i3 < theadUrl.length) {
             object oobject2 = theadUrl[i3];
             if (oobject2 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(20, oobject2);
             }
             i3 = i3 + 1;
          }
       }
       tdisplayType = this.backgroundWebpV2;
       if (tdisplayType != null && tdisplayType.length > 0) {
          i3 = 0;
          i1 = 0;
          tdisplayDura = this.backgroundWebpV2;
          while (i2 < tdisplayDura.length) {
             object oobject3 = tdisplayDura[i2];
             if (oobject3 != null) {
                i1 = i1 + 1;
                i3 = i3 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject3);
             }
             i2 = i2 + 1;
          }
          i = (i + i3) + (i1 * 2);
       }
       tdisplayType = this.enableBackgroundWebpV2;
       if (tdisplayType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(22, tdisplayType);
       }
       tdisplayType = this.enablePreload;
       if (tdisplayType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(23, tdisplayType);
       }
       if (!(this.preloadBeforeFileName).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(24, this.preloadBeforeFileName);
       }
       if (!(this.defaultPreloadBeforeFileName).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(25, this.defaultPreloadBeforeFileName);
       }
       if (!(this.preloadAfterFileName).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(26, this.preloadAfterFileName);
       }
       if (!(this.defaultPreloadAfterFileName).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(27, this.defaultPreloadAfterFileName);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveOverRoomMessageDisplayInfo mergeFrom(CodedInputByteBufferNano p0){
       LiveOverRoomMessageDisplayInfo tdisplayUrl;
       int i2;
       String[] stringArray;
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 8:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.displayType = i;
                }
                break;
              case 18:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 18);
                tdisplayUrl = this.displayUrl;
                i2 = (tdisplayUrl == null)? 0: tdisplayUrl.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tdisplayUrl, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.displayUrl = stringArray;
                break;
              case 26:
                this.displayText = p0.readString();
                break;
              case 32:
                this.displayDuration = p0.readUInt64();
                break;
              case '*':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 42);
                tdisplayUrl = this.iconUrl;
                i2 = (tdisplayUrl == null)? 0: tdisplayUrl.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tdisplayUrl, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.iconUrl = stringArray;
                break;
              case '2':
                this.noticeText = p0.readString();
                break;
              case ':':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 58);
                tdisplayUrl = this.backgroundWebp;
                i2 = (tdisplayUrl == null)? 0: tdisplayUrl.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tdisplayUrl, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.backgroundWebp = stringArray;
                break;
              case '@':
                this.backgroundDuration = p0.readUInt64();
                break;
              case 'J':
                this.link = p0.readString();
                break;
              case 'R':
                this.userName = p0.readString();
                break;
              case 'Z':
                this.exptag = p0.readString();
                break;
              case 'b':
                this.toLiveStreamId = p0.readString();
                break;
              case 'j':
                this.broadcastInfo = p0.readString();
                break;
              case 'p':
                this.bizTypeValue = p0.readUInt32();
                break;
              case 'z':
                this.serverExpTag = p0.readString();
                break;
              case 130:
                this.extraMessage = InternalNano.mergeMapEntry(p0, this.extraMessage, mapFactory, 9, 9, null, 10, 18);
                break;
              case 136:
                this.enableDisplayLiveIcon = p0.readBool();
                break;
              case 146:
                this.linkV2 = p0.readString();
                break;
              case 152:
                this.enableHeadIconInCircle = p0.readBool();
                break;
              case 162:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 162);
                tdisplayUrl = this.headUrl;
                i2 = (tdisplayUrl == null)? 0: tdisplayUrl.length;
                i = i + i2;
                UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tdisplayUrl, i1, picUrlArray, i1, i2);
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
                this.headUrl = picUrlArray;
                break;
              case 170:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 170);
                tdisplayUrl = this.backgroundWebpV2;
                i2 = (tdisplayUrl == null)? 0: tdisplayUrl.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tdisplayUrl, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.backgroundWebpV2 = stringArray;
                break;
              case 176:
                this.enableBackgroundWebpV2 = p0.readBool();
                break;
              case 184:
                this.enablePreload = p0.readBool();
                break;
              case 194:
                this.preloadBeforeFileName = p0.readString();
                break;
              case 202:
                this.defaultPreloadBeforeFileName = p0.readString();
                break;
              case 210:
                this.preloadAfterFileName = p0.readString();
                break;
              case 218:
                this.defaultPreloadAfterFileName = p0.readString();
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
       object oobject1;
       LiveOverRoomMessageDisplayInfo tdisplayType = this.displayType;
       if (tdisplayType != null) {
          p0.writeInt32(1, tdisplayType);
       }
       tdisplayType = this.displayUrl;
       int i = 0;
       if (tdisplayType != null && tdisplayType.length > 0) {
          i1 = 0;
          LiveOverRoomMessageDisplayInfo tdisplayUrl = this.displayUrl;
          while (i1 < tdisplayUrl.length) {
             object oobject = tdisplayUrl[i1];
             if (oobject != null) {
                p0.writeString(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.displayText).equals("")) {
          p0.writeString(3, this.displayText);
       }
       LiveOverRoomMessageDisplayInfo tdisplayDura = this.displayDuration;
       if (tdisplayDura) {
          p0.writeUInt64(4, tdisplayDura);
       }
       tdisplayType = this.iconUrl;
       if (tdisplayType != null && tdisplayType.length > 0) {
          i1 = 0;
          tdisplayDura = this.iconUrl;
          while (i1 < tdisplayDura.length) {
             oobject1 = tdisplayDura[i1];
             if (oobject1 != null) {
                p0.writeString(5, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.noticeText).equals("")) {
          p0.writeString(6, this.noticeText);
       }
       tdisplayType = this.backgroundWebp;
       if (tdisplayType != null && tdisplayType.length > 0) {
          i1 = 0;
          tdisplayDura = this.backgroundWebp;
          while (i1 < tdisplayDura.length) {
             oobject1 = tdisplayDura[i1];
             if (oobject1 != null) {
                p0.writeString(7, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tdisplayDura = this.backgroundDuration;
       if (tdisplayDura) {
          p0.writeUInt64(8, tdisplayDura);
       }
       int i2 = 9;
       if (!(this.link).equals("")) {
          p0.writeString(i2, this.link);
       }
       if (!(this.userName).equals("")) {
          p0.writeString(10, this.userName);
       }
       if (!(this.exptag).equals("")) {
          p0.writeString(11, this.exptag);
       }
       if (!(this.toLiveStreamId).equals("")) {
          p0.writeString(12, this.toLiveStreamId);
       }
       if (!(this.broadcastInfo).equals("")) {
          p0.writeString(13, this.broadcastInfo);
       }
       tdisplayType = this.bizTypeValue;
       if (tdisplayType != null) {
          p0.writeUInt32(14, tdisplayType);
       }
       if (!(this.serverExpTag).equals("")) {
          p0.writeString(15, this.serverExpTag);
       }
       tdisplayType = this.extraMessage;
       if (tdisplayType != null) {
          InternalNano.serializeMapField(p0, tdisplayType, 16, i2, i2);
       }
       tdisplayType = this.enableDisplayLiveIcon;
       if (tdisplayType != null) {
          p0.writeBool(17, tdisplayType);
       }
       if (!(this.linkV2).equals("")) {
          p0.writeString(18, this.linkV2);
       }
       tdisplayType = this.enableHeadIconInCircle;
       if (tdisplayType != null) {
          p0.writeBool(19, tdisplayType);
       }
       tdisplayType = this.headUrl;
       if (tdisplayType != null && tdisplayType.length > 0) {
          i1 = 0;
          tdisplayDura = this.headUrl;
          while (i1 < tdisplayDura.length) {
             oobject1 = tdisplayDura[i1];
             if (oobject1 != null) {
                p0.writeMessage(20, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tdisplayType = this.backgroundWebpV2;
       if (tdisplayType != null && tdisplayType.length > 0) {
          tdisplayType = this.backgroundWebpV2;
          while (i < tdisplayType.length) {
             object oobject2 = tdisplayType[i];
             if (oobject2 != null) {
                p0.writeString(21, oobject2);
             }
             i = i + 1;
          }
       }
       tdisplayType = this.enableBackgroundWebpV2;
       if (tdisplayType != null) {
          p0.writeBool(22, tdisplayType);
       }
       tdisplayType = this.enablePreload;
       if (tdisplayType != null) {
          p0.writeBool(23, tdisplayType);
       }
       if (!(this.preloadBeforeFileName).equals("")) {
          p0.writeString(24, this.preloadBeforeFileName);
       }
       if (!(this.defaultPreloadBeforeFileName).equals("")) {
          p0.writeString(25, this.defaultPreloadBeforeFileName);
       }
       if (!(this.preloadAfterFileName).equals("")) {
          p0.writeString(26, this.preloadAfterFileName);
       }
       if (!(this.defaultPreloadAfterFileName).equals("")) {
          p0.writeString(27, this.defaultPreloadAfterFileName);
       }
       super.writeTo(p0);
       return;
    }
}
