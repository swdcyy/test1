package com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotResponse;
import hr4.q;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotResponse$a;
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
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionResponse;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$BizType;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtNLUResponse;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtTextToSpeechResponse;
import java.util.Objects;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionResponse$a;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtNLUResponse$a;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtTextToSpeechResponse$a;
import com.google.protobuf.AbstractMessageLite;

public final class StentorMMU$SpeechRobotResponse extends GeneratedMessageLite implements q	// class@000dc4
{
    public StentorMMU$RtSpeechRecognitionResponse asrResponse_;
    public String bizId_;
    public int bizType_;
    public StentorMMU$RtNLUResponse nluResponse_;
    public String reqId_;
    public StentorMMU$RtTextToSpeechResponse ttsResponse_;
    public static final StentorMMU$SpeechRobotResponse DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       StentorMMU$SpeechRobotResponse speechRobotR = new StentorMMU$SpeechRobotResponse();
       StentorMMU$SpeechRobotResponse.DEFAULT_INSTANCE = speechRobotR;
       GeneratedMessageLite.registerDefaultInstance(StentorMMU$SpeechRobotResponse.class, speechRobotR);
    }
    public void StentorMMU$SpeechRobotResponse(){
       super();
       this.reqId_ = "";
       this.bizId_ = "";
    }
    public static StentorMMU$SpeechRobotResponse getDefaultInstance(){
       return StentorMMU$SpeechRobotResponse.DEFAULT_INSTANCE;
    }
    public static StentorMMU$SpeechRobotResponse$a newBuilder(){
       return StentorMMU$SpeechRobotResponse.DEFAULT_INSTANCE.createBuilder();
    }
    public static StentorMMU$SpeechRobotResponse$a newBuilder(StentorMMU$SpeechRobotResponse p0){
       return StentorMMU$SpeechRobotResponse.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static StentorMMU$SpeechRobotResponse parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$SpeechRobotResponse.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$SpeechRobotResponse parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$SpeechRobotResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$SpeechRobotResponse parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotResponse.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$SpeechRobotResponse parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$SpeechRobotResponse parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotResponse.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$SpeechRobotResponse parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$SpeechRobotResponse parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotResponse.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$SpeechRobotResponse parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$SpeechRobotResponse parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotResponse.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$SpeechRobotResponse parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$SpeechRobotResponse parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotResponse.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$SpeechRobotResponse parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$SpeechRobotResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return StentorMMU$SpeechRobotResponse.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAsrResponse(){
       this.asrResponse_ = null;
    }
    public void clearBizId(){
       this.bizId_ = StentorMMU$SpeechRobotResponse.getDefaultInstance().getBizId();
    }
    public void clearBizType(){
       this.bizType_ = 0;
    }
    public void clearNluResponse(){
       this.nluResponse_ = null;
    }
    public void clearReqId(){
       this.reqId_ = StentorMMU$SpeechRobotResponse.getDefaultInstance().getReqId();
    }
    public void clearTtsResponse(){
       this.ttsResponse_ = null;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (a.a[p0.ordinal()]){
           case 1:
             return new StentorMMU$SpeechRobotResponse();
           case 2:
             return new StentorMMU$SpeechRobotResponse$a(p2);
           case 3:
             Object[] objArray = new Object[]{"asrResponse_","reqId_","bizType_","bizId_","nluResponse_","ttsResponse_"};
             return GeneratedMessageLite.newMessageInfo(StentorMMU$SpeechRobotResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\xff\x02\xff\x02\xff\x02\xff\x02\x01\x06\x06\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\x02\x02\x02\x03\f\x04\x02\x02\x05\t\x06\t\x00", objArray);
           case 4:
             return StentorMMU$SpeechRobotResponse.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = StentorMMU$SpeechRobotResponse.PARSER;
             if (pARSER == null) {
                _monitor_enter(StentorMMU$SpeechRobotResponse.class);
                pARSER = StentorMMU$SpeechRobotResponse.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(StentorMMU$SpeechRobotResponse.DEFAULT_INSTANCE);
                   StentorMMU$SpeechRobotResponse.PARSER = pARSER;
                }
                _monitor_exit(StentorMMU$SpeechRobotResponse.class);
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
    public StentorMMU$RtSpeechRecognitionResponse getAsrResponse(){
       StentorMMU$SpeechRobotResponse tasrResponse = this.asrResponse_;
       if (tasrResponse == null) {
          tasrResponse = StentorMMU$RtSpeechRecognitionResponse.getDefaultInstance();
       }
       return tasrResponse;
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
    public StentorMMU$RtNLUResponse getNluResponse(){
       StentorMMU$SpeechRobotResponse tnluResponse = this.nluResponse_;
       if (tnluResponse == null) {
          tnluResponse = StentorMMU$RtNLUResponse.getDefaultInstance();
       }
       return tnluResponse;
    }
    public String getReqId(){
       return this.reqId_;
    }
    public ByteString getReqIdBytes(){
       return ByteString.copyFromUtf8(this.reqId_);
    }
    public StentorMMU$RtTextToSpeechResponse getTtsResponse(){
       StentorMMU$SpeechRobotResponse tttsResponse = this.ttsResponse_;
       if (tttsResponse == null) {
          tttsResponse = StentorMMU$RtTextToSpeechResponse.getDefaultInstance();
       }
       return tttsResponse;
    }
    public boolean hasAsrResponse(){
       boolean b = (this.asrResponse_ != null)? true: false;
       return b;
    }
    public boolean hasNluResponse(){
       boolean b = (this.nluResponse_ != null)? true: false;
       return b;
    }
    public boolean hasTtsResponse(){
       boolean b = (this.ttsResponse_ != null)? true: false;
       return b;
    }
    public void mergeAsrResponse(StentorMMU$RtSpeechRecognitionResponse p0){
       Objects.requireNonNull(p0);
       StentorMMU$SpeechRobotResponse tasrResponse = this.asrResponse_;
       this.asrResponse_ = (tasrResponse != null && tasrResponse != StentorMMU$RtSpeechRecognitionResponse.getDefaultInstance())? StentorMMU$RtSpeechRecognitionResponse.newBuilder(this.asrResponse_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeNluResponse(StentorMMU$RtNLUResponse p0){
       Objects.requireNonNull(p0);
       StentorMMU$SpeechRobotResponse tnluResponse = this.nluResponse_;
       this.nluResponse_ = (tnluResponse != null && tnluResponse != StentorMMU$RtNLUResponse.getDefaultInstance())? StentorMMU$RtNLUResponse.newBuilder(this.nluResponse_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeTtsResponse(StentorMMU$RtTextToSpeechResponse p0){
       Objects.requireNonNull(p0);
       StentorMMU$SpeechRobotResponse tttsResponse = this.ttsResponse_;
       this.ttsResponse_ = (tttsResponse != null && tttsResponse != StentorMMU$RtTextToSpeechResponse.getDefaultInstance())? StentorMMU$RtTextToSpeechResponse.newBuilder(this.ttsResponse_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setAsrResponse(StentorMMU$RtSpeechRecognitionResponse p0){
       Objects.requireNonNull(p0);
       this.asrResponse_ = p0;
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
    public void setNluResponse(StentorMMU$RtNLUResponse p0){
       Objects.requireNonNull(p0);
       this.nluResponse_ = p0;
    }
    public void setReqId(String p0){
       Objects.requireNonNull(p0);
       this.reqId_ = p0;
    }
    public void setReqIdBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.reqId_ = p0.toStringUtf8();
    }
    public void setTtsResponse(StentorMMU$RtTextToSpeechResponse p0){
       Objects.requireNonNull(p0);
       this.ttsResponse_ = p0;
    }
}
