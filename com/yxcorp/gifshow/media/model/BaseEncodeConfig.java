package com.yxcorp.gifshow.media.model.BaseEncodeConfig;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class BaseEncodeConfig	// class@001d00
{
    public BaseEncodeConfig$AdaptiveX264Config mAdaptiveX264Config;
    public int mAudioBitrate;
    public int mAudioCutoff;
    public String mAudioProfile;
    public boolean mEnableAdaptiveX264Params;
    public int mHeight;
    public boolean mTryUsePbo;
    public int mWidth;
    public String mX264Params;
    public String mX264Preset;

    public void BaseEncodeConfig(){
       super();
       this.mAudioProfile = "aac_low";
       this.mAudioBitrate = 0x2ee00;
       this.mAudioCutoff = 0x4e20;
       this.mEnableAdaptiveX264Params = false;
       this.mAdaptiveX264Config = null;
       this.mTryUsePbo = false;
    }
    public int a(){
       return this.mAudioBitrate;
    }
    public int b(){
       return this.mAudioCutoff;
    }
    public String c(){
       return this.mAudioProfile;
    }
    public int d(){
       return 1280;
    }
    public int e(){
       return 720;
    }
    public String f(){
       return "crf=15:vbv_maxrate=5000:vbv_bufsize=10000:threads=6:open-gop=0";
    }
    public String g(){
       return "veryfast";
    }
    public boolean h(){
       return this.mEnableAdaptiveX264Params;
    }
    public int i(){
       BaseEncodeConfig obj = PatchProxy.apply(null, this, BaseEncodeConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mHeight;
       if (obj <= null) {
          int i = this.d();
       }
       return obj;
    }
    public boolean j(){
       return this.mTryUsePbo;
    }
    public int k(){
       BaseEncodeConfig obj = PatchProxy.apply(null, this, BaseEncodeConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mWidth;
       if (obj <= null) {
          int i = this.e();
       }
       return obj;
    }
    public String l(){
       String str;
       BaseEncodeConfig obj = PatchProxy.apply(null, this, BaseEncodeConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (!TextUtils.x(this.mX264Params))? this.mX264Params: this.f();
       return obj;
    }
    public String m(){
       String str;
       BaseEncodeConfig obj = PatchProxy.apply(null, this, BaseEncodeConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (!TextUtils.x(this.mX264Preset))? this.mX264Preset: this.g();
       return obj;
    }
}
