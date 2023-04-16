package com.kuaishou.growth.pendant.realtime.price.core.PrtpActivityConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpActivityConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpRatioRangeConfig$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$j;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpRatioRangeConfig;
import com.google.gson.stream.b;

public final class PrtpActivityConfig$TypeAdapter extends TypeAdapter	// class@000697
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PrtpActivityConfig$TypeAdapter.c = a.get(PrtpActivityConfig.class);
    }
    public void PrtpActivityConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PrtpRatioRangeConfig$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PrtpActivityConfig$TypeAdapter.class, "2");
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
             obj = new PrtpActivityConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x98bff1a3:
                      if (str.equals("nextCircle")) {
                         i = 0;
                      }
                      break;
                    case 0xb3748708:
                      if (str.equals("clientRealTimeRatioRange")) {
                         i = 1;
                      }
                      break;
                    case 0x40869f2c:
                      if (str.equals("recoPid")) {
                         i = 2;
                      }
                      break;
                    case 0x67e8f11d:
                      if (str.equals("initialPriceAmount")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.nextCircle = KnownTypeAdapters$k.a(p0, obj.nextCircle);
                      break;
                    case 1:
                      obj.prtpRatioRangeConfig = this.b.read(p0);
                      break;
                    case 2:
                      obj.recoPid = KnownTypeAdapters$j.a(p0, obj.recoPid);
                      break;
                    case 3:
                      obj.startCoinLevel = KnownTypeAdapters$k.a(p0, obj.startCoinLevel);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PrtpActivityConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.prtpRatioRangeConfig != null) {
             p0.r("clientRealTimeRatioRange");
             this.b.write(p0, p1.prtpRatioRangeConfig);
          }
          p0.r("initialPriceAmount");
          p0.K((long)p1.startCoinLevel);
          p0.r("recoPid");
          p0.J((double)p1.recoPid);
          p0.r("nextCircle");
          p0.K((long)p1.nextCircle);
          p0.j();
       }
       return;
    }
}
