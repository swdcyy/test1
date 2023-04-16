package kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import jtd.d;
import msd.r;
import asd.c;
import java.lang.Object;
import jtd.e;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$1$1;
import kotlinx.coroutines.flow.internal.CombineKt;

public final class FlowKt__ZipKt$combineTransform$1 extends SuspendLambda implements p	// class@001afa
{
    public final d $flow;
    public final d $this_combineTransform;
    public final r $transform;
    public Object L$0;
    public int label;
    public e p$;

    public void FlowKt__ZipKt$combineTransform$1(d p0,d p1,r p2,c p3){
       this.$this_combineTransform = p0;
       this.$flow = p1;
       this.$transform = p2;
       super(2, p3);
    }
    public final c create(Object p0,c p1){
       FlowKt__ZipKt$combineTransform$1 uocombineTra = new FlowKt__ZipKt$combineTransform$1(this.$this_combineTransform, this.$flow, this.$transform, p1);
       uocombineTra.p$ = p0;
       return uocombineTra;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       FlowKt__ZipKt$combineTransform$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          this.L$0 = p0;
          this.label = 1;
          if (CombineKt.d(p0, this.$this_combineTransform, this.$flow, new FlowKt__ZipKt$combineTransform$1$1(this, null), this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
