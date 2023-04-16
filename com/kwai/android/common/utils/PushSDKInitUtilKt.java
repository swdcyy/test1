package com.kwai.android.common.utils.PushSDKInitUtilKt;
import java.lang.Object;
import msd.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.android.common.utils.PushSDKInitUtilKt$exclusiveInitBlocking$1;
import com.kwai.android.common.utils.PushSDKInitState;
import java.util.concurrent.atomic.AtomicBoolean;
import com.kwai.android.common.utils.PushSDKInitUtilKt$requirePushInit$1;
import qrd.l1;

public final class PushSDKInitUtilKt	// class@0009a8
{
    public static final Object lock;

    static {
       PushSDKInitUtilKt.lock = new Object();
    }
    public static final void exclusiveInitBlocking(a p0){
       a.p(p0, "block");
       PushSDKInitUtilKt.waitingInitLock(new PushSDKInitUtilKt$exclusiveInitBlocking$1(p0));
    }
    public static final boolean isInitReentrant(){
       return PushSDKInitState.INSTANCE.getReentryFlag$lib_common_release().get();
    }
    public static final void requirePushInit(a p0){
       a.p(p0, "afterInitAction");
       if (PushSDKInitState.INSTANCE.isInit().get()) {
          p0.invoke();
          return;
       }else {
          PushSDKInitUtilKt.waitingInitLock(new PushSDKInitUtilKt$requirePushInit$1(p0));
          return;
       }
    }
    public static final void waitingInitLock(a p0){
       a.p(p0, "block");
       Object lock = PushSDKInitUtilKt.lock;
       _monitor_enter(lock);
       p0.invoke();
       _monitor_exit(lock);
    }
}
