package io.netty.channel.i;
import lqd.e;
import java.net.SocketAddress;
import io.netty.channel.r;
import io.netty.channel.g;
import io.netty.channel.n;
import java.lang.Throwable;
import io.netty.channel.j;
import java.lang.Object;
import io.netty.channel.u;
import ard.b;
import java.lang.String;
import java.lang.StackTraceElement;
import io.netty.util.concurrent.l;
import io.netty.channel.g0;
import java.util.Objects;
import java.util.concurrent.Future;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import io.netty.channel.d;
import java.lang.Class;
import io.netty.channel.w;
import zqd.w;
import io.netty.channel.a$b;

public final class i	// class@00109f
{

    public static void a(e p0,SocketAddress p1,r p2){
       p0.n0().g(p0, p1, p2);
       return;
    }
    public static void b(e p0){
       p0.n0().r(p0);
       return;
    }
    public static void c(e p0){
       p0.n0().u(p0);
       return;
    }
    public static void d(e p0){
       p0.n0().j(p0);
       return;
    }
    public static void e(e p0,Object p1){
       p0.n0().l(p0, p1);
       return;
    }
    public static void f(e p0){
       p0.n0().v(p0);
       return;
    }
    public static void g(e p0){
       p0.n0().c(p0);
       return;
    }
    public static void h(e p0){
       p0.n0().z(p0);
       return;
    }
    public static void i(e p0,r p1){
       p0.n0().h(p0, p1);
       return;
    }
    public static void j(e p0,SocketAddress p1,SocketAddress p2,r p3){
       p0.n0().e(p0, p1, p2, p3);
       return;
    }
    public static void k(e p0,r p1){
       p0.n0().k(p0, p1);
       return;
    }
    public static void l(e p0,r p1){
       p0.n0().n(p0, p1);
       return;
    }
    public static void m(e p0,Throwable p1){
       p0.n0().a(p0, p1);
       return;
    }
    public static void n(e p0){
       p0.n0().b(p0);
       return;
    }
    public static void o(e p0){
       p0.n0().p(p0);
       return;
    }
    public static void p(e p0,Object p1){
       p0.n0().d(p0, p1);
       return;
    }
    public static void q(e p0,Object p1,r p2){
       p0.n0().D(p0, p1, p2);
       return;
    }
    public static void r(e p0,Throwable p1){
       Throwable throwable = p1;
       do {
          StackTraceElement[] stackTrace = throwable.getStackTrace();
          int i = 0;
          if (stackTrace != null) {
             int len = stackTrace.length;
             int i1 = 0;
             while (true) {
                if (i1 < len) {
                   object oobject = stackTrace[i1];
                   if (oobject != null) {
                      if (("exceptionCaught").equals(oobject.getMethodName())) {
                         i = 1;
                         break ;
                      }else {
                         i1 = i1 + 1;
                      }
                   }
                }
             }
             if (i) {
                b g = u.g;
                if (g.isWarnEnabled()) {
                   g.warn("An exception was thrown by a user handler while handling an exceptionCaught event", p1);
                }
                return;
             }else {
                i.m(p0, p1);
                return;
             }
          }
          throwable = throwable.getCause();
          if (throwable == null) {
             goto label_0028 ;
          }else {
             continue ;
          }
       } while (throwable == null);
    }
    public static void s(Throwable p0,r p1){
       if (!p1.y(p0) && !p1 instanceof g0) {
          b g = u.g;
          if (g.isWarnEnabled()) {
             g.warn("Failed to fail the promise because it\'s done already: {}", p1, p0);
          }
       }
       return;
    }
    public static boolean t(e p0,r p1,boolean p2){
       Objects.requireNonNull(p0, "ctx");
       Objects.requireNonNull(p1, "promise");
       if (p1.isDone()) {
          if (p1.isCancelled()) {
             return false;
          }
          throw new IllegalArgumentException("promise already done: "+p1);
       }else if(p1.o() == p0.o()){
          if (p1.getClass() == w.class) {
             return true;
          }
          if (!p2 && p1 instanceof g0) {
             throw new IllegalArgumentException(w.a(g0.class)+" not allowed for this operation");
          }
          if (!p1 instanceof a$b) {
             return true;
          }
          throw new IllegalArgumentException(w.a(a$b.class)+" not allowed in a pipeline");
       }else {
          Object[] objArray = new Object[]{p1.o(),p0.o()};
          throw new IllegalArgumentException(String.format("promise.channel does not match: %s \(expected: %s\)", objArray));
       }
    }
}
