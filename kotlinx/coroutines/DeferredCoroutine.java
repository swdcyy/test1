package kotlinx.coroutines.DeferredCoroutine;
import ftd.r0;
import otd.d;
import ftd.a;
import kotlin.coroutines.CoroutineContext;
import asd.c;
import java.lang.Object;
import kotlinx.coroutines.DeferredCoroutine$await$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import kotlinx.coroutines.JobSupport;
import otd.f;
import msd.p;

public class DeferredCoroutine extends a implements r0, d	// class@001921
{

    public void DeferredCoroutine(CoroutineContext p0,boolean p1){
       super(p0, p1);
    }
    public static Object s1(DeferredCoroutine p0,c p1){
       DeferredCoroutine$await$1 uoawait$1;
       if (p1 instanceof DeferredCoroutine$await$1) {
          uoawait$1 = p1;
          DeferredCoroutine$await$1 label = uoawait$1.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uoawait$1.label = label - i;
          label_0018 :
             DeferredCoroutine$await$1 result = uoawait$1.result;
             Object obj = b.h();
             DeferredCoroutine$await$1 label1 = uoawait$1.label;
             if (label1 != null) {
                if (label1 == 1) {
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                uoawait$1.L$0 = p0;
                uoawait$1.label = 1;
                result = p0.Z(uoawait$1);
                if (result == obj) {
                   return obj;
                }
             }
             return result;
          }
       }
       uoawait$1 = new DeferredCoroutine$await$1(p0, p1);
       goto label_0018 ;
    }
    public Object C(c p0){
       return DeferredCoroutine.s1(this, p0);
    }
    public d R(){
       return this;
    }
    public Object e(){
       return this.p0();
    }
    public void r(f p0,p p1){
       this.W0(p0, p1);
    }
}
