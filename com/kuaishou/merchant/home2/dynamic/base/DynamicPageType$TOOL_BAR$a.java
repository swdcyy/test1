package com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$TOOL_BAR$a;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cy3.c;

public final class DynamicPageType$TOOL_BAR$a implements a	// class@001731
{
    public static final DynamicPageType$TOOL_BAR$a a;

    static {
       DynamicPageType$TOOL_BAR$a.a = new DynamicPageType$TOOL_BAR$a();
    }
    public void DynamicPageType$TOOL_BAR$a(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, DynamicPageType$TOOL_BAR$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c();
    }
}
