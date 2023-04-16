package cb.b;
import cb.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.StringBuilder;
import android.util.Log;
import java.io.StringWriter;
import java.io.PrintWriter;
import java.io.Writer;

public class b implements c	// class@0003ac
{
    public String a;
    public int b;
    public static final b c;

    static {
       b.c = new b();
    }
    public void b(){
       super();
       this.a = "unknown";
       this.b = 5;
    }
    public int a(){
       return this.b;
    }
    public void b(String p0,String p1){
       this.g(6, p0, p1);
    }
    public void c(String p0,String p1,Throwable p2){
       this.h(6, p0, p1, p2);
    }
    public void d(String p0,String p1){
       this.g(3, p0, p1);
    }
    public void d(String p0,String p1,Throwable p2){
       this.h(3, p0, p1, p2);
    }
    public boolean d(int p0){
       boolean b = (this.b <= p0)? true: false;
       return b;
    }
    public void e(int p0){
       this.b = p0;
    }
    public void e(String p0,String p1){
       this.g(6, p0, p1);
    }
    public void e(String p0,String p1,Throwable p2){
       this.h(6, p0, p1, p2);
    }
    public final String f(String p0){
       if (this.a != null) {
          p0 = this.a+":"+p0;
       }
       return p0;
    }
    public final void g(int p0,String p1,String p2){
       Log.println(p0, this.f(p1), p2);
    }
    public final void h(int p0,String p1,String p2,Throwable p3){
       p1 = this.f(p1);
       StringBuilder str = p2+10;
       if (p3 == null) {
          p2 = "";
       }else {
          StringWriter stringWriter = new StringWriter();
          p3.printStackTrace(new PrintWriter(stringWriter));
          stringWriter = stringWriter.toString();
       }
       Log.println(p0, p1, str+p2);
       return;
    }
    public void i(String p0,String p1){
       this.g(4, p0, p1);
    }
    public void i(String p0,String p1,Throwable p2){
       this.h(4, p0, p1, p2);
    }
    public void log(int p0,String p1,String p2){
       this.g(p0, p1, p2);
    }
    public void v(String p0,String p1){
       this.g(2, p0, p1);
    }
    public void v(String p0,String p1,Throwable p2){
       this.h(2, p0, p1, p2);
    }
    public void w(String p0,String p1){
       this.g(5, p0, p1);
    }
    public void w(String p0,String p1,Throwable p2){
       this.h(5, p0, p1, p2);
    }
}
