package com.kwai.yoda.kernel.bridge.YodaWebBridge$c;
import erd.o;
import kotlin.jvm.internal.Ref$ObjectRef;
import ny7.c;
import java.lang.Object;
import ny7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import kotlin.jvm.internal.a;
import com.kwai.yoda.kernel.container.YodaWebView;

public final class YodaWebBridge$c implements o	// class@001284
{
    public final Ref$ObjectRef b;
    public final c c;

    public void YodaWebBridge$c(Ref$ObjectRef p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, YodaWebBridge$c.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.q(p0, "it");
          ot = p0.f(this.b.element, this.c);
       }
       return ot;
    }
}
