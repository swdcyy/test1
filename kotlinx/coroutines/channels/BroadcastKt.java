package kotlinx.coroutines.channels.BroadcastKt;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.l;
import msd.p;
import htd.i;
import ftd.f0;
import htd.j;
import htd.t;
import htd.k;
import ftd.c1;
import kotlinx.coroutines.JobSupport;
import java.lang.Object;
import ftd.a;
import htd.y;
import ftd.r1;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import ftd.l0;
import kotlinx.coroutines.channels.BroadcastKt$a;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlin.coroutines.CoroutineContext$b;
import htd.o;
import kotlinx.coroutines.channels.BroadcastKt$broadcast$1;
import asd.c;
import kotlin.coroutines.EmptyCoroutineContext;

public final class BroadcastKt	// class@001938
{

    public static final i a(k0 p0,CoroutineContext p1,int p2,CoroutineStart p3,l p4,p p5){
       CoroutineContext uCoroutineCo = f0.d(p0, p1);
       i oi = j.a(p2);
       t ot = (p3.isLazy())? new t(uCoroutineCo, oi, p5): new k(uCoroutineCo, oi, true);
       if (p4 != null) {
          ot.S(p4);
       }
       ot.q1(p3, ot, p5);
       return ot;
    }
    public static final i b(y p0,int p1,CoroutineStart p2){
       return BroadcastKt.c(l0.m(l0.m(r1.b, z0.h()), new BroadcastKt$a(CoroutineExceptionHandler.u0)), null, p1, p2, o.A(p0), new BroadcastKt$broadcast$1(p0, null), 1, null);
    }
    public static i c(k0 p0,CoroutineContext p1,int p2,CoroutineStart p3,l p4,p p5,int p6,Object p7){
       EmptyCoroutineContext iNSTANCE;
       if (p6 & 0x01) {
          iNSTANCE = EmptyCoroutineContext.INSTANCE;
       }
       EmptyCoroutineContext uEmptyCorout = iNSTANCE;
       int i = (p6 & 0x02)? 1: p2;
       if (p6 & 0x04) {
          p3 = CoroutineStart.LAZY;
       }
       CoroutineStart uCoroutineSt = p3;
       if (p6 & 0x08) {
          p4 = null;
       }
       return BroadcastKt.a(p0, uEmptyCorout, i, uCoroutineSt, p4, p5);
    }
    public static i d(y p0,int p1,CoroutineStart p2,int p3,Object p4){
       if (p3 & 0x01) {
          p1 = 1;
       }
       if (p3 & 0x02) {
          p2 = CoroutineStart.LAZY;
       }
       return BroadcastKt.b(p0, p1, p2);
    }
}
