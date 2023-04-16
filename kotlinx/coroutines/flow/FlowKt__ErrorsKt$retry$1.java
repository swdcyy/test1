package kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import asd.c;
import java.lang.Object;
import java.lang.Throwable;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.Boolean;
import dsd.a;
import java.lang.IllegalStateException;
import java.lang.String;

public final class FlowKt__ErrorsKt$retry$1 extends SuspendLambda implements p	// class@001a17
{
    public int label;
    public Throwable p$0;

    public void FlowKt__ErrorsKt$retry$1(c p0){
       super(2, p0);
    }
    public final c create(Object p0,c p1){
       FlowKt__ErrorsKt$retry$1 oretry$1 = new FlowKt__ErrorsKt$retry$1(p1);
       oretry$1.p$0 = p0;
       return oretry$1;
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
       return a.a(true);
    }
}
