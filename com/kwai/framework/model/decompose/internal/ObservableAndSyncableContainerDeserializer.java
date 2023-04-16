package com.kwai.framework.model.decompose.internal.ObservableAndSyncableContainerDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.decompose.api.ObservableAndSyncableContainer;
import kotlin.jvm.internal.a;
import fg6.a;
import el.a;
import com.google.gson.TypeAdapter;
import com.google.gson.Gson;
import java.util.Objects;
import java.util.Map;
import ga6.e;
import ga6.a;
import mkd.a;

public final class ObservableAndSyncableContainerDeserializer implements b	// class@0016a0
{

    public void ObservableAndSyncableContainerDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ObservableAndSyncableContainerDeserializer.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "json");
          a.p(p1, "typeOfT");
          a.p(p2, "context");
          obj = a.b.j(a.get(p1)).fromJsonTree(p0);
          Objects.requireNonNull(obj, "null cannot be cast to non-null type C");
          Object obj1 = obj;
          a.a(obj1, obj1.getDataMap$framework_model_release(), p1, p0, p2, false);
          if (!obj instanceof a) {
             obj = null;
          }
          if (obj != null) {
             obj.afterDeserialize();
          }
          obj = obj1;
       }
       return obj;
    }
}
