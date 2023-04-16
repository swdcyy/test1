package com.kwai.video.westeros.models.CaptureOriginalConfig;
import com.kwai.video.westeros.models.CaptureOriginalConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.CaptureOriginalConfig$Builder;
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
import com.kwai.video.westeros.models.CaptureOriginalConfig$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.util.Objects;
import com.google.protobuf.AbstractMessageLite;

public final class CaptureOriginalConfig extends GeneratedMessageLite implements CaptureOriginalConfigOrBuilder	// class@000eed
{
    public boolean captureDepthVideo_;
    public boolean captureForContentCheck_;
    public boolean captureOriginalFrames_;
    public boolean captureOriginalVideo_;
    public String captureVideoKey_;
    public float frameInterval_;
    public float frameMaxSize_;
    public float frameMaxUploadSize_;
    public float frameStartTime_;
    public static final CaptureOriginalConfig DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       CaptureOriginalConfig uCaptureOrig = new CaptureOriginalConfig();
       CaptureOriginalConfig.DEFAULT_INSTANCE = uCaptureOrig;
       GeneratedMessageLite.registerDefaultInstance(CaptureOriginalConfig.class, uCaptureOrig);
    }
    public void CaptureOriginalConfig(){
       super();
       this.captureVideoKey_ = "";
    }
    public static CaptureOriginalConfig getDefaultInstance(){
       return CaptureOriginalConfig.DEFAULT_INSTANCE;
    }
    public static CaptureOriginalConfig$Builder newBuilder(){
       return CaptureOriginalConfig.DEFAULT_INSTANCE.createBuilder();
    }
    public static CaptureOriginalConfig$Builder newBuilder(CaptureOriginalConfig p0){
       return CaptureOriginalConfig.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static CaptureOriginalConfig parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(CaptureOriginalConfig.DEFAULT_INSTANCE, p0);
    }
    public static CaptureOriginalConfig parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(CaptureOriginalConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static CaptureOriginalConfig parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(CaptureOriginalConfig.DEFAULT_INSTANCE, p0);
    }
    public static CaptureOriginalConfig parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CaptureOriginalConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static CaptureOriginalConfig parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(CaptureOriginalConfig.DEFAULT_INSTANCE, p0);
    }
    public static CaptureOriginalConfig parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CaptureOriginalConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static CaptureOriginalConfig parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(CaptureOriginalConfig.DEFAULT_INSTANCE, p0);
    }
    public static CaptureOriginalConfig parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CaptureOriginalConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static CaptureOriginalConfig parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(CaptureOriginalConfig.DEFAULT_INSTANCE, p0);
    }
    public static CaptureOriginalConfig parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CaptureOriginalConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static CaptureOriginalConfig parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(CaptureOriginalConfig.DEFAULT_INSTANCE, p0);
    }
    public static CaptureOriginalConfig parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CaptureOriginalConfig.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return CaptureOriginalConfig.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearCaptureDepthVideo(){
       this.captureDepthVideo_ = false;
    }
    public void clearCaptureForContentCheck(){
       this.captureForContentCheck_ = false;
    }
    public void clearCaptureOriginalFrames(){
       this.captureOriginalFrames_ = false;
    }
    public void clearCaptureOriginalVideo(){
       this.captureOriginalVideo_ = false;
    }
    public void clearCaptureVideoKey(){
       this.captureVideoKey_ = CaptureOriginalConfig.getDefaultInstance().getCaptureVideoKey();
    }
    public void clearFrameInterval(){
       this.frameInterval_ = 0;
    }
    public void clearFrameMaxSize(){
       this.frameMaxSize_ = 0;
    }
    public void clearFrameMaxUploadSize(){
       this.frameMaxUploadSize_ = 0;
    }
    public void clearFrameStartTime(){
       this.frameStartTime_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (CaptureOriginalConfig$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new CaptureOriginalConfig();
           case 2:
             return new CaptureOriginalConfig$Builder(p2);
           case 3:
             Object[] objArray = new Object[9];
             objArray[0] = "captureOriginalVideo_";
             objArray[i] = "captureDepthVideo_";
             objArray[2] = "captureVideoKey_";
             objArray[3] = "captureOriginalFrames_";
             objArray[4] = "frameStartTime_";
             objArray[5] = "frameInterval_";
             objArray[6] = "frameMaxSize_";
             objArray[7] = "frameMaxUploadSize_";
             objArray[8] = "captureForContentCheck_";
             return GeneratedMessageLite.newMessageInfo(CaptureOriginalConfig.DEFAULT_INSTANCE, "\xff\x02\xff\x02\t\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\t\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x02\x07\x03\x02\x02\x04\x07\x05\x01\x06\x01\x07\x01\b\x01\t\x07\x00", objArray);
           case 4:
             return CaptureOriginalConfig.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = CaptureOriginalConfig.PARSER;
             if (pARSER == null) {
                _monitor_enter(CaptureOriginalConfig.class);
                pARSER = CaptureOriginalConfig.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(CaptureOriginalConfig.DEFAULT_INSTANCE);
                   CaptureOriginalConfig.PARSER = pARSER;
                }
                _monitor_exit(CaptureOriginalConfig.class);
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
    public boolean getCaptureDepthVideo(){
       return this.captureDepthVideo_;
    }
    public boolean getCaptureForContentCheck(){
       return this.captureForContentCheck_;
    }
    public boolean getCaptureOriginalFrames(){
       return this.captureOriginalFrames_;
    }
    public boolean getCaptureOriginalVideo(){
       return this.captureOriginalVideo_;
    }
    public String getCaptureVideoKey(){
       return this.captureVideoKey_;
    }
    public ByteString getCaptureVideoKeyBytes(){
       return ByteString.copyFromUtf8(this.captureVideoKey_);
    }
    public float getFrameInterval(){
       return this.frameInterval_;
    }
    public float getFrameMaxSize(){
       return this.frameMaxSize_;
    }
    public float getFrameMaxUploadSize(){
       return this.frameMaxUploadSize_;
    }
    public float getFrameStartTime(){
       return this.frameStartTime_;
    }
    public void setCaptureDepthVideo(boolean p0){
       this.captureDepthVideo_ = p0;
    }
    public void setCaptureForContentCheck(boolean p0){
       this.captureForContentCheck_ = p0;
    }
    public void setCaptureOriginalFrames(boolean p0){
       this.captureOriginalFrames_ = p0;
    }
    public void setCaptureOriginalVideo(boolean p0){
       this.captureOriginalVideo_ = p0;
    }
    public void setCaptureVideoKey(String p0){
       Objects.requireNonNull(p0);
       this.captureVideoKey_ = p0;
    }
    public void setCaptureVideoKeyBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.captureVideoKey_ = p0.toStringUtf8();
    }
    public void setFrameInterval(float p0){
       this.frameInterval_ = p0;
    }
    public void setFrameMaxSize(float p0){
       this.frameMaxSize_ = p0;
    }
    public void setFrameMaxUploadSize(float p0){
       this.frameMaxUploadSize_ = p0;
    }
    public void setFrameStartTime(float p0){
       this.frameStartTime_ = p0;
    }
}
