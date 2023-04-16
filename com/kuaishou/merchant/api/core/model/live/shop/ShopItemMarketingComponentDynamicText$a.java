package com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentDynamicText$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import kotlin.text.Regex;
import java.lang.StringBuilder;
import kotlin.text.Regex$a;
import java.lang.CharSequence;

public final class ShopItemMarketingComponentDynamicText$a	// class@001551
{

    public void ShopItemMarketingComponentDynamicText$a(){
       super();
    }
    public void ShopItemMarketingComponentDynamicText$a(u p0){
       super();
    }
    public final String a(String p0,Object[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ShopItemMarketingComponentDynamicText$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "format");
       a.p(p1, "args");
       int len = p1.length;
       for (int i = 0; i < len; i = i + 1) {
          p0 = Regex.Companion.d("${"+i+'}').replace(p0, p1[i].toString());
       }
       return p0;
    }
}
