package com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$SEARCH_SWITCHER;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType;
import java.lang.String;
import nsd.u;
import kx3.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$SEARCH_SWITCHER$a;
import com.kuaishou.merchant.home2.basic.model.HomePage;
import su.a;

public final class DynamicPageType$SEARCH_SWITCHER extends DynamicPageType	// class@00172a
{

    public void DynamicPageType$SEARCH_SWITCHER(String p0,int p1){
       super(p0, p1, null);
    }
    public b getDynamicRegisterModel(){
       Object obj = PatchProxy.apply(null, this, DynamicPageType$SEARCH_SWITCHER.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b("mall_tab_searchBar_component", DynamicPageType$SEARCH_SWITCHER$a.a, HomePage.class);
    }
}
