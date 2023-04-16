package com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailServiceDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailServiceWrapper;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailServiceInfo;
import ue4.g;
import com.google.gson.JsonObject;

public class DetailServiceDeserializer implements b	// class@00091d
{

    public void DetailServiceDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       JsonObject jsonObject;
       DetailServiceWrapper uDetailServi = PatchProxy.applyThreeRefs(p0, p1, p2, this, DetailServiceDeserializer.class, "2");
       if (uDetailServi != PatchProxyResult.class) {
       }else {
          DetailServiceInfo uDetailServi1 = g.a(p0, DetailServiceInfo.class);
          if (uDetailServi1 == null) {
             uDetailServi1 = new DetailServiceInfo();
          }
          if (p0 == null) {
             jsonObject = new JsonObject();
          }
          uDetailServi = new DetailServiceWrapper(jsonObject, uDetailServi1);
       }
       return uDetailServi;
    }
}
