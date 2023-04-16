package aegon.chrome.base.ThreadUtils;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import java.lang.RuntimeException;
import java.lang.String;
import aegon.chrome.base.TraceEvent;
import java.util.concurrent.atomic.AtomicBoolean;
import aegon.chrome.base.TraceEvent$b;
import a0.u;
import java.lang.Runnable;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.lang.Throwable;
import android.os.Process;

public class ThreadUtils	// class@000153
{
    public static final Object a;
    public static boolean b;
    public static Handler c;
    public static boolean d;
    public static final boolean e;

    static {
       ThreadUtils.a = new Object();
    }
    public void ThreadUtils(){
       super();
    }
    public static Handler a(){
       TraceEvent$b uob;
       TraceEvent$b a = ThreadUtils.a;
       _monitor_enter(a);
       boolean b = true;
       if (ThreadUtils.c == null) {
          if (!ThreadUtils.b) {
             ThreadUtils.c = new Handler(Looper.getMainLooper());
             uob = 1;
          }else {
             throw new RuntimeException("Did not yet override the UI thread");
          }
       }else {
          uob = null;
       }
       _monitor_exit(a);
       if (uob) {
          TraceEvent.e.set(b);
          a = TraceEvent.f;
          if (a != null) {
             a.j.set(b);
             if (!ThreadUtils.f()) {
                ThreadUtils.c(new u(a));
             }else {
                a.c();
             }
          }
       }
       return ThreadUtils.c;
    }
    public static Looper b(){
       return ThreadUtils.a().getLooper();
    }
    public static void c(Runnable p0){
       ThreadUtils.a().post(p0);
    }
    public static void d(Runnable p0){
       if (ThreadUtils.f()) {
          p0.run();
       }else {
          ThreadUtils.a().post(p0);
       }
       return;
    }
    public static Object e(Callable p0){
       try{
          FutureTask uFutureTask = new FutureTask(p0);
          if (ThreadUtils.f()) {
             uFutureTask.run();
          }else {
             ThreadUtils.a().post(uFutureTask);
          }
          try{
             return uFutureTask.get();
          }catch(java.lang.InterruptedException e2){
             throw new RuntimeException("Interrupted waiting for callable", e2);
          }
       }catch(java.util.concurrent.ExecutionException e2){
          throw new RuntimeException("Error occurred waiting for callable", e2);
       }
    }
    public static boolean f(){
       boolean b = (ThreadUtils.a().getLooper() == Looper.myLooper())? true: false;
       return b;
    }
    public static boolean isThreadPriorityAudio(int p0){
       boolean b = (Process.getThreadPriority(p0) == -16)? true: false;
       return b;
    }
    public static void setThreadPriorityAudio(int p0){
       Process.setThreadPriority(p0, -16);
    }
}
