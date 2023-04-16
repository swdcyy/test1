package com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$ROOT_LIST;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType;
import java.lang.String;
import nsd.u;
import kx3.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$ROOT_LIST$a;
import su.a;

public final class DynamicPageType$ROOT_LIST extends DynamicPageType	// class@001728
{

    public void DynamicPageType$ROOT_LIST(String p0,int p1){
       super(p0, p1, null);
    }
    public b getDynamicRegisterModel(){
       Object obj = PatchProxy.apply(null, this, DynamicPageType$ROOT_LIST.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b("list_limit_component", DynamicPageType$ROOT_LIST$a.a, null);
    }
}
