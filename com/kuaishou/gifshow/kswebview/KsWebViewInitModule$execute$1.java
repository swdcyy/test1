package com.kuaishou.gifshow.kswebview.KsWebViewInitModule$execute$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule;
import java.lang.Object;
import java.lang.String;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.System;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule$a;
import am8.a;
import am8.d;
import p80.g;
import java.lang.Runnable;
import p80.h;
import com.kuaishou.webkit.extension.KsCorePerformanceListener;
import com.kuaishou.webkit.extension.KsWebExtensionStatics;

public final class KsWebViewInitModule$execute$1 extends Lambda implements l	// class@0019da
{
    public final KsWebViewInitModule this$0;

    public void KsWebViewInitModule$execute$1(KsWebViewInitModule p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(String p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, KsWebViewInitModule$execute$1.class, str)) {
          return;
       }
       KsWebViewInitModule$execute$1 tthis$0 = this.this$0;
       a.o(p0, "it");
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(p0, tthis$0, KsWebViewInitModule.class, str)) {
          a.p(p0, "sourceTag");
          if (!KsWebViewInitModule.u) {
             KsWebViewInitModule.u = System.currentTimeMillis();
          }
          KsWebViewInitModule.A.f();
          d.b("web_init", 3).execute(new g(tthis$0, p0));
          KsWebExtensionStatics.addKsCorePerformanceListener(new h());
       }
       return;
    }
}
