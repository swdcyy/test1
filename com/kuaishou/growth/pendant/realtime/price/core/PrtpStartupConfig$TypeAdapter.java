package com.kuaishou.growth.pendant.realtime.price.core.PrtpStartupConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import we0.n;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpActivityConfig$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpActivityConfig;
import com.google.gson.stream.b;

public final class PrtpStartupConfig$TypeAdapter extends TypeAdapter	// class@0006ae
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PrtpStartupConfig$TypeAdapter.c = a.get(n.class);
    }
    public void PrtpStartupConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PrtpActivityConfig$TypeAdapter.c);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PrtpStartupConfig$TypeAdapter.class, "2");
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
             obj = new n();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("nebulaActivityConfig")) {
                   p0.Q();
                }else {
                   obj.prtpActivityConfig = this.b.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PrtpStartupConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.prtpActivityConfig != null) {
             p0.r("nebulaActivityConfig");
             this.b.write(p0, p1.prtpActivityConfig);
          }
          p0.j();
       }
       return;
    }
}
