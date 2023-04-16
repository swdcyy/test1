package com.kwai.yoda.function.ui.i$a;
import erd.g;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.Object;
import ez7.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import px7.d;
import kotlin.jvm.internal.a;
import my7.i;
import my7.o;

public final class i$a implements g	// class@00123f
{
    public final YodaBaseWebView b;

    public void i$a(YodaBaseWebView p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
       }else {
          i$a tb = this.b;
          if (tb != null && !PatchProxy.applyVoidTwoRefs(tb, p0, null, d.class, "7")) {
             a.q(tb, "$this$showLoading");
             i managerProvi = tb.getManagerProvider();
             if (managerProvi != null) {
                o oo = managerProvi.b();
                if (oo != null) {
                   oo.h(p0);
                }
             }
          }
       }
       return;
    }
}
