package com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtTextToSpeechResponse;
import hr4.m;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtTextToSpeechResponse$a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
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
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionResultCode;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class StentorMMU$RtTextToSpeechResponse extends GeneratedMessageLite implements m	// class@000db0
{
    public String reqId_;
    public boolean requestContinue_;
    public long serialNo_;
    public String speechText_;
    public ByteString speech_;
    public int status_;
    public static final StentorMMU$RtTextToSpeechResponse DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       StentorMMU$RtTextToSpeechResponse rtTextToSpee = new StentorMMU$RtTextToSpeechResponse();
       StentorMMU$RtTextToSpeechResponse.DEFAULT_INSTANCE = rtTextToSpee;
       GeneratedMessageLite.registerDefaultInstance(StentorMMU$RtTextToSpeechResponse.class, rtTextToSpee);
    }
    public void StentorMMU$RtTextToSpeechResponse(){
       super();
       this.speechText_ = "";
       this.reqId_ = "";
       this.speech_ = ByteString.EMPTY;
    }
    public static StentorMMU$RtTextToSpeechResponse getDefaultInstance(){
       return StentorMMU$RtTextToSpeechResponse.DEFAULT_INSTANCE;
    }
    public static StentorMMU$RtTextToSpeechResponse$a newBuilder(){
       return StentorMMU$RtTextToSpeechResponse.DEFAULT_INSTANCE.createBuilder();
    }
    public static StentorMMU$RtTextToSpeechResponse$a newBuilder(StentorMMU$RtTextToSpeechResponse p0){
       return StentorMMU$RtTextToSpeechResponse.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static StentorMMU$RtTextToSpeechResponse parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$RtTextToSpeechResponse.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtTextToSpeechResponse parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$RtTextToSpeechResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtTextToSpeechResponse parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtTextToSpeechResponse.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtTextToSpeechResponse parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtTextToSpeechResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtTextToSpeechResponse parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtTextToSpeechResponse.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtTextToSpeechResponse parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtTextToSpeechResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtTextToSpeechResponse parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtTextToSpeechResponse.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtTextToSpeechResponse parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtTextToSpeechResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtTextToSpeechResponse parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtTextToSpeechResponse.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtTextToSpeechResponse parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtTextToSpeechResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtTextToSpeechResponse parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtTextToSpeechResponse.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtTextToSpeechResponse parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtTextToSpeechResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return StentorMMU$RtTextToSpeechResponse.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearReqId(){
       this.reqId_ = StentorMMU$RtTextToSpeechResponse.getDefaultInstance().getReqId();
    }
    public void clearRequestContinue(){
       this.requestContinue_ = false;
    }
    public void clearSerialNo(){
       this.serialNo_ = 0;
    }
    public void clearSpeech(){
       this.speech_ = StentorMMU$RtTextToSpeechResponse.getDefaultInstance().getSpeech();
    }
    public void clearSpeechText(){
       this.speechText_ = StentorMMU$RtTextToSpeechResponse.getDefaultInstance().getSpeechText();
    }
    public void clearStatus(){
       this.status_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (a.a[p0.ordinal()]){
           case 1:
             return new StentorMMU$RtTextToSpeechResponse();
           case 2:
             return new StentorMMU$RtTextToSpeechResponse$a(p2);
           case 3:
             Object[] objArray = new Object[]{"status_","speechText_","reqId_","serialNo_","speech_","requestContinue_"};
             return GeneratedMessageLite.newMessageInfo(StentorMMU$RtTextToSpeechResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\xff\x02\xff\x02\xff\x02\xff\x02\x01\x06\x06\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\x02\x02\x02\x03\x02\x02\x04\x02\x05\n\x06\x07\x00", objArray);
           case 4:
             return StentorMMU$RtTextToSpeechResponse.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = StentorMMU$RtTextToSpeechResponse.PARSER;
             if (pARSER == null) {
                _monitor_enter(StentorMMU$RtTextToSpeechResponse.class);
                pARSER = StentorMMU$RtTextToSpeechResponse.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(StentorMMU$RtTextToSpeechResponse.DEFAULT_INSTANCE);
                   StentorMMU$RtTextToSpeechResponse.PARSER = pARSER;
                }
                _monitor_exit(StentorMMU$RtTextToSpeechResponse.class);
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
    public String getReqId(){
       return this.reqId_;
    }
    public ByteString getReqIdBytes(){
       return ByteString.copyFromUtf8(this.reqId_);
    }
    public boolean getRequestContinue(){
       return this.requestContinue_;
    }
    public long getSerialNo(){
       return this.serialNo_;
    }
    public ByteString getSpeech(){
       return this.speech_;
    }
    public String getSpeechText(){
       return this.speechText_;
    }
    public ByteString getSpeechTextBytes(){
       return ByteString.copyFromUtf8(this.speechText_);
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
    public void setReqId(String p0){
       Objects.requireNonNull(p0);
       this.reqId_ = p0;
    }
    public void setReqIdBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.reqId_ = p0.toStringUtf8();
    }
    public void setRequestContinue(boolean p0){
       this.requestContinue_ = p0;
    }
    public void setSerialNo(long p0){
       this.serialNo_ = p0;
    }
    public void setSpeech(ByteString p0){
       Objects.requireNonNull(p0);
       this.speech_ = p0;
    }
    public void setSpeechText(String p0){
       Objects.requireNonNull(p0);
       this.speechText_ = p0;
    }
    public void setSpeechTextBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.speechText_ = p0.toStringUtf8();
    }
    public void setStatus(StentorMMU$RtSpeechRecognitionResultCode p0){
       this.status_ = p0.getNumber();
    }
    public void setStatusValue(int p0){
       this.status_ = p0;
    }
}
