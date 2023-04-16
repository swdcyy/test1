package com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$SUPER_BANNER$a;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cy3.b;

public final class DynamicPageType$SUPER_BANNER$a implements a	// class@00172b
{
    public static final DynamicPageType$SUPER_BANNER$a a;

    static {
       DynamicPageType$SUPER_BANNER$a.a = new DynamicPageType$SUPER_BANNER$a();
    }
    public void DynamicPageType$SUPER_BANNER$a(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, DynamicPageType$SUPER_BANNER$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b();
    }
}
