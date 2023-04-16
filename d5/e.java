package d5.e;
import d5.f;
import java.util.List;
import n5.a;
import java.lang.Object;
import java.lang.Integer;
import d5.a;
import java.lang.Float;
import n5.c;
import m5.e;
import java.lang.IllegalStateException;
import java.lang.String;

public class e extends f	// class@001e02
{

    public void e(List p0){
       super(p0);
    }
    public Object i(a p0,float p1){
       return Integer.valueOf(this.m(p0, p1));
    }
    public int m(a p0,float p1){
       if (p0.b == null || p0.c == null) {
          throw new IllegalStateException("Missing values for keyframe.");
       }
       a te = this.e;
       if (te != null) {
          Integer integer = te.a(p0.e, p0.f.floatValue(), p0.b, p0.c, p1, this.e(), this.f());
          if (integer != null) {
             return integer.intValue();
          }
       }
       te = 0x2ec8fb09;
       if (p0.i == te) {
          p0.i = p0.b.intValue();
       }
       a i = p0.i;
       if (p0.j == te) {
          p0.j = p0.c.intValue();
       }
       return (int)((float)i + (p1 * (float)(p0.j - i)));
    }
}
