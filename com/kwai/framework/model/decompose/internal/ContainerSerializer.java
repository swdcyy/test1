package com.kwai.framework.model.decompose.internal.ContainerSerializer;
import zk.i;
import java.lang.Object;
import zk.d;
import com.kwai.framework.model.decompose.internal.ContainerSerializer$a;
import zk.a;
import com.kwai.framework.model.decompose.internal.ContainerSerializer$gson$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.reflect.Type;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import zk.h;
import com.google.gson.JsonElement;
import fa6.a;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.util.Objects;
import com.google.gson.JsonObject;
import java.util.Map;
import ga6.e;
import ga6.b;

public class ContainerSerializer implements i	// class@00169d
{
    public final d a;
    public final p b;

    public void ContainerSerializer(){
       super();
       d uod = new d();
       uod.a(new ContainerSerializer$a());
       this.a = uod;
       this.b = s.c(new ContainerSerializer$gson$2(this));
    }
    public final ContainerSerializer a(Type p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ContainerSerializer.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "typeOfT");
       a.p(p1, "typeAdapter");
       this.a.f(p0, p1);
       return this;
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       JsonElement jsonElement = PatchProxy.applyThreeRefs(p0, p1, p2, this, ContainerSerializer.class, "2");
       if (jsonElement != PatchProxyResult.class) {
       }else {
          a.p(p0, "src");
          a.p(p1, "typeOfSrc");
          a.p(p2, "context");
          Gson gson = PatchProxy.apply(null, this, ContainerSerializer.class, "1");
          if (gson == PatchProxyResult.class) {
             gson = this.b.getValue();
          }
          JsonElement jsonElement1 = gson.j(a.get(p1)).toJsonTree(p0);
          Objects.requireNonNull(jsonElement1, "null cannot be cast to non-null type com.google.gson.JsonObject");
          jsonElement = jsonElement1;
          b.a(p0, p0.getDataMap$framework_model_release(), jsonElement, p2);
       }
       return jsonElement;
    }
}
