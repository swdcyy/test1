package com.kuaishou.krn.KrnInternalManager$krnConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import kj0.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.c;
import kotlin.jvm.internal.a;

public final class KrnInternalManager$krnConfig$2 extends Lambda implements a	// class@0007a6
{
    public static final KrnInternalManager$krnConfig$2 INSTANCE;

    static {
       KrnInternalManager$krnConfig$2.INSTANCE = new KrnInternalManager$krnConfig$2();
    }
    public void KrnInternalManager$krnConfig$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final f invoke(){
       c obj = PatchProxy.apply(null, this, KrnInternalManager$krnConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.b();
       a.o(obj, "KrnManager.get\(\)");
       return obj.f();
    }
}
