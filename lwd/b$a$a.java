package lwd.b$a$a;
import java.lang.Thread$UncaughtExceptionHandler;
import lwd.b$a;
import lwd.b;
import java.lang.Object;
import java.lang.Thread;
import java.lang.Throwable;
import java.lang.String;
import exd.c;

public class b$a$a implements Thread$UncaughtExceptionHandler	// class@001cee
{
    public final b a;
    public final b$a b;

    public void b$a$a(b$a p0,b p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void uncaughtException(Thread p0,Throwable p1){
       b.o.error("Uncaught exception in thread {}: {}", p0.getName(), p1);
    }
}
