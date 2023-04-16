package d5.k;
import d5.f;
import java.util.List;
import n5.d;
import n5.a;
import java.lang.Object;
import d5.a;
import java.lang.Float;
import n5.c;
import m5.e;
import java.lang.IllegalStateException;
import java.lang.String;

public class k extends f	// class@001e08
{
    public final d l;

    public void k(List p0){
       super(p0);
       this.l = new d();
    }
    public Object i(a p0,float p1){
       a b = p0.b;
       if (b != null) {
          a c = p0.c;
          if (c != null) {
             a te = this.e;
             if (te != null) {
                d uod = te.a(p0.e, p0.f.floatValue(), b, c, p1, this.e(), this.f());
                if (uod != null) {
                label_004c :
                   return uod;
                }
             }
             k tl = this.l;
             tl.a = e.e(b.a(), c.a(), p1);
             tl.b = e.e(b.b(), c.b(), p1);
             tl = this.l;
             goto label_004c ;
          }
       }
       throw new IllegalStateException("Missing values for keyframe.");
    }
}
