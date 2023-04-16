package d5.c;
import d5.f;
import java.util.List;
import n5.a;
import java.lang.Object;
import java.lang.Float;
import d5.a;
import n5.c;
import m5.e;
import java.lang.IllegalStateException;
import java.lang.String;

public class c extends f	// class@001e00
{

    public void c(List p0){
       super(p0);
    }
    public Object i(a p0,float p1){
       return Float.valueOf(this.n(p0, p1));
    }
    public float m(){
       return this.n(this.b(), this.d());
    }
    public float n(a p0,float p1){
       if (p0.b == null || p0.c == null) {
          throw new IllegalStateException("Missing values for keyframe.");
       }
       a te = this.e;
       if (te != null) {
          Float uFloat = te.a(p0.e, p0.f.floatValue(), p0.b, p0.c, p1, this.e(), this.f());
          if (uFloat != null) {
             return uFloat.floatValue();
          }
       }
       te = -898407689;
       if (!p0.g - te) {
          p0.g = p0.b.floatValue();
       }
       a g = p0.g;
       if (!p0.h - te) {
          p0.h = p0.c.floatValue();
       }
       return e.e(g, p0.h, p1);
    }
}
