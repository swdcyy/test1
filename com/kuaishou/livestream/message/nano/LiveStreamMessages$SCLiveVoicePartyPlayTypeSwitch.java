package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveVoicePartyPlayTypeSwitch;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatDetailInfo;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveStreamMessages$SCLiveVoicePartyPlayTypeSwitch extends MessageNano	// class@00134e
{
    public String currentBizId;
    public int currentType;
    public boolean disableApplaud;
    public boolean isOpenVideo;
    public String liveStreamId;
    public LiveStreamMessages$MicSeatDetailInfo[] micSeatDetailInfo;
    public int micSeatsVersion;
    public String pkRuleUrl;
    public String previousBizId;
    public int previousType;
    public String voicePartyId;
    public static LiveStreamMessages$SCLiveVoicePartyPlayTypeSwitch[] _emptyArray;

    public void LiveStreamMessages$SCLiveVoicePartyPlayTypeSwitch(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCLiveVoicePartyPlayTypeSwitch[] emptyArray(){
       if (LiveStreamMessages$SCLiveVoicePartyPlayTypeSwitch._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCLiveVoicePartyPlayTypeSwitch._emptyArray == null) {
             LiveStreamMessages$SCLiveVoicePartyPlayTypeSwitch[] sCLiveVoiceP = new LiveStreamMessages$SCLiveVoicePartyPlayTypeSwitch[0];
             LiveStreamMessages$SCLiveVoicePartyPlayTypeSwitch._emptyArray = sCLiveVoiceP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCLiveVoicePartyPlayTypeSwitch._emptyArray;
    }
    public static LiveStreamMessages$SCLiveVoicePartyPlayTypeSwitch parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCLiveVoicePartyPlayTypeSwitch().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCLiveVoicePartyPlayTypeSwitch parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCLiveVoicePartyPlayTypeSwitch(), p0);
    }
    public LiveStreamMessages$SCLiveVoicePartyPlayTypeSwitch clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.previousType = 0;
       this.previousBizId = "";
       this.currentType = 0;
       this.currentBizId = "";
       this.isOpenVideo = false;
       this.micSeatDetailInfo = LiveStreamMessages$MicSeatDetailInfo.emptyArray();
       this.micSeatsVersion = 0;
       this.pkRuleUrl = "";
       this.disableApplaud = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.voicePartyId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.voicePartyId);
       }
       LiveStreamMessages$SCLiveVoicePartyPlayTypeSwitch tpreviousTyp = this.previousType;
       if (tpreviousTyp != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tpreviousTyp);
       }
       if (!(this.previousBizId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.previousBizId);
       }
       tpreviousTyp = this.currentType;
       if (tpreviousTyp != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tpreviousTyp);
       }
       if (!(this.currentBizId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.currentBizId);
       }
       tpreviousTyp = this.isOpenVideo;
       if (tpreviousTyp != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tpreviousTyp);
       }
       tpreviousTyp = this.micSeatDetailInfo;
       if (tpreviousTyp != null && tpreviousTyp.length > 0) {
          int i1 = 0;
          LiveStreamMessages$SCLiveVoicePartyPlayTypeSwitch tmicSeatDeta = this.micSeatDetailInfo;
          while (i1 < tmicSeatDeta.length) {
             object oobject = tmicSeatDeta[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(8, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tpreviousTyp = this.micSeatsVersion;
       if (tpreviousTyp != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(9, tpreviousTyp);
       }
       if (!(this.pkRuleUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.pkRuleUrl);
       }
       tpreviousTyp = this.disableApplaud;
       if (tpreviousTyp != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(11, tpreviousTyp);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCLiveVoicePartyPlayTypeSwitch mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.liveStreamId = p0.readString();
                break;
              case 18:
                this.voicePartyId = p0.readString();
                break;
              case 24:
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 1:
                      break;
                    default:
                }
                this.previousType = i;
                break;
              case '"':
                this.previousBizId = p0.readString();
                break;
              case '(':
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 1:
                      break;
                    default:
                }
                this.currentType = i;
                break;
              case '2':
                this.currentBizId = p0.readString();
                break;
              case '8':
                this.isOpenVideo = p0.readBool();
                break;
              case 'B':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 66);
                LiveStreamMessages$SCLiveVoicePartyPlayTypeSwitch tmicSeatDeta = this.micSeatDetailInfo;
                int i1 = (tmicSeatDeta == null)? 0: tmicSeatDeta.length;
                i = i + i1;
                LiveStreamMessages$MicSeatDetailInfo[] micSeatDetai = new LiveStreamMessages$MicSeatDetailInfo[i];
                if (i1) {
                   System.arraycopy(tmicSeatDeta, 0, micSeatDetai, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   micSeatDetai[i1] = new LiveStreamMessages$MicSeatDetailInfo();
                   p0.readMessage(micSeatDetai[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                micSeatDetai[i1] = new LiveStreamMessages$MicSeatDetailInfo();
                p0.readMessage(micSeatDetai[i1]);
                this.micSeatDetailInfo = micSeatDetai;
                break;
              case 'H':
                this.micSeatsVersion = p0.readUInt32();
                break;
              case 'R':
                this.pkRuleUrl = p0.readString();
                break;
              case 'X':
                this.disableApplaud = p0.readBool();
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
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       if (!(this.voicePartyId).equals(str)) {
          p0.writeString(2, this.voicePartyId);
       }
       LiveStreamMessages$SCLiveVoicePartyPlayTypeSwitch tpreviousTyp = this.previousType;
       if (tpreviousTyp != null) {
          p0.writeInt32(3, tpreviousTyp);
       }
       if (!(this.previousBizId).equals(str)) {
          p0.writeString(4, this.previousBizId);
       }
       tpreviousTyp = this.currentType;
       if (tpreviousTyp != null) {
          p0.writeInt32(5, tpreviousTyp);
       }
       if (!(this.currentBizId).equals(str)) {
          p0.writeString(6, this.currentBizId);
       }
       tpreviousTyp = this.isOpenVideo;
       if (tpreviousTyp != null) {
          p0.writeBool(7, tpreviousTyp);
       }
       tpreviousTyp = this.micSeatDetailInfo;
       if (tpreviousTyp != null && tpreviousTyp.length > 0) {
          int i = 0;
          LiveStreamMessages$SCLiveVoicePartyPlayTypeSwitch tmicSeatDeta = this.micSeatDetailInfo;
          while (i < tmicSeatDeta.length) {
             object oobject = tmicSeatDeta[i];
             if (oobject != null) {
                p0.writeMessage(8, oobject);
             }
             i = i + 1;
          }
       }
       tpreviousTyp = this.micSeatsVersion;
       if (tpreviousTyp != null) {
          p0.writeUInt32(9, tpreviousTyp);
       }
       if (!(this.pkRuleUrl).equals(str)) {
          p0.writeString(10, this.pkRuleUrl);
       }
       tpreviousTyp = this.disableApplaud;
       if (tpreviousTyp != null) {
          p0.writeBool(11, tpreviousTyp);
       }
       super.writeTo(p0);
       return;
    }
}
