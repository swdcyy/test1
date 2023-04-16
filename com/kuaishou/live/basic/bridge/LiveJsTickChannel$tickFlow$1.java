package com.kuaishou.live.basic.bridge.LiveJsTickChannel$tickFlow$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import jtd.e;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import kotlinx.coroutines.c;

public final class LiveJsTickChannel$tickFlow$1 extends SuspendLambda implements p	// class@000cae
{
    public Object L$0;
    public int label;
    public e p$;

    public void LiveJsTickChannel$tickFlow$1(c p0){
       super(2, p0);
    }
    public final c create(Object p0,c p1){
       LiveJsTickChannel$tickFlow$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveJsTickChannel$tickFlow$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new LiveJsTickChannel$tickFlow$1(p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveJsTickChannel$tickFlow$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       c uoc;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsTickChannel$tickFlow$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       LiveJsTickChannel$tickFlow$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel != 1) {
             if (tlabel == 2) {
                j0.n(p0);
                p0 = this.L$0;
             }else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
             }
          }else {
             tlabel = this.L$0;
             j0.n(p0);
             p0 = this;
          label_004b :
             p0.L$0 = tlabel;
             p0.label = 2;
             if (tlabel.emit(l1.a, p0) == obj) {
                return obj;
             }else {
                uoc = p0;
                p0 = tlabel;
             label_003b :
                uoc.L$0 = p0;
                uoc.label = 1;
                if (c.a(1000, uoc) == obj) {
                   return obj;
                }else {
                   tlabel = p0;
                   p0 = uoc;
                   goto label_004b ;
                }
             }
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
       }
       uoc = this;
       goto label_003b ;
    }
}
