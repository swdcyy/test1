package com.kwai.video.westeros.models.CaptureOriginalConfig$Builder;
import com.kwai.video.westeros.models.CaptureOriginalConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.CaptureOriginalConfig;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.CaptureOriginalConfig$1;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class CaptureOriginalConfig$Builder extends GeneratedMessageLite$Builder implements CaptureOriginalConfigOrBuilder	// class@000eec
{

    public void CaptureOriginalConfig$Builder(){
       super(CaptureOriginalConfig.DEFAULT_INSTANCE);
    }
    public void CaptureOriginalConfig$Builder(CaptureOriginalConfig$1 p0){
       super();
    }
    public CaptureOriginalConfig$Builder clearCaptureDepthVideo(){
       this.copyOnWrite();
       this.instance.clearCaptureDepthVideo();
       return this;
    }
    public CaptureOriginalConfig$Builder clearCaptureForContentCheck(){
       this.copyOnWrite();
       this.instance.clearCaptureForContentCheck();
       return this;
    }
    public CaptureOriginalConfig$Builder clearCaptureOriginalFrames(){
       this.copyOnWrite();
       this.instance.clearCaptureOriginalFrames();
       return this;
    }
    public CaptureOriginalConfig$Builder clearCaptureOriginalVideo(){
       this.copyOnWrite();
       this.instance.clearCaptureOriginalVideo();
       return this;
    }
    public CaptureOriginalConfig$Builder clearCaptureVideoKey(){
       this.copyOnWrite();
       this.instance.clearCaptureVideoKey();
       return this;
    }
    public CaptureOriginalConfig$Builder clearFrameInterval(){
       this.copyOnWrite();
       this.instance.clearFrameInterval();
       return this;
    }
    public CaptureOriginalConfig$Builder clearFrameMaxSize(){
       this.copyOnWrite();
       this.instance.clearFrameMaxSize();
       return this;
    }
    public CaptureOriginalConfig$Builder clearFrameMaxUploadSize(){
       this.copyOnWrite();
       this.instance.clearFrameMaxUploadSize();
       return this;
    }
    public CaptureOriginalConfig$Builder clearFrameStartTime(){
       this.copyOnWrite();
       this.instance.clearFrameStartTime();
       return this;
    }
    public boolean getCaptureDepthVideo(){
       return this.instance.getCaptureDepthVideo();
    }
    public boolean getCaptureForContentCheck(){
       return this.instance.getCaptureForContentCheck();
    }
    public boolean getCaptureOriginalFrames(){
       return this.instance.getCaptureOriginalFrames();
    }
    public boolean getCaptureOriginalVideo(){
       return this.instance.getCaptureOriginalVideo();
    }
    public String getCaptureVideoKey(){
       return this.instance.getCaptureVideoKey();
    }
    public ByteString getCaptureVideoKeyBytes(){
       return this.instance.getCaptureVideoKeyBytes();
    }
    public float getFrameInterval(){
       return this.instance.getFrameInterval();
    }
    public float getFrameMaxSize(){
       return this.instance.getFrameMaxSize();
    }
    public float getFrameMaxUploadSize(){
       return this.instance.getFrameMaxUploadSize();
    }
    public float getFrameStartTime(){
       return this.instance.getFrameStartTime();
    }
    public CaptureOriginalConfig$Builder setCaptureDepthVideo(boolean p0){
       this.copyOnWrite();
       this.instance.setCaptureDepthVideo(p0);
       return this;
    }
    public CaptureOriginalConfig$Builder setCaptureForContentCheck(boolean p0){
       this.copyOnWrite();
       this.instance.setCaptureForContentCheck(p0);
       return this;
    }
    public CaptureOriginalConfig$Builder setCaptureOriginalFrames(boolean p0){
       this.copyOnWrite();
       this.instance.setCaptureOriginalFrames(p0);
       return this;
    }
    public CaptureOriginalConfig$Builder setCaptureOriginalVideo(boolean p0){
       this.copyOnWrite();
       this.instance.setCaptureOriginalVideo(p0);
       return this;
    }
    public CaptureOriginalConfig$Builder setCaptureVideoKey(String p0){
       this.copyOnWrite();
       this.instance.setCaptureVideoKey(p0);
       return this;
    }
    public CaptureOriginalConfig$Builder setCaptureVideoKeyBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setCaptureVideoKeyBytes(p0);
       return this;
    }
    public CaptureOriginalConfig$Builder setFrameInterval(float p0){
       this.copyOnWrite();
       this.instance.setFrameInterval(p0);
       return this;
    }
    public CaptureOriginalConfig$Builder setFrameMaxSize(float p0){
       this.copyOnWrite();
       this.instance.setFrameMaxSize(p0);
       return this;
    }
    public CaptureOriginalConfig$Builder setFrameMaxUploadSize(float p0){
       this.copyOnWrite();
       this.instance.setFrameMaxUploadSize(p0);
       return this;
    }
    public CaptureOriginalConfig$Builder setFrameStartTime(float p0){
       this.copyOnWrite();
       this.instance.setFrameStartTime(p0);
       return this;
    }
}
