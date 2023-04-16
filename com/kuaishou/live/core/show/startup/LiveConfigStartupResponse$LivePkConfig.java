package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LivePkConfig;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LivePkFirstBloodConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LivePkConfig$LivePkProgressAnimationConfig;

public class LiveConfigStartupResponse$LivePkConfig implements Serializable	// class@00105e
{
    public int mCoolScoreAnimationMinIncrement;
    public boolean mDisableFormatOpeningAnimation;
    public boolean mEnablePkSmallWindow;
    public LiveConfigStartupResponse$LivePkConfig$LivePkProgressAnimationConfig mLivePkProgressAnimationConfig;
    public LiveConfigStartupResponse$LivePkFirstBloodConfig mPkFirstBlood;
    public String mSettingsPageH5Url;
    public float mStartClippingPosition;
    public static final long serialVersionUID = 0xbaa16cbd19a587b9;

    public void LiveConfigStartupResponse$LivePkConfig(){
       super();
       this.mDisableFormatOpeningAnimation = false;
       this.mCoolScoreAnimationMinIncrement = 208;
       this.mPkFirstBlood = new LiveConfigStartupResponse$LivePkFirstBloodConfig();
       this.mLivePkProgressAnimationConfig = new LiveConfigStartupResponse$LivePkConfig$LivePkProgressAnimationConfig();
       this.mSettingsPageH5Url = "http://node-app-shenty.staging.kuaishou.com/pk-preference/index.html?hyId=pk_preference";
       this.mEnablePkSmallWindow = false;
    }
}
