package kotlinx.coroutines.flow.FlowKt__DelayKt;
import jtd.d;
import kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2;
import asd.c;
import msd.q;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Object;
import kotlinx.coroutines.c;
import jtd.f;
import ftd.k0;
import htd.y;
import kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3;
import kotlin.coroutines.CoroutineContext;
import msd.p;
import kotlinx.coroutines.channels.ProduceKt;
import java.lang.StringBuilder;
import kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2;

public final class FlowKt__DelayKt	// class@0019ea
{

    public static final d a(d p0,long p1){
       FlowKt__DelayKt$debounce$2 uodebounce$2 = (p1 > 0)? 1: null;
       if (uodebounce$2) {
          return FlowCoroutineKt.d(new FlowKt__DelayKt$debounce$2(p0, p1, null));
       }else {
          throw new IllegalArgumentException("Debounce timeout should be positive".toString());
       }
    }
    public static final d b(d p0,double p1){
       return f.Z(p0, c.d(p1));
    }
    public static final y c(k0 p0,long p1,long p2){
       StringBuilder str = 1;
       int i = 0;
       int i1 = (p1 - i >= 0)? 1: 0;
       if (i1) {
          if (p2 - i < 0) {
             str = null;
          }
          if (str) {
             FlowKt__DelayKt$fixedPeriodTicker$3 uofixedPerio = new FlowKt__DelayKt$fixedPeriodTicker$3(p2, p1, null);
             return ProduceKt.f(p0, 0, 0, i1, 1, null);
          }else {
             throw new IllegalArgumentException("Expected non-negative initial delay, but has "+p2+" ms".toString());
          }
       }else {
          throw new IllegalArgumentException("Expected non-negative delay, but has "+p1+" ms".toString());
       }
    }
    public static y d(k0 p0,long p1,long p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = p1;
       }
       return f.u0(p0, p1, p2);
    }
    public static final d e(d p0,long p1){
       FlowKt__DelayKt$sample$2 osample$2 = (p1 > 0)? 1: null;
       if (osample$2) {
          return FlowCoroutineKt.d(new FlowKt__DelayKt$sample$2(p0, p1, null));
       }else {
          throw new IllegalArgumentException("Sample period should be positive".toString());
       }
    }
    public static final d f(d p0,double p1){
       return f.x1(p0, c.d(p1));
    }
}
