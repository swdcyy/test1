package com.kwai.framework.kgi.sdk.internal.init.KgiInitModule$onForeground$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import q76.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o76.a;

public final class KgiInitModule$onForeground$1 extends Lambda implements a	// class@00159c
{
    public static final KgiInitModule$onForeground$1 INSTANCE;

    static {
       KgiInitModule$onForeground$1.INSTANCE = new KgiInitModule$onForeground$1();
    }
    public void KgiInitModule$onForeground$1(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, KgiInitModule$onForeground$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a("on_foreground", "");
    }
}
