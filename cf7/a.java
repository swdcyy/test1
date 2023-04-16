package cf7.a;
import cf7.b;
import java.util.LinkedHashSet;
import java.lang.Object;
import com.kwai.performance.fluency.jank.monitor.JankMonitor;
import com.kwai.performance.fluency.jank.monitor.JankMonitorConfig;
import msd.a;
import java.lang.Number;
import java.lang.Long;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.Log;
import android.os.Build$VERSION;
import java.util.Collection;
import android.app.Application;
import yf7.k;
import android.content.Context;
import com.kwai.performance.stability.hack.ReflectionHacker;
import yf7.g;
import android.os.MessageQueue;
import java.lang.Class;
import yf7.s;
import java.lang.Integer;
import java.util.Set;
import android.view.Choreographer;
import cf7.a$b;
import android.view.Choreographer$FrameCallback;
import cf7.a$a;
import android.os.Message;
import android.os.Handler;
import java.util.Iterator;
import qrd.l1;

public final class a implements b	// class@000542
{
    public static final a a;
    public static final Set b;
    public static long c;

    static {
       a.a = new a();
       a.b = new LinkedHashSet();
    }
    public void a(){
       super();
    }
    public boolean a(long p0,long p1){
       boolean b = false;
       if (!a.c - p0) {
          return b;
       }
       if ((p1 - p0) - (long)JankMonitor.INSTANCE.getConfig$com_kwai_performance_fluency_jank_monitor().e.invoke().intValue() >= 0) {
          b = true;
       }
       if (b) {
          a.c = p0;
          Log.g("BarrierJankFixer", a.C("test\(\) - ", Long.valueOf(p0)));
       }
       return b;
    }
    public void b(){
       a$a a;
       if (Build$VERSION.SDK_INT < 23) {
          return;
       }
       Set b = a.b;
       int i = 1;
       if (b.isEmpty() ^ i) {
          return;
       }
       ReflectionHacker.unseal(k.b());
       MessageQueue messageQueue = g.g.b();
       if (messageQueue == null) {
          return;
       }
       Class[] uClassArray = new Class[i];
       Class tYPE = Long.TYPE;
       a.m(tYPE);
       uClassArray[0] = tYPE;
       Object[] objArray = new Object[i];
       objArray[0] = Long.valueOf(0);
       Message obj = s.a(messageQueue, "postSyncBarrier", uClassArray, objArray);
       Log.g("BarrierJankFixer", a.C("postSyncBarrier\(0\) = ", obj));
       if (obj instanceof Integer && !a.g(obj, Integer.valueOf(-1))) {
          _monitor_enter(b);
          b.add(obj);
          _monitor_exit(b);
          Choreographer.getInstance().postFrameCallback(a$b.b);
          a = a$a.a;
          obj = a.obtainMessage(0, null);
          a.o(obj, "FrameHandler.obtainMessage\(FrameHandler.MSG_REMOVE_SYNC_BARRIER, null\)");
          obj.setAsynchronous(i);
          a.sendMessageDelayed(obj, 32);
       }
       return;
    }
    public final void c(){
       Class tYPE;
       Set b = a.b;
       _monitor_enter(b);
       Iterator iterator = b.iterator();
       while (iterator.hasNext()) {
          int i = iterator.next().intValue();
          ReflectionHacker.unseal(k.b());
          MessageQueue messageQueue = g.g.b();
          if (messageQueue == null) {
             continue ;
          }else {
             Class[] uClassArray = new Class[]{tYPE};
             tYPE = Integer.TYPE;
             a.m(tYPE);
             Object[] objArray = new Object[]{Integer.valueOf(i)};
             s.a(messageQueue, "removeSyncBarrier", uClassArray, objArray);
          }
       }
       a.b.clear();
       _monitor_exit(b);
       return;
    }
}
