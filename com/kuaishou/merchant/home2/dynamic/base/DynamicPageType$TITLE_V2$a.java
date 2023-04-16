package com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$TITLE_V2$a;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gy3.f;

public final class DynamicPageType$TITLE_V2$a implements a	// class@00172f
{
    public static final DynamicPageType$TITLE_V2$a a;

    static {
       DynamicPageType$TITLE_V2$a.a = new DynamicPageType$TITLE_V2$a();
    }
    public void DynamicPageType$TITLE_V2$a(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, DynamicPageType$TITLE_V2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f();
    }
}
