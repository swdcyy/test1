package com.kwai.android.common.coroutines.PushScope$coroutineContext$$inlined$CoroutineExceptionHandler$1;
import kotlinx.coroutines.CoroutineExceptionHandler;
import asd.a;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext;
import java.lang.Throwable;
import com.kwai.android.common.utils.PushLogcat;
import java.lang.StringBuilder;
import java.lang.String;
import p45.f;
import com.kwai.android.pushlog.PushLogger;
import java.lang.Object;
import kotlin.Pair;

public final class PushScope$coroutineContext$$inlined$CoroutineExceptionHandler$1 extends a implements CoroutineExceptionHandler	// class@000989
{

    public void PushScope$coroutineContext$$inlined$CoroutineExceptionHandler$1(CoroutineContext$b p0){
       super(p0);
    }
    public void handleException(CoroutineContext p0,Throwable p1){
       PushLogcat.INSTANCE.e("KwaiPushSDK", "push coroutine launch function caught a exception:"+p1.getMessage(), p1);
       Pair[] pairArray = new Pair[0];
       PushLogger.c().f("push coroutine launch error", String.valueOf(p1.getMessage()), p1, pairArray);
    }
}
