package o2.b$b;
import androidx.lifecycle.Observer;
import p2.a;
import o2.a$a;
import java.lang.Object;
import java.lang.String;
import java.io.PrintWriter;
import o2.b;
import java.lang.StringBuilder;

public class b$b implements Observer	// class@00274a
{
    public final a b;
    public final a$a c;
    public boolean d;

    public void b$b(a p0,a$a p1){
       super();
       this.d = false;
       this.b = p0;
       this.c = p1;
    }
    public void a(String p0,PrintWriter p1){
       p1.print(p0);
       p1.print("mDeliveredData=");
       p1.println(this.d);
    }
    public boolean b(){
       return this.d;
    }
    public void c(){
       if (this.d != null) {
          if (b.c) {
             StringBuilder str = "  Resetting: "+this.b;
          }
          this.c.a(this.b);
       }
       return;
    }
    public void onChanged(Object p0){
       if (b.c) {
          StringBuilder str = "  onLoadFinished in "+this.b+": "+this.b.b(p0);
       }
       this.d = true;
       this.c.c(this.b, p0);
       return;
    }
    public String toString(){
       return this.c.toString();
    }
}
