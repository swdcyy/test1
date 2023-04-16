package com.kwai.slide.play.detail.performance.ElementViewAsyncFactory$enable$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class ElementViewAsyncFactory$enable$2 extends Lambda implements a	// class@001844
{
    public static final ElementViewAsyncFactory$enable$2 INSTANCE;

    static {
       ElementViewAsyncFactory$enable$2.INSTANCE = new ElementViewAsyncFactory$enable$2();
    }
    public void ElementViewAsyncFactory$enable$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, ElementViewAsyncFactory$enable$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableViewAsyncFactory", false);
    }
}
