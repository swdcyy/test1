package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCVoicePartyOpened;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatInfo;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatDetailInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$VoicePartyCommonInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$VoicePartyPlayInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatsApplyInfo;

public final class LiveStreamMessages$SCVoicePartyOpened extends MessageNano	// class@001376
{
    public UserInfos$PicUrl[] backgroundPicUrl;
    public LiveStreamMessages$VoicePartyCommonInfo commonInfo;
    public boolean fromEnterRoom;
    public boolean isGoldenRoom;
    public boolean isOnlyPhoneVerified;
    public boolean isSupportDirectSwitch;
    public LiveStreamMessages$MicSeatDetailInfo[] micSeatDetailInfo;
    public LiveStreamMessages$MicSeatInfo[] micSeatInfo;
    public LiveStreamMessages$MicSeatsApplyInfo micSeatsApplyInfo;
    public int micSeatsCount;
    public int micSeatsVersion;
    public String rule;
    public long time;
    public String topic;
    public String voicePartyId;
    public LiveStreamMessages$VoicePartyPlayInfo voicePartyPlayInfo;
    public static LiveStreamMessages$SCVoicePartyOpened[] _emptyArray;

    public void LiveStreamMessages$SCVoicePartyOpened(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCVoicePartyOpened[] emptyArray(){
       if (LiveStreamMessages$SCVoicePartyOpened._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCVoicePartyOpened._emptyArray == null) {
             LiveStreamMessages$SCVoicePartyOpened[] sCVoiceParty = new LiveStreamMessages$SCVoicePartyOpened[0];
             LiveStreamMessages$SCVoicePartyOpened._emptyArray = sCVoiceParty;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCVoicePartyOpened._emptyArray;
    }
    public static LiveStreamMessages$SCVoicePartyOpened parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCVoicePartyOpened().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCVoicePartyOpened parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCVoicePartyOpened(), p0);
    }
    public LiveStreamMessages$SCVoicePartyOpened clear(){
       this.time = 0;
       this.voicePartyId = "";
       this.micSeatInfo = LiveStreamMessages$MicSeatInfo.emptyArray();
       this.rule = "";
       this.topic = "";
       this.backgroundPicUrl = UserInfos$PicUrl.emptyArray();
       this.micSeatsCount = 0;
       this.micSeatsApplyInfo = null;
       this.voicePartyPlayInfo = null;
       this.commonInfo = null;
       this.micSeatDetailInfo = LiveStreamMessages$MicSeatDetailInfo.emptyArray();
       this.micSeatsVersion = 0;
       this.isOnlyPhoneVerified = false;
       this.isGoldenRoom = false;
       this.fromEnterRoom = false;
       this.isSupportDirectSwitch = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCVoicePartyOpened ttime = this.time;
       if (ttime - null) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       String str = "";
       if (!(this.voicePartyId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.voicePartyId);
       }
       ttime = this.micSeatInfo;
       int i1 = 0;
       if (ttime != null && ttime.length > 0) {
          i2 = 0;
          LiveStreamMessages$SCVoicePartyOpened tmicSeatInfo = this.micSeatInfo;
          while (i2 < tmicSeatInfo.length) {
             object oobject = tmicSeatInfo[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.rule).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.rule);
       }
       if (!(this.topic).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.topic);
       }
       ttime = this.backgroundPicUrl;
       if (ttime != null && ttime.length > 0) {
          i2 = 0;
          LiveStreamMessages$SCVoicePartyOpened tbackgroundP = this.backgroundPicUrl;
          while (i2 < tbackgroundP.length) {
             object oobject1 = tbackgroundP[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       ttime = this.micSeatsCount;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, ttime);
       }
       ttime = this.micSeatsApplyInfo;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, ttime);
       }
       ttime = this.voicePartyPlayInfo;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, ttime);
       }
       ttime = this.commonInfo;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, ttime);
       }
       ttime = this.micSeatDetailInfo;
       if (ttime != null && ttime.length > 0) {
          ttime = this.micSeatDetailInfo;
          while (i1 < ttime.length) {
             object oobject2 = ttime[i1];
             if (oobject2 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(11, oobject2);
             }
             i1 = i1 + 1;
          }
       }
       ttime = this.micSeatsVersion;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(12, ttime);
       }
       ttime = this.isOnlyPhoneVerified;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(13, ttime);
       }
       ttime = this.isGoldenRoom;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(14, ttime);
       }
       ttime = this.fromEnterRoom;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(15, ttime);
       }
       ttime = this.isSupportDirectSwitch;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(16, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCVoicePartyOpened mergeFrom(CodedInputByteBufferNano p0){
       LiveStreamMessages$SCVoicePartyOpened tmicSeatInfo;
       int i2;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 8:
                this.time = p0.readUInt64();
                break;
              case 18:
                this.voicePartyId = p0.readString();
                break;
              case 26:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 26);
                tmicSeatInfo = this.micSeatInfo;
                i2 = (tmicSeatInfo == null)? 0: tmicSeatInfo.length;
                i = i + i2;
                LiveStreamMessages$MicSeatInfo[] micSeatInfoA = new LiveStreamMessages$MicSeatInfo[i];
                if (i2) {
                   System.arraycopy(tmicSeatInfo, i1, micSeatInfoA, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   micSeatInfoA[i2] = new LiveStreamMessages$MicSeatInfo();
                   p0.readMessage(micSeatInfoA[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                micSeatInfoA[i2] = new LiveStreamMessages$MicSeatInfo();
                p0.readMessage(micSeatInfoA[i2]);
                this.micSeatInfo = micSeatInfoA;
                break;
              case '"':
                this.rule = p0.readString();
                break;
              case '*':
                this.topic = p0.readString();
                break;
              case '2':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 50);
                tmicSeatInfo = this.backgroundPicUrl;
                i2 = (tmicSeatInfo == null)? 0: tmicSeatInfo.length;
                i = i + i2;
                UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tmicSeatInfo, i1, picUrlArray, i1, i2);
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
                this.backgroundPicUrl = picUrlArray;
                break;
              case '8':
                this.micSeatsCount = p0.readUInt32();
                break;
              case 'B':
                if (this.micSeatsApplyInfo == null) {
                   this.micSeatsApplyInfo = new LiveStreamMessages$MicSeatsApplyInfo();
                }
                p0.readMessage(this.micSeatsApplyInfo);
                break;
              case 'J':
                if (this.voicePartyPlayInfo == null) {
                   this.voicePartyPlayInfo = new LiveStreamMessages$VoicePartyPlayInfo();
                }
                p0.readMessage(this.voicePartyPlayInfo);
                break;
              case 'R':
                if (this.commonInfo == null) {
                   this.commonInfo = new LiveStreamMessages$VoicePartyCommonInfo();
                }
                p0.readMessage(this.commonInfo);
                break;
              case 'Z':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 90);
                tmicSeatInfo = this.micSeatDetailInfo;
                i2 = (tmicSeatInfo == null)? 0: tmicSeatInfo.length;
                i = i + i2;
                LiveStreamMessages$MicSeatDetailInfo[] micSeatDetai = new LiveStreamMessages$MicSeatDetailInfo[i];
                if (i2) {
                   System.arraycopy(tmicSeatInfo, i1, micSeatDetai, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   micSeatDetai[i2] = new LiveStreamMessages$MicSeatDetailInfo();
                   p0.readMessage(micSeatDetai[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                micSeatDetai[i2] = new LiveStreamMessages$MicSeatDetailInfo();
                p0.readMessage(micSeatDetai[i2]);
                this.micSeatDetailInfo = micSeatDetai;
                break;
              case '`':
                this.micSeatsVersion = p0.readUInt32();
                break;
              case 'h':
                this.isOnlyPhoneVerified = p0.readBool();
                break;
              case 'p':
                this.isGoldenRoom = p0.readBool();
                break;
              case 'x':
                this.fromEnterRoom = p0.readBool();
                break;
              case 128:
                this.isSupportDirectSwitch = p0.readBool();
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
       LiveStreamMessages$SCVoicePartyOpened ttime = this.time;
       if (ttime - null) {
          p0.writeUInt64(1, ttime);
       }
       String str = "";
       if (!(this.voicePartyId).equals(str)) {
          p0.writeString(2, this.voicePartyId);
       }
       ttime = this.micSeatInfo;
       int i = 0;
       if (ttime != null && ttime.length > 0) {
          i1 = 0;
          LiveStreamMessages$SCVoicePartyOpened tmicSeatInfo = this.micSeatInfo;
          while (i1 < tmicSeatInfo.length) {
             object oobject = tmicSeatInfo[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.rule).equals(str)) {
          p0.writeString(4, this.rule);
       }
       if (!(this.topic).equals(str)) {
          p0.writeString(5, this.topic);
       }
       ttime = this.backgroundPicUrl;
       if (ttime != null && ttime.length > 0) {
          i1 = 0;
          LiveStreamMessages$SCVoicePartyOpened tbackgroundP = this.backgroundPicUrl;
          while (i1 < tbackgroundP.length) {
             object oobject1 = tbackgroundP[i1];
             if (oobject1 != null) {
                p0.writeMessage(6, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       ttime = this.micSeatsCount;
       if (ttime != null) {
          p0.writeUInt32(7, ttime);
       }
       ttime = this.micSeatsApplyInfo;
       if (ttime != null) {
          p0.writeMessage(8, ttime);
       }
       ttime = this.voicePartyPlayInfo;
       if (ttime != null) {
          p0.writeMessage(9, ttime);
       }
       ttime = this.commonInfo;
       if (ttime != null) {
          p0.writeMessage(10, ttime);
       }
       ttime = this.micSeatDetailInfo;
       if (ttime != null && ttime.length > 0) {
          ttime = this.micSeatDetailInfo;
          while (i < ttime.length) {
             object oobject2 = ttime[i];
             if (oobject2 != null) {
                p0.writeMessage(11, oobject2);
             }
             i = i + 1;
          }
       }
       ttime = this.micSeatsVersion;
       if (ttime != null) {
          p0.writeUInt32(12, ttime);
       }
       ttime = this.isOnlyPhoneVerified;
       if (ttime != null) {
          p0.writeBool(13, ttime);
       }
       ttime = this.isGoldenRoom;
       if (ttime != null) {
          p0.writeBool(14, ttime);
       }
       ttime = this.fromEnterRoom;
       if (ttime != null) {
          p0.writeBool(15, ttime);
       }
       ttime = this.isSupportDirectSwitch;
       if (ttime != null) {
          p0.writeBool(16, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
