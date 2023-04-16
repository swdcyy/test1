package h19.d$b;
import d6a.a;
import h19.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.widget.SwipeLayout$b;
import com.yxcorp.gifshow.widget.SwipeLayout;
import com.yxcorp.gifshow.widget.SwipeLayout$Direction;
import ge5.d;
import joc.d;
import joc.c;
import joc.o;
import joc.l;
import lnc.u1;

public class d$b extends a	// class@002537
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void F1(){
       d s;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d$b.class, "2")) {
          return;
       }
       d$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, d.class, "6")) {
          d h = tb.H;
          if (h != null) {
             h.setOnSwipedListener(objArray);
             s = tb.s;
             if (s != null) {
                tb.H.setDirection(s);
             }
          }
          s = tb.G;
          if (s != null) {
             s.b.t(tb.v);
          }
          s = tb.F;
          if (s != null) {
             s.l(tb.J);
          }
          u1.b(tb);
       }
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d$b.class, "1")) {
          return;
       }
       d$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, d.class, "5")) {
          d h = tb.H;
          if (h != null) {
             tb.s = h.getDirection();
             tb.H.setDirection(SwipeLayout$Direction.LEFT);
             tb.H.setOnSwipedListener(tb.L);
             h = tb.G;
             if (h != null) {
                h.b.k(tb.v);
             }
             h = tb.F;
             if (h != null) {
                h.g(tb.J);
             }
             u1.a(tb);
          }
       }
       return;
    }
}
