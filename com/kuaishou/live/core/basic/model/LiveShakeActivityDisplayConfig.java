package com.kuaishou.live.core.basic.model.LiveShakeActivityDisplayConfig;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.SCLiveRevenueActivityInfoShakeActivityConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class LiveShakeActivityDisplayConfig implements Serializable	// class@000885
{
    public boolean mEnableSlide;
    public String mShakeGuideBackgroundColor;
    public long mShakeGuideDelayMs;
    public long mShakeGuideDisplayMs;
    public String mShakeGuideImageUrl;
    public long mShakeGuideIntervalMs;
    public String mShakeGuideSecondText;
    public String mShakeGuideSecondTextColor;
    public String mShakeGuideText;
    public String mShakeGuideTextColor;
    public String mShakeImageUrl;
    public String mShakeResultDialogDescription;
    public String mShakeText;
    public String mShakeTextColor;
    public String mShakeTipsDialogDescription;
    public long mShakeTipsDialogMinDisplayMs;
    public String mShakeTipsDialogTitle;
    public static final long serialVersionUID = 0xefecbf0b8cb6a9de;

    public void LiveShakeActivityDisplayConfig(){
       super();
    }
    public static LiveShakeActivityDisplayConfig copy(SCLiveRevenueActivityInfoShakeActivityConfig p0){
       Object obj = null;
       LiveShakeActivityDisplayConfig obj1 = PatchProxy.applyOneRefs(p0, obj, LiveShakeActivityDisplayConfig.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = new LiveShakeActivityDisplayConfig();
       obj1.mShakeGuideText = p0.shakeGuideText;
       obj1.mShakeGuideTextColor = p0.shakeGuideTextColor;
       obj1.mShakeGuideSecondText = p0.shakeGuideSecondText;
       obj1.mShakeGuideSecondTextColor = p0.shakeGuideSecondTextColor;
       obj1.mShakeGuideBackgroundColor = p0.shakeGuideBackgroundColor;
       obj1.mShakeGuideImageUrl = p0.shakeGuideImage;
       obj1.mShakeText = p0.shakeText;
       obj1.mShakeTextColor = p0.shakeTextColor;
       obj1.mShakeImageUrl = p0.shakeImage;
       obj1.mShakeTipsDialogTitle = p0.shakeTipsDialogTitle;
       obj1.mShakeTipsDialogDescription = p0.shakeTipsDialogDescription;
       obj1.mShakeResultDialogDescription = p0.shakeResultDialogDescription;
       obj1.mShakeGuideDelayMs = p0.shakeGuideDelayMs;
       obj1.mShakeGuideDisplayMs = p0.shakeGuideDisplayMs;
       obj1.mShakeGuideIntervalMs = p0.shakeGuideIntervalMs;
       obj1.mShakeTipsDialogMinDisplayMs = p0.shakeTipsDialogMinDisplayMs;
       obj1.mEnableSlide = p0.enableSlide;
       return obj1;
    }
}
