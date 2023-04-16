package qrd.i;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import kotlin.jvm.internal.a;
import fsd.l;
import fsd.k;
import java.lang.StackTraceElement;
import java.util.List;
import java.util.Objects;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

public class i	// class@0022cd
{

    public void i(){
       super();
    }
    public static final void a(Throwable p0,Throwable p1){
       a.p(p0, "$this$addSuppressed");
       a.p(p1, "exception");
       if (p0 != p1) {
          l.a.a(p0, p1);
       }
       return;
    }
    public static final StackTraceElement[] b(Throwable p0){
       a.p(p0, "$this$stackTrace");
       StackTraceElement[] stackTrace = p0.getStackTrace();
       a.m(stackTrace);
       return stackTrace;
    }
    public static void c(Throwable p0){
    }
    public static final List d(Throwable p0){
       a.p(p0, "$this$suppressedExceptions");
       return l.a.d(p0);
    }
    public static void e(Throwable p0){
    }
    public static final void f(Throwable p0){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.Throwable");
       p0.printStackTrace();
    }
    public static final void g(Throwable p0,PrintStream p1){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.Throwable");
       p0.printStackTrace(p1);
    }
    public static final void h(Throwable p0,PrintWriter p1){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.Throwable");
       p0.printStackTrace(p1);
    }
    public static final String i(Throwable p0){
       a.p(p0, "$this$stackTraceToString");
       StringWriter stringWriter = new StringWriter();
       PrintWriter printWriter = new PrintWriter(stringWriter);
       p0.printStackTrace(printWriter);
       printWriter.flush();
       String str = stringWriter.toString();
       a.o(str, "sw.toString\(\)");
       return str;
    }
}
