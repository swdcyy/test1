package com.kuaishou.live.common.core.component.effect.multieffect.LiveMultiMagicEffectManager$addEffectTask$3;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.common.core.component.effect.multieffect.LiveMultiMagicEffectManager;
import xy2.a;
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
import pz2.e;
import zf1.a;
import zf1.b;
import java.lang.Integer;
import dsd.a;
import pz2.i;
import pz2.c;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.component.effect.multieffect.LiveMultiMagicEffectManager$a;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import zf1.d;
import java.util.Collection;

public final class LiveMultiMagicEffectManager$addEffectTask$3 extends SuspendLambda implements p	// class@0010e0
{
    public final a $task;
    public Object L$0;
    public Object L$1;
    public int label;
    public k0 p$;
    public final LiveMultiMagicEffectManager this$0;

    public void LiveMultiMagicEffectManager$addEffectTask$3(LiveMultiMagicEffectManager p0,a p1,c p2){
       this.this$0 = p0;
       this.$task = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       LiveMultiMagicEffectManager$addEffectTask$3 obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMultiMagicEffectManager$addEffectTask$3.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new LiveMultiMagicEffectManager$addEffectTask$3(this.this$0, this.$task, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMultiMagicEffectManager$addEffectTask$3.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       LiveMultiMagicEffectManager b;
       LiveMultiMagicEffectManager$addEffectTask$3 obj = PatchProxy.applyOneRefs(p0, this, LiveMultiMagicEffectManager$addEffectTask$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       LiveMultiMagicEffectManager$addEffectTask$3 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             obj = this.L$1;
             j0.n(p0);
          label_0053 :
             obj.a = p0;
             p0.b = a.f(this.$task.K());
             p0 = this.this$0.a;
             if (p0 != null) {
                p0.e(this.this$0.g);
             }
             p0 = this.this$0.a;
             if (p0 != null) {
                p0.n5(this.$task);
             }
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          if (!a.a(this.this$0.a)) {
             tlabel = this.this$0;
             this.L$0 = p0;
             this.L$1 = tlabel;
             this.label = 1;
             p0 = tlabel.i.a(this.$task.K(), this);
             if (p0 == obj) {
                return obj;
             }else {
                obj = tlabel;
                goto label_0053 ;
             }
          }else {
             int i = this.$task.K();
             b = this.this$0.b;
             if (b != null && i == b.intValue()) {
                i = this.this$0.a;
                if (i != null) {
                   i.n5(this.$task);
                }
             }else {
                i = "[addEffectTask]ignore biz:"+this.$task.K();
                LiveMultiMagicEffectManager.k.b(i);
                b = this.this$0.d;
                ArrayList uArrayList = new ArrayList(u.Y(b, 10));
                Iterator iterator = b.iterator();
                while (iterator.hasNext()) {
                   iterator.next().f(this.$task, 1, 2, i);
                   uArrayList.add(l1.a);
                }
             }
          }
       }
       return l1.a;
    }
}
