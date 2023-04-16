package com.kuaishou.krn.apm.KdsApmConfig$Builder$build$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.os.Handler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ji0.b;
import java.util.Objects;

public final class KdsApmConfig$Builder$build$1 extends Lambda implements a	// class@0007af
{
    public static final KdsApmConfig$Builder$build$1 INSTANCE;

    static {
       KdsApmConfig$Builder$build$1.INSTANCE = new KdsApmConfig$Builder$build$1();
    }
    public void KdsApmConfig$Builder$build$1(){
       super(0);
    }
    public final Handler invoke(){
       Object obj = PatchProxy.apply(null, this, KdsApmConfig$Builder$build$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(b.d);
       return b.b;
    }
    public Object invoke(){
       return this.invoke();
    }
}
