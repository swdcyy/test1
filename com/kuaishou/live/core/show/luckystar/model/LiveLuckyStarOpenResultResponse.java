package com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarOpenResultResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.List;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarOpenResultResponse$OpenResultV2PanelResources;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import java.util.Collection;
import com.kuaishou.live.core.show.luckystar.util.b;

public class LiveLuckyStarOpenResultResponse implements Serializable, b	// class@000cdc
{
    public int mActualLuckyUserCount;
    public String mAddressH5Url;
    public List mAwardPictureUrls;
    public List mBackgroundUrls;
    public boolean mDisableJumpUserProfile;
    public boolean mIsLuckyUser;
    public String mLuckyUserSubTitle;
    public List mLuckyUsers;
    public int mOpenResultType;
    public LiveLuckyStarOpenResultResponse$OpenResultV2PanelResources mOpenResultV2PanelResources;
    public String mParticipateTextColor;
    public String mSubTitle;
    public String mTips;
    public String mTitle;
    public int mWinType;
    public static final long serialVersionUID = 0x1eb52aa906c6156c;

    public void LiveLuckyStarOpenResultResponse(){
       super();
    }
    public List getItems(){
       return this.mLuckyUsers;
    }
    public LiveLuckyStarOpenResultResponse$OpenResultV2PanelResources getOpenResultV2PanelResources(){
       LiveLuckyStarOpenResultResponse obj = PatchProxy.apply(null, this, LiveLuckyStarOpenResultResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mOpenResultV2PanelResources;
       if (obj == null) {
          LiveLuckyStarOpenResultResponse$OpenResultV2PanelResources openResultV2 = new LiveLuckyStarOpenResultResponse$OpenResultV2PanelResources();
       }
       return obj;
    }
    public boolean hasMore(){
       return false;
    }
    public boolean isNeedFillAddress(){
       Object obj = PatchProxy.apply(null, this, LiveLuckyStarOpenResultResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.x(this.mAddressH5Url) ^ 0x01);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveLuckyStarOpenResultResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveLuckyStarOpenResultResponse{mLuckyUsers="+b.d(this.mLuckyUsers)+", mIsLuckyUser="+this.mIsLuckyUser+", mTips=\'"+this.mTips+'''+", mBackgroundUrls="+this.mBackgroundUrls+", mActualLuckyUserCount="+this.mActualLuckyUserCount+'}';
    }
}
