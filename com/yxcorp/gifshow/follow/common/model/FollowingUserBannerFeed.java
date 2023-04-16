package com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfoList;
import java.util.List;
import java.util.Collections;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.follow.common.model.p;
import java.util.Map;
import java.io.ObjectInputStream;
import com.smile.gifmaker.mvps.utils.SyncableProvider;

public class FollowingUserBannerFeed extends BaseFeed	// class@001059
{
    public CommonMeta mCommonMeta;
    public ExtMeta mExtMeta;
    public User mLogUser;
    public FollowingUserBannerFeed$UserBannerInfoList mUserBannerInfoList;
    public static final long serialVersionUID = 0x47d6f1027ede72cd;

    public void FollowingUserBannerFeed(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, FollowingUserBannerFeed.class, "2")) {
          return;
       }
       super.afterDeserialize();
       if (this.mUserBannerInfoList == null) {
          this.mUserBannerInfoList = new FollowingUserBannerFeed$UserBannerInfoList();
       }
       FollowingUserBannerFeed tmUserBanner = this.mUserBannerInfoList;
       if (tmUserBanner.mInfos == null) {
          tmUserBanner.mInfos = Collections.emptyList();
       }
       return;
    }
    public String getId(){
       return this.mCommonMeta.mFeedId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowingUserBannerFeed.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, FollowingUserBannerFeed.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(FollowingUserBannerFeed.class, new p());
       }else {
          obj.put(FollowingUserBannerFeed.class, null);
       }
       return obj;
    }
    public final void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowingUserBannerFeed.class, "1")) {
          return;
       }
       p0.defaultReadObject();
       this.setupAccessors();
       return;
    }
}
