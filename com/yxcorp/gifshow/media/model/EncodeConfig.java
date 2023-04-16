package com.yxcorp.gifshow.media.model.EncodeConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.yxcorp.gifshow.media.model.EncodeConfig$ComplexEncodeProfile;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashSet;
import java.util.Collection;
import java.util.Iterator;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.media.model.EncodeConfig$ComplexEncodeConfig;
import java.lang.Integer;
import com.yxcorp.gifshow.media.model.DegradeEncodeConfig;
import com.yxcorp.gifshow.media.model.EncodeConfig$AdaptiveX264Config;
import com.yxcorp.gifshow.media.model.EncodeConfig$ImportEncodeConfig;
import java.lang.Number;
import java.lang.Math;
import com.yxcorp.gifshow.media.model.EncodeConfig$SkipTranscodingConfig;
import android.app.Application;
import o56.a;
import android.content.Context;
import ekd.p0;

public class EncodeConfig implements Serializable	// class@001d0e
{
    public EncodeConfig$AdaptiveX264Config mAdaptiveX264Config;
    public boolean mAllowHardwareEncodeTest;
    public int mAudioBitrate;
    public int mAudioCutoff;
    public String mAudioProfile;
    public List mComplexEncodeProfiles;
    public DegradeEncodeConfig mDegradeEncodeConfig;
    public int mDelay;
    public boolean mEnableAdaptiveX264Params;
    public boolean mEncodeTypeModifiable;
    public boolean mForceDisableConfigFallback;
    public boolean mForceDisableOpenglSync;
    public boolean mHardwareEncode;
    public int mHardwareRecordFps;
    public int mHardwareRecordMaxSize;
    public int mHeight;
    public long mId;
    public EncodeConfig$ImportEncodeConfig mImportConfig;
    public String mPipelineX264Params;
    public int mPreviewMaxSize;
    public EncodeConfig$SkipTranscodingConfig mSkipTranscodingConfig;
    public int mSoftwareRecordMaxSize;
    public boolean mTryUsePbo;
    public boolean mUse265Encode;
    public int mWidth;
    public String mX264Params;
    public String mX264ParamsCellular;
    public static final long serialVersionUID = 0xcfe190be6ca89d41;

