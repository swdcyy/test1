package com.yxcorp.gifshow.media.model.DegradeEncodeConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Application;
import o56.a;
import android.content.Context;
import ekd.p0;
import java.lang.Boolean;
import java.lang.StringBuilder;

public class DegradeEncodeConfig implements Serializable	// class@001d07
{
    public int mAudioBitrate;
    public int mAudioCutoff;
    public String mAudioProfile;
    public boolean mEnableAdaptiveX264Params;
    public int mEncodeHeight;
    public int mEncodeWidth;
    public String mExtraX264Params;
    public double mInterThreshold;
    public boolean mTryUsePbo;
    public long mVideoBitrate;
    public int mVideoGopSize;
    public String mX264Params;
    public String mX264ParamsCellular;
    public String mX264Preset;
    public static final long serialVersionUID = 0xf9ba4b2f6e868174;

    public void DegradeEncodeConfig(){
       super();
       this.mTryUsePbo = false;
    }
    public int getAudioBitrate(){
       DegradeEncodeConfig tmAudioBitra = this.mAudioBitrate;
       if (tmAudioBitra > null) {
       }else {
          tmAudioBitra = 0xfa00;
       }
       return tmAudioBitra;
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
    public int getEncodeHeight(){
       DegradeEncodeConfig tmEncodeHeig = this.mEncodeHeight;
       if (tmEncodeHeig > null) {
       }else {
          tmEncodeHeig = 1024;
       }
       return tmEncodeHeig;
    }
    public int getEncodeWidth(){
       DegradeEncodeConfig tmEncodeWidt = this.mEncodeWidth;
       if (tmEncodeWidt > null) {
       }else {
          tmEncodeWidt = 576;
       }
       return tmEncodeWidt;
    }
    public String getExtraX264Params(){
       String str;
       DegradeEncodeConfig obj = PatchProxy.apply(null, this, DegradeEncodeConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (!TextUtils.x(this.mExtraX264Params))? this.mExtraX264Params: "";
       return obj;
    }
    public double getInterThreshold(){
       DegradeEncodeConfig tmInterThres = this.mInterThreshold;
       if (tmInterThres - Double.NaN) {
       }else {
          tmInterThres = 0;
       }
       return tmInterThres;
    }
    public boolean getTryUsePbo(){
       return this.mTryUsePbo;
    }
    public long getVideoBitrate(){
       DegradeEncodeConfig tmVideoBitra = this.mVideoBitrate;
       if (tmVideoBitra > 0) {
       }else {
          tmVideoBitra = 0x419ce0;
       }
       return tmVideoBitra;
    }
    public int getVideoGopSize(){
       DegradeEncodeConfig tmVideoGopSi = this.mVideoGopSize;
       if (tmVideoGopSi > null) {
       }else {
          tmVideoGopSi = 20;
       }
       return tmVideoGopSi;
    }
    public String getX264Params(){
       String str;
       DegradeEncodeConfig obj = PatchProxy.apply(null, this, DegradeEncodeConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(this.mX264ParamsCellular) && !p0.F(a.b())) {
          return this.mX264ParamsCellular;
       }
       obj = (!TextUtils.x(this.mX264Params))? this.mX264Params: "crf=15:threads=6:keyint=250:vbv_maxrate=2700:vbv_bufsize=5400";
       return obj;
    }
    public String getX264Preset(){
       String str;
       DegradeEncodeConfig obj = PatchProxy.apply(null, this, DegradeEncodeConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (!TextUtils.x(this.mX264Preset))? this.mX264Preset: "veryfast";
       return obj;
    }
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, DegradeEncodeConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mEncodeWidth > null && (this.mEncodeHeight > null && (!TextUtils.x(this.mX264Params) && (!TextUtils.x(this.mX264Preset) && this.mAudioBitrate > null))))? true: false;
       return b;
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, DegradeEncodeConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "EncodeConfig{mEncodeWidth="+this.mEncodeWidth+", mEncodeHeight="+this.mEncodeHeight+", mX264Params=\'"+this.mX264Params+'''+", mX264ParamsCellular=\'"+this.mX264ParamsCellular+'''+", mX264Preset=\'"+this.mX264Preset+'''+", mAudioProfile=\'"+this.mAudioProfile+'''+", mAudioBitrate="+this.mAudioBitrate+", mAudioCutoff="+this.mAudioCutoff+", mEnableAdaptiveX264Params="+this.mEnableAdaptiveX264Params+", mInterThreshold="+this.mInterThreshold+", mExtraX264Params=\'"+this.mExtraX264Params+'''+"£¬mTryUsePbo="+this.mTryUsePbo+'}';
       if (!this.isValid()) {
          obj = obj+"\nEncodeConfig is invalid, use some params use default value\nEncodeConfig{mEncodeWidth="+this.getEncodeWidth()+", mEncodeHeight="+this.getEncodeHeight()+", mX264Params=\'"+this.getX264Params()+'''+", mX264Preset=\'"+this.getX264Preset()+'''+", mAudioProfile=\'"+this.getAudioProfile()+'''+", mAudioBitrate="+this.getAudioBitrate()+", mAudioCutoff="+this.getAudioCutoff()+", mEnableAdaptiveX264Params="+this.getEnableAdaptiveX264Params()+", mInterThreshold="+this.getInterThreshold()+", mExtraX264Params=\'"+this.getExtraX264Params()+'''+", mTryUsePbo="+this.mTryUsePbo+'}';
       }
       return obj;
    }
}
