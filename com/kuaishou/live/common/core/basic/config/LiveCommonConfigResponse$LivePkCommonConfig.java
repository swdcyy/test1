package com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$LivePkCommonConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveCommonConfigResponse$LivePkCommonConfig implements Serializable	// class@000e89
{
    public String mFriendMatchDescription;
    public String mNearbyMatchDescription;
    public int mPkDefaultRatioType;
    public long mPollPunishMagicFaceTimeoutMs;
    public long[] mPopGuidePromptDelayTimeList;
    public String mRandomMatchDescription;
    public String mTalentMatchDescription;
    public static final long serialVersionUID = 0xd196926b30ed0328;

    public void LiveCommonConfigResponse$LivePkCommonConfig(){
       super();
       this.mPollPunishMagicFaceTimeoutMs = 0x7530;
       this.mPkDefaultRatioType = 1;
    }
}
