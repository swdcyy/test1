package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.RecommendUserMeta;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.RecommendUserWrapper;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.UserCoverMeta;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.ExtMeta;
import kp.r1;

public class RecommendUserMeta implements Serializable	// class@001761
{
    public String mPhotoId;
    public String mPrsid;
    public int mType;
    public List mUsers;
    public List mUsersWrapper;
    public String subTitleStr;
    public String titleStr;
    public static final long serialVersionUID = 0x3957d39bc58758f7;

    public void RecommendUserMeta(){
       super();
    }
    public int getPlanNum(){
       Object obj = PatchProxy.applyWithListener(null, this, RecommendUserMeta.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 1;
       if (TextUtils.isEmpty(this.titleStr) || TextUtils.isEmpty(this.subTitleStr)) {
          PatchProxy.onMethodExit(RecommendUserMeta.class, "1");
          return i;
       }else if((this.titleStr).length() < (this.subTitleStr).length()){
          PatchProxy.onMethodExit(RecommendUserMeta.class, "1");
          return i;
       }else {
          PatchProxy.onMethodExit(RecommendUserMeta.class, "1");
          return 2;
       }
    }
    public List getUsers(){
       Iterator obj = PatchProxy.applyWithListener(null, this, RecommendUserMeta.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mUsers == null) {
          this.mUsers = new ArrayList();
          obj = this.mUsersWrapper.iterator();
          while (obj.hasNext()) {
             RecommendUserWrapper recommendUse = obj.next();
             RecommendUserWrapper mUser = recommendUse.mUser;
             RecommendUserWrapper mFeed = recommendUse.mFeed;
             if (!PatchProxy.applyVoidTwoRefsWithListener(mUser, mFeed, this, RecommendUserMeta.class, "3")) {
                if (mFeed == null) {
                   PatchProxy.onMethodExit(RecommendUserMeta.class, "3");
                }else {
                   mUser.mCoverMeta.mCoverThumbnailUrls = mFeed.getCoverThumbnailUrls();
                   mUser.mCoverMeta.mOverrideCoverThumbnailUrls = mFeed.getOverrideCoverThumbnailUrls();
                   mUser.mCoverMeta.mPhotoID = mFeed.getPhotoId();
                   mUser.mCoverMeta.mExpTag = mFeed.getExpTag();
                   mUser.mCoverMeta.mVideoCount = mFeed.numberOfReview();
                   ExtMeta uExtMeta = r1.N0(mFeed.getEntity());
                   if (uExtMeta != null) {
                      User mCoverMeta = mUser.mCoverMeta;
                      mCoverMeta.mWidth = uExtMeta.mWidth;
                      mCoverMeta.mHeight = uExtMeta.mHeight;
                      mCoverMeta.mColorStr = uExtMeta.mColorStr;
                   }
                   PatchProxy.onMethodExit(RecommendUserMeta.class, "3");
                }
             }
             this.mUsers.add(recommendUse.mUser);
          }
       }
       PatchProxy.onMethodExit(RecommendUserMeta.class, "2");
       return this.mUsers;
    }
}
