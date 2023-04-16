package com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$NEST_LIST$a;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ho4.h;

public final class DynamicPageType$NEST_LIST$a implements a	// class@001725
{
    public static final DynamicPageType$NEST_LIST$a a;

    static {
       DynamicPageType$NEST_LIST$a.a = new DynamicPageType$NEST_LIST$a();
    }
    public void DynamicPageType$NEST_LIST$a(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, DynamicPageType$NEST_LIST$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h();
    }
}
