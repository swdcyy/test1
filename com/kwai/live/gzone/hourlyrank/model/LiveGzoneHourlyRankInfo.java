package com.kwai.live.gzone.hourlyrank.model.LiveGzoneHourlyRankInfo;
import java.io.Serializable;
import java.lang.Object;

public class LiveGzoneHourlyRankInfo implements Serializable	// class@000d85
{
    public long mCurrentServerTime;
    public int mCurrentTabId;
    public String mDescription;
    public long mEndTime;
    public boolean mIsShow;
    public String mName;
    public List mRankUserInfoList;
    public String mRuleUrl;
    public List mTabInfoList;
    public static final long serialVersionUID = 0x818bd8208064fdbe;

    public void LiveGzoneHourlyRankInfo(){
       super();
    }
}
