package htd.e;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.l;
import msd.p;
import htd.c0;
import ftd.f0;
import htd.l;
import htd.n;
import htd.s;
import htd.d;
import ftd.c1;
import kotlinx.coroutines.JobSupport;
import java.lang.Object;
import ftd.a;
import kotlin.coroutines.EmptyCoroutineContext;

public final class e	// class@000fc4
{

    public static final c0 a(k0 p0,CoroutineContext p1,int p2,CoroutineStart p3,l p4,p p5){
       CoroutineContext uCoroutineCo = f0.d(p0, p1);
       l ol = n.a(p2);
       s os = (p3.isLazy())? new s(uCoroutineCo, ol, p5): new d(uCoroutineCo, ol, true);
       if (p4 != null) {
          os.S(p4);
       }
       os.q1(p3, os, p5);
       return os;
    }
    public static c0 b(k0 p0,CoroutineContext p1,int p2,CoroutineStart p3,l p4,p p5,int p6,Object p7){
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
       return e.a(p0, uEmptyCorout, i, uCoroutineSt, p4, p5);
    }
}
