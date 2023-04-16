package kotlinx.coroutines.InterruptibleKt$runInterruptible$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import msd.a;
import asd.c;
import java.lang.Object;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.InterruptibleKt;
import java.lang.IllegalStateException;
import java.lang.String;

public final class InterruptibleKt$runInterruptible$2 extends SuspendLambda implements p	// class@001923
{
    public final a $block;
    public int label;
    public k0 p$;

    public void InterruptibleKt$runInterruptible$2(a p0,c p1){
       this.$block = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       InterruptibleKt$runInterruptible$2 orunInterrup = new InterruptibleKt$runInterruptible$2(this.$block, p1);
       orunInterrup.p$ = p0;
       return orunInterrup;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       return InterruptibleKt.c(this.p$.getCoroutineContext(), this.$block);
    }
}
