package com.kuaishou.android.model.mix.HorizontalHolidayEggsResource$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.HorizontalHolidayEggsResource;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class HorizontalHolidayEggsResource$TypeAdapter extends TypeAdapter	// class@000ca0
{
    public final Gson a;
    public static final a b;

    static {
       HorizontalHolidayEggsResource$TypeAdapter.b = a.get(HorizontalHolidayEggsResource.class);
    }
    public void HorizontalHolidayEggsResource$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public HorizontalHolidayEggsResource a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, HorizontalHolidayEggsResource$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       HorizontalHolidayEggsResource horizontalHo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return horizontalHo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return horizontalHo;
       }else {
          p0.c();
          HorizontalHolidayEggsResource horizontalHo1 = new HorizontalHolidayEggsResource();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("useType")) {
                if (!str.equals("url")) {
                   p0.Q();
                }else {
                   horizontalHo1.mUrl = TypeAdapters.A.read(p0);
                }
             }else {
                horizontalHo1.mUseType = KnownTypeAdapters$k.a(p0, horizontalHo1.mUseType);
             }
          }
          p0.j();
          return horizontalHo1;
       }
    }
    public void b(b p0,HorizontalHolidayEggsResource p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HorizontalHolidayEggsResource$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mUrl != null) {
             p0.r("url");
             TypeAdapters.A.write(p0, p1.mUrl);
          }
          p0.r("useType");
          p0.K((long)p1.mUseType);
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
