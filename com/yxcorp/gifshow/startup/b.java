package com.yxcorp.gifshow.startup.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.startup.a;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.startup.HomeStartupPojo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tra.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import java.lang.StringBuilder;
import oe6.g;

public class b extends ConfigAutoParseJsonConsumer	// class@001d83
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("aboutSideBarSetting", b.e(p0.mAboutSideBarSetting));
          uEditor.putString("activityNickNameIcon", b.e(p0.mActivityUserIconMode));
          uEditor.putInt("EnableSystemPushDialogPeriod", p0.mEnableSystemPushDialogPeriod);
          uEditor.putInt("fansTopPromoteType", p0.mFansTopPromoteType);
          uEditor.putString("gatherCardConfig", b.e(p0.mGatherCardConfig));
          uEditor.putString(b.d("user")+"incentive_activity", b.e(p0.mIncentiveActivityInfo));
          uEditor.putString(b.d("user")+"IncentivePopupInfo", b.e(p0.mIncentivePopupInfo));
          uEditor.putString("KSActivityConfig", b.e(p0.mKSActivityConfig));
          uEditor.putInt("minFollowMomentCount", p0.mMinFollowMomentCount);
          uEditor.putInt("RemindNewFriendsCount", p0.mRemindNewFriendsCount);
          uEditor.putBoolean("remindNewFriendsJoinedSlideBar", p0.mRemindNewFriendsJoinedSlideBar);
          uEditor.putString("SearchBarText", b.e(p0.mSearchBarText));
          uEditor.putLong("ShareTokenToastInterval", p0.mShareTokenToastInterval);
          uEditor.putString("sideBarRightTop", b.e(p0.mSideBarRightTop));
          uEditor.putString(b.d("user")+"SideBarUserText", p0.mSideBarUserText);
          uEditor.putString("sidebarExSquareStyle", b.e(p0.mSidebarExSquareStyle));
          uEditor.putString("teenageChannelList", b.e(p0.mTeenageChannelList));
          g.a(uEditor);
       }
       return;
    }
}
