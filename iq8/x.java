package iq8.x;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Handler;
import android.os.Looper;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Thread;
import java.lang.Long;

public class x	// class@002725
{
    public static Handler a;

    public void x(){
       super();
    }
    public static void a(Runnable p0){
       x ox = x.class;
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, ox, "7")) {
          return;
       }
       if (x.c()) {
          p0.run();
       }else if(PatchProxy.applyVoidOneRefs(p0, obj, ox, "6")){
          _monitor_enter(ox);
          if (x.a == null) {
             x.a = new Handler(Looper.getMainLooper());
          }
          _monitor_exit(ox);
          x.a.postAtFrontOfQueue(p0);
       }
       return;
    }
    public static void b(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, x.class, "3")) {
          return;
       }
       if (x.c()) {
          p0.run();
       }else {
          x.f(p0);
       }
       return;
    }
    public static boolean c(){
       Object obj = PatchProxy.apply(null, null, x.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (Looper.getMainLooper().getThread() == Thread.currentThread())? true: false;
       return b;
    }
    public static void d(Runnable p0,long p1){
       x ox = x.class;
       if (PatchProxy.isSupport(ox) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), null, ox, "4")) {
          return;
       }
       _monitor_enter(ox);
       if (x.a == null) {
          x.a = new Handler(Looper.getMainLooper());
       }
       _monitor_exit(ox);
       x.a.postDelayed(p0, p1);
       return;
    }
    public static void e(Runnable p0){
       x ox = x.class;
       if (PatchProxy.applyVoidOneRefs(p0, null, ox, "5")) {
          return;
       }
       _monitor_enter(ox);
       if (x.a == null) {
          x.a = new Handler(Looper.getMainLooper());
       }
       _monitor_exit(ox);
       x.a.removeCallbacks(p0);
       return;
    }
    public static void f(Runnable p0){
       x ox = x.class;
       if (PatchProxy.applyVoidOneRefs(p0, null, ox, "2")) {
          return;
       }
       _monitor_enter(ox);
       if (x.a == null) {
          x.a = new Handler(Looper.getMainLooper());
       }
       _monitor_exit(ox);
       x.a.post(p0);
       return;
    }
}
