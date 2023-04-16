package kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import jtd.d;
import asd.c;
import java.lang.Object;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import jtd.f;

public final class FlowKt__CollectKt$launchIn$1 extends SuspendLambda implements p	// class@0019d4
{
    public final d $this_launchIn;
    public Object L$0;
    public int label;
    public k0 p$;

    public void FlowKt__CollectKt$launchIn$1(d p0,c p1){
       this.$this_launchIn = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       FlowKt__CollectKt$launchIn$1 olaunchIn$1 = new FlowKt__CollectKt$launchIn$1(this.$this_launchIn, p1);
       olaunchIn$1.p$ = p0;
       return olaunchIn$1;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       FlowKt__CollectKt$launchIn$1 tlabel = this.label;
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
          if (f.v(this.$this_launchIn, this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
