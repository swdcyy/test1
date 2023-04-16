package com.kwai.yoda.kernel.bridge.YodaWebBridge$d;
import erd.g;
import com.kwai.yoda.kernel.bridge.YodaWebBridge;
import kotlin.jvm.internal.Ref$ObjectRef;
import ny7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ny7.e;
import ny7.e$a;
import sy7.b;
import java.lang.StringBuilder;
import ny7.a;
import java.lang.Boolean;
import tb7.a;
import com.kwai.yoda.kernel.container.YodaWebView;

public final class YodaWebBridge$d implements g	// class@001287
{
    public final YodaWebBridge b;
    public final Ref$ObjectRef c;
    public final c d;
    public final Ref$ObjectRef e;

    public void YodaWebBridge$d(YodaWebBridge p0,Ref$ObjectRef p1,c p2,Ref$ObjectRef p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaWebBridge$d.class, "1")) {
          return;
       }
       p0 = e.d.b(p0);
       b b = b.b;
       b.g(this.c.element+' '+this.d.d+" execute result - "+p0.a);
       Ref$ObjectRef element = this.c.element;
       Boolean uBoolean = (element != null)? Boolean.valueOf(element.h()): null;
       if (a.c(uBoolean)) {
          this.b.a(this.e.element, this.d, p0);
       }else {
          b.g(this.d.d+" do not need callback");
       }
       return;
    }
}
