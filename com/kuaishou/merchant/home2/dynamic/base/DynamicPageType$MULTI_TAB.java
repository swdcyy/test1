package com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$MULTI_TAB;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType;
import java.lang.String;
import nsd.u;
import kx3.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$MULTI_TAB$a;
import lx3.b;
import su.a;

public final class DynamicPageType$MULTI_TAB extends DynamicPageType	// class@001724
{

    public void DynamicPageType$MULTI_TAB(String p0,int p1){
       super(p0, p1, null);
    }
    public b getDynamicRegisterModel(){
       Object obj = PatchProxy.apply(null, this, DynamicPageType$MULTI_TAB.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b("channel_component", DynamicPageType$MULTI_TAB$a.a, b.class);
    }
}
