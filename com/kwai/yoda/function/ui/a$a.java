package com.kwai.yoda.function.ui.a$a;
import erd.g;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import px7.d;
import kotlin.jvm.internal.a;
import my7.i;
import my7.o;

public final class a$a implements g	// class@001235
{
    public final YodaBaseWebView b;

    public void a$a(YodaBaseWebView p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          p0 = this.b;
          if (p0 != null && !PatchProxy.applyVoidOneRefs(p0, null, d.class, "8")) {
             a.q(p0, "$this$hideLoading");
             p0 = p0.getManagerProvider();
             if (p0 != null) {
                p0 = p0.b();
                if (p0 != null) {
                   p0.x();
                }
             }
          }
       }
       return;
    }
}
