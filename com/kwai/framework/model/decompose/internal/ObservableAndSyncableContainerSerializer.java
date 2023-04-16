package com.kwai.framework.model.decompose.internal.ObservableAndSyncableContainerSerializer;
import zk.i;
import java.lang.Object;
import zk.d;
import com.kwai.framework.model.decompose.internal.ObservableAndSyncableContainerSerializer$a;
import zk.a;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import zk.h;
import com.google.gson.JsonElement;
import com.kwai.framework.model.decompose.api.ObservableAndSyncableContainer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import el.a;
import com.google.gson.TypeAdapter;
import java.util.Objects;
import com.google.gson.JsonObject;
import java.util.Map;
import ga6.e;
import ga6.b;

public final class ObservableAndSyncableContainerSerializer implements i	// class@0016a2
{
    public final Gson a;

    public void ObservableAndSyncableContainerSerializer(){
       super();
       d uod = new d();
       uod.a(new ObservableAndSyncableContainerSerializer$a());
       this.a = uod.b();
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       JsonElement jsonElement = PatchProxy.applyThreeRefs(p0, p1, p2, this, ObservableAndSyncableContainerSerializer.class, "1");
       if (jsonElement != PatchProxyResult.class) {
       }else {
          a.p(p0, "src");
          a.p(p1, "typeOfSrc");
          a.p(p2, "context");
          JsonElement jsonElement1 = this.a.j(a.get(p1)).toJsonTree(p0);
          Objects.requireNonNull(jsonElement1, "null cannot be cast to non-null type com.google.gson.JsonObject");
          jsonElement = jsonElement1;
          b.a(p0, p0.getDataMap$framework_model_release(), jsonElement, p2);
       }
       return jsonElement;
    }
}
