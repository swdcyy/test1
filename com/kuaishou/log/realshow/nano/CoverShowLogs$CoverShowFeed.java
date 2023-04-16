package com.kuaishou.log.realshow.nano.CoverShowLogs$CoverShowFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class CoverShowLogs$CoverShowFeed extends MessageNano	// class@0014a3
{
    public String actionLogId;
    public String authorId;
    public String clientPage;
    public long coverExposureDuration;
    public int coverExposureTimes;
    public int coverIndex;
    public long enterTimestamp;
    public String expTag;
    public int feedType;
    public long leaveTimestamp;
    public String liveStreamId;
    public String photoId;
    public long renderedTimestamp;
    public String reportContext;
    public String serverExpTag;
    public long serverLiveStreamId;
    public int subtype;
    public static CoverShowLogs$CoverShowFeed[] _emptyArray;

    public void CoverShowLogs$CoverShowFeed(){
       super();
       this.clear();
    }
    public static CoverShowLogs$CoverShowFeed[] emptyArray(){
       if (CoverShowLogs$CoverShowFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (CoverShowLogs$CoverShowFeed._emptyArray == null) {
             CoverShowLogs$CoverShowFeed[] uCoverShowFe = new CoverShowLogs$CoverShowFeed[0];
             CoverShowLogs$CoverShowFeed._emptyArray = uCoverShowFe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return CoverShowLogs$CoverShowFeed._emptyArray;
    }
    public static CoverShowLogs$CoverShowFeed parseFrom(CodedInputByteBufferNano p0){
       return new CoverShowLogs$CoverShowFeed().mergeFrom(p0);
    }
    public static CoverShowLogs$CoverShowFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new CoverShowLogs$CoverShowFeed(), p0);
    }
    public CoverShowLogs$CoverShowFeed clear(){
       this.feedType = 0;
       this.authorId = "";
       this.photoId = "";
       this.liveStreamId = "";
       this.expTag = "";
       this.serverLiveStreamId = 0;
       this.enterTimestamp = 0;
       this.renderedTimestamp = 0;
       this.leaveTimestamp = 0;
       this.coverIndex = 0;
       this.coverExposureDuration = 0;
       this.coverExposureTimes = 0;
       this.serverExpTag = "";
       this.clientPage = "";
       this.subtype = 0;
       this.reportContext = "";
       this.actionLogId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       CoverShowLogs$CoverShowFeed tuCoverShowF = this.feedType;
       if (tuCoverShowF != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tuCoverShowF);
       }
       String str = "";
       if (!(this.authorId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.authorId);
       }
       if (!(this.photoId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.photoId);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.liveStreamId);
       }
       if (!(this.expTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.expTag);
       }
       CoverShowLogs$CoverShowFeed tserverLiveS = this.serverLiveStreamId;
       if (tserverLiveS) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tserverLiveS);
       }
       tserverLiveS = this.enterTimestamp;
       if (tserverLiveS) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tserverLiveS);
       }
       tserverLiveS = this.renderedTimestamp;
       if (tserverLiveS) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tserverLiveS);
       }
       tserverLiveS = this.leaveTimestamp;
       if (tserverLiveS) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, tserverLiveS);
       }
       tuCoverShowF = this.coverIndex;
       if (tuCoverShowF != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(10, tuCoverShowF);
       }
       tserverLiveS = this.coverExposureDuration;
       if (tserverLiveS) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, tserverLiveS);
       }
       tuCoverShowF = this.coverExposureTimes;
       if (tuCoverShowF != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(12, tuCoverShowF);
       }
       if (!(this.serverExpTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.serverExpTag);
       }
       if (!(this.clientPage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.clientPage);
       }
       tuCoverShowF = this.subtype;
       if (tuCoverShowF != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(15, tuCoverShowF);
       }
       if (!(this.reportContext).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(16, this.reportContext);
       }
       if (!(this.actionLogId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(17, this.actionLogId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public CoverShowLogs$CoverShowFeed mergeFrom(CodedInputByteBufferNano p0){
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
                    case 23:
                    case 24:
                    case 25:
                    case 1:
                      break;
                    default:
                }
                this.feedType = i;
                break;
              case 18:
                this.authorId = p0.readString();
                break;
              case 26:
                this.photoId = p0.readString();
                break;
              case '"':
                this.liveStreamId = p0.readString();
                break;
              case '*':
                this.expTag = p0.readString();
                break;
              case '0':
                this.serverLiveStreamId = p0.readUInt64();
                break;
              case '8':
                this.enterTimestamp = p0.readUInt64();
                break;
              case '@':
                this.renderedTimestamp = p0.readUInt64();
                break;
              case 'H':
                this.leaveTimestamp = p0.readUInt64();
                break;
              case 'P':
                this.coverIndex = p0.readInt32();
                break;
              case 'X':
                this.coverExposureDuration = p0.readUInt64();
                break;
              case '`':
                this.coverExposureTimes = p0.readInt32();
                break;
              case 'j':
                this.serverExpTag = p0.readString();
                break;
              case 'r':
                this.clientPage = p0.readString();
                break;
              case 'x':
                i = p0.readInt32();
                if (i && i != 1) {
                   continue ;
                }else {
                   this.subtype = i;
                }
                break;
              case 130:
                this.reportContext = p0.readString();
                break;
              case 138:
                this.actionLogId = p0.readString();
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
       CoverShowLogs$CoverShowFeed tuCoverShowF = this.feedType;
       if (tuCoverShowF != null) {
          p0.writeInt32(1, tuCoverShowF);
       }
       String str = "";
       if (!(this.authorId).equals(str)) {
          p0.writeString(2, this.authorId);
       }
       if (!(this.photoId).equals(str)) {
          p0.writeString(3, this.photoId);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(4, this.liveStreamId);
       }
       if (!(this.expTag).equals(str)) {
          p0.writeString(5, this.expTag);
       }
       CoverShowLogs$CoverShowFeed tserverLiveS = this.serverLiveStreamId;
       if (tserverLiveS) {
          p0.writeUInt64(6, tserverLiveS);
       }
       tserverLiveS = this.enterTimestamp;
       if (tserverLiveS) {
          p0.writeUInt64(7, tserverLiveS);
       }
       tserverLiveS = this.renderedTimestamp;
       if (tserverLiveS) {
          p0.writeUInt64(8, tserverLiveS);
       }
       tserverLiveS = this.leaveTimestamp;
       if (tserverLiveS) {
          p0.writeUInt64(9, tserverLiveS);
       }
       tuCoverShowF = this.coverIndex;
       if (tuCoverShowF != null) {
          p0.writeInt32(10, tuCoverShowF);
       }
       tserverLiveS = this.coverExposureDuration;
       if (tserverLiveS) {
          p0.writeUInt64(11, tserverLiveS);
       }
       tuCoverShowF = this.coverExposureTimes;
       if (tuCoverShowF != null) {
          p0.writeInt32(12, tuCoverShowF);
       }
       if (!(this.serverExpTag).equals(str)) {
          p0.writeString(13, this.serverExpTag);
       }
       if (!(this.clientPage).equals(str)) {
          p0.writeString(14, this.clientPage);
       }
       tuCoverShowF = this.subtype;
       if (tuCoverShowF != null) {
          p0.writeInt32(15, tuCoverShowF);
       }
       if (!(this.reportContext).equals(str)) {
          p0.writeString(16, this.reportContext);
       }
       if (!(this.actionLogId).equals(str)) {
          p0.writeString(17, this.actionLogId);
       }
       super.writeTo(p0);
       return;
    }
}