    public void EncodeConfig(){
       super();
       this.mDelay = 50;
       this.mWidth = 540;
       this.mHeight = 960;
       this.mHardwareRecordFps = 30;
       this.mHardwareRecordMaxSize = 0;
       this.mSoftwareRecordMaxSize = 0;
       this.mX264Params = "";
       this.mX264ParamsCellular = "";
       this.mUse265Encode = false;
       this.mHardwareEncode = false;
       this.mEncodeTypeModifiable = true;
       this.mAllowHardwareEncodeTest = false;
       this.mForceDisableOpenglSync = false;
       this.mForceDisableConfigFallback = false;
       this.mAudioProfile = "aac_low";
       this.mAudioBitrate = 0x2ee00;
       this.mAudioCutoff = 0x4e20;
       this.mEnableAdaptiveX264Params = false;
       this.mAdaptiveX264Config = null;
       this.mTryUsePbo = false;
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
    public EncodeConfig$ComplexEncodeProfile getComplexEncodeConfig(List p0){
       EncodeConfig obj = PatchProxy.applyOneRefs(p0, this, EncodeConfig.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mComplexEncodeProfiles;
       EncodeConfig$ComplexEncodeProfile uComplexEnco = null;
       if (obj == null || (obj.size() && p0 != null)) {
          Iterator iterator = new HashSet(p0).iterator();
          EncodeConfig$ComplexEncodeProfile uComplexEnco1 = uComplexEnco;
          while (iterator.hasNext()) {
             String str = iterator.next();
             if (TextUtils.x(str)) {
             }else {
                Iterator iterator1 = this.mComplexEncodeProfiles.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      EncodeConfig$ComplexEncodeProfile uComplexEnco2 = iterator1.next();
                      if (uComplexEnco2 != null && (TextUtils.x(uComplexEnco2.mKey) || !TextUtils.n(uComplexEnco2.mKey, str))) {
                         continue ;
                      }else {
                         EncodeConfig$ComplexEncodeProfile mValue = uComplexEnco2.mValue;
                         if (mValue != null && (uComplexEnco1 == null || mValue.mPriority > uComplexEnco1.intValue())) {
                            uComplexEnco1 = Integer.valueOf(uComplexEnco2.mValue.mPriority);
                            uComplexEnco = uComplexEnco2;
                         }
                      }
                   }else {
                      continue ;
                   }
                }
             }
          }
       }
       return uComplexEnco;
    }
    public DegradeEncodeConfig getDegradeEncodeConfig(){
       Object obj = PatchProxy.apply(null, this, EncodeConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mDegradeEncodeConfig == null) {
          this.mDegradeEncodeConfig = new DegradeEncodeConfig();
       }
       return this.mDegradeEncodeConfig;
    }
    public int getDelay(){
       return this.mDelay;
    }
    public boolean getEnableAdaptiveX264Params(){
       return this.mEnableAdaptiveX264Params;
    }
    public String getExtraX264Params(){
       EncodeConfig obj = PatchProxy.apply(null, this, EncodeConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mAdaptiveX264Config;
       String str = (obj == null)? "": obj.getExtraX264Params();
       return str;
    }
    public int getHardwareRecordFps(){
       return this.mHardwareRecordFps;
    }
    public int getHardwareRecordMaxSize(){
       return this.mHardwareRecordMaxSize;
    }
    public String getHdExportParams(){
       EncodeConfig tmImportConf = this.mImportConfig;
       if (tmImportConf != null) {
          return tmImportConf.mHdExportParams;
       }
       return null;
    }
    public int getHeight(){
       return this.mHeight;
    }
    public long getId(){
       return this.mId;
    }
    public EncodeConfig$ImportEncodeConfig getImportEncodeConfig(){
       return this.mImportConfig;
    }
    public double getInterThreshold(){
       EncodeConfig obj = PatchProxy.apply(null, this, EncodeConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       obj = this.mAdaptiveX264Config;
       double d = (obj == null)? 0: obj.getInterThreshold();
       return d;
    }
    public String getPipelineX264Params(){
       return this.mPipelineX264Params;
    }
    public int getPreviewMaxSize(){
       int i;
       EncodeConfig obj = PatchProxy.apply(null, this, EncodeConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mPreviewMaxSize;
       if (obj > null) {
          i = Math.max(obj, Math.max(this.mWidth, this.mHeight));
       }
       return i;
    }
    public EncodeConfig$SkipTranscodingConfig getSkipTranscodeConfig(){
       EncodeConfig$SkipTranscodingConfig defaultSkipT;
       EncodeConfig obj = PatchProxy.apply(null, this, EncodeConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mSkipTranscodingConfig;
       if (obj == null) {
          defaultSkipT = EncodeConfig$SkipTranscodingConfig.getDefaultSkipTranscodeConfig();
       }
       return defaultSkipT;
    }
    public int getSoftwareRecordFps(){
       return (1000 / this.mDelay);
    }
    public int getSoftwareRecordMaxSize(){
       return this.mSoftwareRecordMaxSize;
    }
    public boolean getTryUsePbo(){
       return this.mTryUsePbo;
    }
    public int getWidth(){
       return this.mWidth;
    }
    public String getX264Params(){
       Object obj = PatchProxy.apply(null, this, EncodeConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(this.mX264ParamsCellular) && !p0.F(a.b())) {
          return this.mX264ParamsCellular;
       }
       return this.mX264Params;
    }
    public boolean isAllowHardwareEncodeTest(){
       return this.mAllowHardwareEncodeTest;
    }
    public boolean isEncodeTypeModifiable(){
       return this.mEncodeTypeModifiable;
    }
    public boolean isForceDisableConfigFallback(){
       return this.mForceDisableConfigFallback;
    }
    public boolean isForceDisableOpenglSync(){
       return this.mForceDisableOpenglSync;
    }
    public boolean isFullScreen(){
       boolean b = (!((double)this.mHeight / (double)this.mWidth) - 0x3ffc71c71c71c71c)? true: false;
       return b;
    }
    public boolean isUse265Encode(){
       return this.mUse265Encode;
    }
    public boolean isUseHardwareEncode(){
       return this.mHardwareEncode;
    }
    public void setEncodeTypeModifiable(boolean p0){
       this.mEncodeTypeModifiable = p0;
    }
    public void setForceDisableOpenglSync(boolean p0){
       this.mForceDisableOpenglSync = p0;
    }
    public void setHeight(int p0){
       this.mHeight = p0;
    }
    public void setPreviewMaxSize(int p0){
       this.mPreviewMaxSize = p0;
    }
    public void setUseHardwareEncode(boolean p0){
       if (this.mEncodeTypeModifiable != null) {
          this.mHardwareEncode = p0;
       }
       return;
    }
    public void setWidth(int p0){
       this.mWidth = p0;
    }
}
