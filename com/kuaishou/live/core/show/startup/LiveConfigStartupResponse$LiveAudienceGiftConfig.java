package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveAudienceGiftConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveConfigStartupResponse$LiveAudienceGiftConfig implements Serializable	// class@00102b
{
    public long mAvatarEffectGiftMaxWaitTimeMs;
    public boolean mDisableFansGroupGiftTab;
    public boolean mDisableGiftEffect;
    public boolean mDisablePrivilegeGiftTab;
    public boolean mEnableGiftListSort;
    public boolean mEnableGiftListVerticalScrollMode;
    public List mGiftBatchConfigs;

    public void LiveConfigStartupResponse$LiveAudienceGiftConfig(){
       super();
       this.mAvatarEffectGiftMaxWaitTimeMs = 5000;
    }
}
