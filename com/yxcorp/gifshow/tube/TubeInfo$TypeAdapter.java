package com.yxcorp.gifshow.tube.TubeInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.tube.TubeInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.tube.TubeContentTag;
import com.yxcorp.gifshow.tube.ExtraParams;
import com.yxcorp.gifshow.tube.TubeChannelInfo$TypeAdapter;
import com.yxcorp.gifshow.tube.TubePurchaseInfo$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kwai.framework.model.user.User$TypeAdapter;
import com.yxcorp.gifshow.tube.TubeEpisodeInfo$TypeAdapter;
import com.yxcorp.gifshow.tube.TubeRankInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import ilc.r;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.yxcorp.gifshow.tube.TubeRankInfo;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$n;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.yxcorp.gifshow.tube.TubeChannelInfo;
import com.yxcorp.gifshow.tube.TubeEpisodeInfo;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.tube.TubePurchaseInfo;
import com.google.gson.stream.b;
import ilc.q;

public final class TubeInfo$TypeAdapter extends TypeAdapter	// class@001e18
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
    public static final a k;

    static {
       TubeInfo$TypeAdapter.k = a.get(TubeInfo.class);
    }
    public void TubeInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(TubeChannelInfo$TypeAdapter.b);
       this.b = typeAdapter;
       this.c = p0.j(TubePurchaseInfo$TypeAdapter.b);
       this.d = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.e = p0.j(a.get(CDNUrl.class));
       this.f = p0.j(User$TypeAdapter.G);
       this.g = p0.j(TubeEpisodeInfo$TypeAdapter.d);
       this.h = p0.j(TubeRankInfo$TypeAdapter.b);
       this.i = p0.j(a.get(TubeContentTag.class));
       this.j = p0.j(a.get(ExtraParams.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, TubeInfo$TypeAdapter.class, "2");
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
             obj = new TubeInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x81235559:
                      if (str.equals("isOffline")) {
                         i = 0;
                      }
                      break;
                    case 0x920f754f:
                      if (str.equals("purchaseInfo")) {
                         i = 1;
                      }
                      break;
                    case 0x993583fc:
                      if (str.equals("description")) {
                         i = 2;
                      }
                      break;
                    case 0x9f3a1d2b:
                      if (str.equals("firstEpisode")) {
                         i = 3;
                      }
                      break;
                    case 0xa0b1056a:
                      if (str.equals("viewCount")) {
                         i = 4;
                      }
                      break;
                    case 0xa89067bc:
                      if (str.equals("isFinished")) {
                         i = 5;
                      }
                      break;
                    case 0xac2d218b:
                      if (str.equals("author")) {
                         i = 6;
                      }
                      break;
                    case 0xac781e00:
                      if (str.equals("multipleChannels")) {
                         i = 7;
                      }
                      break;
                    case 0xaf909138:
                      if (str.equals("totalEpisodeCount")) {
                         i = 8;
                      }
                      break;
                    case 0xb328ac3d:
                      if (str.equals("expTag")) {
                         i = 9;
                      }
                      break;
                    case 0xc8a49f18:
                      if (str.equals("canReserved")) {
                         i = 10;
                      }
                      break;
                    case 0xcc90f6bf:
                      if (str.equals("tubeId")) {
                         i = 11;
                      }
                      break;
                    case 0xef00128a:
                      if (str.equals("lastSeenEpisode")) {
                         i = 12;
                      }
                      break;
                    case 0xfa2ebeed:
                      if (str.equals("bizType")) {
                         i = 13;
                      }
                      break;
                    case 0x337a8b:
                      if (str.equals("name")) {
                         i = 14;
                      }
                      break;
                    case 0x624bf4e:
                      if (str.equals("llsid")) {
                         i = 15;
                      }
                      break;
                    case 0xfc49461:
                      if (str.equals("contentTag")) {
                         i = 16;
                      }
                      break;
                    case 0x143fce85:
                      if (str.equals("lastEpisode")) {
                         i = 17;
                      }
                      break;
                    case 0x2c0b7d03:
                      if (str.equals("channel")) {
                         i = 18;
                      }
                      break;
                    case 0x38b6c924:
                      if (str.equals("isSubscribed")) {
                         i = 19;
                      }
                      break;
                    case 0x3b1ff2b0:
                      if (str.equals("lastEpisodeName")) {
                         i = 20;
                      }
                      break;
                    case 0x4b1d65bc:
                      if (str.equals("totalEpisodeCountIgnoreStatus")) {
                         i = 21;
                      }
                      break;
                    case 0x4b3c2db6:
                      if (str.equals("extraParams")) {
                         i = 22;
                      }
                      break;
                    case 0x5545f2bb:
                      if (str.equals("landscape")) {
                         i = 23;
                      }
                      break;
                    case 0x556423d0:
                      if (str.equals("channels")) {
                         i = 24;
                      }
                      break;
                    case 0x57dd41e5:
                      if (str.equals("subscribeCount")) {
                         i = 25;
                      }
                      break;
                    case 0x5a320960:
                      if (str.equals("serverExpTag")) {
                         i = 26;
                      }
                      break;
                    case 0x72229a04:
                      if (str.equals("rankingInfo")) {
                         i = 27;
                      }
                      break;
                    case 0x7600fd3b:
                      if (str.equals("coverUrls")) {
                         i = 28;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.isOffline = KnownTypeAdapters$g.a(p0, obj.isOffline);
                      break;
                    case 1:
                      obj.mPurchaseInfo = this.c.read(p0);
                      break;
                    case 2:
                      obj.mDescription = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mFirstEpisode = this.g.read(p0);
                      break;
                    case 4:
                      obj.mViewCount = KnownTypeAdapters$n.a(p0, obj.mViewCount);
                      break;
                    case 5:
                      obj.isFinished = KnownTypeAdapters$g.a(p0, obj.isFinished);
                      break;
                    case 6:
                      obj.mUser = this.f.read(p0);
                      break;
                    case 7:
                      obj.mMultipleChannels = this.d.read(p0);
                      break;
                    case 8:
                      obj.mTotalEpisodeCount = KnownTypeAdapters$n.a(p0, obj.mTotalEpisodeCount);
                      break;
                    case 9:
                      obj.expTag = TypeAdapters.A.read(p0);
                      break;
                    case 10:
                      obj.mCanReserved = KnownTypeAdapters$g.a(p0, obj.mCanReserved);
                      break;
                    case 11:
                      obj.mTubeId = TypeAdapters.A.read(p0);
                      break;
                    case 12:
                      obj.mLastSeenEpisode = this.g.read(p0);
                      break;
                    case 13:
                      obj.mBizType = KnownTypeAdapters$k.a(p0, obj.mBizType);
                      break;
                    case 14:
                      obj.mName = TypeAdapters.A.read(p0);
                      break;
                    case 15:
                      obj.llsid = TypeAdapters.A.read(p0);
                      break;
                    case 16:
                      obj.mTubeContentTag = this.i.read(p0);
                      break;
                    case 17:
                      obj.mLatestEpisode = this.g.read(p0);
                      break;
                    case 18:
                      obj.mChannel = this.b.read(p0);
                      break;
                    case 19:
                      obj.isSubscribed = KnownTypeAdapters$g.a(p0, obj.isSubscribed);
                      break;
                    case 20:
                      obj.mLastEpisodeName = TypeAdapters.A.read(p0);
                      break;
                    case 21:
                      obj.mTotalEpisodeCountIgnoreStatus = KnownTypeAdapters$n.a(p0, obj.mTotalEpisodeCountIgnoreStatus);
                      break;
                    case 22:
                      obj.mExtraParams = this.j.read(p0);
                      break;
                    case 23:
                      obj.isLandscape = KnownTypeAdapters$g.a(p0, obj.isLandscape);
                      break;
                    case 24:
                      obj.mChannels = this.d.read(p0);
                      break;
                    case 25:
                      obj.mSubscribeCount = KnownTypeAdapters$n.a(p0, obj.mSubscribeCount);
                      break;
                    case 26:
                      obj.serverExpTag = TypeAdapters.A.read(p0);
                      break;
                    case 27:
                      obj.mTubeRankInfo = this.h.read(p0);
                      break;
                    case 28:
                      obj.mCoverUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.e, new r(this)).a(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TubeInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mTubeId != null) {
             p0.r("tubeId");
             TypeAdapters.A.write(p0, p1.mTubeId);
          }
          if (p1.mName != null) {
             p0.r("name");
             TypeAdapters.A.write(p0, p1.mName);
          }
          if (p1.mChannel != null) {
             p0.r("channel");
             this.b.write(p0, p1.mChannel);
          }
          if (p1.mPurchaseInfo != null) {
             p0.r("purchaseInfo");
             this.c.write(p0, p1.mPurchaseInfo);
          }
          if (p1.mChannels != null) {
             p0.r("channels");
             this.d.write(p0, p1.mChannels);
          }
          if (p1.mMultipleChannels != null) {
             p0.r("multipleChannels");
             this.d.write(p0, p1.mMultipleChannels);
          }
          if (p1.mDescription != null) {
             p0.r("description");
             TypeAdapters.A.write(p0, p1.mDescription);
          }
          if (p1.mCoverUrls != null) {
             p0.r("coverUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.e, new q(this)).b(p0, p1.mCoverUrls);
          }
          if (p1.mUser != null) {
             p0.r("author");
             this.f.write(p0, p1.mUser);
          }
          p0.r("landscape");
          p0.P(p1.isLandscape);
          p0.r("isOffline");
          p0.P(p1.isOffline);
          p0.r("isFinished");
          p0.P(p1.isFinished);
          p0.r("subscribeCount");
          p0.K(p1.mSubscribeCount);
          p0.r("viewCount");
          p0.K(p1.mViewCount);
          p0.r("totalEpisodeCount");
          p0.K(p1.mTotalEpisodeCount);
          p0.r("totalEpisodeCountIgnoreStatus");
          p0.K(p1.mTotalEpisodeCountIgnoreStatus);
          if (p1.mLastEpisodeName != null) {
             p0.r("lastEpisodeName");
             TypeAdapters.A.write(p0, p1.mLastEpisodeName);
          }
          if (p1.mFirstEpisode != null) {
             p0.r("firstEpisode");
             this.g.write(p0, p1.mFirstEpisode);
          }
          if (p1.mLatestEpisode != null) {
             p0.r("lastEpisode");
             this.g.write(p0, p1.mLatestEpisode);
          }
          if (p1.mLastSeenEpisode != null) {
             p0.r("lastSeenEpisode");
             this.g.write(p0, p1.mLastSeenEpisode);
          }
          p0.r("isSubscribed");
          p0.P(p1.isSubscribed);
          if (p1.mTubeRankInfo != null) {
             p0.r("rankingInfo");
             this.h.write(p0, p1.mTubeRankInfo);
          }
          p0.r("bizType");
          p0.K((long)p1.mBizType);
          if (p1.mTubeContentTag != null) {
             p0.r("contentTag");
             this.i.write(p0, p1.mTubeContentTag);
          }
          if (p1.mExtraParams != null) {
             p0.r("extraParams");
             this.j.write(p0, p1.mExtraParams);
          }
          if (p1.llsid != null) {
             p0.r("llsid");
             TypeAdapters.A.write(p0, p1.llsid);
          }
          if (p1.expTag != null) {
             p0.r("expTag");
             TypeAdapters.A.write(p0, p1.expTag);
          }
          if (p1.serverExpTag != null) {
             p0.r("serverExpTag");
             TypeAdapters.A.write(p0, p1.serverExpTag);
          }
          p0.r("canReserved");
          p0.P(p1.mCanReserved);
          p0.j();
       }
       return;
    }
}
