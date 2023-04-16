package com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$TOOL_BAR_DENSE$a;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cy3.d;

public final class DynamicPageType$TOOL_BAR_DENSE$a implements a	// class@001733
{
    public static final DynamicPageType$TOOL_BAR_DENSE$a a;

    static {
       DynamicPageType$TOOL_BAR_DENSE$a.a = new DynamicPageType$TOOL_BAR_DENSE$a();
    }
    public void DynamicPageType$TOOL_BAR_DENSE$a(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, DynamicPageType$TOOL_BAR_DENSE$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d();
    }
}
