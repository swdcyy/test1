package com.kuaishou.growth.pendant.model.PendantStartupResponse$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.growth.pendant.model.PendantStartupResponse;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.growth.pendant.model.PendantStartupResponse$KemResourcePendantSkinConfig;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.stream.b;

public final class PendantStartupResponse$TypeAdapter extends TypeAdapter	// class@000681
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PendantStartupResponse$TypeAdapter.c = a.get(PendantStartupResponse.class);
    }
    public void PendantStartupResponse$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(PendantStartupResponse$KemResourcePendantSkinConfig.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PendantStartupResponse$TypeAdapter.class, "2");
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
             obj = new PendantStartupResponse();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("kemActivityPendantSkinConfig")) {
                   p0.Q();
                }else {
                   obj.mKemResourcePendantSkinConfig = this.b.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PendantStartupResponse$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mKemResourcePendantSkinConfig != null) {
             p0.r("kemActivityPendantSkinConfig");
             this.b.write(p0, p1.mKemResourcePendantSkinConfig);
          }
          p0.j();
       }
       return;
    }
}
