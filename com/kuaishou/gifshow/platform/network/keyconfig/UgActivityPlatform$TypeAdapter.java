package com.kuaishou.gifshow.platform.network.keyconfig.UgActivityPlatform$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.gifshow.platform.network.keyconfig.UgActivityPlatform;
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
import com.vimeo.stag.KnownTypeAdapters;
import com.google.gson.JsonObject;
import com.google.gson.stream.b;

public final class UgActivityPlatform$TypeAdapter extends TypeAdapter	// class@000886
{
    public final Gson a;
    public static final a b;

    static {
       UgActivityPlatform$TypeAdapter.b = a.get(UgActivityPlatform.class);
    }
    public void UgActivityPlatform$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, UgActivityPlatform$TypeAdapter.class, "2");
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
             obj = new UgActivityPlatform();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("uagConfig")) {
                   if (!str1.equals("kakConfig")) {
                      p0.Q();
                   }else {
                      obj.mKakConfig = KnownTypeAdapters.p.read(p0);
                   }
                }else {
                   obj.mUagConfig = KnownTypeAdapters.p.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UgActivityPlatform$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mUagConfig != null) {
             p0.r("uagConfig");
             KnownTypeAdapters.p.write(p0, p1.mUagConfig);
          }
          if (p1.a() != null) {
             p0.r("kakConfig");
             KnownTypeAdapters.p.write(p0, p1.a());
          }
          p0.j();
       }
       return;
    }
}
