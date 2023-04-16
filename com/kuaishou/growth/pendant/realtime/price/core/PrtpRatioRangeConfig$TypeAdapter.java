package com.kuaishou.growth.pendant.realtime.price.core.PrtpRatioRangeConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpRatioRangeConfig;
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
import com.vimeo.stag.KnownTypeAdapters$j;
import com.google.gson.stream.b;

public final class PrtpRatioRangeConfig$TypeAdapter extends TypeAdapter	// class@0006a9
{
    public final Gson a;
    public static final a b;

    static {
       PrtpRatioRangeConfig$TypeAdapter.b = a.get(PrtpRatioRangeConfig.class);
    }
    public void PrtpRatioRangeConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PrtpRatioRangeConfig$TypeAdapter.class, "2");
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
             obj = new PrtpRatioRangeConfig();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("max")) {
                   if (!str1.equals("min")) {
                      p0.Q();
                   }else {
                      obj.minRatio = KnownTypeAdapters$j.a(p0, obj.minRatio);
                   }
                }else {
                   obj.maxRatio = KnownTypeAdapters$j.a(p0, obj.maxRatio);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PrtpRatioRangeConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("min");
          p0.J((double)p1.minRatio);
          p0.r("max");
          p0.J((double)p1.maxRatio);
          p0.j();
       }
       return;
    }
}
