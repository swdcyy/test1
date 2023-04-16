package com.kuaishou.merchant.model.transfer.MerchantEnhanceDisplayDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.merchant.MerchantEnhanceDisplay;
import fg6.a;
import com.kuaishou.merchant.api.commercial.UnsupportedDisplay;
import com.google.gson.Gson;
import com.kuaishou.merchant.api.commercial.MarqueeDisplay;
import com.kuaishou.merchant.api.commercial.ShoppingCartDisplay;

public class MerchantEnhanceDisplayDeserializer implements b	// class@00090f
{

    public void MerchantEnhanceDisplayDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       UnsupportedDisplay unsupportedD = PatchProxy.applyThreeRefs(p0, p1, p2, this, MerchantEnhanceDisplayDeserializer.class, "2");
       if (unsupportedD != PatchProxyResult.class) {
       }else {
          Gson b = a.b;
          UnsupportedDisplay unsupportedD1 = b.c(p0, UnsupportedDisplay.class);
          MerchantEnhanceDisplay mMerchantEnh = unsupportedD1.mMerchantEnhanceDisplayType;
          if (mMerchantEnh != null) {
             if (mMerchantEnh != 1 && (mMerchantEnh != 2 && mMerchantEnh != 3)) {
                unsupportedD = (mMerchantEnh != 100)? unsupportedD1: b.c(p0, MarqueeDisplay.class);
             }else {
                unsupportedD = b.c(p0, ShoppingCartDisplay.class);
             }
          }else {
             unsupportedD = null;
          }
       }
       return unsupportedD;
    }
}
