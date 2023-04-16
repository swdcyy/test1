package kotlinx.coroutines.channels.ProduceKt;
import htd.w;
import msd.a;
import asd.c;
import java.lang.Object;
import kotlinx.coroutines.channels.ProduceKt$awaitClose$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import kotlin.coroutines.CoroutineContext;
import ftd.z1;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import ftd.l;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1;
import ftd.k;
import msd.l;
import htd.c0;
import dsd.e;
import qrd.l1;
import kotlinx.coroutines.channels.ProduceKt$awaitClose$2;
import ftd.k0;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import htd.y;
import htd.l;
import htd.n;
import ftd.f0;
import htd.v;
import ftd.c1;
import kotlinx.coroutines.JobSupport;
import ftd.a;
import kotlin.coroutines.EmptyCoroutineContext;

public final class ProduceKt	// class@00199e
{

    public static final Object a(w p0,a p1,c p2){
       ProduceKt$awaitClose$1 uoawaitClose;
       ProduceKt$awaitClose$1 uoawaitClose1;
       if (p2 instanceof ProduceKt$awaitClose$1) {
          uoawaitClose = p2;
          ProduceKt$awaitClose$1 label = uoawaitClose.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uoawaitClose.label = label - i;
          label_0018 :
             ProduceKt$awaitClose$1 result = uoawaitClose.result;
             Object obj = b.h();
             ProduceKt$awaitClose$1 label1 = uoawaitClose.label;
             if (label1 != null) {
                if (label1 == 1) {
                   uoawaitClose1 = uoawaitClose.L$1;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                l ol = (uoawaitClose.getContext().get(z1.p0) == p0)? 1: null;
                if (ol) {
                   uoawaitClose.L$0 = p0;
                   uoawaitClose.L$1 = p1;
                   uoawaitClose.label = 1;
                   ol = new l(IntrinsicsKt__IntrinsicsJvmKt.d(uoawaitClose), 1);
                   ol.u();
                   p0.t(new ProduceKt$awaitClose$4$1(ol));
                   p0 = ol.r();
                   if (p0 == b.h()) {
                      e.c(uoawaitClose);
                   }
                   if (p0 == obj) {
                      return obj;
                   }
                }else {
                   throw new IllegalStateException("awaitClose\(\) can only be invoked from the producer context".toString());
                }
             }
             uoawaitClose1.invoke();
             return l1.a;
          }
       }
       uoawaitClose = new ProduceKt$awaitClose$1(p2);
       goto label_0018 ;
    }
    public static Object b(w p0,a p1,c p2,int p3,Object p4){
       ProduceKt$awaitClose$2 iNSTANCE;
       if (p3 & 0x01) {
          iNSTANCE = ProduceKt$awaitClose$2.INSTANCE;
       }
       return ProduceKt.a(p0, iNSTANCE, p2);
    }
    public static final y c(k0 p0,CoroutineContext p1,int p2,CoroutineStart p3,l p4,p p5){
       v ov = new v(f0.d(p0, p1), n.a(p2));
       if (p4 != null) {
          ov.S(p4);
       }
       ov.q1(p3, ov, p5);
       return ov;
    }
    public static final y d(k0 p0,CoroutineContext p1,int p2,p p3){
       v ov = new v(f0.d(p0, p1), n.a(p2));
       ov.q1(CoroutineStart.DEFAULT, ov, p3);
       return ov;
    }
    public static y e(k0 p0,CoroutineContext p1,int p2,CoroutineStart p3,l p4,p p5,int p6,Object p7){
       EmptyCoroutineContext iNSTANCE;
       if (p6 & 0x01) {
          iNSTANCE = EmptyCoroutineContext.INSTANCE;
       }
       EmptyCoroutineContext uEmptyCorout = iNSTANCE;
       int i = (p6 & 0x02)? 0: p2;
       if (p6 & 0x04) {
          p3 = CoroutineStart.DEFAULT;
       }
       CoroutineStart uCoroutineSt = p3;
       if (p6 & 0x08) {
          p4 = null;
       }
       return ProduceKt.c(p0, uEmptyCorout, i, uCoroutineSt, p4, p5);
    }
    public static y f(k0 p0,CoroutineContext p1,int p2,p p3,int p4,Object p5){
       EmptyCoroutineContext iNSTANCE;
       if (p4 & 0x01) {
          iNSTANCE = EmptyCoroutineContext.INSTANCE;
       }
       if (p4 & 0x02) {
          p2 = 0;
       }
       return ProduceKt.d(p0, iNSTANCE, p2, p3);
    }
}
