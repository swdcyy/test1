package id.b;
import id.i;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Throwable;
import java.lang.Class;
import cb.a;
import cb.c;
import java.lang.String;

public abstract class b implements i	// class@00219c
{
    public boolean a;

    public void b(){
       super();
       this.a = false;
    }
    public static boolean e(int p0){
       int i = 1;
       if ((p0 & i) == i) {
       }else {
          i = false;
       }
       return i;
    }
    public static boolean f(int p0){
       return (b.e(p0) ^ 0x01);
    }
    public static boolean l(int p0,int p1){
       boolean b = (p0 & p1)? true: false;
       return b;
    }
    public static boolean m(int p0,int p1){
       boolean b = ((p0 & p1) == p1)? true: false;
       return b;
    }
    public synchronized void a(float p0){
       if (this.a != null) {
          return;
       }
       try{
          this.j(p0);
       }catch(java.lang.Exception e2){
          this.k(e2);
       }
       return;
    }
    public synchronized void b(){
       if (this.a != null) {
          return;
       }
       this.a = true;
       try{
          this.g();
       }catch(java.lang.Exception e0){
          this.k(e0);
       }
       return;
    }
    public synchronized void d(Object p0,int p1){
       if (this.a != null) {
          return;
       }
       boolean b = b.e(p1);
       try{
          this.a = b;
          this.i(p0, p1);
       }catch(java.lang.Exception e2){
          this.k(e2);
       }
       return;
    }
    public abstract void g();
    public abstract void h(Throwable p0);
    public abstract void i(Object p0,int p1);
    public void j(float p0){
    }
    public void k(Exception p0){
       Class class = this.getClass();
       if (a.a.d(6)) {
          a.a.c(a.j(class), "unhandled exception", p0);
       }
       return;
    }
    public synchronized void onFailure(Throwable p0){
       if (this.a != null) {
          return;
       }
       this.a = true;
       try{
          this.h(p0);
       }catch(java.lang.Exception e2){
          this.k(e2);
       }
       return;
    }
}
