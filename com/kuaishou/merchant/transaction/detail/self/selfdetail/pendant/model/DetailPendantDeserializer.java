package com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.model.DetailPendantDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.model.BaseDetailPendantItemModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.model.DetailPendantFullReturnModel;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import com.google.gson.a;
import com.google.gson.JsonObject;
import zk.g;
import java.lang.Number;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.model.DetailPendantOnePointPurchaseModel;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.model.DetailPendantFullDeliveryModel;

public final class DetailPendantDeserializer implements b	// class@000922
{

    public void DetailPendantDeserializer(){
       super();
    }
    public final BaseDetailPendantItemModel a(JsonElement p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DetailPendantDeserializer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.c(p0, DetailPendantFullReturnModel.class);
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       BaseDetailPendantItemModel uBaseDetailP1;
       BaseDetailPendantItemModel uBaseDetailP = PatchProxy.applyThreeRefs(p0, p1, p2, this, DetailPendantDeserializer.class, "1");
       if (uBaseDetailP != PatchProxyResult.class) {
       }else if(!p0 instanceof JsonObject){
          uBaseDetailP = this.a(p0);
       }else {
          JsonElement jsonElement = p0.e0("templateType");
          if (!jsonElement instanceof g) {
             jsonElement = null;
          }
          if (jsonElement == null || !jsonElement.N()) {
             uBaseDetailP = this.a(p0);
          }else {
             int i = jsonElement.u().intValue();
             if (i != 2) {
                if (i != 3) {
                   uBaseDetailP1 = (i != 4)? this.a(p0): a.a.c(p0, DetailPendantOnePointPurchaseModel.class);
                }else {
                   uBaseDetailP1 = a.a.c(p0, DetailPendantFullDeliveryModel.class);
                }
             }else {
                uBaseDetailP1 = a.a.c(p0, DetailPendantFullReturnModel.class);
             }
             uBaseDetailP = uBaseDetailP1;
          }
       }
       return uBaseDetailP;
    }
}
