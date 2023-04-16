package com.kuaishou.live.core.show.share.LiveAudienceShareHighlightConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.share.LiveAudienceShareHighlightConfig;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class LiveAudienceShareHighlightConfig$TypeAdapter extends TypeAdapter	// class@001006
{
    public final Gson a;
    public static final a b;

    static {
       LiveAudienceShareHighlightConfig$TypeAdapter.b = a.get(LiveAudienceShareHighlightConfig.class);
    }
    public void LiveAudienceShareHighlightConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceShareHighlightConfig$TypeAdapter.class, "2");
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
             obj = new LiveAudienceShareHighlightConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x94cdf5b9:
                      if (str.equals("shareTitle")) {
                         i = 0;
                      }
                      break;
                    case 0x9a1667e7:
                      if (str.equals("needFollow")) {
                         i = 1;
                      }
                      break;
                    case 0xcbac62bd:
                      if (str.equals("maxAllowedDailyShowCount")) {
                         i = 2;
                      }
                      break;
                    case 0x788028d:
                      if (str.equals("needWatchDuration")) {
                         i = 3;
                      }
                      break;
                    case 0x4a7de4f3:
                      if (str.equals("interActivityTargetCount")) {
                         i = 4;
                      }
                      break;
                    case 0x70600fa2:
                      if (str.equals("maxAllowedLiveStreamShowCount")) {
                         i = 5;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mShareTitle = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mNeedFollow = KnownTypeAdapters$g.a(p0, obj.mNeedFollow);
                      break;
                    case 2:
                      obj.mMaxShowCountInOneDay = KnownTypeAdapters$k.a(p0, obj.mMaxShowCountInOneDay);
                      break;
                    case 3:
                      obj.mNeedWatchDurationMs = KnownTypeAdapters$n.a(p0, obj.mNeedWatchDurationMs);
                      break;
                    case 4:
                      obj.mInterActivityTargetCount = KnownTypeAdapters$k.a(p0, obj.mInterActivityTargetCount);
                      break;
                    case 5:
                      obj.mMaxShowCountInOneStream = KnownTypeAdapters$k.a(p0, obj.mMaxShowCountInOneStream);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceShareHighlightConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("maxAllowedLiveStreamShowCount");
          p0.K((long)p1.mMaxShowCountInOneStream);
          p0.r("maxAllowedDailyShowCount");
          p0.K((long)p1.mMaxShowCountInOneDay);
          p0.r("interActivityTargetCount");
          p0.K((long)p1.mInterActivityTargetCount);
          p0.r("needWatchDuration");
          p0.K(p1.mNeedWatchDurationMs);
          p0.r("needFollow");
          p0.P(p1.mNeedFollow);
          if (p1.mShareTitle != null) {
             p0.r("shareTitle");
             TypeAdapters.A.write(p0, p1.mShareTitle);
          }
          p0.j();
       }
       return;
    }
}
