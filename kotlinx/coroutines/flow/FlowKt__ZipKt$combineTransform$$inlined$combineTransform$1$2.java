package kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransform$1$2;
import msd.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransform$1;
import asd.c;
import jtd.e;
import java.lang.Object;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import msd.r;

public final class FlowKt__ZipKt$combineTransform$$inlined$combineTransform$1$2 extends SuspendLambda implements q	// class@001aee
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public e p$;
    public Object[] p$0;
    public final FlowKt__ZipKt$combineTransform$$inlined$combineTransform$1 this$0;

    public void FlowKt__ZipKt$combineTransform$$inlined$combineTransform$1$2(FlowKt__ZipKt$combineTransform$$inlined$combineTransform$1 p0,c p1){
       this.this$0 = p0;
       super(3, p1);
    }
    public final c create(e p0,Object[] p1,c p2){
       FlowKt__ZipKt$combineTransform$$inlined$combineTransform$1$2 uocombineTra = new FlowKt__ZipKt$combineTransform$$inlined$combineTransform$1$2(this.this$0, p2);
       uocombineTra.p$ = p0;
       uocombineTra.p$0 = p1;
       return uocombineTra;
    }
    public final Object invoke(Object p0,Object p1,Object p2){
       return this.create(p0, p1, p2).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       FlowKt__ZipKt$combineTransform$$inlined$combineTransform$1$2 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          tlabel = this.p$0;
          this.L$0 = p0;
          this.L$1 = tlabel;
          this.L$2 = this;
          this.L$3 = tlabel;
          this.L$4 = p0;
          this.label = 1;
          if (this.this$0.$transform$inlined.invoke(p0, tlabel[0], tlabel[1], this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
