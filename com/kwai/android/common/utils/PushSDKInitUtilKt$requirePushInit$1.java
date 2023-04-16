package com.kwai.android.common.utils.PushSDKInitUtilKt$requirePushInit$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import com.kwai.android.common.utils.PushSDKInitState;
import java.util.concurrent.atomic.AtomicBoolean;
import android.os.Looper;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Thread;
import java.lang.ClassLoader;
import java.lang.Class;
import gv6.d;
import java.lang.NullPointerException;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.IllegalStateException;

public final class PushSDKInitUtilKt$requirePushInit$1 extends Lambda implements a	// class@0009a7
{
    public final a $afterInitAction;

    public void PushSDKInitUtilKt$requirePushInit$1(a p0){
       this.$afterInitAction = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       try{
          PushSDKInitState iNSTANCE = PushSDKInitState.INSTANCE;
          if (!iNSTANCE.isInit().get() && !iNSTANCE.getReentryFlag$lib_common_release().get()) {
             iNSTANCE.getReentryFlag$lib_common_release().set(true);
             Looper mainLooper = Looper.getMainLooper();
             a.o(mainLooper, "Looper.getMainLooper\(\)");
             Thread thread = mainLooper.getThread();
             a.o(thread, "Looper.getMainLooper\(\).thread");
             Class uClass = Class.forName("com.kwai.lib.adapter.PushSDKLazyInitializerImpl", true, thread.getContextClassLoader());
             if (uClass != null) {
                Object obj = uClass.newInstance();
                a.o(obj, "clzImpl.newInstance\(\)");
                obj.syncInitialize();
                iNSTANCE.getReentryFlag$lib_common_release().set(false);
             }else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<out com.kwai.lib.interfacies.IPushSDKLazyInitializer>");
             }
          }
          this.$afterInitAction.invoke();
          return;
       }catch(java.lang.ClassNotFoundException e0){
          this.$afterInitAction.invoke();
          throw new IllegalStateException("push sdk lazy initializer <com.kwai.lib.adapter.PushSDKLazyInitializerImpl> not found! ", e0);
       }
    }
}
