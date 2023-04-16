package kotlinx.coroutines.flow.FlowKt__ErrorsKt;
import jtd.d;
import msd.q;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import jtd.e;
import asd.c;
import java.lang.Object;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1;
import csd.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$$inlined$collect$1;
import java.lang.Throwable;
import kotlin.coroutines.CoroutineContext;
import ftd.z1;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.a;
import msd.l;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$onErrorCollect$2;
import jtd.f;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$onErrorCollect$1;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$6;
import msd.r;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import msd.p;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$4;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1;

public final class FlowKt__ErrorsKt	// class@001a1d
{

    public static void a(){
    }
    public static final d b(d p0,q p1){
       return new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(p0, p1);
    }
    public static final Object c(d p0,e p1,c p2){
       FlowKt__ErrorsKt$catchImpl$1 uocatchImpl$;
       if (p2 instanceof FlowKt__ErrorsKt$catchImpl$1) {
          uocatchImpl$ = p2;
          FlowKt__ErrorsKt$catchImpl$1 label = uocatchImpl$.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uocatchImpl$.label = label - i;
          label_0018 :
             FlowKt__ErrorsKt$catchImpl$1 result = uocatchImpl$.result;
             Object obj = b.h();
             FlowKt__ErrorsKt$catchImpl$1 label1 = uocatchImpl$.label;
             if (label1 != null) {
                if (label1 == 1) {
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                Ref$ObjectRef objectRef = new Ref$ObjectRef();
                objectRef.element = null;
                uocatchImpl$.L$0 = p0;
                uocatchImpl$.L$1 = p1;
                uocatchImpl$.L$2 = objectRef;
                uocatchImpl$.L$3 = p0;
                uocatchImpl$.label = 1;
                if (p0.b(new FlowKt__ErrorsKt$catchImpl$$inlined$collect$1(p1, objectRef), uocatchImpl$) == obj) {
                   return obj;
                }
             }
             return null;
          }
       }
       uocatchImpl$ = new FlowKt__ErrorsKt$catchImpl$1(p2);
       goto label_0018 ;
    }
    public static final boolean d(Throwable p0,CoroutineContext p1){
       z1 oz1 = p1.get(z1.p0);
       if (oz1 == null || !oz1.isCancelled()) {
          return false;
       }
       return FlowKt__ErrorsKt.e(p0, oz1.O());
    }
    public static final boolean e(Throwable p0,Throwable p1){
       boolean b = (p1 != null && a.g(p1, p0))? true: false;
       return b;
    }
    public static final d f(d p0,d p1,l p2){
       return f.s(p0, new FlowKt__ErrorsKt$onErrorCollect$2(p2, p1, null));
    }
    public static d g(d p0,d p1,l p2,int p3,Object p4){
       FlowKt__ErrorsKt$onErrorCollect$1 iNSTANCE;
       if (p3 & 0x02) {
          iNSTANCE = FlowKt__ErrorsKt$onErrorCollect$1.INSTANCE;
       }
       return f.g1(p0, p1, iNSTANCE);
    }
    public static final d h(d p0,int p1,l p2){
       FlowKt__ErrorsKt$retry$6 oretry$6 = (p1 > 0)? 1: null;
       if (oretry$6) {
          return f.w1(p0, new FlowKt__ErrorsKt$retry$6(p1, p2, null));
       }else {
          throw new IllegalArgumentException("Expected positive amount of retries, but had "+p1.toString());
       }
    }
    public static final d i(d p0,long p1,p p2){
       FlowKt__ErrorsKt$retry$3 oretry$3 = (p1 > 0)? 1: null;
       if (oretry$3) {
          return f.w1(p0, new FlowKt__ErrorsKt$retry$3(p1, p2, null));
       }else {
          throw new IllegalArgumentException("Expected positive amount of retries, but had "+p1.toString());
       }
    }
    public static d j(d p0,int p1,l p2,int p3,Object p4){
       FlowKt__ErrorsKt$retry$4 iNSTANCE;
       if (p3 & 0x01) {
          p1 = Integer.MAX_VALUE;
       }
       if (p3 & 0x02) {
          iNSTANCE = FlowKt__ErrorsKt$retry$4.INSTANCE;
       }
       return f.s1(p0, p1, iNSTANCE);
    }
    public static d k(d p0,long p1,p p2,int p3,Object p4){
       FlowKt__ErrorsKt$retry$1 oretry$1;
       if (p3 & 0x01) {
          p1 = Long.MAX_VALUE;
       }
       if (p3 & 0x02) {
          oretry$1 = new FlowKt__ErrorsKt$retry$1(null);
       }
       return f.t1(p0, p1, oretry$1);
    }
    public static final d l(d p0,r p1){
       return new FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(p0, p1);
    }
}
