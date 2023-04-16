package com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAdInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAdInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAction$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RewardEndInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InterceptInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NeoReportInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NeoReportInfo;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAction;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InterceptInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RewardEndInfo;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$InspireAdInfo$TypeAdapter extends TypeAdapter	// class@000964
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public static final a f;

    static {
       PhotoAdvertisement$InspireAdInfo$TypeAdapter.f = a.get(PhotoAdvertisement$InspireAdInfo.class);
    }
    public void PhotoAdvertisement$InspireAdInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PhotoAdvertisement$InspireAction$TypeAdapter.d);
       this.c = p0.j(PhotoAdvertisement$RewardEndInfo$TypeAdapter.b);
       this.d = p0.j(PhotoAdvertisement$InterceptInfo$TypeAdapter.b);
       this.e = p0.j(PhotoAdvertisement$NeoReportInfo$TypeAdapter.b);
    }
    public PhotoAdvertisement$InspireAdInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$InspireAdInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$InspireAdInfo inspireAdInf = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return inspireAdInf;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return inspireAdInf;
       }else {
          p0.c();
          PhotoAdvertisement$InspireAdInfo inspireAdInf1 = new PhotoAdvertisement$InspireAdInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xa36821fa:
                   if (str.equals("rewardEndInfo")) {
                      i = 0;
                   }
                   break;
                 case 0xbdc0e5f5:
                   if (str.equals("sourceType")) {
                      i = 1;
                   }
                   break;
                 case 0xc20f42c3:
                   if (str.equals("liveStartTime")) {
                      i = 2;
                   }
                   break;
                 case 0xd1b4c890:
                   if (str.equals("interceptInfo")) {
                      i = 3;
                   }
                   break;
                 case 0xde502130:
                   if (str.equals("socialControl")) {
                      i = 4;
                   }
                   break;
                 case 0xe02e9e50:
                   if (str.equals("pendantScene")) {
                      i = 5;
                   }
                   break;
                 case 0x2f21fd3e:
                   if (str.equals("neoParams")) {
                      i = 6;
                   }
                   break;
                 case 0x2f276f71:
                   if (str.equals("supportLiveReservation")) {
                      i = 7;
                   }
                   break;
                 case 0x312f1d72:
                   if (str.equals("disableAvatarFollow")) {
                      i = 8;
                   }
                   break;
                 case 0x4ab1d1b0:
                   if (str.equals("inspireAction")) {
                      i = 9;
                   }
                   break;
                 case 0x4d99ca5e:
                   if (str.equals("cacheExpireMinutes")) {
                      i = 10;
                   }
                   break;
                 case 0x4f6f99bf:
                   if (str.equals("videoLoop")) {
                      i = 11;
                   }
                   break;
                 case 0x52385f78:
                   if (str.equals("enableClickOtherArea")) {
                      i = 12;
                   }
                   break;
                 case 0x5a483331:
                   if (str.equals("inspireAdBillTime")) {
                      i = 13;
                   }
                   break;
                 case 0x629c725f:
                   if (str.equals("processActionType")) {
                      i = 14;
                   }
                   break;
                 case 0x6fed0ff1:
                   if (str.equals("adNeoTkControl")) {
                      i = 15;
                   }
                   break;
                 case 0x73197402:
                   if (str.equals("reportInfo")) {
                      i = 16;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   inspireAdInf1.mRewardEndInfo = this.c.read(p0);
                   break;
                 case 1:
                   inspireAdInf1.mSourceType = KnownTypeAdapters$k.a(p0, inspireAdInf1.mSourceType);
                   break;
                 case 2:
                   inspireAdInf1.mLiveStartTime = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   inspireAdInf1.mInterceptInfo = this.d.read(p0);
                   break;
                 case 4:
                   inspireAdInf1.mSocialControl = KnownTypeAdapters$k.a(p0, inspireAdInf1.mSocialControl);
                   break;
                 case 5:
                   inspireAdInf1.mPendantScene = KnownTypeAdapters$k.a(p0, inspireAdInf1.mPendantScene);
                   break;
                 case 6:
                   inspireAdInf1.mNeoParams = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   inspireAdInf1.mSupportLiveReservation = KnownTypeAdapters$g.a(p0, inspireAdInf1.mSupportLiveReservation);
                   break;
                 case 8:
                   inspireAdInf1.mDisableAvatarFollow = KnownTypeAdapters$g.a(p0, inspireAdInf1.mDisableAvatarFollow);
                   break;
                 case 9:
                   inspireAdInf1.mInspireAction = this.b.read(p0);
                   break;
                 case 10:
                   inspireAdInf1.mCacheExpireMin = KnownTypeAdapters$n.a(p0, inspireAdInf1.mCacheExpireMin);
                   break;
                 case 11:
                   inspireAdInf1.mVideoLoop = KnownTypeAdapters$g.a(p0, inspireAdInf1.mVideoLoop);
                   break;
                 case 12:
                   inspireAdInf1.mEnableClickOtherArea = KnownTypeAdapters$g.a(p0, inspireAdInf1.mEnableClickOtherArea);
                   break;
                 case 13:
                   inspireAdInf1.mInspireAdBillTime = KnownTypeAdapters$n.a(p0, inspireAdInf1.mInspireAdBillTime);
                   break;
                 case 14:
                   inspireAdInf1.mProcessActionType = KnownTypeAdapters$k.a(p0, inspireAdInf1.mProcessActionType);
                   break;
                 case 15:
                   inspireAdInf1.mAdNeoTkControl = KnownTypeAdapters$k.a(p0, inspireAdInf1.mAdNeoTkControl);
                   break;
                 case 16:
                   inspireAdInf1.mNeoReportInfo = this.e.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return inspireAdInf1;
       }
    }
    public void b(b p0,PhotoAdvertisement$InspireAdInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$InspireAdInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("adNeoTkControl");
          p0.K((long)p1.mAdNeoTkControl);
          p0.r("inspireAdBillTime");
          p0.K(p1.mInspireAdBillTime);
          p0.r("cacheExpireMinutes");
          p0.K(p1.mCacheExpireMin);
          if (p1.mInspireAction != null) {
             p0.r("inspireAction");
             this.b.write(p0, p1.mInspireAction);
          }
          if (p1.mRewardEndInfo != null) {
             p0.r("rewardEndInfo");
             this.c.write(p0, p1.mRewardEndInfo);
          }
          p0.r("enableClickOtherArea");
          p0.P(p1.mEnableClickOtherArea);
          if (p1.mLiveStartTime != null) {
             p0.r("liveStartTime");
             TypeAdapters.A.write(p0, p1.mLiveStartTime);
          }
          p0.r("supportLiveReservation");
          p0.P(p1.mSupportLiveReservation);
          if (p1.mInterceptInfo != null) {
             p0.r("interceptInfo");
             this.d.write(p0, p1.mInterceptInfo);
          }
          if (p1.mNeoReportInfo != null) {
             p0.r("reportInfo");
             this.e.write(p0, p1.mNeoReportInfo);
          }
          p0.r("videoLoop");
          p0.P(p1.mVideoLoop);
          p0.r("socialControl");
          p0.K((long)p1.mSocialControl);
          p0.r("disableAvatarFollow");
          p0.P(p1.mDisableAvatarFollow);
          if (p1.mNeoParams != null) {
             p0.r("neoParams");
             TypeAdapters.A.write(p0, p1.mNeoParams);
          }
          p0.r("pendantScene");
          p0.K((long)p1.mPendantScene);
          p0.r("sourceType");
          p0.K((long)p1.mSourceType);
          p0.r("processActionType");
          p0.K((long)p1.mProcessActionType);
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
