package com.kuaishou.mmu.audio.VoiceConversionGrpcService$RtVoiceConversionResponse;
import com.kuaishou.mmu.audio.c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.ByteString;
import com.kuaishou.mmu.audio.VoiceConversionGrpcService$RtVoiceConversionResponse$a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import fn4.c;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kuaishou.mmu.common.Result$ResultStatus;
import com.kuaishou.mmu.audio.VoiceConversionGrpcService$RtVoiceConversionResponse$Type;
import java.util.Objects;
import com.kuaishou.mmu.common.Result$ResultStatus$a;
import com.google.protobuf.AbstractMessageLite;

public final class VoiceConversionGrpcService$RtVoiceConversionResponse extends GeneratedMessageLite implements c	// class@000a03
{
    public ByteString audio_;
    public boolean continue_;
    public String reqid_;
    public long serialNo_;
    public Result$ResultStatus status_;
    public int type_;
    public String userid_;
    public static final VoiceConversionGrpcService$RtVoiceConversionResponse DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       VoiceConversionGrpcService$RtVoiceConversionResponse rtVoiceConve = new VoiceConversionGrpcService$RtVoiceConversionResponse();
       VoiceConversionGrpcService$RtVoiceConversionResponse.DEFAULT_INSTANCE = rtVoiceConve;
       GeneratedMessageLite.registerDefaultInstance(VoiceConversionGrpcService$RtVoiceConversionResponse.class, rtVoiceConve);
    }
    public void VoiceConversionGrpcService$RtVoiceConversionResponse(){
       super();
       this.reqid_ = "";
       this.userid_ = "";
       this.audio_ = ByteString.EMPTY;
    }
    public static VoiceConversionGrpcService$RtVoiceConversionResponse getDefaultInstance(){
       return VoiceConversionGrpcService$RtVoiceConversionResponse.DEFAULT_INSTANCE;
    }
    public static VoiceConversionGrpcService$RtVoiceConversionResponse$a newBuilder(){
       return VoiceConversionGrpcService$RtVoiceConversionResponse.DEFAULT_INSTANCE.createBuilder();
    }
    public static VoiceConversionGrpcService$RtVoiceConversionResponse$a newBuilder(VoiceConversionGrpcService$RtVoiceConversionResponse p0){
       return VoiceConversionGrpcService$RtVoiceConversionResponse.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionResponse parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(VoiceConversionGrpcService$RtVoiceConversionResponse.DEFAULT_INSTANCE, p0);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionResponse parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(VoiceConversionGrpcService$RtVoiceConversionResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionResponse parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$RtVoiceConversionResponse.DEFAULT_INSTANCE, p0);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionResponse parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$RtVoiceConversionResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionResponse parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$RtVoiceConversionResponse.DEFAULT_INSTANCE, p0);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionResponse parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$RtVoiceConversionResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionResponse parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$RtVoiceConversionResponse.DEFAULT_INSTANCE, p0);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionResponse parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$RtVoiceConversionResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionResponse parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$RtVoiceConversionResponse.DEFAULT_INSTANCE, p0);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionResponse parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$RtVoiceConversionResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionResponse parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$RtVoiceConversionResponse.DEFAULT_INSTANCE, p0);
    }
    public static VoiceConversionGrpcService$RtVoiceConversionResponse parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(VoiceConversionGrpcService$RtVoiceConversionResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return VoiceConversionGrpcService$RtVoiceConversionResponse.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAudio(){
       this.audio_ = VoiceConversionGrpcService$RtVoiceConversionResponse.getDefaultInstance().getAudio();
    }
    public void clearContinue(){
       this.continue_ = false;
    }
    public void clearReqid(){
       this.reqid_ = VoiceConversionGrpcService$RtVoiceConversionResponse.getDefaultInstance().getReqid();
    }
    public void clearSerialNo(){
       this.serialNo_ = 0;
    }
    public void clearStatus(){
       this.status_ = null;
    }
    public void clearType(){
       this.type_ = 0;
    }
    public void clearUserid(){
       this.userid_ = VoiceConversionGrpcService$RtVoiceConversionResponse.getDefaultInstance().getUserid();
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (c.a[p0.ordinal()]){
           case 1:
             return new VoiceConversionGrpcService$RtVoiceConversionResponse();
           case 2:
             return new VoiceConversionGrpcService$RtVoiceConversionResponse$a(p2);
           case 3:
             Object[] objArray = new Object[]{"reqid_","userid_","serialNo_","audio_","status_","continue_","type_"};
             return GeneratedMessageLite.newMessageInfo(VoiceConversionGrpcService$RtVoiceConversionResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x07\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x07\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x03\x04\n\x05\t\x06\x07\x07\f\x00", objArray);
           case 4:
             return VoiceConversionGrpcService$RtVoiceConversionResponse.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = VoiceConversionGrpcService$RtVoiceConversionResponse.PARSER;
             if (pARSER == null) {
                _monitor_enter(VoiceConversionGrpcService$RtVoiceConversionResponse.class);
                pARSER = VoiceConversionGrpcService$RtVoiceConversionResponse.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(VoiceConversionGrpcService$RtVoiceConversionResponse.DEFAULT_INSTANCE);
                   VoiceConversionGrpcService$RtVoiceConversionResponse.PARSER = pARSER;
                }
                _monitor_exit(VoiceConversionGrpcService$RtVoiceConversionResponse.class);
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
    public boolean getContinue(){
       return this.continue_;
    }
    public String getReqid(){
       return this.reqid_;
    }
    public ByteString getReqidBytes(){
       return ByteString.copyFromUtf8(this.reqid_);
    }
    public long getSerialNo(){
       return this.serialNo_;
    }
    public Result$ResultStatus getStatus(){
       VoiceConversionGrpcService$RtVoiceConversionResponse tstatus_ = this.status_;
       if (tstatus_ == null) {
          tstatus_ = Result$ResultStatus.getDefaultInstance();
       }
       return tstatus_;
    }
    public VoiceConversionGrpcService$RtVoiceConversionResponse$Type getType(){
       VoiceConversionGrpcService$RtVoiceConversionResponse$Type rtVoiceConve = VoiceConversionGrpcService$RtVoiceConversionResponse$Type.forNumber(this.type_);
       if (rtVoiceConve == null) {
          rtVoiceConve = VoiceConversionGrpcService$RtVoiceConversionResponse$Type.UNRECOGNIZED;
       }
       return rtVoiceConve;
    }
    public int getTypeValue(){
       return this.type_;
    }
    public String getUserid(){
       return this.userid_;
    }
    public ByteString getUseridBytes(){
       return ByteString.copyFromUtf8(this.userid_);
    }
    public boolean hasStatus(){
       boolean b = (this.status_ != null)? true: false;
       return b;
    }
    public void mergeStatus(Result$ResultStatus p0){
       Objects.requireNonNull(p0);
       VoiceConversionGrpcService$RtVoiceConversionResponse tstatus_ = this.status_;
       this.status_ = (tstatus_ != null && tstatus_ != Result$ResultStatus.getDefaultInstance())? Result$ResultStatus.newBuilder(this.status_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setAudio(ByteString p0){
       Objects.requireNonNull(p0);
       this.audio_ = p0;
    }
    public void setContinue(boolean p0){
       this.continue_ = p0;
    }
    public void setReqid(String p0){
       Objects.requireNonNull(p0);
       this.reqid_ = p0;
    }
    public void setReqidBytes(ByteString p0){
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.reqid_ = p0.toStringUtf8();
    }
    public void setSerialNo(long p0){
       this.serialNo_ = p0;
    }
    public void setStatus(Result$ResultStatus p0){
       Objects.requireNonNull(p0);
       this.status_ = p0;
    }
    public void setType(VoiceConversionGrpcService$RtVoiceConversionResponse$Type p0){
       this.type_ = p0.getNumber();
    }
    public void setTypeValue(int p0){
       this.type_ = p0;
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
