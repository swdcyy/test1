package com.kuaishou.live.common.core.component.topbar.topuserlist.weekly.LiveWeeklyTopUserResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.List;

public class LiveWeeklyTopUserResponse implements Serializable, b	// class@0017a7
{
    public boolean mIsSelfRankInfoShowDisable;
    public String mMaxShowCountDescription;
    public LiveWeeklyTopUserResponse$LiveWeeklySelfRankInfo mSelfRankInfo;
    public List mTopUserInfoList;
    public int refreshMinIntervalMs;
    public String ruleUrl;
    public static final long serialVersionUID = 0x2c92ef391d8a45ca;

    public void LiveWeeklyTopUserResponse(){
       super();
    }
    public List getItems(){
       return this.mTopUserInfoList;
    }
    public boolean hasMore(){
       return false;
    }
}
