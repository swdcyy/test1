package j89.l$a;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j89.l;
import java.util.Objects;
import android.os.SystemClock;
import com.yxcorp.gifshow.apm.SampleState;
import j89.q;
import java.util.ArrayList;
import java.util.List;
import android.util.Pair;
import vg7.a;
import kotlin.jvm.internal.a;
import java.lang.Thread;
import android.os.Looper;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import msd.l;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.performance.stability.crash.monitor.util.BacktraceUtil;
import java.lang.StackTraceElement;
import kotlin.collections.ArraysKt___ArraysKt;
import j89.p;
import java.lang.Long;
import java.lang.Number;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.lang.Math;

public final class l$a implements Runnable	// class@0027b2
{
    public static final l$a b;

    static {
       l$a.b = new l$a();
    }
    public void l$a(){
       super();
    }
    public final void run(){
       long l;
       boolean b;
       long l2;
       List list;
       String str1;
       List list1;
       long l3;
       int i3;
       p op;
       StackTraceElement[] stackTrace;
       Looper looper;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l$a.class, "1")) {
          return;
       }
       l c = l.C;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoid(objArray, c, l.class, "2")) {
          l = c.e();
          while (true) {
             long l1 = SystemClock.elapsedRealtime() - l.k;
             l1 = l1 / (long)1000;
             if (l1 - (long)l.b > 0) {
                c.c(l.n);
                break ;
             }else if(l.j == SampleState.BEFORE_END_TRACE || l.j == SampleState.AFTER_END_TRACE){
                l1 = SystemClock.elapsedRealtime();
                q oq = new q(new ArrayList(), l1, 0);
                String str = null;
                int i = 1;
                if (l.d) {
                   Pair first = a.c().first;
                   a.o(first, "threadListPair.first");
                   l.i = first;
                }else if(!l.i.length){
                   looper = 1;
                }else {
                   looper = null;
                }
                if (looper) {
                   Thread thread = Looper.getMainLooper().getThread();
                   a.o(thread, "Looper.getMainLooper\(\).getThread\(\)");
                   Thread[] threadArray = new Thread[i];
                   threadArray[str] = thread;
                   l.i = threadArray;
                }
                Thread[] i1 = l.i;
                int len = i1.length;
                int i2 = 0;
                while (i2 < len) {
                   object oobject = i1[i2];
                   if (l.d) {
                      if (oobject != null) {
                         l c1 = l.C;
                         Objects.requireNonNull(c1);
                         l obj = PatchProxy.applyOneRefs(oobject, c1, l.class, "5");
                         if (obj != PatchProxyResult.class) {
                            b = obj.booleanValue();
                         }else {
                            Thread y = l.y;
                            if (y == null) {
                               a.S("mSamplingThread");
                            }
                            if (!a.g(oobject, y)) {
                               y = l.z;
                               if (y == null) {
                                  a.S("mDataProcessThread");
                               }
                               if (!a.g(oobject, y) && !a.g(oobject, l.A)) {
                                  b = false;
                               }
                            }
                         label_00db :
                            b = true;
                         }
                         if (!b) {
                         label_00e2 :
                            if (l.d) {
                               obj = l.g;
                               if (obj == null || obj.invoke(oobject).booleanValue()) {
                               }
                            }else {
                            }
                         }
                      }
                   }else {
                      goto label_00e2 ;
                   }
                label_0162 :
                   i2 = i2 + 1;
                   objArray = null;
                   str = null;
                }
                long l4 = SystemClock.elapsedRealtime();
                v14.c = l4;
                l.l.add(v14);
                l4 = l4 - l1;
                l1 = c.e() - l4;
                l4 = c.e() - l;
                l1 = l1 + l4;
                if (l1 < 0) {
                   l = Math.abs(l1) / c.e();
                   l = l + 1;
                   l = l * c.e();
                   l1 = l1 + l;
                }
                Thread.sleep(l1);
                l = SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime();
                objArray = 0;
             }
          }
       }
       return;
    }
}
