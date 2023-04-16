package com.kwai.framework.network.keyconfig.degrade.ApiDegradePolicyWrapper$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.network.keyconfig.degrade.ApiDegradePolicyWrapper;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.framework.network.keyconfig.degrade.ApiDegradePolicy$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.List;
import com.google.gson.stream.b;

public final class ApiDegradePolicyWrapper$TypeAdapter extends TypeAdapter	// class@000c37
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       ApiDegradePolicyWrapper$TypeAdapter.d = a.get(ApiDegradePolicyWrapper.class);
    }
    public void ApiDegradePolicyWrapper$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(ApiDegradePolicy$TypeAdapter.d);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ApiDegradePolicyWrapper$TypeAdapter.class, "2");
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
             obj = new ApiDegradePolicyWrapper();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("android")) {
                   p0.Q();
                }else {
                   obj.mAndroid = this.c.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ApiDegradePolicyWrapper$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mAndroid != null) {
             p0.r("android");
             this.c.write(p0, p1.mAndroid);
          }
          p0.j();
       }
       return;
    }
}
