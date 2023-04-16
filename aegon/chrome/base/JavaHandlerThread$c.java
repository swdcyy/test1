package aegon.chrome.base.JavaHandlerThread$c;
import java.lang.Thread$UncaughtExceptionHandler;
import aegon.chrome.base.JavaHandlerThread;
import java.lang.Object;
import java.lang.Thread;
import java.lang.Throwable;

public class JavaHandlerThread$c implements Thread$UncaughtExceptionHandler	// class@00013f
{
    public final JavaHandlerThread a;

    public void JavaHandlerThread$c(JavaHandlerThread p0){
       this.a = p0;
       super();
    }
    public void uncaughtException(Thread p0,Throwable p1){
       p0.b = p1;
    }
}
