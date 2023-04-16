package com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$SUPER_BANNER;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType;
import java.lang.String;
import nsd.u;
import kx3.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$SUPER_BANNER$a;
import com.kuaishou.merchant.home2.basic.model.HomePage;
import su.a;

public final class DynamicPageType$SUPER_BANNER extends DynamicPageType	// class@00172c
{

    public void DynamicPageType$SUPER_BANNER(String p0,int p1){
       super(p0, p1, null);
    }
    public b getDynamicRegisterModel(){
       Object obj = PatchProxy.apply(null, this, DynamicPageType$SUPER_BANNER.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b("promotion_banner_component", DynamicPageType$SUPER_BANNER$a.a, HomePage.class);
    }
}
