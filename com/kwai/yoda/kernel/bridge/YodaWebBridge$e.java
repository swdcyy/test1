package com.kwai.yoda.kernel.bridge.YodaWebBridge$e;
import erd.g;
import com.kwai.yoda.kernel.bridge.YodaWebBridge;
import kotlin.jvm.internal.Ref$ObjectRef;
import ny7.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sy7.b;
import java.lang.StringBuilder;
import ny7.a;
import java.lang.Boolean;
import tb7.a;
import com.kwai.yoda.kernel.container.YodaWebView;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import ny7.e;
import com.kwai.yoda.kernel.YodaException;
import ny7.e$a;

public final class YodaWebBridge$e implements g	// class@001288
{
    public final YodaWebBridge b;
    public final Ref$ObjectRef c;
    public final c d;
    public final Ref$ObjectRef e;

    public void YodaWebBridge$e(YodaWebBridge p0,Ref$ObjectRef p1,c p2,Ref$ObjectRef p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaWebBridge$e.class, "1")) {
       }else {
          b b = b.b;
          b.e(this.c.element+' '+this.d.d+" execute error", p0);
          Ref$ObjectRef element = this.c.element;
          Boolean uBoolean = (element != null)? Boolean.valueOf(element.h()): null;
          if (a.c(uBoolean)) {
             YodaWebBridge$e tb = this.b;
             element = this.e.element;
             YodaWebBridge$e td = this.d;
             a.h(p0, "it");
             Objects.requireNonNull(tb);
             e uoe = PatchProxy.applyOneRefs(p0, tb, YodaWebBridge.class, "14");
             if (uoe != PatchProxyResult.class) {
             }else {
                a.q(p0, "e");
                p0 = (p0 instanceof YodaException)? e.d.a(p0.getResultCode(), p0.getMessage()): e.d.a(0x1e84a, p0.getMessage());
                uoe = p0;
             }
             tb.a(element, td, uoe);
          }else {
             b.g("not need needCallback");
          }
       }
       return;
    }
}
