package com.kuaishou.android.model.ads.PhotoAdvertisement$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.merchant.MerchantEnhanceDisplay;
import java.lang.Object;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Track$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$UrlMapping$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$b;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HintMapping$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FansTopFeedFlameType$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FansTopDetailPageFlameType$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdLabelType$TypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PlayEndInfo$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$c;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Styles$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCover$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AutoConversionInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PlayEndInfo;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FansTopFeedFlameType;
import java.lang.Boolean;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$i;
import com.vimeo.stag.KnownTypeAdapters;
import java.lang.Long;
import java.util.HashMap;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Styles;
import java.util.ArrayList;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCover;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FansTopDetailPageFlameType;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdLabelType;
import com.vimeo.stag.KnownTypeAdapters$j;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AutoConversionInfo;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$TypeAdapter extends TypeAdapter	// class@000a53
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
    public final TypeAdapter r;
    public final TypeAdapter s;
    public final TypeAdapter t;
    public final TypeAdapter u;
    public final TypeAdapter v;
    public static final a w;

    static {
       PhotoAdvertisement$TypeAdapter.w = a.get(PhotoAdvertisement.class);
    }
    public void PhotoAdvertisement$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(PhotoAdvertisement$Track$TypeAdapter.b);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.d = p0.j(PhotoAdvertisement$AdGroup$TypeAdapter.a);
       typeAdapter = p0.j(PhotoAdvertisement$UrlMapping$TypeAdapter.b);
       this.e = typeAdapter;
       this.f = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$b());
       typeAdapter = p0.j(PhotoAdvertisement$HintMapping$TypeAdapter.b);
       this.g = typeAdapter;
       this.h = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$b());
       this.i = p0.j(PhotoAdvertisement$FansTopFeedFlameType$TypeAdapter.a);
       this.j = p0.j(PhotoAdvertisement$FansTopDetailPageFlameType$TypeAdapter.a);
       this.k = p0.j(PhotoAdvertisement$AdLabelType$TypeAdapter.a);
       TypeAdapter a = TypeAdapters.A;
       this.l = new KnownTypeAdapters$ListTypeAdapter(a, new KnownTypeAdapters$d());
       this.m = p0.j(a.get(MerchantEnhanceDisplay.class));
       this.n = p0.j(PhotoAdvertisement$FanstopLiveInfo$TypeAdapter.h);
       this.o = p0.j(PhotoAdvertisement$PlayEndInfo$TypeAdapter.b);
       TypeAdapter typeAdapter1 = p0.j(a.get(Object.class));
       this.p = typeAdapter1;
       this.q = new KnownTypeAdapters$MapTypeAdapter(a, typeAdapter1, new KnownTypeAdapters$c());
       this.r = p0.j(PhotoAdvertisement$AdData$TypeAdapter.A0);
       this.s = p0.j(PhotoAdvertisement$Styles$TypeAdapter.d);
       this.t = p0.j(PhotoAdvertisement$AdCover$TypeAdapter.c);
       this.u = p0.j(PhotoAdvertisement$AutoConversionInfo$TypeAdapter.b);
       this.v = new KnownTypeAdapters$MapTypeAdapter(a, TypeAdapters.e, new KnownTypeAdapters$c());
    }
    public PhotoAdvertisement a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement photoAdverti = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return photoAdverti;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return photoAdverti;
       }else {
          p0.c();
          PhotoAdvertisement photoAdverti1 = new PhotoAdvertisement();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x84632e73:
                   if (str.equals("autoConversionInfo")) {
                      i = 0;
                   }
                   break;
                 case 0x8a4c93ea:
                   if (str.equals("captionUrls")) {
                      i = 1;
                   }
                   break;
                 case 0x8ada9a56:
                   if (str.equals("clickInfo")) {
                      i = 2;
                   }
                   break;
                 case 0x8c784184:
                   if (str.equals("liveAdSourceType")) {
                      i = 3;
                   }
                   break;
                 case 0x9430fdfb:
                   if (str.equals("usePriorityCard")) {
                      i = 4;
                   }
                   break;
                 case 0x995f0f1f:
                   if (str.equals("baseInfo")) {
                      i = 5;
                   }
                   break;
                 case 0x9bc4c40e:
                   if (str.equals("actionBarRatio")) {
                      i = 6;
                   }
                   break;
                 case 0x9d05e71d:
                   if (str.equals("labelStyle")) {
                      i = 7;
                   }
                   break;
                 case 0x9e576a0f:
                   if (str.equals("fansTopDetailPageFlameDesc")) {
                      i = 8;
                   }
                   break;
                 case 0x9e5efab8:
                   if (str.equals("fansTopDetailPageFlameType")) {
                      i = 9;
                   }
                   break;
                 case 0xa33b375e:
                   if (str.equals("supConversionType")) {
                      i = 10;
                   }
                   break;
                 case 0xa3d4777d:
                   if (str.equals("preloadLandingPage")) {
                      i = 11;
                   }
                   break;
                 case 0xa52e38d5:
                   if (str.equals("appIconUrl")) {
                      i = 12;
                   }
                   break;
                 case 0xa540df51:
                   if (str.equals("liveGiftSourceType")) {
                      i = 13;
                   }
                   break;
                 case 0xab2f45fd:
                   if (str.equals("adType")) {
                      i = 14;
                   }
                   break;
                 case 0xb21df56b:
                   if (str.equals("extData")) {
                      i = 15;
                   }
                   break;
                 case 0xb5bccff7:
                   if (str.equals("adSubType")) {
                      i = 16;
                   }
                   break;
                 case 0xb5ca0ffa:
                   if (str.equals("fromGift")) {
                      i = 17;
                   }
                   break;
                 case 0xb80cf509:
                   if (str.equals("orderId")) {
                      i = 18;
                   }
                   break;
                 case 0xb9c57554:
                   if (str.equals("adCover")) {
                      i = 19;
                   }
                   break;
                 case 0xbdc0e5f5:
                   if (str.equals("sourceType")) {
                      i = 20;
                   }
                   break;
                 case 0xbe8aa886:
                   if (str.equals("captionHints")) {
                      i = 21;
                   }
                   break;
                 case 0xc03b2513:
                   if (str.equals("adInstanceId")) {
                      i = 22;
                   }
                   break;
                 case 0xc09b2e36:
                   if (str.equals("textColor")) {
                      i = 23;
                   }
                   break;
                 case 0xc4a6040a:
                   if (str.equals("pageId")) {
                      i = 24;
                   }
                   break;
                 case 0xc5d402d4:
                   if (str.equals("templateType")) {
                      i = 25;
                   }
                   break;
                 case 0xc7c2fbc4:
                   if (str.equals("autoIntoLiveSeconds")) {
                      i = 26;
                   }
                   break;
                 case 0xcad898e2:
                   if (str.equals("styles")) {
                      i = 27;
                   }
                   break;
                 case 0xcb7ef180:
                   if (str.equals("taskId")) {
                      i = 28;
                   }
                   break;
                 case 0xcc663888:
                   if (str.equals("tracks")) {
                      i = 29;
                   }
                   break;
                 case 0xccc36214:
                   if (str.equals("imageUrl")) {
                      i = 30;
                   }
                   break;
                 case 0xcd1c3375:
                   if (str.equals("bizSwitchInfo")) {
                      i = 31;
                   }
                   break;
                 case 0xcd72abe1:
                   if (str.equals("photoPage")) {
                      i = 32;
                   }
                   break;
                 case 0xcf4adfbb:
                   if (str.equals("sourceDescriptionType")) {
                      i = 33;
                   }
                   break;
                 case 0xd0a9a5bb:
                   if (str.equals("appLink")) {
                      i = 34;
                   }
                   break;
                 case 0xd0aa704c:
                   if (str.equals("appName")) {
                      i = 35;
                   }
                   break;
                 case 0xe2d4fe6a:
                   if (str.equals("subPageId")) {
                      i = 36;
                   }
                   break;
                 case 0xe71c3708:
                   if (str.equals("adQueueType")) {
                      i = 37;
                   }
                   break;
                 case 0xe7381aa3:
                   if (str.equals("alertNetMobile")) {
                      i = 38;
                   }
                   break;
                 case 0xebde8126:
                   if (str.equals("reservationType")) {
                      i = 39;
                   }
                   break;
                 case 0xec403ca8:
                   if (str.equals("serverExtData")) {
                      i = 40;
                   }
                   break;
                 case 0xf2fa34e1:
                   if (str.equals("sourceDescription")) {
                      i = 41;
                   }
                   break;
                 case 0xf53d2d7f:
                   if (str.equals("reportClientLogType")) {
                      i = 42;
                   }
                   break;
                 case 0xf576d10d:
                   if (str.equals("fansTopAttributeParams")) {
                      i = 43;
                   }
                   break;
                 case 0xf69a061c:
                   if (str.equals("merchantEnhanceDisplay")) {
                      i = 44;
                   }
                   break;
                 case 0xf8d8cf13:
                   if (str.equals("adActionType")) {
                      i = 45;
                   }
                   break;
                 case 0xfb9fc4d0:
                   if (str.equals("enableRetainTopAd")) {
                      i = 46;
                   }
                   break;
                 case 0xfe439eb7:
                   if (str.equals("expireTimestamp")) {
                      i = 47;
                   }
                   break;
                 case 0xffdad404:
                   if (str.equals("merchantURLParamsStr")) {
                      i = 48;
                   }
                   break;
                 case 0x1c56f:
                   if (str.equals("url")) {
                      i = 49;
                   }
                   break;
                 case 0x5d2a614:
                   if (str.equals("h5App")) {
                      i = 50;
                   }
                   break;
                 case 0x624bf4e:
                   if (str.equals("llsid")) {
                      i = 51;
                   }
                   break;
                 case 0x6833e92:
                   if (str.equals("score")) {
                      i = 52;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 53;
                   }
                   break;
                 case 0x86abddf:
                   if (str.equals("manuUrls")) {
                      i = 54;
                   }
                   break;
                 case 0xe81e5fe:
                   if (str.equals("enableShowFansTopFlame")) {
                      i = 55;
                   }
                   break;
                 case 0xefab637:
                   if (str.equals("reservationStartPlayTime")) {
                      i = 56;
                   }
                   break;
                 case 0x1f3469aa:
                   if (str.equals("adTypeForGap")) {
                      i = 57;
                   }
                   break;
                 case 0x2f10ebe2:
                   if (str.equals("hidePlayletBarSwitch")) {
                      i = 58;
                   }
                   break;
                 case 0x31cdaad2:
                   if (str.equals("hideLabel")) {
                      i = 59;
                   }
                   break;
                 case 0x362a8ff1:
                   if (str.equals("packageName")) {
                      i = 60;
                   }
                   break;
                 case 0x39214b32:
                   if (str.equals("coverId")) {
                      i = 61;
                   }
                   break;
                 case 0x3afccd70:
                   if (str.equals("conversionType")) {
                      i = 62;
                   }
                   break;
                 case 0x3c816ecf:
                   if (str.equals("simpleLiveAdInfo")) {
                      i = 63;
                   }
                   break;
                 case 0x3e4007f1:
                   if (str.equals("subscriptDescription")) {
                      i = 64;
                   }
                   break;
                 case 0x421b47e2:
                   if (str.equals("downloadType")) {
                      i = 65;
                   }
                   break;
                 case 0x42938a07:
                   if (str.equals("reservationId")) {
                      i = 66;
                   }
                   break;
                 case 0x4a2457c7:
                   if (str.equals("missionId")) {
                      i = 67;
                   }
                   break;
                 case 0x4a8e699a:
                   if (str.equals("fansTopFeedFlameType")) {
                      i = 68;
                   }
                   break;
                 case 0x4cb7f6d5:
                   if (str.equals("backgroundColor")) {
                      i = 69;
                   }
                   break;
                 case 0x516f87f1:
                   if (str.equals("newStyle")) {
                      i = 70;
                   }
                   break;
                 case 0x51bef514:
                   if (str.equals("merchantDescription")) {
                      i = 71;
                   }
                   break;
                 case 0x51e4492a:
                   if (str.equals("creativeId")) {
                      i = 72;
                   }
                   break;
                 case 0x54818182:
                   if (str.equals("chargeInfo")) {
                      i = 73;
                   }
                   break;
                 case 0x552b6b48:
                   if (str.equals("callbackParam")) {
                      i = 74;
                   }
                   break;
                 case 0x55e5bf8c:
                   if (str.equals("bonusTime")) {
                      i = 75;
                   }
                   break;
                 case 0x5da93bd9:
                   if (str.equals("adDescription")) {
                      i = 76;
                   }
                   break;
                 case 0x61c5bc01:
                   if (str.equals("fansTopLive")) {
                      i = 77;
                   }
                   break;
                 case 0x626d9139:
                   if (str.equals("switchBit")) {
                      i = 78;
                   }
                   break;
                 case 0x662eeb1c:
                   if (str.equals("displayType")) {
                      i = 79;
                   }
                   break;
                 case 0x6ba02611:
                   if (str.equals("disableFansTopDetailIconClick")) {
                      i = 80;
                   }
                   break;
                 case 0x722a797b:
                   if (str.equals("playStartTime")) {
                      i = 81;
                   }
                   break;
                 case 0x766b64e5:
                   if (str.equals("subscriptType")) {
                      i = 82;
                   }
                   break;
                 case 0x78e81220:
                   if (str.equals("recommendReason")) {
                      i = 83;
                   }
                   break;
                 case 0x7aee4570:
                   if (str.equals("merchantTitle")) {
                      i = 84;
                   }
                   break;
                 case 0x7dcd4655:
                   if (str.equals("playEndInfo")) {
                      i = 85;
                   }
                   break;
                 case 0x7fd7c9c9:
                   if (str.equals("adDataV2")) {
                      i = 86;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   photoAdverti1.mAutoConversionInfo = this.u.read(p0);
                   break;
                 case 1:
                   photoAdverti1.mCaptionUrls = this.f.read(p0);
                   break;
                 case 2:
                   photoAdverti1.mClickNumber = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   photoAdverti1.mLiveAdSourceType = KnownTypeAdapters$k.a(p0, photoAdverti1.mLiveAdSourceType);
                   break;
                 case 4:
                   photoAdverti1.mUsePriorityCard = KnownTypeAdapters$g.a(p0, photoAdverti1.mUsePriorityCard);
                   break;
                 case 5:
                   photoAdverti1.mBaseInfo = this.q.read(p0);
                   break;
                 case 6:
                   photoAdverti1.mScale = KnownTypeAdapters$j.a(p0, photoAdverti1.mScale);
                   break;
                 case 7:
                   photoAdverti1.mLabelStyle = this.k.read(p0);
                   break;
                 case 8:
                   photoAdverti1.mFansTopDetailPageFlameDesc = TypeAdapters.A.read(p0);
                   break;
                 case 9:
                   photoAdverti1.mFansTopDetailPageFlameType = this.j.read(p0);
                   break;
                 case 10:
                   photoAdverti1.mSupConversionType = KnownTypeAdapters$k.a(p0, photoAdverti1.mSupConversionType);
                   break;
                 case 11:
                   photoAdverti1.mPreload = KnownTypeAdapters$g.a(p0, photoAdverti1.mPreload);
                   break;
                 case 12:
                   photoAdverti1.mAppIconUrl = TypeAdapters.A.read(p0);
                   break;
                 case 13:
                   photoAdverti1.mLiveGiftSourceType = KnownTypeAdapters$k.a(p0, photoAdverti1.mLiveGiftSourceType);
                   break;
                 case 14:
                   photoAdverti1.mAdGroup = this.d.read(p0);
                   break;
                 case 15:
                   photoAdverti1.mExtData = TypeAdapters.A.read(p0);
                   break;
                 case 16:
                   photoAdverti1.mAdSubType = TypeAdapters.A.read(p0);
                   break;
                 case 17:
                   photoAdverti1.mFromGift = KnownTypeAdapters$g.a(p0, photoAdverti1.mFromGift);
                   break;
                 case 18:
                   photoAdverti1.mOrderId = KnownTypeAdapters$n.a(p0, photoAdverti1.mOrderId);
                   break;
                 case 19:
                   photoAdverti1.mAdCover = this.t.read(p0);
                   break;
                 case 20:
                   photoAdverti1.mSourceType = KnownTypeAdapters$k.a(p0, photoAdverti1.mSourceType);
                   break;
                 case 21:
                   photoAdverti1.mCaptionHints = this.h.read(p0);
                   break;
                 case 22:
                   photoAdverti1.mAdInstanceId = TypeAdapters.A.read(p0);
                   break;
                 case 23:
                   photoAdverti1.mTextColor = TypeAdapters.A.read(p0);
                   break;
                 case 24:
                   photoAdverti1.mPageId = KnownTypeAdapters$n.a(p0, photoAdverti1.mPageId);
                   break;
                 case 25:
                   photoAdverti1.mTemplateType = KnownTypeAdapters$k.a(p0, photoAdverti1.mTemplateType);
                   break;
                 case 26:
                   photoAdverti1.mAutoIntoLiveSeconds = KnownTypeAdapters$k.a(p0, photoAdverti1.mAutoIntoLiveSeconds);
                   break;
                 case 27:
                   photoAdverti1.mStyles = this.s.read(p0);
                   break;
                 case 28:
                   photoAdverti1.mTaskId = KnownTypeAdapters$n.a(p0, photoAdverti1.mTaskId);
                   break;
                 case 29:
                   photoAdverti1.mTracks = this.c.read(p0);
                   break;
                 case 30:
                   photoAdverti1.mImageUrl = TypeAdapters.A.read(p0);
                   break;
                 case 31:
                   photoAdverti1.mBizSwitchInfo = this.v.read(p0);
                   break;
                 case 32:
                   photoAdverti1.mPhotoPage = TypeAdapters.A.read(p0);
                   break;
                 case '!':
                   photoAdverti1.mSourceDescriptionType = KnownTypeAdapters$k.a(p0, photoAdverti1.mSourceDescriptionType);
                   break;
                 case '"':
                   photoAdverti1.mScheme = TypeAdapters.A.read(p0);
                   break;
                 case '#':
                   photoAdverti1.mAppName = TypeAdapters.A.read(p0);
                   break;
                 case '$':
                   photoAdverti1.mSubPageId = KnownTypeAdapters$n.a(p0, photoAdverti1.mSubPageId);
                   break;
                 case '%':
                   photoAdverti1.mAdQueueType = KnownTypeAdapters$k.a(p0, photoAdverti1.mAdQueueType);
                   break;
                 case '&':
                   photoAdverti1.mShouldAlertNetMobile = KnownTypeAdapters$g.a(p0, photoAdverti1.mShouldAlertNetMobile);
                   break;
                 case 39:
                   photoAdverti1.mReservationType = KnownTypeAdapters$k.a(p0, photoAdverti1.mReservationType);
                   break;
                 case '(':
                   photoAdverti1.mRequestApiExtData = TypeAdapters.A.read(p0);
                   break;
                 case ')':
                   photoAdverti1.mSourceDescription = TypeAdapters.A.read(p0);
                   break;
                 case '*':
                   photoAdverti1.mReportClientLogType = KnownTypeAdapters$k.a(p0, photoAdverti1.mReportClientLogType);
                   break;
                 case '+':
                   photoAdverti1.mFansTopAttributeParams = TypeAdapters.A.read(p0);
                   break;
                 case ',':
                   photoAdverti1.mMerchantEnhanceDisplay = this.m.read(p0);
                   break;
                 case '-':
                   photoAdverti1.mAdActionType = KnownTypeAdapters$k.a(p0, photoAdverti1.mAdActionType);
                   break;
                 case '.':
                   photoAdverti1.mEnableRetainTopAd = KnownTypeAdapters$g.a(p0, photoAdverti1.mEnableRetainTopAd);
                   break;
                 case '/':
                   photoAdverti1.mExpireTimestamp = KnownTypeAdapters.d.read(p0);
                   break;
                 case '0':
                   photoAdverti1.mMerchantURLParamsStr = TypeAdapters.A.read(p0);
                   break;
                 case '1':
                   photoAdverti1.mUrl = TypeAdapters.A.read(p0);
                   break;
                 case '2':
                   photoAdverti1.mIsH5App = KnownTypeAdapters$g.a(p0, photoAdverti1.mIsH5App);
                   break;
                 case '3':
                   photoAdverti1.mLlsid = TypeAdapters.A.read(p0);
                   break;
                 case '4':
                   photoAdverti1.mAppScore = KnownTypeAdapters$i.a(p0, photoAdverti1.mAppScore);
                   break;
                 case '5':
                   photoAdverti1.mTitle = TypeAdapters.A.read(p0);
                   break;
                 case '6':
                   photoAdverti1.mManuUrls = this.l.read(p0);
                   break;
                 case '7':
                   photoAdverti1.mEnableShowFansTopFlame = KnownTypeAdapters$g.a(p0, photoAdverti1.mEnableShowFansTopFlame);
                   break;
                 case '8':
                   photoAdverti1.mReservationExpireTimestamp = KnownTypeAdapters$n.a(p0, photoAdverti1.mReservationExpireTimestamp);
                   break;
                 case '9':
                   photoAdverti1.mAdTypeForGap = KnownTypeAdapters$k.a(p0, photoAdverti1.mAdTypeForGap);
                   break;
                 case ':':
                   photoAdverti1.mHidePlayletBarSwitch = TypeAdapters.e.read(p0);
                   break;
                 case ';':
                   photoAdverti1.mHideLabel = KnownTypeAdapters$g.a(p0, photoAdverti1.mHideLabel);
                   break;
                 case '<':
                   photoAdverti1.mPackageName = TypeAdapters.A.read(p0);
                   break;
                 case '=':
                   photoAdverti1.mCoverId = KnownTypeAdapters$n.a(p0, photoAdverti1.mCoverId);
                   break;
                 case '>':
                   photoAdverti1.mConversionType = KnownTypeAdapters$k.a(p0, photoAdverti1.mConversionType);
                   break;
                 case '?':
                   photoAdverti1.mSimpleLiveAdInfo = TypeAdapters.A.read(p0);
                   break;
                 case '@':
                   photoAdverti1.mSubscriptDescription = TypeAdapters.A.read(p0);
                   break;
                 case 'A':
                   photoAdverti1.mDownloadType = KnownTypeAdapters$k.a(p0, photoAdverti1.mDownloadType);
                   break;
                 case 'B':
                   photoAdverti1.mReservationId = TypeAdapters.A.read(p0);
                   break;
                 case 'C':
                   photoAdverti1.mMissionId = KnownTypeAdapters$n.a(p0, photoAdverti1.mMissionId);
                   break;
                 case 'D':
                   photoAdverti1.mFansTopFeedFlameType = this.i.read(p0);
                   break;
                 case 'E':
                   photoAdverti1.mBackgroundColor = TypeAdapters.A.read(p0);
                   break;
                 case 'F':
                   photoAdverti1.mIsNewStyle = KnownTypeAdapters$g.a(p0, photoAdverti1.mIsNewStyle);
                   break;
                 case 'G':
                   photoAdverti1.mItemDesc = TypeAdapters.A.read(p0);
                   break;
                 case 'H':
                   photoAdverti1.mCreativeId = KnownTypeAdapters$n.a(p0, photoAdverti1.mCreativeId);
                   break;
                 case 'I':
                   photoAdverti1.mChargeInfo = TypeAdapters.A.read(p0);
                   break;
                 case 'J':
                   photoAdverti1.mCallbackParam = TypeAdapters.A.read(p0);
                   break;
                 case 'K':
                   photoAdverti1.mFansTopAwardBonusTime = KnownTypeAdapters$n.a(p0, photoAdverti1.mFansTopAwardBonusTime);
                   break;
                 case 'L':
                   photoAdverti1.mAdLabelDescription = TypeAdapters.A.read(p0);
                   break;
                 case 'M':
                   photoAdverti1.mAdLiveForFansTop = this.n.read(p0);
                   break;
                 case 'N':
                   photoAdverti1.mCommonSwitchBit = KnownTypeAdapters$n.a(p0, photoAdverti1.mCommonSwitchBit);
                   break;
                 case 'O':
                   photoAdverti1.mDisplayType = KnownTypeAdapters$k.a(p0, photoAdverti1.mDisplayType);
                   break;
                 case 'P':
                   photoAdverti1.mDisableFansTopDetailIconClick = KnownTypeAdapters$g.a(p0, photoAdverti1.mDisableFansTopDetailIconClick);
                   break;
                 case 'Q':
                   photoAdverti1.mVideoPlayStartTimeMS = KnownTypeAdapters$n.a(p0, photoAdverti1.mVideoPlayStartTimeMS);
                   break;
                 case 'R':
                   photoAdverti1.mSubscriptType = KnownTypeAdapters$k.a(p0, photoAdverti1.mSubscriptType);
                   break;
                 case 'S':
                   photoAdverti1.mRecommendReason = TypeAdapters.A.read(p0);
                   break;
                 case 'T':
                   photoAdverti1.mItemTitle = TypeAdapters.A.read(p0);
                   break;
                 case 'U':
                   photoAdverti1.mPlayEndInfo = this.o.read(p0);
                   break;
                 case 'V':
                   photoAdverti1.mAdData = this.r.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return photoAdverti1;
       }
    }
    public void b(b p0,PhotoAdvertisement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("creativeId");
          p0.K(p1.mCreativeId);
          if (p1.mExpireTimestamp != null) {
             p0.r("expireTimestamp");
             KnownTypeAdapters.d.write(p0, p1.mExpireTimestamp);
          }
          if (p1.mChargeInfo != null) {
             p0.r("chargeInfo");
             TypeAdapters.A.write(p0, p1.mChargeInfo);
          }
          p0.r("sourceType");
          p0.K((long)p1.mSourceType);
          p0.r("conversionType");
          p0.K((long)p1.mConversionType);
          p0.r("adActionType");
          p0.K((long)p1.mAdActionType);
          p0.r("supConversionType");
          p0.K((long)p1.mSupConversionType);
          p0.r("reservationType");
          p0.K((long)p1.mReservationType);
          if (p1.mReservationId != null) {
             p0.r("reservationId");
             TypeAdapters.A.write(p0, p1.mReservationId);
          }
          p0.r("reservationStartPlayTime");
          p0.K(p1.mReservationExpireTimestamp);
          p0.r("hideLabel");
          p0.P(p1.mHideLabel);
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mUrl != null) {
             p0.r("url");
             TypeAdapters.A.write(p0, p1.mUrl);
          }
          if (p1.mMerchantURLParamsStr != null) {
             p0.r("merchantURLParamsStr");
             TypeAdapters.A.write(p0, p1.mMerchantURLParamsStr);
          }
          if (p1.mPackageName != null) {
             p0.r("packageName");
             TypeAdapters.A.write(p0, p1.mPackageName);
          }
          p0.r("adQueueType");
          p0.K((long)p1.mAdQueueType);
          p0.r("displayType");
          p0.K((long)p1.mDisplayType);
          if (p1.mImageUrl != null) {
             p0.r("imageUrl");
             TypeAdapters.A.write(p0, p1.mImageUrl);
          }
          if (p1.mBackgroundColor != null) {
             p0.r("backgroundColor");
             TypeAdapters.A.write(p0, p1.mBackgroundColor);
          }
          if (p1.mTextColor != null) {
             p0.r("textColor");
             TypeAdapters.A.write(p0, p1.mTextColor);
          }
          p0.r("sourceDescriptionType");
          p0.K((long)p1.mSourceDescriptionType);
          if (p1.mSourceDescription != null) {
             p0.r("sourceDescription");
             TypeAdapters.A.write(p0, p1.mSourceDescription);
          }
          p0.r("subscriptType");
          p0.K((long)p1.mSubscriptType);
          if (p1.mSubscriptDescription != null) {
             p0.r("subscriptDescription");
             TypeAdapters.A.write(p0, p1.mSubscriptDescription);
          }
          if (p1.mHidePlayletBarSwitch != null) {
             p0.r("hidePlayletBarSwitch");
             TypeAdapters.e.write(p0, p1.mHidePlayletBarSwitch);
          }
          if (p1.mTracks != null) {
             p0.r("tracks");
             this.c.write(p0, p1.mTracks);
          }
          p0.r("orderId");
          p0.K(p1.mOrderId);
          p0.r("missionId");
          p0.K(p1.mMissionId);
          p0.r("taskId");
          p0.K(p1.mTaskId);
          if (p1.mAdGroup != null) {
             p0.r("adType");
             this.d.write(p0, p1.mAdGroup);
          }
          if (p1.mAdSubType != null) {
             p0.r("adSubType");
             TypeAdapters.A.write(p0, p1.mAdSubType);
          }
          if (p1.mScheme != null) {
             p0.r("appLink");
             TypeAdapters.A.write(p0, p1.mScheme);
          }
          p0.r("actionBarRatio");
          p0.J((double)p1.mScale);
          p0.r("preloadLandingPage");
          p0.P(p1.mPreload);
          if (p1.mAppName != null) {
             p0.r("appName");
             TypeAdapters.A.write(p0, p1.mAppName);
          }
          p0.r("alertNetMobile");
          p0.P(p1.mShouldAlertNetMobile);
          if (p1.mItemDesc != null) {
             p0.r("merchantDescription");
             TypeAdapters.A.write(p0, p1.mItemDesc);
          }
          if (p1.mItemTitle != null) {
             p0.r("merchantTitle");
             TypeAdapters.A.write(p0, p1.mItemTitle);
          }
          if (p1.mPhotoPage != null) {
             p0.r("photoPage");
             TypeAdapters.A.write(p0, p1.mPhotoPage);
          }
          if (p1.mExtData != null) {
             p0.r("extData");
             TypeAdapters.A.write(p0, p1.mExtData);
          }
          if (p1.mRequestApiExtData != null) {
             p0.r("serverExtData");
             TypeAdapters.A.write(p0, p1.mRequestApiExtData);
          }
          if (p1.mCaptionUrls != null) {
             p0.r("captionUrls");
             this.f.write(p0, p1.mCaptionUrls);
          }
          if (p1.mCaptionHints != null) {
             p0.r("captionHints");
             this.h.write(p0, p1.mCaptionHints);
          }
          if (p1.mClickNumber != null) {
             p0.r("clickInfo");
             TypeAdapters.A.write(p0, p1.mClickNumber);
          }
          if (p1.mAppIconUrl != null) {
             p0.r("appIconUrl");
             TypeAdapters.A.write(p0, p1.mAppIconUrl);
          }
          p0.r("downloadType");
          p0.K((long)p1.mDownloadType);
          p0.r("h5App");
          p0.P(p1.mIsH5App);
          if (p1.mFansTopDetailPageFlameDesc != null) {
             p0.r("fansTopDetailPageFlameDesc");
             TypeAdapters.A.write(p0, p1.mFansTopDetailPageFlameDesc);
          }
          p0.r("enableShowFansTopFlame");
          p0.P(p1.mEnableShowFansTopFlame);
          p0.r("disableFansTopDetailIconClick");
          p0.P(p1.mDisableFansTopDetailIconClick);
          p0.r("autoIntoLiveSeconds");
          p0.K((long)p1.mAutoIntoLiveSeconds);
          if (p1.mFansTopFeedFlameType != null) {
             p0.r("fansTopFeedFlameType");
             this.i.write(p0, p1.mFansTopFeedFlameType);
          }
          if (p1.mFansTopDetailPageFlameType != null) {
             p0.r("fansTopDetailPageFlameType");
             this.j.write(p0, p1.mFansTopDetailPageFlameType);
          }
          if (p1.mLabelStyle != null) {
             p0.r("labelStyle");
             this.k.write(p0, p1.mLabelStyle);
          }
          p0.r("newStyle");
          p0.P(p1.mIsNewStyle);
          p0.r("score");
          p0.J(p1.mAppScore);
          p0.r("templateType");
          p0.K((long)p1.mTemplateType);
          p0.r("usePriorityCard");
          p0.P(p1.mUsePriorityCard);
          p0.r("coverId");
          p0.K(p1.mCoverId);
          if (p1.mAdLabelDescription != null) {
             p0.r("adDescription");
             TypeAdapters.A.write(p0, p1.mAdLabelDescription);
          }
          if (p1.mManuUrls != null) {
             p0.r("manuUrls");
             this.l.write(p0, p1.mManuUrls);
          }
          if (p1.mMerchantEnhanceDisplay != null) {
             p0.r("merchantEnhanceDisplay");
             this.m.write(p0, p1.mMerchantEnhanceDisplay);
          }
          p0.r("pageId");
          p0.K(p1.mPageId);
          p0.r("subPageId");
          p0.K(p1.mSubPageId);
          if (p1.mAdInstanceId != null) {
             p0.r("adInstanceId");
             TypeAdapters.A.write(p0, p1.mAdInstanceId);
          }
          if (p1.mAdLiveForFansTop != null) {
             p0.r("fansTopLive");
             this.n.write(p0, p1.mAdLiveForFansTop);
          }
          if (p1.mLlsid != null) {
             p0.r("llsid");
             TypeAdapters.A.write(p0, p1.mLlsid);
          }
          if (p1.mFansTopAttributeParams != null) {
             p0.r("fansTopAttributeParams");
             TypeAdapters.A.write(p0, p1.mFansTopAttributeParams);
          }
          p0.r("bonusTime");
          p0.K(p1.mFansTopAwardBonusTime);
          if (p1.mPlayEndInfo != null) {
             p0.r("playEndInfo");
             this.o.write(p0, p1.mPlayEndInfo);
          }
          if (p1.mBaseInfo != null) {
             p0.r("baseInfo");
             this.q.write(p0, p1.mBaseInfo);
          }
          if (p1.mAdData != null) {
             p0.r("adDataV2");
             this.r.write(p0, p1.mAdData);
          }
          if (p1.mStyles != null) {
             p0.r("styles");
             this.s.write(p0, p1.mStyles);
          }
          p0.r("fromGift");
          p0.P(p1.mFromGift);
          p0.r("liveGiftSourceType");
          p0.K((long)p1.mLiveGiftSourceType);
          if (p1.mCallbackParam != null) {
             p0.r("callbackParam");
             TypeAdapters.A.write(p0, p1.mCallbackParam);
          }
          p0.r("enableRetainTopAd");
          p0.P(p1.mEnableRetainTopAd);
          p0.r("adTypeForGap");
          p0.K((long)p1.mAdTypeForGap);
          if (p1.mRecommendReason != null) {
             p0.r("recommendReason");
             TypeAdapters.A.write(p0, p1.mRecommendReason);
          }
          if (p1.mSimpleLiveAdInfo != null) {
             p0.r("simpleLiveAdInfo");
             TypeAdapters.A.write(p0, p1.mSimpleLiveAdInfo);
          }
          p0.r("liveAdSourceType");
          p0.K((long)p1.mLiveAdSourceType);
          if (p1.mAdCover != null) {
             p0.r("adCover");
             this.t.write(p0, p1.mAdCover);
          }
          p0.r("playStartTime");
          p0.K(p1.mVideoPlayStartTimeMS);
          p0.r("reportClientLogType");
          p0.K((long)p1.mReportClientLogType);
          if (p1.mAutoConversionInfo != null) {
             p0.r("autoConversionInfo");
             this.u.write(p0, p1.mAutoConversionInfo);
          }
          p0.r("switchBit");
          p0.K(p1.mCommonSwitchBit);
          if (p1.mBizSwitchInfo != null) {
             p0.r("bizSwitchInfo");
             this.v.write(p0, p1.mBizSwitchInfo);
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
