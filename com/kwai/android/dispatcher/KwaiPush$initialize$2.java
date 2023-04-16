package com.kwai.android.dispatcher.KwaiPush$initialize$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.app.Application;
import com.kwai.android.dispatcher.PushConfig;
import msd.l;
import java.lang.Object;
import qrd.l1;
import com.kwai.android.common.utils.PushSDKInitState;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.Context;
import com.kwai.android.common.utils.ContextProvider;
import com.kwai.lib.interfacies.AzerothCodeAdapter;
import java.lang.IllegalStateException;
import java.lang.String;
import p45.f;
import com.kwai.android.pushlog.PushLogger;
import kotlin.Pair;
import java.lang.Throwable;
import com.kwai.android.dispatcher.KwaiPush;
import msd.p;
import com.kwai.android.common.utils.PushLogcat;

public final class KwaiPush$initialize$2 extends Lambda implements a	// class@0009b0
{
    public final Application $application;
    public final PushConfig $config;
    public final l $coreInit;

    public void KwaiPush$initialize$2(Application p0,PushConfig p1,l p2){
       this.$application = p0;
       this.$config = p1;
       this.$coreInit = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       PushSDKInitState iNSTANCE = PushSDKInitState.INSTANCE;
       if (iNSTANCE.isInit().get()) {
          return;
       }
       ContextProvider.init(this.$application);
       AzerothCodeAdapter b = AzerothCodeAdapter.b;
       if (!b.azerothHasInit()) {
          IllegalStateException illegalState = new IllegalStateException("Azeroth 需要在PushSDK之前初始化完成, 否则PushSDK无法初始化!");
          Pair[] pairArray = new Pair[0];
          f.g(PushLogger.c(), "initialize azeroth not init", null, illegalState, pairArray, 2, null);
          if (b.isDebugMode()) {
             throw illegalState;
          }
       }
       KwaiPush iNSTANCE1 = KwaiPush.INSTANCE;
       iNSTANCE1.baseInitInternal(this.$application, this.$config);
       this.$coreInit.invoke(KwaiPush.access$getCoreInitBlock$p(iNSTANCE1));
       iNSTANCE.isInit().getAndSet(true);
       return;
    }
}
