package ga.s0;
import ka.b;
import ga.v0;
import java.lang.Object;
import com.contrarywind.view.WheelView;
import fa.a;
import aa.a;
import java.util.ArrayList;
import java.util.List;
import ia.a;
import ea.b;

public class s0 implements b	// class@002084
{
    public final v0 b;

    public void s0(v0 p0){
       this.b = p0;
       super();
    }
    public void b(int p0){
       int currentItem = this.b.b.getCurrentItem();
       currentItem = currentItem + this.b.j;
       if (a.e(currentItem) && p0 > (a.e(currentItem) - 1)) {
          if (this.b.c.getCurrentItem() == (a.e(currentItem) + 1)) {
             this.b.d.setAdapter(new a(a.a(a.d(currentItem))));
             p0 = a.d(currentItem);
          }else {
             this.b.d.setAdapter(new a(a.a(a.f(currentItem, p0))));
             p0 = a.f(currentItem, p0);
          }
       }else {
          p0++;
          this.b.d.setAdapter(new a(a.a(a.f(currentItem, p0))));
          p0 = a.f(currentItem, p0);
       }
       currentItem = this.b.d.getCurrentItem();
       p0--;
       if (currentItem > p0) {
          v0 d = this.b.d;
          d.setCurrentItem(p0);
       }
       v0 x = this.b.x;
       if (x != null) {
          x.a();
       }
       return;
    }
}
