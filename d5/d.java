package d5.d;
import d5.f;
import java.util.List;
import java.lang.Object;
import n5.a;
import i5.c;
import java.util.Objects;
import m5.e;
import m5.b;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public class d extends f	// class@001e01
{
    public final c l;

    public void d(List p0){
       super(p0);
       int i = 0;
       a b = p0.get(i).b;
       if (b == null) {
       }else {
          i = b.c();
       }
       float[] uofloatArray = new float[i];
       int[] ointArray = new int[i];
       this.l = new c(uofloatArray, ointArray);
       return;
    }
    public Object i(a p0,float p1){
       d tl = this.l;
       a b = p0.b;
       p0 = p0.c;
       Objects.requireNonNull(tl);
       if (b.b.length != p0.b.length) {
          throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary \("+b.b.length+" vs "+p0.b.length+"\)");
       }
       for (int i = 0; i < b.b.length; i = i + 1) {
          tl.a[i] = e.e(b.a[i], p0.a[i], p1);
          tl.b[i] = b.c(p1, b.b[i], p0.b[i]);
       }
       return this.l;
    }
}
