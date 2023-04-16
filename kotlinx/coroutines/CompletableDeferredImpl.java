package kotlinx.coroutines.CompletableDeferredImpl;
import ftd.u;
import otd.d;
import kotlinx.coroutines.JobSupport;
import ftd.z1;
import asd.c;
import java.lang.Object;
import kotlinx.coroutines.CompletableDeferredImpl$await$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Throwable;
import ftd.x;
import nsd.u;
import otd.f;
import msd.p;

public final class CompletableDeferredImpl extends JobSupport implements u, d	// class@001918
{

    public void CompletableDeferredImpl(z1 p0){
       super(true);
       this.B0(p0);
    }
    public Object C(c p0){
       CompletableDeferredImpl$await$1 uoawait$1;
       if (p0 instanceof CompletableDeferredImpl$await$1) {
          uoawait$1 = p0;
          CompletableDeferredImpl$await$1 label = uoawait$1.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uoawait$1.label = label - i;
          label_0018 :
             CompletableDeferredImpl$await$1 result = uoawait$1.result;
             Object obj = b.h();
             CompletableDeferredImpl$await$1 label1 = uoawait$1.label;
             if (label1 != null) {
                if (label1 == 1) {
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                uoawait$1.L$0 = this;
                uoawait$1.label = 1;
                result = this.Z(uoawait$1);
                if (result == obj) {
                   return obj;
                }
             }
             return result;
          }
       }
       uoawait$1 = new CompletableDeferredImpl$await$1(this, p0);
       goto label_0018 ;
    }
    public d R(){
       return this;
    }
    public boolean d(Throwable p0){
       return this.J0(new x(p0, false, 2, null));
    }
    public Object e(){
       return this.p0();
    }
    public boolean j(Object p0){
       return this.J0(p0);
    }
    public void r(f p0,p p1){
       this.W0(p0, p1);
    }
    public boolean v0(){
       return true;
    }
}
