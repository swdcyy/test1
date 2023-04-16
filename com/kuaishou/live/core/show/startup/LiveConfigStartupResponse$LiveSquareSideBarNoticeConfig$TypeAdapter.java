package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
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
import com.google.gson.stream.b;

public final class LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig$TypeAdapter extends TypeAdapter	// class@00107f
{
    public final Gson a;
    public static final a b;

    static {
       LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig$TypeAdapter.b = a.get(LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig.class);
    }
    public void LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig$TypeAdapter.class, "2");
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
             obj = new LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x84e56c4d:
                      if (str.equals("maxNoticeShowTimes")) {
                         i = 0;
                      }
                      break;
                    case 0xbcb86a7c:
                      if (str.equals("disableNoticeV2")) {
                         i = 1;
                      }
                      break;
                    case 0xd5a4cc96:
                      if (str.equals("showNoticeFeedWatchDurationMs")) {
                         i = 2;
                      }
                      break;
                    case 0x1adfbdc3:
                      if (str.equals("noticeFeedEntranceShowDurationMs")) {
                         i = 3;
                      }
                      break;
                    case 0x500f3920:
                      if (str.equals("noticeShowIntervalMs")) {
                         i = 4;
                      }
                      break;
                    case 0x632cf36d:
                      if (str.equals("noticeFeedShowDurationMs")) {
                         i = 5;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mLiveSquareMaxNoticeShowCount = KnownTypeAdapters$k.a(p0, obj.mLiveSquareMaxNoticeShowCount);
                      break;
                    case 1:
                      obj.mDisableLiveSquareNoticeV2 = KnownTypeAdapters$g.a(p0, obj.mDisableLiveSquareNoticeV2);
                      break;
                    case 2:
                      obj.mDelayStartLoopNoticeMs = KnownTypeAdapters$n.a(p0, obj.mDelayStartLoopNoticeMs);
                      break;
                    case 3:
                      obj.mNoticeEntranceShowDurationMs = KnownTypeAdapters$n.a(p0, obj.mNoticeEntranceShowDurationMs);
                      break;
                    case 4:
                      obj.mLiveSquareNoticeShowIntervalMs = KnownTypeAdapters$n.a(p0, obj.mLiveSquareNoticeShowIntervalMs);
                      break;
                    case 5:
                      obj.mLiveSquareNoticeFeedStayDurationMs = KnownTypeAdapters$n.a(p0, obj.mLiveSquareNoticeFeedStayDurationMs);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("maxNoticeShowTimes");
          p0.K((long)p1.mLiveSquareMaxNoticeShowCount);
          p0.r("noticeShowIntervalMs");
          p0.K(p1.mLiveSquareNoticeShowIntervalMs);
          p0.r("noticeFeedShowDurationMs");
          p0.K(p1.mLiveSquareNoticeFeedStayDurationMs);
          p0.r("disableNoticeV2");
          p0.P(p1.mDisableLiveSquareNoticeV2);
          p0.r("showNoticeFeedWatchDurationMs");
          p0.K(p1.mDelayStartLoopNoticeMs);
          p0.r("noticeFeedEntranceShowDurationMs");
          p0.K(p1.mNoticeEntranceShowDurationMs);
          p0.j();
       }
       return;
    }
}
