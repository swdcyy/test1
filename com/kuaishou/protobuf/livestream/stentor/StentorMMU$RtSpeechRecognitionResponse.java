package com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionResponse;
import hr4.j;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Internal$LongList;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionResponse$a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.AbstractMessageLite;
import com.kuaishou.protobuf.kfs.feature.Feature;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionResultDetail;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$WordDetail;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import hr4.a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.protobuf.kfs.feature.a;
import hr4.k;
import hr4.r;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotInfo;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtAsrStatus;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionResultCode;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotInfo$a;

public final class StentorMMU$RtSpeechRecognitionResponse extends GeneratedMessageLite implements j	// class@000da4
{
    public String debugInfo_;
    public String dynamicResult_;
    public Internal$ProtobufList extraInfo_;
    public int missSerialNoMemoizedSerializedSize;
    public Internal$LongList missSerialNo_;
    public String newDynamicResult_;
    public Internal$ProtobufList newResultDetail_;
    public Internal$ProtobufList phoneResult_;
    public String recognitionResult_;
    public String reqId_;
    public Internal$ProtobufList resultDetail_;
    public StentorMMU$SpeechRobotInfo robotInfo_;
    public int rtAsrStatus_;
    public long serialNo_;
    public int status_;
    public static final StentorMMU$RtSpeechRecognitionResponse DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       StentorMMU$RtSpeechRecognitionResponse rtSpeechReco = new StentorMMU$RtSpeechRecognitionResponse();
       StentorMMU$RtSpeechRecognitionResponse.DEFAULT_INSTANCE = rtSpeechReco;
       GeneratedMessageLite.registerDefaultInstance(StentorMMU$RtSpeechRecognitionResponse.class, rtSpeechReco);
    }
    public void StentorMMU$RtSpeechRecognitionResponse(){
       super();
       this.missSerialNoMemoizedSerializedSize = -1;
       this.resultDetail_ = GeneratedMessageLite.emptyProtobufList();
       this.dynamicResult_ = "";
       this.recognitionResult_ = "";
       this.reqId_ = "";
       this.debugInfo_ = "";
       this.newResultDetail_ = GeneratedMessageLite.emptyProtobufList();
       this.newDynamicResult_ = "";
       this.extraInfo_ = GeneratedMessageLite.emptyProtobufList();
       this.phoneResult_ = GeneratedMessageLite.emptyProtobufList();
       this.missSerialNo_ = GeneratedMessageLite.emptyLongList();
    }
    public static StentorMMU$RtSpeechRecognitionResponse getDefaultInstance(){
       return StentorMMU$RtSpeechRecognitionResponse.DEFAULT_INSTANCE;
    }
    public static StentorMMU$RtSpeechRecognitionResponse$a newBuilder(){
       return StentorMMU$RtSpeechRecognitionResponse.DEFAULT_INSTANCE.createBuilder();
    }
    public static StentorMMU$RtSpeechRecognitionResponse$a newBuilder(StentorMMU$RtSpeechRecognitionResponse p0){
       return StentorMMU$RtSpeechRecognitionResponse.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static StentorMMU$RtSpeechRecognitionResponse parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$RtSpeechRecognitionResponse.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtSpeechRecognitionResponse parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$RtSpeechRecognitionResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtSpeechRecognitionResponse parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionResponse.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtSpeechRecognitionResponse parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtSpeechRecognitionResponse parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionResponse.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtSpeechRecognitionResponse parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtSpeechRecognitionResponse parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionResponse.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtSpeechRecognitionResponse parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtSpeechRecognitionResponse parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionResponse.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtSpeechRecognitionResponse parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtSpeechRecognitionResponse parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionResponse.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtSpeechRecognitionResponse parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtSpeechRecognitionResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return StentorMMU$RtSpeechRecognitionResponse.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllExtraInfo(Iterable p0){
       this.ensureExtraInfoIsMutable();
       AbstractMessageLite.addAll(p0, this.extraInfo_);
    }
    public void addAllMissSerialNo(Iterable p0){
       this.ensureMissSerialNoIsMutable();
       AbstractMessageLite.addAll(p0, this.missSerialNo_);
    }
    public void addAllNewResultDetail(Iterable p0){
       this.ensureNewResultDetailIsMutable();
       AbstractMessageLite.addAll(p0, this.newResultDetail_);
    }
    public void addAllPhoneResult(Iterable p0){
       this.ensurePhoneResultIsMutable();
       AbstractMessageLite.addAll(p0, this.phoneResult_);
    }
    public void addAllResultDetail(Iterable p0){
       this.ensureResultDetailIsMutable();
       AbstractMessageLite.addAll(p0, this.resultDetail_);
    }
    public void addExtraInfo(int p0,Feature p1){
       Objects.requireNonNull(p1);
       this.ensureExtraInfoIsMutable();
       this.extraInfo_.add(p0, p1);
    }
    public void addExtraInfo(Feature p0){
       Objects.requireNonNull(p0);
       this.ensureExtraInfoIsMutable();
       this.extraInfo_.add(p0);
    }
    public void addMissSerialNo(long p0){
       this.ensureMissSerialNoIsMutable();
       this.missSerialNo_.addLong(p0);
    }
    public void addNewResultDetail(int p0,StentorMMU$RtSpeechRecognitionResultDetail p1){
       Objects.requireNonNull(p1);
       this.ensureNewResultDetailIsMutable();
       this.newResultDetail_.add(p0, p1);
    }
    public void addNewResultDetail(StentorMMU$RtSpeechRecognitionResultDetail p0){
       Objects.requireNonNull(p0);
       this.ensureNewResultDetailIsMutable();
       this.newResultDetail_.add(p0);
    }
    public void addPhoneResult(int p0,StentorMMU$WordDetail p1){
       Objects.requireNonNull(p1);
       this.ensurePhoneResultIsMutable();
       this.phoneResult_.add(p0, p1);
    }
    public void addPhoneResult(StentorMMU$WordDetail p0){
       Objects.requireNonNull(p0);
       this.ensurePhoneResultIsMutable();
       this.phoneResult_.add(p0);
    }
    public void addResultDetail(int p0,StentorMMU$RtSpeechRecognitionResultDetail p1){
       Objects.requireNonNull(p1);
       this.ensureResultDetailIsMutable();
       this.resultDetail_.add(p0, p1);
    }
    public void addResultDetail(StentorMMU$RtSpeechRecognitionResultDetail p0){
       Objects.requireNonNull(p0);
       this.ensureResultDetailIsMutable();
       this.resultDetail_.add(p0);
    }
    public void clearDebugInfo(){
       this.debugInfo_ = StentorMMU$RtSpeechRecognitionResponse.getDefaultInstance().getDebugInfo();
    }
    public void clearDynamicResult(){
       this.dynamicResult_ = StentorMMU$RtSpeechRecognitionResponse.getDefaultInstance().getDynamicResult();
    }
    public void clearExtraInfo(){
       this.extraInfo_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearMissSerialNo(){
       this.missSerialNo_ = GeneratedMessageLite.emptyLongList();
    }
    public void clearNewDynamicResult(){
       this.newDynamicResult_ = StentorMMU$RtSpeechRecognitionResponse.getDefaultInstance().getNewDynamicResult();
    }
    public void clearNewResultDetail(){
       this.newResultDetail_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearPhoneResult(){
       this.phoneResult_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearRecognitionResult(){
       this.recognitionResult_ = StentorMMU$RtSpeechRecognitionResponse.getDefaultInstance().getRecognitionResult();
    }
    public void clearReqId(){
       this.reqId_ = StentorMMU$RtSpeechRecognitionResponse.getDefaultInstance().getReqId();
    }
    public void clearResultDetail(){
       this.resultDetail_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearRobotInfo(){
       this.robotInfo_ = null;
    }
    public void clearRtAsrStatus(){
       this.rtAsrStatus_ = 0;
    }
    public void clearSerialNo(){
       this.serialNo_ = 0;
    }
    public void clearStatus(){
       this.status_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       p1 = StentorMMU$RtSpeechRecognitionResultDetail.class;
       int i = 1;
       a uoa = null;
       switch (a.a[p0.ordinal()]){
           case 1:
             return new StentorMMU$RtSpeechRecognitionResponse();
           case 2:
             return new StentorMMU$RtSpeechRecognitionResponse$a(uoa);
           case 3:
             Object[] objArray = new Object[18];
             objArray[0] = "resultDetail_";
             objArray[i] = p1;
             objArray[2] = "dynamicResult_";
             objArray[3] = "status_";
             objArray[4] = "serialNo_";
             objArray[5] = "recognitionResult_";
             objArray[6] = "robotInfo_";
             objArray[7] = "reqId_";
             objArray[8] = "debugInfo_";
             objArray[9] = "rtAsrStatus_";
             objArray[10] = "newResultDetail_";
             objArray[11] = p1;
             objArray[12] = "newDynamicResult_";
             objArray[13] = "extraInfo_";
             objArray[14] = Feature.class;
             objArray[15] = "phoneResult_";
             objArray[16] = StentorMMU$WordDetail.class;
             objArray[17] = "missSerialNo_";
             return GeneratedMessageLite.newMessageInfo(StentorMMU$RtSpeechRecognitionResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x0e\xff\x02\xff\x02\xff\x02\xff\x02\x01\x0e\x0e\xff\x02\xff\x02\x05\xff\x02\xff\x02\x01\x1b\x02\x02\x02\x03\f\x04\x02\x05\x02\x02\x06\t\x07\x02\x02\b\x02\x02\t\f\n\x1b\x0b\x02\x02\f\x1b\r\x1b\x0e%\x00", objArray);
           case 4:
             return StentorMMU$RtSpeechRecognitionResponse.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = StentorMMU$RtSpeechRecognitionResponse.PARSER;
             if (pARSER == null) {
                _monitor_enter(StentorMMU$RtSpeechRecognitionResponse.class);
                pARSER = StentorMMU$RtSpeechRecognitionResponse.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(StentorMMU$RtSpeechRecognitionResponse.DEFAULT_INSTANCE);
                   StentorMMU$RtSpeechRecognitionResponse.PARSER = pARSER;
                }
                _monitor_exit(StentorMMU$RtSpeechRecognitionResponse.class);
             }
             return pARSER;
             break;
           case 6:
             return Byte.valueOf(i);
           case 7:
             return uoa;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final void ensureExtraInfoIsMutable(){
       if (!this.extraInfo_.isModifiable()) {
          this.extraInfo_ = GeneratedMessageLite.mutableCopy(this.extraInfo_);
       }
       return;
    }
    public final void ensureMissSerialNoIsMutable(){
       if (!this.missSerialNo_.isModifiable()) {
          this.missSerialNo_ = GeneratedMessageLite.mutableCopy(this.missSerialNo_);
       }
       return;
    }
    public final void ensureNewResultDetailIsMutable(){
       if (!this.newResultDetail_.isModifiable()) {
          this.newResultDetail_ = GeneratedMessageLite.mutableCopy(this.newResultDetail_);
       }
       return;
    }
    public final void ensurePhoneResultIsMutable(){
       if (!this.phoneResult_.isModifiable()) {
          this.phoneResult_ = GeneratedMessageLite.mutableCopy(this.phoneResult_);
       }
       return;
    }
    public final void ensureResultDetailIsMutable(){
       if (!this.resultDetail_.isModifiable()) {
          this.resultDetail_ = GeneratedMessageLite.mutableCopy(this.resultDetail_);
       }
       return;
    }
    public String getDebugInfo(){
       return this.debugInfo_;
    }
    public ByteString getDebugInfoBytes(){
       return ByteString.copyFromUtf8(this.debugInfo_);
    }
    public String getDynamicResult(){
       return this.dynamicResult_;
    }
    public ByteString getDynamicResultBytes(){
       return ByteString.copyFromUtf8(this.dynamicResult_);
    }
    public Feature getExtraInfo(int p0){
       return this.extraInfo_.get(p0);
    }
    public int getExtraInfoCount(){
       return this.extraInfo_.size();
    }
    public List getExtraInfoList(){
       return this.extraInfo_;
    }
    public a getExtraInfoOrBuilder(int p0){
       return this.extraInfo_.get(p0);
    }
    public List getExtraInfoOrBuilderList(){
       return this.extraInfo_;
    }
    public long getMissSerialNo(int p0){
       return this.missSerialNo_.getLong(p0);
    }
    public int getMissSerialNoCount(){
       return this.missSerialNo_.size();
    }
    public List getMissSerialNoList(){
       return this.missSerialNo_;
    }
    public String getNewDynamicResult(){
       return this.newDynamicResult_;
    }
    public ByteString getNewDynamicResultBytes(){
       return ByteString.copyFromUtf8(this.newDynamicResult_);
    }
    public StentorMMU$RtSpeechRecognitionResultDetail getNewResultDetail(int p0){
       return this.newResultDetail_.get(p0);
    }
    public int getNewResultDetailCount(){
       return this.newResultDetail_.size();
    }
    public List getNewResultDetailList(){
       return this.newResultDetail_;
    }
    public k getNewResultDetailOrBuilder(int p0){
       return this.newResultDetail_.get(p0);
    }
    public List getNewResultDetailOrBuilderList(){
       return this.newResultDetail_;
    }
    public StentorMMU$WordDetail getPhoneResult(int p0){
       return this.phoneResult_.get(p0);
    }
    public int getPhoneResultCount(){
       return this.phoneResult_.size();
    }
    public List getPhoneResultList(){
       return this.phoneResult_;
    }
    public r getPhoneResultOrBuilder(int p0){
       return this.phoneResult_.get(p0);
    }
    public List getPhoneResultOrBuilderList(){
       return this.phoneResult_;
    }
    public String getRecognitionResult(){
       return this.recognitionResult_;
    }
    public ByteString getRecognitionResultBytes(){
       return ByteString.copyFromUtf8(this.recognitionResult_);
    }
    public String getReqId(){
       return this.reqId_;
    }
    public ByteString getReqIdBytes(){
       return ByteString.copyFromUtf8(this.reqId_);
    }
    public StentorMMU$RtSpeechRecognitionResultDetail getResultDetail(int p0){
       return this.resultDetail_.get(p0);
    }
    public int getResultDetailCount(){
       return this.resultDetail_.size();
    }
    public List getResultDetailList(){
       return this.resultDetail_;
    }
    public k getResultDetailOrBuilder(int p0){
       return this.resultDetail_.get(p0);
    }
    public List getResultDetailOrBuilderList(){
       return this.resultDetail_;
    }
    public StentorMMU$SpeechRobotInfo getRobotInfo(){
       StentorMMU$RtSpeechRecognitionResponse trobotInfo_ = this.robotInfo_;
       if (trobotInfo_ == null) {
          trobotInfo_ = StentorMMU$SpeechRobotInfo.getDefaultInstance();
       }
       return trobotInfo_;
    }
    public StentorMMU$RtAsrStatus getRtAsrStatus(){
       StentorMMU$RtAsrStatus rtAsrStatus = StentorMMU$RtAsrStatus.forNumber(this.rtAsrStatus_);
       if (rtAsrStatus == null) {
          rtAsrStatus = StentorMMU$RtAsrStatus.UNRECOGNIZED;
       }
       return rtAsrStatus;
    }
    public int getRtAsrStatusValue(){
       return this.rtAsrStatus_;
    }
    public long getSerialNo(){
       return this.serialNo_;
    }
    public StentorMMU$RtSpeechRecognitionResultCode getStatus(){
       StentorMMU$RtSpeechRecognitionResultCode rtSpeechReco = StentorMMU$RtSpeechRecognitionResultCode.forNumber(this.status_);
       if (rtSpeechReco == null) {
          rtSpeechReco = StentorMMU$RtSpeechRecognitionResultCode.UNRECOGNIZED;
       }
       return rtSpeechReco;
    }
    public int getStatusValue(){
       return this.status_;
    }
    public boolean hasRobotInfo(){
       boolean b = (this.robotInfo_ != null)? true: false;
       return b;
    }
    public void mergeRobotInfo(StentorMMU$SpeechRobotInfo p0){
       Objects.requireNonNull(p0);
       StentorMMU$RtSpeechRecognitionResponse trobotInfo_ = this.robotInfo_;
       this.robotInfo_ = (trobotInfo_ != null && trobotInfo_ != StentorMMU$SpeechRobotInfo.getDefaultInstance())? StentorMMU$SpeechRobotInfo.newBuilder(this.robotInfo_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void removeExtraInfo(int p0){
       this.ensureExtraInfoIsMutable();
       this.extraInfo_.remove(p0);
    }
    public void removeNewResultDetail(int p0){
       this.ensureNewResultDetailIsMutable();
       this.newResultDetail_.remove(p0);
    }
    public void removePhoneResult(int p0){
       this.ensurePhoneResultIsMutable();
       this.phoneResult_.remove(p0);
    }
    public void removeResultDetail(int p0){
       this.ensureResultDetailIsMutable();
       this.resultDetail_.remove(p0);
    }
    public void setDebugInfo(String p0){
       Objects.requireNonNull(p0);
       this.debugInfo_ = p0;
    }
    public void setDebugInfoBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.debugInfo_ = p0.toStringUtf8();
    }
    public void setDynamicResult(String p0){
       Objects.requireNonNull(p0);
       this.dynamicResult_ = p0;
    }
    public void setDynamicResultBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.dynamicResult_ = p0.toStringUtf8();
    }
    public void setExtraInfo(int p0,Feature p1){
       Objects.requireNonNull(p1);
       this.ensureExtraInfoIsMutable();
       this.extraInfo_.set(p0, p1);
    }
    public void setMissSerialNo(int p0,long p1){
       this.ensureMissSerialNoIsMutable();
       this.missSerialNo_.setLong(p0, p1);
    }
    public void setNewDynamicResult(String p0){
       Objects.requireNonNull(p0);
       this.newDynamicResult_ = p0;
    }
    public void setNewDynamicResultBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.newDynamicResult_ = p0.toStringUtf8();
    }
    public void setNewResultDetail(int p0,StentorMMU$RtSpeechRecognitionResultDetail p1){
       Objects.requireNonNull(p1);
       this.ensureNewResultDetailIsMutable();
       this.newResultDetail_.set(p0, p1);
    }
    public void setPhoneResult(int p0,StentorMMU$WordDetail p1){
       Objects.requireNonNull(p1);
       this.ensurePhoneResultIsMutable();
       this.phoneResult_.set(p0, p1);
    }
    public void setRecognitionResult(String p0){
       Objects.requireNonNull(p0);
       this.recognitionResult_ = p0;
    }
    public void setRecognitionResultBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.recognitionResult_ = p0.toStringUtf8();
    }
    public void setReqId(String p0){
       Objects.requireNonNull(p0);
       this.reqId_ = p0;
    }
    public void setReqIdBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.reqId_ = p0.toStringUtf8();
    }
    public void setResultDetail(int p0,StentorMMU$RtSpeechRecognitionResultDetail p1){
       Objects.requireNonNull(p1);
       this.ensureResultDetailIsMutable();
       this.resultDetail_.set(p0, p1);
    }
    public void setRobotInfo(StentorMMU$SpeechRobotInfo p0){
       Objects.requireNonNull(p0);
       this.robotInfo_ = p0;
    }
    public void setRtAsrStatus(StentorMMU$RtAsrStatus p0){
       this.rtAsrStatus_ = p0.getNumber();
    }
    public void setRtAsrStatusValue(int p0){
       this.rtAsrStatus_ = p0;
    }
    public void setSerialNo(long p0){
       this.serialNo_ = p0;
    }
    public void setStatus(StentorMMU$RtSpeechRecognitionResultCode p0){
       this.status_ = p0.getNumber();
    }
    public void setStatusValue(int p0){
       this.status_ = p0;
    }
}
