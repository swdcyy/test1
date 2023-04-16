package kotlinx.coroutines.JobSupport$children$1;
import msd.p;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlinx.coroutines.JobSupport;
import asd.c;
import java.lang.Object;
import wsd.o;
import qrd.l1;
import csd.b;
import ftd.r;
import ltd.o;
import ltd.m;
import ftd.k2;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import ftd.t1;
import kotlin.jvm.internal.a;
import kotlin.TypeCastException;

public final class JobSupport$children$1 extends RestrictedSuspendLambda implements p	// class@001929
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public o p$;
    public final JobSupport this$0;

    public void JobSupport$children$1(JobSupport p0,c p1){
       this.this$0 = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       JobSupport$children$1 uochildren$1 = new JobSupport$children$1(this.this$0, p1);
       uochildren$1.p$ = p0;
       return uochildren$1;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       JobSupport$children$1 tL$3;
       JobSupport$children$1 tL$1;
       JobSupport$children$1 tL$0;
       Object obj = b.h();
       JobSupport$children$1 tlabel = this.label;
       int i = 2;
       if (tlabel != null) {
          if (tlabel != 1) {
             if (tlabel == i) {
                tlabel = this.L$4;
                tL$3 = this.L$3;
                JobSupport$children$1 tL$2 = this.L$2;
                tL$1 = this.L$1;
                tL$0 = this.L$0;
                j0.n(p0);
                p0 = this;
             label_009b :
                o oo = tlabel.M();
             label_0076 :
                int i1 = a.g(oo, tL$3) ^ 1;
                if (i1) {
                   if (oo instanceof r) {
                      Object obj1 = oo;
                      p0.L$0 = tL$0;
                      p0.L$1 = tL$1;
                      p0.L$2 = tL$2;
                      p0.L$3 = tL$3;
                      p0.L$4 = oo;
                      p0.L$5 = obj1;
                      p0.label = i;
                      if (tL$0.b(obj1.f, p0) == obj) {
                         return obj;
                      }else {
                         goto label_009b ;
                      }
                   }else {
                      goto label_009b ;
                   }
                }
             }else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
             }
          }else {
             j0.n(p0);
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          JobSupport$children$1 obj2 = this.this$0.y0();
          if (obj2 instanceof r) {
             this.L$0 = p0;
             this.L$1 = obj2;
             this.label = 1;
             if (p0.b(obj2.f, this) == obj) {
                return obj;
             }
          }else if(obj2 instanceof t1){
             tL$3 = obj2.b();
             if (tL$3 != null) {
                k2 obj3 = tL$3.L();
                if (obj3 != null) {
                   tL$0 = p0;
                   tL$1 = obj2;
                   obj2 = obj3;
                   p0 = this;
                   obj3 = tL$3;
                   goto label_0076 ;
                }else {
                   throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                }
             }
          }
       }
       return l1.a;
    }
}
