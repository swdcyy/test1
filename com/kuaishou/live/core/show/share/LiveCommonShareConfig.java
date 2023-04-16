package com.kuaishou.live.core.show.share.LiveCommonShareConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveCommonShareConfig implements Serializable	// class@00100b
{
    public LiveThirdPartySharePlatform[] mLiveThirdPartySharePlatforms;
    public int mSelectedPlatformKey;
    public String mShareGuideText;
    public long mShowShareGuideTimeAfterStartMs;
    public long mShowShareRemindDurationMs;
    public int mSingleLiveCanShowRemindShareMaxCount;
    public static final long serialVersionUID = 0xdb810ad1f625dbb8;

    public void LiveCommonShareConfig(){
       super();
    }
}
