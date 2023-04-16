package com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$SEARCH_SWITCHER$a;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gy3.a;

public final class DynamicPageType$SEARCH_SWITCHER$a implements a	// class@001729
{
    public static final DynamicPageType$SEARCH_SWITCHER$a a;

    static {
       DynamicPageType$SEARCH_SWITCHER$a.a = new DynamicPageType$SEARCH_SWITCHER$a();
    }
    public void DynamicPageType$SEARCH_SWITCHER$a(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, DynamicPageType$SEARCH_SWITCHER$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
}
