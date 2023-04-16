package com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$TOOL_BAR_DENSE;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType;
import java.lang.String;
import nsd.u;
import kx3.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$TOOL_BAR_DENSE$a;
import com.kuaishou.merchant.home2.basic.model.HomePage;
import su.a;

public final class DynamicPageType$TOOL_BAR_DENSE extends DynamicPageType	// class@001734
{

    public void DynamicPageType$TOOL_BAR_DENSE(String p0,int p1){
       super(p0, p1, null);
    }
    public b getDynamicRegisterModel(){
       Object obj = PatchProxy.apply(null, this, DynamicPageType$TOOL_BAR_DENSE.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b("tool_component_dense", DynamicPageType$TOOL_BAR_DENSE$a.a, HomePage.class);
    }
}
