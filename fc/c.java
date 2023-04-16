package fc.c;
import ec.a;
import java.lang.Object;
import com.facebook.common.references.a;
import android.graphics.Bitmap;
import ec.a$a;
import nd.a;

public class c implements a	// class@001fe6
{
    public int a;
    public a$a b;
    public a c;

    public void c(){
       super();
       this.a = -1;
    }
    public synchronized void a(int p0,a p1,int p2){
       if (p1 != null && (this.c != null && p1.j().equals(this.c.j()))) {
          return;
       }
       a.f(this.c);
       c tb = this.b;
       if (tb != null) {
          c ta = this.a;
          if (ta != -1) {
             tb.a(this, ta);
          }
       }
       this.c = a.d(p1);
       c tb1 = this.b;
       if (tb1 != null) {
          tb1.b(this, p0);
       }
       this.a = p0;
       return;
    }
    public synchronized a b(int p0,int p1,int p2){
       this.h();
       return a.d(this.c);
    }
    public synchronized a c(int p0){
       return a.d(this.c);
    }
    public synchronized void clear(){
       this.h();
    }
    public synchronized boolean d(int p0){
       boolean b = (p0 == this.a && a.l(this.c))? true: false;
       return b;
    }
    public void e(a$a p0){
       this.b = p0;
    }
    public synchronized a f(int p0){
       if (this.a == p0) {
          return a.d(this.c);
       }
       return null;
    }
    public void g(int p0,a p1,int p2){
    }
    public synchronized int getSizeInBytes(){
       c tc = this.c;
       int i = (tc == null)? 0: a.d(tc.j());
       return i;
    }
    public synchronized final void h(){
       c tb = this.b;
       if (tb != null) {
          c ta = this.a;
          if (ta != -1) {
             tb.a(this, ta);
          }
       }
       a.f(this.c);
       this.c = null;
       this.a = -1;
       return;
    }
}
