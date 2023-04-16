package com.kuaishou.android.model.ads.SplashInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.FallingEggsInfo;
import com.yxcorp.gifshow.commercial.model.SplashBaseInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$SplashLableInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$SplashLogoInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$SplashSkipInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$ClickButtonInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$SplashActionBarInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$SplashPreloadInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$SplashPlayableInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$InteractionInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$FloatingCardInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$ShadowInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$AnimationInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$SplashLocalRecordInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$BubbleInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.ads.SplashInfo$SplashSkipInfo;
import com.kuaishou.android.model.ads.SplashInfo$AnimationInfo;
import com.kuaishou.android.model.ads.SplashInfo$SplashLogoInfo;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kuaishou.android.model.ads.SplashInfo$SplashLocalRecordInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl;
import com.kuaishou.android.model.ads.SplashInfo$FloatingCardInfo;
import com.kuaishou.android.model.ads.SplashInfo$SplashActionBarInfo;
import com.kuaishou.android.model.ads.SplashInfo$SplashPlayableInfo;
import com.kuaishou.android.model.ads.SplashInfo$SplashLableInfo;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.ads.SplashInfo$BubbleInfo;
import com.kuaishou.android.model.ads.SplashInfo$SplashPreloadInfo;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$TypeAdapter$b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.kuaishou.android.model.ads.SplashInfo$ShadowInfo;
import com.kuaishou.android.model.ads.SplashInfo$InteractionInfo;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.kuaishou.android.model.ads.SplashInfo$ClickButtonInfo;
import com.yxcorp.gifshow.commercial.model.SplashBaseInfo;
import com.google.gson.stream.b;
import com.kuaishou.android.model.ads.SplashInfo$TypeAdapter$a;

