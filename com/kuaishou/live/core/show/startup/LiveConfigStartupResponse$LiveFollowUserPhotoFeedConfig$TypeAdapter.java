package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFollowUserPhotoFeedConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFollowUserPhotoFeedConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.List;
import com.google.gson.stream.b;

public final class LiveConfigStartupResponse$LiveFollowUserPhotoFeedConfig$TypeAdapter extends TypeAdapter	// class@001040
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       LiveConfigStartupResponse$LiveFollowUserPhotoFeedConfig$TypeAdapter.c = a.get(LiveConfigStartupResponse$LiveFollowUserPhotoFeedConfig.class);
    }
    public void LiveConfigStartupResponse$LiveFollowUserPhotoFeedConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveConfigStartupResponse$LiveFollowUserPhotoFeedConfig$TypeAdapter.class, "2");
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
             obj = new LiveConfigStartupResponse$LiveFollowUserPhotoFeedConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x8ae44d84:
                      if (str.equals("recoLiveStartText")) {
                         i = 0;
                      }
                      break;
                    case 0xd3e7a259:
                      if (str.equals("liveFollowFirstDelayTimeGap")) {
                         i = 1;
                      }
                      break;
                    case 0xd95ef4c5:
                      if (str.equals("disableLiveFollow")) {
                         i = 2;
                      }
                      break;
                    case 0xec71a152:
                      if (str.equals("linkedRoomList")) {
                         i = 3;
                      }
                      break;
                    case 0xf910d218:
                      if (str.equals("recoNewLiveTimesPerDay")) {
                         i = 4;
                      }
                      break;
                    case 0x18df5fb2:
                      if (str.equals("recoNewLiveInterval")) {
                         i = 5;
                      }
                      break;
                    case 0x68956bd5:
                      if (str.equals("disableLiveFollowStartNotice")) {
                         i = 6;
                      }
                      break;
                    case 0x71b0118e:
                      if (str.equals("intervalBetweenRecoNewLiveAndFollowNewLive")) {
                         i = 7;
                      }
                      break;
                    case 0x76d4255f:
                      if (str.equals("liveFollowStartNoticeShowInterval")) {
                         i = 8;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mFollowUserSideBarRecoLiveNoticeText = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mFirstDelayTimeMs = KnownTypeAdapters$n.a(p0, obj.mFirstDelayTimeMs);
                      break;
                    case 2:
                      obj.mDisableLiveFollow = KnownTypeAdapters$g.a(p0, obj.mDisableLiveFollow);
                      break;
                    case 3:
                      obj.mLiveChainImmediatelyRequestAnchorIdList = this.b.read(p0);
                      break;
                    case 4:
                      obj.mFollowUserSideBarRecoLiveNoticeCountByOneDay = KnownTypeAdapters$k.a(p0, obj.mFollowUserSideBarRecoLiveNoticeCountByOneDay);
                      break;
                    case 5:
                      obj.mFollowUserSideBarRecoLiveNoticeShowIntervalByRecoNoticeMs = KnownTypeAdapters$n.a(p0, obj.mFollowUserSideBarRecoLiveNoticeShowIntervalByRecoNoticeMs);
                      break;
                    case 6:
                      obj.mDisableLiveFollowUserPhotoFeedNotice = KnownTypeAdapters$g.a(p0, obj.mDisableLiveFollowUserPhotoFeedNotice);
                      break;
                    case 7:
                      obj.mFollowUserSideBarRecoLiveNoticeShowIntervalByFollowNoticeMs = KnownTypeAdapters$n.a(p0, obj.mFollowUserSideBarRecoLiveNoticeShowIntervalByFollowNoticeMs);
                      break;
                    case 8:
                      obj.mLiveFollowUserPhotoFeedNoticeShowInterval = KnownTypeAdapters$n.a(p0, obj.mLiveFollowUserPhotoFeedNoticeShowInterval);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveConfigStartupResponse$LiveFollowUserPhotoFeedConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("disableLiveFollow");
          p0.P(p1.mDisableLiveFollow);
          p0.r("disableLiveFollowStartNotice");
          p0.P(p1.mDisableLiveFollowUserPhotoFeedNotice);
          p0.r("liveFollowFirstDelayTimeGap");
          p0.K(p1.mFirstDelayTimeMs);
          p0.r("liveFollowStartNoticeShowInterval");
          p0.K(p1.mLiveFollowUserPhotoFeedNoticeShowInterval);
          if (p1.mLiveChainImmediatelyRequestAnchorIdList != null) {
             p0.r("linkedRoomList");
             this.b.write(p0, p1.mLiveChainImmediatelyRequestAnchorIdList);
          }
          p0.r("intervalBetweenRecoNewLiveAndFollowNewLive");
          p0.K(p1.mFollowUserSideBarRecoLiveNoticeShowIntervalByFollowNoticeMs);
          p0.r("recoNewLiveInterval");
          p0.K(p1.mFollowUserSideBarRecoLiveNoticeShowIntervalByRecoNoticeMs);
          p0.r("recoNewLiveTimesPerDay");
          p0.K((long)p1.mFollowUserSideBarRecoLiveNoticeCountByOneDay);
          if (p1.mFollowUserSideBarRecoLiveNoticeText != null) {
             p0.r("recoLiveStartText");
             TypeAdapters.A.write(p0, p1.mFollowUserSideBarRecoLiveNoticeText);
          }
          p0.j();
       }
       return;
    }
}
