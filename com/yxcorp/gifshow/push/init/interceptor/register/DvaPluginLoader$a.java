package com.yxcorp.gifshow.push.init.interceptor.register.DvaPluginLoader$a;
import ftd.k0;
import java.lang.Object;
import kotlin.coroutines.CoroutineContext;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import com.yxcorp.gifshow.push.init.interceptor.register.DvaPluginLoader$a$a;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlin.coroutines.CoroutineContext$b;
import asd.a;

public final class DvaPluginLoader$a implements k0	// class@001669
{
    public static final DvaPluginLoader$a b;

    static {
       DvaPluginLoader$a.b = new DvaPluginLoader$a();
    }
    public void DvaPluginLoader$a(){
       super();
    }
    public CoroutineContext getCoroutineContext(){
       Object obj = PatchProxy.apply(null, this, DvaPluginLoader$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return z0.f().plus(new DvaPluginLoader$a$a(CoroutineExceptionHandler.u0));
    }
}
