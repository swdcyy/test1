package lrd.b;
import lrd.b$h;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import ird.a;
import java.util.concurrent.Callable;
import brd.z;
import erd.o;
import lrd.b$b;
import lrd.b$c;
import io.reactivex.internal.schedulers.k;
import lrd.b$f;
import java.util.concurrent.Executor;
import io.reactivex.internal.schedulers.ExecutorScheduler;

public final class b	// class@001df5
{
    public static final z a;
    public static final z b;
    public static final z c;
    public static final z d;
    public static final z e;

    static {
       b$h oh = new b$h();
       String str = "Scheduler Callable can\'t be null";
       a.c(oh, str);
       o d = a.d;
       z oz = (d == null)? a.d(oh): a.c(d, oh);
       b.a = oz;
       b$b uob = new b$b();
       a.c(uob, str);
       d = a.c;
       oz = (d == null)? a.d(uob): a.c(d, uob);
       b.b = oz;
       b$c uoc = new b$c();
       a.c(uoc, str);
       d = a.e;
       oz = (d == null)? a.d(uoc): a.c(d, uoc);
       b.c = oz;
       b.d = k.b;
       b$f uof = new b$f();
       a.c(uof, str);
       o f = a.f;
       oz = (f == null)? a.d(uof): a.c(f, uof);
       b.e = oz;
    }
    public static z a(){
       z b = b.b;
       o g = a.g;
       if (g == null) {
       }else {
          b = a.b(g, b);
       }
       return b;
    }
    public static z b(Executor p0){
       return new ExecutorScheduler(p0);
    }
    public static z c(){
       z c = b.c;
       o i = a.i;
       if (i == null) {
       }else {
          c = a.b(i, c);
       }
       return c;
    }
    public static z d(){
       z e = b.e;
       o j = a.j;
       if (j == null) {
       }else {
          e = a.b(j, e);
       }
       return e;
    }
    public static z e(){
       z a = b.a;
       o h = a.h;
       if (h == null) {
       }else {
          a = a.b(h, a);
       }
       return a;
    }
    public static z f(){
       return b.d;
    }
}
