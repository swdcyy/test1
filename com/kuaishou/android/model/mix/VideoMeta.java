package com.kuaishou.android.model.mix.VideoMeta;
import java.io.Serializable;
import mkd.a;
import zp.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.player.helper.c;
import ei5.c;
import java.lang.StringBuilder;
import q87.c;

public class VideoMeta implements Serializable, a, i	// class@000e2e
{
    public int coronaRelatedRecoControlTime;
    public KMovieTemplate kmovieTemplate;
    public int mContinuePlayStrategy;
    public long mDuration;
    public FlashPhotoTemplate mFlashPhotoTemplate;
    public long mFromSourceId;
    public boolean mFullMovie;
    public FusionInfo mFusionInfo;
    public int mGeminiAutoPlay;
    public CDNUrl[] mH265Urls;
    public KwaiManifest mHorizontalManifest;
    public String mHulianFeedId;
    public boolean mIsHdrVideo;
    public boolean mIsLongVideo;
    public boolean mIsMusicFeed;
    public int mLocalFileHdrState;
    public CDNUrl mLocalUrl;
    public KwaiManifest mMediaManifest;
    public CDNUrl[] mMockOriginUrls;
    public String mMusicFeedName;
    public CDNUrl[] mSdUrls;
    public int mSf21WarmupPercent;
    public boolean mShowProgressWhenEnterDetail;
    public boolean mSupportLandscapePlay;
    public TubePhotoPayInfo mTubePhotoPayInfo;
    public int mUserReplayTotalCount;
    public String mVideoUrl;
    public CDNUrl[] mVideoUrls;
    public double mVpf;
    public long mWatchTime;
    public static final long serialVersionUID = 0xe1cd26ee131a4441;

    public void VideoMeta(){
       super();
       this.mContinuePlayStrategy = 0;
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, VideoMeta.class, "1")) {
          return;
       }
       this.mVideoUrl = e0.d(this.mVideoUrls);
       VideoMeta tmMediaManif = this.mMediaManifest;
       if (tmMediaManif != null) {
          this.mIsHdrVideo = tmMediaManif.isHdr();
       }
       return;
    }
    public CDNUrl getLocalUrl(){
       return this.mLocalUrl;
    }
    public boolean isLocalHdr(){
       Object obj = PatchProxy.apply(null, this, VideoMeta.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (this.mLocalUrl != null) {
          if (this.mLocalFileHdrState == null) {
             this.mLocalFileHdrState = c.a().b(this.mLocalUrl.mUrl);
             Object[] objArray = new Object[i];
             c.C().w("VideoMeta", " isLocalHdr "+this.mLocalFileHdrState, objArray);
          }
          if (this.mLocalFileHdrState == 2) {
             i = true;
          }
       }
       return i;
    }
    public VideoMeta setLocalUrl(CDNUrl p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoMeta.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mLocalUrl = p0;
       if (p0 != null) {
          p0 = p0.mUrl;
          int i = c.a().b(p0);
          this.mLocalFileHdrState = i;
          if (!i) {
             c.a().c(p0);
          }
       }
       return this;
    }
    public void updateVideoMetaWhenRrefreshFeed(VideoMeta p0){
       this.mMediaManifest = p0.mMediaManifest;
       this.mVideoUrls = p0.mVideoUrls;
       this.mVideoUrl = p0.mVideoUrl;
       this.mH265Urls = p0.mH265Urls;
       this.mSdUrls = p0.mSdUrls;
    }
    public void updateWithServer(VideoMeta p0){
       this.mSupportLandscapePlay = p0.mSupportLandscapePlay;
       this.mIsLongVideo = p0.mIsLongVideo;
       this.mIsMusicFeed = p0.mIsMusicFeed;
       this.mMusicFeedName = p0.mMusicFeedName;
       this.mDuration = p0.mDuration;
       this.mVideoUrls = p0.mVideoUrls;
       this.mH265Urls = p0.mH265Urls;
       this.mSdUrls = p0.mSdUrls;
       this.mUserReplayTotalCount = p0.mUserReplayTotalCount;
       this.mWatchTime = p0.mWatchTime;
    }
    public void updateWithServer(Object p0){
       this.updateWithServer(p0);
    }
}
