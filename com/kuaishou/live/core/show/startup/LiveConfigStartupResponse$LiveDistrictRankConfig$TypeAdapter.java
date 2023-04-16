package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveDistrictRankConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveDistrictRankConfig;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class LiveConfigStartupResponse$LiveDistrictRankConfig$TypeAdapter extends TypeAdapter	// class@001034
{
    public final Gson a;
    public static final a b;

    static {
       LiveConfigStartupResponse$LiveDistrictRankConfig$TypeAdapter.b = a.get(LiveConfigStartupResponse$LiveDistrictRankConfig.class);
    }
    public void LiveConfigStartupResponse$LiveDistrictRankConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveConfigStartupResponse$LiveDistrictRankConfig$TypeAdapter.class, "2");
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
             obj = new LiveConfigStartupResponse$LiveDistrictRankConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x884a1412:
                      if (str.equals("slideLiveBatchCount")) {
                         i = 0;
                      }
                      break;
                    case 0x9b6be2bd:
                      if (str.equals("disableJumpToLiveStream")) {
                         i = 1;
                      }
                      break;
                    case 0xb6e2cde2:
                      if (str.equals("enableLiveSlide")) {
                         i = 2;
                      }
                      break;
                    case 0x3a2cd254:
                      if (str.equals("disableShowGlobalRank")) {
                         i = 3;
                      }
                      break;
                    case 0x4a07f3d1:
                      if (str.equals("disableShowRank")) {
                         i = 4;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mSlideLiveBatchCount = KnownTypeAdapters$k.a(p0, obj.mSlideLiveBatchCount);
                      break;
                    case 1:
                      obj.mDisableJumpToLiveStream = KnownTypeAdapters$g.a(p0, obj.mDisableJumpToLiveStream);
                      break;
                    case 2:
                      obj.mEnableLiveSlide = KnownTypeAdapters$g.a(p0, obj.mEnableLiveSlide);
                      break;
                    case 3:
                      obj.mDisableShowGlobalRank = KnownTypeAdapters$g.a(p0, obj.mDisableShowGlobalRank);
                      break;
                    case 4:
                      obj.mDisableShowRank = KnownTypeAdapters$g.a(p0, obj.mDisableShowRank);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveConfigStartupResponse$LiveDistrictRankConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("disableShowRank");
          p0.P(p1.mDisableShowRank);
          p0.r("disableJumpToLiveStream");
          p0.P(p1.mDisableJumpToLiveStream);
          p0.r("disableShowGlobalRank");
          p0.P(p1.mDisableShowGlobalRank);
          p0.r("enableLiveSlide");
          p0.P(p1.mEnableLiveSlide);
          p0.r("slideLiveBatchCount");
          p0.K((long)p1.mSlideLiveBatchCount);
          p0.j();
       }
       return;
    }
}
