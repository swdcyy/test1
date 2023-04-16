package com.yxcorp.gifshow.push.PushBells$playOneShotNoSuspend$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import android.content.Context;
import msd.a;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import com.yxcorp.gifshow.push.PushBells;

public final class PushBells$playOneShotNoSuspend$2 extends SuspendLambda implements p	// class@001616
{
    public final Context $context;
    public final a $finishCallback;
    public final int $playTimes;
    public final int $resId;
    public Object L$0;
    public int label;
    public k0 p$;

    public void PushBells$playOneShotNoSuspend$2(Context p0,int p1,int p2,a p3,c p4){
       this.$context = p0;
       this.$resId = p1;
       this.$playTimes = p2;
       this.$finishCallback = p3;
       super(2, p4);
    }
    public final c create(Object p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PushBells$playOneShotNoSuspend$2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       PushBells$playOneShotNoSuspend$2 oplayOneShot = new PushBells$playOneShotNoSuspend$2(this.$context, this.$resId, this.$playTimes, this.$finishCallback, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PushBells$playOneShotNoSuspend$2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PushBells$playOneShotNoSuspend$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       PushBells$playOneShotNoSuspend$2 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          this.L$0 = this.p$;
          this.label = 1;
          if (PushBells.b.a(this.$context, this.$resId, this.$playTimes, this.$finishCallback, this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
