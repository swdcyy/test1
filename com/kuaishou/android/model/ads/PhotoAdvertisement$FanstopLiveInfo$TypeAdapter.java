package com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.LiveAdNeoParam;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Track$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AutoConversionInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters;
import java.lang.Long;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AutoConversionInfo;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$FanstopLiveInfo$TypeAdapter extends TypeAdapter	// class@00093c
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
       PhotoAdvertisement$FanstopLiveInfo$TypeAdapter.h = a.get(PhotoAdvertisement$FanstopLiveInfo.class);
    }
    public void PhotoAdvertisement$FanstopLiveInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PhotoAdvertisement$AdGroup$TypeAdapter.a);
       this.c = p0.j(PhotoAdvertisement$AdData$TypeAdapter.A0);
       TypeAdapter typeAdapter = p0.j(PhotoAdvertisement$Track$TypeAdapter.b);
       this.d = typeAdapter;
       this.e = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.f = p0.j(a.get(LiveAdNeoParam.class));
       this.g = p0.j(PhotoAdvertisement$AutoConversionInfo$TypeAdapter.b);
    }
    public PhotoAdvertisement$FanstopLiveInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$FanstopLiveInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$FanstopLiveInfo uFanstopLive = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uFanstopLive;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uFanstopLive;
       }else {
          p0.c();
          PhotoAdvertisement$FanstopLiveInfo uFanstopLive1 = new PhotoAdvertisement$FanstopLiveInfo();
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
                 case 0xab2f45fd:
                   if (str.equals("adType")) {
                      i = 1;
                   }
                   break;
                 case 0xb21df56b:
                   if (str.equals("extData")) {
                      i = 2;
                   }
                   break;
                 case 0xbdc0e5f5:
                   if (str.equals("sourceType")) {
                      i = 3;
                   }
                   break;
                 case 0xc4a6040a:
                   if (str.equals("pageId")) {
                      i = 4;
                   }
                   break;
                 case 0xc5d402d4:
                   if (str.equals("templateType")) {
                      i = 5;
                   }
                   break;
                 case 0xcc663888:
                   if (str.equals("tracks")) {
                      i = 6;
                   }
                   break;
                 case 0xcd72abe1:
                   if (str.equals("photoPage")) {
                      i = 7;
                   }
                   break;
                 case 0xe2d4fe6a:
                   if (str.equals("subPageId")) {
                      i = 8;
                   }
                   break;
                 case 0xec403ca8:
                   if (str.equals("serverExtData")) {
                      i = 9;
                   }
                   break;
                 case 0xf576d10d:
                   if (str.equals("fansTopAttributeParams")) {
                      i = 10;
                   }
                   break;
                 case 0xfe439eb7:
                   if (str.equals("expireTimestamp")) {
                      i = 11;
                   }
                   break;
                 case 0xffdad404:
                   if (str.equals("merchantURLParamsStr")) {
                      i = 12;
                   }
                   break;
                 case 0x624bf4e:
                   if (str.equals("llsid")) {
                      i = 13;
                   }
                   break;
                 case 0x39214b32:
                   if (str.equals("coverId")) {
                      i = 14;
                   }
                   break;
                 case 0x51e4492a:
                   if (str.equals("creativeId")) {
                      i = 15;
                   }
                   break;
                 case 0x54818182:
                   if (str.equals("chargeInfo")) {
                      i = 16;
                   }
                   break;
                 case 0x552b6b48:
                   if (str.equals("callbackParam")) {
                      i = 17;
                   }
                   break;
                 case 0x55e5bf8c:
                   if (str.equals("bonusTime")) {
                      i = 18;
                   }
                   break;
                 case 0x64799c24:
                   if (str.equals("feedFlowAdNeoParam")) {
                      i = 19;
                   }
                   break;
                 case 0x7fd7c9c9:
                   if (str.equals("adDataV2")) {
                      i = 20;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uFanstopLive1.mAutoConversionInfo = this.g.read(p0);
                   break;
                 case 1:
                   uFanstopLive1.mAdGroup = this.b.read(p0);
                   break;
                 case 2:
                   uFanstopLive1.mExtData = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   uFanstopLive1.mSourceType = KnownTypeAdapters$k.a(p0, uFanstopLive1.mSourceType);
                   break;
                 case 4:
                   uFanstopLive1.mPageId = KnownTypeAdapters$n.a(p0, uFanstopLive1.mPageId);
                   break;
                 case 5:
                   uFanstopLive1.mTemplateType = KnownTypeAdapters$k.a(p0, uFanstopLive1.mTemplateType);
                   break;
                 case 6:
                   uFanstopLive1.mTracks = this.e.read(p0);
                   break;
                 case 7:
                   uFanstopLive1.mPhotoPage = TypeAdapters.A.read(p0);
                   break;
                 case 8:
                   uFanstopLive1.mSubPageId = KnownTypeAdapters$n.a(p0, uFanstopLive1.mSubPageId);
                   break;
                 case 9:
                   uFanstopLive1.mRequestApiExtData = TypeAdapters.A.read(p0);
                   break;
                 case 10:
                   uFanstopLive1.mFansTopAttributeParams = TypeAdapters.A.read(p0);
                   break;
                 case 11:
                   uFanstopLive1.mExpireTimestamp = KnownTypeAdapters.d.read(p0);
                   break;
                 case 12:
                   uFanstopLive1.mMerchantURLParamsStr = TypeAdapters.A.read(p0);
                   break;
                 case 13:
                   uFanstopLive1.mLlsid = TypeAdapters.A.read(p0);
                   break;
                 case 14:
                   uFanstopLive1.mCoverId = KnownTypeAdapters$n.a(p0, uFanstopLive1.mCoverId);
                   break;
                 case 15:
                   uFanstopLive1.mCreativeId = KnownTypeAdapters$n.a(p0, uFanstopLive1.mCreativeId);
                   break;
                 case 16:
                   uFanstopLive1.mChargeInfo = TypeAdapters.A.read(p0);
                   break;
                 case 17:
                   uFanstopLive1.mCallbackParam = TypeAdapters.A.read(p0);
                   break;
                 case 18:
                   uFanstopLive1.mFansTopAwardBonusTime = KnownTypeAdapters$n.a(p0, uFanstopLive1.mFansTopAwardBonusTime);
                   break;
                 case 19:
                   uFanstopLive1.mFeedFlowAdNeoParam = this.f.read(p0);
                   break;
                 case 20:
                   uFanstopLive1.mAdData = this.c.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uFanstopLive1;
       }
    }
    public void b(b p0,PhotoAdvertisement$FanstopLiveInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$FanstopLiveInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("sourceType");
          p0.K((long)p1.mSourceType);
          if (p1.mAdGroup != null) {
             p0.r("adType");
             this.b.write(p0, p1.mAdGroup);
          }
          if (p1.mExtData != null) {
             p0.r("extData");
             TypeAdapters.A.write(p0, p1.mExtData);
          }
          if (p1.mRequestApiExtData != null) {
             p0.r("serverExtData");
             TypeAdapters.A.write(p0, p1.mRequestApiExtData);
          }
          if (p1.mPhotoPage != null) {
             p0.r("photoPage");
             TypeAdapters.A.write(p0, p1.mPhotoPage);
          }
          if (p1.mChargeInfo != null) {
             p0.r("chargeInfo");
             TypeAdapters.A.write(p0, p1.mChargeInfo);
          }
          if (p1.mAdData != null) {
             p0.r("adDataV2");
             this.c.write(p0, p1.mAdData);
          }
          if (p1.mLlsid != null) {
             p0.r("llsid");
             TypeAdapters.A.write(p0, p1.mLlsid);
          }
          p0.r("pageId");
          p0.K(p1.mPageId);
          p0.r("subPageId");
          p0.K(p1.mSubPageId);
          p0.r("creativeId");
          p0.K(p1.mCreativeId);
          p0.r("coverId");
          p0.K(p1.mCoverId);
          if (p1.mMerchantURLParamsStr != null) {
             p0.r("merchantURLParamsStr");
             TypeAdapters.A.write(p0, p1.mMerchantURLParamsStr);
          }
          if (p1.mTracks != null) {
             p0.r("tracks");
             this.e.write(p0, p1.mTracks);
          }
          if (p1.mExpireTimestamp != null) {
             p0.r("expireTimestamp");
             KnownTypeAdapters.d.write(p0, p1.mExpireTimestamp);
          }
          p0.r("templateType");
          p0.K((long)p1.mTemplateType);
          p0.r("bonusTime");
          p0.K(p1.mFansTopAwardBonusTime);
          if (p1.mFeedFlowAdNeoParam != null) {
             p0.r("feedFlowAdNeoParam");
             this.f.write(p0, p1.mFeedFlowAdNeoParam);
          }
          if (p1.mAutoConversionInfo != null) {
             p0.r("autoConversionInfo");
             this.g.write(p0, p1.mAutoConversionInfo);
          }
          if (p1.mCallbackParam != null) {
             p0.r("callbackParam");
             TypeAdapters.A.write(p0, p1.mCallbackParam);
          }
          if (p1.mFansTopAttributeParams != null) {
             p0.r("fansTopAttributeParams");
             TypeAdapters.A.write(p0, p1.mFansTopAttributeParams);
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
