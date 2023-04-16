package com.kuaishou.live.basic.tk.LiveTkBridge$invoke$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.basic.tk.LiveTkBridge;
import java.lang.String;
import tx4.h;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;

public final class LiveTkBridge$invoke$1 extends SuspendLambda implements p	// class@000d17
{
    public final h $function;
    public final String $functionName;
    public final String $jsonData;
    public Object L$0;
    public int label;
    public k0 p$;
    public final LiveTkBridge this$0;

    public void LiveTkBridge$invoke$1(LiveTkBridge p0,String p1,String p2,h p3,c p4){
       this.this$0 = p0;
       this.$functionName = p1;
       this.$jsonData = p2;
       this.$function = p3;
       super(2, p4);
    }
    public final c create(Object p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveTkBridge$invoke$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       LiveTkBridge$invoke$1 oinvoke$1 = new LiveTkBridge$invoke$1(this.this$0, this.$functionName, this.$jsonData, this.$function, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveTkBridge$invoke$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveTkBridge$invoke$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       LiveTkBridge$invoke$1 tlabel = this.label;
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
          if (this.this$0.g(this.$functionName, this.$jsonData, this.$function, this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
