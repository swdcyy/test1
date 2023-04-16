package com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$BANNER$a;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cy3.a;

public final class DynamicPageType$BANNER$a implements a	// class@001721
{
    public static final DynamicPageType$BANNER$a a;

    static {
       DynamicPageType$BANNER$a.a = new DynamicPageType$BANNER$a();
    }
    public void DynamicPageType$BANNER$a(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, DynamicPageType$BANNER$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
}
