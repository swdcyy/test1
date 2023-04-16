package cb.a;
import cb.b;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import cb.c;
import java.lang.Class;
import java.util.Locale;

public class a	// class@0003ab
{
    public static c a;

    static {
       a.a = b.c;
    }
    public static void A(String p0,Throwable p1,String p2,Object[] p3){
       if (a.a.d(5)) {
          a.a.w(p0, a.i(p2, p3), p1);
       }
       return;
    }
    public static void B(String p0,String p1,Object[] p2){
       if (a.a.d(6)) {
          a.a.b(p0, a.i(p1, p2));
       }
       return;
    }
    public static void a(String p0,String p1){
       if (a.a.d(3)) {
          a.a.d(p0, p1);
       }
       return;
    }
    public static void b(String p0,String p1,Object p2){
       if (a.a.d(3)) {
          Object[] objArray = new Object[]{p2};
          a.a.d(p0, a.i(p1, objArray));
       }
       return;
    }
    public static void c(Class p0,String p1){
       if (a.a.d(6)) {
          a.a.e(a.j(p0), p1);
       }
       return;
    }
    public static void d(Class p0,String p1,Throwable p2){
       if (a.a.d(6)) {
          a.a.e(a.j(p0), p1, p2);
       }
       return;
    }
    public static void e(Class p0,String p1,Object[] p2){
       if (a.a.d(6)) {
          a.a.e(a.j(p0), a.i(p1, p2));
       }
       return;
    }
    public static void f(Class p0,Throwable p1,String p2,Object[] p3){
       if (a.a.d(6)) {
          a.a.e(a.j(p0), a.i(p2, p3), p1);
       }
       return;
    }
    public static void g(String p0,String p1){
       if (a.a.d(6)) {
          a.a.e(p0, p1);
       }
       return;
    }
    public static void h(String p0,String p1,Throwable p2){
       if (a.a.d(6)) {
          a.a.e(p0, p1, p2);
       }
       return;
    }
    public static String i(String p0,Object[] p1){
       return String.format(null, p0, p1);
    }
    public static String j(Class p0){
       return p0.getSimpleName();
    }
    public static void k(String p0,String p1){
       if (a.a.d(4)) {
          a.a.i(p0, p1);
       }
       return;
    }
    public static boolean l(int p0){
       return a.a.d(p0);
    }
    public static void m(Class p0,String p1){
       if (a.a.d(2)) {
          a.a.v(a.j(p0), p1);
       }
       return;
    }
    public static void n(Class p0,String p1,Object p2){
       if (a.a.d(2)) {
          Object[] objArray = new Object[]{p2};
          a.a.v(a.j(p0), a.i(p1, objArray));
       }
       return;
    }
    public static void o(Class p0,String p1,Object p2,Object p3){
       int i = 2;
       if (a.a.d(i)) {
          Object[] objArray = new Object[i];
          objArray[0] = p2;
          objArray[1] = p3;
          a.a.v(a.j(p0), a.i(p1, objArray));
       }
       return;
    }
    public static void p(Class p0,String p1,Object p2,Object p3,Object p4){
       if (a.l(2)) {
          Object[] objArray = new Object[]{p2,p3,p4};
          a.m(p0, a.i(p1, objArray));
       }
       return;
    }
    public static void q(Class p0,String p1,Object p2,Object p3,Object p4,Object p5){
       if (a.a.d(2)) {
          Object[] objArray = new Object[]{p2,p3,p4,p5};
          a.a.v(a.j(p0), a.i(p1, objArray));
       }
       return;
    }
    public static void r(String p0,String p1,Object p2,Object p3,Object p4){
       if (a.a.d(2)) {
          Object[] objArray = new Object[]{p2,p3,p4};
          a.a.v(p0, a.i(p1, objArray));
       }
       return;
    }
    public static void s(String p0,String p1,Object[] p2){
       if (a.a.d(2)) {
          a.a.v(p0, a.i(p1, p2));
       }
       return;
    }
    public static void t(Class p0,String p1){
       if (a.a.d(5)) {
          a.a.w(a.j(p0), p1);
       }
       return;
    }
    public static void u(Class p0,String p1,Throwable p2){
       if (a.a.d(5)) {
          a.a.w(a.j(p0), p1, p2);
       }
       return;
    }
    public static void v(Class p0,String p1,Object[] p2){
       if (a.a.d(5)) {
          a.a.w(a.j(p0), a.i(p1, p2));
       }
       return;
    }
    public static void w(Class p0,Throwable p1,String p2,Object[] p3){
       if (a.l(5)) {
          a.u(p0, a.i(p2, p3), p1);
       }
       return;
    }
    public static void x(String p0,String p1){
       if (a.a.d(5)) {
          a.a.w(p0, p1);
       }
       return;
    }
    public static void y(String p0,String p1,Throwable p2){
       if (a.a.d(5)) {
          a.a.w(p0, p1, p2);
       }
       return;
    }
    public static void z(String p0,String p1,Object[] p2){
       if (a.a.d(5)) {
          a.a.w(p0, a.i(p1, p2));
       }
       return;
    }
}
