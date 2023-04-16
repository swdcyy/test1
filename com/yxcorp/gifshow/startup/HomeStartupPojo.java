package com.yxcorp.gifshow.startup.HomeStartupPojo;
import java.io.Serializable;
import java.lang.Object;

public class HomeStartupPojo implements Serializable	// class@001d80
{
    public SidebarMenuItem mAboutSideBarSetting;
    public ActivityUserIconModel mActivityUserIconMode;
    public int mEnableSystemPushDialogPeriod;
    public int mFansTopPromoteType;
    public KSActivityConfig mGatherCardConfig;
    public Map mIncentiveActivityInfo;
    public IncentivePopupInfo mIncentivePopupInfo;
    public KSActivityConfig mKSActivityConfig;
    public int mMinFollowMomentCount;
    public int mRemindNewFriendsCount;
    public boolean mRemindNewFriendsJoinedSlideBar;
    public SearchBarText mSearchBarText;
    public long mShareTokenToastInterval;
    public SidebarMenuItem mSideBarRightTop;
    public String mSideBarUserText;
    public HomeMenuRedesignConfig mSidebarExSquareStyle;
    public List mTeenageChannelList;

    public void HomeStartupPojo(){
       super();
       this.mShareTokenToastInterval = 1800;
       this.mMinFollowMomentCount = 2;
       this.mEnableSystemPushDialogPeriod = 7;
    }
}
