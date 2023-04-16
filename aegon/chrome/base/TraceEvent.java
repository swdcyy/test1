package aegon.chrome.base.TraceEvent;
import java.lang.AutoCloseable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.String;
import java.lang.Object;
import aegon.chrome.base.EarlyTraceEvent;
import aegon.chrome.base.TraceEvent$f;
import aegon.chrome.base.f;
import K.S;
import aegon.chrome.base.TraceEvent$b;
import java.lang.Long;
import java.lang.reflect.Method;
import android.os.Looper;
import aegon.chrome.base.ThreadUtils;
import aegon.chrome.base.TraceEvent$e;
import android.util.Printer;

public class TraceEvent implements AutoCloseable	// class@00015c
{
    public final String b;
    public static boolean c;
    public static AtomicBoolean d;
    public static AtomicBoolean e;
    public static TraceEvent$b f;

    static {
       TraceEvent.d = new AtomicBoolean();
       TraceEvent.e = new AtomicBoolean();
    }
    public void TraceEvent(String p0,String p1){
       super();
       this.b = p0;
       TraceEvent.a(p0, p1);
    }
    public static void a(String p0,String p1){
       TraceEvent$b f;
       try{
          EarlyTraceEvent.a(p0, false);
          if (TraceEvent.c) {
             f.l();
             S.M9XfPu17(p0, p1);
          }else {
             f = TraceEvent.f;
             if (f != null && f.m != null) {
                Object[] objArray = new Object[]{Long.valueOf(f.l),p0};
                f.c.invoke(f.a, objArray);
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static void c(String p0){
       TraceEvent$b f;
       try{
          boolean b = false;
          EarlyTraceEvent.f(p0, b);
          if (TraceEvent.c) {
             f.l();
             S.Mw73xTww(p0, null);
          }else {
             f = TraceEvent.f;
             if (f != null && f.m != null) {
                Object[] objArray = new Object[]{Long.valueOf(f.l)};
                f.d.invoke(f.a, objArray);
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static TraceEvent d(String p0){
       TraceEvent traceEvent = null;
       if (EarlyTraceEvent.e() || TraceEvent.c) {
          traceEvent = new TraceEvent(p0, traceEvent);
       }
       return traceEvent;
    }
    public static void setEnabled(boolean p0){
       if (p0) {
          EarlyTraceEvent.b();
       }
       if (TraceEvent.c != p0) {
          TraceEvent.c = p0;
          TraceEvent$b f = TraceEvent.f;
          if (f == null || !f.k.get()) {
             Looper looper = ThreadUtils.b();
             TraceEvent$c a = (p0)? TraceEvent$e.a: null;
             looper.setMessageLogging(a);
          }
       }
       return;
    }
    public void close(){
       TraceEvent.c(this.b);
    }
}
