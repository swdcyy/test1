package com.kwai.feature.api.social.moment.model.MomentModel;
import im8.g;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;
import com.kwai.feature.api.social.moment.model.MomentModel$a;
import com.yxcorp.utility.TextUtils;
import pw5.n;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.lang.Number;
import yl8.b;

public class MomentModel extends DefaultObservableAndSyncable implements g	// class@00118b
{
    public List mBackgroundColors;
    public long mCacheId;
    public boolean mCloseable;
    public boolean mCommentClosed;
    public long mCommentCount;
    public String mCommentCursor;
    public String mCommentPinnedInfo;
    public List mComments;
    public String mContent;
    public EmotionInfo mDraftEmotion;
    public String mDraftText;
    public boolean mExpired;
    public List mFollowUsers;
    public boolean mForwardClosed;
    public MomentModel$a mHolder;
    public boolean mIsLiked;
    public boolean mIsPreMoment;
    public List mLastCommentUsers;
    public int mLikeCount;
    public boolean mLikeInfoShowed;
    public List mLikePhotos;
    public List mLikers;
    public List mLocalPictures;
    public Location mLocation;
    public boolean mLocationShowed;
    public List mMediaObjects;
    public String mMomentForwardId;
    public MomentForwardObject mMomentForwardObject;
    public String mMomentId;
    public MomentRecommend mMomentRecommend;
    public int mMomentType;
    public User mMomentUser;
    public boolean mNeedSyncComments;
    public boolean mNeedSyncLikers;
    public boolean mNeverExpanded;
    public List mPictures;
    public String mPreMomentPicPath;
    public String mPrsid;
    public int mPublishState;
    public long mPublishTime;
    public boolean mQuickCommentShowing;
    public String mRecommendReason;
    public int mRegisterDays;
    public String mResourceId;
    public boolean mShowed;
    public int mSource;
    public List mTags;
    public List mThumbnails;
    public UserStatus mUserStatusMeta;
    public MomentVideoInfo mVideoInfo;
    public long mViewCount;
    public boolean mViewed;
    public int mVisibleStatus;
    public long mZtPhotoId;
    public static final long serialVersionUID = 0x36df2a17e086e9ed;

    public void MomentModel(){
       super();
       this.mCommentClosed = false;
       this.mVisibleStatus = 0;
       this.mCacheId = -1;
       this.mNeverExpanded = true;
       this.mCloseable = false;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MomentModel.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       boolean b = false;
       if (p0 == null || this.getClass() != p0.getClass()) {
          return b;
       }
       if (!k.a(this.mMomentId, p0.mMomentId)) {
          return b;
       }
       return k.a(this.getHolder(), p0.mHolder);
    }
    public String getBizId(){
       Object obj = PatchProxy.apply(null, this, MomentModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextUtils.I(this.mMomentId);
    }
    public MomentModel$a getHolder(){
       MomentModel$a uoa;
       MomentModel obj = PatchProxy.apply(null, this, MomentModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mHolder;
       if (obj == null) {
          uoa = new MomentModel$a();
          this.mHolder = uoa;
       }
       return uoa;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MomentModel.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, MomentModel.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(MomentModel.class, new n());
       }else {
          obj.put(MomentModel.class, null);
       }
       return obj;
    }
    public List getThumbnails(){
       Object obj = PatchProxy.apply(null, this, MomentModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!q.f(this.mThumbnails)) {
          return this.mThumbnails;
       }
       return this.mPictures;
    }
    public int hashCode(){
       MomentModel obj = PatchProxy.apply(null, this, MomentModel.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mMomentId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       MomentModel tmHolder = this.mHolder;
       if (tmHolder != null) {
          i = tmHolder.hashCode();
       }
       return (i1 + i);
    }
    public void sync(MomentModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MomentModel.class, "4")) {
          return;
       }
       MomentModel momentModel = null;
       MomentModel mIsLiked = p0.mIsLiked;
       MomentModel momentModel1 = 1;
       if (this.mIsLiked != mIsLiked) {
          if (p0.mNeedSyncLikers != null) {
             this.mIsLiked = mIsLiked;
             this.mLikers = p0.mLikers;
             this.mLikeCount = p0.mLikeCount;
          }
          momentModel = 1;
       }
       if (p0.mNeedSyncComments != null) {
          if (q.i(this.mComments).size() != q.i(p0.mComments).size()) {
             momentModel = 1;
          }
          this.mComments = p0.mComments;
       }
       MomentModel mCommentCoun = p0.mCommentCount;
       if (this.mCommentCount - mCommentCoun) {
          this.mCommentCount = mCommentCoun;
       }else {
          momentModel1 = momentModel;
       }
       if (momentModel1 != null) {
          this.notifyChanged();
       }
       return;
    }
    public void sync(b p0){
       this.sync(p0);
    }
}
