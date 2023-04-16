package kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import jtd.e;
import asd.c;
import java.lang.Object;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;

public final class UndispatchedContextCollector$emitRef$1 extends SuspendLambda implements p	// class@001b32
{
    public final e $downstream;
    public Object L$0;
    public int label;
    public Object p$0;

    public void UndispatchedContextCollector$emitRef$1(e p0,c p1){
       this.$downstream = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       UndispatchedContextCollector$emitRef$1 uoemitRef$1 = new UndispatchedContextCollector$emitRef$1(this.$downstream, p1);
       uoemitRef$1.p$0 = p0;
       return uoemitRef$1;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       UndispatchedContextCollector$emitRef$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$0;
          this.L$0 = p0;
          this.label = 1;
          if (this.$downstream.emit(p0, this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
