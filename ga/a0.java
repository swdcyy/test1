package ga.a0;
import ka.b;
import ga.d0;
import java.lang.Object;
import com.contrarywind.view.WheelView;
import fa.a;
import aa.a;
import java.util.ArrayList;
import java.util.List;
import ia.a;
import ea.b;

public class a0 implements b	// class@002055
{
    public final d0 b;

    public void a0(d0 p0){
       this.b = p0;
       super();
    }
    public void b(int p0){
       int i = this.b.b.getCurrentItem() + this.b.j;
       if (a.e(i) && p0 > (a.e(i) - 1)) {
          if (this.b.c.getCurrentItem() == (a.e(i) + 1)) {
             this.b.d.setAdapter(new a(a.a(a.d(i))));
             p0 = a.d(i);
          }else {
             this.b.d.setAdapter(new a(a.a(a.f(i, p0))));
             p0 = a.f(i, p0);
          }
       }else {
          p0++;
          this.b.d.setAdapter(new a(a.a(a.f(i, p0))));
          p0 = a.f(i, p0);
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
