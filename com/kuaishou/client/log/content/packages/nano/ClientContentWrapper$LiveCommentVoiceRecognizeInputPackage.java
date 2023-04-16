package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveCommentVoiceRecognizeInputPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContentWrapper$LiveCommentVoiceRecognizeInputPackage extends MessageNano	// class@00131f
{
    public int audioRecordChannel;
    public int audioRecordCount;
    public int audioRecordSampleRate;
    public int networkFailCount;
    public long networkRequestAverageCost;
    public long networkRequestMaxCost;
    public int networkSuccessCount;
    public long recognizeBeginTimestamp;
    public long recognizeEndTimestamp;
    public String requestId;
    public String requestModel;
    public int totalFailCount;
    public int totalSuccessCount;
    public long transOpusAverageCost;
    public int transOpusFailCount;
    public long transOpusMaxCost;
    public int transOpusSuccessCount;
    public static ClientContentWrapper$LiveCommentVoiceRecognizeInputPackage[] _emptyArray;

    public void ClientContentWrapper$LiveCommentVoiceRecognizeInputPackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$LiveCommentVoiceRecognizeInputPackage[] emptyArray(){
       if (ClientContentWrapper$LiveCommentVoiceRecognizeInputPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$LiveCommentVoiceRecognizeInputPackage._emptyArray == null) {
             ClientContentWrapper$LiveCommentVoiceRecognizeInputPackage[] liveCommentV = new ClientContentWrapper$LiveCommentVoiceRecognizeInputPackage[0];
             ClientContentWrapper$LiveCommentVoiceRecognizeInputPackage._emptyArray = liveCommentV;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$LiveCommentVoiceRecognizeInputPackage._emptyArray;
    }
    public static ClientContentWrapper$LiveCommentVoiceRecognizeInputPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$LiveCommentVoiceRecognizeInputPackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$LiveCommentVoiceRecognizeInputPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$LiveCommentVoiceRecognizeInputPackage(), p0);
    }
    public ClientContentWrapper$LiveCommentVoiceRecognizeInputPackage clear(){
       this.recognizeBeginTimestamp = 0;
       this.recognizeEndTimestamp = 0;
       this.totalSuccessCount = 0;
       this.totalFailCount = 0;
       this.transOpusSuccessCount = 0;
       this.transOpusFailCount = 0;
       this.networkSuccessCount = 0;
       this.networkFailCount = 0;
       this.networkRequestAverageCost = 0;
       this.networkRequestMaxCost = 0;
       this.transOpusAverageCost = 0;
       this.transOpusMaxCost = 0;
       this.audioRecordCount = 0;
       this.audioRecordChannel = 0;
       this.audioRecordSampleRate = 0;
       this.requestId = "";
       this.requestModel = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContentWrapper$LiveCommentVoiceRecognizeInputPackage trecognizeBe = this.recognizeBeginTimestamp;
       ClientContentWrapper$LiveCommentVoiceRecognizeInputPackage liveCommentV = null;
       if (trecognizeBe - liveCommentV) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, trecognizeBe);
       }
       trecognizeBe = this.recognizeEndTimestamp;
       if (trecognizeBe - liveCommentV) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, trecognizeBe);
       }
       trecognizeBe = this.totalSuccessCount;
       if (trecognizeBe != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, trecognizeBe);
       }
       trecognizeBe = this.totalFailCount;
       if (trecognizeBe != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, trecognizeBe);
       }
       trecognizeBe = this.transOpusSuccessCount;
       if (trecognizeBe != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, trecognizeBe);
       }
       trecognizeBe = this.transOpusFailCount;
       if (trecognizeBe != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, trecognizeBe);
       }
       trecognizeBe = this.networkSuccessCount;
       if (trecognizeBe != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, trecognizeBe);
       }
       trecognizeBe = this.networkFailCount;
       if (trecognizeBe != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, trecognizeBe);
       }
       trecognizeBe = this.networkRequestAverageCost;
       if (trecognizeBe - liveCommentV) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, trecognizeBe);
       }
       trecognizeBe = this.networkRequestMaxCost;
       if (trecognizeBe - liveCommentV) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(10, trecognizeBe);
       }
       trecognizeBe = this.transOpusAverageCost;
       if (trecognizeBe - liveCommentV) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, trecognizeBe);
       }
       trecognizeBe = this.transOpusMaxCost;
       if (trecognizeBe - liveCommentV) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(12, trecognizeBe);
       }
       trecognizeBe = this.audioRecordCount;
       if (trecognizeBe != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(13, trecognizeBe);
       }
       trecognizeBe = this.audioRecordChannel;
       if (trecognizeBe != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(14, trecognizeBe);
       }
       trecognizeBe = this.audioRecordSampleRate;
       if (trecognizeBe != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(15, trecognizeBe);
       }
       String str = "";
       if (!(this.requestId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(16, this.requestId);
       }
       if (!(this.requestModel).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(17, this.requestModel);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContentWrapper$LiveCommentVoiceRecognizeInputPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                this.recognizeBeginTimestamp = p0.readUInt64();
                break;
              case 16:
                this.recognizeEndTimestamp = p0.readUInt64();
                break;
              case 24:
                this.totalSuccessCount = p0.readUInt32();
                break;
              case 32:
                this.totalFailCount = p0.readUInt32();
                break;
              case '(':
                this.transOpusSuccessCount = p0.readUInt32();
                break;
              case '0':
                this.transOpusFailCount = p0.readUInt32();
                break;
              case '8':
                this.networkSuccessCount = p0.readUInt32();
                break;
              case '@':
                this.networkFailCount = p0.readUInt32();
                break;
              case 'H':
                this.networkRequestAverageCost = p0.readUInt64();
                break;
              case 'P':
                this.networkRequestMaxCost = p0.readUInt64();
                break;
              case 'X':
                this.transOpusAverageCost = p0.readUInt64();
                break;
              case '`':
                this.transOpusMaxCost = p0.readUInt64();
                break;
              case 'h':
                this.audioRecordCount = p0.readUInt32();
                break;
              case 'p':
                this.audioRecordChannel = p0.readUInt32();
                break;
              case 'x':
                this.audioRecordSampleRate = p0.readUInt32();
                break;
              case 130:
                this.requestId = p0.readString();
                break;
              case 138:
                this.requestModel = p0.readString();
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
       ClientContentWrapper$LiveCommentVoiceRecognizeInputPackage trecognizeBe = this.recognizeBeginTimestamp;
       ClientContentWrapper$LiveCommentVoiceRecognizeInputPackage liveCommentV = null;
       if (trecognizeBe - liveCommentV) {
          p0.writeUInt64(1, trecognizeBe);
       }
       trecognizeBe = this.recognizeEndTimestamp;
       if (trecognizeBe - liveCommentV) {
          p0.writeUInt64(2, trecognizeBe);
       }
       trecognizeBe = this.totalSuccessCount;
       if (trecognizeBe != null) {
          p0.writeUInt32(3, trecognizeBe);
       }
       trecognizeBe = this.totalFailCount;
       if (trecognizeBe != null) {
          p0.writeUInt32(4, trecognizeBe);
       }
       trecognizeBe = this.transOpusSuccessCount;
       if (trecognizeBe != null) {
          p0.writeUInt32(5, trecognizeBe);
       }
       trecognizeBe = this.transOpusFailCount;
       if (trecognizeBe != null) {
          p0.writeUInt32(6, trecognizeBe);
       }
       trecognizeBe = this.networkSuccessCount;
       if (trecognizeBe != null) {
          p0.writeUInt32(7, trecognizeBe);
       }
       trecognizeBe = this.networkFailCount;
       if (trecognizeBe != null) {
          p0.writeUInt32(8, trecognizeBe);
       }
       trecognizeBe = this.networkRequestAverageCost;
       if (trecognizeBe - liveCommentV) {
          p0.writeUInt64(9, trecognizeBe);
       }
       trecognizeBe = this.networkRequestMaxCost;
       if (trecognizeBe - liveCommentV) {
          p0.writeUInt64(10, trecognizeBe);
       }
       trecognizeBe = this.transOpusAverageCost;
       if (trecognizeBe - liveCommentV) {
          p0.writeUInt64(11, trecognizeBe);
       }
       trecognizeBe = this.transOpusMaxCost;
       if (trecognizeBe - liveCommentV) {
          p0.writeUInt64(12, trecognizeBe);
       }
       trecognizeBe = this.audioRecordCount;
       if (trecognizeBe != null) {
          p0.writeUInt32(13, trecognizeBe);
       }
       trecognizeBe = this.audioRecordChannel;
       if (trecognizeBe != null) {
          p0.writeUInt32(14, trecognizeBe);
       }
       trecognizeBe = this.audioRecordSampleRate;
       if (trecognizeBe != null) {
          p0.writeUInt32(15, trecognizeBe);
       }
       String str = "";
       if (!(this.requestId).equals(str)) {
          p0.writeString(16, this.requestId);
       }
       if (!(this.requestModel).equals(str)) {
          p0.writeString(17, this.requestModel);
       }
       super.writeTo(p0);
       return;
    }
}
