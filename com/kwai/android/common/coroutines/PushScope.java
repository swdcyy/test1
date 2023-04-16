package com.kwai.android.common.coroutines.PushScope;
import ftd.k0;
import java.lang.Object;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import com.kwai.android.common.coroutines.PushScope$coroutineContext$$inlined$CoroutineExceptionHandler$1;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlin.coroutines.CoroutineContext$b;
import asd.a;

public final class PushScope implements k0	// class@00098a
{
    public static final PushScope INSTANCE;

    static {
       PushScope.INSTANCE = new PushScope();
    }
    public void PushScope(){
       super();
    }
    public CoroutineContext getCoroutineContext(){
       return z0.f().plus(new PushScope$coroutineContext$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.u0));
    }
}
