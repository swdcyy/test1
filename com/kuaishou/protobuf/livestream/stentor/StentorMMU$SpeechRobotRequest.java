package com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotRequest;
import hr4.p;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotRequest$a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import hr4.a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionRequest;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$BizType;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotReqType;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtTextToSpeechRequest;
import java.util.Objects;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionRequest$a;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtTextToSpeechRequest$a;
import com.google.protobuf.AbstractMessageLite;

public final class StentorMMU$SpeechRobotRequest extends GeneratedMessageLite implements p	// class@000dc2
{
    public StentorMMU$RtSpeechRecognitionRequest asrRequest_;
    public String bizId_;
    public int bizType_;
    public String recognitionResult_;
    public String reqId_;
    public int reqType_;
    public StentorMMU$RtTextToSpeechRequest ttsRequest_;
    public static final StentorMMU$SpeechRobotRequest DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       StentorMMU$SpeechRobotRequest speechRobotR = new StentorMMU$SpeechRobotRequest();
       StentorMMU$SpeechRobotRequest.DEFAULT_INSTANCE = speechRobotR;
       GeneratedMessageLite.registerDefaultInstance(StentorMMU$SpeechRobotRequest.class, speechRobotR);
    }
    public void StentorMMU$SpeechRobotRequest(){
       super();
       this.reqId_ = "";
       this.bizId_ = "";
       this.recognitionResult_ = "";
    }
    public static StentorMMU$SpeechRobotRequest getDefaultInstance(){
       return StentorMMU$SpeechRobotRequest.DEFAULT_INSTANCE;
    }
    public static StentorMMU$SpeechRobotRequest$a newBuilder(){
       return StentorMMU$SpeechRobotRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static StentorMMU$SpeechRobotRequest$a newBuilder(StentorMMU$SpeechRobotRequest p0){
       return StentorMMU$SpeechRobotRequest.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static StentorMMU$SpeechRobotRequest parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$SpeechRobotRequest.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$SpeechRobotRequest parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$SpeechRobotRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$SpeechRobotRequest parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotRequest.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$SpeechRobotRequest parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$SpeechRobotRequest parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotRequest.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$SpeechRobotRequest parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$SpeechRobotRequest parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotRequest.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$SpeechRobotRequest parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$SpeechRobotRequest parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotRequest.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$SpeechRobotRequest parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$SpeechRobotRequest parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotRequest.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$SpeechRobotRequest parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return StentorMMU$SpeechRobotRequest.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAsrRequest(){
       this.asrRequest_ = null;
    }
    public void clearBizId(){
       this.bizId_ = StentorMMU$SpeechRobotRequest.getDefaultInstance().getBizId();
    }
    public void clearBizType(){
       this.bizType_ = 0;
    }
    public void clearRecognitionResult(){
       this.recognitionResult_ = StentorMMU$SpeechRobotRequest.getDefaultInstance().getRecognitionResult();
    }
    public void clearReqId(){
       this.reqId_ = StentorMMU$SpeechRobotRequest.getDefaultInstance().getReqId();
    }
    public void clearReqType(){
       this.reqType_ = 0;
    }
    public void clearTtsRequest(){
       this.ttsRequest_ = null;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (a.a[p0.ordinal()]){
           case 1:
             return new StentorMMU$SpeechRobotRequest();
           case 2:
             return new StentorMMU$SpeechRobotRequest$a(p2);
           case 3:
             Object[] objArray = new Object[]{"asrRequest_","reqId_","bizType_","bizId_","reqType_","recognitionResult_","ttsRequest_"};
             return GeneratedMessageLite.newMessageInfo(StentorMMU$SpeechRobotRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x07\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x07\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\x02\x02\x02\x03\f\x04\x02\x02\x05\f\x06\x02\x02\x07\t\x00", objArray);
           case 4:
             return StentorMMU$SpeechRobotRequest.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = StentorMMU$SpeechRobotRequest.PARSER;
             if (pARSER == null) {
                _monitor_enter(StentorMMU$SpeechRobotRequest.class);
                pARSER = StentorMMU$SpeechRobotRequest.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(StentorMMU$SpeechRobotRequest.DEFAULT_INSTANCE);
                   StentorMMU$SpeechRobotRequest.PARSER = pARSER;
                }
                _monitor_exit(StentorMMU$SpeechRobotRequest.class);
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
    public StentorMMU$RtSpeechRecognitionRequest getAsrRequest(){
       StentorMMU$SpeechRobotRequest tasrRequest_ = this.asrRequest_;
       if (tasrRequest_ == null) {
          tasrRequest_ = StentorMMU$RtSpeechRecognitionRequest.getDefaultInstance();
       }
       return tasrRequest_;
    }
    public String getBizId(){
       return this.bizId_;
    }
    public ByteString getBizIdBytes(){
       return ByteString.copyFromUtf8(this.bizId_);
    }
    public StentorMMU$BizType getBizType(){
       StentorMMU$BizType uBizType = StentorMMU$BizType.forNumber(this.bizType_);
       if (uBizType == null) {
          uBizType = StentorMMU$BizType.UNRECOGNIZED;
       }
       return uBizType;
    }
    public int getBizTypeValue(){
       return this.bizType_;
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
    public StentorMMU$RobotReqType getReqType(){
       StentorMMU$RobotReqType robotReqType = StentorMMU$RobotReqType.forNumber(this.reqType_);
       if (robotReqType == null) {
          robotReqType = StentorMMU$RobotReqType.UNRECOGNIZED;
       }
       return robotReqType;
    }
    public int getReqTypeValue(){
       return this.reqType_;
    }
    public StentorMMU$RtTextToSpeechRequest getTtsRequest(){
       StentorMMU$SpeechRobotRequest tttsRequest_ = this.ttsRequest_;
       if (tttsRequest_ == null) {
          tttsRequest_ = StentorMMU$RtTextToSpeechRequest.getDefaultInstance();
       }
       return tttsRequest_;
    }
    public boolean hasAsrRequest(){
       boolean b = (this.asrRequest_ != null)? true: false;
       return b;
    }
    public boolean hasTtsRequest(){
       boolean b = (this.ttsRequest_ != null)? true: false;
       return b;
    }
    public void mergeAsrRequest(StentorMMU$RtSpeechRecognitionRequest p0){
       Objects.requireNonNull(p0);
       StentorMMU$SpeechRobotRequest tasrRequest_ = this.asrRequest_;
       this.asrRequest_ = (tasrRequest_ != null && tasrRequest_ != StentorMMU$RtSpeechRecognitionRequest.getDefaultInstance())? StentorMMU$RtSpeechRecognitionRequest.newBuilder(this.asrRequest_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeTtsRequest(StentorMMU$RtTextToSpeechRequest p0){
       Objects.requireNonNull(p0);
       StentorMMU$SpeechRobotRequest tttsRequest_ = this.ttsRequest_;
       this.ttsRequest_ = (tttsRequest_ != null && tttsRequest_ != StentorMMU$RtTextToSpeechRequest.getDefaultInstance())? StentorMMU$RtTextToSpeechRequest.newBuilder(this.ttsRequest_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setAsrRequest(StentorMMU$RtSpeechRecognitionRequest p0){
       Objects.requireNonNull(p0);
       this.asrRequest_ = p0;
    }
    public void setBizId(String p0){
       Objects.requireNonNull(p0);
       this.bizId_ = p0;
    }
    public void setBizIdBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.bizId_ = p0.toStringUtf8();
    }
    public void setBizType(StentorMMU$BizType p0){
       this.bizType_ = p0.getNumber();
    }
    public void setBizTypeValue(int p0){
       this.bizType_ = p0;
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
    public void setReqType(StentorMMU$RobotReqType p0){
       this.reqType_ = p0.getNumber();
    }
    public void setReqTypeValue(int p0){
       this.reqType_ = p0;
    }
    public void setTtsRequest(StentorMMU$RtTextToSpeechRequest p0){
       Objects.requireNonNull(p0);
       this.ttsRequest_ = p0;
    }
}
