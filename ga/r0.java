package ga.r0;
import ka.b;
import ga.v0;
import java.lang.Object;
import aa.a;
import java.util.ArrayList;
import fa.a;
import java.util.List;
import ia.a;
import com.contrarywind.view.WheelView;
import ea.b;

public class r0 implements b	// class@002082
{
    public final v0 b;

    public void r0(v0 p0){
       this.b = p0;
       super();
    }
    public void b(int p0){
       v0 c;
       r0 tb = this.b;
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
       int currentItem = this.b.d.getCurrentItem();
       p0--;
       if (currentItem > p0) {
          currentItem = this.b.d;
          currentItem.setCurrentItem(p0);
       }
       v0 x = this.b.x;
       if (x != null) {
          x.a();
       }
       return;
    }
}
