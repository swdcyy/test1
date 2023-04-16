package com.kuaishou.merchant.api.core.model.live.shop.LiveShopComponentDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopComponentModel;
import com.google.gson.JsonObject;
import ekd.k0;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class LiveShopComponentDeserializer implements b	// class@0008db
{

    public void LiveShopComponentDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       LiveShopComponentModel liveShopComp = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveShopComponentDeserializer.class, "2");
       if (liveShopComp != PatchProxyResult.class) {
       }else {
          JsonObject jsonObject = p0.r();
          liveShopComp = new LiveShopComponentModel();
          liveShopComp.mCode = k0.f(jsonObject, "code", -1);
          liveShopComp.mBusinessType = k0.f(jsonObject, "businessType", -1);
          JsonElement jsonElement = k0.e(jsonObject, "payload");
          if (jsonElement != null) {
             HashMap hashMap = new HashMap();
             Iterator iterator = jsonElement.r().entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                String key = uEntry.getKey();
                hashMap.put(key, uEntry.getValue());
             }
             liveShopComp.mPayloadMap = hashMap;
          }
          jsonObject = k0.e(jsonObject, "traceMap");
          if (jsonObject != null) {
             HashMap hashMap1 = new HashMap();
             Iterator iterator1 = jsonObject.r().entrySet().iterator();
             while (iterator1.hasNext()) {
                Map$Entry uEntry1 = iterator1.next();
                String key1 = uEntry1.getKey();
                hashMap1.put(key1, String.valueOf(uEntry1.getValue()));
             }
             liveShopComp.mTraceMap = hashMap1;
          }
       }
       return liveShopComp;
    }
}
