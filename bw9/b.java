package bw9.b;
import java.lang.Thread$UncaughtExceptionHandler;
import java.lang.Object;
import java.lang.Thread;
import java.lang.Throwable;
import bw9.c;
import com.kwai.performance.stability.crash.monitor.message.JavaExceptionMessage;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionHandler$ExceptionType;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import com.kwai.performance.stability.crash.monitor.CrashMonitor;

public final class b implements Thread$UncaughtExceptionHandler	// class@000368
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final void uncaughtException(Thread p0,Throwable p1){
       CrashMonitor.handleException(p1, new JavaExceptionMessage(), ExceptionHandler$ExceptionType.CRASH);
       c.b.uncaughtException(p0, p1);
    }
}
