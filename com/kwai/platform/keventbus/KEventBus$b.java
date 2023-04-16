package com.kwai.platform.keventbus.KEventBus$b;
import erd.r;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import com.kwai.platform.keventbus.KEventBus$a;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class KEventBus$b implements r	// class@001285
{
    public final String b;
    public final Class c;

    public void KEventBus$b(String p0,Class p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, KEventBus$b.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          if (a.g(p0.a(), this.b)) {
             p0 = p0.b();
             p0 = (p0 != null)? p0.getClass(): null;
             if (a.g(p0, this.c)) {
                b = true;
             }
          }
          b = false;
       }
       return b;
    }
}