public final class SplashInfo$TypeAdapter extends TypeAdapter	// class@000ac3
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public final TypeAdapter f;
    public final TypeAdapter g;
    public final TypeAdapter h;
    public final TypeAdapter i;
    public final TypeAdapter j;
    public final TypeAdapter k;
    public final TypeAdapter l;
    public final TypeAdapter m;
    public final TypeAdapter n;
    public final TypeAdapter o;
    public final TypeAdapter p;
    public final TypeAdapter q;
    public static final a r;

    static {
       SplashInfo$TypeAdapter.r = a.get(SplashInfo.class);
    }
    public void SplashInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(SplashBaseInfo$TypeAdapter.b);
       this.c = p0.j(SplashInfo$SplashLableInfo$TypeAdapter.b);
       this.d = p0.j(SplashInfo$SplashLogoInfo$TypeAdapter.b);
       this.e = p0.j(SplashInfo$SplashSkipInfo$TypeAdapter.b);
       this.f = p0.j(SplashInfo$ClickButtonInfo$TypeAdapter.b);
       this.g = p0.j(SplashInfo$SplashActionBarInfo$TypeAdapter.b);
       this.h = p0.j(SplashInfo$SplashPreloadInfo$TypeAdapter.b);
       this.i = p0.j(SplashInfo$SplashPlayableInfo$TypeAdapter.d);
       this.j = p0.j(SplashInfo$InteractionInfo$TypeAdapter.e);
       this.k = p0.j(SplashInfo$FloatingCardInfo$TypeAdapter.c);
       this.l = p0.j(SplashInfo$ShadowInfo$TypeAdapter.b);
       this.m = p0.j(SplashInfo$AnimationInfo$TypeAdapter.b);
       this.n = p0.j(a.get(FallingEggsInfo.class));
       this.o = p0.j(PhotoAdvertisement$ItemClickUrl$TypeAdapter.d);
       this.p = p0.j(SplashInfo$SplashLocalRecordInfo$TypeAdapter.b);
       this.q = p0.j(SplashInfo$BubbleInfo$TypeAdapter.b);
    }
    public SplashInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SplashInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       SplashInfo splashInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return splashInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return splashInfo;
       }else {
          p0.c();
          SplashInfo splashInfo1 = new SplashInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x8ca4292e:
                   if (str.equals("materialHeight")) {
                      i = 0;
                   }
                   break;
                 case 0x995f0f1f:
                   if (str.equals("baseInfo")) {
                      i = 1;
                   }
                   break;
                 case 0x9b0c22da:
                   if (str.equals("forceDownloadMaterial")) {
                      i = 2;
                   }
                   break;
                 case 0x9e9e6ea8:
                   if (str.equals("clickButtonInfo")) {
                      i = 3;
                   }
                   break;
                 case 0x9fc8b184:
                   if (str.equals("splashAdFeedActionBarContent")) {
                      i = 4;
                   }
                   break;
                 case 0xb018cd60:
                   if (str.equals("previewEndTime")) {
                      i = 5;
                   }
                   break;
                 case 0xb1db48e9:
                   if (str.equals("previewMaterialType")) {
                      i = 6;
                   }
                   break;
                 case 0xb8ce86ca:
                   if (str.equals("enablePhotoBackupImage")) {
                      i = 7;
                   }
                   break;
                 case 0xbb0bf8df:
                   if (str.equals("materialWidth")) {
                      i = 8;
                   }
                   break;
                 case 0xbb7a8e17:
                   if (str.equals("forceDisplayNormalSplashForEyemax")) {
                      i = 9;
                   }
                   break;
                 case 0xbdf15c9e:
                   if (str.equals("splashAdDuration")) {
                      i = 10;
                   }
                   break;
                 case 0xc0f44de0:
                   if (str.equals("interactionInfo")) {
                      i = 11;
                   }
                   break;
                 case 0xc325c1ee:
                   if (str.equals("shadowInfo")) {
                      i = 12;
                   }
                   break;
                 case 0xcba8e0df:
                   if (str.equals("imageUrls")) {
                      i = 13;
                   }
                   break;
                 case 0xcc31d8b9:
                   if (str.equals("realtimeInfo")) {
                      i = 14;
                   }
                   break;
                 case 0xd66544aa:
                   if (str.equals("audioButtonVisible")) {
                      i = 15;
                   }
                   break;
                 case 0xd9bf1a57:
                   if (str.equals("preloadInfo")) {
                      i = 16;
                   }
                   break;
                 case 0xe28e56e6:
                   if (str.equals("isFakeSplash")) {
                      i = 17;
                   }
                   break;
                 case 0xf0205283:
                   if (str.equals("fallingEggsInfo")) {
                      i = 18;
                   }
                   break;
                 case 0xf4cf4315:
                   if (str.equals("splashShowControlV2")) {
                      i = 19;
                   }
                   break;
                 case 0xfc0d42ab:
                   if (str.equals("enableStayWhenVideoPlayFinished")) {
                      i = 20;
                   }
                   break;
                 case 0x9b7675a:
                   if (str.equals("bubbleInfo")) {
                      i = 21;
                   }
                   break;
                 case 0xa486525:
                   if (str.equals("splashTouchControl")) {
                      i = 22;
                   }
                   break;
                 case 0x1df07497:
                   if (str.equals("clearMaterialWhenImpression")) {
                      i = 23;
                   }
                   break;
                 case 0x2a8bc8df:
                   if (str.equals("adLabelInfo")) {
                      i = 24;
                   }
                   break;
                 case 0x2cd2485c:
                   if (str.equals("playableInfo")) {
                      i = 25;
                   }
                   break;
                 case 0x3077951f:
                   if (str.equals("splashInformationType")) {
                      i = 26;
                   }
                   break;
                 case 0x3ed0e44b:
                   if (str.equals("actionBarInfo")) {
                      i = 27;
                   }
                   break;
                 case 0x483a5204:
                   if (str.equals("floatingCardInfo")) {
                      i = 28;
                   }
                   break;
                 case 0x49b8b819:
                   if (str.equals("splashAdDisplayStyle")) {
                      i = 29;
                   }
                   break;
                 case 0x4a1f741c:
                   if (str.equals("splashClickUrlInfo")) {
                      i = 30;
                   }
                   break;
                 case 0x5de112fe:
                   if (str.equals("preloadDurMs")) {
                      i = 31;
                   }
                   break;
                 case 0x5f7a1489:
                   if (str.equals("localRecordedInfo")) {
                      i = 32;
                   }
                   break;
                 case 0x6c00f70b:
                   if (str.equals("splashAdMaterialType")) {
                      i = 33;
                   }
                   break;
                 case 0x7208b344:
                   if (str.equals("splashAdType")) {
                      i = 34;
                   }
                   break;
                 case 0x78d4d0f9:
                   if (str.equals("logoInfo")) {
                      i = 35;
                   }
                   break;
                 case 0x790c9252:
                   if (str.equals("animationInfo")) {
                      i = 36;
                   }
                   break;
                 case 0x7fdbe6cd:
                   if (str.equals("skipInfo")) {
                      i = 37;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   splashInfo1.mMaterialHeight = KnownTypeAdapters$k.a(p0, splashInfo1.mMaterialHeight);
                   break;
                 case 1:
                   splashInfo1.mSplashBaseInfo = this.b.read(p0);
                   break;
                 case 2:
                   splashInfo1.mForceDownloadMaterial = KnownTypeAdapters$g.a(p0, splashInfo1.mForceDownloadMaterial);
                   break;
                 case 3:
                   splashInfo1.mClickButtonInfo = this.f.read(p0);
                   break;
                 case 4:
                   splashInfo1.mSplashAdFeedActionBarContent = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   splashInfo1.mPreviewEndTime = KnownTypeAdapters$n.a(p0, splashInfo1.mPreviewEndTime);
                   break;
                 case 6:
                   splashInfo1.mPreviewMaterialType = KnownTypeAdapters$k.a(p0, splashInfo1.mPreviewMaterialType);
                   break;
                 case 7:
                   splashInfo1.mEnablePhotoBackupImage = KnownTypeAdapters$g.a(p0, splashInfo1.mEnablePhotoBackupImage);
                   break;
                 case 8:
                   splashInfo1.mMaterialWidth = KnownTypeAdapters$k.a(p0, splashInfo1.mMaterialWidth);
                   break;
                 case 9:
                   splashInfo1.mforceDisplayNormalSplashForEyemax = KnownTypeAdapters$g.a(p0, splashInfo1.mforceDisplayNormalSplashForEyemax);
                   break;
                 case 10:
                   splashInfo1.mSplashAdDuration = KnownTypeAdapters$k.a(p0, splashInfo1.mSplashAdDuration);
                   break;
                 case 11:
                   splashInfo1.mInteractionInfo = this.j.read(p0);
                   break;
                 case 12:
                   splashInfo1.mShadowInfo = this.l.read(p0);
                   break;
                 case 13:
                   splashInfo1.mImageUrls = new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new SplashInfo$TypeAdapter$b(this)).a(p0);
                   break;
                 case 14:
                   splashInfo1.mRealtimeInfo = TypeAdapters.A.read(p0);
                   break;
                 case 15:
                   splashInfo1.mAudioButtonVisible = KnownTypeAdapters$g.a(p0, splashInfo1.mAudioButtonVisible);
                   break;
                 case 16:
                   splashInfo1.mPreloadInfo = this.h.read(p0);
                   break;
                 case 17:
                   splashInfo1.mIsFakeSplash = KnownTypeAdapters$g.a(p0, splashInfo1.mIsFakeSplash);
                   break;
                 case 18:
                   splashInfo1.mFallingEggsInfo = this.n.read(p0);
                   break;
                 case 19:
                   splashInfo1.mSplashShowControl = KnownTypeAdapters$k.a(p0, splashInfo1.mSplashShowControl);
                   break;
                 case 20:
                   splashInfo1.mEnableStayWhenVideoFinish = KnownTypeAdapters$g.a(p0, splashInfo1.mEnableStayWhenVideoFinish);
                   break;
                 case 21:
                   splashInfo1.mBubbleInfo = this.q.read(p0);
                   break;
                 case 22:
                   splashInfo1.mSplashTouchControl = TypeAdapters.A.read(p0);
                   break;
                 case 23:
                   splashInfo1.mClearMaterialAfterImpression = KnownTypeAdapters$g.a(p0, splashInfo1.mClearMaterialAfterImpression);
                   break;
                 case 24:
                   splashInfo1.mLabelInfo = this.c.read(p0);
                   break;
                 case 25:
                   splashInfo1.mPlayableInfo = this.i.read(p0);
                   break;
                 case 26:
                   splashInfo1.mSplashInformationType = KnownTypeAdapters$k.a(p0, splashInfo1.mSplashInformationType);
                   break;
                 case 27:
                   splashInfo1.mActionBarInfo = this.g.read(p0);
                   break;
                 case 28:
                   splashInfo1.mFloatingCardInfo = this.k.read(p0);
                   break;
                 case 29:
                   splashInfo1.mSplashAdDisplayStyle = KnownTypeAdapters$k.a(p0, splashInfo1.mSplashAdDisplayStyle);
                   break;
                 case 30:
                   splashInfo1.mSplashClickUrlInfo = this.o.read(p0);
                   break;
                 case 31:
                   splashInfo1.mPreloadDurMs = KnownTypeAdapters$k.a(p0, splashInfo1.mPreloadDurMs);
                   break;
                 case 32:
                   splashInfo1.mLocalRecordedInfo = this.p.read(p0);
                   break;
                 case '!':
                   splashInfo1.mSplashAdMaterialType = KnownTypeAdapters$k.a(p0, splashInfo1.mSplashAdMaterialType);
                   break;
                 case '"':
                   splashInfo1.mSplashAdType = KnownTypeAdapters$k.a(p0, splashInfo1.mSplashAdType);
                   break;
                 case '#':
                   splashInfo1.mSplashLogoInfo = this.d.read(p0);
                   break;
                 case '$':
                   splashInfo1.mAnimationInfo = this.m.read(p0);
                   break;
                 case '%':
                   splashInfo1.mSkipInfo = this.e.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return splashInfo1;
       }
    }
    public void b(b p0,SplashInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SplashInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mSplashBaseInfo != null) {
             p0.r("baseInfo");
             this.b.write(p0, p1.mSplashBaseInfo);
          }
          if (p1.mImageUrls != null) {
             p0.r("imageUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new SplashInfo$TypeAdapter$a(this)).b(p0, p1.mImageUrls);
          }
          p0.r("splashAdMaterialType");
          p0.K((long)p1.mSplashAdMaterialType);
          if (p1.mSplashAdFeedActionBarContent != null) {
             p0.r("splashAdFeedActionBarContent");
             TypeAdapters.A.write(p0, p1.mSplashAdFeedActionBarContent);
          }
          p0.r("splashAdDuration");
          p0.K((long)p1.mSplashAdDuration);
          if (p1.mLabelInfo != null) {
             p0.r("adLabelInfo");
             this.c.write(p0, p1.mLabelInfo);
          }
          if (p1.mSplashLogoInfo != null) {
             p0.r("logoInfo");
             this.d.write(p0, p1.mSplashLogoInfo);
          }
          if (p1.mSkipInfo != null) {
             p0.r("skipInfo");
             this.e.write(p0, p1.mSkipInfo);
          }
          if (p1.mClickButtonInfo != null) {
             p0.r("clickButtonInfo");
             this.f.write(p0, p1.mClickButtonInfo);
          }
          if (p1.mActionBarInfo != null) {
             p0.r("actionBarInfo");
             this.g.write(p0, p1.mActionBarInfo);
          }
          if (p1.mPreloadInfo != null) {
             p0.r("preloadInfo");
             this.h.write(p0, p1.mPreloadInfo);
          }
          p0.r("materialWidth");
          p0.K((long)p1.mMaterialWidth);
          p0.r("materialHeight");
          p0.K((long)p1.mMaterialHeight);
          p0.r("splashAdType");
          p0.K((long)p1.mSplashAdType);
          if (p1.mRealtimeInfo != null) {
             p0.r("realtimeInfo");
             TypeAdapters.A.write(p0, p1.mRealtimeInfo);
          }
          if (p1.mSplashTouchControl != null) {
             p0.r("splashTouchControl");
             TypeAdapters.A.write(p0, p1.mSplashTouchControl);
          }
          p0.r("audioButtonVisible");
          p0.P(p1.mAudioButtonVisible);
          p0.r("isFakeSplash");
          p0.P(p1.mIsFakeSplash);
          p0.r("splashShowControlV2");
          p0.K((long)p1.mSplashShowControl);
          p0.r("splashAdDisplayStyle");
          p0.K((long)p1.mSplashAdDisplayStyle);
          p0.r("enablePhotoBackupImage");
          p0.P(p1.mEnablePhotoBackupImage);
          p0.r("enableStayWhenVideoPlayFinished");
          p0.P(p1.mEnableStayWhenVideoFinish);
          p0.r("forceDownloadMaterial");
          p0.P(p1.mForceDownloadMaterial);
          p0.r("forceDisplayNormalSplashForEyemax");
          p0.P(p1.mforceDisplayNormalSplashForEyemax);
          if (p1.mPlayableInfo != null) {
             p0.r("playableInfo");
             this.i.write(p0, p1.mPlayableInfo);
          }
          p0.r("clearMaterialWhenImpression");
          p0.P(p1.mClearMaterialAfterImpression);
          p0.r("splashInformationType");
          p0.K((long)p1.mSplashInformationType);
          if (p1.mInteractionInfo != null) {
             p0.r("interactionInfo");
             this.j.write(p0, p1.mInteractionInfo);
          }
          if (p1.mFloatingCardInfo != null) {
             p0.r("floatingCardInfo");
             this.k.write(p0, p1.mFloatingCardInfo);
          }
          if (p1.mShadowInfo != null) {
             p0.r("shadowInfo");
             this.l.write(p0, p1.mShadowInfo);
          }
          if (p1.mAnimationInfo != null) {
             p0.r("animationInfo");
             this.m.write(p0, p1.mAnimationInfo);
          }
          if (p1.mFallingEggsInfo != null) {
             p0.r("fallingEggsInfo");
             this.n.write(p0, p1.mFallingEggsInfo);
          }
          if (p1.mSplashClickUrlInfo != null) {
             p0.r("splashClickUrlInfo");
             this.o.write(p0, p1.mSplashClickUrlInfo);
          }
          p0.r("preloadDurMs");
          p0.K((long)p1.mPreloadDurMs);
          if (p1.mLocalRecordedInfo != null) {
             p0.r("localRecordedInfo");
             this.p.write(p0, p1.mLocalRecordedInfo);
          }
          p0.r("previewMaterialType");
          p0.K((long)p1.mPreviewMaterialType);
          p0.r("previewEndTime");
          p0.K(p1.mPreviewEndTime);
          if (p1.mBubbleInfo != null) {
             p0.r("bubbleInfo");
             this.q.write(p0, p1.mBubbleInfo);
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
