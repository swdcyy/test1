package kotlinx.coroutines.flow.internal.CombineKt$asChannel$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import jtd.d;
import asd.c;
import java.lang.Object;
import htd.w;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import kotlinx.coroutines.flow.internal.CombineKt$asChannel$1$a;
import jtd.e;

public final class CombineKt$asChannel$1 extends SuspendLambda implements p	// class@001b17
{
    public final d $flow;
    public Object L$0;
    public Object L$1;
    public int label;
    public w p$;

    public void CombineKt$asChannel$1(d p0,c p1){
       this.$flow = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       CombineKt$asChannel$1 uoasChannel$ = new CombineKt$asChannel$1(this.$flow, p1);
       uoasChannel$.p$ = p0;
       return uoasChannel$;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       CombineKt$asChannel$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          tlabel = this.$flow;
          this.L$0 = p0;
          this.L$1 = tlabel;
          this.label = 1;
          if (tlabel.b(new CombineKt$asChannel$1$a(p0), this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
