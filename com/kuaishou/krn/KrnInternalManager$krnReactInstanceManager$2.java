package com.kuaishou.krn.KrnInternalManager$krnReactInstanceManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import vj0.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.c;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.kuaishou.krn.KrnInternalManager;
import kj0.f;
import java.util.Objects;
import sj0.d;
import qrd.p;

public final class KrnInternalManager$krnReactInstanceManager$2 extends Lambda implements a	// class@0007a7
{
    public static final KrnInternalManager$krnReactInstanceManager$2 INSTANCE;

    static {
       KrnInternalManager$krnReactInstanceManager$2.INSTANCE = new KrnInternalManager$krnReactInstanceManager$2();
    }
    public void KrnInternalManager$krnReactInstanceManager$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, KrnInternalManager$krnReactInstanceManager$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       c uoc = c.b();
       a.o(uoc, "KrnManager.get\(\)");
       Context uContext = uoc.d();
       a.o(uContext, "KrnManager.get\(\).context");
       f uof = KrnInternalManager.c.a();
       Objects.requireNonNull(uof);
       Object obj1 = PatchProxy.apply(objArray, uof, f.class, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = uof.a.getValue();
       }
       return new a(uContext, obj1);
    }
}
