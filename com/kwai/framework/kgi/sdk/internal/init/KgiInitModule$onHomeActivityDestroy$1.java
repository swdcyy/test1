package com.kwai.framework.kgi.sdk.internal.init.KgiInitModule$onHomeActivityDestroy$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import q76.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o76.a;

public final class KgiInitModule$onHomeActivityDestroy$1 extends Lambda implements a	// class@00159e
{
    public static final KgiInitModule$onHomeActivityDestroy$1 INSTANCE;

    static {
       KgiInitModule$onHomeActivityDestroy$1.INSTANCE = new KgiInitModule$onHomeActivityDestroy$1();
    }
    public void KgiInitModule$onHomeActivityDestroy$1(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, KgiInitModule$onHomeActivityDestroy$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a("on_exit", "");
    }
}
