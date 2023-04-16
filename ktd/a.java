package ktd.a;
import jtd.d;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import ktd.b;
import kotlin.coroutines.CoroutineContext;
import nsd.u;
import java.lang.Object;
import msd.p;
import asd.c;
import kotlinx.coroutines.internal.ThreadContextKt;
import ktd.a$a;
import nsd.s0;
import csd.b;
import dsd.e;
import kotlin.TypeCastException;
import java.lang.String;
import jtd.e;
import ktd.k;
import ktd.i;
import kotlinx.coroutines.flow.internal.UndispatchedContextCollector;

public final class a	// class@001bd6
{

    public static final ChannelFlow a(d p0){
       ChannelFlow uChannelFlow = (!p0 instanceof ChannelFlow)? null: p0;
       if (!uChannelFlow) {
          b uob = new b(p0, null, 0, 6, null);
       }
       return uChannelFlow;
    }
    public static final Object b(CoroutineContext p0,Object p1,p p2,Object p3,c p4){
       Object obj = ThreadContextKt.c(p0, p1);
       a$a uoa = new a$a(p0, p4, p0, p1, p2, p3);
       if (p2 == null) {
          throw new TypeCastException("null cannot be cast to non-null type \(R, kotlin.coroutines.Continuation<T>\) -> kotlin.Any?");
       }
       p1 = s0.q(p2, 2).invoke(p3, v8);
       ThreadContextKt.a(p0, obj);
       if (p1 == b.h()) {
          e.c(p4);
       }
       return p1;
    }
    public static Object c(CoroutineContext p0,Object p1,p p2,Object p3,c p4,int p5,Object p6){
       if (p5 & 0x02) {
          p1 = ThreadContextKt.b(p0);
       }
       return a.b(p0, p1, p2, p3, p4);
    }
    public static final e d(e p0,CoroutineContext p1){
       if (p0 instanceof k) {
       }else if(p0 instanceof i){
          UndispatchedContextCollector undispatched = new UndispatchedContextCollector(p0, p1);
       }
       return p0;
    }
}
