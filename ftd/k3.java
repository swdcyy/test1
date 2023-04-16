package ftd.k3;
import ftd.j3;
import java.lang.System;
import java.lang.Object;
import java.util.concurrent.locks.LockSupport;
import java.lang.Thread;
import java.lang.Runnable;

public final class k3	// class@001656
{
    public static j3 a;

    public static final long a(){
       j3 oj3 = k3.b();
       long l = (oj3 != null)? oj3.e(): System.currentTimeMillis();
       return l;
    }
    public static final j3 b(){
       return k3.a;
    }
    public static final long c(){
       j3 oj3 = k3.b();
       long l = (oj3 != null)? oj3.a(): System.nanoTime();
       return l;
    }
    public static final void d(Object p0,long p1){
       j3 oj3 = k3.b();
       if (oj3 != null) {
          oj3.c(p0, p1);
       }else {
          LockSupport.parkNanos(p0, p1);
       }
       return;
    }
    public static final void e(){
       j3 oj3 = k3.b();
       if (oj3 != null) {
          oj3.d();
       }
       return;
    }
    public static final void f(j3 p0){
       k3.a = p0;
    }
    public static final void g(){
       j3 oj3 = k3.b();
       if (oj3 != null) {
          oj3.g();
       }
       return;
    }
    public static final void h(){
       j3 oj3 = k3.b();
       if (oj3 != null) {
          oj3.b();
       }
       return;
    }
    public static final void i(Thread p0){
       j3 oj3 = k3.b();
       if (oj3 != null) {
          oj3.h(p0);
       }else {
          LockSupport.unpark(p0);
       }
       return;
    }
    public static final void j(){
       j3 oj3 = k3.b();
       if (oj3 != null) {
          oj3.f();
       }
       return;
    }
    public static final Runnable k(Runnable p0){
       j3 oj3 = k3.b();
       if (oj3 != null) {
          Runnable runnable = oj3.i(p0);
          if (runnable != null) {
             p0 = runnable;
          }
       }
       return p0;
    }
}
