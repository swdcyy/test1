package com.kwai.yoda.kernel.cookie.CookieManagerWrapper$mHostCookieSetHash$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CookieManagerWrapper$mHostCookieSetHash$2 extends Lambda implements a	// class@001291
{
    public static final CookieManagerWrapper$mHostCookieSetHash$2 INSTANCE;

    static {
       CookieManagerWrapper$mHostCookieSetHash$2.INSTANCE = new CookieManagerWrapper$mHostCookieSetHash$2();
    }
    public void CookieManagerWrapper$mHostCookieSetHash$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final ConcurrentHashMap invoke(){
       Object obj = PatchProxy.apply(null, this, CookieManagerWrapper$mHostCookieSetHash$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ConcurrentHashMap();
    }
}
