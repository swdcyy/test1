package com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$TITLE_V2;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType;
import java.lang.String;
import nsd.u;
import kx3.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$TITLE_V2$a;
import com.kuaishou.merchant.home2.basic.model.HomePage;
import su.a;

public final class DynamicPageType$TITLE_V2 extends DynamicPageType	// class@001730
{

    public void DynamicPageType$TITLE_V2(String p0,int p1){
       super(p0, p1, null);
    }
    public b getDynamicRegisterModel(){
       Object obj = PatchProxy.apply(null, this, DynamicPageType$TITLE_V2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b("nav_component_v2", DynamicPageType$TITLE_V2$a.a, HomePage.class);
    }
}
