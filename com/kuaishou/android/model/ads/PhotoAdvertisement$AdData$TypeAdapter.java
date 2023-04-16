package com.kuaishou.android.model.ads.PhotoAdvertisement$AdData$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.VideoQualityInfo;
import java.lang.Object;
import com.kuaishou.android.model.ads.BrokenFrameInfo;
import com.kuaishou.android.model.ads.AnimationVideoInfo;
import com.kuaishou.android.model.ads.SideWindowInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CouponInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CaptionAdvertisementInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverStickerInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverMediaInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PlayEndInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PlayPauseInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverPlayEndInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RequestEApiInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$LandingPageInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ActionbarInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TopActionbarInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InstreamAdBarInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JointInstreamAdBarInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ProfileBottomBannerInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NovelCardInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfPageBannerInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverActionBarInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MixBarInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdSurveyInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FakeCommentInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ConvertInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdWebCardInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PendantInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TryGameInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayInfo$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdWeakData$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$H5ControlInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAdInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdRerankInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCacheStrategyInfo$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$c;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdApkMd5Info$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoronaBrandInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentActionBarInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenuInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppDetailInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyOption$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdBridgeInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCardTemplateInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrlGroup$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickItem$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentEmojiInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JumpLiveInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBrandInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExitDialogInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ShareInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopPlayInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdBottomBanner$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingPageInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$WidgetInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InteractionInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$VideoClipInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$DanmakuInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBigvLive$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TvcInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchExtraInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TopTagInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$WebViewNavigationBarInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppLinkToastInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchSuspendedBallInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentTopBarInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PlayEndInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentEmojiInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCacheStrategyInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$H5ControlInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JumpLiveInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TopTagInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$DanmakuInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdApkMd5Info;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverActionBarInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TopActionbarInfo;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfPageBannerInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RequestEApiInfo;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopPlayInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBrandInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyOption;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdWeakData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAdInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JointInstreamAdBarInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingPageInfo;
import com.vimeo.stag.KnownTypeAdapters$j;
import com.kuaishou.android.model.ads.SplashInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ActionbarInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentActionBarInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppLinkToastInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenuInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$VideoClipInfo;
import java.util.List;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PlayPauseInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdWebCardInfo;
import java.util.HashMap;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppDetailInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrlGroup;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdBridgeInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoronaBrandInfo;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FakeCommentInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InstreamAdBarInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TryGameInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$WidgetInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$LandingPageInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdRerankInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdSurveyInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MixBarInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverMediaInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CaptionAdvertisementInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InteractionInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ConvertInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ProfileBottomBannerInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverPlayEndInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdBottomBanner;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CouponInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExitDialogInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBigvLive;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCardTemplateInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ShareInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PendantInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverStickerInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchSuspendedBallInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TvcInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NovelCardInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$WebViewNavigationBarInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchExtraInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentTopBarInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARInfo;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$AdData$TypeAdapter extends TypeAdapter	// class@0008a3
{
    public final TypeAdapter A;
    public final TypeAdapter B;
    public final TypeAdapter C;
    public final TypeAdapter D;
    public final TypeAdapter E;
    public final TypeAdapter F;
    public final TypeAdapter G;
    public final TypeAdapter H;
    public final TypeAdapter I;
    public final TypeAdapter J;
    public final TypeAdapter K;
    public final TypeAdapter L;
    public final TypeAdapter M;
    public final TypeAdapter N;
    public final TypeAdapter O;
    public final TypeAdapter P;
    public final TypeAdapter Q;
    public final TypeAdapter R;
    public final TypeAdapter S;
    public final TypeAdapter T;
    public final TypeAdapter U;
    public final TypeAdapter V;
    public final TypeAdapter W;
    public final TypeAdapter X;
    public final TypeAdapter Y;
    public final TypeAdapter Z;
    public final Gson a;
    public final TypeAdapter a0;
    public final TypeAdapter b;
    public final TypeAdapter b0;
    public final TypeAdapter c;
    public final TypeAdapter c0;
    public final TypeAdapter d;
    public final TypeAdapter d0;
    public final TypeAdapter e;
    public final TypeAdapter e0;
    public final TypeAdapter f;
    public final TypeAdapter f0;
    public final TypeAdapter g;
    public final TypeAdapter g0;
    public final TypeAdapter h;
    public final TypeAdapter h0;
    public final TypeAdapter i;
    public final TypeAdapter i0;
    public final TypeAdapter j;
    public final TypeAdapter j0;
    public final TypeAdapter k;
    public final TypeAdapter k0;
    public final TypeAdapter l;
    public final TypeAdapter l0;
    public final TypeAdapter m;
    public final TypeAdapter m0;
    public final TypeAdapter n;
    public final TypeAdapter n0;
    public final TypeAdapter o;
    public final TypeAdapter o0;
    public final TypeAdapter p;
    public final TypeAdapter p0;
    public final TypeAdapter q;
    public final TypeAdapter q0;
    public final TypeAdapter r;
    public final TypeAdapter r0;
    public final TypeAdapter s;
    public final TypeAdapter s0;
    public final TypeAdapter t;
    public final TypeAdapter t0;
    public final TypeAdapter u;
    public final TypeAdapter u0;
    public final TypeAdapter v;
    public final TypeAdapter v0;
    public final TypeAdapter w;
    public final TypeAdapter w0;
    public final TypeAdapter x;
    public final TypeAdapter x0;
    public final TypeAdapter y;
    public final TypeAdapter y0;
    public final TypeAdapter z;
    public final TypeAdapter z0;
    public static final a A0;

    static {
       PhotoAdvertisement$AdData$TypeAdapter.A0 = a.get(PhotoAdvertisement$AdData.class);
    }
    public void PhotoAdvertisement$AdData$TypeAdapter(Gson p0){
       TypeAdapter a;
       super();
       this.a = p0;
       this.b = p0.j(PhotoAdvertisement$CouponInfo$TypeAdapter.b);
       this.c = p0.j(PhotoAdvertisement$CaptionAdvertisementInfo$TypeAdapter.b);
       this.d = p0.j(PhotoAdvertisement$CoverStickerInfo$TypeAdapter.c);
       this.e = p0.j(PhotoAdvertisement$CoverMediaInfo$TypeAdapter.d);
       this.f = p0.j(PhotoAdvertisement$PlayEndInfo$TypeAdapter.b);
       this.g = p0.j(PhotoAdvertisement$PlayPauseInfo$TypeAdapter.b);
       this.h = p0.j(PhotoAdvertisement$CoverPlayEndInfo$TypeAdapter.b);
       this.i = p0.j(PhotoAdvertisement$RequestEApiInfo$TypeAdapter.c);
       this.j = p0.j(PhotoAdvertisement$LandingPageInfo$TypeAdapter.d);
       this.k = p0.j(PhotoAdvertisement$ActionbarInfo$TypeAdapter.b);
       this.l = p0.j(PhotoAdvertisement$TopActionbarInfo$TypeAdapter.b);
       this.m = p0.j(PhotoAdvertisement$InstreamAdBarInfo$TypeAdapter.b);
       this.n = p0.j(PhotoAdvertisement$JointInstreamAdBarInfo$TypeAdapter.b);
       this.o = p0.j(PhotoAdvertisement$ProfileBottomBannerInfo$TypeAdapter.b);
       this.p = p0.j(PhotoAdvertisement$NovelCardInfo$TypeAdapter.b);
       this.q = p0.j(PhotoAdvertisement$HalfPageBannerInfo$TypeAdapter.b);
       this.r = p0.j(PhotoAdvertisement$CoverActionBarInfo$TypeAdapter.c);
       this.s = p0.j(PhotoAdvertisement$MixBarInfo$TypeAdapter.b);
       this.t = p0.j(PhotoAdvertisement$AdSurveyInfo$TypeAdapter.b);
       this.u = p0.j(PhotoAdvertisement$FakeCommentInfo$TypeAdapter.b);
       this.v = p0.j(SplashInfo$TypeAdapter.r);
       this.w = p0.j(PhotoAdvertisement$ConvertInfo$TypeAdapter.b);
       this.x = p0.j(PhotoAdvertisement$TkTemplateInfo$TypeAdapter.b);
       this.y = p0.j(PhotoAdvertisement$AdWebCardInfo$TypeAdapter.b);
       this.z = p0.j(PhotoAdvertisement$MerchandiseInfo$TypeAdapter.f);
       TypeAdapter typeAdapter = p0.j(a.get(VideoQualityInfo.class));
       this.A = typeAdapter;
       this.B = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.C = p0.j(PhotoAdvertisement$PendantInfo$TypeAdapter.c);
       this.D = p0.j(PhotoAdvertisement$TryGameInfo$TypeAdapter.b);
       this.E = p0.j(PhotoAdvertisement$ExtraDisplayInfo$TypeAdapter.d);
       this.F = new KnownTypeAdapters$ListTypeAdapter(KnownTypeAdapters.c, new KnownTypeAdapters$d());
       this.G = new KnownTypeAdapters$ListTypeAdapter(KnownTypeAdapters.f, new KnownTypeAdapters$d());
       this.H = p0.j(PhotoAdvertisement$AdWeakData$TypeAdapter.d);
       this.I = p0.j(PhotoAdvertisement$H5ControlInfo$TypeAdapter.b);
       this.J = p0.j(PhotoAdvertisement$InspireAdInfo$TypeAdapter.f);
       this.K = p0.j(PhotoAdvertisement$AdRerankInfo$TypeAdapter.d);
       this.L = p0.j(PhotoAdvertisement$AdCacheStrategyInfo$TypeAdapter.b);
       typeAdapter = p0.j(a.get(Object.class));
       this.M = typeAdapter;
       a = TypeAdapters.A;
       this.N = new KnownTypeAdapters$MapTypeAdapter(a, typeAdapter, new KnownTypeAdapters$c());
       this.O = new KnownTypeAdapters$MapTypeAdapter(a, a, new KnownTypeAdapters$c());
       this.P = p0.j(PhotoAdvertisement$AdApkMd5Info$TypeAdapter.c);
       this.Q = p0.j(PhotoAdvertisement$CoronaBrandInfo$TypeAdapter.b);
       this.R = p0.j(PhotoAdvertisement$CommentActionBarInfo$TypeAdapter.b);
       this.S = p0.j(PhotoAdvertisement$NegativeMenuInfo$TypeAdapter.f);
       this.T = p0.j(PhotoAdvertisement$AppDetailInfo$TypeAdapter.c);
       this.U = p0.j(PhotoAdvertisement$PrivacyOption$TypeAdapter.e);
       this.V = p0.j(PhotoAdvertisement$AdBridgeInfo$TypeAdapter.c);
       typeAdapter = p0.j(PhotoAdvertisement$TkTemplateData$TypeAdapter.b);
       this.W = typeAdapter;
       this.X = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.Y = p0.j(PhotoAdvertisement$AdCardTemplateInfo$TypeAdapter.b);
       this.Z = p0.j(PhotoAdvertisement$ItemClickUrlGroup$TypeAdapter.c);
       typeAdapter = p0.j(PhotoAdvertisement$ItemClickItem$TypeAdapter.d);
       this.a0 = typeAdapter;
       this.b0 = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.c0 = p0.j(PhotoAdvertisement$CommentEmojiInfo$TypeAdapter.c);
       this.d0 = p0.j(PhotoAdvertisement$JumpLiveInfo$TypeAdapter.b);
       this.e0 = p0.j(PhotoAdvertisement$SearchBrandInfo$TypeAdapter.d);
       this.f0 = p0.j(PhotoAdvertisement$ExitDialogInfo$TypeAdapter.b);
       this.g0 = p0.j(PhotoAdvertisement$ShareInfo$TypeAdapter.b);
       this.h0 = p0.j(PhotoAdvertisement$PopPlayInfo$TypeAdapter.c);
       this.i0 = p0.j(PhotoAdvertisement$PopARInfo$TypeAdapter.d);
       this.j0 = p0.j(PhotoAdvertisement$AdBottomBanner$TypeAdapter.b);
       this.k0 = p0.j(PhotoAdvertisement$HalfLandingPageInfo$TypeAdapter.b);
       this.l0 = p0.j(PhotoAdvertisement$WidgetInfo$TypeAdapter.b);
       this.m0 = p0.j(PhotoAdvertisement$InteractionInfo$TypeAdapter.d);
       this.n0 = p0.j(PhotoAdvertisement$VideoClipInfo$TypeAdapter.b);
       this.o0 = p0.j(PhotoAdvertisement$DanmakuInfo$TypeAdapter.b);
       this.p0 = p0.j(PhotoAdvertisement$SearchBigvLive$TypeAdapter.b);
       this.q0 = p0.j(PhotoAdvertisement$TvcInfo$TypeAdapter.d);
       this.r0 = p0.j(PhotoAdvertisement$SearchExtraInfo$TypeAdapter.c);
       this.s0 = p0.j(PhotoAdvertisement$TopTagInfo$TypeAdapter.d);
       this.t0 = p0.j(PhotoAdvertisement$WebViewNavigationBarInfo$TypeAdapter.b);
       this.u0 = p0.j(PhotoAdvertisement$AppLinkToastInfo$TypeAdapter.b);
       this.v0 = p0.j(a.get(BrokenFrameInfo.class));
       this.w0 = p0.j(a.get(AnimationVideoInfo.class));
       this.x0 = p0.j(a.get(SideWindowInfo.class));
       this.y0 = p0.j(PhotoAdvertisement$SearchSuspendedBallInfo$TypeAdapter.d);
       this.z0 = p0.j(PhotoAdvertisement$CommentTopBarInfo$TypeAdapter.d);
    }
    public PhotoAdvertisement$AdData a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$AdData$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$AdData uAdData = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uAdData;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uAdData;
       }else {
          p0.c();
          PhotoAdvertisement$AdData uAdData1 = new PhotoAdvertisement$AdData();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x80de5210:
                   if (str.equals("popARInfo")) {
                      i = 0;
                   }
                   break;
                 case 0x8106500b:
                   if (str.equals("commentTopBarInfo")) {
                      i = 1;
                   }
                   break;
                 case 0x816d7c16:
                   if (str.equals("searchExtraInfo")) {
                      i = 2;
                   }
                   break;
                 case 0x8be98794:
                   if (str.equals("webViewNavigationBarInfo")) {
                      i = 3;
                   }
                   break;
                 case 0x8eb77956:
                   if (str.equals("novelBannerInfo")) {
                      i = 4;
                   }
                   break;
                 case 0x8ee69e6f:
                   if (str.equals("tVCInfo")) {
                      i = 5;
                   }
                   break;
                 case 0x92dcd355:
                   if (str.equals("disableDSPSoftErrorMonitor")) {
                      i = 6;
                   }
                   break;
                 case 0x934a8d80:
                   if (str.equals("searchSuspendedBallInfo")) {
                      i = 7;
                   }
                   break;
                 case 0x94835f58:
                   if (str.equals("searchRecommendReason")) {
                      i = 8;
                   }
                   break;
                 case 0x9724a754:
                   if (str.equals("coverStickerInfo")) {
                      i = 9;
                   }
                   break;
                 case 0x9bdc166a:
                   if (str.equals("pendantInfo")) {
                      i = 10;
                   }
                   break;
                 case 0xa0c29ad3:
                   if (str.equals("webviewType")) {
                      i = 11;
                   }
                   break;
                 case 0xa1af212d:
                   if (str.equals("shareInfo")) {
                      i = 12;
                   }
                   break;
                 case 0xa27e39bb:
                   if (str.equals("adCardTemplateInfo")) {
                      i = 13;
                   }
                   break;
                 case 0xad903f4a:
                   if (str.equals("searchBigvLive")) {
                      i = 14;
                   }
                   break;
                 case 0xada839d4:
                   if (str.equals("exitDialogInfo")) {
                      i = 15;
                   }
                   break;
                 case 0xaec88677:
                   if (str.equals("adCouponInfo")) {
                      i = 16;
                   }
                   break;
                 case 0xaecd933e:
                   if (str.equals("isOrderedApp")) {
                      i = 17;
                   }
                   break;
                 case 0xb08dde85:
                   if (str.equals("bottomBannerInfo")) {
                      i = 18;
                   }
                   break;
                 case 0xb4834217:
                   if (str.equals("h5Data")) {
                      i = 19;
                   }
                   break;
                 case 0xb5caf21e:
                   if (str.equals("coverPlayEndInfo")) {
                      i = 20;
                   }
                   break;
                 case 0xb7d23a4e:
                   if (str.equals("profileBottomBannerInfo")) {
                      i = 21;
                   }
                   break;
                 case 0xbf5ee501:
                   if (str.equals("convertInfo")) {
                      i = 22;
                   }
                   break;
                 case 0xc0f44de0:
                   if (str.equals("interactionInfo")) {
                      i = 23;
                   }
                   break;
                 case 0xc2790f0d:
                   if (str.equals("captionAdvertisementInfo")) {
                      i = 24;
                   }
                   break;
                 case 0xc593b545:
                   if (str.equals("isReplaceIpdx")) {
                      i = 25;
                   }
                   break;
                 case 0xc5ced848:
                   if (str.equals("templateInfo")) {
                      i = 26;
                   }
                   break;
                 case 0xc8577f90:
                   if (str.equals("marketUri")) {
                      i = 27;
                   }
                   break;
                 case 0xcd67c0bb:
                   if (str.equals("coverMediaInfo")) {
                      i = 28;
                   }
                   break;
                 case 0xd42e6565:
                   if (str.equals("mixBarInfo")) {
                      i = 29;
                   }
                   break;
                 case 0xd7cf4328:
                   if (str.equals("surveyInfo")) {
                      i = 30;
                   }
                   break;
                 case 0xd832e1c7:
                   if (str.equals("liveStreamId")) {
                      i = 31;
                   }
                   break;
                 case 0xdde35125:
                   if (str.equals("smallWindowInfo")) {
                      i = 32;
                   }
                   break;
                 case 0xe169b2b0:
                   if (str.equals("adRerankInfo")) {
                      i = 33;
                   }
                   break;
                 case 0xe33ff314:
                   if (str.equals("landingPageInfo")) {
                      i = 34;
                   }
                   break;
                 case 0xea86ab66:
                   if (str.equals("brokenFrameInfo")) {
                      i = 35;
                   }
                   break;
                 case 0xedab7112:
                   if (str.equals("widgetInfo")) {
                      i = 36;
                   }
                   break;
                 case 0xef10169b:
                   if (str.equals("tryGameInfo")) {
                      i = 37;
                   }
                   break;
                 case 0xf09022bc:
                   if (str.equals("instreamBarInfo")) {
                      i = 38;
                   }
                   break;
                 case 0xf2eb96e9:
                   if (str.equals("putType")) {
                      i = 39;
                   }
                   break;
                 case 0xf3c005af:
                   if (str.equals("templateDatas")) {
                      i = 40;
                   }
                   break;
                 case 0xf453fea0:
                   if (str.equals("deepLinkFinishWebView")) {
                      i = 41;
                   }
                   break;
                 case 0xfd15d918:
                   if (str.equals("fakeCommentInfo")) {
                      i = 42;
                   }
                   break;
                 case 3367:
                   if (str.equals("ip")) {
                      i = 43;
                   }
                   break;
                 case 0x5b4a767:
                   if (str.equals("playedReportRate")) {
                      i = 44;
                   }
                   break;
                 case 0x5b5ad54:
                   if (str.equals("playedReportTime")) {
                      i = 45;
                   }
                   break;
                 case 0x5d2f162:
                   if (str.equals("h5Url")) {
                      i = 46;
                   }
                   break;
                 case 0x65e768f:
                   if (str.equals("posId")) {
                      i = 47;
                   }
                   break;
                 case 0x6e09a94:
                   if (str.equals("forbidAutoOpenApp")) {
                      i = 48;
                   }
                   break;
                 case 0x961f0a5:
                   if (str.equals("animationVideoInfo")) {
                      i = 49;
                   }
                   break;
                 case 0xdfcf119:
                   if (str.equals("coronaBrandInfo")) {
                      i = 50;
                   }
                   break;
                 case 0xfcde85a:
                   if (str.equals("adBridgeInfo")) {
                      i = 51;
                   }
                   break;
                 case 0x140a5073:
                   if (str.equals("itemClickList")) {
                      i = 52;
                   }
                   break;
                 case 0x140e88b9:
                   if (str.equals("itemClickUrls")) {
                      i = 53;
                   }
                   break;
                 case 0x16a2e997:
                   if (str.equals("newUserAgentStyle")) {
                      i = 54;
                   }
                   break;
                 case 0x16e36413:
                   if (str.equals("videoQualityPanels")) {
                      i = 55;
                   }
                   break;
                 case 0x1926b5ae:
                   if (str.equals("rateInfo")) {
                      i = 56;
                   }
                   break;
                 case 0x1a7441a0:
                   if (str.equals("appDetailInfo")) {
                      i = 57;
                   }
                   break;
                 case 0x1d503a44:
                   if (str.equals("liveRerankContext")) {
                      i = 58;
                   }
                   break;
                 case 0x21469f2f:
                   if (str.equals("adWebCardInfo")) {
                      i = 59;
                   }
                   break;
                 case 0x21b2fda2:
                   if (str.equals("showLiveIcon")) {
                      i = 60;
                   }
                   break;
                 case 0x228002f0:
                   if (str.equals("playPauseInfo")) {
                      i = 61;
                   }
                   break;
                 case 0x24f79132:
                   if (str.equals("playedTotalReportTime")) {
                      i = 62;
                   }
                   break;
                 case 0x26c721b9:
                   if (str.equals("videoClipInfo")) {
                      i = 63;
                   }
                   break;
                 case 0x271e9202:
                   if (str.equals("negativeMenuInfo")) {
                      i = 64;
                   }
                   break;
                 case 0x2c1bbffa:
                   if (str.equals("appLinkToastInfo")) {
                      i = 65;
                   }
                   break;
                 case 0x2caab82c:
                   if (str.equals("commentActionBarInfo")) {
                      i = 66;
                   }
                   break;
                 case 0x32bb615a:
                   if (str.equals("liveRouterScheme")) {
                      i = 67;
                   }
                   break;
                 case 0x39720488:
                   if (str.equals("adCoverPageButtonControl")) {
                      i = 68;
                   }
                   break;
                 case 0x3ed0e44b:
                   if (str.equals("actionBarInfo")) {
                      i = 69;
                   }
                   break;
                 case 0x3fd7a08c:
                   if (str.equals("antiVendorVari")) {
                      i = 70;
                   }
                   break;
                 case 0x434377b5:
                   if (str.equals("splashInfo")) {
                      i = 71;
                   }
                   break;
                 case 0x44eb00f1:
                   if (str.equals("appScore")) {
                      i = 72;
                   }
                   break;
                 case 0x47460713:
                   if (str.equals("halfLandingPage")) {
                      i = 73;
                   }
                   break;
                 case 0x49f1acd2:
                   if (str.equals("jointInstreamBarInfo")) {
                      i = 74;
                   }
                   break;
                 case 0x4aac6eeb:
                   if (str.equals("inspireAdInfo")) {
                      i = 75;
                   }
                   break;
                 case 0x52752485:
                   if (str.equals("adWeakData")) {
                      i = 76;
                   }
                   break;
                 case 0x54517950:
                   if (str.equals("enableAppDownloadPause")) {
                      i = 77;
                   }
                   break;
                 case 0x5a19d21d:
                   if (str.equals("privacyOption")) {
                      i = 78;
                   }
                   break;
                 case 0x5aec0599:
                   if (str.equals("adPageButtonControl")) {
                      i = 79;
                   }
                   break;
                 case 0x5f950849:
                   if (str.equals("displayInTopPageNum")) {
                      i = 80;
                   }
                   break;
                 case 0x6021aa60:
                   if (str.equals("extraDisplayInfo")) {
                      i = 81;
                   }
                   break;
                 case 0x61701311:
                   if (str.equals("merchandiseInfo")) {
                      i = 82;
                   }
                   break;
                 case 0x6199a00d:
                   if (str.equals("searchBrandInfo")) {
                      i = 83;
                   }
                   break;
                 case 0x61a7df73:
                   if (str.equals("popPlayInfo")) {
                      i = 84;
                   }
                   break;
                 case 0x631865cb:
                   if (str.equals("adExposedInfo")) {
                      i = 85;
                   }
                   break;
                 case 0x63c45adb:
                   if (str.equals("isNegetiveFilter")) {
                      i = 86;
                   }
                   break;
                 case 0x63f2fb1d:
                   if (str.equals("enableLeftSlideOpenLive")) {
                      i = 87;
                   }
                   break;
                 case 0x666dc192:
                   if (str.equals("requestEapiInfo")) {
                      i = 88;
                   }
                   break;
                 case 0x678e30fc:
                   if (str.equals("halfPageBannerInfo")) {
                      i = 89;
                   }
                   break;
                 case 0x6ad8f95e:
                   if (str.equals("useTrackType")) {
                      i = 90;
                   }
                   break;
                 case 0x6bb3e4f6:
                   if (str.equals("topActionBarInfo")) {
                      i = 91;
                   }
                   break;
                 case 0x6e12c1d4:
                   if (str.equals("coverActionBarInfo")) {
                      i = 92;
                   }
                   break;
                 case 0x6fd45590:
                   if (str.equals("apkMd5Info")) {
                      i = 93;
                   }
                   break;
                 case 0x71d8125d:
                   if (str.equals("danmakuInfo")) {
                      i = 94;
                   }
                   break;
                 case 0x7456d853:
                   if (str.equals("topTagInfo")) {
                      i = 95;
                   }
                   break;
                 case 0x759f7e08:
                   if (str.equals("jumpLiveInfo")) {
                      i = 96;
                   }
                   break;
                 case 0x7a29d09e:
                   if (str.equals("h5ControlInfo")) {
                      i = 97;
                   }
                   break;
                 case 0x7b33f980:
                   if (str.equals("adCacheStrategyInfo")) {
                      i = 98;
                   }
                   break;
                 case 0x7b58b275:
                   if (str.equals("commentEmojiInfo")) {
                      i = 99;
                   }
                   break;
                 case 0x7dcd4655:
                   if (str.equals("playEndInfo")) {
                      i = 100;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uAdData1.mPopARInfo = this.i0.read(p0);
                   break;
                 case 1:
                   uAdData1.mCommentTopBarInfo = this.z0.read(p0);
                   break;
                 case 2:
                   uAdData1.mSearchExtraInfo = this.r0.read(p0);
                   break;
                 case 3:
                   uAdData1.mWebViewNavigationBarInfo = this.t0.read(p0);
                   break;
                 case 4:
                   uAdData1.mNovelBannerInfo = this.p.read(p0);
                   break;
                 case 5:
                   uAdData1.mTvcInfo = this.q0.read(p0);
                   break;
                 case 6:
                   uAdData1.mDisableDSPSoftErrorMonitor = KnownTypeAdapters$g.a(p0, uAdData1.mDisableDSPSoftErrorMonitor);
                   break;
                 case 7:
                   uAdData1.mSearchSuspendedBallInfo = this.y0.read(p0);
                   break;
                 case 8:
                   uAdData1.mSearchRecommendReason = TypeAdapters.A.read(p0);
                   break;
                 case 9:
                   uAdData1.mCoverStickerInfo = this.d.read(p0);
                   break;
                 case 10:
                   uAdData1.mPendantInfo = this.C.read(p0);
                   break;
                 case 11:
                   uAdData1.mWebViewType = KnownTypeAdapters$k.a(p0, uAdData1.mWebViewType);
                   break;
                 case 12:
                   uAdData1.mShareInfo = this.g0.read(p0);
                   break;
                 case 13:
                   uAdData1.mAdCardTemplateInfo = this.Y.read(p0);
                   break;
                 case 14:
                   uAdData1.mSearchBigvLive = this.p0.read(p0);
                   break;
                 case 15:
                   uAdData1.mExitDialogInfo = this.f0.read(p0);
                   break;
                 case 16:
                   uAdData1.mCouponInfo = this.b.read(p0);
                   break;
                 case 17:
                   uAdData1.mIsOrderedApp = KnownTypeAdapters$g.a(p0, uAdData1.mIsOrderedApp);
                   break;
                 case 18:
                   uAdData1.mAdBottomBannerInfo = this.j0.read(p0);
                   break;
                 case 19:
                   uAdData1.mH5Data = TypeAdapters.A.read(p0);
                   break;
                 case 20:
                   uAdData1.mCoverPlayEndInfo = this.h.read(p0);
                   break;
                 case 21:
                   uAdData1.mProfileBottomBannerInfo = this.o.read(p0);
                   break;
                 case 22:
                   uAdData1.mConvertInfo = this.w.read(p0);
                   break;
                 case 23:
                   uAdData1.mInteractionInfo = this.m0.read(p0);
                   break;
                 case 24:
                   uAdData1.mCaptionAdvertisementInfo = this.c.read(p0);
                   break;
                 case 25:
                   uAdData1.mShouldReplaceIpdx = KnownTypeAdapters$g.a(p0, uAdData1.mShouldReplaceIpdx);
                   break;
                 case 26:
                   uAdData1.mTkTemplateInfo = this.x.read(p0);
                   break;
                 case 27:
                   uAdData1.mMarketUri = TypeAdapters.A.read(p0);
                   break;
                 case 28:
                   uAdData1.mCoverMediaInfo = this.e.read(p0);
                   break;
                 case 29:
                   uAdData1.mMixBarInfo = this.s.read(p0);
                   break;
                 case 30:
                   uAdData1.mAdSurveyInfo = this.t.read(p0);
                   break;
                 case 31:
                   uAdData1.mLiveStreamId = TypeAdapters.A.read(p0);
                   break;
                 case 32:
                   uAdData1.mSideWindowInfo = this.x0.read(p0);
                   break;
                 case '!':
                   uAdData1.mRerankInfo = this.K.read(p0);
                   break;
                 case '"':
                   uAdData1.mLandingPageInfo = this.j.read(p0);
                   break;
                 case '#':
                   uAdData1.mBrokenFrameInfo = this.v0.read(p0);
                   break;
                 case '$':
                   uAdData1.mWidgetInfo = this.l0.read(p0);
                   break;
                 case '%':
                   uAdData1.mTryGameInfo = this.D.read(p0);
                   break;
                 case '&':
                   uAdData1.mInstreamAdBarInfo = this.m.read(p0);
                   break;
                 case 39:
                   uAdData1.mPutType = KnownTypeAdapters$k.a(p0, uAdData1.mPutType);
                   break;
                 case '(':
                   uAdData1.mTkTemplateData = this.X.read(p0);
                   break;
                 case ')':
                   uAdData1.mDeepLinkFinishWebView = KnownTypeAdapters$g.a(p0, uAdData1.mDeepLinkFinishWebView);
                   break;
                 case '*':
                   uAdData1.mFakeCommentInfo = this.u.read(p0);
                   break;
                 case '+':
                   uAdData1.mIpAddress = TypeAdapters.A.read(p0);
                   break;
                 case ',':
                   uAdData1.mPlayedReportRate = this.G.read(p0);
                   break;
                 case '-':
                   uAdData1.mPlayedReportTime = this.F.read(p0);
                   break;
                 case '.':
                   uAdData1.mH5Url = TypeAdapters.A.read(p0);
                   break;
                 case '/':
                   uAdData1.mPosId = KnownTypeAdapters$n.a(p0, uAdData1.mPosId);
                   break;
                 case '0':
                   uAdData1.mForbidAutoOpenApp = KnownTypeAdapters$g.a(p0, uAdData1.mForbidAutoOpenApp);
                   break;
                 case '1':
                   uAdData1.mAnimationVideoInfo = this.w0.read(p0);
                   break;
                 case '2':
                   uAdData1.mCoronaBrandInfo = this.Q.read(p0);
                   break;
                 case '3':
                   uAdData1.mAdBridgeInfo = this.V.read(p0);
                   break;
                 case '4':
                   uAdData1.mItemClickItemList = this.b0.read(p0);
                   break;
                 case '5':
                   uAdData1.mItemClickUrls = this.Z.read(p0);
                   break;
                 case '6':
                   uAdData1.mNewUserAgentStyle = KnownTypeAdapters$k.a(p0, uAdData1.mNewUserAgentStyle);
                   break;
                 case '7':
                   uAdData1.mVideoQUalityInfoList = this.B.read(p0);
                   break;
                 case '8':
                   uAdData1.mRateInfo = this.O.read(p0);
                   break;
                 case '9':
                   uAdData1.mAppDetailInfo = this.T.read(p0);
                   break;
                 case ':':
                   uAdData1.mLiveAdRerankContext = this.N.read(p0);
                   break;
                 case ';':
                   uAdData1.mAdWebCardInfo = this.y.read(p0);
                   break;
                 case '<':
                   uAdData1.mShowLiveIcon = KnownTypeAdapters$g.a(p0, uAdData1.mShowLiveIcon);
                   break;
                 case '=':
                   uAdData1.mPlayPauseInfo = this.g.read(p0);
                   break;
                 case '>':
                   uAdData1.mPlayedTotalReportTime = this.F.read(p0);
                   break;
                 case '?':
                   uAdData1.mVideoClipInfo = this.n0.read(p0);
                   break;
                 case '@':
                   uAdData1.mNegativeMenuInfo = this.S.read(p0);
                   break;
                 case 'A':
                   uAdData1.mAppLinkToastInfo = this.u0.read(p0);
                   break;
                 case 'B':
                   uAdData1.mCommentActionBarInfo = this.R.read(p0);
                   break;
                 case 'C':
                   uAdData1.mLiveRouterScheme = TypeAdapters.A.read(p0);
                   break;
                 case 'D':
                   uAdData1.mAdCoverPageButtonControl = KnownTypeAdapters$k.a(p0, uAdData1.mAdCoverPageButtonControl);
                   break;
                 case 'E':
                   uAdData1.mActionbarInfo = this.k.read(p0);
                   break;
                 case 'F':
                   uAdData1.mEnableVpnInterception = KnownTypeAdapters$k.a(p0, uAdData1.mEnableVpnInterception);
                   break;
                 case 'G':
                   uAdData1.mSplashInfo = this.v.read(p0);
                   break;
                 case 'H':
                   uAdData1.mAppScore = KnownTypeAdapters$j.a(p0, uAdData1.mAppScore);
                   break;
                 case 'I':
                   uAdData1.mHalfLandingPageInfo = this.k0.read(p0);
                   break;
                 case 'J':
                   uAdData1.mJointInstreamAdBarInfo = this.n.read(p0);
                   break;
                 case 'K':
                   uAdData1.mInspireAdInfo = this.J.read(p0);
                   break;
                 case 'L':
                   uAdData1.mAdWeakData = this.H.read(p0);
                   break;
                 case 'M':
                   uAdData1.mEnableAppDownloadPause = KnownTypeAdapters$g.a(p0, uAdData1.mEnableAppDownloadPause);
                   break;
                 case 'N':
                   uAdData1.mPrivacyOption = this.U.read(p0);
                   break;
                 case 'O':
                   uAdData1.mAdPageButtonControl = KnownTypeAdapters$k.a(p0, uAdData1.mAdPageButtonControl);
                   break;
                 case 'P':
                   uAdData1.mDisplayInTopPageNum = KnownTypeAdapters$k.a(p0, uAdData1.mDisplayInTopPageNum);
                   break;
                 case 'Q':
                   uAdData1.mExtraDisplayInfo = this.E.read(p0);
                   break;
                 case 'R':
                   uAdData1.mMerchandiseInfo = this.z.read(p0);
                   break;
                 case 'S':
                   uAdData1.mSearchBrandInfo = this.e0.read(p0);
                   break;
                 case 'T':
                   uAdData1.mPopPlayInfo = this.h0.read(p0);
                   break;
                 case 'U':
                   uAdData1.mAdExposedInfo = TypeAdapters.A.read(p0);
                   break;
                 case 'V':
                   uAdData1.mIsNegativeFilter = KnownTypeAdapters$g.a(p0, uAdData1.mIsNegativeFilter);
                   break;
                 case 'W':
                   uAdData1.mEnableLeftSlideOpenLive = KnownTypeAdapters$g.a(p0, uAdData1.mEnableLeftSlideOpenLive);
                   break;
                 case 'X':
                   uAdData1.mRequestEApiInfo = this.i.read(p0);
                   break;
                 case 'Y':
                   uAdData1.mHalfPageBannerInfo = this.q.read(p0);
                   break;
                 case 'Z':
                   uAdData1.mUseTrackType = KnownTypeAdapters$k.a(p0, uAdData1.mUseTrackType);
                   break;
                 case '[':
                   uAdData1.mTopActionbarInfo = this.l.read(p0);
                   break;
                 case 92:
                   uAdData1.mCoverActionbarInfo = this.r.read(p0);
                   break;
                 case ']':
                   uAdData1.mAdApkMd5Info = this.P.read(p0);
                   break;
                 case '^':
                   uAdData1.mDanmakuInfo = this.o0.read(p0);
                   break;
                 case '_':
                   uAdData1.mTopTagInfo = this.s0.read(p0);
                   break;
                 case '`':
                   uAdData1.mJumpLiveInfo = this.d0.read(p0);
                   break;
                 case 'a':
                   uAdData1.mH5ControlInfo = this.I.read(p0);
                   break;
                 case 'b':
                   uAdData1.mAdCacheInfo = this.L.read(p0);
                   break;
                 case 'c':
                   uAdData1.mCommentEmojiInfo = this.c0.read(p0);
                   break;
                 case 'd':
                   uAdData1.mPlayEndInfo = this.f.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uAdData1;
       }
    }
    public void b(b p0,PhotoAdvertisement$AdData p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$AdData$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mIpAddress != null) {
             p0.r("ip");
             TypeAdapters.A.write(p0, p1.mIpAddress);
          }
          if (p1.mCouponInfo != null) {
             p0.r("adCouponInfo");
             this.b.write(p0, p1.mCouponInfo);
          }
          p0.r("forbidAutoOpenApp");
          p0.P(p1.mForbidAutoOpenApp);
          p0.r("appScore");
          p0.J((double)p1.mAppScore);
          p0.r("showLiveIcon");
          p0.P(p1.mShowLiveIcon);
          if (p1.mCaptionAdvertisementInfo != null) {
             p0.r("captionAdvertisementInfo");
             this.c.write(p0, p1.mCaptionAdvertisementInfo);
          }
          if (p1.mCoverStickerInfo != null) {
             p0.r("coverStickerInfo");
             this.d.write(p0, p1.mCoverStickerInfo);
          }
          p0.r("newUserAgentStyle");
          p0.K((long)p1.mNewUserAgentStyle);
          if (p1.mCoverMediaInfo != null) {
             p0.r("coverMediaInfo");
             this.e.write(p0, p1.mCoverMediaInfo);
          }
          if (p1.mPlayEndInfo != null) {
             p0.r("playEndInfo");
             this.f.write(p0, p1.mPlayEndInfo);
          }
          if (p1.mPlayPauseInfo != null) {
             p0.r("playPauseInfo");
             this.g.write(p0, p1.mPlayPauseInfo);
          }
          if (p1.mCoverPlayEndInfo != null) {
             p0.r("coverPlayEndInfo");
             this.h.write(p0, p1.mCoverPlayEndInfo);
          }
          if (p1.mRequestEApiInfo != null) {
             p0.r("requestEapiInfo");
             this.i.write(p0, p1.mRequestEApiInfo);
          }
          p0.r("useTrackType");
          p0.K((long)p1.mUseTrackType);
          p0.r("isReplaceIpdx");
          p0.P(p1.mShouldReplaceIpdx);
          if (p1.mLandingPageInfo != null) {
             p0.r("landingPageInfo");
             this.j.write(p0, p1.mLandingPageInfo);
          }
          p0.r("adPageButtonControl");
          p0.K((long)p1.mAdPageButtonControl);
          p0.r("adCoverPageButtonControl");
          p0.K((long)p1.mAdCoverPageButtonControl);
          p0.r("enableLeftSlideOpenLive");
          p0.P(p1.mEnableLeftSlideOpenLive);
          if (p1.mActionbarInfo != null) {
             p0.r("actionBarInfo");
             this.k.write(p0, p1.mActionbarInfo);
          }
          if (p1.mTopActionbarInfo != null) {
             p0.r("topActionBarInfo");
             this.l.write(p0, p1.mTopActionbarInfo);
          }
          if (p1.mInstreamAdBarInfo != null) {
             p0.r("instreamBarInfo");
             this.m.write(p0, p1.mInstreamAdBarInfo);
          }
          if (p1.mJointInstreamAdBarInfo != null) {
             p0.r("jointInstreamBarInfo");
             this.n.write(p0, p1.mJointInstreamAdBarInfo);
          }
          if (p1.mProfileBottomBannerInfo != null) {
             p0.r("profileBottomBannerInfo");
             this.o.write(p0, p1.mProfileBottomBannerInfo);
          }
          if (p1.mNovelBannerInfo != null) {
             p0.r("novelBannerInfo");
             this.p.write(p0, p1.mNovelBannerInfo);
          }
          if (p1.mHalfPageBannerInfo != null) {
             p0.r("halfPageBannerInfo");
             this.q.write(p0, p1.mHalfPageBannerInfo);
          }
          if (p1.mCoverActionbarInfo != null) {
             p0.r("coverActionBarInfo");
             this.r.write(p0, p1.mCoverActionbarInfo);
          }
          if (p1.mMixBarInfo != null) {
             p0.r("mixBarInfo");
             this.s.write(p0, p1.mMixBarInfo);
          }
          if (p1.mAdSurveyInfo != null) {
             p0.r("surveyInfo");
             this.t.write(p0, p1.mAdSurveyInfo);
          }
          if (p1.mFakeCommentInfo != null) {
             p0.r("fakeCommentInfo");
             this.u.write(p0, p1.mFakeCommentInfo);
          }
          if (p1.mAdExposedInfo != null) {
             p0.r("adExposedInfo");
             TypeAdapters.A.write(p0, p1.mAdExposedInfo);
          }
          if (p1.mSplashInfo != null) {
             p0.r("splashInfo");
             this.v.write(p0, p1.mSplashInfo);
          }
          p0.r("deepLinkFinishWebView");
          p0.P(p1.mDeepLinkFinishWebView);
          if (p1.mConvertInfo != null) {
             p0.r("convertInfo");
             this.w.write(p0, p1.mConvertInfo);
          }
          if (p1.mTkTemplateInfo != null) {
             p0.r("templateInfo");
             this.x.write(p0, p1.mTkTemplateInfo);
          }
          if (p1.mAdWebCardInfo != null) {
             p0.r("adWebCardInfo");
             this.y.write(p0, p1.mAdWebCardInfo);
          }
          if (p1.mMerchandiseInfo != null) {
             p0.r("merchandiseInfo");
             this.z.write(p0, p1.mMerchandiseInfo);
          }
          if (p1.mMarketUri != null) {
             p0.r("marketUri");
             TypeAdapters.A.write(p0, p1.mMarketUri);
          }
          if (p1.mVideoQUalityInfoList != null) {
             p0.r("videoQualityPanels");
             this.B.write(p0, p1.mVideoQUalityInfoList);
          }
          if (p1.mPendantInfo != null) {
             p0.r("pendantInfo");
             this.C.write(p0, p1.mPendantInfo);
          }
          if (p1.mTryGameInfo != null) {
             p0.r("tryGameInfo");
             this.D.write(p0, p1.mTryGameInfo);
          }
          if (p1.mExtraDisplayInfo != null) {
             p0.r("extraDisplayInfo");
             this.E.write(p0, p1.mExtraDisplayInfo);
          }
          if (p1.mPlayedReportTime != null) {
             p0.r("playedReportTime");
             this.F.write(p0, p1.mPlayedReportTime);
          }
          if (p1.mPlayedTotalReportTime != null) {
             p0.r("playedTotalReportTime");
             this.F.write(p0, p1.mPlayedTotalReportTime);
          }
          if (p1.mPlayedReportRate != null) {
             p0.r("playedReportRate");
             this.G.write(p0, p1.mPlayedReportRate);
          }
          p0.r("webviewType");
          p0.K((long)p1.mWebViewType);
          if (p1.mAdWeakData != null) {
             p0.r("adWeakData");
             this.H.write(p0, p1.mAdWeakData);
          }
          if (p1.mH5ControlInfo != null) {
             p0.r("h5ControlInfo");
             this.I.write(p0, p1.mH5ControlInfo);
          }
          if (p1.mH5Data != null) {
             p0.r("h5Data");
             TypeAdapters.A.write(p0, p1.mH5Data);
          }
          if (p1.mInspireAdInfo != null) {
             p0.r("inspireAdInfo");
             this.J.write(p0, p1.mInspireAdInfo);
          }
          if (p1.mRerankInfo != null) {
             p0.r("adRerankInfo");
             this.K.write(p0, p1.mRerankInfo);
          }
          if (p1.mAdCacheInfo != null) {
             p0.r("adCacheStrategyInfo");
             this.L.write(p0, p1.mAdCacheInfo);
          }
          if (p1.mLiveAdRerankContext != null) {
             p0.r("liveRerankContext");
             this.N.write(p0, p1.mLiveAdRerankContext);
          }
          if (p1.mRateInfo != null) {
             p0.r("rateInfo");
             this.O.write(p0, p1.mRateInfo);
          }
          p0.r("isNegetiveFilter");
          p0.P(p1.mIsNegativeFilter);
          if (p1.mAdApkMd5Info != null) {
             p0.r("apkMd5Info");
             this.P.write(p0, p1.mAdApkMd5Info);
          }
          if (p1.mCoronaBrandInfo != null) {
             p0.r("coronaBrandInfo");
             this.Q.write(p0, p1.mCoronaBrandInfo);
          }
          if (p1.mCommentActionBarInfo != null) {
             p0.r("commentActionBarInfo");
             this.R.write(p0, p1.mCommentActionBarInfo);
          }
          if (p1.mNegativeMenuInfo != null) {
             p0.r("negativeMenuInfo");
             this.S.write(p0, p1.mNegativeMenuInfo);
          }
          if (p1.mAppDetailInfo != null) {
             p0.r("appDetailInfo");
             this.T.write(p0, p1.mAppDetailInfo);
          }
          if (p1.mH5Url != null) {
             p0.r("h5Url");
             TypeAdapters.A.write(p0, p1.mH5Url);
          }
          p0.r("enableAppDownloadPause");
          p0.P(p1.mEnableAppDownloadPause);
          p0.r("displayInTopPageNum");
          p0.K((long)p1.mDisplayInTopPageNum);
          p0.r("isOrderedApp");
          p0.P(p1.mIsOrderedApp);
          if (p1.mPrivacyOption != null) {
             p0.r("privacyOption");
             this.U.write(p0, p1.mPrivacyOption);
          }
          if (p1.mAdBridgeInfo != null) {
             p0.r("adBridgeInfo");
             this.V.write(p0, p1.mAdBridgeInfo);
          }
          p0.r("antiVendorVari");
          p0.K((long)p1.mEnableVpnInterception);
          if (p1.mTkTemplateData != null) {
             p0.r("templateDatas");
             this.X.write(p0, p1.mTkTemplateData);
          }
          if (p1.mAdCardTemplateInfo != null) {
             p0.r("adCardTemplateInfo");
             this.Y.write(p0, p1.mAdCardTemplateInfo);
          }
          if (p1.mItemClickUrls != null) {
             p0.r("itemClickUrls");
             this.Z.write(p0, p1.mItemClickUrls);
          }
          if (p1.mItemClickItemList != null) {
             p0.r("itemClickList");
             this.b0.write(p0, p1.mItemClickItemList);
          }
          p0.r("posId");
          p0.K(p1.mPosId);
          if (p1.mCommentEmojiInfo != null) {
             p0.r("commentEmojiInfo");
             this.c0.write(p0, p1.mCommentEmojiInfo);
          }
          if (p1.mJumpLiveInfo != null) {
             p0.r("jumpLiveInfo");
             this.d0.write(p0, p1.mJumpLiveInfo);
          }
          if (p1.mSearchBrandInfo != null) {
             p0.r("searchBrandInfo");
             this.e0.write(p0, p1.mSearchBrandInfo);
          }
          if (p1.mLiveStreamId != null) {
             p0.r("liveStreamId");
             TypeAdapters.A.write(p0, p1.mLiveStreamId);
          }
          p0.r("putType");
          p0.K((long)p1.mPutType);
          p0.r("disableDSPSoftErrorMonitor");
          p0.P(p1.mDisableDSPSoftErrorMonitor);
          if (p1.mExitDialogInfo != null) {
             p0.r("exitDialogInfo");
             this.f0.write(p0, p1.mExitDialogInfo);
          }
          if (p1.mShareInfo != null) {
             p0.r("shareInfo");
             this.g0.write(p0, p1.mShareInfo);
          }
          if (p1.mPopPlayInfo != null) {
             p0.r("popPlayInfo");
             this.h0.write(p0, p1.mPopPlayInfo);
          }
          if (p1.mPopARInfo != null) {
             p0.r("popARInfo");
             this.i0.write(p0, p1.mPopARInfo);
          }
          if (p1.mAdBottomBannerInfo != null) {
             p0.r("bottomBannerInfo");
             this.j0.write(p0, p1.mAdBottomBannerInfo);
          }
          if (p1.mHalfLandingPageInfo != null) {
             p0.r("halfLandingPage");
             this.k0.write(p0, p1.mHalfLandingPageInfo);
          }
          if (p1.mWidgetInfo != null) {
             p0.r("widgetInfo");
             this.l0.write(p0, p1.mWidgetInfo);
          }
          if (p1.mInteractionInfo != null) {
             p0.r("interactionInfo");
             this.m0.write(p0, p1.mInteractionInfo);
          }
          if (p1.mVideoClipInfo != null) {
             p0.r("videoClipInfo");
             this.n0.write(p0, p1.mVideoClipInfo);
          }
          if (p1.mDanmakuInfo != null) {
             p0.r("danmakuInfo");
             this.o0.write(p0, p1.mDanmakuInfo);
          }
          if (p1.mSearchBigvLive != null) {
             p0.r("searchBigvLive");
             this.p0.write(p0, p1.mSearchBigvLive);
          }
          if (p1.mTvcInfo != null) {
             p0.r("tVCInfo");
             this.q0.write(p0, p1.mTvcInfo);
          }
          if (p1.mSearchRecommendReason != null) {
             p0.r("searchRecommendReason");
             TypeAdapters.A.write(p0, p1.mSearchRecommendReason);
          }
          if (p1.mSearchExtraInfo != null) {
             p0.r("searchExtraInfo");
             this.r0.write(p0, p1.mSearchExtraInfo);
          }
          if (p1.mLiveRouterScheme != null) {
             p0.r("liveRouterScheme");
             TypeAdapters.A.write(p0, p1.mLiveRouterScheme);
          }
          if (p1.mTopTagInfo != null) {
             p0.r("topTagInfo");
             this.s0.write(p0, p1.mTopTagInfo);
          }
          if (p1.mWebViewNavigationBarInfo != null) {
             p0.r("webViewNavigationBarInfo");
             this.t0.write(p0, p1.mWebViewNavigationBarInfo);
          }
          if (p1.mAppLinkToastInfo != null) {
             p0.r("appLinkToastInfo");
             this.u0.write(p0, p1.mAppLinkToastInfo);
          }
          if (p1.mBrokenFrameInfo != null) {
             p0.r("brokenFrameInfo");
             this.v0.write(p0, p1.mBrokenFrameInfo);
          }
          if (p1.mAnimationVideoInfo != null) {
             p0.r("animationVideoInfo");
             this.w0.write(p0, p1.mAnimationVideoInfo);
          }
          if (p1.mSideWindowInfo != null) {
             p0.r("smallWindowInfo");
             this.x0.write(p0, p1.mSideWindowInfo);
          }
          if (p1.mSearchSuspendedBallInfo != null) {
             p0.r("searchSuspendedBallInfo");
             this.y0.write(p0, p1.mSearchSuspendedBallInfo);
          }
          if (p1.mCommentTopBarInfo != null) {
             p0.r("commentTopBarInfo");
             this.z0.write(p0, p1.mCommentTopBarInfo);
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
