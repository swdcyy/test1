package com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$MULTI_TAB$a;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ho4.b;

public final class DynamicPageType$MULTI_TAB$a implements a	// class@001723
{
    public static final DynamicPageType$MULTI_TAB$a a;

    static {
       DynamicPageType$MULTI_TAB$a.a = new DynamicPageType$MULTI_TAB$a();
    }
    public void DynamicPageType$MULTI_TAB$a(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, DynamicPageType$MULTI_TAB$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b();
    }
}
