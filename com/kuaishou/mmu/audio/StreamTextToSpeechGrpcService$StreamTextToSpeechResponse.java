package com.kuaishou.mmu.audio.StreamTextToSpeechGrpcService$StreamTextToSpeechResponse;
import com.kuaishou.mmu.audio.a;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.ByteString;
import com.kuaishou.mmu.audio.StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import fn4.a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.mmu.audio.StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class StreamTextToSpeechGrpcService$StreamTextToSpeechResponse extends GeneratedMessageLite implements a	// class@0009f6
{
    public ByteString audio_;
    public String content_;
    public long playDuration_;
    public String reqId_;
    public boolean requestContinue_;
    public int result_;
    public long serialNo_;
    public String userid_;
    public static final StreamTextToSpeechGrpcService$StreamTextToSpeechResponse DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       StreamTextToSpeechGrpcService$StreamTextToSpeechResponse streamTextTo = new StreamTextToSpeechGrpcService$StreamTextToSpeechResponse();
       StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.DEFAULT_INSTANCE = streamTextTo;
       GeneratedMessageLite.registerDefaultInstance(StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.class, streamTextTo);
    }
    public void StreamTextToSpeechGrpcService$StreamTextToSpeechResponse(){
       super();
       this.audio_ = ByteString.EMPTY;
       this.content_ = "";
       this.reqId_ = "";
       this.userid_ = "";
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechResponse getDefaultInstance(){
       return StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.DEFAULT_INSTANCE;
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$a newBuilder(){
       return StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.DEFAULT_INSTANCE.createBuilder();
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$a newBuilder(StreamTextToSpeechGrpcService$StreamTextToSpeechResponse p0){
       return StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechResponse parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.DEFAULT_INSTANCE, p0);
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechResponse parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechResponse parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.DEFAULT_INSTANCE, p0);
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechResponse parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechResponse parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.DEFAULT_INSTANCE, p0);
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechResponse parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechResponse parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.DEFAULT_INSTANCE, p0);
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechResponse parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechResponse parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.DEFAULT_INSTANCE, p0);
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechResponse parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechResponse parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.DEFAULT_INSTANCE, p0);
    }
    public static StreamTextToSpeechGrpcService$StreamTextToSpeechResponse parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAudio(){
       this.audio_ = StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.getDefaultInstance().getAudio();
    }
    public void clearContent(){
       this.content_ = StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.getDefaultInstance().getContent();
    }
    public void clearPlayDuration(){
       this.playDuration_ = 0;
    }
    public void clearReqId(){
       this.reqId_ = StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.getDefaultInstance().getReqId();
    }
    public void clearRequestContinue(){
       this.requestContinue_ = false;
    }
    public void clearResult(){
       this.result_ = 0;
    }
    public void clearSerialNo(){
       this.serialNo_ = 0;
    }
    public void clearUserid(){
       this.userid_ = StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.getDefaultInstance().getUserid();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (a.a[p0.ordinal()]){
           case 1:
             return new StreamTextToSpeechGrpcService$StreamTextToSpeechResponse();
           case 2:
             return new StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$a(p2);
           case 3:
             Object[] objArray = new Object[]{"result_","playDuration_","audio_","content_","reqId_","serialNo_","requestContinue_","userid_"};
             return GeneratedMessageLite.newMessageInfo(StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\b\xff\x02\xff\x02\xff\x02\xff\x02\x01\b\b\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\x02\x03\x03\n\x04\x02\x02\x05\x02\x02\x06\x02\x07\x07\b\x02\x02\x00", objArray);
           case 4:
             return StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.PARSER;
             if (pARSER == null) {
                _monitor_enter(StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.class);
                pARSER = StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.DEFAULT_INSTANCE);
                   StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.PARSER = pARSER;
                }
                _monitor_exit(StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.class);
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
    public ByteString getAudio(){
       return this.audio_;
    }
    public String getContent(){
       return this.content_;
    }
    public ByteString getContentBytes(){
       return ByteString.copyFromUtf8(this.content_);
    }
    public long getPlayDuration(){
       return this.playDuration_;
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
    public StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType getResult(){
       StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType streamTextTo = StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType.forNumber(this.result_);
       if (streamTextTo == null) {
          streamTextTo = StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType.UNRECOGNIZED;
       }
       return streamTextTo;
    }
    public int getResultValue(){
       return this.result_;
    }
    public long getSerialNo(){
       return this.serialNo_;
    }
    public String getUserid(){
       return this.userid_;
    }
    public ByteString getUseridBytes(){
       return ByteString.copyFromUtf8(this.userid_);
    }
    public void setAudio(ByteString p0){
       Objects.requireNonNull(p0);
       this.audio_ = p0;
    }
    public void setContent(String p0){
       Objects.requireNonNull(p0);
       this.content_ = p0;
    }
    public void setContentBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.content_ = p0.toStringUtf8();
    }
    public void setPlayDuration(long p0){
       this.playDuration_ = p0;
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
    public void setResult(StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType p0){
       this.result_ = p0.getNumber();
    }
    public void setResultValue(int p0){
       this.result_ = p0;
    }
    public void setSerialNo(long p0){
       this.serialNo_ = p0;
    }
    public void setUserid(String p0){
       Objects.requireNonNull(p0);
       this.userid_ = p0;
    }
    public void setUseridBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.userid_ = p0.toStringUtf8();
    }
}
