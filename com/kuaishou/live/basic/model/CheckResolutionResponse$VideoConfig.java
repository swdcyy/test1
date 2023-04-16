package com.kuaishou.live.basic.model.CheckResolutionResponse$VideoConfig;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.live.basic.model.CheckResolutionResponse$FpsConfig;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class CheckResolutionResponse$VideoConfig implements Serializable	// class@000cd9
{
    public String mAryaConfig;
    public String mCaptureResolution;
    public boolean mEnableBlackImageCheck;
    public CheckResolutionResponse$FpsConfig mFpsConfig;
    public String mFullScreenPreviewResolution;
    public String mFullScreenPushResolution;
    public boolean mIsFullScreenResolutionEnabled;
    public boolean mIsLrbEnabled;
    public String mPreviewResolution;
    public String mPushResolution;
    public boolean mUseTexture;
    public String mX264CodecConfig;
    public static final long serialVersionUID = 0x85e3c115624597a9;

    public void CheckResolutionResponse$VideoConfig(){
       super();
       this.mCaptureResolution = "1280x720";
       this.mPreviewResolution = "960x544";
       this.mPushResolution = "640x368";
       this.mX264CodecConfig = "{\"x264\":{\"livestream\":{\"preset\":1},\"livechat\":{\"preset\":1}}}";
       this.mAryaConfig = "";
       this.mEnableBlackImageCheck = false;
       this.mUseTexture = false;
       this.mIsFullScreenResolutionEnabled = false;
       this.mFullScreenPreviewResolution = "";
       this.mFullScreenPushResolution = "";
       this.mFpsConfig = null;
    }
    public CheckResolutionResponse$FpsConfig getFpsConfig(){
       return this.mFpsConfig;
    }
    public String getPreviewResolution(){
       Object obj = PatchProxy.apply(null, this, CheckResolutionResponse$VideoConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isFullScreenResolutionEnabled()) {
          return this.mFullScreenPreviewResolution;
       }
       return this.mPreviewResolution;
    }
    public String getPushResolution(){
       Object obj = PatchProxy.apply(null, this, CheckResolutionResponse$VideoConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isFullScreenResolutionEnabled()) {
          return this.mFullScreenPushResolution;
       }
       return this.mPushResolution;
    }
    public boolean isFullScreenResolutionEnabled(){
       Object obj = PatchProxy.apply(null, this, CheckResolutionResponse$VideoConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mIsFullScreenResolutionEnabled != null && (!TextUtils.x(this.mFullScreenPreviewResolution) && !TextUtils.x(this.mFullScreenPushResolution)))? true: false;
       return b;
    }
}
