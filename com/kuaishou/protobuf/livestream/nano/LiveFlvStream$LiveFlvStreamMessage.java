package com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveChatViewPostionMessage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveStageLayoutConfigHashMessage;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveStageLayoutConfigChecksum;
import com.kuaishou.protobuf.livestream.nano.LiveAllDayBvrpSf2023Proto$LiveAllDayBvrpSf2023;
import com.kuaishou.protobuf.livestream.nano.LiveQuizSf2023Proto$LiveQuizAacSyncSf2023;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$AudioStatus;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveCentaurLayoutConfigMessage;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveMerchantWakeupMessage;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveVoicePartyVideoLayoutMessage;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveCameraFaceDataMessage;
import java.lang.Object;
import java.lang.System;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFaceTransDataMessage;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveActiveSpeakersMessage;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveLineChatMessage;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFaceAreasMessage;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveChatSyncMessage;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveAnchorQosInfoSyncMessage;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LivePKGameInfoSyncMessage;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveMagicFaceEffectSyncMessage;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvSyncTheaterCommandMessage;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFollowPopupSyncMessage;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveQuiz2SyncMessage;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvSyncPetMessage;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvSyncLyricsStopMessage;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvSyncLyricsMessage;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvVoicePartyMessage;

public final class LiveFlvStream$LiveFlvStreamMessage extends MessageNano	// class@000c6d
{
    public LiveFlvStream$LiveAnchorQosInfoSyncMessage anchorQosInfoSync;
    public LiveFlvStream$LiveCameraFaceDataMessage cameraFaceInfo;
    public LiveFlvStream$LiveCentaurLayoutConfigMessage centaurLayoutConfig;
    public LiveFlvStream$LiveChatSyncMessage chatStatusSync;
    public LiveFlvStream$LiveChatViewPostionMessage chatViewPosition;
    public LiveCommonEffectInfo commonEffectInfo;
    public LiveFlvStream$LiveFaceAreasMessage faceAreaInfo;
    public LiveFlvStream$LiveFaceTransDataMessage facePointInfo;
    public LiveFlvStream$LiveFollowPopupSyncMessage followPopupSync;
    public LiveFlvStream$LiveLineChatMessage lineChatInfo;
    public LiveAllDayBvrpSf2023Proto$LiveAllDayBvrpSf2023 liveAllDayBvrpSf2023;
    public LiveQuizSf2023Proto$LiveQuizAacSyncSf2023 liveQuizAacSyncSf2023;
    public LiveStageProto$AudioStatus liveStageAudioStatus;
    public LiveFlvStream$LiveStageLayoutConfigChecksum liveStageLayoutConfigChecksum;
    public LiveFlvStream$LiveStageLayoutConfigHashMessage liveStageLayoutConfigHash;
    public LiveFlvStream$LiveMagicFaceEffectSyncMessage magicFaceEffectSync;
    public LiveFlvStream$LiveMerchantWakeupMessage merchantWakeupInfo;
    public int messageType;
    public LiveFlvStream$LiveChatViewPostionMessage[] participantViewPosition;
    public LiveFlvStream$LivePKGameInfoSyncMessage pkGameInfoSync;
    public LiveFlvStream$LiveQuiz2SyncMessage quiz2Sync;
    public LiveFlvStream$LiveActiveSpeakersMessage speakersInfo;
    public LiveFlvStream$LiveFlvSyncLyricsMessage syncLyrics;
    public LiveFlvStream$LiveFlvSyncLyricsStopMessage syncLyricsStop;
    public LiveFlvStream$LiveFlvSyncPetMessage syncPetAction;
    public LiveFlvStream$LiveFlvVoicePartyMessage voiceParty;
    public LiveFlvStream$LiveFlvSyncTheaterCommandMessage voicePartyTheater;
    public LiveFlvStream$LiveVoicePartyVideoLayoutMessage voicePartyVideoLayoutInfo;
    public static LiveFlvStream$LiveFlvStreamMessage[] _emptyArray;

