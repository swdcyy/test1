package com.kwai.yoda.bridge.InvokeContextCompatHelper;
import java.lang.Object;
import com.kwai.yoda.bridge.InvokeContextCompatHelper$compatBridgeInvokeContext$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;
import rx7.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import zsd.u;

public final class InvokeContextCompatHelper	// class@001174
{
    public final p a;

    public void InvokeContextCompatHelper(){
       super();
       this.a = s.c(InvokeContextCompatHelper$compatBridgeInvokeContext$2.INSTANCE);
    }
    public final a a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, InvokeContextCompatHelper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b().get(p0);
    }
    public final Map b(){
       Object obj = PatchProxy.apply(null, this, InvokeContextCompatHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, InvokeContextCompatHelper.class, "3")) {
          return;
       }
       a.q(p0, "invokeContext");
       String str = p0.a();
       a uoa = null;
       if (str != null) {
          if (!(u.S1(str) ^ 0x01)) {
             str = uoa;
          }
          if (str != null) {
             a uoa1 = this.b().remove(str);
          }
       }
       p0 = p0.q;
       if (p0 != null) {
          if (u.S1(p0) ^ 0x01) {
             uoa = p0;
          }
          if (uoa != null) {
             this.b().remove(uoa);
          }
       }
       return;
    }
}
