package com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$TOOL_BAR;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType;
import java.lang.String;
import nsd.u;
import kx3.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$TOOL_BAR$a;
import com.kuaishou.merchant.home2.basic.model.HomePage;
import su.a;

public final class DynamicPageType$TOOL_BAR extends DynamicPageType	// class@001732
{

    public void DynamicPageType$TOOL_BAR(String p0,int p1){
       super(p0, p1, null);
    }
    public b getDynamicRegisterModel(){
       Object obj = PatchProxy.apply(null, this, DynamicPageType$TOOL_BAR.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b("tool_component", DynamicPageType$TOOL_BAR$a.a, HomePage.class);
    }
}
