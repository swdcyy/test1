package com.kuaishou.merchant.live.pendant.rightBottompendant.LiveMerchantAWidgetDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import c74.a;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import java.util.ArrayList;
import c74.c;
import yz7.e;
import kotlin.jvm.internal.a;

public final class LiveMerchantAWidgetDeserializer implements b	// class@001abf
{

    public void LiveMerchantAWidgetDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       String str2;
       a uoa = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveMerchantAWidgetDeserializer.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
          if (p0 != null) {
             JsonObject jsonObject = p0.r().m0("resourceDatas");
             String str = null;
             jsonObject = (jsonObject != null)? jsonObject.m0("revenuePendant"): str;
             if (jsonObject != null) {
                str = jsonObject.g0("materialDatas");
             }
             uoa.b(new ArrayList());
             if (str != null) {
                int i = 0;
                int i1 = str.size();
                while (i < i1) {
                   JsonObject jsonObject1 = str.e0(i).r();
                   JsonObject jsonObject2 = jsonObject1.m0("materialMap");
                   if (jsonObject2 != null) {
                      c uoc = e.a(jsonObject2.toString(), c.class);
                      if (uoc != null) {
                         String str1 = "materialId";
                         if (jsonObject1.e0(str1) != null) {
                            uoc.e(jsonObject1.e0(str1).w());
                         }
                         ArrayList uArrayList = uoa.a();
                         a.m(uArrayList);
                         uArrayList.add(uoc);
                      }
                   }
                   i++;
                }
             }
          }
       }
       return uoa;
    }
}
