package com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$NEST_LIST;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType;
import java.lang.String;
import nsd.u;
import kx3.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$NEST_LIST$a;
import su.a;

public final class DynamicPageType$NEST_LIST extends DynamicPageType	// class@001726
{

    public void DynamicPageType$NEST_LIST(String p0,int p1){
       super(p0, p1, null);
    }
    public b getDynamicRegisterModel(){
       Object obj = PatchProxy.apply(null, this, DynamicPageType$NEST_LIST.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b("list_component", DynamicPageType$NEST_LIST$a.a, null);
    }
}
