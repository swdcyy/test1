package com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtTextToSpeechRequest;
import hr4.l;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtTextToSpeechRequest$a;
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
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class StentorMMU$RtTextToSpeechRequest extends GeneratedMessageLite implements l	// class@000dae
{
    public String reqId_;
    public long serialNo_;
    public String speechText_;
    public static final StentorMMU$RtTextToSpeechRequest DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       StentorMMU$RtTextToSpeechRequest rtTextToSpee = new StentorMMU$RtTextToSpeechRequest();
       StentorMMU$RtTextToSpeechRequest.DEFAULT_INSTANCE = rtTextToSpee;
       GeneratedMessageLite.registerDefaultInstance(StentorMMU$RtTextToSpeechRequest.class, rtTextToSpee);
    }
    public void StentorMMU$RtTextToSpeechRequest(){
       super();
       this.reqId_ = "";
       this.speechText_ = "";
    }
    public static StentorMMU$RtTextToSpeechRequest getDefaultInstance(){
       return StentorMMU$RtTextToSpeechRequest.DEFAULT_INSTANCE;
    }
    public static StentorMMU$RtTextToSpeechRequest$a newBuilder(){
       return StentorMMU$RtTextToSpeechRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static StentorMMU$RtTextToSpeechRequest$a newBuilder(StentorMMU$RtTextToSpeechRequest p0){
       return StentorMMU$RtTextToSpeechRequest.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static StentorMMU$RtTextToSpeechRequest parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$RtTextToSpeechRequest.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtTextToSpeechRequest parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(StentorMMU$RtTextToSpeechRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtTextToSpeechRequest parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtTextToSpeechRequest.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtTextToSpeechRequest parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtTextToSpeechRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtTextToSpeechRequest parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtTextToSpeechRequest.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtTextToSpeechRequest parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtTextToSpeechRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtTextToSpeechRequest parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtTextToSpeechRequest.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtTextToSpeechRequest parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtTextToSpeechRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtTextToSpeechRequest parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtTextToSpeechRequest.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtTextToSpeechRequest parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtTextToSpeechRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static StentorMMU$RtTextToSpeechRequest parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtTextToSpeechRequest.DEFAULT_INSTANCE, p0);
    }
    public static StentorMMU$RtTextToSpeechRequest parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StentorMMU$RtTextToSpeechRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return StentorMMU$RtTextToSpeechRequest.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearReqId(){
       this.reqId_ = StentorMMU$RtTextToSpeechRequest.getDefaultInstance().getReqId();
    }
    public void clearSerialNo(){
       this.serialNo_ = 0;
    }
    public void clearSpeechText(){
       this.speechText_ = StentorMMU$RtTextToSpeechRequest.getDefaultInstance().getSpeechText();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (a.a[p0.ordinal()]){
           case 1:
             return new StentorMMU$RtTextToSpeechRequest();
           case 2:
             return new StentorMMU$RtTextToSpeechRequest$a(p2);
           case 3:
             Object[] objArray = new Object[]{"reqId_","speechText_","serialNo_"};
             return GeneratedMessageLite.newMessageInfo(StentorMMU$RtTextToSpeechRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x00", objArray);
           case 4:
             return StentorMMU$RtTextToSpeechRequest.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = StentorMMU$RtTextToSpeechRequest.PARSER;
             if (pARSER == null) {
                _monitor_enter(StentorMMU$RtTextToSpeechRequest.class);
                pARSER = StentorMMU$RtTextToSpeechRequest.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(StentorMMU$RtTextToSpeechRequest.DEFAULT_INSTANCE);
                   StentorMMU$RtTextToSpeechRequest.PARSER = pARSER;
                }
                _monitor_exit(StentorMMU$RtTextToSpeechRequest.class);
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
    public long getSerialNo(){
       return this.serialNo_;
    }
    public String getSpeechText(){
       return this.speechText_;
    }
    public ByteString getSpeechTextBytes(){
       return ByteString.copyFromUtf8(this.speechText_);
    }
    public void setReqId(String p0){
       Objects.requireNonNull(p0);
       this.reqId_ = p0;
    }
    public void setReqIdBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.reqId_ = p0.toStringUtf8();
    }
    public void setSerialNo(long p0){
       this.serialNo_ = p0;
    }
    public void setSpeechText(String p0){
       Objects.requireNonNull(p0);
       this.speechText_ = p0;
    }
    public void setSpeechTextBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.speechText_ = p0.toStringUtf8();
    }
}
