package kotlinx.coroutines.flow.FlowKt__CollectKt;
import jtd.d;
import asd.c;
import java.lang.Object;
import ktd.i;
import jtd.e;
import csd.b;
import qrd.l1;
import msd.p;
import kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3;
import nsd.c0;
import msd.q;
import kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2;
import jtd.f;
import ftd.k0;
import ftd.z1;
import kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.a;

public final class FlowKt__CollectKt	// class@0019d5
{

    public static final Object a(d p0,c p1){
       p0 = p0.b(i.b, p1);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
    public static final Object b(d p0,p p1,c p2){
       p0 = p0.b(new FlowKt__CollectKt$collect$3(p1), p2);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
    public static final Object c(d p0,p p1,c p2){
       c0.e(0);
       c0.e(2);
       c0.e(1);
       return p0.b(new FlowKt__CollectKt$collect$3(p1), p2);
    }
    public static final Object d(d p0,q p1,c p2){
       p0 = p0.b(new FlowKt__CollectKt$collectIndexed$2(p1), p2);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
    public static final Object e(d p0,q p1,c p2){
       c0.e(0);
       c0.e(2);
       c0.e(1);
       return p0.b(new FlowKt__CollectKt$collectIndexed$2(p1), p2);
    }
    public static final Object f(d p0,p p1,c p2){
       p0 = f.v(f.o(f.V0(p0, p1), 0), p2);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
    public static final Object g(e p0,d p1,c p2){
       p0 = p1.b(p0, p2);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
    public static final Object h(e p0,d p1,c p2){
       c0.e(0);
       c0.e(2);
       c0.e(1);
       return p1.b(p0, p2);
    }
    public static final z1 i(d p0,k0 p1){
       return a.f(p1, null, null, new FlowKt__CollectKt$launchIn$1(p0, null), 3, null);
    }
}
