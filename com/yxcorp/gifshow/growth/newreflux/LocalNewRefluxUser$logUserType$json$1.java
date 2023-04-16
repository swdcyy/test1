package com.yxcorp.gifshow.growth.newreflux.LocalNewRefluxUser$logUserType$json$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import upa.a;
import java.lang.Number;

public final class LocalNewRefluxUser$logUserType$json$1 extends Lambda implements l	// class@001453
{
    public static final LocalNewRefluxUser$logUserType$json$1 INSTANCE;

    static {
       LocalNewRefluxUser$logUserType$json$1.INSTANCE = new LocalNewRefluxUser$logUserType$json$1();
    }
    public void LocalNewRefluxUser$logUserType$json$1(){
       super(1);
    }
    public final CharSequence invoke(long p0){
       if (PatchProxy.isSupport(LocalNewRefluxUser$logUserType$json$1.class)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, LocalNewRefluxUser$logUserType$json$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return a.c.a(p0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0.longValue());
    }
}
