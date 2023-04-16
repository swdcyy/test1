package com.kwai.android.dispatcher.KwaiPush$coreInitInternal$2$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import asd.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import qrd.l1;
import csd.b;
import qrd.j0;
import com.kwai.android.dispatcher.KwaiPush;
import java.lang.IllegalStateException;

public final class KwaiPush$coreInitInternal$2$1 extends SuspendLambda implements p	// class@0009ae
{
    public int label;

    public void KwaiPush$coreInitInternal$2$1(c p0){
       super(2, p0);
    }
    public final c create(Object p0,c p1){
       a.p(p1, "completion");
       return new KwaiPush$coreInitInternal$2$1(p1);
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       try{
          j0.n(p0);
          KwaiPush.INSTANCE.runPending();
          return l1.a;
       }catch(java.lang.Exception e0){
       }
    }
}
