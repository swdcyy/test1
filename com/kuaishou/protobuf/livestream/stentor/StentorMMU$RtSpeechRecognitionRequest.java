package com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionRequest;
import hr4.i;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.ByteString;
import com.google.protobuf.Internal$ProtobufList;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionRequest$a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.AbstractMessageLite;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import hr4.a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$ClientRequestInfo;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$LyricsInfo;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionType;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$ClientRequestInfo$a;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$LyricsInfo$a;

public final class StentorMMU$RtSpeechRecognitionRequest extends GeneratedMessageLite implements i	// class@000da2
{
    public ByteString audioData_;
    public int channel_;
    public StentorMMU$ClientRequestInfo clientInfo_;
    public boolean detectEndPoint_;
    public int disableDigit_;
    public int disablePunctuation_;
    public String format_;
    public Internal$ProtobufList hotWord_;
    public String liveId_;
    public StentorMMU$LyricsInfo lyricsInfo_;
    public String model_;
    public String reqId_;
    public boolean returnRecognitionResult_;
    public int sampleRate_;
    public long serialNo_;
    public int timePerPackage_;
    public int type_;
    public boolean useStreamAsr_;
    public String userId_;
    public static final StentorMMU$RtSpeechRecognitionRequest DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       StentorMMU$RtSpeechRecognitionRequest rtSpeechReco = new StentorMMU$RtSpeechRecognitionRequest();
       StentorMMU$RtSpeechRecognitionRequest.DEFAULT_INSTANCE = rtSpeechReco;
       GeneratedMessageLite.registerDefaultInstance(StentorMMU$RtSpeechRecognitionRequest.class, rtSpeechReco);
    }
    public void StentorMMU$RtSpeechRecognitionRequest(){
       super();
       this.reqId_ = "";
       this.audioData_ = ByteString.EMPTY;
       this.userId_ = "";
       this.model_ = "";
       this.format_ = "";
       this.hotWord_ = GeneratedMessageLite.emptyProtobufList();
       this.liveId_ = "";
    }
    public static StentorMMU$RtSpeechRecognitionRequest getDefaultInstance(){
       return StentorMMU$RtSpeechRecognitionRequest.DEFAULT_INSTANCE;
    }
    public static StentorMMU$RtSpeechRecognitionRequest$a newBuilder(){
       return StentorMMU$RtSpeechRecognitionRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static StentorMMU$RtSpeechRecognitionRequest$a newBuilder(StentorMMU$RtSpeechRecognitionRequest p0){
       return StentorMMU$RtSpeechRecognitionRequest.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static StentorMMU$RtSpeechRecognitionRequest parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$RtSpeechRecognitionRequest.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtSpeechRecognitionRequest parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$RtSpeechRecognitionRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtSpeechRecognitionRequest parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionRequest.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtSpeechRecognitionRequest parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtSpeechRecognitionRequest parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionRequest.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtSpeechRecognitionRequest parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtSpeechRecognitionRequest parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionRequest.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtSpeechRecognitionRequest parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtSpeechRecognitionRequest parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionRequest.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtSpeechRecognitionRequest parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtSpeechRecognitionRequest parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionRequest.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtSpeechRecognitionRequest parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return StentorMMU$RtSpeechRecognitionRequest.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllHotWord(Iterable p0){
       this.ensureHotWordIsMutable();
       AbstractMessageLite.addAll(p0, this.hotWord_);
    }
    public void addHotWord(String p0){
       Objects.requireNonNull(p0);
       this.ensureHotWordIsMutable();
       this.hotWord_.add(p0);
    }
    public void addHotWordBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ensureHotWordIsMutable();
       this.hotWord_.add(p0.toStringUtf8());
    }
    public void clearAudioData(){
       this.audioData_ = StentorMMU$RtSpeechRecognitionRequest.getDefaultInstance().getAudioData();
    }
    public void clearChannel(){
       this.channel_ = 0;
    }
    public void clearClientInfo(){
       this.clientInfo_ = null;
    }
    public void clearDetectEndPoint(){
       this.detectEndPoint_ = false;
    }
    public void clearDisableDigit(){
       this.disableDigit_ = 0;
    }
    public void clearDisablePunctuation(){
       this.disablePunctuation_ = 0;
    }
    public void clearFormat(){
       this.format_ = StentorMMU$RtSpeechRecognitionRequest.getDefaultInstance().getFormat();
    }
    public void clearHotWord(){
       this.hotWord_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearLiveId(){
       this.liveId_ = StentorMMU$RtSpeechRecognitionRequest.getDefaultInstance().getLiveId();
    }
    public void clearLyricsInfo(){
       this.lyricsInfo_ = null;
    }
    public void clearModel(){
       this.model_ = StentorMMU$RtSpeechRecognitionRequest.getDefaultInstance().getModel();
    }
    public void clearReqId(){
       this.reqId_ = StentorMMU$RtSpeechRecognitionRequest.getDefaultInstance().getReqId();
    }
    public void clearReturnRecognitionResult(){
       this.returnRecognitionResult_ = false;
    }
    public void clearSampleRate(){
       this.sampleRate_ = 0;
    }
    public void clearSerialNo(){
       this.serialNo_ = 0;
    }
    public void clearTimePerPackage(){
       this.timePerPackage_ = 0;
    }
    public void clearType(){
       this.type_ = 0;
    }
    public void clearUseStreamAsr(){
       this.useStreamAsr_ = false;
    }
    public void clearUserId(){
       this.userId_ = StentorMMU$RtSpeechRecognitionRequest.getDefaultInstance().getUserId();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (a.a[p0.ordinal()]){
           case 1:
             return new StentorMMU$RtSpeechRecognitionRequest();
           case 2:
             return new StentorMMU$RtSpeechRecognitionRequest$a(p2);
           case 3:
             Object[] objArray = new Object[19];
             objArray[0] = "reqId_";
             objArray[i] = "type_";
             objArray[2] = "serialNo_";
             objArray[3] = "audioData_";
             objArray[4] = "userId_";
             objArray[5] = "model_";
             objArray[6] = "format_";
             objArray[7] = "channel_";
             objArray[8] = "sampleRate_";
             objArray[9] = "disablePunctuation_";
             objArray[10] = "disableDigit_";
             objArray[11] = "hotWord_";
             objArray[12] = "liveId_";
             objArray[13] = "returnRecognitionResult_";
             objArray[14] = "clientInfo_";
             objArray[15] = "detectEndPoint_";
             objArray[16] = "lyricsInfo_";
             objArray[17] = "timePerPackage_";
             objArray[18] = "useStreamAsr_";
             return GeneratedMessageLite.newMessageInfo(StentorMMU$RtSpeechRecognitionRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x13\xff\x02\xff\x02\xff\x02\xff\x02\x01\x13\x13\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02\x02\f\x03\x02\x04\n\x05\x02\x02\x06\x02\x02\x07\x02\x02\b\x04\t\x04\n\x04\x0b\x04\f\x02\x02\r\x02\x02\x0e\x07\x0f\t\x10\x07\x11\t\x12\x04\x13\x07\x00", objArray);
           case 4:
             return StentorMMU$RtSpeechRecognitionRequest.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = StentorMMU$RtSpeechRecognitionRequest.PARSER;
             if (pARSER == null) {
                _monitor_enter(StentorMMU$RtSpeechRecognitionRequest.class);
                pARSER = StentorMMU$RtSpeechRecognitionRequest.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(StentorMMU$RtSpeechRecognitionRequest.DEFAULT_INSTANCE);
                   StentorMMU$RtSpeechRecognitionRequest.PARSER = pARSER;
                }
                _monitor_exit(StentorMMU$RtSpeechRecognitionRequest.class);
             }
             return pARSER;
             break;
           case 6:
             return Byte.valueOf(i);
           case 7:
             return p2;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final void ensureHotWordIsMutable(){
       if (!this.hotWord_.isModifiable()) {
          this.hotWord_ = GeneratedMessageLite.mutableCopy(this.hotWord_);
       }
       return;
    }
    public ByteString getAudioData(){
       return this.audioData_;
    }
    public int getChannel(){
       return this.channel_;
    }
    public StentorMMU$ClientRequestInfo getClientInfo(){
       StentorMMU$RtSpeechRecognitionRequest tclientInfo_ = this.clientInfo_;
       if (tclientInfo_ == null) {
          tclientInfo_ = StentorMMU$ClientRequestInfo.getDefaultInstance();
       }
       return tclientInfo_;
    }
    public boolean getDetectEndPoint(){
       return this.detectEndPoint_;
    }
    public int getDisableDigit(){
       return this.disableDigit_;
    }
    public int getDisablePunctuation(){
       return this.disablePunctuation_;
    }
    public String getFormat(){
       return this.format_;
    }
    public ByteString getFormatBytes(){
       return ByteString.copyFromUtf8(this.format_);
    }
    public String getHotWord(int p0){
       return this.hotWord_.get(p0);
    }
    public ByteString getHotWordBytes(int p0){
       return ByteString.copyFromUtf8(this.hotWord_.get(p0));
    }
    public int getHotWordCount(){
       return this.hotWord_.size();
    }
    public List getHotWordList(){
       return this.hotWord_;
    }
    public String getLiveId(){
       return this.liveId_;
    }
    public ByteString getLiveIdBytes(){
       return ByteString.copyFromUtf8(this.liveId_);
    }
    public StentorMMU$LyricsInfo getLyricsInfo(){
       StentorMMU$RtSpeechRecognitionRequest tlyricsInfo_ = this.lyricsInfo_;
       if (tlyricsInfo_ == null) {
          tlyricsInfo_ = StentorMMU$LyricsInfo.getDefaultInstance();
       }
       return tlyricsInfo_;
    }
    public String getModel(){
       return this.model_;
    }
    public ByteString getModelBytes(){
       return ByteString.copyFromUtf8(this.model_);
    }
    public String getReqId(){
       return this.reqId_;
    }
    public ByteString getReqIdBytes(){
       return ByteString.copyFromUtf8(this.reqId_);
    }
    public boolean getReturnRecognitionResult(){
       return this.returnRecognitionResult_;
    }
    public int getSampleRate(){
       return this.sampleRate_;
    }
    public long getSerialNo(){
       return this.serialNo_;
    }
    public int getTimePerPackage(){
       return this.timePerPackage_;
    }
    public StentorMMU$RtSpeechRecognitionType getType(){
       StentorMMU$RtSpeechRecognitionType rtSpeechReco = StentorMMU$RtSpeechRecognitionType.forNumber(this.type_);
       if (rtSpeechReco == null) {
          rtSpeechReco = StentorMMU$RtSpeechRecognitionType.UNRECOGNIZED;
       }
       return rtSpeechReco;
    }
    public int getTypeValue(){
       return this.type_;
    }
    public boolean getUseStreamAsr(){
       return this.useStreamAsr_;
    }
    public String getUserId(){
       return this.userId_;
    }
    public ByteString getUserIdBytes(){
       return ByteString.copyFromUtf8(this.userId_);
    }
    public boolean hasClientInfo(){
       boolean b = (this.clientInfo_ != null)? true: false;
       return b;
    }
    public boolean hasLyricsInfo(){
       boolean b = (this.lyricsInfo_ != null)? true: false;
       return b;
    }
    public void mergeClientInfo(StentorMMU$ClientRequestInfo p0){
       Objects.requireNonNull(p0);
       StentorMMU$RtSpeechRecognitionRequest tclientInfo_ = this.clientInfo_;
       this.clientInfo_ = (tclientInfo_ != null && tclientInfo_ != StentorMMU$ClientRequestInfo.getDefaultInstance())? StentorMMU$ClientRequestInfo.newBuilder(this.clientInfo_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeLyricsInfo(StentorMMU$LyricsInfo p0){
       Objects.requireNonNull(p0);
       StentorMMU$RtSpeechRecognitionRequest tlyricsInfo_ = this.lyricsInfo_;
       this.lyricsInfo_ = (tlyricsInfo_ != null && tlyricsInfo_ != StentorMMU$LyricsInfo.getDefaultInstance())? StentorMMU$LyricsInfo.newBuilder(this.lyricsInfo_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setAudioData(ByteString p0){
       Objects.requireNonNull(p0);
       this.audioData_ = p0;
    }
    public void setChannel(int p0){
       this.channel_ = p0;
    }
    public void setClientInfo(StentorMMU$ClientRequestInfo p0){
       Objects.requireNonNull(p0);
       this.clientInfo_ = p0;
    }
    public void setDetectEndPoint(boolean p0){
       this.detectEndPoint_ = p0;
    }
    public void setDisableDigit(int p0){
       this.disableDigit_ = p0;
    }
    public void setDisablePunctuation(int p0){
       this.disablePunctuation_ = p0;
    }
    public void setFormat(String p0){
       Objects.requireNonNull(p0);
       this.format_ = p0;
    }
    public void setFormatBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.format_ = p0.toStringUtf8();
    }
    public void setHotWord(int p0,String p1){
       Objects.requireNonNull(p1);
       this.ensureHotWordIsMutable();
       this.hotWord_.set(p0, p1);
    }
    public void setLiveId(String p0){
       Objects.requireNonNull(p0);
       this.liveId_ = p0;
    }
    public void setLiveIdBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.liveId_ = p0.toStringUtf8();
    }
    public void setLyricsInfo(StentorMMU$LyricsInfo p0){
       Objects.requireNonNull(p0);
       this.lyricsInfo_ = p0;
    }
    public void setModel(String p0){
       Objects.requireNonNull(p0);
       this.model_ = p0;
    }
    public void setModelBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.model_ = p0.toStringUtf8();
    }
    public void setReqId(String p0){
       Objects.requireNonNull(p0);
       this.reqId_ = p0;
    }
    public void setReqIdBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.reqId_ = p0.toStringUtf8();
    }
    public void setReturnRecognitionResult(boolean p0){
       this.returnRecognitionResult_ = p0;
    }
    public void setSampleRate(int p0){
       this.sampleRate_ = p0;
    }
    public void setSerialNo(long p0){
       this.serialNo_ = p0;
    }
    public void setTimePerPackage(int p0){
       this.timePerPackage_ = p0;
    }
    public void setType(StentorMMU$RtSpeechRecognitionType p0){
       this.type_ = p0.getNumber();
    }
    public void setTypeValue(int p0){
       this.type_ = p0;
    }
    public void setUseStreamAsr(boolean p0){
       this.useStreamAsr_ = p0;
    }
    public void setUserId(String p0){
       Objects.requireNonNull(p0);
       this.userId_ = p0;
    }
    public void setUserIdBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.userId_ = p0.toStringUtf8();
    }
}
