package com.kuaishou.live.common.core.component.topbar.topuserlist.online.LiveOnlineTopUserResponse;
import java.io.Serializable;
import java.lang.Object;

public class LiveOnlineTopUserResponse implements Serializable	// class@0017a2
{
    public boolean mIsSelfRankInfoShowDisabled;
    public LiveOnlineTopUserRankInfo mLiveOnlineTopUserRankInfo;
    public boolean mNoGift;
    public LiveOnlineTopUserLayoutMixInfo mOnlineTopUserLayoutMixInfo;
    public LiveOnlineTopUserMixInfo mOnlineTopUserMixInfo;
    public List mTopUsers;
    public int refreshMinIntervalMs;
    public String ruleUrl;
    public static final long serialVersionUID = 0xecb5b04e66d1d68a;

    public void LiveOnlineTopUserResponse(){
       super();
    }
}
