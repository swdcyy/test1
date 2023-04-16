package kotlinx.coroutines.debug.internal.DebugCoroutineInfo$creationStackTrace$1;
import msd.p;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfo;
import dsd.c;
import asd.c;
import java.lang.Object;
import wsd.o;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;

public final class DebugCoroutineInfo$creationStackTrace$1 extends RestrictedSuspendLambda implements p	// class@0019a7
{
    public final c $bottom;
    public Object L$0;
    public int label;
    public o p$;
    public final DebugCoroutineInfo this$0;

    public void DebugCoroutineInfo$creationStackTrace$1(DebugCoroutineInfo p0,c p1,c p2){
       this.this$0 = p0;
       this.$bottom = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       DebugCoroutineInfo$creationStackTrace$1 uocreationSt = new DebugCoroutineInfo$creationStackTrace$1(this.this$0, this.$bottom, p1);
       uocreationSt.p$ = p0;
       return uocreationSt;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       DebugCoroutineInfo$creationStackTrace$1 tlabel = this.label;
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
          if (this.this$0.i(p0, this.$bottom.getCallerFrame(), this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
