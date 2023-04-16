package fyd.a$c;
import java.lang.Object;
import java.lang.ThreadLocal;
import java.lang.String;
import java.lang.Throwable;

public abstract class a$c	// class@000ef6
{
    public final ThreadLocal a;

    public void a$c(){
       super();
       this.a = new ThreadLocal();
    }
    public String a(){
       String str = this.a.get();
       if (str != null) {
          this.a.remove();
       }
       return str;
    }
    public void b(String p0,Object[] p1){
       this.d(4, null, p0, p1);
    }
    public abstract void c(int p0,String p1,String p2,Throwable p3);
    public final void d(int p0,Throwable p1,String p2,Object[] p3){
       String str = this.a();
       if (p2 != null && !p2.length()) {
          p2 = null;
       }
       if (p2 == null) {
          return;
       }else if(p3 != null && p3.length > 0){
          p2 = String.format(p2, p3);
       }
       this.c(p0, str, p2, null);
       return;
    }
}
