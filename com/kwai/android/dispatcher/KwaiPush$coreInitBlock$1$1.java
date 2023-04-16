package com.kwai.android.dispatcher.KwaiPush$coreInitBlock$1$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import android.app.Application;
import com.kwai.android.dispatcher.PushConfig;
import asd.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import com.kwai.android.common.utils.PushLogcat;
import java.lang.StringBuilder;
import com.kwai.android.common.config.PushConfigManager;
import kotlinx.coroutines.c;
import com.kwai.android.dispatcher.KwaiPush;

public final class KwaiPush$coreInitBlock$1$1 extends SuspendLambda implements p	// class@0009ab
{
    public final Application $application;
    public final PushConfig $config;
    public int label;

    public void KwaiPush$coreInitBlock$1$1(Application p0,PushConfig p1,c p2){
       this.$application = p0;
       this.$config = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       a.p(p1, "completion");
       return new KwaiPush$coreInitBlock$1$1(this.$application, this.$config, p1);
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       KwaiPush$coreInitBlock$1$1 tlabel = this.label;
       KwaiPush$coreInitBlock$1$1 uocoreInitBl = 1;
       if (tlabel != null) {
          if (tlabel != uocoreInitBl) {
             if (tlabel == 2) {
                j0.n(p0);
             label_0060 :
                return l1.a;
             }else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
             }
          }else {
             j0.n(p0);
          }
       }else {
          j0.n(p0);
          PushConfigManager iNSTANCE = PushConfigManager.INSTANCE;
          PushLogcat.INSTANCE.i("KwaiPushSDK", "push sdk core init will running after "+iNSTANCE.getDelayInitMs()+" ms");
          this.label = uocoreInitBl;
          if (c.a(iNSTANCE.getDelayInitMs(), this) == obj) {
             return obj;
          }
       }
       this.label = 2;
       if (KwaiPush.INSTANCE.coreInitInternal(this.$application, this.$config, this) == obj) {
          return obj;
       }else {
          goto label_0060 ;
       }
    }
}
