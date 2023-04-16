package com.kuaishou.live.common.core.component.topbar.topuserlist.online.LiveOnlineTopUserInfo;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.List;

public class LiveOnlineTopUserInfo implements Serializable, b	// class@00179a
{
    public boolean mIsSelfRankInfoShowDisabled;
    public CDNUrl[] mLiveNobleBackgroundUrls;
    public CDNUrl[] mLiveNobleEmptyBgUrls;
    public LiveOnlineTopUserRankInfo mLiveOnlineTopUserRankInfo;
    public LiveOnlineTopUserRoleInfo mLiveOnlineTopUserRoleInfo;
    public boolean mNoGift;
    public List mTopUsers;
    public String ruleUrl;
    public static final long serialVersionUID = 0xf357fafcfc7bc5e8;

    public void LiveOnlineTopUserInfo(){
       super();
    }
    public List getItems(){
       return this.mTopUsers;
    }
    public boolean hasMore(){
       return false;
    }
}
