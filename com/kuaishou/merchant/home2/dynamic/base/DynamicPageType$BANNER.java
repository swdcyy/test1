package com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$BANNER;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType;
import java.lang.String;
import nsd.u;
import kx3.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$BANNER$a;
import com.kuaishou.merchant.home2.basic.model.HomePage;
import su.a;

public final class DynamicPageType$BANNER extends DynamicPageType	// class@001722
{

    public void DynamicPageType$BANNER(String p0,int p1){
       super(p0, p1, null);
    }
    public b getDynamicRegisterModel(){
       Object obj = PatchProxy.apply(null, this, DynamicPageType$BANNER.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b("banner_component", DynamicPageType$BANNER$a.a, HomePage.class);
    }
}
