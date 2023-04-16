package kotlinx.coroutines.flow.internal.CombineKt$onReceive$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import msd.a;
import asd.c;
import java.lang.Object;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import nsd.c0;

public final class CombineKt$onReceive$1 extends SuspendLambda implements p	// class@001b22
{
    public final a $onClosed;
    public final p $onReceive;
    public Object L$0;
    public int label;
    public Object p$0;

    public void CombineKt$onReceive$1(a p0,p p1,c p2){
       this.$onClosed = p0;
       this.$onReceive = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       CombineKt$onReceive$1 oonReceive$1 = new CombineKt$onReceive$1(this.$onClosed, this.$onReceive, p1);
       oonReceive$1.p$0 = p0;
       return oonReceive$1;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       CombineKt$onReceive$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$0;
          if (p0 == null) {
             this.$onClosed.invoke();
          }else {
             this.L$0 = p0;
             this.label = 1;
             if (this.$onReceive.invoke(p0, this) == obj) {
                return obj;
             }
          }
       }
       return l1.a;
    }
    public final Object invokeSuspend$$forInline(Object p0){
       p0 = this.p$0;
       if (p0 == null) {
          this.$onClosed.invoke();
       }else {
          c0.e(0);
          this.$onReceive.invoke(p0, this);
          c0.e(2);
          c0.e(1);
       }
       return l1.a;
    }
}
