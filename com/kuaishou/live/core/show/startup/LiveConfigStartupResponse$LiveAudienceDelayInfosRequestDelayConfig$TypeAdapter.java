package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveAudienceDelayInfosRequestDelayConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveAudienceDelayInfosRequestDelayConfig;
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
import com.google.gson.stream.b;

public final class LiveConfigStartupResponse$LiveAudienceDelayInfosRequestDelayConfig$TypeAdapter extends TypeAdapter	// class@001028
{
    public final Gson a;
    public static final a b;

    static {
       LiveConfigStartupResponse$LiveAudienceDelayInfosRequestDelayConfig$TypeAdapter.b = a.get(LiveConfigStartupResponse$LiveAudienceDelayInfosRequestDelayConfig.class);
    }
    public void LiveConfigStartupResponse$LiveAudienceDelayInfosRequestDelayConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveConfigStartupResponse$LiveAudienceDelayInfosRequestDelayConfig$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          String str = null;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new LiveConfigStartupResponse$LiveAudienceDelayInfosRequestDelayConfig();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("callLiteDelayInfosApiDelayMs")) {
                   if (!str1.equals("callDelayInfosApiDelayMs")) {
                      p0.Q();
                   }else {
                      obj.mLiveDelayInfosRequestDelayMs = KnownTypeAdapters$n.a(p0, obj.mLiveDelayInfosRequestDelayMs);
                   }
                }else {
                   obj.mLiteDelayInfosApiDelayMs = KnownTypeAdapters$n.a(p0, obj.mLiteDelayInfosApiDelayMs);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveConfigStartupResponse$LiveAudienceDelayInfosRequestDelayConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("callDelayInfosApiDelayMs");
          p0.K(p1.mLiveDelayInfosRequestDelayMs);
          p0.r("callLiteDelayInfosApiDelayMs");
          p0.K(p1.mLiteDelayInfosApiDelayMs);
          p0.j();
       }
       return;
    }
}
