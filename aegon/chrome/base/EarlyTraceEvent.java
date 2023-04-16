package aegon.chrome.base.EarlyTraceEvent;
import java.lang.Object;
import java.lang.String;
import aegon.chrome.base.EarlyTraceEvent$b;
import java.util.List;
import java.util.Iterator;
import aegon.chrome.base.EarlyTraceEvent$a;
import aegon.chrome.base.EarlyTraceEvent$c;
import aegon.chrome.base.b;
import K.S;
import a0.o;
import android.os.SystemClock;
import a0.f$a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class EarlyTraceEvent	// class@000138
{
    public static int a;
    public static boolean b;
    public static boolean c;
    public static final Object d;
    public static List e;
    public static List f;
    public static final boolean g;

    static {
       EarlyTraceEvent.d = new Object();
    }
    public void EarlyTraceEvent(){
       super();
    }
    public static void a(String p0,boolean p1){
       if (!EarlyTraceEvent.e()) {
          return;
       }
       EarlyTraceEvent$b uob = new EarlyTraceEvent$b(p0, true, p1);
       p0 = EarlyTraceEvent.d;
       _monitor_enter(p0);
       if (!EarlyTraceEvent.e()) {
          _monitor_exit(p0);
          return;
       }else {
          EarlyTraceEvent.e.add(uob);
          _monitor_exit(p0);
          return;
       }
    }
    public static void b(){
       Object d = EarlyTraceEvent.d;
       _monitor_enter(d);
       if (!EarlyTraceEvent.e()) {
          _monitor_exit(d);
          return;
       }else if(!EarlyTraceEvent.e.isEmpty()){
          EarlyTraceEvent.d(EarlyTraceEvent.e);
          EarlyTraceEvent.e.clear();
       }
       if (!EarlyTraceEvent.f.isEmpty()) {
          EarlyTraceEvent.c(EarlyTraceEvent.f);
          EarlyTraceEvent.f.clear();
       }
       EarlyTraceEvent.a = 2;
       EarlyTraceEvent.e = null;
       EarlyTraceEvent.f = null;
       _monitor_exit(d);
       return;
    }
    public static void c(List p0){
       long l1;
       long l = EarlyTraceEvent.g();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          EarlyTraceEvent$a uoa = iterator.next();
          if (uoa.a != null) {
             b.g();
             l1 = uoa.d + l;
             S.M_Gv8TwM(uoa.b, uoa.c, l1);
          }else {
             b.g();
             l1 = uoa.d + l;
             S.MrKsqeCD(uoa.b, uoa.c, l1);
          }
       }
       return;
    }
    public static void d(List p0){
       long l1;
       long l2;
       long l = EarlyTraceEvent.g();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          EarlyTraceEvent$b uob = iterator.next();
          if (uob.a != null) {
             if (uob.b != null) {
                b.g();
                l1 = uob.e + l;
                S.M7UXCmoq(uob.c, l1, uob.d, uob.f);
             }else {
                b.g();
                l2 = uob.e + l;
                S.MrWG2uUW(uob.c, l2, uob.d, uob.f);
             }
          }else if(uob.b != null){
             b.g();
             l1 = uob.e + l;
             S.MRlw2LEn(uob.c, l1, uob.d, uob.f);
          }else {
             b.g();
             l2 = uob.e + l;
             S.MmyrhqXB(uob.c, l2, uob.d, uob.f);
          }
       }
       return;
    }
    public static boolean e(){
       boolean b = true;
       if (EarlyTraceEvent.a == b) {
       }else {
          b = false;
       }
       return b;
    }
    public static void f(String p0,boolean p1){
       if (!EarlyTraceEvent.e()) {
          return;
       }
       EarlyTraceEvent$b uob = new EarlyTraceEvent$b(p0, false, p1);
       p0 = EarlyTraceEvent.d;
       _monitor_enter(p0);
       if (!EarlyTraceEvent.e()) {
          _monitor_exit(p0);
          return;
       }else {
          EarlyTraceEvent.e.add(uob);
          _monitor_exit(p0);
          return;
       }
    }
    public static long g(){
       o.a(true);
       return ((S.MklbOJun() * 1000) - SystemClock.elapsedRealtimeNanos());
    }
    public static boolean getBackgroundStartupTracingFlag(){
       return EarlyTraceEvent.c;
    }
    public static void setBackgroundStartupTracingFlag(boolean p0){
       g.a(f$a.a.edit().putBoolean("bg_startup_tracing", p0));
    }
}
