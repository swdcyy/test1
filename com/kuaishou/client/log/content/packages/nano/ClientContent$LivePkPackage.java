package com.kuaishou.client.log.content.packages.nano.ClientContent$LivePkPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$LivePkPackage extends MessageNano	// class@001273
{
    public int audienceWatchEndReason;
    public long audienceWatchEndTime;
    public long audienceWatchStartTime;
    public String displayedOpponentWatcherNumber;
    public String endFeedbacks;
    public int endReason;
    public int entranceType;
    public String gameId;
    public String gameName;
    public String interestCommon;
    public String liveStreamId;
    public int onlinePkFriendNumber;
    public int opponentPkScore;
    public int opponentType;
    public String opponentUserId;
    public int opponentWatcherNumber;
    public long pkCloseMicrophoneDuration;
    public long pkConnectTimestamp;
    public long pkEndTimestamp;
    public String pkId;
    public int pkLoserPunishMagicFaceId;
    public long pkPlayTimestamp;
    public int pkScore;
    public String roomId;
    public String userId;
    public static ClientContent$LivePkPackage[] _emptyArray;

    public void ClientContent$LivePkPackage(){
       super();
       this.clear();
    }
    public static ClientContent$LivePkPackage[] emptyArray(){
       if (ClientContent$LivePkPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$LivePkPackage._emptyArray == null) {
             ClientContent$LivePkPackage[] livePkPackag = new ClientContent$LivePkPackage[0];
             ClientContent$LivePkPackage._emptyArray = livePkPackag;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$LivePkPackage._emptyArray;
    }
    public static ClientContent$LivePkPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$LivePkPackage().mergeFrom(p0);
    }
    public static ClientContent$LivePkPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$LivePkPackage(), p0);
    }
    public ClientContent$LivePkPackage clear(){
       this.opponentType = 0;
       this.entranceType = 0;
       this.userId = "";
       this.opponentUserId = "";
       this.liveStreamId = "";
       this.roomId = "";
       this.pkId = "";
       this.pkScore = 0;
       this.opponentPkScore = 0;
       this.onlinePkFriendNumber = 0;
       this.opponentWatcherNumber = 0;
       this.endReason = 0;
       this.displayedOpponentWatcherNumber = "";
       this.pkCloseMicrophoneDuration = 0;
       this.endFeedbacks = "";
       this.pkConnectTimestamp = 0;
       this.pkPlayTimestamp = 0;
       this.pkEndTimestamp = 0;
       this.interestCommon = "";
       this.pkLoserPunishMagicFaceId = 0;
       this.audienceWatchStartTime = 0;
       this.audienceWatchEndTime = 0;
       this.audienceWatchEndReason = 0;
       this.gameId = "";
       this.gameName = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$LivePkPackage topponentTyp = this.opponentType;
       if (topponentTyp != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, topponentTyp);
       }
       topponentTyp = this.entranceType;
       if (topponentTyp != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, topponentTyp);
       }
       String str = "";
       if (!(this.userId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.userId);
       }
       if (!(this.opponentUserId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.opponentUserId);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.liveStreamId);
       }
       if (!(this.roomId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.roomId);
       }
       if (!(this.pkId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.pkId);
       }
       topponentTyp = this.pkScore;
       if (topponentTyp != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, topponentTyp);
       }
       topponentTyp = this.opponentPkScore;
       if (topponentTyp != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(9, topponentTyp);
       }
       topponentTyp = this.onlinePkFriendNumber;
       if (topponentTyp != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(10, topponentTyp);
       }
       topponentTyp = this.opponentWatcherNumber;
       if (topponentTyp != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(11, topponentTyp);
       }
       topponentTyp = this.endReason;
       if (topponentTyp != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(12, topponentTyp);
       }
       if (!(this.displayedOpponentWatcherNumber).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.displayedOpponentWatcherNumber);
       }
       ClientContent$LivePkPackage tpkCloseMicr = this.pkCloseMicrophoneDuration;
       if (tpkCloseMicr) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(14, tpkCloseMicr);
       }
       if (!(this.endFeedbacks).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.endFeedbacks);
       }
       tpkCloseMicr = this.pkConnectTimestamp;
       if (tpkCloseMicr) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(16, tpkCloseMicr);
       }
       tpkCloseMicr = this.pkPlayTimestamp;
       if (tpkCloseMicr) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(17, tpkCloseMicr);
       }
       tpkCloseMicr = this.pkEndTimestamp;
       if (tpkCloseMicr) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(18, tpkCloseMicr);
       }
       if (!(this.interestCommon).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(19, this.interestCommon);
       }
       topponentTyp = this.pkLoserPunishMagicFaceId;
       if (topponentTyp != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(20, topponentTyp);
       }
       tpkCloseMicr = this.audienceWatchStartTime;
       if (tpkCloseMicr) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(21, tpkCloseMicr);
       }
       tpkCloseMicr = this.audienceWatchEndTime;
       if (tpkCloseMicr) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(22, tpkCloseMicr);
       }
       topponentTyp = this.audienceWatchEndReason;
       if (topponentTyp != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(23, topponentTyp);
       }
       if (!(this.gameId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(24, this.gameId);
       }
       if (!(this.gameName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(25, this.gameName);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$LivePkPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          int i1 = 2;
          switch (i){
              case 0:
                return this;
              case 8:
                i = p0.readInt32();
                if (i && (i != 1 && i != i1)) {
                   continue ;
                }else {
                   this.opponentType = i;
                }
                break;
              case 16:
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
                this.entranceType = i;
                break;
              case 26:
                this.userId = p0.readString();
                break;
              case '"':
                this.opponentUserId = p0.readString();
                break;
              case '*':
                this.liveStreamId = p0.readString();
                break;
              case '2':
                this.roomId = p0.readString();
                break;
              case ':':
                this.pkId = p0.readString();
                break;
              case '@':
                this.pkScore = p0.readUInt32();
                break;
              case 'H':
                this.opponentPkScore = p0.readUInt32();
                break;
              case 'P':
                this.onlinePkFriendNumber = p0.readUInt32();
                break;
              case 'X':
                this.opponentWatcherNumber = p0.readUInt32();
                break;
              case '`':
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
                this.endReason = i;
                break;
              case 'j':
                this.displayedOpponentWatcherNumber = p0.readString();
                break;
              case 'p':
                this.pkCloseMicrophoneDuration = p0.readUInt64();
                break;
              case 'z':
                this.endFeedbacks = p0.readString();
                break;
              case 128:
                this.pkConnectTimestamp = p0.readUInt64();
                break;
              case 136:
                this.pkPlayTimestamp = p0.readUInt64();
                break;
              case 144:
                this.pkEndTimestamp = p0.readUInt64();
                break;
              case 154:
                this.interestCommon = p0.readString();
                break;
              case 160:
                this.pkLoserPunishMagicFaceId = p0.readUInt32();
                break;
              case 168:
                this.audienceWatchStartTime = p0.readUInt64();
                break;
              case 176:
                this.audienceWatchEndTime = p0.readUInt64();
                break;
              case 184:
                i = p0.readInt32();
                if (i && (i != 1 && (i != i1 && (i != 3 && (i != 4 && i != 5))))) {
                   continue ;
                }else {
                   this.audienceWatchEndReason = i;
                }
                break;
              case 194:
                this.gameId = p0.readString();
                break;
              case 202:
                this.gameName = p0.readString();
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
       ClientContent$LivePkPackage topponentTyp = this.opponentType;
       if (topponentTyp != null) {
          p0.writeInt32(1, topponentTyp);
       }
       topponentTyp = this.entranceType;
       if (topponentTyp != null) {
          p0.writeInt32(2, topponentTyp);
       }
       String str = "";
       if (!(this.userId).equals(str)) {
          p0.writeString(3, this.userId);
       }
       if (!(this.opponentUserId).equals(str)) {
          p0.writeString(4, this.opponentUserId);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(5, this.liveStreamId);
       }
       if (!(this.roomId).equals(str)) {
          p0.writeString(6, this.roomId);
       }
       if (!(this.pkId).equals(str)) {
          p0.writeString(7, this.pkId);
       }
       topponentTyp = this.pkScore;
       if (topponentTyp != null) {
          p0.writeUInt32(8, topponentTyp);
       }
       topponentTyp = this.opponentPkScore;
       if (topponentTyp != null) {
          p0.writeUInt32(9, topponentTyp);
       }
       topponentTyp = this.onlinePkFriendNumber;
       if (topponentTyp != null) {
          p0.writeUInt32(10, topponentTyp);
       }
       topponentTyp = this.opponentWatcherNumber;
       if (topponentTyp != null) {
          p0.writeUInt32(11, topponentTyp);
       }
       topponentTyp = this.endReason;
       if (topponentTyp != null) {
          p0.writeInt32(12, topponentTyp);
       }
       if (!(this.displayedOpponentWatcherNumber).equals(str)) {
          p0.writeString(13, this.displayedOpponentWatcherNumber);
       }
       ClientContent$LivePkPackage tpkCloseMicr = this.pkCloseMicrophoneDuration;
       if (tpkCloseMicr) {
          p0.writeUInt64(14, tpkCloseMicr);
       }
       if (!(this.endFeedbacks).equals(str)) {
          p0.writeString(15, this.endFeedbacks);
       }
       tpkCloseMicr = this.pkConnectTimestamp;
       if (tpkCloseMicr) {
          p0.writeUInt64(16, tpkCloseMicr);
       }
       tpkCloseMicr = this.pkPlayTimestamp;
       if (tpkCloseMicr) {
          p0.writeUInt64(17, tpkCloseMicr);
       }
       tpkCloseMicr = this.pkEndTimestamp;
       if (tpkCloseMicr) {
          p0.writeUInt64(18, tpkCloseMicr);
       }
       if (!(this.interestCommon).equals(str)) {
          p0.writeString(19, this.interestCommon);
       }
       topponentTyp = this.pkLoserPunishMagicFaceId;
       if (topponentTyp != null) {
          p0.writeUInt32(20, topponentTyp);
       }
       tpkCloseMicr = this.audienceWatchStartTime;
       if (tpkCloseMicr) {
          p0.writeUInt64(21, tpkCloseMicr);
       }
       tpkCloseMicr = this.audienceWatchEndTime;
       if (tpkCloseMicr) {
          p0.writeUInt64(22, tpkCloseMicr);
       }
       topponentTyp = this.audienceWatchEndReason;
       if (topponentTyp != null) {
          p0.writeInt32(23, topponentTyp);
       }
       if (!(this.gameId).equals(str)) {
          p0.writeString(24, this.gameId);
       }
       if (!(this.gameName).equals(str)) {
          p0.writeString(25, this.gameName);
       }
       super.writeTo(p0);
       return;
    }
}
