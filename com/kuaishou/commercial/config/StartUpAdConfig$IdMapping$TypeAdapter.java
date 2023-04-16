package com.kuaishou.commercial.config.StartUpAdConfig$IdMapping$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.commercial.config.StartUpAdConfig$IdMapping;
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
import com.google.gson.stream.b;

public final class StartUpAdConfig$IdMapping$TypeAdapter extends TypeAdapter	// class@0014a1
{
    public final Gson a;
    public static final a b;

    static {
       StartUpAdConfig$IdMapping$TypeAdapter.b = a.get(StartUpAdConfig$IdMapping.class);
    }
    public void StartUpAdConfig$IdMapping$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, StartUpAdConfig$IdMapping$TypeAdapter.class, "2");
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
             obj = new StartUpAdConfig$IdMapping();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("imei")) {
                   if (!str1.equals("oaid")) {
                      p0.Q();
                   }else {
                      obj.mOaid = TypeAdapters.A.read(p0);
                   }
                }else {
                   obj.mImei = TypeAdapters.A.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StartUpAdConfig$IdMapping$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mImei != null) {
             p0.r("imei");
             TypeAdapters.A.write(p0, p1.mImei);
          }
          if (p1.mOaid != null) {
             p0.r("oaid");
             TypeAdapters.A.write(p0, p1.mOaid);
          }
          p0.j();
       }
       return;
    }
}
