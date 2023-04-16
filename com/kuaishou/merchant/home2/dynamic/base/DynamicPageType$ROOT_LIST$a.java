package com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$ROOT_LIST$a;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ho4.o;

public final class DynamicPageType$ROOT_LIST$a implements a	// class@001727
{
    public static final DynamicPageType$ROOT_LIST$a a;

    static {
       DynamicPageType$ROOT_LIST$a.a = new DynamicPageType$ROOT_LIST$a();
    }
    public void DynamicPageType$ROOT_LIST$a(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, DynamicPageType$ROOT_LIST$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new o();
    }
}
