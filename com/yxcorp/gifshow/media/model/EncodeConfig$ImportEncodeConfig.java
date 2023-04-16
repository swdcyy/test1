package com.yxcorp.gifshow.media.model.EncodeConfig$ImportEncodeConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Application;
import o56.a;
import android.content.Context;
import ekd.p0;

public class EncodeConfig$ImportEncodeConfig implements Serializable	// class@001d0c
{
    public int mAudioBitrate;
    public int mAudioCutoff;
    public String mAudioProfile;
    public String mClipX264Params;
    public String mClipX264Preset;
    public boolean mEnableAdaptiveX264Params;
    public int mEncodeHeight;
    public int mEncodeWidth;
    public String mExport60FpsOptimizeParams;
    public boolean mExport60fpsOptimize;
    public String mExportX264Params;
    public String mExportX264Params1080p;
    public String mExportX264ParamsCellular;
    public String mExportX264ParamsCellular1080p;
    public String mExportX264Preset;
    public String mExtraX264Params;
    public String mFrameRateMode;
    public String mHdExportParams;
    public String mImportTranscodeParams;
    public double mInterThreshold;
    public int mMaxFrameRate;
    public boolean mTryUsePbo;
    public long mVideoBitrate;
    public long mVideoBitrate1080p;
    public String mVideoEncoderName;
    public int mVideoGopSize;
    public int mVideoGopSize1080p;
    public static final long serialVersionUID = 0xcfe190be6ca89d3f;

