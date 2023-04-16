package androidx.work.CoroutineWorker$startWork$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import androidx.work.CoroutineWorker;
import asd.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import androidx.work.ListenableWorker$a;
import w3.a;
import java.lang.Throwable;

public final class CoroutineWorker$startWork$1 extends SuspendLambda implements p	// class@000a47
{
    public Object L$0;
    public int label;
    public k0 p$;
    public final CoroutineWorker this$0;

    public void CoroutineWorker$startWork$1(CoroutineWorker p0,c p1){
       this.this$0 = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       a.q(p1, "completion");
       CoroutineWorker$startWork$1 ostartWork$1 = new CoroutineWorker$startWork$1(this.this$0, p1);
       ostartWork$1.p$ = p0;
       return ostartWork$1;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       CoroutineWorker$startWork$1 tlabel = this.label;
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
          p0 = this.this$0.a(this);
          if (p0 == obj) {
             return obj;
          }
       }
       this.this$0.d().J(p0);
       return l1.a;
    }
}
