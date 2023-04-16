package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveEscrowNoticeConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveEscrowNoticeConfig;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class LiveConfigStartupResponse$LiveEscrowNoticeConfig$TypeAdapter extends TypeAdapter	// class@001037
{
    public final Gson a;
    public static final a b;

    static {
       LiveConfigStartupResponse$LiveEscrowNoticeConfig$TypeAdapter.b = a.get(LiveConfigStartupResponse$LiveEscrowNoticeConfig.class);
    }
    public void LiveConfigStartupResponse$LiveEscrowNoticeConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveConfigStartupResponse$LiveEscrowNoticeConfig$TypeAdapter.class, "2");
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
             obj = new LiveConfigStartupResponse$LiveEscrowNoticeConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xa33629ca:
                      if (str.equals("closeEntrustMsg")) {
                         i = 0;
                      }
                      break;
                    case 0xbe2f6509:
                      if (str.equals("guidanceMsg")) {
                         i = 1;
                      }
                      break;
                    case 0x47cbb39c:
                      if (str.equals("openEntrustMsg")) {
                         i = 2;
                      }
                      break;
                    case 0x75e4dc8d:
                      if (str.equals("topBannerNoticeShowDurationMills")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mCloseEscrowMessage = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mGuidanceMessage = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mOpenEscrowMessage = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mTopBannerNoticeShowDurationMs = KnownTypeAdapters$n.a(p0, obj.mTopBannerNoticeShowDurationMs);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveConfigStartupResponse$LiveEscrowNoticeConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mGuidanceMessage != null) {
             p0.r("guidanceMsg");
             TypeAdapters.A.write(p0, p1.mGuidanceMessage);
          }
          if (p1.mOpenEscrowMessage != null) {
             p0.r("openEntrustMsg");
             TypeAdapters.A.write(p0, p1.mOpenEscrowMessage);
          }
          if (p1.mCloseEscrowMessage != null) {
             p0.r("closeEntrustMsg");
             TypeAdapters.A.write(p0, p1.mCloseEscrowMessage);
          }
          p0.r("topBannerNoticeShowDurationMills");
          p0.K(p1.mTopBannerNoticeShowDurationMs);
          p0.j();
       }
       return;
    }
}
