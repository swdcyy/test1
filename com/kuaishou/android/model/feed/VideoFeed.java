package com.kuaishou.android.model.feed.VideoFeed;
import da6.c;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.ExtendableModelMap;
import com.kuaishou.android.model.mix.CoronaInfo;
import com.kuaishou.android.model.mix.VideoMeta;
import java.lang.Boolean;
import com.kuaishou.android.model.paycourse.PayVideoMeta;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.commercial.PhotoAdvertisementInterface;
import wkd.b;
import ip.c;
import kp.s1;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.model.CDNUrl;
import yp.u0;
import com.kuaishou.android.model.mix.CoverMeta;
import da6.b;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.PhotoMeta;
import yp.t0;
import java.util.Map;
import com.google.common.base.Optional;
import com.kuaishou.android.model.feed.i0;
import ok.h;
import com.kuaishou.android.model.feed.h0;
import java.io.ObjectInputStream;
import com.smile.gifmaker.mvps.utils.SyncableProvider;

public class VideoFeed extends BaseFeed implements c	// class@000b7a
{
    public PhotoAdvertisementPlaceHolder mAd;
    public ColumnMeta mColumnMeta;
    public CommentMeta mCommentMeta;
    public CommonMeta mCommonMeta;
    public CoronaInfo mCoronaInfo;
    public CoronaModelMeta mCoronaModelMeta;
    public CoverMeta mCoverMeta;
    public CoverPicRecommendedCropWindow mCoverPicRecommendedCropWindow;
    public ExtMeta mExtMeta;
    public ExtendableModelMap mExtraMap;
    public LivePlaybackMeta mLivePlaybackMeta;
    public PayVideoMeta mPayVideoModel;
    public PhotoMeta mPhotoMeta;
    public RecruitCardInfoModel mRecruitCardInfoModel;
    public TubeMeta mTubeModel;
    public User mUser;
    public UserStatusExt mUserStatusExt;
    public VideoMeta mVideoModel;
    public static final long serialVersionUID = 0xc4065f025fdc4bc2;

    public void VideoFeed(){
       super();
       this.mExtraMap = new ExtendableModelMap();
       this.mCoronaInfo = new CoronaInfo(1, 1);
    }
    public static Boolean g(VideoMeta p0){
       return VideoFeed.lambda$isSerialPayPhoto$1(p0);
    }
    public static Boolean h(PayVideoMeta p0){
       return VideoFeed.lambda$isPayCourse$0(p0);
    }
    public static Boolean lambda$isPayCourse$0(PayVideoMeta p0){
       return Boolean.valueOf(p0.mIsPayCourse);
    }
    public static Boolean lambda$isSerialPayPhoto$1(VideoMeta p0){
       boolean b = (p0.mTubePhotoPayInfo != null)? true: false;
       return Boolean.valueOf(b);
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, VideoFeed.class, "4")) {
          return;
       }
       super.afterDeserialize();
       if (this.mAd instanceof PhotoAdvertisementInterface) {
          b.a(0x188c3889).b(this.mAd);
       }
       s1.a(this);
       VideoFeed tmCommonMeta = this.mCommonMeta;
       if (tmCommonMeta != null && (tmCommonMeta.mDegrade == null && tmCommonMeta.mRandomUrl == null)) {
          return;
       }else {
          tmCommonMeta = this.mUser;
          if (tmCommonMeta != null) {
             tmCommonMeta.mAvatars = u0.a(tmCommonMeta.mAvatars);
          }
          tmCommonMeta = this.mVideoModel;
          if (tmCommonMeta != null) {
             tmCommonMeta.mVideoUrls = u0.a(tmCommonMeta.mVideoUrls);
             tmCommonMeta = this.mVideoModel;
             tmCommonMeta.mH265Urls = u0.a(tmCommonMeta.mH265Urls);
             tmCommonMeta = this.mVideoModel;
             tmCommonMeta.mSdUrls = u0.a(tmCommonMeta.mSdUrls);
          }
          tmCommonMeta = this.mCoverMeta;
          if (tmCommonMeta != null) {
             tmCommonMeta.mCoverUrls = u0.a(tmCommonMeta.mCoverUrls);
             tmCommonMeta = this.mCoverMeta;
             tmCommonMeta.mCoverThumbnailUrls = u0.a(tmCommonMeta.mCoverThumbnailUrls);
             tmCommonMeta = this.mCoverMeta;
             tmCommonMeta.mFFCoverThumbnailUrls = u0.a(tmCommonMeta.mFFCoverThumbnailUrls);
             tmCommonMeta = this.mCoverMeta;
             tmCommonMeta.mSfStarCoverUrls = u0.a(tmCommonMeta.mSfStarCoverUrls);
             tmCommonMeta = this.mCoverMeta;
             tmCommonMeta.mBackgroundImageUrls = u0.a(tmCommonMeta.mBackgroundImageUrls);
          }
          return;
       }
    }
    public void f(String p0,Object p1){
       b.c(this, p0, p1);
    }
    public Object getExtra(String p0){
       return b.a(this, p0);
    }
    public ExtendableModelMap getExtraMap(){
       Object obj = PatchProxy.apply(null, this, VideoFeed.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mExtraMap == null) {
          this.mExtraMap = new ExtendableModelMap();
       }
       return this.mExtraMap;
    }
    public String getId(){
       return this.mPhotoMeta.mPhotoId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoFeed.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new t0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, VideoFeed.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(VideoFeed.class, new t0());
       }else {
          obj.put(VideoFeed.class, null);
       }
       return obj;
    }
    public boolean isPayCourse(){
       Object obj = PatchProxy.apply(null, this, VideoFeed.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = Optional.fromNullable(this.mPayVideoModel).transform(i0.b).or(Boolean.FALSE);
       }
       return obj.booleanValue();
    }
    public boolean isSerialPayPhoto(){
       Object obj = PatchProxy.apply(null, this, VideoFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return Optional.fromNullable(this.mVideoModel).transform(h0.b).or(Boolean.FALSE).booleanValue();
    }
    public void putExtra(String p0,Object p1){
       b.b(this, p0, p1);
    }
    public final void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoFeed.class, "3")) {
          return;
       }
       p0.defaultReadObject();
       this.setupAccessors();
       return;
    }
}
