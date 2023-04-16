package ftd.e2;
import kotlin.coroutines.CoroutineContext;
import ftd.z1;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import java.lang.Throwable;
import kotlinx.coroutines.JobCancellationException;
import java.lang.String;
import msd.a;
import ftd.c1;
import ftd.e2$a;
import ftd.w;
import ftd.b2;
import ftd.c2;
import java.lang.Object;
import java.util.concurrent.CancellationException;
import ftd.l1;
import kotlinx.coroutines.JobSupport;
import asd.c;
import ftd.z1$a;
import csd.b;
import qrd.l1;
import wsd.m;
import java.util.Iterator;
import ftd.e1;
import msd.l;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;

public final class e2	// class@000e82
{

    public static final boolean A(CoroutineContext p0){
       z1 oz1 = p0.get(z1.p0);
       boolean b = true;
       if (oz1 == null || oz1.E() != b) {
          b = false;
       }
       return b;
    }
    public static final Throwable B(Throwable p0,z1 p1){
       if (p0 != null) {
       }else {
          JobCancellationException jobCancellat = new JobCancellationException("Job was cancelled", null, p1);
       }
       return p0;
    }
    public static final c1 a(a p0){
       return new e2$a(p0);
    }
    public static final w b(z1 p0){
       return new b2(p0);
    }
    public static final z1 c(z1 p0){
       return c2.b(p0);
    }
    public static w d(z1 p0,int p1,Object p2){
       if (p1 & 0x01) {
          p0 = null;
       }
       return c2.b(p0);
    }
    public static z1 e(z1 p0,int p1,Object p2){
       if (p1 & 0x01) {
          p0 = null;
       }
       return c2.c(p0);
    }
    public static final void f(z1 p0,String p1,Throwable p2){
       p0.b(l1.a(p1, p2));
    }
    public static final void g(CoroutineContext p0){
       c2.h(p0, null);
    }
    public static final void h(CoroutineContext p0,CancellationException p1){
       z1 oz1 = p0.get(z1.p0);
       if (oz1 != null) {
          oz1.b(p1);
       }
       return;
    }
    public static final boolean i(CoroutineContext p0,Throwable p1){
       CoroutineContext$a uoa = p0.get(z1.p0);
       if (!uoa instanceof JobSupport) {
          uoa = null;
       }
       if (uoa != null) {
          uoa.d0(e2.B(p1, uoa));
          return true;
       }else {
          return false;
       }
    }
    public static void j(z1 p0,String p1,Throwable p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = null;
       }
       c2.f(p0, p1, p2);
       return;
    }
    public static void k(CoroutineContext p0,CancellationException p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = null;
       }
       c2.h(p0, p1);
       return;
    }
    public static boolean l(CoroutineContext p0,Throwable p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = null;
       }
       return c2.i(p0, p1);
    }
    public static final Object m(z1 p0,c p1){
       z1$a.b(p0, null, 1, null);
       p0 = p0.p(p1);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
    public static final void n(z1 p0){
       c2.p(p0, null);
    }
    public static final void o(z1 p0,Throwable p1){
       Iterator iterator = p0.getChildren().iterator();
       while (iterator.hasNext()) {
          z1 oz1 = iterator.next();
          if (!oz1 instanceof JobSupport) {
             oz1 = null;
          }
          if (oz1 != null) {
             oz1.d0(e2.B(p1, p0));
          }
       }
       return;
    }
    public static final void p(z1 p0,CancellationException p1){
       Iterator iterator = p0.getChildren().iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p1);
       }
       return;
    }
    public static final void q(CoroutineContext p0){
       c2.s(p0, null);
    }
    public static final void r(CoroutineContext p0,Throwable p1){
       z1 oz1 = p0.get(z1.p0);
       if (oz1 != null) {
          Iterator iterator = oz1.getChildren().iterator();
          while (iterator.hasNext()) {
             z1 oz11 = iterator.next();
             if (!oz11 instanceof JobSupport) {
                oz11 = null;
             }
             if (oz11 != null) {
                oz11.d0(e2.B(p1, oz1));
             }
          }
       }
       return;
    }
    public static final void s(CoroutineContext p0,CancellationException p1){
       z1 oz1 = p0.get(z1.p0);
       if (oz1 != null) {
          m children = oz1.getChildren();
          if (children != null) {
             Iterator iterator = children.iterator();
             while (iterator.hasNext()) {
                iterator.next().b(p1);
             }
          }
       }
       return;
    }
    public static void t(z1 p0,Throwable p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = null;
       }
       c2.o(p0, p1);
       return;
    }
    public static void u(z1 p0,CancellationException p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = null;
       }
       c2.p(p0, p1);
       return;
    }
    public static void v(CoroutineContext p0,Throwable p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = null;
       }
       c2.r(p0, p1);
       return;
    }
    public static void w(CoroutineContext p0,CancellationException p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = null;
       }
       c2.s(p0, p1);
       return;
    }
    public static final c1 x(z1 p0,c1 p1){
       return p0.S(new e1(p0, p1));
    }
    public static final void y(z1 p0){
       if (p0.E()) {
          return;
       }
       throw p0.O();
    }
    public static final void z(CoroutineContext p0){
       z1 oz1 = p0.get(z1.p0);
       if (oz1 == null) {
          throw new IllegalStateException("Context cannot be checked for liveness because it does not have a job: "+p0.toString());
       }
       c2.A(oz1);
       return;
    }
}
