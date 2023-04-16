package com.kuaishou.protobuf.livestream.stentor.StreamSoundHound$RtSoundHoundResponse;
import hr4.u;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.protobuf.livestream.stentor.StreamSoundHound$RtSoundHoundResponse$a;
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
import hr4.s;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.protobuf.livestream.stentor.StreamSoundHound$RtMusicStatus;
import com.kuaishou.mmu.common.Result$ResultCode;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class StreamSoundHound$RtSoundHoundResponse extends GeneratedMessageLite implements u	// class@000dd0
{
    public String debugInfo_;
    public String reqId_;
    public int rtMusicStatus_;
    public long serialNo_;
    public int status_;
    public static final StreamSoundHound$RtSoundHoundResponse DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       StreamSoundHound$RtSoundHoundResponse rtSoundHound = new StreamSoundHound$RtSoundHoundResponse();
       StreamSoundHound$RtSoundHoundResponse.DEFAULT_INSTANCE = rtSoundHound;
       GeneratedMessageLite.registerDefaultInstance(StreamSoundHound$RtSoundHoundResponse.class, rtSoundHound);
    }
    public void StreamSoundHound$RtSoundHoundResponse(){
       super();
       this.reqId_ = "";
       this.debugInfo_ = "";
    }
    public static StreamSoundHound$RtSoundHoundResponse getDefaultInstance(){
       return StreamSoundHound$RtSoundHoundResponse.DEFAULT_INSTANCE;
    }
    public static StreamSoundHound$RtSoundHoundResponse$a newBuilder(){
       return StreamSoundHound$RtSoundHoundResponse.DEFAULT_INSTANCE.createBuilder();
    }
    public static StreamSoundHound$RtSoundHoundResponse$a newBuilder(StreamSoundHound$RtSoundHoundResponse p0){
       return StreamSoundHound$RtSoundHoundResponse.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static StreamSoundHound$RtSoundHoundResponse parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(StreamSoundHound$RtSoundHoundResponse.DEFAULT_INSTANCE, p0);
    }
    public static StreamSoundHound$RtSoundHoundResponse parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(StreamSoundHound$RtSoundHoundResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StreamSoundHound$RtSoundHoundResponse parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(StreamSoundHound$RtSoundHoundResponse.DEFAULT_INSTANCE, p0);
    }
    public static StreamSoundHound$RtSoundHoundResponse parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StreamSoundHound$RtSoundHoundResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StreamSoundHound$RtSoundHoundResponse parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(StreamSoundHound$RtSoundHoundResponse.DEFAULT_INSTANCE, p0);
    }
    public static StreamSoundHound$RtSoundHoundResponse parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StreamSoundHound$RtSoundHoundResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StreamSoundHound$RtSoundHoundResponse parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(StreamSoundHound$RtSoundHoundResponse.DEFAULT_INSTANCE, p0);
    }
    public static StreamSoundHound$RtSoundHoundResponse parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StreamSoundHound$RtSoundHoundResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StreamSoundHound$RtSoundHoundResponse parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(StreamSoundHound$RtSoundHoundResponse.DEFAULT_INSTANCE, p0);
    }
    public static StreamSoundHound$RtSoundHoundResponse parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StreamSoundHound$RtSoundHoundResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static StreamSoundHound$RtSoundHoundResponse parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(StreamSoundHound$RtSoundHoundResponse.DEFAULT_INSTANCE, p0);
    }
    public static StreamSoundHound$RtSoundHoundResponse parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(StreamSoundHound$RtSoundHoundResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return StreamSoundHound$RtSoundHoundResponse.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearDebugInfo(){
       this.debugInfo_ = StreamSoundHound$RtSoundHoundResponse.getDefaultInstance().getDebugInfo();
    }
    public void clearReqId(){
       this.reqId_ = StreamSoundHound$RtSoundHoundResponse.getDefaultInstance().getReqId();
    }
    public void clearRtMusicStatus(){
       this.rtMusicStatus_ = 0;
    }
    public void clearSerialNo(){
       this.serialNo_ = 0;
    }
    public void clearStatus(){
       this.status_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (s.a[p0.ordinal()]){
           case 1:
             return new StreamSoundHound$RtSoundHoundResponse();
           case 2:
             return new StreamSoundHound$RtSoundHoundResponse$a(p2);
           case 3:
             Object[] objArray = new Object[]{"status_","reqId_","serialNo_","rtMusicStatus_","debugInfo_"};
             return GeneratedMessageLite.newMessageInfo(StreamSoundHound$RtSoundHoundResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\x02\x02\x02\x03\x02\x04\f\x05\x02\x02\x00", objArray);
           case 4:
             return StreamSoundHound$RtSoundHoundResponse.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = StreamSoundHound$RtSoundHoundResponse.PARSER;
             if (pARSER == null) {
                _monitor_enter(StreamSoundHound$RtSoundHoundResponse.class);
                pARSER = StreamSoundHound$RtSoundHoundResponse.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(StreamSoundHound$RtSoundHoundResponse.DEFAULT_INSTANCE);
                   StreamSoundHound$RtSoundHoundResponse.PARSER = pARSER;
                }
                _monitor_exit(StreamSoundHound$RtSoundHoundResponse.class);
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
    public String getDebugInfo(){
       return this.debugInfo_;
    }
    public ByteString getDebugInfoBytes(){
       return ByteString.copyFromUtf8(this.debugInfo_);
    }
    public String getReqId(){
       return this.reqId_;
    }
    public ByteString getReqIdBytes(){
       return ByteString.copyFromUtf8(this.reqId_);
    }
    public StreamSoundHound$RtMusicStatus getRtMusicStatus(){
       StreamSoundHound$RtMusicStatus rtMusicStatu = StreamSoundHound$RtMusicStatus.forNumber(this.rtMusicStatus_);
       if (rtMusicStatu == null) {
          rtMusicStatu = StreamSoundHound$RtMusicStatus.UNRECOGNIZED;
       }
       return rtMusicStatu;
    }
    public int getRtMusicStatusValue(){
       return this.rtMusicStatus_;
    }
    public long getSerialNo(){
       return this.serialNo_;
    }
    public Result$ResultCode getStatus(){
       Result$ResultCode resultCode = Result$ResultCode.forNumber(this.status_);
       if (resultCode == null) {
          resultCode = Result$ResultCode.UNRECOGNIZED;
       }
       return resultCode;
    }
    public int getStatusValue(){
       return this.status_;
    }
    public void setDebugInfo(String p0){
       Objects.requireNonNull(p0);
       this.debugInfo_ = p0;
    }
    public void setDebugInfoBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.debugInfo_ = p0.toStringUtf8();
    }
    public void setReqId(String p0){
       Objects.requireNonNull(p0);
       this.reqId_ = p0;
    }
    public void setReqIdBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.reqId_ = p0.toStringUtf8();
    }
    public void setRtMusicStatus(StreamSoundHound$RtMusicStatus p0){
       this.rtMusicStatus_ = p0.getNumber();
    }
    public void setRtMusicStatusValue(int p0){
       this.rtMusicStatus_ = p0;
    }
    public void setSerialNo(long p0){
       this.serialNo_ = p0;
    }
    public void setStatus(Result$ResultCode p0){
       this.status_ = p0.getNumber();
    }
    public void setStatusValue(int p0){
       this.status_ = p0;
    }
}
