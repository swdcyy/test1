package ird.a;
import erd.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.RuntimeException;
import io.reactivex.internal.util.ExceptionHelper;
import erd.o;
import java.util.concurrent.Callable;
import brd.z;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.a;
import brd.h;
import brd.m;
import brd.t;
import brd.a0;
import frd.a;
import hrd.a;
import java.lang.NullPointerException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.MissingBackpressureException;
import java.lang.IllegalStateException;
import java.lang.IllegalArgumentException;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.UndeliverableException;
import erd.g;
import java.lang.Runnable;
import java.lang.Thread;
import java.lang.Thread$UncaughtExceptionHandler;

public final class a	// class@00197a
{
    public static g a;
    public static o b;
    public static o c;
    public static o d;
    public static o e;
    public static o f;
    public static o g;
    public static o h;
    public static o i;
    public static o j;
    public static o k;
    public static o l;
    public static o m;
    public static o n;
    public static o o;
    public static o p;
    public static o q;
    public static o r;
    public static c s;
    public static c t;
    public static c u;
    public static c v;
    public static c w;
    public static e x;
    public static boolean y;
    public static boolean z;

    public static Object a(c p0,Object p1,Object p2){
       return p0.a(p1, p2);
    }
    public static Object b(o p0,Object p1){
       return p0.apply(p1);
    }
    public static z c(o p0,Callable p1){
       p0 = a.b(p0, p1);
       a.c(p0, "Scheduler Callable result can\'t be null");
       return p0;
    }
    public static z d(Callable p0){
       p0 = p0.call();
       a.c(p0, "Scheduler Callable result can\'t be null");
       return p0;
    }
    public static a e(a p0){
       o q = a.q;
       if (q != null) {
          p0 = a.b(q, p0);
       }
       return p0;
    }
    public static h f(h p0){
       o k = a.k;
       if (k != null) {
          p0 = a.b(k, p0);
       }
       return p0;
    }
    public static m g(m p0){
       o o = a.o;
       if (o != null) {
          p0 = a.b(o, p0);
       }
       return p0;
    }
    public static t h(t p0){
       o m = a.m;
       if (m != null) {
          p0 = a.b(m, p0);
       }
       return p0;
    }
    public static a0 i(a0 p0){
       o p = a.p;
       if (p != null) {
          p0 = a.b(p, p0);
       }
       return p0;
    }
    public static a j(a p0){
       o n = a.n;
       if (n != null) {
          p0 = a.b(n, p0);
       }
       return p0;
    }
    public static a k(a p0){
       o r = a.r;
       if (r != null) {
          p0 = a.b(r, p0);
       }
       return p0;
    }
    public static void l(Throwable p0){
       NullPointerException nullPointerE;
       g a = a.a;
       if (p0 == null) {
          nullPointerE = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
       }else {
          int i = 1;
          if (!p0 instanceof OnErrorNotImplementedException && (!p0 instanceof MissingBackpressureException && (!p0 instanceof IllegalStateException && (!p0 instanceof NullPointerException && (!p0 instanceof IllegalArgumentException && !p0 instanceof CompositeException))))) {
             i = 0;
          }
       label_002c :
          if (!i) {
             nullPointerE = new UndeliverableException(p0);
          }
       }
       if (a != null) {
          a.accept(nullPointerE);
          return;
       }else {
          a.n(nullPointerE);
          return;
       }
    }
    public static Runnable m(Runnable p0){
       a.c(p0, "run is null");
       o b = a.b;
       if (b == null) {
          return p0;
       }
       return a.b(b, p0);
    }
    public static void n(Throwable p0){
       Thread thread = Thread.currentThread();
       thread.getUncaughtExceptionHandler().uncaughtException(thread, p0);
    }
}
