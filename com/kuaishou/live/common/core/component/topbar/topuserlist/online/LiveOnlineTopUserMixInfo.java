package com.kuaishou.live.common.core.component.topbar.topuserlist.online.LiveOnlineTopUserMixInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.topbar.topuserlist.online.LiveOnlineTopUserInfo;
import com.kuaishou.live.common.core.component.topbar.topuserlist.online.LiveOnlineTopUserResponse;

public class LiveOnlineTopUserMixInfo implements Serializable	// class@0017a0
{
    public LiveOnlineTopUserInfo mLiveOnlineNobleTopUserInfo;
    public LiveOnlineTopUserMixInfo$LiveRevenueDeliveryDisplayInfo mLiveRevenueDeliveryDisplayInfo;
    public LiveOnlineTopUserInfo mNonStickyOnlineTopUserInfo;
    public int mOnlineTopUserType;
    public LiveOnlineTopUserInfo mStickyOnlineTopUserInfo;
    public static final long serialVersionUID = 0x6e37f6bb453a41bd;

    public void LiveOnlineTopUserMixInfo(){
       super();
       this.mOnlineTopUserType = 1;
    }
    public static LiveOnlineTopUserMixInfo generateDefaultOnlineTopUserMixInfo(){
       LiveOnlineTopUserMixInfo obj = PatchProxy.apply(null, null, LiveOnlineTopUserMixInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveOnlineTopUserMixInfo();
       obj.mOnlineTopUserType = 1;
       obj.mStickyOnlineTopUserInfo = new LiveOnlineTopUserInfo();
       obj.mNonStickyOnlineTopUserInfo = null;
       return obj;
    }
    public static LiveOnlineTopUserResponse getAssureOnlineTopUserMixInfoIfNecessary(LiveOnlineTopUserResponse p0){
       LiveOnlineTopUserMixInfo obj = PatchProxy.applyOneRefs(p0, null, LiveOnlineTopUserMixInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.mOnlineTopUserMixInfo == null) {
          obj = LiveOnlineTopUserMixInfo.generateDefaultOnlineTopUserMixInfo();
          p0.mOnlineTopUserMixInfo = obj;
          obj = obj.mStickyOnlineTopUserInfo;
          obj.mTopUsers = p0.mTopUsers;
          obj.mNoGift = p0.mNoGift;
          obj.mLiveOnlineTopUserRankInfo = p0.mLiveOnlineTopUserRankInfo;
          obj.mIsSelfRankInfoShowDisabled = p0.mIsSelfRankInfoShowDisabled;
       }
       return p0;
    }
}
