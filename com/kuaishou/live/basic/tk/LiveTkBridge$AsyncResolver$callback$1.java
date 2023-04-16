package com.kuaishou.live.basic.tk.LiveTkBridge$AsyncResolver$callback$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.basic.tk.LiveTkBridge$AsyncResolver;
import o63.n;
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
import tx4.h;
import java.lang.IllegalStateException;

public final class LiveTkBridge$AsyncResolver$callback$1 extends SuspendLambda implements p	// class@000d0e
{
    public final n $result;
    public int label;
    public k0 p$;
    public final LiveTkBridge$AsyncResolver this$0;

    public void LiveTkBridge$AsyncResolver$callback$1(LiveTkBridge$AsyncResolver p0,n p1,c p2){
       this.this$0 = p0;
       this.$result = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       LiveTkBridge$AsyncResolver$callback$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveTkBridge$AsyncResolver$callback$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new LiveTkBridge$AsyncResolver$callback$1(this.this$0, this.$result, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveTkBridge$AsyncResolver$callback$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, LiveTkBridge$AsyncResolver$callback$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       obj = new Object[]{this.$result.b};
       this.this$0.c.call(obj);
       return l1.a;
    }
}
