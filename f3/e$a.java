package f3.e$a;
import android.animation.TypeEvaluator;
import java.lang.Object;
import p1.d$b;
import p1.d;
import java.lang.IllegalArgumentException;
import java.lang.String;

public class e$a implements TypeEvaluator	// class@001fc1
{
    public d$b[] a;

    public void e$a(){
       super();
    }
    public void e$a(d$b[] p0){
       super();
       this.a = p0;
    }
    public d$b[] a(float p0,d$b[] p1,d$b[] p2){
       if (!d.b(p1, p2)) {
          throw new IllegalArgumentException("Can\'t interpolate between two incompatible pathData");
       }
       if (!d.b(this.a, p1)) {
          this.a = d.f(p1);
       }
       for (int i = 0; i < p1.length; i = i + 1) {
          this.a[i].d(p1[i], p2[i], p0);
       }
       return this.a;
    }
    public Object evaluate(float p0,Object p1,Object p2){
       return this.a(p0, p1, p2);
    }
}
