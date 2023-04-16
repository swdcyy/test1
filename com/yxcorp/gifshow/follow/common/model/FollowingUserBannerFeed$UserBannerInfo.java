package com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfo;
import java.io.Serializable;
import xl8.d;
import im8.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kwai.feature.api.social.followStagger.model.FeedUserAvatarInfo;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.gifshow.follow.common.model.s;
import java.util.Map;
import java.util.HashMap;
import java.lang.Number;
import xl8.c;
import brd.t;
import com.smile.gifmaker.mvps.utils.DefaultObservable;

public final class FollowingUserBannerFeed$UserBannerInfo implements Serializable, d, g	// class@00117b
{
    public FeedUserAvatarInfo mAvatarInfo;
    public a mExtraModel;
    public boolean mGotoLiveRoom;
    public int mIntimateType;
    public boolean mIsExtraShown;
    public boolean mIsShown;
    public String mLastUnreadPhotoId;
    public LiveReservationInfo mLiveReservationInfo;
    public int mLiveToastRank;
    public String mLlsid;
    public String mNotifyInfo;
    public int mRelationType;
    public d mRxObservable;
    public boolean mShowFeedTopTitle;
    public int mShowOffset;
    public User mUser;
    public List mUsers;
    public static final long serialVersionUID = 0x170401244878dcb0;

    public void FollowingUserBannerFeed$UserBannerInfo(){
       super();
    }
    public void FollowingUserBannerFeed$UserBannerInfo(FollowingUserBannerFeed$UserBannerInfo p0){
       super();
       this.mUser = p0.mUser;
       this.mAvatarInfo = p0.mAvatarInfo;
       this.mShowFeedTopTitle = p0.mShowFeedTopTitle;
       this.mLastUnreadPhotoId = p0.mLastUnreadPhotoId;
       this.mLiveReservationInfo = p0.mLiveReservationInfo;
       this.mLiveToastRank = p0.mLiveToastRank;
       this.mNotifyInfo = p0.mNotifyInfo;
       this.mIntimateType = p0.mIntimateType;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowingUserBannerFeed$UserBannerInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof FollowingUserBannerFeed$UserBannerInfo) {
          return false;
       }
       return k.a(this.mUser, p0.mUser);
    }
    public FeedLogCtx getFeedLogCtx(){
       FollowingUserBannerFeed$UserBannerInfo tmAvatarInfo = this.mAvatarInfo;
       if (tmAvatarInfo != null) {
          FeedUserAvatarInfo mLiveStreamF = tmAvatarInfo.mLiveStreamFeed;
          if (mLiveStreamF != null) {
             LiveStreamFeed mCommonMeta = mLiveStreamF.mCommonMeta;
             if (mCommonMeta != null) {
                return mCommonMeta.mFeedLogCtx;
             }
          }
       }
       return null;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowingUserBannerFeed$UserBannerInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new s();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, FollowingUserBannerFeed$UserBannerInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(FollowingUserBannerFeed$UserBannerInfo.class, new s());
       }else {
          obj.put(FollowingUserBannerFeed$UserBannerInfo.class, null);
       }
       return obj;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, FollowingUserBannerFeed$UserBannerInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.mUser,this.mAvatarInfo,Boolean.valueOf(this.mIsShown),this.mRxObservable};
       return k.b(obj);
    }
    public boolean isLiveStream(){
       FollowingUserBannerFeed$UserBannerInfo tmAvatarInfo = this.mAvatarInfo;
       boolean b = (tmAvatarInfo != null && tmAvatarInfo.mLiveStreamFeed != null)? true: false;
       return b;
    }
    public void notifyChanged(){
       c.a(this);
    }
    public void notifyChanged(FollowingUserBannerFeed$UserBannerInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowingUserBannerFeed$UserBannerInfo.class, "2")) {
          return;
       }
       FollowingUserBannerFeed$UserBannerInfo tmRxObservab = this.mRxObservable;
       if (tmRxObservab != null) {
          tmRxObservab.notifyChanged(p0);
       }
       return;
    }
    public void notifyChanged(Object p0){
       this.notifyChanged(p0);
    }
    public t observable(){
       Object obj = PatchProxy.apply(null, this, FollowingUserBannerFeed$UserBannerInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mRxObservable == null) {
          this.mRxObservable = new DefaultObservable();
       }
       return this.mRxObservable.observable();
    }
    public void resetState(){
       this.mShowOffset = 0;
       this.mIsShown = false;
       this.mIsExtraShown = false;
       this.mGotoLiveRoom = false;
    }
}
