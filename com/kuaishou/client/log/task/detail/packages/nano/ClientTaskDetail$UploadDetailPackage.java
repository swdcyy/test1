package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$UploadDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$UploadDetailPackage extends MessageNano	// class@00148a
{
    public boolean adaptableUploadEnabled;
    public boolean backgroundHttpUsed;
    public long completedLength;
    public long encodeConfigId;
    public int failedSegments;
    public long fileLength;
    public int fileType;
    public String host;
    public String ip;
    public boolean isUploadRecover;
    public String photoSource;
    public int pipelineCloseReason;
    public boolean pipelineFailedThenFallback;
    public String pipelineStatistic;
    public int pipelineStatus;
    public String postId;
    public boolean segmentUploadEnabled;
    public boolean segmentUploadFirst;
    public int segmentUploadTryCount;
    public int segments;
    public int streamPauseTime;
    public long transcodeAndPublishVideoDuration;
    public long transcodeAndPublishVideoDurationForeground;
    public int uploadMode;
    public int userRetryCount;
    public long userWaitingTime;
    public long userWaitingTimeForeground;
    public long videoDuration;
    public int wholeUploadTryCount;
    public static ClientTaskDetail$UploadDetailPackage[] _emptyArray;

    public void ClientTaskDetail$UploadDetailPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$UploadDetailPackage[] emptyArray(){
       if (ClientTaskDetail$UploadDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$UploadDetailPackage._emptyArray == null) {
             ClientTaskDetail$UploadDetailPackage[] uploadDetail = new ClientTaskDetail$UploadDetailPackage[0];
             ClientTaskDetail$UploadDetailPackage._emptyArray = uploadDetail;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$UploadDetailPackage._emptyArray;
    }
    public static ClientTaskDetail$UploadDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$UploadDetailPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$UploadDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$UploadDetailPackage(), p0);
    }
    public ClientTaskDetail$UploadDetailPackage clear(){
       this.fileLength = 0;
       this.fileType = 0;
       this.host = "";
       this.ip = "";
       this.completedLength = 0;
       this.encodeConfigId = 0;
       this.segments = 0;
       this.failedSegments = 0;
       this.segmentUploadEnabled = false;
       this.segmentUploadFirst = false;
       this.segmentUploadTryCount = 0;
       this.wholeUploadTryCount = 0;
       this.postId = "";
       this.videoDuration = 0;
       this.pipelineStatistic = "";
       this.pipelineStatus = 0;
       this.pipelineCloseReason = 0;
       this.transcodeAndPublishVideoDuration = 0;
       this.pipelineFailedThenFallback = false;
       this.userWaitingTime = 0;
       this.adaptableUploadEnabled = false;
       this.uploadMode = 0;
       this.userRetryCount = 0;
       this.transcodeAndPublishVideoDurationForeground = 0;
       this.userWaitingTimeForeground = 0;
       this.backgroundHttpUsed = false;
       this.streamPauseTime = 0;
       this.photoSource = "";
       this.isUploadRecover = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientTaskDetail$UploadDetailPackage tfileLength = this.fileLength;
       int i1 = 0;
       if (tfileLength - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tfileLength);
       }
       tfileLength = this.fileType;
       if (tfileLength != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tfileLength);
       }
       String str = "";
       if (!(this.host).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.host);
       }
       if (!(this.ip).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.ip);
       }
       ClientTaskDetail$UploadDetailPackage tcompletedLe = this.completedLength;
       if (tcompletedLe - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tcompletedLe);
       }
       tcompletedLe = this.encodeConfigId;
       if (tcompletedLe - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tcompletedLe);
       }
       tfileLength = this.segments;
       if (tfileLength != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tfileLength);
       }
       tfileLength = this.failedSegments;
       if (tfileLength != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, tfileLength);
       }
       tfileLength = this.segmentUploadEnabled;
       if (tfileLength != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(9, tfileLength);
       }
       tfileLength = this.segmentUploadFirst;
       if (tfileLength != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, tfileLength);
       }
       tfileLength = this.segmentUploadTryCount;
       if (tfileLength != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(11, tfileLength);
       }
       tfileLength = this.wholeUploadTryCount;
       if (tfileLength != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(12, tfileLength);
       }
       if (!(this.postId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.postId);
       }
       tcompletedLe = this.videoDuration;
       if (tcompletedLe - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(14, tcompletedLe);
       }
       if (!(this.pipelineStatistic).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.pipelineStatistic);
       }
       tfileLength = this.pipelineStatus;
       if (tfileLength != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(16, tfileLength);
       }
       tfileLength = this.pipelineCloseReason;
       if (tfileLength != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(17, tfileLength);
       }
       tcompletedLe = this.transcodeAndPublishVideoDuration;
       if (tcompletedLe - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(18, tcompletedLe);
       }
       tfileLength = this.pipelineFailedThenFallback;
       if (tfileLength != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(19, tfileLength);
       }
       tcompletedLe = this.userWaitingTime;
       if (tcompletedLe - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(20, tcompletedLe);
       }
       tfileLength = this.adaptableUploadEnabled;
       if (tfileLength != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(21, tfileLength);
       }
       tfileLength = this.uploadMode;
       if (tfileLength != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(22, tfileLength);
       }
       tfileLength = this.userRetryCount;
       if (tfileLength != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(23, tfileLength);
       }
       tcompletedLe = this.transcodeAndPublishVideoDurationForeground;
       if (tcompletedLe - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(24, tcompletedLe);
       }
       tcompletedLe = this.userWaitingTimeForeground;
       if (tcompletedLe - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(25, tcompletedLe);
       }
       tfileLength = this.backgroundHttpUsed;
       if (tfileLength != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(26, tfileLength);
       }
       tfileLength = this.streamPauseTime;
       if (tfileLength != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(27, tfileLength);
       }
       if (!(this.photoSource).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(28, this.photoSource);
       }
       tfileLength = this.isUploadRecover;
       if (tfileLength != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(29, tfileLength);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$UploadDetailPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                this.fileLength = p0.readUInt64();
                break;
              case 16:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && (i != 4 && i != 5))))) {
                   continue ;
                }else {
                   this.fileType = i;
                }
                break;
              case 26:
                this.host = p0.readString();
                break;
              case '"':
                this.ip = p0.readString();
                break;
              case '(':
                this.completedLength = p0.readUInt64();
                break;
              case '0':
                this.encodeConfigId = p0.readUInt64();
                break;
              case '8':
                this.segments = p0.readUInt32();
                break;
              case '@':
                this.failedSegments = p0.readUInt32();
                break;
              case 'H':
                this.segmentUploadEnabled = p0.readBool();
                break;
              case 'P':
                this.segmentUploadFirst = p0.readBool();
                break;
              case 'X':
                this.segmentUploadTryCount = p0.readUInt32();
                break;
              case '`':
                this.wholeUploadTryCount = p0.readUInt32();
                break;
              case 'j':
                this.postId = p0.readString();
                break;
              case 'p':
                this.videoDuration = p0.readUInt64();
                break;
              case 'z':
                this.pipelineStatistic = p0.readString();
                break;
              case 128:
                this.pipelineStatus = p0.readUInt32();
                break;
              case 136:
                this.pipelineCloseReason = p0.readUInt32();
                break;
              case 144:
                this.transcodeAndPublishVideoDuration = p0.readUInt64();
                break;
              case 152:
                this.pipelineFailedThenFallback = p0.readBool();
                break;
              case 160:
                this.userWaitingTime = p0.readUInt64();
                break;
              case 168:
                this.adaptableUploadEnabled = p0.readBool();
                break;
              case 176:
                this.uploadMode = p0.readUInt32();
                break;
              case 184:
                this.userRetryCount = p0.readUInt32();
                break;
              case 192:
                this.transcodeAndPublishVideoDurationForeground = p0.readUInt64();
                break;
              case 200:
                this.userWaitingTimeForeground = p0.readUInt64();
                break;
              case 208:
                this.backgroundHttpUsed = p0.readBool();
                break;
              case 216:
                this.streamPauseTime = p0.readUInt32();
                break;
              case 226:
                this.photoSource = p0.readString();
                break;
              case 232:
                this.isUploadRecover = p0.readBool();
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
       ClientTaskDetail$UploadDetailPackage tfileLength = this.fileLength;
       int i = 0;
       if (tfileLength - i) {
          p0.writeUInt64(1, tfileLength);
       }
       tfileLength = this.fileType;
       if (tfileLength != null) {
          p0.writeInt32(2, tfileLength);
       }
       String str = "";
       if (!(this.host).equals(str)) {
          p0.writeString(3, this.host);
       }
       if (!(this.ip).equals(str)) {
          p0.writeString(4, this.ip);
       }
       ClientTaskDetail$UploadDetailPackage tcompletedLe = this.completedLength;
       if (tcompletedLe - i) {
          p0.writeUInt64(5, tcompletedLe);
       }
       tcompletedLe = this.encodeConfigId;
       if (tcompletedLe - i) {
          p0.writeUInt64(6, tcompletedLe);
       }
       tfileLength = this.segments;
       if (tfileLength != null) {
          p0.writeUInt32(7, tfileLength);
       }
       tfileLength = this.failedSegments;
       if (tfileLength != null) {
          p0.writeUInt32(8, tfileLength);
       }
       tfileLength = this.segmentUploadEnabled;
       if (tfileLength != null) {
          p0.writeBool(9, tfileLength);
       }
       tfileLength = this.segmentUploadFirst;
       if (tfileLength != null) {
          p0.writeBool(10, tfileLength);
       }
       tfileLength = this.segmentUploadTryCount;
       if (tfileLength != null) {
          p0.writeUInt32(11, tfileLength);
       }
       tfileLength = this.wholeUploadTryCount;
       if (tfileLength != null) {
          p0.writeUInt32(12, tfileLength);
       }
       if (!(this.postId).equals(str)) {
          p0.writeString(13, this.postId);
       }
       tcompletedLe = this.videoDuration;
       if (tcompletedLe - i) {
          p0.writeUInt64(14, tcompletedLe);
       }
       if (!(this.pipelineStatistic).equals(str)) {
          p0.writeString(15, this.pipelineStatistic);
       }
       tfileLength = this.pipelineStatus;
       if (tfileLength != null) {
          p0.writeUInt32(16, tfileLength);
       }
       tfileLength = this.pipelineCloseReason;
       if (tfileLength != null) {
          p0.writeUInt32(17, tfileLength);
       }
       tcompletedLe = this.transcodeAndPublishVideoDuration;
       if (tcompletedLe - i) {
          p0.writeUInt64(18, tcompletedLe);
       }
       tfileLength = this.pipelineFailedThenFallback;
       if (tfileLength != null) {
          p0.writeBool(19, tfileLength);
       }
       tcompletedLe = this.userWaitingTime;
       if (tcompletedLe - i) {
          p0.writeUInt64(20, tcompletedLe);
       }
       tfileLength = this.adaptableUploadEnabled;
       if (tfileLength != null) {
          p0.writeBool(21, tfileLength);
       }
       tfileLength = this.uploadMode;
       if (tfileLength != null) {
          p0.writeUInt32(22, tfileLength);
       }
       tfileLength = this.userRetryCount;
       if (tfileLength != null) {
          p0.writeUInt32(23, tfileLength);
       }
       tcompletedLe = this.transcodeAndPublishVideoDurationForeground;
       if (tcompletedLe - i) {
          p0.writeUInt64(24, tcompletedLe);
       }
       tcompletedLe = this.userWaitingTimeForeground;
       if (tcompletedLe - i) {
          p0.writeUInt64(25, tcompletedLe);
       }
       tfileLength = this.backgroundHttpUsed;
       if (tfileLength != null) {
          p0.writeBool(26, tfileLength);
       }
       tfileLength = this.streamPauseTime;
       if (tfileLength != null) {
          p0.writeUInt32(27, tfileLength);
       }
       if (!(this.photoSource).equals(str)) {
          p0.writeString(28, this.photoSource);
       }
       tfileLength = this.isUploadRecover;
       if (tfileLength != null) {
          p0.writeBool(29, tfileLength);
       }
       super.writeTo(p0);
       return;
    }
}
