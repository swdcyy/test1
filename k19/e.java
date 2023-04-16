package k19.e;
import erd.g;
import k19.k;
import java.lang.Object;
import vq4.c;
import java.util.Objects;
import java.lang.String;
import yx.j0;
import vq4.d;

public final class e implements g	// class@002a7e
{
    public final k b;
    public final int c;
    public final int d;

    public void e(k p0,int p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       e tb = this.b;
       e tc = this.c;
       e td = this.d;
       Objects.requireNonNull(tb);
       if (tc != 4 && tc != 5) {
          if (tc != 6) {
             if (tc != 7) {
                p0.v = 0;
                Object[] objArray = new Object[0];
                j0.a("AdDetailECommercePresenter", "logClickEvent root click", objArray);
             }else {
                p0.v = 31;
             }
          }else {
             p0.v = 30;
          }
       }else {
          p0.v = 29;
       }
       p0.F.w1 = td;
       tb.P8(p0, tb.D);
       return;
    }
}
