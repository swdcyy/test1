package com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarInfoResponse$LiveLuckyStarInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarInfoResponse$LiveLuckyStarExtraInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarInfoResponse$PanelBackgroundResources;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarInfoResponse$LiveLuckyStarParticipateInfo;

public class LiveLuckyStarInfoResponse$LiveLuckyStarInfo implements Serializable	// class@000cd7
{
    public List mActivityPictureUrls;
    public List mBackgroundCdnUrls;
    public String mDescription;
    public String mDisplayParticipantCount;
    public String mDisplayParticipantWithTips;
    public LiveLuckyStarInfoResponse$LiveLuckyStarExtraInfo mExtraInfo;
    public int mLuckyUserCount;
    public String mNotSupportTips;
    public LiveLuckyStarInfoResponse$PanelBackgroundResources mPanelBackgroundResources;
    public String mRuleUrl;
    public String mTitle;
    public int mType;
    public LiveLuckyStarInfoResponse$LiveLuckyStarParticipateInfo mUserParticipateInfo;
    public static final long serialVersionUID = 0x26df2fe37e720397;

    public void LiveLuckyStarInfoResponse$LiveLuckyStarInfo(){
       super();
    }
    public LiveLuckyStarInfoResponse$LiveLuckyStarExtraInfo getExtraInfo(){
       LiveLuckyStarInfoResponse$LiveLuckyStarInfo obj = PatchProxy.apply(null, this, LiveLuckyStarInfoResponse$LiveLuckyStarInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mExtraInfo;
       if (obj == null) {
          LiveLuckyStarInfoResponse$LiveLuckyStarExtraInfo liveLuckySta = new LiveLuckyStarInfoResponse$LiveLuckyStarExtraInfo();
       }
       return obj;
    }
    public LiveLuckyStarInfoResponse$PanelBackgroundResources getPanelBackgroundResources(){
       LiveLuckyStarInfoResponse$LiveLuckyStarInfo obj = PatchProxy.apply(null, this, LiveLuckyStarInfoResponse$LiveLuckyStarInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mPanelBackgroundResources;
       if (obj == null) {
          LiveLuckyStarInfoResponse$PanelBackgroundResources panelBackgro = new LiveLuckyStarInfoResponse$PanelBackgroundResources();
       }
       return obj;
    }
    public LiveLuckyStarInfoResponse$LiveLuckyStarParticipateInfo getUserParticipateInfo(){
       LiveLuckyStarInfoResponse$LiveLuckyStarInfo obj = PatchProxy.apply(null, this, LiveLuckyStarInfoResponse$LiveLuckyStarInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mUserParticipateInfo;
       if (obj == null) {
          LiveLuckyStarInfoResponse$LiveLuckyStarParticipateInfo liveLuckySta = new LiveLuckyStarInfoResponse$LiveLuckyStarParticipateInfo();
       }
       return obj;
    }
}
