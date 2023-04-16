package com.kuaishou.merchant.live.pendant.component.MerchantBaseCodeComponentDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.live.pendant.component.MerchantBaseCodeComponent;
import com.google.gson.JsonObject;
import ekd.k0;
import z64.a;
import el.a;
import com.kuaishou.merchant.live.pendant.component.MerchantArrayComponent;
import java.util.List;
import com.kuaishou.merchant.live.pendant.component.MerchantObjectComponent;
import fg6.a;
import com.kuaishou.merchant.live.pendant.component.IconComponent;
import com.google.gson.Gson;
import com.kuaishou.merchant.live.pendant.component.MerchantBaseComponent;
import com.kuaishou.merchant.live.pendant.component.TextComponent;

public class MerchantBaseCodeComponentDeserializer implements b	// class@000908
{

    public void MerchantBaseCodeComponentDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       MerchantArrayComponent merchantArra = PatchProxy.applyThreeRefs(p0, p1, p2, this, MerchantBaseCodeComponentDeserializer.class, "2");
       if (merchantArra != PatchProxyResult.class) {
       }else {
          int i = 0;
          int i1 = k0.f(p0, "code", i);
          JsonElement jsonElement = p0.e0("component");
          if (jsonElement != null && i1) {
             int i2 = k0.f(p0, "bizType", i);
             int i3 = k0.f(p0, "priority", i);
             if (i1 != 3001) {
                if (i1 != 3201) {
                   if (i1 == 4001) {
                      merchantArra = new MerchantArrayComponent();
                      merchantArra.mComponent = p2.c(jsonElement, new a(this).getType());
                   }
                }else {
                   merchantArra = new MerchantObjectComponent();
                   merchantArra.mCode = i1;
                   merchantArra.mComponent = a.b.c(jsonElement, IconComponent.class);
                   merchantArra.mBizType = i2;
                   merchantArra.mPriority = i3;
                }
             }else {
                merchantArra = new MerchantObjectComponent();
                merchantArra.mCode = i1;
                merchantArra.mComponent = a.b.c(jsonElement, TextComponent.class);
                merchantArra.mBizType = i2;
                merchantArra.mPriority = i3;
             }
          }
          i = 0;
       }
       return merchantArra;
    }
}
