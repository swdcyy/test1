package ftd.x0;
import ftd.w0;
import asd.c;
import ftd.t0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Throwable;
import kotlin.Result;
import qrd.j0;
import kotlinx.coroutines.internal.ThreadContextKt;
import qrd.l1;
import kotlin.TypeCastException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import ftd.u0;
import ftd.f3;
import ftd.g1;
import msd.a;
import nsd.c0;

public final class x0	// class@001684
{

    public static void a(){
    }
    public static void b(){
    }
    public static void c(){
    }
    public static final void d(w0 p0,int p1){
       c uoc = p0.e();
       if (x0.f(p1) && (uoc instanceof t0 && x0.e(p1) == x0.e(p0.d))) {
          t0 h = uoc.h;
          CoroutineContext context = uoc.getContext();
          if (h.x(context)) {
             h.u(context, p0);
          }else {
             x0.h(p0);
          }
       }else {
          x0.g(p0, uoc, p1);
       }
       return;
    }
    public static final boolean e(int p0){
       int i = 1;
       if (p0 == i) {
       }else {
          i = false;
       }
       return i;
    }
    public static final boolean f(int p0){
       int i = 1;
       if (p0 && p0 != i) {
          i = false;
       }
       return i;
    }
    public static final void g(w0 p0,c p1,int p2){
       Object obj = p0.i();
       Throwable throwable = p0.f(obj);
       if (throwable != null) {
       }else {
          throwable = null;
       }
       p0 = (throwable != null)? j0.a(throwable): p0.g(obj);
       p0 = Result.constructor-impl(p0);
       if (p2) {
          if (p2 != 1) {
             if (p2 == 2) {
                if (p1 != null) {
                   CoroutineContext context = p1.getContext();
                   p1.i.resumeWith(p0);
                   ThreadContextKt.a(context, ThreadContextKt.c(context, p1.g));
                }else {
                   throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
                }
             }else {
                throw new IllegalStateException("Invalid mode "+p2.toString());
             }
          }else {
             u0.e(p1, p0);
          }
       }else {
          p1.resumeWith(p0);
       }
       return;
    }
    public static final void h(w0 p0){
       g1 og1 = f3.b.b();
       if (og1.j0()) {
          og1.b0(p0);
       }else {
          og1.g0(true);
          x0.g(p0, p0.e(), 2);
          do {
          } while (!og1.n0());
          og1.A(true);
       }
       return;
    }
    public static final void i(c p0,Throwable p1){
       p0.resumeWith(Result.constructor-impl(j0.a(p1)));
    }
    public static final void j(w0 p0,g1 p1,a p2){
       p1.g0(true);
       p2.invoke();
       do {
       } while (!p1.n0());
       c0.d(true);
       p1.A(true);
       c0.c(true);
       return;
    }
}
