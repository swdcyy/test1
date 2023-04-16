package com.kuaishou.commercial.tach.container.KwaiTKContainer$Companion$mUpdateDuration$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Long;

public final class KwaiTKContainer$Companion$mUpdateDuration$2 extends Lambda implements a	// class@001676
{
    public static final KwaiTKContainer$Companion$mUpdateDuration$2 INSTANCE;

    static {
       KwaiTKContainer$Companion$mUpdateDuration$2.INSTANCE = new KwaiTKContainer$Companion$mUpdateDuration$2();
    }
    public void KwaiTKContainer$Companion$mUpdateDuration$2(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, KwaiTKContainer$Companion$mUpdateDuration$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return ((a.t().b("bundleUpdateDuration", 30) * (long)60) * 1000);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
