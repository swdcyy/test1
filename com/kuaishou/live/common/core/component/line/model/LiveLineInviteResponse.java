package com.kuaishou.live.common.core.component.line.model.LiveLineInviteResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.List;
import com.kuaishou.live.common.core.component.pk.model.LiveLineInviteItem;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import com.kuaishou.live.common.core.component.line.model.LiveLineInviteResponse$LiveLineInviteeListBannerInfo;
import ekd.j;
import com.kuaishou.live.common.core.component.pk.model.LiveLineInviteBannerItem;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.line.model.LiveLineInviteResponse$LiveLineInviteeInfo;
import com.kuaishou.live.common.core.component.line.model.LiveLineInviteResponse$LiveLineInviteUserInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.live.common.core.component.pk.model.LiveLineInviteTitleItem;

public class LiveLineInviteResponse implements Serializable, b	// class@00148a
{
    public LiveLineInviteResponse$LiveLineInviteeInfo mLiveLineInviteeInfo;
    public List mLiveLineInviteeListBannerInfo;
    public String mLiveLineSubtitle;
    public static final long serialVersionUID = 0xe7108888c5349b;

    public void LiveLineInviteResponse(){
       super();
    }
    public final LiveLineInviteItem createBannerItem(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLineInviteResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveLineInviteItem liveLineInvi = null;
       if (q.f(p0)) {
          return liveLineInvi;
       }
       if (j.h(p0.get(0).mBackgroundCDNUrl)) {
          return liveLineInvi;
       }
       return new LiveLineInviteBannerItem(p0.get(0));
    }
    public List getItems(){
       ArrayList obj = PatchProxy.apply(null, this, LiveLineInviteResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       LiveLineInviteResponse tmLiveLineIn = this.mLiveLineInviteeListBannerInfo;
       if (tmLiveLineIn != null) {
          LiveLineInviteItem liveLineInvi = this.createBannerItem(tmLiveLineIn);
          if (liveLineInvi != null) {
             obj.add(liveLineInvi);
          }
       }
       tmLiveLineIn = this.mLiveLineInviteeInfo;
       if (tmLiveLineIn == null) {
          return obj;
       }else {
          LiveLineInviteResponse$LiveLineInviteeInfo mFriendInvit = tmLiveLineIn.mFriendInviteUserInfo;
          if (mFriendInvit != null) {
             String str = "FRIEND_INVITE";
             if (mFriendInvit.getItems(str) != null && this.mLiveLineInviteeInfo.mFriendInviteUserInfo.getItems(str).size()) {
                if (!TextUtils.isEmpty(this.mLiveLineInviteeInfo.mFriendInviteUserInfo.mTitle)) {
                   obj.add(new LiveLineInviteTitleItem(this.mLiveLineInviteeInfo.mFriendInviteUserInfo.mTitle));
                }
                obj.addAll(this.mLiveLineInviteeInfo.mFriendInviteUserInfo.getItems(str));
             }
          }
          mFriendInvit = this.mLiveLineInviteeInfo.mInterestInviteUserInfo;
          if (mFriendInvit != null && (mFriendInvit.getItems("RECOMMEND_INVITE") != null && this.mLiveLineInviteeInfo.mInterestInviteUserInfo.getItems("RECOMMEND_INVITE").size())) {
             if (!TextUtils.isEmpty(this.mLiveLineInviteeInfo.mInterestInviteUserInfo.mTitle)) {
                obj.add(new LiveLineInviteTitleItem(this.mLiveLineInviteeInfo.mInterestInviteUserInfo.mTitle));
             }
             obj.addAll(this.mLiveLineInviteeInfo.mInterestInviteUserInfo.getItems("RECOMMEND_INVITE"));
          }
       label_00a7 :
          return obj;
       }
    }
    public boolean hasMore(){
       return false;
    }
}
