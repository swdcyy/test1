package com.yxcorp.gifshow.wolverine.log.KLogWolverine$Companion$instance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.wolverine.log.KLogWolverine;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nsd.u;

public final class KLogWolverine$Companion$instance$2 extends Lambda implements a	// class@0019fb
{
    public static final KLogWolverine$Companion$instance$2 INSTANCE;

    static {
       KLogWolverine$Companion$instance$2.INSTANCE = new KLogWolverine$Companion$instance$2();
    }
    public void KLogWolverine$Companion$instance$2(){
       super(0);
    }
    public final KLogWolverine invoke(){
       Object obj = PatchProxy.apply(null, this, KLogWolverine$Companion$instance$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KLogWolverine(null);
    }
    public Object invoke(){
       return this.invoke();
    }
}
