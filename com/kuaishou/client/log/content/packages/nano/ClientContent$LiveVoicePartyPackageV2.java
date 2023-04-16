package com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$LiveVoicePartyPackageV2 extends MessageNano	// class@001299
{
    public int appliedAudienceNumber;
    public long audioBeginTimestamp;
    public long audioEndTimestamp;
    public String channelId;
    public String channelName;
    public long closeMicDuration;
    public long enterKtvStageTimestamp;
    public long enterKtvTimestamp;
    public int enterMicSeatReason;
    public long enterMicSeatTimestamp;
    public long enterVoicePartyTimestamp;
    public int entryPage;
    public int guestNumber;
    public int inviteMicChannel;
    public boolean isChannelSelect;
    public boolean isMicOpen;
    public String ktvId;
    public boolean ktvIsSingerSinging;
    public int ktvOrderListAudienceNumber;
    public int ktvOrderListSongNumber;
    public int ktvSelfOrderSongIndex;
    public int ktvSelfOrderSongNumber;
    public int ktvSelfSungSongNumber;
    public int ktvTotalSungSingerNumber;
    public int ktvTotalSungSongNumber;
    public int leaveKtvReason;
    public int leaveKtvStageReason;
    public long leaveKtvStageTimestamp;
    public long leaveKtvTimestamp;
    public int leaveMicSeatReason;
    public long leaveMicSeatTimestamp;
    public int leaveVoicePartyReason;
    public long leaveVoicePartyTimestamp;
    public int micNameNum;
    public long micSetDuration;
    public int micStatus;
    public int micType;
    public int micVipNum;
    public int mode;
    public int role;
    public String selectedMicSeatUserId;
    public int selectedMicSeatUserIndex;
    public int serverMicStatus;
    public int singerPlayBgmTrigger;
    public String teamPkRoomId;
    public String teampkId;
    public String theaterId;
    public String topicId;
    public String topicName;
    public long videoBeginTimestamp;
    public long videoEndTimestamp;
    public String voicePartyId;
    public static ClientContent$LiveVoicePartyPackageV2[] _emptyArray;

    public void ClientContent$LiveVoicePartyPackageV2(){
       super();
       this.clear();
    }
    public static ClientContent$LiveVoicePartyPackageV2[] emptyArray(){
       if (ClientContent$LiveVoicePartyPackageV2._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$LiveVoicePartyPackageV2._emptyArray == null) {
             ClientContent$LiveVoicePartyPackageV2[] liveVoicePar = new ClientContent$LiveVoicePartyPackageV2[0];
             ClientContent$LiveVoicePartyPackageV2._emptyArray = liveVoicePar;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$LiveVoicePartyPackageV2._emptyArray;
    }
    public static ClientContent$LiveVoicePartyPackageV2 parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$LiveVoicePartyPackageV2().mergeFrom(p0);
    }
    public static ClientContent$LiveVoicePartyPackageV2 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$LiveVoicePartyPackageV2(), p0);
    }
    public ClientContent$LiveVoicePartyPackageV2 clear(){
       this.voicePartyId = "";
       this.role = 0;
       this.guestNumber = 0;
       this.isMicOpen = false;
       this.selectedMicSeatUserId = "";
       this.selectedMicSeatUserIndex = 0;
       this.appliedAudienceNumber = 0;
       this.leaveMicSeatReason = 0;
       this.leaveVoicePartyReason = 0;
       this.enterVoicePartyTimestamp = 0;
       this.leaveVoicePartyTimestamp = 0;
       this.enterMicSeatTimestamp = 0;
       this.leaveMicSeatTimestamp = 0;
       this.entryPage = 0;
       this.mode = 0;
       this.enterKtvStageTimestamp = 0;
       this.leaveKtvStageTimestamp = 0;
       this.ktvOrderListSongNumber = 0;
       this.ktvOrderListAudienceNumber = 0;
       this.ktvId = "";
       this.leaveKtvStageReason = 0;
       this.ktvTotalSungSongNumber = 0;
       this.ktvTotalSungSingerNumber = 0;
       this.leaveKtvReason = 0;
       this.ktvSelfOrderSongNumber = 0;
       this.ktvSelfOrderSongIndex = 0;
       this.ktvSelfSungSongNumber = 0;
       this.ktvIsSingerSinging = false;
       this.enterKtvTimestamp = 0;
       this.leaveKtvTimestamp = 0;
       this.singerPlayBgmTrigger = 0;
       this.audioBeginTimestamp = 0;
       this.audioEndTimestamp = 0;
       this.videoBeginTimestamp = 0;
       this.videoEndTimestamp = 0;
       this.enterMicSeatReason = 0;
       this.channelId = "";
       this.channelName = "";
       this.topicId = "";
       this.topicName = "";
       this.isChannelSelect = false;
       this.micStatus = 0;
       this.serverMicStatus = 0;
       this.micSetDuration = 0;
       this.closeMicDuration = 0;
       this.inviteMicChannel = 0;
       this.theaterId = "";
       this.teampkId = "";
       this.teamPkRoomId = "";
       this.micType = 0;
       this.micNameNum = 0;
       this.micVipNum = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.voicePartyId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.voicePartyId);
       }
       ClientContent$LiveVoicePartyPackageV2 trole = this.role;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, trole);
       }
       trole = this.guestNumber;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, trole);
       }
       trole = this.isMicOpen;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, trole);
       }
       if (!(this.selectedMicSeatUserId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.selectedMicSeatUserId);
       }
       trole = this.selectedMicSeatUserIndex;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, trole);
       }
       trole = this.appliedAudienceNumber;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, trole);
       }
       trole = this.leaveMicSeatReason;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, trole);
       }
       trole = this.leaveVoicePartyReason;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, trole);
       }
       ClientContent$LiveVoicePartyPackageV2 tenterVoiceP = this.enterVoicePartyTimestamp;
       if (tenterVoiceP) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(10, tenterVoiceP);
       }
       tenterVoiceP = this.leaveVoicePartyTimestamp;
       if (tenterVoiceP) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, tenterVoiceP);
       }
       tenterVoiceP = this.enterMicSeatTimestamp;
       if (tenterVoiceP) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(12, tenterVoiceP);
       }
       tenterVoiceP = this.leaveMicSeatTimestamp;
       if (tenterVoiceP) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(13, tenterVoiceP);
       }
       trole = this.entryPage;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(14, trole);
       }
       trole = this.mode;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(15, trole);
       }
       tenterVoiceP = this.enterKtvStageTimestamp;
       if (tenterVoiceP) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(16, tenterVoiceP);
       }
       tenterVoiceP = this.leaveKtvStageTimestamp;
       if (tenterVoiceP) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(17, tenterVoiceP);
       }
       trole = this.ktvOrderListSongNumber;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(18, trole);
       }
       trole = this.ktvOrderListAudienceNumber;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(19, trole);
       }
       if (!(this.ktvId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(20, this.ktvId);
       }
       trole = this.leaveKtvStageReason;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(21, trole);
       }
       trole = this.ktvTotalSungSongNumber;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(22, trole);
       }
       trole = this.ktvTotalSungSingerNumber;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(23, trole);
       }
       trole = this.leaveKtvReason;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(24, trole);
       }
       trole = this.ktvSelfOrderSongNumber;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(25, trole);
       }
       trole = this.ktvSelfOrderSongIndex;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(26, trole);
       }
       trole = this.ktvSelfSungSongNumber;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(27, trole);
       }
       trole = this.ktvIsSingerSinging;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(28, trole);
       }
       tenterVoiceP = this.enterKtvTimestamp;
       if (tenterVoiceP) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(29, tenterVoiceP);
       }
       tenterVoiceP = this.leaveKtvTimestamp;
       if (tenterVoiceP) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(30, tenterVoiceP);
       }
       trole = this.singerPlayBgmTrigger;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(31, trole);
       }
       tenterVoiceP = this.audioBeginTimestamp;
       if (tenterVoiceP) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(32, tenterVoiceP);
       }
       tenterVoiceP = this.audioEndTimestamp;
       if (tenterVoiceP) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(33, tenterVoiceP);
       }
       tenterVoiceP = this.videoBeginTimestamp;
       if (tenterVoiceP) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(34, tenterVoiceP);
       }
       tenterVoiceP = this.videoEndTimestamp;
       if (tenterVoiceP) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(35, tenterVoiceP);
       }
       trole = this.enterMicSeatReason;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(36, trole);
       }
       if (!(this.channelId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(37, this.channelId);
       }
       if (!(this.channelName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(38, this.channelName);
       }
       if (!(this.topicId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(39, this.topicId);
       }
       if (!(this.topicName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(40, this.topicName);
       }
       trole = this.isChannelSelect;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(41, trole);
       }
       trole = this.micStatus;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(42, trole);
       }
       trole = this.serverMicStatus;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(43, trole);
       }
       tenterVoiceP = this.micSetDuration;
       if (tenterVoiceP) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(44, tenterVoiceP);
       }
       tenterVoiceP = this.closeMicDuration;
       if (tenterVoiceP) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(45, tenterVoiceP);
       }
       trole = this.inviteMicChannel;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(46, trole);
       }
       if (!(this.theaterId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(47, this.theaterId);
       }
       if (!(this.teampkId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(48, this.teampkId);
       }
       if (!(this.teamPkRoomId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(49, this.teamPkRoomId);
       }
       trole = this.micType;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(50, trole);
       }
       trole = this.micNameNum;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(51, trole);
       }
       trole = this.micVipNum;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(52, trole);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$LiveVoicePartyPackageV2 mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          int i1 = 3;
          switch (i){
              case 0:
                return this;
              case 10:
                this.voicePartyId = p0.readString();
                break;
              case 16:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != i1 && i != 4)))) {
                   continue ;
                }else {
                   this.role = i;
                }
                break;
              case 24:
                this.guestNumber = p0.readUInt32();
                break;
              case 32:
                this.isMicOpen = p0.readBool();
                break;
              case '*':
                this.selectedMicSeatUserId = p0.readString();
                break;
              case '0':
                this.selectedMicSeatUserIndex = p0.readUInt32();
                break;
              case '8':
                this.appliedAudienceNumber = p0.readUInt32();
                break;
              case '@':
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
                    case 1:
                      break;
                    default:
                }
                this.leaveMicSeatReason = i;
                break;
              case 'H':
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.leaveVoicePartyReason = i;
                }
                break;
              case 'P':
                this.enterVoicePartyTimestamp = p0.readUInt64();
                break;
              case 'X':
                this.leaveVoicePartyTimestamp = p0.readUInt64();
                break;
              case '`':
                this.enterMicSeatTimestamp = p0.readUInt64();
                break;
              case 'h':
                this.leaveMicSeatTimestamp = p0.readUInt64();
                break;
              case 'p':
                i = p0.readInt32();
                if (i && i != 1) {
                   continue ;
                }else {
                   this.entryPage = i;
                }
                break;
              case 'x':
                i = p0.readInt32();
                if (i && i != 1) {
                   continue ;
                }else {
                   this.mode = i;
                }
                break;
              case 128:
                this.enterKtvStageTimestamp = p0.readUInt64();
                break;
              case 136:
                this.leaveKtvStageTimestamp = p0.readUInt64();
                break;
              case 144:
                this.ktvOrderListSongNumber = p0.readUInt32();
                break;
              case 152:
                this.ktvOrderListAudienceNumber = p0.readUInt32();
                break;
              case 162:
                this.ktvId = p0.readString();
                break;
              case 168:
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 1:
                      break;
                    default:
                }
                this.leaveKtvStageReason = i;
                break;
              case 176:
                this.ktvTotalSungSongNumber = p0.readUInt32();
                break;
              case 184:
                this.ktvTotalSungSingerNumber = p0.readUInt32();
                break;
              case 192:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != i1))) {
                   continue ;
                }else {
                   this.leaveKtvReason = i;
                }
                break;
              case 200:
                this.ktvSelfOrderSongNumber = p0.readUInt32();
                break;
              case 208:
                this.ktvSelfOrderSongIndex = p0.readUInt32();
                break;
              case 216:
                this.ktvSelfSungSongNumber = p0.readUInt32();
                break;
              case 224:
                this.ktvIsSingerSinging = p0.readBool();
                break;
              case 232:
                this.enterKtvTimestamp = p0.readUInt64();
                break;
              case 240:
                this.leaveKtvTimestamp = p0.readUInt64();
                break;
              case 248:
                i = p0.readInt32();
                if (i && i != 1) {
                   continue ;
                }else {
                   this.singerPlayBgmTrigger = i;
                }
                break;
              case 256:
                this.audioBeginTimestamp = p0.readUInt64();
                break;
              case 264:
                this.audioEndTimestamp = p0.readUInt64();
                break;
              case 272:
                this.videoBeginTimestamp = p0.readUInt64();
                break;
              case 280:
                this.videoEndTimestamp = p0.readUInt64();
                break;
              case 288:
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
                    case 1:
                      break;
                    default:
                }
                this.enterMicSeatReason = i;
                break;
              case 298:
                this.channelId = p0.readString();
                break;
              case 306:
                this.channelName = p0.readString();
                break;
              case 314:
                this.topicId = p0.readString();
                break;
              case 322:
                this.topicName = p0.readString();
                break;
              case 328:
                this.isChannelSelect = p0.readBool();
                break;
              case 336:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != i1))) {
                   continue ;
                }else {
                   this.micStatus = i;
                }
                break;
              case 344:
                this.serverMicStatus = p0.readUInt32();
                break;
              case 352:
                this.micSetDuration = p0.readUInt64();
                break;
              case 360:
                this.closeMicDuration = p0.readUInt64();
                break;
              case 368:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != i1))) {
                   continue ;
                }else {
                   this.inviteMicChannel = i;
                }
                break;
              case 378:
                this.theaterId = p0.readString();
                break;
              case 386:
                this.teampkId = p0.readString();
                break;
              case 394:
                this.teamPkRoomId = p0.readString();
                break;
              case 400:
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.micType = i;
                }
                break;
              case 408:
                this.micNameNum = p0.readUInt32();
                break;
              case 416:
                this.micVipNum = p0.readUInt32();
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
       if (!(this.voicePartyId).equals(str)) {
          p0.writeString(1, this.voicePartyId);
       }
       ClientContent$LiveVoicePartyPackageV2 trole = this.role;
       if (trole != null) {
          p0.writeInt32(2, trole);
       }
       trole = this.guestNumber;
       if (trole != null) {
          p0.writeUInt32(3, trole);
       }
       trole = this.isMicOpen;
       if (trole != null) {
          p0.writeBool(4, trole);
       }
       if (!(this.selectedMicSeatUserId).equals(str)) {
          p0.writeString(5, this.selectedMicSeatUserId);
       }
       trole = this.selectedMicSeatUserIndex;
       if (trole != null) {
          p0.writeUInt32(6, trole);
       }
       trole = this.appliedAudienceNumber;
       if (trole != null) {
          p0.writeUInt32(7, trole);
       }
       trole = this.leaveMicSeatReason;
       if (trole != null) {
          p0.writeInt32(8, trole);
       }
       trole = this.leaveVoicePartyReason;
       if (trole != null) {
          p0.writeInt32(9, trole);
       }
       ClientContent$LiveVoicePartyPackageV2 tenterVoiceP = this.enterVoicePartyTimestamp;
       if (tenterVoiceP) {
          p0.writeUInt64(10, tenterVoiceP);
       }
       tenterVoiceP = this.leaveVoicePartyTimestamp;
       if (tenterVoiceP) {
          p0.writeUInt64(11, tenterVoiceP);
       }
       tenterVoiceP = this.enterMicSeatTimestamp;
       if (tenterVoiceP) {
          p0.writeUInt64(12, tenterVoiceP);
       }
       tenterVoiceP = this.leaveMicSeatTimestamp;
       if (tenterVoiceP) {
          p0.writeUInt64(13, tenterVoiceP);
       }
       trole = this.entryPage;
       if (trole != null) {
          p0.writeInt32(14, trole);
       }
       trole = this.mode;
       if (trole != null) {
          p0.writeInt32(15, trole);
       }
       tenterVoiceP = this.enterKtvStageTimestamp;
       if (tenterVoiceP) {
          p0.writeUInt64(16, tenterVoiceP);
       }
       tenterVoiceP = this.leaveKtvStageTimestamp;
       if (tenterVoiceP) {
          p0.writeUInt64(17, tenterVoiceP);
       }
       trole = this.ktvOrderListSongNumber;
       if (trole != null) {
          p0.writeUInt32(18, trole);
       }
       trole = this.ktvOrderListAudienceNumber;
       if (trole != null) {
          p0.writeUInt32(19, trole);
       }
       if (!(this.ktvId).equals(str)) {
          p0.writeString(20, this.ktvId);
       }
       trole = this.leaveKtvStageReason;
       if (trole != null) {
          p0.writeInt32(21, trole);
       }
       trole = this.ktvTotalSungSongNumber;
       if (trole != null) {
          p0.writeUInt32(22, trole);
       }
       trole = this.ktvTotalSungSingerNumber;
       if (trole != null) {
          p0.writeUInt32(23, trole);
       }
       trole = this.leaveKtvReason;
       if (trole != null) {
          p0.writeInt32(24, trole);
       }
       trole = this.ktvSelfOrderSongNumber;
       if (trole != null) {
          p0.writeUInt32(25, trole);
       }
       trole = this.ktvSelfOrderSongIndex;
       if (trole != null) {
          p0.writeUInt32(26, trole);
       }
       trole = this.ktvSelfSungSongNumber;
       if (trole != null) {
          p0.writeUInt32(27, trole);
       }
       trole = this.ktvIsSingerSinging;
       if (trole != null) {
          p0.writeBool(28, trole);
       }
       tenterVoiceP = this.enterKtvTimestamp;
       if (tenterVoiceP) {
          p0.writeUInt64(29, tenterVoiceP);
       }
       tenterVoiceP = this.leaveKtvTimestamp;
       if (tenterVoiceP) {
          p0.writeUInt64(30, tenterVoiceP);
       }
       trole = this.singerPlayBgmTrigger;
       if (trole != null) {
          p0.writeInt32(31, trole);
       }
       tenterVoiceP = this.audioBeginTimestamp;
       if (tenterVoiceP) {
          p0.writeUInt64(32, tenterVoiceP);
       }
       tenterVoiceP = this.audioEndTimestamp;
       if (tenterVoiceP) {
          p0.writeUInt64(33, tenterVoiceP);
       }
       tenterVoiceP = this.videoBeginTimestamp;
       if (tenterVoiceP) {
          p0.writeUInt64(34, tenterVoiceP);
       }
       tenterVoiceP = this.videoEndTimestamp;
       if (tenterVoiceP) {
          p0.writeUInt64(35, tenterVoiceP);
       }
       trole = this.enterMicSeatReason;
       if (trole != null) {
          p0.writeInt32(36, trole);
       }
       if (!(this.channelId).equals(str)) {
          p0.writeString(37, this.channelId);
       }
       if (!(this.channelName).equals(str)) {
          p0.writeString(38, this.channelName);
       }
       if (!(this.topicId).equals(str)) {
          p0.writeString(39, this.topicId);
       }
       if (!(this.topicName).equals(str)) {
          p0.writeString(40, this.topicName);
       }
       trole = this.isChannelSelect;
       if (trole != null) {
          p0.writeBool(41, trole);
       }
       trole = this.micStatus;
       if (trole != null) {
          p0.writeInt32(42, trole);
       }
       trole = this.serverMicStatus;
       if (trole != null) {
          p0.writeUInt32(43, trole);
       }
       tenterVoiceP = this.micSetDuration;
       if (tenterVoiceP) {
          p0.writeUInt64(44, tenterVoiceP);
       }
       tenterVoiceP = this.closeMicDuration;
       if (tenterVoiceP) {
          p0.writeUInt64(45, tenterVoiceP);
       }
       trole = this.inviteMicChannel;
       if (trole != null) {
          p0.writeInt32(46, trole);
       }
       if (!(this.theaterId).equals(str)) {
          p0.writeString(47, this.theaterId);
       }
       if (!(this.teampkId).equals(str)) {
          p0.writeString(48, this.teampkId);
       }
       if (!(this.teamPkRoomId).equals(str)) {
          p0.writeString(49, this.teamPkRoomId);
       }
       trole = this.micType;
       if (trole != null) {
          p0.writeInt32(50, trole);
       }
       trole = this.micNameNum;
       if (trole != null) {
          p0.writeUInt32(51, trole);
       }
       trole = this.micVipNum;
       if (trole != null) {
          p0.writeUInt32(52, trole);
       }
       super.writeTo(p0);
       return;
    }
}
