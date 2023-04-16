package com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTimer$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import qsd.d;
import nsd.r0;
import java.util.Locale;
import java.lang.Integer;
import java.util.Arrays;
import kotlin.jvm.internal.a;
import java.lang.Math;

public final class ShopItemMarketingComponentTimer$a	// class@001558
{

    public void ShopItemMarketingComponentTimer$a(){
       super();
    }
    public void ShopItemMarketingComponentTimer$a(u p0){
       super();
    }
    public final String a(long p0){
       Object[] obj;
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ShopItemMarketingComponentTimer$a uoa = ShopItemMarketingComponentTimer$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uoa, "4");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       long l = (long)0x36ee80;
       float f = 1000.00f;
       int i = 0xea60;
       if (p0 - l >= 0) {
          if (PatchProxy.isSupport(uoa)) {
             str = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uoa, "2");
             if (str != patchProxyRe) {
             }
          }
          long l1 = (long)i;
          l = (p0 % l) / l1;
          Object[] objArray = new Object[]{Long.valueOf((p0 / l)),Long.valueOf(l),Integer.valueOf(d.H0(((float)(p0 % l1) / f)))};
          str = String.format(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(objArray, 3));
          a.o(str, "java.lang.String.format\(locale, format, *args\)");
       }else if(PatchProxy.isSupport(uoa)){
          str = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uoa, "3");
          if (str != patchProxyRe) {
          }
       }
       l = (long)i;
       long l2 = (p0 % l) / l;
       obj = new Object[]{Long.valueOf(l2),Integer.valueOf(Math.round(((float)(p0 % l) / f)))};
       String str1 = String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(obj, 2));
       a.o(str1, "java.lang.String.format\(locale, format, *args\)");
       str = str1;
       return str;
    }
}
