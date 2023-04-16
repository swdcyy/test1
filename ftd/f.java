package ftd.f;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.r0;
import ftd.f0;
import ftd.h2;
import kotlinx.coroutines.DeferredCoroutine;
import java.lang.Object;
import ftd.a;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.a;
import kotlinx.coroutines.CoroutineDispatcher;
import asd.c;
import nsd.c0;
import ftd.z1;
import ftd.i2;
import ftd.z2;
import ftd.p3;
import ltd.a0;
import mtd.b;
import asd.d;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.internal.a;
import ftd.n3;
import kotlinx.coroutines.internal.ThreadContextKt;
import ftd.v0;
import mtd.a;
import csd.b;
import dsd.e;

public final class f	// class@001641
{

    public static final r0 a(k0 p0,CoroutineContext p1,CoroutineStart p2,p p3){
       CoroutineContext uCoroutineCo = f0.d(p0, p1);
       h2 oh2 = (p2.isLazy())? new h2(uCoroutineCo, p3): new DeferredCoroutine(uCoroutineCo, true);
       oh2.q1(p2, oh2, p3);
       return oh2;
    }
    public static r0 b(k0 p0,CoroutineContext p1,CoroutineStart p2,p p3,int p4,Object p5){
       EmptyCoroutineContext iNSTANCE;
       if (p4 & 0x01) {
          iNSTANCE = EmptyCoroutineContext.INSTANCE;
       }
       if (p4 & 0x02) {
          p2 = CoroutineStart.DEFAULT;
       }
       return a.a(p0, iNSTANCE, p2, p3);
    }
    public static final Object c(CoroutineDispatcher p0,p p1,c p2){
       return a.i(p0, p1, p2);
    }
    public static final Object d(CoroutineDispatcher p0,p p1,c p2){
       c0.e(0);
       c0.e(1);
       return a.i(p0, p1, p2);
    }
    public static final z1 e(k0 p0,CoroutineContext p1,CoroutineStart p2,p p3){
       CoroutineContext uCoroutineCo = f0.d(p0, p1);
       i2 oi2 = (p2.isLazy())? new i2(uCoroutineCo, p3): new z2(uCoroutineCo, true);
       oi2.q1(p2, oi2, p3);
       return oi2;
    }
    public static z1 f(k0 p0,CoroutineContext p1,CoroutineStart p2,p p3,int p4,Object p5){
       EmptyCoroutineContext iNSTANCE;
       if (p4 & 0x01) {
          iNSTANCE = EmptyCoroutineContext.INSTANCE;
       }
       if (p4 & 0x02) {
          p2 = CoroutineStart.DEFAULT;
       }
       return a.e(p0, iNSTANCE, p2, p3);
    }
    public static final Object g(CoroutineContext p0,p p1,c p2){
       CoroutineContext context = p2.getContext();
       p0 = context.plus(p0);
       p3.a(p0);
       if (p0 == context) {
          p0 = b.f(new a0(p0, p2), new a0(p0, p2), p1);
       }else {
          d$b b0 = d.b0;
          if (a.g(p0.get(b0), context.get(b0))) {
             ThreadContextKt.a(p0, ThreadContextKt.c(p0, null));
             p0 = b.f(new n3(p0, p2), new n3(p0, p2), p1);
          }else {
             v0 ov0 = new v0(p0, p2);
             ov0.m1();
             a.d(p1, ov0, ov0);
             p0 = ov0.t1();
          }
       }
       if (p0 == b.h()) {
          e.c(p2);
       }
       return p0;
    }
}
