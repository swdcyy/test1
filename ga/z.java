package ga.z;
import ka.b;
import ga.d0;
import java.lang.Object;
import aa.a;
import java.util.ArrayList;
import fa.a;
import java.util.List;
import ia.a;
import com.contrarywind.view.WheelView;
import ea.b;

public class z implements b	// class@002090
{
    public final d0 b;

    public void z(d0 p0){
       this.b = p0;
       super();
    }
    public void b(int p0){
       d0 c;
       z tb = this.b;
       p0 = p0 + tb.j;
       tb.c.setAdapter(new a(a.b(p0)));
       if (a.e(p0) && this.b.c.getCurrentItem() > (a.e(p0) - 1)) {
          c = this.b.c;
          c.setCurrentItem((c.getCurrentItem() + 1));
       }else {
          c = this.b.c;
          c.setCurrentItem(c.getCurrentItem());
       }
       if (a.e(p0) && this.b.c.getCurrentItem() > (a.e(p0) - 1)) {
          if (this.b.c.getCurrentItem() == (a.e(p0) + 1)) {
             this.b.d.setAdapter(new a(a.a(a.d(p0))));
             p0 = a.d(p0);
          }else {
             tb = this.b;
             tb.d.setAdapter(new a(a.a(a.f(p0, tb.c.getCurrentItem()))));
             p0 = a.f(p0, this.b.c.getCurrentItem());
          }
       }else {
          tb = this.b;
          tb.d.setAdapter(new a(a.a(a.f(p0, (tb.c.getCurrentItem() + 1)))));
          p0 = a.f(p0, (this.b.c.getCurrentItem() + 1));
       }
       p0--;
       if (this.b.d.getCurrentItem() > p0) {
          this.b.d.setCurrentItem(p0);
       }
       d0 b = this.b.B;
       if (b != null) {
          b.a();
       }
       return;
    }
}
