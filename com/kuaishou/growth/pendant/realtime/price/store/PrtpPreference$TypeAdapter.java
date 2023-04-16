package com.kuaishou.growth.pendant.realtime.price.store.PrtpPreference$TypeAdapter;
import com.google.gson.TypeAdapter;
import af0.a;
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
import com.google.gson.stream.b;

public final class PrtpPreference$TypeAdapter extends TypeAdapter	// class@0006d1
{
    public final Gson a;
    public static final a b;

    static {
       PrtpPreference$TypeAdapter.b = a.get(a.class);
    }
    public void PrtpPreference$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PrtpPreference$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new a();
             while (p0.l()) {
                Objects.requireNonNull(p0.y());
                p0.Q();
             }
             p0.j();
          }
          obj = null;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PrtpPreference$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.j();
       }
       return;
    }
}