    public void LiveFlvStream$LiveFlvStreamMessage(){
       super();
       this.clear();
    }
    public static LiveFlvStream$LiveFlvStreamMessage[] emptyArray(){
       if (LiveFlvStream$LiveFlvStreamMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFlvStream$LiveFlvStreamMessage._emptyArray == null) {
             LiveFlvStream$LiveFlvStreamMessage[] liveFlvStrea = new LiveFlvStream$LiveFlvStreamMessage[0];
             LiveFlvStream$LiveFlvStreamMessage._emptyArray = liveFlvStrea;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFlvStream$LiveFlvStreamMessage._emptyArray;
    }
    public static LiveFlvStream$LiveFlvStreamMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveFlvStream$LiveFlvStreamMessage().mergeFrom(p0);
    }
    public static LiveFlvStream$LiveFlvStreamMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFlvStream$LiveFlvStreamMessage(), p0);
    }
    public LiveFlvStream$LiveFlvStreamMessage clear(){
       this.messageType = 0;
       this.voiceParty = null;
       this.syncLyrics = null;
       this.syncLyricsStop = null;
       this.syncPetAction = null;
       this.quiz2Sync = null;
       this.followPopupSync = null;
       this.voicePartyTheater = null;
       this.magicFaceEffectSync = null;
       this.pkGameInfoSync = null;
       this.anchorQosInfoSync = null;
       this.chatStatusSync = null;
       this.chatViewPosition = null;
       this.faceAreaInfo = null;
       this.lineChatInfo = null;
       this.speakersInfo = null;
       this.facePointInfo = null;
       this.participantViewPosition = LiveFlvStream$LiveChatViewPostionMessage.emptyArray();
       this.cameraFaceInfo = null;
       this.voicePartyVideoLayoutInfo = null;
       this.merchantWakeupInfo = null;
       this.commonEffectInfo = null;
       this.centaurLayoutConfig = null;
       this.liveStageAudioStatus = null;
       this.liveQuizAacSyncSf2023 = null;
       this.liveAllDayBvrpSf2023 = null;
       this.liveStageLayoutConfigChecksum = null;
       this.liveStageLayoutConfigHash = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFlvStream$LiveFlvStreamMessage tmessageType = this.messageType;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tmessageType);
       }
       tmessageType = this.voiceParty;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tmessageType);
       }
       tmessageType = this.syncLyrics;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tmessageType);
       }
       tmessageType = this.syncLyricsStop;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tmessageType);
       }
       tmessageType = this.syncPetAction;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tmessageType);
       }
       tmessageType = this.quiz2Sync;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tmessageType);
       }
       tmessageType = this.followPopupSync;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tmessageType);
       }
       tmessageType = this.voicePartyTheater;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, tmessageType);
       }
       tmessageType = this.magicFaceEffectSync;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, tmessageType);
       }
       tmessageType = this.pkGameInfoSync;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, tmessageType);
       }
       tmessageType = this.anchorQosInfoSync;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(11, tmessageType);
       }
       tmessageType = this.chatStatusSync;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(12, tmessageType);
       }
       tmessageType = this.chatViewPosition;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(13, tmessageType);
       }
       tmessageType = this.faceAreaInfo;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(14, tmessageType);
       }
       tmessageType = this.lineChatInfo;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(15, tmessageType);
       }
       tmessageType = this.speakersInfo;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(16, tmessageType);
       }
       tmessageType = this.facePointInfo;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(17, tmessageType);
       }
       tmessageType = this.participantViewPosition;
       if (tmessageType != null && tmessageType.length > 0) {
          int i1 = 0;
          LiveFlvStream$LiveFlvStreamMessage tparticipant = this.participantViewPosition;
          while (i1 < tparticipant.length) {
             object oobject = tparticipant[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(18, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tmessageType = this.cameraFaceInfo;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(19, tmessageType);
       }
       tmessageType = this.voicePartyVideoLayoutInfo;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(20, tmessageType);
       }
       tmessageType = this.merchantWakeupInfo;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(21, tmessageType);
       }
       tmessageType = this.commonEffectInfo;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(22, tmessageType);
       }
       tmessageType = this.centaurLayoutConfig;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(23, tmessageType);
       }
       tmessageType = this.liveStageAudioStatus;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(24, tmessageType);
       }
       tmessageType = this.liveQuizAacSyncSf2023;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(25, tmessageType);
       }
       tmessageType = this.liveAllDayBvrpSf2023;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(26, tmessageType);
       }
       tmessageType = this.liveStageLayoutConfigChecksum;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(27, tmessageType);
       }
       tmessageType = this.liveStageLayoutConfigHash;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(28, tmessageType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFlvStream$LiveFlvStreamMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 1:
                      break;
                    default:
                }
                this.messageType = i;
                break;
              case 18:
                if (this.voiceParty == null) {
                   this.voiceParty = new LiveFlvStream$LiveFlvVoicePartyMessage();
                }
                p0.readMessage(this.voiceParty);
                break;
              case 26:
                if (this.syncLyrics == null) {
                   this.syncLyrics = new LiveFlvStream$LiveFlvSyncLyricsMessage();
                }
                p0.readMessage(this.syncLyrics);
                break;
              case '"':
                if (this.syncLyricsStop == null) {
                   this.syncLyricsStop = new LiveFlvStream$LiveFlvSyncLyricsStopMessage();
                }
                p0.readMessage(this.syncLyricsStop);
                break;
              case '*':
                if (this.syncPetAction == null) {
                   this.syncPetAction = new LiveFlvStream$LiveFlvSyncPetMessage();
                }
                p0.readMessage(this.syncPetAction);
                break;
              case '2':
                if (this.quiz2Sync == null) {
                   this.quiz2Sync = new LiveFlvStream$LiveQuiz2SyncMessage();
                }
                p0.readMessage(this.quiz2Sync);
                break;
              case ':':
                if (this.followPopupSync == null) {
                   this.followPopupSync = new LiveFlvStream$LiveFollowPopupSyncMessage();
                }
                p0.readMessage(this.followPopupSync);
                break;
              case 'B':
                if (this.voicePartyTheater == null) {
                   this.voicePartyTheater = new LiveFlvStream$LiveFlvSyncTheaterCommandMessage();
                }
                p0.readMessage(this.voicePartyTheater);
                break;
              case 'J':
                if (this.magicFaceEffectSync == null) {
                   this.magicFaceEffectSync = new LiveFlvStream$LiveMagicFaceEffectSyncMessage();
                }
                p0.readMessage(this.magicFaceEffectSync);
                break;
              case 'R':
                if (this.pkGameInfoSync == null) {
                   this.pkGameInfoSync = new LiveFlvStream$LivePKGameInfoSyncMessage();
                }
                p0.readMessage(this.pkGameInfoSync);
                break;
              case 'Z':
                if (this.anchorQosInfoSync == null) {
                   this.anchorQosInfoSync = new LiveFlvStream$LiveAnchorQosInfoSyncMessage();
                }
                p0.readMessage(this.anchorQosInfoSync);
                break;
              case 'b':
                if (this.chatStatusSync == null) {
                   this.chatStatusSync = new LiveFlvStream$LiveChatSyncMessage();
                }
                p0.readMessage(this.chatStatusSync);
                break;
              case 'j':
                if (this.chatViewPosition == null) {
                   this.chatViewPosition = new LiveFlvStream$LiveChatViewPostionMessage();
                }
                p0.readMessage(this.chatViewPosition);
                break;
              case 'r':
                if (this.faceAreaInfo == null) {
                   this.faceAreaInfo = new LiveFlvStream$LiveFaceAreasMessage();
                }
                p0.readMessage(this.faceAreaInfo);
                break;
              case 'z':
                if (this.lineChatInfo == null) {
                   this.lineChatInfo = new LiveFlvStream$LiveLineChatMessage();
                }
                p0.readMessage(this.lineChatInfo);
                break;
              case 130:
                if (this.speakersInfo == null) {
                   this.speakersInfo = new LiveFlvStream$LiveActiveSpeakersMessage();
                }
                p0.readMessage(this.speakersInfo);
                break;
              case 138:
                if (this.facePointInfo == null) {
                   this.facePointInfo = new LiveFlvStream$LiveFaceTransDataMessage();
                }
                p0.readMessage(this.facePointInfo);
                break;
              case 146:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 146);
                LiveFlvStream$LiveFlvStreamMessage tparticipant = this.participantViewPosition;
                int i1 = (tparticipant == null)? 0: tparticipant.length;
                i = i + i1;
                LiveFlvStream$LiveChatViewPostionMessage[] liveChatView = new LiveFlvStream$LiveChatViewPostionMessage[i];
                if (i1) {
                   System.arraycopy(tparticipant, 0, liveChatView, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   liveChatView[i1] = new LiveFlvStream$LiveChatViewPostionMessage();
                   p0.readMessage(liveChatView[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                liveChatView[i1] = new LiveFlvStream$LiveChatViewPostionMessage();
                p0.readMessage(liveChatView[i1]);
                this.participantViewPosition = liveChatView;
                break;
              case 154:
                if (this.cameraFaceInfo == null) {
                   this.cameraFaceInfo = new LiveFlvStream$LiveCameraFaceDataMessage();
                }
                p0.readMessage(this.cameraFaceInfo);
                break;
              case 162:
                if (this.voicePartyVideoLayoutInfo == null) {
                   this.voicePartyVideoLayoutInfo = new LiveFlvStream$LiveVoicePartyVideoLayoutMessage();
                }
                p0.readMessage(this.voicePartyVideoLayoutInfo);
                break;
              case 170:
                if (this.merchantWakeupInfo == null) {
                   this.merchantWakeupInfo = new LiveFlvStream$LiveMerchantWakeupMessage();
                }
                p0.readMessage(this.merchantWakeupInfo);
                break;
              case 178:
                if (this.commonEffectInfo == null) {
                   this.commonEffectInfo = new LiveCommonEffectInfo();
                }
                p0.readMessage(this.commonEffectInfo);
                break;
              case 186:
                if (this.centaurLayoutConfig == null) {
                   this.centaurLayoutConfig = new LiveFlvStream$LiveCentaurLayoutConfigMessage();
                }
                p0.readMessage(this.centaurLayoutConfig);
                break;
              case 194:
                if (this.liveStageAudioStatus == null) {
                   this.liveStageAudioStatus = new LiveStageProto$AudioStatus();
                }
                p0.readMessage(this.liveStageAudioStatus);
                break;
              case 202:
                if (this.liveQuizAacSyncSf2023 == null) {
                   this.liveQuizAacSyncSf2023 = new LiveQuizSf2023Proto$LiveQuizAacSyncSf2023();
                }
                p0.readMessage(this.liveQuizAacSyncSf2023);
                break;
              case 210:
                if (this.liveAllDayBvrpSf2023 == null) {
                   this.liveAllDayBvrpSf2023 = new LiveAllDayBvrpSf2023Proto$LiveAllDayBvrpSf2023();
                }
                p0.readMessage(this.liveAllDayBvrpSf2023);
                break;
              case 218:
                if (this.liveStageLayoutConfigChecksum == null) {
                   this.liveStageLayoutConfigChecksum = new LiveFlvStream$LiveStageLayoutConfigChecksum();
                }
                p0.readMessage(this.liveStageLayoutConfigChecksum);
                break;
              case 226:
                if (this.liveStageLayoutConfigHash == null) {
                   this.liveStageLayoutConfigHash = new LiveFlvStream$LiveStageLayoutConfigHashMessage();
                }
                p0.readMessage(this.liveStageLayoutConfigHash);
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
       LiveFlvStream$LiveFlvStreamMessage tmessageType = this.messageType;
       if (tmessageType != null) {
          p0.writeInt32(1, tmessageType);
       }
       tmessageType = this.voiceParty;
       if (tmessageType != null) {
          p0.writeMessage(2, tmessageType);
       }
       tmessageType = this.syncLyrics;
       if (tmessageType != null) {
          p0.writeMessage(3, tmessageType);
       }
       tmessageType = this.syncLyricsStop;
       if (tmessageType != null) {
          p0.writeMessage(4, tmessageType);
       }
       tmessageType = this.syncPetAction;
       if (tmessageType != null) {
          p0.writeMessage(5, tmessageType);
       }
       tmessageType = this.quiz2Sync;
       if (tmessageType != null) {
          p0.writeMessage(6, tmessageType);
       }
       tmessageType = this.followPopupSync;
       if (tmessageType != null) {
          p0.writeMessage(7, tmessageType);
       }
       tmessageType = this.voicePartyTheater;
       if (tmessageType != null) {
          p0.writeMessage(8, tmessageType);
       }
       tmessageType = this.magicFaceEffectSync;
       if (tmessageType != null) {
          p0.writeMessage(9, tmessageType);
       }
       tmessageType = this.pkGameInfoSync;
       if (tmessageType != null) {
          p0.writeMessage(10, tmessageType);
       }
       tmessageType = this.anchorQosInfoSync;
       if (tmessageType != null) {
          p0.writeMessage(11, tmessageType);
       }
       tmessageType = this.chatStatusSync;
       if (tmessageType != null) {
          p0.writeMessage(12, tmessageType);
       }
       tmessageType = this.chatViewPosition;
       if (tmessageType != null) {
          p0.writeMessage(13, tmessageType);
       }
       tmessageType = this.faceAreaInfo;
       if (tmessageType != null) {
          p0.writeMessage(14, tmessageType);
       }
       tmessageType = this.lineChatInfo;
       if (tmessageType != null) {
          p0.writeMessage(15, tmessageType);
       }
       tmessageType = this.speakersInfo;
       if (tmessageType != null) {
          p0.writeMessage(16, tmessageType);
       }
       tmessageType = this.facePointInfo;
       if (tmessageType != null) {
          p0.writeMessage(17, tmessageType);
       }
       tmessageType = this.participantViewPosition;
       if (tmessageType != null && tmessageType.length > 0) {
          int i = 0;
          LiveFlvStream$LiveFlvStreamMessage tparticipant = this.participantViewPosition;
          while (i < tparticipant.length) {
             object oobject = tparticipant[i];
             if (oobject != null) {
                p0.writeMessage(18, oobject);
             }
             i = i + 1;
          }
       }
       tmessageType = this.cameraFaceInfo;
       if (tmessageType != null) {
          p0.writeMessage(19, tmessageType);
       }
       tmessageType = this.voicePartyVideoLayoutInfo;
       if (tmessageType != null) {
          p0.writeMessage(20, tmessageType);
       }
       tmessageType = this.merchantWakeupInfo;
       if (tmessageType != null) {
          p0.writeMessage(21, tmessageType);
       }
       tmessageType = this.commonEffectInfo;
       if (tmessageType != null) {
          p0.writeMessage(22, tmessageType);
       }
       tmessageType = this.centaurLayoutConfig;
       if (tmessageType != null) {
          p0.writeMessage(23, tmessageType);
       }
       tmessageType = this.liveStageAudioStatus;
       if (tmessageType != null) {
          p0.writeMessage(24, tmessageType);
       }
       tmessageType = this.liveQuizAacSyncSf2023;
       if (tmessageType != null) {
          p0.writeMessage(25, tmessageType);
       }
       tmessageType = this.liveAllDayBvrpSf2023;
       if (tmessageType != null) {
          p0.writeMessage(26, tmessageType);
       }
       tmessageType = this.liveStageLayoutConfigChecksum;
       if (tmessageType != null) {
          p0.writeMessage(27, tmessageType);
       }
       tmessageType = this.liveStageLayoutConfigHash;
       if (tmessageType != null) {
          p0.writeMessage(28, tmessageType);
       }
       super.writeTo(p0);
       return;
    }
}
