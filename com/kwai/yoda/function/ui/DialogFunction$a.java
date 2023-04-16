package com.kwai.yoda.function.ui.DialogFunction$a;
import io.reactivex.g;
import com.kwai.yoda.bridge.YodaBaseWebView;
import ez7.a;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.yoda.function.ui.DialogFunction$a$a;
import px7.d;
import my7.i;
import my7.o;
import com.kuaishou.webkit.ValueCallback;

public final class DialogFunction$a implements g	// class@001231
{
    public final YodaBaseWebView b;
    public final a c;

    public void DialogFunction$a(YodaBaseWebView p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DialogFunction$a.class, "1")) {
          return;
       }
       a.q(p0, "emitter");
       DialogFunction$a tb = this.b;
       if (tb != null) {
          DialogFunction$a tc = this.c;
          DialogFunction$a$a uoa$a = new DialogFunction$a$a(p0);
          if (!PatchProxy.applyVoidThreeRefs(tb, tc, uoa$a, null, d.class, "9")) {
             a.q(tb, "$this$showDialog");
             a.q(uoa$a, "callback");
             i managerProvi = tb.getManagerProvider();
             if (managerProvi != null) {
                o oo = managerProvi.b();
                if (oo != null) {
                   oo.d(tc, uoa$a);
                }
             }
          }
       }
       return;
    }
}
