package com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyTheaterPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$LiveVoicePartyTheaterPackage extends MessageNano	// class@0012a2
{
    public int audienceLeaveTheaterSeriesReason;
    public int authorLeaveTheaterSeriesReason;
    public long clearscteenDuration;
    public int dramaType;
    public long enterTheaterSeriesTimestamp;
    public long enterTheaterTimestamp;
    public long fullscreenDuration;
    public int index;
    public long landscapeDuration;
    public int leaveTheaterReason;
    public long leaveTheaterSeriesTimestamp;
    public long leaveTheaterTimestamp;
    public long pauseDuration;
    public long seekCount;
    public String seriesId;
    public long theaterCloseMicDuration;
    public String theaterId;
    public long theaterMicEndTimestamp;
    public long theaterMicStartTimestamp;
    public static ClientContent$LiveVoicePartyTheaterPackage[] _emptyArray;

    public void ClientContent$LiveVoicePartyTheaterPackage(){
       super();
       this.clear();
    }
    public static ClientContent$LiveVoicePartyTheaterPackage[] emptyArray(){
       if (ClientContent$LiveVoicePartyTheaterPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$LiveVoicePartyTheaterPackage._emptyArray == null) {
             ClientContent$LiveVoicePartyTheaterPackage[] liveVoicePar = new ClientContent$LiveVoicePartyTheaterPackage[0];
             ClientContent$LiveVoicePartyTheaterPackage._emptyArray = liveVoicePar;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$LiveVoicePartyTheaterPackage._emptyArray;
    }
    public static ClientContent$LiveVoicePartyTheaterPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$LiveVoicePartyTheaterPackage().mergeFrom(p0);
    }
    public static ClientContent$LiveVoicePartyTheaterPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$LiveVoicePartyTheaterPackage(), p0);
    }
    public ClientContent$LiveVoicePartyTheaterPackage clear(){
       this.theaterId = "";
       this.enterTheaterTimestamp = 0;
       this.leaveTheaterTimestamp = 0;
       this.enterTheaterSeriesTimestamp = 0;
       this.leaveTheaterSeriesTimestamp = 0;
       this.seriesId = "";
       this.index = 0;
       this.leaveTheaterReason = 0;
       this.authorLeaveTheaterSeriesReason = 0;
       this.audienceLeaveTheaterSeriesReason = 0;
       this.fullscreenDuration = 0;
       this.pauseDuration = 0;
       this.clearscteenDuration = 0;
       this.seekCount = 0;
       this.theaterMicStartTimestamp = 0;
       this.theaterMicEndTimestamp = 0;
       this.theaterCloseMicDuration = 0;
       this.dramaType = 0;
       this.landscapeDuration = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.theaterId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.theaterId);
       }
       ClientContent$LiveVoicePartyTheaterPackage tenterTheate = this.enterTheaterTimestamp;
       if (tenterTheate) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tenterTheate);
       }
       tenterTheate = this.leaveTheaterTimestamp;
       if (tenterTheate) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tenterTheate);
       }
       tenterTheate = this.enterTheaterSeriesTimestamp;
       if (tenterTheate) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tenterTheate);
       }
       tenterTheate = this.leaveTheaterSeriesTimestamp;
       if (tenterTheate) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tenterTheate);
       }
       if (!(this.seriesId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.seriesId);
       }
       ClientContent$LiveVoicePartyTheaterPackage tindex = this.index;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tindex);
       }
       tindex = this.leaveTheaterReason;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tindex);
       }
       tindex = this.authorLeaveTheaterSeriesReason;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, tindex);
       }
       tindex = this.audienceLeaveTheaterSeriesReason;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(10, tindex);
       }
       tindex = this.fullscreenDuration;
       if (tindex) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, tindex);
       }
       tindex = this.pauseDuration;
       if (tindex) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(12, tindex);
       }
       tindex = this.clearscteenDuration;
       if (tindex) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(13, tindex);
       }
       tindex = this.seekCount;
       if (tindex) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(14, tindex);
       }
       tindex = this.theaterMicStartTimestamp;
       if (tindex) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(15, tindex);
       }
       tindex = this.theaterMicEndTimestamp;
       if (tindex) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(16, tindex);
       }
       tindex = this.theaterCloseMicDuration;
       if (tindex) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(17, tindex);
       }
       tindex = this.dramaType;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(18, tindex);
       }
       tindex = this.landscapeDuration;
       if (tindex) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(19, tindex);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$LiveVoicePartyTheaterPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          int i1 = 4;
          switch (i){
              case 0:
                return this;
              case 10:
                this.theaterId = p0.readString();
                break;
              case 16:
                this.enterTheaterTimestamp = p0.readUInt64();
                break;
              case 24:
                this.leaveTheaterTimestamp = p0.readUInt64();
                break;
              case 32:
                this.enterTheaterSeriesTimestamp = p0.readUInt64();
                break;
              case '(':
                this.leaveTheaterSeriesTimestamp = p0.readUInt64();
                break;
              case '2':
                this.seriesId = p0.readString();
                break;
              case '8':
                this.index = p0.readUInt32();
                break;
              case '@':
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != i1)))) {
                   continue ;
                }else {
                   this.leaveTheaterReason = i;
                }
                break;
              case 'H':
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && (i != i1 && i != 5))))) {
                   continue ;
                }else {
                   this.authorLeaveTheaterSeriesReason = i;
                }
                break;
              case 'P':
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.audienceLeaveTheaterSeriesReason = i;
                }
                break;
              case 'X':
                this.fullscreenDuration = p0.readUInt64();
                break;
              case '`':
                this.pauseDuration = p0.readUInt64();
                break;
              case 'h':
                this.clearscteenDuration = p0.readUInt64();
                break;
              case 'p':
                this.seekCount = p0.readUInt64();
                break;
              case 'x':
                this.theaterMicStartTimestamp = p0.readUInt64();
                break;
              case 128:
                this.theaterMicEndTimestamp = p0.readUInt64();
                break;
              case 136:
                this.theaterCloseMicDuration = p0.readUInt64();
                break;
              case 144:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != i1)))) {
                   continue ;
                }else {
                   this.dramaType = i;
                }
                break;
              case 152:
                this.landscapeDuration = p0.readUInt64();
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
       if (!(this.theaterId).equals(str)) {
          p0.writeString(1, this.theaterId);
       }
       ClientContent$LiveVoicePartyTheaterPackage tenterTheate = this.enterTheaterTimestamp;
       if (tenterTheate) {
          p0.writeUInt64(2, tenterTheate);
       }
       tenterTheate = this.leaveTheaterTimestamp;
       if (tenterTheate) {
          p0.writeUInt64(3, tenterTheate);
       }
       tenterTheate = this.enterTheaterSeriesTimestamp;
       if (tenterTheate) {
          p0.writeUInt64(4, tenterTheate);
       }
       tenterTheate = this.leaveTheaterSeriesTimestamp;
       if (tenterTheate) {
          p0.writeUInt64(5, tenterTheate);
       }
       if (!(this.seriesId).equals(str)) {
          p0.writeString(6, this.seriesId);
       }
       ClientContent$LiveVoicePartyTheaterPackage tindex = this.index;
       if (tindex != null) {
          p0.writeUInt32(7, tindex);
       }
       tindex = this.leaveTheaterReason;
       if (tindex != null) {
          p0.writeInt32(8, tindex);
       }
       tindex = this.authorLeaveTheaterSeriesReason;
       if (tindex != null) {
          p0.writeInt32(9, tindex);
       }
       tindex = this.audienceLeaveTheaterSeriesReason;
       if (tindex != null) {
          p0.writeInt32(10, tindex);
       }
       tindex = this.fullscreenDuration;
       if (tindex) {
          p0.writeUInt64(11, tindex);
       }
       tindex = this.pauseDuration;
       if (tindex) {
          p0.writeUInt64(12, tindex);
       }
       tindex = this.clearscteenDuration;
       if (tindex) {
          p0.writeUInt64(13, tindex);
       }
       tindex = this.seekCount;
       if (tindex) {
          p0.writeUInt64(14, tindex);
       }
       tindex = this.theaterMicStartTimestamp;
       if (tindex) {
          p0.writeUInt64(15, tindex);
       }
       tindex = this.theaterMicEndTimestamp;
       if (tindex) {
          p0.writeUInt64(16, tindex);
       }
       tindex = this.theaterCloseMicDuration;
       if (tindex) {
          p0.writeUInt64(17, tindex);
       }
       tindex = this.dramaType;
       if (tindex != null) {
          p0.writeInt32(18, tindex);
       }
       tindex = this.landscapeDuration;
       if (tindex) {
          p0.writeUInt64(19, tindex);
       }
       super.writeTo(p0);
       return;
    }
}
