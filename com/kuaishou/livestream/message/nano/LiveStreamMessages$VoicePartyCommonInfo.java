package com.kuaishou.livestream.message.nano.LiveStreamMessages$VoicePartyCommonInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$DynamicBackground;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$VoicePartyChannelInfo;
import java.lang.System;

public final class LiveStreamMessages$VoicePartyCommonInfo extends MessageNano	// class@001388
{
    public String abParams;
    public int aboardType;
    public UserInfos$PicUrl[] backgroundPicUrl;
    public String caption;
    public LiveStreamMessages$VoicePartyChannelInfo channelInfo;
    public LiveStreamMessages$DynamicBackground dynamicBackground;
    public boolean enableAboardControl;
    public boolean enablePortraitVideo;
    public long groupId;
    public boolean isFansFreeAboard;
    public boolean isLastGridChatOpenVideo;
    public boolean isOpenVideo;
    public String rule;
    public String topic;
    public long version;
    public static LiveStreamMessages$VoicePartyCommonInfo[] _emptyArray;

    public void LiveStreamMessages$VoicePartyCommonInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$VoicePartyCommonInfo[] emptyArray(){
       if (LiveStreamMessages$VoicePartyCommonInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$VoicePartyCommonInfo._emptyArray == null) {
             LiveStreamMessages$VoicePartyCommonInfo[] voicePartyCo = new LiveStreamMessages$VoicePartyCommonInfo[0];
             LiveStreamMessages$VoicePartyCommonInfo._emptyArray = voicePartyCo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$VoicePartyCommonInfo._emptyArray;
    }
    public static LiveStreamMessages$VoicePartyCommonInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$VoicePartyCommonInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$VoicePartyCommonInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$VoicePartyCommonInfo(), p0);
    }
    public LiveStreamMessages$VoicePartyCommonInfo clear(){
       this.rule = "";
       this.topic = "";
       this.backgroundPicUrl = UserInfos$PicUrl.emptyArray();
       this.isOpenVideo = false;
       this.channelInfo = null;
       this.caption = "";
       this.aboardType = 0;
       this.enableAboardControl = false;
       this.enablePortraitVideo = false;
       this.groupId = 0;
       this.abParams = "";
       this.dynamicBackground = null;
       this.isFansFreeAboard = false;
       this.isLastGridChatOpenVideo = false;
       this.version = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       LiveStreamMessages$VoicePartyCommonInfo tbackgroundP1;
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.rule).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.rule);
       }
       if (!(this.topic).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.topic);
       }
       LiveStreamMessages$VoicePartyCommonInfo tbackgroundP = this.backgroundPicUrl;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          int i1 = 0;
          tbackgroundP1 = this.backgroundPicUrl;
          while (i1 < tbackgroundP1.length) {
             object oobject = tbackgroundP1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tbackgroundP = this.isOpenVideo;
       if (tbackgroundP != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tbackgroundP);
       }
       tbackgroundP = this.channelInfo;
       if (tbackgroundP != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tbackgroundP);
       }
       if (!(this.caption).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.caption);
       }
       tbackgroundP = this.aboardType;
       if (tbackgroundP != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, tbackgroundP);
       }
       tbackgroundP = this.enableAboardControl;
       if (tbackgroundP != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(8, tbackgroundP);
       }
       tbackgroundP = this.enablePortraitVideo;
       if (tbackgroundP != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(9, tbackgroundP);
       }
       tbackgroundP1 = this.groupId;
       if (tbackgroundP1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(10, tbackgroundP1);
       }
       if (!(this.abParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.abParams);
       }
       tbackgroundP = this.dynamicBackground;
       if (tbackgroundP != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(12, tbackgroundP);
       }
       tbackgroundP = this.isFansFreeAboard;
       if (tbackgroundP != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(13, tbackgroundP);
       }
       tbackgroundP = this.isLastGridChatOpenVideo;
       if (tbackgroundP != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(14, tbackgroundP);
       }
       tbackgroundP = this.version;
       if (tbackgroundP) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(15, tbackgroundP);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$VoicePartyCommonInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.rule = p0.readString();
                break;
              case 18:
                this.topic = p0.readString();
                break;
              case 26:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 26);
                LiveStreamMessages$VoicePartyCommonInfo tbackgroundP = this.backgroundPicUrl;
                int i1 = (tbackgroundP == null)? 0: tbackgroundP.length;
                i = i + i1;
                UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(tbackgroundP, 0, picUrlArray, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   picUrlArray[i1] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                picUrlArray[i1] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i1]);
                this.backgroundPicUrl = picUrlArray;
                break;
              case 32:
                this.isOpenVideo = p0.readBool();
                break;
              case '*':
                if (this.channelInfo == null) {
                   this.channelInfo = new LiveStreamMessages$VoicePartyChannelInfo();
                }
                p0.readMessage(this.channelInfo);
                break;
              case '2':
                this.caption = p0.readString();
                break;
              case '8':
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.aboardType = i;
                }
                break;
              case '@':
                this.enableAboardControl = p0.readBool();
                break;
              case 'H':
                this.enablePortraitVideo = p0.readBool();
                break;
              case 'P':
                this.groupId = p0.readUInt64();
                break;
              case 'Z':
                this.abParams = p0.readString();
                break;
              case 'b':
                if (this.dynamicBackground == null) {
                   this.dynamicBackground = new LiveStreamMessages$DynamicBackground();
                }
                p0.readMessage(this.dynamicBackground);
                break;
              case 'h':
                this.isFansFreeAboard = p0.readBool();
                break;
              case 'p':
                this.isLastGridChatOpenVideo = p0.readBool();
                break;
              case 'x':
                this.version = p0.readUInt64();
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
       LiveStreamMessages$VoicePartyCommonInfo tbackgroundP1;
       String str = "";
       if (!(this.rule).equals(str)) {
          p0.writeString(1, this.rule);
       }
       if (!(this.topic).equals(str)) {
          p0.writeString(2, this.topic);
       }
       LiveStreamMessages$VoicePartyCommonInfo tbackgroundP = this.backgroundPicUrl;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          int i = 0;
          tbackgroundP1 = this.backgroundPicUrl;
          while (i < tbackgroundP1.length) {
             object oobject = tbackgroundP1[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       tbackgroundP = this.isOpenVideo;
       if (tbackgroundP != null) {
          p0.writeBool(4, tbackgroundP);
       }
       tbackgroundP = this.channelInfo;
       if (tbackgroundP != null) {
          p0.writeMessage(5, tbackgroundP);
       }
       if (!(this.caption).equals(str)) {
          p0.writeString(6, this.caption);
       }
       tbackgroundP = this.aboardType;
       if (tbackgroundP != null) {
          p0.writeInt32(7, tbackgroundP);
       }
       tbackgroundP = this.enableAboardControl;
       if (tbackgroundP != null) {
          p0.writeBool(8, tbackgroundP);
       }
       tbackgroundP = this.enablePortraitVideo;
       if (tbackgroundP != null) {
          p0.writeBool(9, tbackgroundP);
       }
       tbackgroundP1 = this.groupId;
       if (tbackgroundP1) {
          p0.writeUInt64(10, tbackgroundP1);
       }
       if (!(this.abParams).equals(str)) {
          p0.writeString(11, this.abParams);
       }
       tbackgroundP = this.dynamicBackground;
       if (tbackgroundP != null) {
          p0.writeMessage(12, tbackgroundP);
       }
       tbackgroundP = this.isFansFreeAboard;
       if (tbackgroundP != null) {
          p0.writeBool(13, tbackgroundP);
       }
       tbackgroundP = this.isLastGridChatOpenVideo;
       if (tbackgroundP != null) {
          p0.writeBool(14, tbackgroundP);
       }
       tbackgroundP = this.version;
       if (tbackgroundP) {
          p0.writeUInt64(15, tbackgroundP);
       }
       super.writeTo(p0);
       return;
    }
}
