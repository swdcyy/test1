package com.kuaishou.merchant.transaction.base.sku.PurchasePromotionInfoDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.transaction.base.model.live.PurchasePromotionInfo;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;

public class PurchasePromotionInfoDeserializer implements b	// class@000919
{

    public void PurchasePromotionInfoDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       String str = PatchProxy.applyThreeRefs(p0, p1, p2, this, PurchasePromotionInfoDeserializer.class, "2");
       if (str != PatchProxyResult.class) {
       }else {
          String str1 = p0.toString();
          try{
             PurchasePromotionInfo purchaseProm = new PurchasePromotionInfo();
             purchaseProm.mPromotionString = str1;
          }catch(java.lang.Exception e7){
             a.l(MerchantTransactionLogBiz.DETAIL, "PurchasePromotionInfoDeserializer", "promotion model deserialize error", e7);
          }
       }
    }
}
