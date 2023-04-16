package com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyTeamPkPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$LiveVoicePartyTeamPkPackage extends MessageNano	// class@00129d
{
    public String pkId;
    public int pkStatus;
    public long playPkEndTimestamp;
    public long playPkStartTimestamp;
    public int playTeampkEndReason;
    public long playTeampkEndTimestamp;
    public long playTeampkStartTimestamp;
    public int teamHolder;
    public String teamPkRoomId;
    public long teampkCloseMicDuration;
    public long teampkMicEndTimestamp;
    public long teampkMicStartTimestamp;
    public static ClientContent$LiveVoicePartyTeamPkPackage[] _emptyArray;

    public void ClientContent$LiveVoicePartyTeamPkPackage(){
       super();
       this.clear();
    }
    public static ClientContent$LiveVoicePartyTeamPkPackage[] emptyArray(){
       if (ClientContent$LiveVoicePartyTeamPkPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$LiveVoicePartyTeamPkPackage._emptyArray == null) {
             ClientContent$LiveVoicePartyTeamPkPackage[] liveVoicePar = new ClientContent$LiveVoicePartyTeamPkPackage[0];
             ClientContent$LiveVoicePartyTeamPkPackage._emptyArray = liveVoicePar;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$LiveVoicePartyTeamPkPackage._emptyArray;
    }
    public static ClientContent$LiveVoicePartyTeamPkPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$LiveVoicePartyTeamPkPackage().mergeFrom(p0);
    }
    public static ClientContent$LiveVoicePartyTeamPkPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$LiveVoicePartyTeamPkPackage(), p0);
    }
    public ClientContent$LiveVoicePartyTeamPkPackage clear(){
       this.teamPkRoomId = "";
       this.playTeampkStartTimestamp = 0;
       this.playTeampkEndTimestamp = 0;
       this.playPkStartTimestamp = 0;
       this.playPkEndTimestamp = 0;
       this.pkId = "";
       this.playTeampkEndReason = 0;
       this.teamHolder = 0;
       this.pkStatus = 0;
       this.teampkMicStartTimestamp = 0;
       this.teampkMicEndTimestamp = 0;
       this.teampkCloseMicDuration = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.teamPkRoomId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.teamPkRoomId);
       }
       ClientContent$LiveVoicePartyTeamPkPackage tplayTeampkS = this.playTeampkStartTimestamp;
       if (tplayTeampkS) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tplayTeampkS);
       }
       tplayTeampkS = this.playTeampkEndTimestamp;
       if (tplayTeampkS) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tplayTeampkS);
       }
       tplayTeampkS = this.playPkStartTimestamp;
       if (tplayTeampkS) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tplayTeampkS);
       }
       tplayTeampkS = this.playPkEndTimestamp;
       if (tplayTeampkS) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tplayTeampkS);
       }
       if (!(this.pkId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.pkId);
       }
       ClientContent$LiveVoicePartyTeamPkPackage tplayTeampkE = this.playTeampkEndReason;
       if (tplayTeampkE != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, tplayTeampkE);
       }
       tplayTeampkE = this.teamHolder;
       if (tplayTeampkE != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tplayTeampkE);
       }
       tplayTeampkE = this.pkStatus;
       if (tplayTeampkE != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, tplayTeampkE);
       }
       tplayTeampkE = this.teampkMicStartTimestamp;
       if (tplayTeampkE) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(10, tplayTeampkE);
       }
       tplayTeampkE = this.teampkMicEndTimestamp;
       if (tplayTeampkE) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, tplayTeampkE);
       }
       tplayTeampkE = this.teampkCloseMicDuration;
       if (tplayTeampkE) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(12, tplayTeampkE);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$LiveVoicePartyTeamPkPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.teamPkRoomId = p0.readString();
                break;
              case 16:
                this.playTeampkStartTimestamp = p0.readUInt64();
                break;
              case 24:
                this.playTeampkEndTimestamp = p0.readUInt64();
                break;
              case 32:
                this.playPkStartTimestamp = p0.readUInt64();
                break;
              case '(':
                this.playPkEndTimestamp = p0.readUInt64();
                break;
              case '2':
                this.pkId = p0.readString();
                break;
              case '8':
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.playTeampkEndReason = i;
                }
                break;
              case '@':
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.teamHolder = i;
                }
                break;
              case 'H':
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.pkStatus = i;
                }
                break;
              case 'P':
                this.teampkMicStartTimestamp = p0.readUInt64();
                break;
              case 'X':
                this.teampkMicEndTimestamp = p0.readUInt64();
                break;
              case '`':
                this.teampkCloseMicDuration = p0.readUInt64();
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
       if (!(this.teamPkRoomId).equals(str)) {
          p0.writeString(1, this.teamPkRoomId);
       }
       ClientContent$LiveVoicePartyTeamPkPackage tplayTeampkS = this.playTeampkStartTimestamp;
       if (tplayTeampkS) {
          p0.writeUInt64(2, tplayTeampkS);
       }
       tplayTeampkS = this.playTeampkEndTimestamp;
       if (tplayTeampkS) {
          p0.writeUInt64(3, tplayTeampkS);
       }
       tplayTeampkS = this.playPkStartTimestamp;
       if (tplayTeampkS) {
          p0.writeUInt64(4, tplayTeampkS);
       }
       tplayTeampkS = this.playPkEndTimestamp;
       if (tplayTeampkS) {
          p0.writeUInt64(5, tplayTeampkS);
       }
       if (!(this.pkId).equals(str)) {
          p0.writeString(6, this.pkId);
       }
       ClientContent$LiveVoicePartyTeamPkPackage tplayTeampkE = this.playTeampkEndReason;
       if (tplayTeampkE != null) {
          p0.writeInt32(7, tplayTeampkE);
       }
       tplayTeampkE = this.teamHolder;
       if (tplayTeampkE != null) {
          p0.writeInt32(8, tplayTeampkE);
       }
       tplayTeampkE = this.pkStatus;
       if (tplayTeampkE != null) {
          p0.writeInt32(9, tplayTeampkE);
       }
       tplayTeampkE = this.teampkMicStartTimestamp;
       if (tplayTeampkE) {
          p0.writeUInt64(10, tplayTeampkE);
       }
       tplayTeampkE = this.teampkMicEndTimestamp;
       if (tplayTeampkE) {
          p0.writeUInt64(11, tplayTeampkE);
       }
       tplayTeampkE = this.teampkCloseMicDuration;
       if (tplayTeampkE) {
          p0.writeUInt64(12, tplayTeampkE);
       }
       super.writeTo(p0);
       return;
    }
}
