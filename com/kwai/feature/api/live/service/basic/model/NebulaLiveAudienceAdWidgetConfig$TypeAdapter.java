package com.kwai.feature.api.live.service.basic.model.NebulaLiveAudienceAdWidgetConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.feature.api.live.service.basic.model.NebulaLiveAudienceAdWidgetConfig;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class NebulaLiveAudienceAdWidgetConfig$TypeAdapter extends TypeAdapter	// class@00100a
{
    public final Gson a;
    public static final a b;

    static {
       NebulaLiveAudienceAdWidgetConfig$TypeAdapter.b = a.get(NebulaLiveAudienceAdWidgetConfig.class);
    }
    public void NebulaLiveAudienceAdWidgetConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, NebulaLiveAudienceAdWidgetConfig$TypeAdapter.class, "2");
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
             obj = new NebulaLiveAudienceAdWidgetConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x82615edd:
                      if (str.equals("firstDisplayIntervalMs")) {
                         i = 0;
                      }
                      break;
                    case 0xdfafacbc:
                      if (str.equals("displayDurationMs")) {
                         i = 1;
                      }
                      break;
                    case 0x6942258:
                      if (str.equals("title")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mFirstDisplayIntervalMs = KnownTypeAdapters$n.a(p0, obj.mFirstDisplayIntervalMs);
                      break;
                    case 1:
                      obj.mDisplayDurationMs = KnownTypeAdapters$n.a(p0, obj.mDisplayDurationMs);
                      break;
                    case 2:
                      obj.mTitle = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NebulaLiveAudienceAdWidgetConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          p0.r("firstDisplayIntervalMs");
          p0.K(p1.mFirstDisplayIntervalMs);
          p0.r("displayDurationMs");
          p0.K(p1.mDisplayDurationMs);
          p0.j();
       }
       return;
    }
}
