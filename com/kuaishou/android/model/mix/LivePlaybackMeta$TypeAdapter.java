package com.kuaishou.android.model.mix.LivePlaybackMeta$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.LivePlaybackMeta;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.android.model.mix.LivePlaybackQualityPlayUrls$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$n;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kuaishou.android.model.mix.LivePlaybackMeta$TypeAdapter$b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.google.gson.stream.b;
import com.kuaishou.android.model.mix.LivePlaybackMeta$TypeAdapter$a;

public final class LivePlaybackMeta$TypeAdapter extends TypeAdapter	// class@000d03
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       LivePlaybackMeta$TypeAdapter.e = a.get(LivePlaybackMeta.class);
    }
    public void LivePlaybackMeta$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(LivePlaybackQualityPlayUrls$TypeAdapter.d);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.d = p0.j(a.get(CDNUrl.class));
    }
    public LivePlaybackMeta a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LivePlaybackMeta$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       LivePlaybackMeta livePlayback = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return livePlayback;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return livePlayback;
       }else {
          p0.c();
          LivePlaybackMeta livePlayback1 = new LivePlaybackMeta();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x81158a4f:
                   if (str.equals("startTime")) {
                      i = 0;
                   }
                   break;
                 case 0xb54d20ad:
                   if (str.equals("gameId")) {
                      i = 1;
                   }
                   break;
                 case 0xb6fab5af:
                   if (str.equals("liveCoverUrls")) {
                      i = 2;
                   }
                   break;
                 case 0xc14e566a:
                   if (str.equals("productId")) {
                      i = 3;
                   }
                   break;
                 case 0xc20f42c3:
                   if (str.equals("liveStartTime")) {
                      i = 4;
                   }
                   break;
                 case 0xd832e1c7:
                   if (str.equals("liveStreamId")) {
                      i = 5;
                   }
                   break;
                 case 0xda24df5a:
                   if (str.equals("liveCaption")) {
                      i = 6;
                   }
                   break;
                 case 0xda843c1b:
                   if (str.equals("startOffsetMs")) {
                      i = 7;
                   }
                   break;
                 case 0xeb679502:
                   if (str.equals("shopLive")) {
                      i = 8;
                   }
                   break;
                 case 0x3015c82b:
                   if (str.equals("forbidComment")) {
                      i = 9;
                   }
                   break;
                 case 0x49313aea:
                   if (str.equals("liveStreamIdStr")) {
                      i = 10;
                   }
                   break;
                 case 0x57232521:
                   if (str.equals("displayLiveStartTime")) {
                      i = 11;
                   }
                   break;
                 case 0x6ffc2e38:
                   if (str.equals("playUrls")) {
                      i = 12;
                   }
                   break;
                 case 0x774f7794:
                   if (str.equals("endOffsetMs")) {
                      i = 13;
                   }
                   break;
                 case 0x7da2a463:
                   if (str.equals("liveHighlightId")) {
                      i = 14;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   livePlayback1.mStartTime = KnownTypeAdapters$n.a(p0, livePlayback1.mStartTime);
                   break;
                 case 1:
                   livePlayback1.mGameId = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   livePlayback1.mLiveCoverUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.d, new LivePlaybackMeta$TypeAdapter$b(this)).a(p0);
                   break;
                 case 3:
                   livePlayback1.mProductId = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   livePlayback1.mLiveStartTime = KnownTypeAdapters$n.a(p0, livePlayback1.mLiveStartTime);
                   break;
                 case 5:
                   livePlayback1.mLiveStreamId = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   livePlayback1.mLiveCaption = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   livePlayback1.mStartOffsetMs = KnownTypeAdapters$n.a(p0, livePlayback1.mStartOffsetMs);
                   break;
                 case 8:
                   livePlayback1.mShopLive = KnownTypeAdapters$g.a(p0, livePlayback1.mShopLive);
                   break;
                 case 9:
                   livePlayback1.mIsCommentForbidden = KnownTypeAdapters$g.a(p0, livePlayback1.mIsCommentForbidden);
                   break;
                 case 10:
                   livePlayback1.mLiveStreamIdEncryption = TypeAdapters.A.read(p0);
                   break;
                 case 11:
                   livePlayback1.mDisplayLiveStartTime = TypeAdapters.A.read(p0);
                   break;
                 case 12:
                   livePlayback1.mQualityPlayUrls = this.c.read(p0);
                   break;
                 case 13:
                   livePlayback1.mEndOffsetMs = KnownTypeAdapters$n.a(p0, livePlayback1.mEndOffsetMs);
                   break;
                 case 14:
                   livePlayback1.mLiveHighlightId = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return livePlayback1;
       }
    }
    public void b(b p0,LivePlaybackMeta p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePlaybackMeta$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mLiveHighlightId != null) {
             p0.r("liveHighlightId");
             TypeAdapters.A.write(p0, p1.mLiveHighlightId);
          }
          if (p1.mQualityPlayUrls != null) {
             p0.r("playUrls");
             this.c.write(p0, p1.mQualityPlayUrls);
          }
          if (p1.mProductId != null) {
             p0.r("productId");
             TypeAdapters.A.write(p0, p1.mProductId);
          }
          if (p1.mGameId != null) {
             p0.r("gameId");
             TypeAdapters.A.write(p0, p1.mGameId);
          }
          p0.r("forbidComment");
          p0.P(p1.mIsCommentForbidden);
          if (p1.mLiveStreamId != null) {
             p0.r("liveStreamId");
             TypeAdapters.A.write(p0, p1.mLiveStreamId);
          }
          if (p1.mDisplayLiveStartTime != null) {
             p0.r("displayLiveStartTime");
             TypeAdapters.A.write(p0, p1.mDisplayLiveStartTime);
          }
          if (p1.mLiveCaption != null) {
             p0.r("liveCaption");
             TypeAdapters.A.write(p0, p1.mLiveCaption);
          }
          if (p1.mLiveStreamIdEncryption != null) {
             p0.r("liveStreamIdStr");
             TypeAdapters.A.write(p0, p1.mLiveStreamIdEncryption);
          }
          p0.r("shopLive");
          p0.P(p1.mShopLive);
          p0.r("liveStartTime");
          p0.K(p1.mLiveStartTime);
          p0.r("startTime");
          p0.K(p1.mStartTime);
          p0.r("startOffsetMs");
          p0.K(p1.mStartOffsetMs);
          p0.r("endOffsetMs");
          p0.K(p1.mEndOffsetMs);
          if (p1.mLiveCoverUrls != null) {
             p0.r("liveCoverUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.d, new LivePlaybackMeta$TypeAdapter$a(this)).b(p0, p1.mLiveCoverUrls);
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
