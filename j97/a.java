package j97.a;
import q97.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import q97.b;
import com.kwai.middleware.azeroth.Azeroth2;
import java.lang.Thread;
import kotlin.jvm.internal.a;
import java.lang.StackTraceElement;
import java.lang.StringBuilder;
import zsd.u;

public final class a implements c	// class@0019ce
{
    public final int a;

    public void a(int p0){
       super();
       this.a = p0;
    }
    public void a(String p0,Throwable p1){
       b.e(this, p0, p1);
    }
    public void b(String p0){
       b.i(this, p0);
    }
    public void c(Throwable p0){
       b.f(this, p0);
    }
    public void d(String p0){
       b.a(this, p0);
    }
    public void d(String p0,String p1){
       b.b(this, p0, p1);
    }
    public void d(String p0,String p1,Throwable p2){
       if (Azeroth2.B.u()) {
          this.h();
          this.i();
          this.j();
       }
       return;
    }
    public void e(String p0){
       b.g(this, p0);
    }
    public void e(String p0,String p1){
       b.d(this, p0, p1);
    }
    public void e(String p0,String p1,Throwable p2){
       if (Azeroth2.B.u()) {
          this.h();
          this.i();
          this.j();
       }
       return;
    }
    public void f(String p0){
       b.k(this, p0);
    }
    public void g(String p0){
       b.c(this, p0);
    }
    public final String h(){
       Thread thread = Thread.currentThread();
       a.h(thread, "Thread.currentThread\(\)");
       object oobject = thread.getStackTrace()[this.a];
       a.h(oobject, "element");
       String className = oobject.getClassName();
       a.h(className, "element.className");
       return className;
    }
    public final String i(){
       Thread thread = Thread.currentThread();
       a.h(thread, "Thread.currentThread\(\)");
       object oobject = thread.getStackTrace()[this.a];
       a.h(oobject, "element");
       return '('+oobject.getFileName()+':'+oobject.getLineNumber()+')';
    }
    public void i(String p0,String p1){
       b.h(this, p0, p1);
    }
    public void i(String p0,String p1,Throwable p2){
       if (Azeroth2.B.u()) {
          this.h();
          this.i();
          this.j();
       }
       return;
    }
    public final String j(){
       Thread thread = Thread.currentThread();
       a.h(thread, "element");
       String name = thread.getName();
       a.h(name, "element.name");
       return "\(Thread:"+u.m1(name)+')';
    }
    public void v(String p0,String p1){
       b.j(this, p0, p1);
    }
    public void v(String p0,String p1,Throwable p2){
       if (Azeroth2.B.u()) {
          this.h();
          this.i();
          this.j();
       }
       return;
    }
    public void w(String p0,String p1){
       b.l(this, p0, p1);
    }
    public void w(String p0,String p1,Throwable p2){
       if (Azeroth2.B.u()) {
          this.h();
          this.i();
          this.j();
       }
       return;
    }
}
