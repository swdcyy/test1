package com.kuaishou.live.core.voiceparty.background.multiimage.Inflater$inflate$3;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.core.voiceparty.background.multiimage.Inflater;
import kotlin.jvm.internal.Ref$ObjectRef;
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
import ho2.d;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.core.voiceparty.background.multiimage.Inflater$InitElements;
import qrd.j0;
import java.lang.IllegalStateException;
import com.kuaishou.live.core.voiceparty.background.multiimage.Inflater$b;
import java.util.Map;
import java.util.List;
import ho2.c;
import ho2.e;
import ho2.i$a;
import android.view.View;
import android.graphics.drawable.Animatable;

public final class Inflater$inflate$3 extends SuspendLambda implements p	// class@00135a
{
    public final Ref$ObjectRef $paramResolver;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public k0 p$;
    public final Inflater this$0;

    public void Inflater$inflate$3(Inflater p0,Ref$ObjectRef p1,c p2){
       this.this$0 = p0;
       this.$paramResolver = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       Inflater$inflate$3 obj = PatchProxy.applyTwoRefs(p0, p1, this, Inflater$inflate$3.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new Inflater$inflate$3(this.this$0, this.$paramResolver, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, Inflater$inflate$3.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Inflater$inflate$3 tL$2;
       Inflater$inflate$3 tL$1;
       Inflater$inflate$3 tL$0;
       Object obj = PatchProxy.applyOneRefs(p0, this, Inflater$inflate$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       Inflater$inflate$3 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             tlabel = this.L$3;
             tL$2 = this.L$2;
             tL$1 = this.L$1;
             tL$0 = this.L$0;
             j0.n(p0);
             p0 = this;
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          tL$2 = this.this$0.e.b();
          tL$0 = this.p$;
          p0 = this;
          tL$1 = new Inflater$InitElements(this.this$0, this.$paramResolver.element.a);
          Iterator iterator = tL$2.iterator();
       }
       while (true) {
          if (tlabel.hasNext()) {
             Object obj1 = tlabel.next();
             Object obj2 = obj1;
             p0.L$0 = tL$0;
             p0.L$1 = tL$1;
             p0.L$2 = tL$2;
             p0.L$3 = tlabel;
             p0.L$4 = obj1;
             p0.L$5 = obj2;
             p0.label = 1;
             if (obj2.a(tL$1, p0) == obj) {
                break ;
             }
          }else {
             p0 = p0.this$0;
             return new i$a(p0.b, p0.a);
          }
       }
       return obj;
    }
}
