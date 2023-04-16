package com.kuaishou.android.model.mix.VideoMeta$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.VideoMeta;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import com.yxcorp.gifshow.tube.TubePhotoPayInfo;
import com.kuaishou.android.model.mix.KMovieTemplate;
import com.kuaishou.android.model.mix.FlashPhotoTemplate$TypeAdapter;
import com.kuaishou.android.model.mix.FusionInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kuaishou.android.model.mix.VideoMeta$TypeAdapter$e;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$i;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.kuaishou.android.model.mix.VideoMeta$TypeAdapter$f;
import com.kuaishou.android.model.mix.VideoMeta$TypeAdapter$g;
import com.kuaishou.android.model.mix.FlashPhotoTemplate;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.mix.FusionInfo;
import com.kuaishou.android.model.mix.VideoMeta$TypeAdapter$h;
import com.google.gson.stream.b;
import com.kuaishou.android.model.mix.VideoMeta$TypeAdapter$a;
import com.kuaishou.android.model.mix.VideoMeta$TypeAdapter$b;
import com.kuaishou.android.model.mix.VideoMeta$TypeAdapter$c;
import com.kuaishou.android.model.mix.VideoMeta$TypeAdapter$d;

public final class VideoMeta$TypeAdapter extends TypeAdapter	// class@000e2d
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public final TypeAdapter f;
    public final TypeAdapter g;
    public static final a h;

    static {
       VideoMeta$TypeAdapter.h = a.get(VideoMeta.class);
    }
    public void VideoMeta$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
       this.c = p0.j(FlashPhotoTemplate$TypeAdapter.c);
       this.d = p0.j(a.get(KwaiManifest.class));
       this.e = p0.j(FusionInfo$TypeAdapter.e);
       this.f = p0.j(a.get(TubePhotoPayInfo.class));
       this.g = p0.j(a.get(KMovieTemplate.class));
    }
    public VideoMeta a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, VideoMeta$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       VideoMeta videoMeta = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return videoMeta;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return videoMeta;
       }else {
          p0.c();
          VideoMeta videoMeta1 = new VideoMeta();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x89444d94:
                   if (str.equals("duration")) {
                      i = 0;
                   }
                   break;
                 case 0x9b0b6de1:
                   if (str.equals("fullMovie")) {
                      i = 1;
                   }
                   break;
                 case 0x9d3134f6:
                   if (str.equals("mock_origin_mv_urls")) {
                      i = 2;
                   }
                   break;
                 case 0x9f3a7593:
                   if (str.equals("sf21WarmupPercent")) {
                      i = 3;
                   }
                   break;
                 case 0xa02f8330:
                   if (str.equals("hulianFeedId")) {
                      i = 4;
                   }
                   break;
                 case 0xa04019d1:
                   if (str.equals("xyhData")) {
                      i = 5;
                   }
                   break;
                 case 0xa98b052d:
                   if (str.equals("local_mv_url")) {
                      i = 6;
                   }
                   break;
                 case 0xacf5ca9f:
                   if (str.equals("showProgressEnterDetail")) {
                      i = 7;
                   }
                   break;
                 case 0xaff078fc:
                   if (str.equals("coronaRelatedRecoControlTime")) {
                      i = 8;
                   }
                   break;
                 case 0xb4b4a0cb:
                   if (str.equals("musicStationFeedTitle")) {
                      i = 9;
                   }
                   break;
                 case 0xc923ab13:
                   if (str.equals("horizontalStreamManifest")) {
                      i = 10;
                   }
                   break;
                 case 0xd78c0860:
                   if (str.equals("fromSourceId")) {
                      i = 11;
                   }
                   break;
                 case 0xda08c2bc:
                   if (str.equals("flashPhotoTemplate")) {
                      i = 12;
                   }
                   break;
                 case 0xe87fca2c:
                   if (str.equals("main_mv_urls_sd_h265")) {
                      i = 13;
                   }
                   break;
                 case 0xeb27c934:
                   if (str.equals("main_mv_urls_h265")) {
                      i = 14;
                   }
                   break;
                 case 0xef458c3c:
                   if (str.equals("watchTime")) {
                      i = 15;
                   }
                   break;
                 case 0x1c8ec:
                   if (str.equals("vpf")) {
                      i = 16;
                   }
                   break;
                 case 0x71f0b5f:
                   if (str.equals("longVideo")) {
                      i = 17;
                   }
                   break;
                 case 0x16267f88:
                   if (str.equals("tubePhotoPayInfo")) {
                      i = 18;
                   }
                   break;
                 case 0x38373500:
                   if (str.equals("supportLandscapePlay")) {
                      i = 19;
                   }
                   break;
                 case 0x5d77ef59:
                   if (str.equals("isMusicFeed")) {
                      i = 20;
                   }
                   break;
                 case 0x5f2aa520:
                   if (str.equals("posterKmovieInfo")) {
                      i = 21;
                   }
                   break;
                 case 0x66288931:
                   if (str.equals("savePlayProgressStrategy")) {
                      i = 22;
                   }
                   break;
                 case 0x6a090f4d:
                   if (str.equals("is_local_hdr")) {
                      i = 23;
                   }
                   break;
                 case 0x71f161cf:
                   if (str.equals("streamManifest")) {
                      i = 24;
                   }
                   break;
                 case 0x73985ed8:
                   if (str.equals("geminiAutoPlay")) {
                      i = 25;
                   }
                   break;
                 case 0x73eed95d:
                   if (str.equals("userReplayTotalCount")) {
                      i = 26;
                   }
                   break;
                 case 0x7a369934:
                   if (str.equals("main_mv_urls")) {
                      i = 27;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   videoMeta1.mDuration = KnownTypeAdapters$n.a(p0, videoMeta1.mDuration);
                   break;
                 case 1:
                   videoMeta1.mFullMovie = KnownTypeAdapters$g.a(p0, videoMeta1.mFullMovie);
                   break;
                 case 2:
                   videoMeta1.mMockOriginUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new VideoMeta$TypeAdapter$h(this)).a(p0);
                   break;
                 case 3:
                   videoMeta1.mSf21WarmupPercent = KnownTypeAdapters$k.a(p0, videoMeta1.mSf21WarmupPercent);
                   break;
                 case 4:
                   videoMeta1.mHulianFeedId = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   videoMeta1.mFusionInfo = this.e.read(p0);
                   break;
                 case 6:
                   videoMeta1.mLocalUrl = this.b.read(p0);
                   break;
                 case 7:
                   videoMeta1.mShowProgressWhenEnterDetail = KnownTypeAdapters$g.a(p0, videoMeta1.mShowProgressWhenEnterDetail);
                   break;
                 case 8:
                   videoMeta1.coronaRelatedRecoControlTime = KnownTypeAdapters$k.a(p0, videoMeta1.coronaRelatedRecoControlTime);
                   break;
                 case 9:
                   videoMeta1.mMusicFeedName = TypeAdapters.A.read(p0);
                   break;
                 case 10:
                   videoMeta1.mHorizontalManifest = this.d.read(p0);
                   break;
                 case 11:
                   videoMeta1.mFromSourceId = KnownTypeAdapters$n.a(p0, videoMeta1.mFromSourceId);
                   break;
                 case 12:
                   videoMeta1.mFlashPhotoTemplate = this.c.read(p0);
                   break;
                 case 13:
                   videoMeta1.mSdUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new VideoMeta$TypeAdapter$g(this)).a(p0);
                   break;
                 case 14:
                   videoMeta1.mH265Urls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new VideoMeta$TypeAdapter$f(this)).a(p0);
                   break;
                 case 15:
                   videoMeta1.mWatchTime = KnownTypeAdapters$n.a(p0, videoMeta1.mWatchTime);
                   break;
                 case 16:
                   videoMeta1.mVpf = KnownTypeAdapters$i.a(p0, videoMeta1.mVpf);
                   break;
                 case 17:
                   videoMeta1.mIsLongVideo = KnownTypeAdapters$g.a(p0, videoMeta1.mIsLongVideo);
                   break;
                 case 18:
                   videoMeta1.mTubePhotoPayInfo = this.f.read(p0);
                   break;
                 case 19:
                   videoMeta1.mSupportLandscapePlay = KnownTypeAdapters$g.a(p0, videoMeta1.mSupportLandscapePlay);
                   break;
                 case 20:
                   videoMeta1.mIsMusicFeed = KnownTypeAdapters$g.a(p0, videoMeta1.mIsMusicFeed);
                   break;
                 case 21:
                   videoMeta1.kmovieTemplate = this.g.read(p0);
                   break;
                 case 22:
                   videoMeta1.mContinuePlayStrategy = KnownTypeAdapters$k.a(p0, videoMeta1.mContinuePlayStrategy);
                   break;
                 case 23:
                   videoMeta1.mLocalFileHdrState = KnownTypeAdapters$k.a(p0, videoMeta1.mLocalFileHdrState);
                   break;
                 case 24:
                   videoMeta1.mMediaManifest = this.d.read(p0);
                   break;
                 case 25:
                   videoMeta1.mGeminiAutoPlay = KnownTypeAdapters$k.a(p0, videoMeta1.mGeminiAutoPlay);
                   break;
                 case 26:
                   videoMeta1.mUserReplayTotalCount = KnownTypeAdapters$k.a(p0, videoMeta1.mUserReplayTotalCount);
                   break;
                 case 27:
                   videoMeta1.mVideoUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new VideoMeta$TypeAdapter$e(this)).a(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return videoMeta1;
       }
    }
    public void b(b p0,VideoMeta p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoMeta$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mVideoUrls != null) {
             p0.r("main_mv_urls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new VideoMeta$TypeAdapter$a(this)).b(p0, p1.mVideoUrls);
          }
          if (p1.mH265Urls != null) {
             p0.r("main_mv_urls_h265");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new VideoMeta$TypeAdapter$b(this)).b(p0, p1.mH265Urls);
          }
          if (p1.mSdUrls != null) {
             p0.r("main_mv_urls_sd_h265");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new VideoMeta$TypeAdapter$c(this)).b(p0, p1.mSdUrls);
          }
          if (p1.mLocalUrl != null) {
             p0.r("local_mv_url");
             this.b.write(p0, p1.mLocalUrl);
          }
          p0.r("is_local_hdr");
          p0.K((long)p1.mLocalFileHdrState);
          if (p1.mMockOriginUrls != null) {
             p0.r("mock_origin_mv_urls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new VideoMeta$TypeAdapter$d(this)).b(p0, p1.mMockOriginUrls);
          }
          p0.r("supportLandscapePlay");
          p0.P(p1.mSupportLandscapePlay);
          p0.r("longVideo");
          p0.P(p1.mIsLongVideo);
          p0.r("fullMovie");
          p0.P(p1.mFullMovie);
          p0.r("isMusicFeed");
          p0.P(p1.mIsMusicFeed);
          if (p1.mMusicFeedName != null) {
             p0.r("musicStationFeedTitle");
             TypeAdapters.A.write(p0, p1.mMusicFeedName);
          }
          p0.r("duration");
          p0.K(p1.mDuration);
          if (p1.mFlashPhotoTemplate != null) {
             p0.r("flashPhotoTemplate");
             this.c.write(p0, p1.mFlashPhotoTemplate);
          }
          p0.r("vpf");
          p0.J(p1.mVpf);
          if (p1.mMediaManifest != null) {
             p0.r("streamManifest");
             this.d.write(p0, p1.mMediaManifest);
          }
          if (p1.mHorizontalManifest != null) {
             p0.r("horizontalStreamManifest");
             this.d.write(p0, p1.mHorizontalManifest);
          }
          if (p1.mFusionInfo != null) {
             p0.r("xyhData");
             this.e.write(p0, p1.mFusionInfo);
          }
          p0.r("sf21WarmupPercent");
          p0.K((long)p1.mSf21WarmupPercent);
          if (p1.mHulianFeedId != null) {
             p0.r("hulianFeedId");
             TypeAdapters.A.write(p0, p1.mHulianFeedId);
          }
          if (p1.mTubePhotoPayInfo != null) {
             p0.r("tubePhotoPayInfo");
             this.f.write(p0, p1.mTubePhotoPayInfo);
          }
          p0.r("userReplayTotalCount");
          p0.K((long)p1.mUserReplayTotalCount);
          p0.r("coronaRelatedRecoControlTime");
          p0.K((long)p1.coronaRelatedRecoControlTime);
          p0.r("savePlayProgressStrategy");
          p0.K((long)p1.mContinuePlayStrategy);
          p0.r("showProgressEnterDetail");
          p0.P(p1.mShowProgressWhenEnterDetail);
          p0.r("watchTime");
          p0.K(p1.mWatchTime);
          p0.r("fromSourceId");
          p0.K(p1.mFromSourceId);
          p0.r("geminiAutoPlay");
          p0.K((long)p1.mGeminiAutoPlay);
          if (p1.kmovieTemplate != null) {
             p0.r("posterKmovieInfo");
             this.g.write(p0, p1.kmovieTemplate);
          }
          p0.j();
          return;
       }
    }
    public Object read(a p0){
       return this.a(p0);
    }
    public void write(b p0,Object p1){
       this.b(p0, p1);
    }
}
