package com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$TITLE$a;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gy3.e;

public final class DynamicPageType$TITLE$a implements a	// class@00172d
{
    public static final DynamicPageType$TITLE$a a;

    static {
       DynamicPageType$TITLE$a.a = new DynamicPageType$TITLE$a();
    }
    public void DynamicPageType$TITLE$a(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, DynamicPageType$TITLE$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e();
    }
}
