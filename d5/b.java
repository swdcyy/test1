package d5.b;
import d5.f;
import java.util.List;
import n5.a;
import java.lang.Object;
import java.lang.Integer;
import d5.a;
import java.lang.Float;
import n5.c;
import m5.e;
import m5.b;
import java.lang.IllegalStateException;
import java.lang.String;

public class b extends f	// class@001dff
{

    public void b(List p0){
       super(p0);
    }
    public Object i(a p0,float p1){
       return Integer.valueOf(this.n(p0, p1));
    }
    public int m(){
       return this.n(this.b(), this.d());
    }
    public int n(a p0,float p1){
       a b = p0.b;
       if (b == null || p0.c == null) {
          throw new IllegalStateException("Missing values for keyframe.");
       }
       int i = b.intValue();
       int i1 = p0.c.intValue();
       a te = this.e;
       if (te != null) {
          Integer integer = te.a(p0.e, p0.f.floatValue(), Integer.valueOf(i), Integer.valueOf(i1), p1, this.e(), this.f());
          if (integer != null) {
             return integer.intValue();
          }
       }
       return b.c(e.b(p1, 0, 0x3f800000), i, i1);
    }
}
