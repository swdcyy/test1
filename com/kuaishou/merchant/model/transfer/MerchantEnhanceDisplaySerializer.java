package com.kuaishou.merchant.model.transfer.MerchantEnhanceDisplaySerializer;
import zk.i;
import java.lang.Object;
import java.lang.reflect.Type;
import zk.h;
import com.google.gson.JsonElement;
import com.kuaishou.android.model.merchant.MerchantEnhanceDisplay;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.api.commercial.ShoppingCartDisplay;

public class MerchantEnhanceDisplaySerializer implements i	// class@000910
{

    public void MerchantEnhanceDisplaySerializer(){
       super();
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       JsonElement jsonElement = PatchProxy.applyThreeRefs(p0, p1, p2, this, MerchantEnhanceDisplaySerializer.class, "2");
       if (jsonElement != PatchProxyResult.class) {
       }else {
          jsonElement = p2.b(p0, ShoppingCartDisplay.class);
       }
       return jsonElement;
    }
}
