package aegon.chrome.base.JavaExceptionReporter;
import java.lang.Thread$UncaughtExceptionHandler;
import java.lang.Object;
import java.lang.Thread;
import java.lang.Throwable;
import a0.o;
import K.S;

public class JavaExceptionReporter implements Thread$UncaughtExceptionHandler	// class@00013c
{
    public final Thread$UncaughtExceptionHandler a;
    public final boolean b;
    public boolean c;
    public static final boolean d;

    static {
    }
    public void JavaExceptionReporter(Thread$UncaughtExceptionHandler p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static void installHandler(boolean p0){
       Thread.setDefaultUncaughtExceptionHandler(new JavaExceptionReporter(Thread.getDefaultUncaughtExceptionHandler(), p0));
    }
    public void uncaughtException(Thread p0,Throwable p1){
       if (this.c == null) {
          this.c = true;
          o.a(true);
          S.MLlibBXh(this.b, p1);
       }
       JavaExceptionReporter ta = this.a;
       if (ta != null) {
          ta.uncaughtException(p0, p1);
       }
       return;
    }
}
