package com.kuaishou.merchant.live.basic.model.MerchantPreviewAtmosphereDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.live.basic.model.MerchantPreviewAtmosphereModel;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import java.util.ArrayList;
import kotlin.jvm.internal.a;
import com.kuaishou.merchant.live.basic.model.MerchantPreviewAtmosphereItemModel;
import yz7.e;

public final class MerchantPreviewAtmosphereDeserializer implements b	// class@001896
{

    public void MerchantPreviewAtmosphereDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       String str3;
       MerchantPreviewAtmosphereModel merchantPrev = PatchProxy.applyThreeRefs(p0, p1, p2, this, MerchantPreviewAtmosphereDeserializer.class, "1");
       if (merchantPrev != PatchProxyResult.class) {
       }else {
          merchantPrev = new MerchantPreviewAtmosphereModel();
          if (p0 != null) {
             JsonObject jsonObject = p0.r().m0("resourceDatas");
             String str = null;
             jsonObject = (jsonObject != null)? jsonObject.m0("liveRoomTopAtmosphere"): str;
             if (jsonObject != null) {
                str = jsonObject.g0("materialDatas");
             }
             merchantPrev.setMaterialMapModel(new ArrayList());
             if (str != null) {
                int i = 0;
                int i1 = str.size();
                while (i < i1) {
                   JsonElement jsonElement = str.e0(i);
                   a.o(jsonElement, "atmosphereJsonArray.get\(index\)");
                   JsonObject jsonObject1 = jsonElement.r();
                   JsonObject jsonObject2 = jsonObject1.m0("materialMap");
                   if (jsonObject2 != null) {
                      MerchantPreviewAtmosphereItemModel merchantPrev1 = e.a(jsonObject2.toString(), MerchantPreviewAtmosphereItemModel.class);
                      if (merchantPrev1 != null) {
                         String str1 = "materialId";
                         if (jsonObject1.e0(str1) != null) {
                            jsonElement = jsonObject1.e0(str1);
                            a.o(jsonElement, "atmosphereJsonObj.get\(\"materialId\"\)");
                            String str2 = jsonElement.w();
                            a.o(str2, "atmosphereJsonObj.get\(\"materialId\"\).asString");
                            merchantPrev1.setMaterialId(str2);
                         }
                         ArrayList materialMapM = merchantPrev.getMaterialMapModel();
                         a.m(materialMapM);
                         materialMapM.add(merchantPrev1);
                      }
                   }
                   i++;
                }
             }
          }
       }
       return merchantPrev;
    }
}
