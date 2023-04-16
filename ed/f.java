package ed.f;
import java.lang.Object;
import ab.e;
import java.util.LinkedList;
import java.util.Queue;
import cb.a;
import cb.c;
import java.lang.String;

public class f	// class@00152f
{
    public final int a;
    public final int b;
    public final Queue c;
    public final boolean d;
    public int e;

    public void f(int p0,int p1,int p2,boolean p3){
       super();
       boolean b = true;
       boolean b1 = (p0 > 0)? true: false;
       e.f(b1);
       b1 = (p1 >= 0)? true: false;
       e.f(b1);
       if (p2 < 0) {
          b = false;
       }
       e.f(b);
       this.a = p0;
       this.b = p1;
       this.c = new LinkedList();
       this.e = p2;
       this.d = p3;
       return;
    }
    public void a(Object p0){
       this.c.add(p0);
    }
    public void b(){
       boolean b = (this.e > null)? true: false;
       e.f(b);
       this.e = this.e - 1;
       return;
    }
    public int c(){
       return this.c.size();
    }
    public int d(){
       return this.e;
    }
    public Object e(){
       return this.c.poll();
    }
    public void f(Object p0){
       e.d(p0);
       int i = 1;
       boolean b = false;
       if (this.d != null) {
          if (this.e > null) {
             b = true;
          }
          e.f(b);
          this.e = this.e - i;
          this.a(p0);
       }else {
          f te = this.e;
          if (te > null) {
             this.e = te - i;
             this.a(p0);
          }else {
             Object[] objArray = new Object[i];
             objArray[b] = p0;
             if (a.a.d(6)) {
                a.a.e("BUCKET", a.i("Tried to release value %s from an empty bucket!", objArray));
             }
          }
       }
       return;
    }
}
