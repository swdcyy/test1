package com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$Task$downloadMusic$2$defferMusic$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$Task$downloadMusic$2;
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
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$Task$downloadMusic$2$defferMusic$1$1;
import kotlinx.coroutines.TimeoutKt;

public final class RapRepo$Task$downloadMusic$2$defferMusic$1 extends SuspendLambda implements p	// class@0010b3
{
    public Object L$0;
    public int label;
    public k0 p$;
    public final RapRepo$Task$downloadMusic$2 this$0;

    public void RapRepo$Task$downloadMusic$2$defferMusic$1(RapRepo$Task$downloadMusic$2 p0,c p1){
       this.this$0 = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       RapRepo$Task$downloadMusic$2$defferMusic$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, RapRepo$Task$downloadMusic$2$defferMusic$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new RapRepo$Task$downloadMusic$2$defferMusic$1(this.this$0, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, RapRepo$Task$downloadMusic$2$defferMusic$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RapRepo$Task$downloadMusic$2$defferMusic$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       RapRepo$Task$downloadMusic$2$defferMusic$1 tlabel = this.label;
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
          p0 = TimeoutKt.e(0x186a0, new RapRepo$Task$downloadMusic$2$defferMusic$1$1(this, null), this);
          if (p0 == obj) {
             return obj;
          }
       }
       return p0;
    }
}
