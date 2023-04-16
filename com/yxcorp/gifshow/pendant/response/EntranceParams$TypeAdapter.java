package com.yxcorp.gifshow.pendant.response.EntranceParams$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.pendant.response.EntranceParams;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.pendant.response.AdsorptionStateConfigV2;
import com.yxcorp.gifshow.pendant.response.PendantLocationParam$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.yxcorp.gifshow.pendant.response.EntranceParams$PendantConfig$TypeAdapter;
import com.yxcorp.gifshow.pendant.response.PendantBubbleConfig$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$e;
import com.yxcorp.gifshow.pendant.response.WatchVideoStyle$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.List;
import com.yxcorp.gifshow.pendant.response.PendantSharedParams;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.Map;
import com.yxcorp.gifshow.pendant.response.EntranceParams$PendantConfig;
import com.vimeo.stag.KnownTypeAdapters$l;
import com.yxcorp.gifshow.pendant.response.WatchVideoStyle;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import kwb.b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;
import kwb.a;

public final class EntranceParams$TypeAdapter extends TypeAdapter	// class@001273
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
    public static final a j;

    static {
       EntranceParams$TypeAdapter.j = a.get(EntranceParams.class);
    }
    public void EntranceParams$TypeAdapter(Gson p0){
       TypeAdapter a;
       super();
       this.a = p0;
       this.b = p0.j(a.get(AdsorptionStateConfigV2.class));
       TypeAdapter typeAdapter = p0.j(PendantLocationParam$TypeAdapter.b);
       this.c = typeAdapter;
       this.d = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.e = p0.j(EntranceParams$PendantConfig$TypeAdapter.h);
       typeAdapter = p0.j(PendantBubbleConfig$TypeAdapter.b);
       this.f = typeAdapter;
       a = TypeAdapters.A;
       this.g = new KnownTypeAdapters$MapTypeAdapter(a, typeAdapter, new KnownTypeAdapters$e());
       this.h = new KnownTypeAdapters$MapTypeAdapter(a, a, new KnownTypeAdapters$e());
       this.i = p0.j(WatchVideoStyle$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, EntranceParams$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          int i = 0;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new EntranceParams();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x81158a4f:
                      if (str.equals("startTime")) {
                         i = 0;
                      }
                      break;
                    case 0x83aba2cc:
                      if (str.equals("stateSync")) {
                         i = 1;
                      }
                      break;
                    case 0x8c0030c7:
                      if (str.equals("bubbleTitles")) {
                         i = 2;
                      }
                      break;
                    case 0x9be140f6:
                      if (str.equals("pendantType")) {
                         i = 3;
                      }
                      break;
                    case 0xa0336a48:
                      if (str.equals("endTime")) {
                         i = 4;
                      }
                      break;
                    case 0xa2f89eb2:
                      if (str.equals("clickXMarkDisappealPolicy")) {
                         i = 5;
                      }
                      break;
                    case 0xa52dcc94:
                      if (str.equals("needReportWhenClose")) {
                         i = 6;
                      }
                      break;
                    case 0xab4d3443:
                      if (str.equals("supportDemote")) {
                         i = 7;
                      }
                      break;
                    case 0xaee858f5:
                      if (str.equals("pagesString")) {
                         i = 8;
                      }
                      break;
                    case 0xb907f3be:
                      if (str.equals("adsorptionStateConfigV2")) {
                         i = 9;
                      }
                      break;
                    case 0xbe071a81:
                      if (str.equals("ksOrderId")) {
                         i = 10;
                      }
                      break;
                    case 0xc3aaef43:
                      if (str.equals("onlyTk")) {
                         i = 11;
                      }
                      break;
                    case 0xe3b21a23:
                      if (str.equals("effectPolicy")) {
                         i = 12;
                      }
                      break;
                    case 0xe68be16f:
                      if (str.equals("reportId")) {
                         i = 13;
                      }
                      break;
                    case 0xf246bf16:
                      if (str.equals("suspensionStateConfig")) {
                         i = 14;
                      }
                      break;
                    case 0xf944e6bf:
                      if (str.equals("tkExtraParams")) {
                         i = 15;
                      }
                      break;
                    case 0xf9bcd825:
                      if (str.equals("watchVideoStyle")) {
                         i = 16;
                      }
                      break;
                    case 0x657efc4:
                      if (str.equals("pages")) {
                         i = 17;
                      }
                      break;
                    case 0xa8de315:
                      if (str.equals("linkUrl")) {
                         i = 18;
                      }
                      break;
                    case 0xd072e4e:
                      if (str.equals("maxClickXMarkCount")) {
                         i = 19;
                      }
                      break;
                    case 0x1ed3c9a2:
                      if (str.equals("adsorptionStateConfig")) {
                         i = 20;
                      }
                      break;
                    case 0x299a9d30:
                      if (str.equals("bubbleMap")) {
                         i = 21;
                      }
                      break;
                    case 0x3f1b6473:
                      if (str.equals("needLogin")) {
                         i = 22;
                      }
                      break;
                    case 0x57b10ef0:
                      if (str.equals("defaultDisplayStyle")) {
                         i = 23;
                      }
                      break;
                    case 0x60912cd4:
                      if (str.equals("tkBundleId")) {
                         i = 24;
                      }
                      break;
                    case 0x69da2f16:
                      if (str.equals("enableXinHuiCashIncentive")) {
                         i = 25;
                      }
                      break;
                    case 0x790c2263:
                      if (str.equals("animationHold")) {
                         i = 26;
                      }
                      break;
                    case 0x7a1b748a:
                      if (str.equals("activityId")) {
                         i = 27;
                      }
                      break;
                    case 0x7ceea2e6:
                      if (str.equals("legalArea")) {
                         i = 28;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mStartTime = KnownTypeAdapters$n.a(p0, obj.mStartTime);
                      break;
                    case 1:
                      obj.setStateSync(KnownTypeAdapters$g.a(p0, obj.getStateSync()));
                      break;
                    case 2:
                      obj.mBubbleTitles = this.h.read(p0);
                      break;
                    case 3:
                      obj.mPendantType = KnownTypeAdapters$k.a(p0, obj.mPendantType);
                      break;
                    case 4:
                      obj.mEndTime = KnownTypeAdapters$n.a(p0, obj.mEndTime);
                      break;
                    case 5:
                      obj.mDisappearPolicy = KnownTypeAdapters$k.a(p0, obj.mDisappearPolicy);
                      break;
                    case 6:
                      obj.mNeedReportWhenClose = KnownTypeAdapters$g.a(p0, obj.mNeedReportWhenClose);
                      break;
                    case 7:
                      obj.mSupportDemote = KnownTypeAdapters$g.a(p0, obj.mSupportDemote);
                      break;
                    case 8:
                      obj.mPages2 = new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new b(this)).a(p0);
                      break;
                    case 9:
                      obj.setAdsorptionStateConfigV2(this.b.read(p0));
                      break;
                    case 10:
                      obj.mKsOrderId = TypeAdapters.A.read(p0);
                      break;
                    case 11:
                      obj.mOnlyTk = KnownTypeAdapters$g.a(p0, obj.mOnlyTk);
                      break;
                    case 12:
                      obj.mEffectPolicy = KnownTypeAdapters$k.a(p0, obj.mEffectPolicy);
                      break;
                    case 13:
                      obj.mReportId = TypeAdapters.A.read(p0);
                      break;
                    case 14:
                      obj.mSuspensionConfig = this.e.read(p0);
                      break;
                    case 15:
                      obj.mTkExtraParams = TypeAdapters.A.read(p0);
                      break;
                    case 16:
                      obj.mWatchVideoStyle = this.i.read(p0);
                      break;
                    case 17:
                      obj.mPages = KnownTypeAdapters$l.a(p0);
                      break;
                    case 18:
                      obj.mLinkUrl = TypeAdapters.A.read(p0);
                      break;
                    case 19:
                      obj.mMaxCloseCount = KnownTypeAdapters$k.a(p0, obj.mMaxCloseCount);
                      break;
                    case 20:
                      obj.mAdsorptionConfig = this.e.read(p0);
                      break;
                    case 21:
                      obj.mBubbleConfigs = this.g.read(p0);
                      break;
                    case 22:
                      obj.mClickNeedCheckLogin = KnownTypeAdapters$g.a(p0, obj.mClickNeedCheckLogin);
                      break;
                    case 23:
                      obj.mDisplayStyle = KnownTypeAdapters$k.a(p0, obj.mDisplayStyle);
                      break;
                    case 24:
                      obj.mTkBundleId = TypeAdapters.A.read(p0);
                      break;
                    case 25:
                      obj.mEnableXinHuiCashIncentive = KnownTypeAdapters$g.a(p0, obj.mEnableXinHuiCashIncentive);
                      break;
                    case 26:
                      obj.mAnimationHold = KnownTypeAdapters$g.a(p0, obj.mAnimationHold);
                      break;
                    case 27:
                      obj.mPendantId = TypeAdapters.A.read(p0);
                      break;
                    case 28:
                      obj.setLegalArea(this.d.read(p0));
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EntranceParams$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.getAdsorptionStateConfigV2() != null) {
             p0.r("adsorptionStateConfigV2");
             this.b.write(p0, p1.getAdsorptionStateConfigV2());
          }
          p0.r("stateSync");
          p0.P(p1.getStateSync());
          if (p1.getLegalArea() != null) {
             p0.r("legalArea");
             this.d.write(p0, p1.getLegalArea());
          }
          if (p1.mPendantId != null) {
             p0.r("activityId");
             TypeAdapters.A.write(p0, p1.mPendantId);
          }
          if (p1.mKsOrderId != null) {
             p0.r("ksOrderId");
             TypeAdapters.A.write(p0, p1.mKsOrderId);
          }
          p0.r("defaultDisplayStyle");
          p0.K((long)p1.mDisplayStyle);
          p0.r("enableXinHuiCashIncentive");
          p0.P(p1.mEnableXinHuiCashIncentive);
          if (p1.mPages != null) {
             p0.r("pages");
             KnownTypeAdapters$l.b(p0, p1.mPages);
          }
          if (p1.mPages2 != null) {
             p0.r("pagesString");
             new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new a(this)).b(p0, p1.mPages2);
          }
          if (p1.mLinkUrl != null) {
             p0.r("linkUrl");
             TypeAdapters.A.write(p0, p1.mLinkUrl);
          }
          p0.r("effectPolicy");
          p0.K((long)p1.mEffectPolicy);
          p0.r("needLogin");
          p0.P(p1.mClickNeedCheckLogin);
          p0.r("clickXMarkDisappealPolicy");
          p0.K((long)p1.mDisappearPolicy);
          p0.r("maxClickXMarkCount");
          p0.K((long)p1.mMaxCloseCount);
          if (p1.mAdsorptionConfig != null) {
             p0.r("adsorptionStateConfig");
             this.e.write(p0, p1.mAdsorptionConfig);
          }
          if (p1.mSuspensionConfig != null) {
             p0.r("suspensionStateConfig");
             this.e.write(p0, p1.mSuspensionConfig);
          }
          if (p1.mBubbleConfigs != null) {
             p0.r("bubbleMap");
             this.g.write(p0, p1.mBubbleConfigs);
          }
          if (p1.mBubbleTitles != null) {
             p0.r("bubbleTitles");
             this.h.write(p0, p1.mBubbleTitles);
          }
          if (p1.mWatchVideoStyle != null) {
             p0.r("watchVideoStyle");
             this.i.write(p0, p1.mWatchVideoStyle);
          }
          p0.r("animationHold");
          p0.P(p1.mAnimationHold);
          p0.r("pendantType");
          p0.K((long)p1.mPendantType);
          p0.r("needReportWhenClose");
          p0.P(p1.mNeedReportWhenClose);
          if (p1.mReportId != null) {
             p0.r("reportId");
             TypeAdapters.A.write(p0, p1.mReportId);
          }
          p0.r("startTime");
          p0.K(p1.mStartTime);
          p0.r("endTime");
          p0.K(p1.mEndTime);
          p0.r("supportDemote");
          p0.P(p1.mSupportDemote);
          if (p1.mTkExtraParams != null) {
             p0.r("tkExtraParams");
             TypeAdapters.A.write(p0, p1.mTkExtraParams);
          }
          if (p1.mTkBundleId != null) {
             p0.r("tkBundleId");
             TypeAdapters.A.write(p0, p1.mTkBundleId);
          }
          p0.r("onlyTk");
          p0.P(p1.mOnlyTk);
          p0.j();
       }
       return;
    }
}
