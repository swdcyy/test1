package id.f;
import id.b0;
import java.lang.Object;
import java.lang.Boolean;
import ab.e;
import id.i;
import id.c0;
import id.f$a;

public class f implements b0	// class@0021a5
{
    public final b0 a;
    public final int b;
    public final int c;
    public final boolean d;

    public void f(b0 p0,int p1,int p2,boolean p3){
       super();
       boolean b = (p1 <= p2)? true: false;
       e.a(Boolean.valueOf(b));
       e.d(p0);
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       return;
    }
    public void produceResults(i p0,c0 p1){
       if (p1.p() && this.d == null) {
          this.a.produceResults(p0, p1);
       }else {
          this.a.produceResults(new f$a(p0, this.b, this.c), p1);
       }
       return;
    }
}
