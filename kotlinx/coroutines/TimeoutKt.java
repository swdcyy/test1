package kotlinx.coroutines.TimeoutKt;
import ftd.z1;
import kotlinx.coroutines.TimeoutCancellationException;
import java.lang.StringBuilder;
import java.lang.String;
import ftd.l3;
import msd.p;
import java.lang.Object;
import ltd.a0;
import kotlin.coroutines.CoroutineContext;
import asd.c;
import ftd.s0;
import kotlinx.coroutines.c;
import java.lang.Runnable;
import ftd.c1;
import ftd.c2;
import mtd.b;
import csd.b;
import dsd.e;
import kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1;
import kotlin.jvm.internal.Ref$ObjectRef;
import qrd.j0;
import java.lang.IllegalStateException;

public final class TimeoutKt	// class@00192e
{

    public static final TimeoutCancellationException a(long p0,z1 p1){
       return new TimeoutCancellationException("Timed out waiting for "+p0+" ms", p1);
    }
    public static final Object b(l3 p0,p p1){
       c2.z(p0, c.c(p0.e.getContext()).k(p0.f, p0));
       return b.g(p0, p0, p1);
    }
    public static final Object c(long p0,p p1,c p2){
       if (p0 - null <= 0) {
          throw new TimeoutCancellationException("Timed out immediately");
       }
       Object obj = TimeoutKt.b(new l3(p0, p2), p1);
       if (obj == b.h()) {
          e.c(p2);
       }
       return obj;
    }
    public static final Object d(double p0,p p1,c p2){
       return TimeoutKt.c(c.d(p0), p1, p2);
    }
    public static final Object e(long p0,p p1,c p2){
       TimeoutKt$withTimeoutOrNull$1 owithTimeout;
       Ref$ObjectRef objectRef;
       Ref$ObjectRef obj1;
       if (p2 instanceof TimeoutKt$withTimeoutOrNull$1) {
          owithTimeout = p2;
          TimeoutKt$withTimeoutOrNull$1 label = owithTimeout.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             owithTimeout.label = label - i;
             try{
             label_0018 :
                TimeoutKt$withTimeoutOrNull$1 result = owithTimeout.result;
                Object obj = b.h();
                TimeoutKt$withTimeoutOrNull$1 label1 = owithTimeout.label;
                if (label1 != null) {
                   if (label1 == 1) {
                      try{
                         j0.n(result);
                      }catch(kotlinx.coroutines.TimeoutCancellationException e8){
                      }
                      if (e8.coroutine == owithTimeout.L$1.element) {
                         return null;
                      }else {
                         throw e8;
                      }
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   j0.n(result);
                   if (p0 <= 0) {
                      return null;
                   }else {
                      objectRef = new Ref$ObjectRef();
                      objectRef.element = null;
                      owithTimeout.J$0 = p0;
                      owithTimeout.L$0 = p1;
                      owithTimeout.L$1 = objectRef;
                      owithTimeout.label = 1;
                      l3 ol3 = new l3(p0, owithTimeout);
                      objectRef.element = ol3;
                      obj1 = TimeoutKt.b(ol3, p1);
                      if (obj1 == b.h()) {
                         e.c(owithTimeout);
                      }
                      if (obj1 == obj) {
                         return obj;
                      }else {
                         result = obj1;
                      }
                   }
                }
                return result;
             }catch(kotlinx.coroutines.TimeoutCancellationException e8){
                obj1 = objectRef;
                goto label_0070 ;
             }
          }
       }
       owithTimeout = new TimeoutKt$withTimeoutOrNull$1(p2);
       goto label_0018 ;
    }
    public static final Object f(double p0,p p1,c p2){
       return TimeoutKt.e(c.d(p0), p1, p2);
    }
}
