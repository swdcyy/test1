package kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import jtd.d;
import msd.q;
import asd.c;
import java.lang.Object;
import jtd.e;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2;
import msd.a;
import kotlinx.coroutines.flow.internal.CombineKt;
import nsd.c0;

public final class FlowKt__ZipKt$combineTransform$7 extends SuspendLambda implements p	// class@001b00
{
    public final d[] $flowArray;
    public final q $transform;
    public Object L$0;
    public int label;
    public e p$;

    public void FlowKt__ZipKt$combineTransform$7(d[] p0,q p1,c p2){
       this.$flowArray = p0;
       this.$transform = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       FlowKt__ZipKt$combineTransform$7 uocombineTra = new FlowKt__ZipKt$combineTransform$7(this.$flowArray, this.$transform, p1);
       uocombineTra.p$ = p0;
       return uocombineTra;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       FlowKt__ZipKt$combineTransform$7 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          a.w();
          this.L$0 = p0;
          this.label = 1;
          if (CombineKt.c(p0, this.$flowArray, new FlowKt__ZipKt$combineTransform$7$1(this), new FlowKt__ZipKt$combineTransform$7$2(this, null), this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
    public final Object invokeSuspend$$forInline(Object p0){
       a.w();
       c0.e(0);
       CombineKt.c(this.p$, this.$flowArray, new FlowKt__ZipKt$combineTransform$7$1(this), new FlowKt__ZipKt$combineTransform$7$2(this, null), this);
       c0.e(2);
       c0.e(1);
       return l1.a;
    }
}
