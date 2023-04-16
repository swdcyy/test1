package com.kuaishou.android.model.mix.CoronaExpParams$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.CoronaExpParams;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class CoronaExpParams$TypeAdapter extends TypeAdapter	// class@000c09
{
    public final Gson a;
    public static final a b;

    static {
       CoronaExpParams$TypeAdapter.b = a.get(CoronaExpParams.class);
    }
    public void CoronaExpParams$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public CoronaExpParams a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CoronaExpParams$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       CoronaExpParams uCoronaExpPa = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCoronaExpPa;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCoronaExpPa;
       }else {
          p0.c();
          CoronaExpParams uCoronaExpPa1 = new CoronaExpParams();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("disableCinemaNotice")) {
                if (!str.equals("coronaTvName")) {
                   p0.Q();
                }else {
                   uCoronaExpPa1.setMCoronaTvName(TypeAdapters.A.read(p0));
                }
             }else {
                uCoronaExpPa1.setMDisableCinemaNotice(KnownTypeAdapters$g.a(p0, uCoronaExpPa1.getMDisableCinemaNotice()));
             }
          }
          p0.j();
          return uCoronaExpPa1;
       }
    }
    public void b(b p0,CoronaExpParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoronaExpParams$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.getMCoronaTvName() != null) {
             p0.r("coronaTvName");
             TypeAdapters.A.write(p0, p1.getMCoronaTvName());
          }
          p0.r("disableCinemaNotice");
          p0.P(p1.getMDisableCinemaNotice());
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
