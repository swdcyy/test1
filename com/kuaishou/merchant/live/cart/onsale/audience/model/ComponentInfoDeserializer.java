package com.kuaishou.merchant.live.cart.onsale.audience.model.ComponentInfoDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.cart.onsale.audience.model.ComponentInfo;
import com.google.gson.JsonObject;
import com.kuaishou.merchant.live.cart.onsale.audience.model.ComponentInfo$Wrapper;
import a44.a;
import java.util.Objects;
import java.util.Map;
import com.kuaishou.merchant.live.cart.onsale.audience.model.ComponentData;

public class ComponentInfoDeserializer implements b	// class@001952
{

    public void ComponentInfoDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       Class uClass1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ComponentInfo uComponentIn = PatchProxy.applyThreeRefs(p0, p1, p2, this, ComponentInfoDeserializer.class, "1");
       if (uComponentIn != patchProxyRe) {
       }else {
          ComponentInfo uComponentIn1 = p2.c(p0, ComponentInfo$Wrapper.class);
          JsonElement jsonElement = p0.r().e0("data");
          a b = a.b;
          String name = uComponentIn1.getName();
          Objects.requireNonNull(b);
          Class uClass = PatchProxy.applyOneRefs(name, b, a.class, "1");
          if (uClass != patchProxyRe) {
          }else if(name != null){
             uClass1 = a.a.get(name);
          }else {
             uClass1 = 0;
          }
          uClass = uClass1;
          if (uClass != null) {
             uComponentIn1.setData(p2.c(jsonElement, uClass));
          }else {
             ComponentData uComponentDa = new ComponentData();
             if (uComponentIn1.getData() instanceof Map) {
                uComponentDa.data = uComponentIn1.getData();
             }
             uComponentIn1.setData(uComponentDa);
          }
          uComponentIn = uComponentIn1;
       }
       return uComponentIn;
    }
}