    public void EncodeConfig$ImportEncodeConfig(){
       super();
       this.mEncodeWidth = 720;
       this.mEncodeHeight = 960;
       this.mExportX264Params = "cabac=1:mixed-refs=0:rc-lookahead=10:ref=1:subme=2:trellis=0:weightp=1:crf=15:qpmin=0:qpmax=69:merange=16:me=hex:scenecut=40:ipratio=1.4:qcomp=0.6:keyint=250:bframes=3:open-gop=0:vbv_maxrate=5000:vbv_bufsize=10000:threads=6:mbtree=1:analyse=i4x4,i8x8,p8x8,b8x8";
       this.mExportX264ParamsCellular = "";
       this.mExportX264Params1080p = "cabac=1:mixed-refs=0:rc-lookahead=10:ref=1:subme=2:trellis=0:weightp=1:crf=15:qpmin=0:qpmax=69:merange=16:me=hex:scenecut=40:ipratio=1.4:qcomp=0.6:keyint=250:bframes=3:open-gop=0:vbv_maxrate=8000:vbv_bufsize=16000:threads=6:mbtree=1:analyse=i4x4,i8x8,p8x8,b8x8";
       this.mExportX264ParamsCellular1080p = "";
       this.mExportX264Preset = "veryfast";
       this.mClipX264Params = "deblock=0,0:cabac=0:mixed-refs=0:rc-lookahead=0:trellis=0:qpmin=0:qpmax=51:keyint=0:bitrate=30000:vbv_maxrate=30000:vbv_bufsize=30000:threads=6";
       this.mClipX264Preset = "ultrafast";
       this.mAudioProfile = "aac_low";
       this.mAudioBitrate = 0x2ee00;
       this.mAudioCutoff = 0x4e20;
       this.mEnableAdaptiveX264Params = false;
       this.mInterThreshold = 0;
       this.mExtraX264Params = "";
       this.mTryUsePbo = false;
       this.mImportTranscodeParams = "";
       this.mVideoEncoderName = "libx264";
       this.mVideoBitrate = 0x7a1200;
       this.mVideoGopSize = 250;
       this.mVideoBitrate1080p = 0xa7d8c0;
       this.mVideoGopSize1080p = 250;
       this.mMaxFrameRate = 30;
       this.mExport60fpsOptimize = false;
       this.mExport60FpsOptimizeParams = "";
    }
    public int getAudioBitrate(){
       return this.mAudioBitrate;
    }
    public int getAudioCutoff(){
       return this.mAudioCutoff;
    }
    public String getAudioProfile(){
       return this.mAudioProfile;
    }
    public boolean getEnableAdaptiveX264Params(){
       return this.mEnableAdaptiveX264Params;
    }
    public boolean getExport60fpsOptimize(){
       return this.mExport60fpsOptimize;
    }
    public String getExport60fpsOptimizeParams(){
       return this.mExport60FpsOptimizeParams;
    }
    public String getExtraX264Params(){
       return this.mExtraX264Params;
    }
    public int getImportEncodeHeight(){
       return this.mEncodeHeight;
    }
    public int getImportEncodeWidth(){
       return this.mEncodeWidth;
    }
    public String getImportTranscodeParams(){
       return this.mImportTranscodeParams;
    }
    public double getInterThreshold(){
       return this.mInterThreshold;
    }
    public boolean getTryUsePbo(){
       return this.mTryUsePbo;
    }
    public String getX264Params(boolean p0){
       EncodeConfig$ImportEncodeConfig tmExportX264;
       if (PatchProxy.isSupport(EncodeConfig$ImportEncodeConfig.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, EncodeConfig$ImportEncodeConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          if (!TextUtils.x(this.mExportX264ParamsCellular) && !p0.F(a.b())) {
             tmExportX264 = this.mExportX264ParamsCellular;
          }else if(TextUtils.x(this.mExportX264Params)){
             tmExportX264 = "cabac=1:mixed-refs=0:rc-lookahead=10:ref=1:subme=2:trellis=0:weightp=1:crf=15:qpmin=0:qpmax=69:merange=16:me=hex:scenecut=40:ipratio=1.4:qcomp=0.6:keyint=250:bframes=3:open-gop=0:vbv_maxrate=5000:vbv_bufsize=10000:threads=6:mbtree=1:analyse=i4x4,i8x8,p8x8,b8x8";
          }else {
             tmExportX264 = this.mExportX264Params;
          }
       }else if(TextUtils.x(this.mClipX264Params)){
          tmExportX264 = "deblock=0,0:cabac=0:mixed-refs=0:rc-lookahead=0:trellis=0:qpmin=0:qpmax=51:keyint=0:bitrate=30000:vbv_maxrate=30000:vbv_bufsize=30000:threads=6";
       }else {
          tmExportX264 = this.mClipX264Params;
       }
       return tmExportX264;
    }
    public String getX264Params1080p(boolean p0){
       EncodeConfig$ImportEncodeConfig tmExportX264;
       if (PatchProxy.isSupport(EncodeConfig$ImportEncodeConfig.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, EncodeConfig$ImportEncodeConfig.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          if (!TextUtils.x(this.mExportX264ParamsCellular1080p) && !p0.F(a.b())) {
             tmExportX264 = this.mExportX264ParamsCellular1080p;
          }else if(TextUtils.x(this.mExportX264Params1080p)){
             tmExportX264 = "cabac=1:mixed-refs=0:rc-lookahead=10:ref=1:subme=2:trellis=0:weightp=1:crf=15:qpmin=0:qpmax=69:merange=16:me=hex:scenecut=40:ipratio=1.4:qcomp=0.6:keyint=250:bframes=3:open-gop=0:vbv_maxrate=8000:vbv_bufsize=16000:threads=6:mbtree=1:analyse=i4x4,i8x8,p8x8,b8x8";
          }else {
             tmExportX264 = this.mExportX264Params1080p;
          }
       }else if(TextUtils.x(this.mClipX264Params)){
          tmExportX264 = "deblock=0,0:cabac=0:mixed-refs=0:rc-lookahead=0:trellis=0:qpmin=0:qpmax=51:keyint=0:bitrate=30000:vbv_maxrate=30000:vbv_bufsize=30000:threads=6";
       }else {
          tmExportX264 = this.mClipX264Params;
       }
       return tmExportX264;
    }
    public String getX264Preset(boolean p0){
       String str;
       if (PatchProxy.isSupport(EncodeConfig$ImportEncodeConfig.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, EncodeConfig$ImportEncodeConfig.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          str = (TextUtils.x(this.mExportX264Preset))? "veryfast": this.mExportX264Preset;
       }else if(TextUtils.x(this.mClipX264Preset)){
          str = "ultrafast";
       }else {
          str = this.mClipX264Preset;
       }
       return str;
    }
    public void setSize(int p0,int p1){
       this.mEncodeWidth = p0;
       this.mEncodeHeight = p1;
    }
}
