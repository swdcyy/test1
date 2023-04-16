package c.t.m.g.et;
import java.lang.Thread$UncaughtExceptionHandler;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import java.util.concurrent.CountDownLatch;
import c.t.m.g.ex;
import java.lang.Thread;
import java.lang.Throwable;
import android.util.Pair;
import c.t.m.g.fj;
import c.t.m.g.et$a;
import java.util.concurrent.TimeUnit;
import java.lang.StackTraceElement;
import java.lang.StringBuilder;
import c.t.m.g.ey;
import java.lang.CharSequence;

public class et implements Thread$UncaughtExceptionHandler	// class@000c7b
{
    public Context b;
    public Thread$UncaughtExceptionHandler c;
    public boolean e;
    public CountDownLatch f;
    public static final String a;
    public static et d;

    static {
       et.a = "et";
       et.d = null;
    }
    public void et(Context p0){
       super();
       this.e = false;
       this.b = p0;
    }
    public static Context a(et p0){
       return p0.b;
    }
    public static et a(Context p0){
       if (et.d == null) {
          _monitor_enter(et.class);
          if (et.d == null) {
             et.d = new et(p0);
          }
          _monitor_exit(et.class);
       }
       return et.d;
    }
    public static String b(){
       return et.a;
    }
    public static CountDownLatch b(et p0){
       return p0.f;
    }
    public void a(){
       if (this.e == null) {
          if (ex.a) {
             ex.b(et.a, "registerHandler");
          }
          this.c = Thread.getDefaultUncaughtExceptionHandler();
          Thread.setDefaultUncaughtExceptionHandler(et.d);
          this.e = true;
          if (ex.a) {
             ex.b(et.a, "setDefaultUncaughtExceptionHandler");
          }
       }
       return;
    }
    public void a(Throwable p0){
       this.f = new CountDownLatch(1);
       new et$a(this, fj.a(this.b, p0, "UNCATCHCRASH").second, p0).start();
       this.f.await(3000, TimeUnit.MILLISECONDS);
    }
    public final boolean b(Throwable p0){
       if (p0 == null) {
          return false;
       }
       while (true) {
          if (p0 == null) {
             return false;
          }
          StackTraceElement[] stackTrace = p0.getStackTrace();
          int len = stackTrace.length;
          int i = 0;
          while (true) {
             if (i < len) {
                object oobject = stackTrace[i];
                if (ex.a) {
                   ex.a(et.a, "statcktracefilename : "+oobject.getFileName()+",method:"+oobject.getMethodName());
                }
                if (("TML").equals(oobject.getFileName())) {
                   break ;
                }else {
                   i = i + 1;
                }
             }else {
                p0 = p0.getCause();
             }
          }
          return true;
       }
    }
    public void uncaughtException(Thread p0,Throwable p1){
       String str1;
       if (ex.a) {
          ex.a(et.a, "uncaughtException");
       }
       if (this.b(p1)) {
          if (this.b != null) {
             String str = fj.a(p1);
             String[] d = ey.d;
             int i = 0;
             if (d != null && d.length > 0) {
                str1 = null;
                String[] d1 = ey.d;
                while (i < d1.length) {
                   if (str.contains(d1[i])) {
                      str1 = 1;
                   }
                   i = i + 1;
                }
                i = str1;
             }
             if (!i) {
                str1 = "SP_bad_TMLSDK_info";
                fj.a(this.b, str1, fj.c);
                if (ex.a) {
                   String a = et.a;
                   ex.a(a, p1);
                   ex.a(a, "bad dex : "+fj.b(this.b, str1, "bad test"));
                }
                this.a(p1);
                return;
             }
          }else if(ex.a){
             ex.a(et.a, "context is null");
          }
       }else if(ex.a){
          ex.a(et.a, "is not SDK exception");
       }
       et tc = this.c;
       if (tc != null) {
          tc.uncaughtException(p0, p1);
       }
       return;
    }
}
