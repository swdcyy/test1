package ga.p0;
import ka.b;
import ga.q0;
import java.lang.Object;
import com.contrarywind.view.WheelView;
import java.util.List;
import aa.a;
import ia.a;
import ea.d;

public class p0 implements b	// class@00207e
{
    public final q0 b;

    public void p0(q0 p0){
       this.b = p0;
       super();
    }
    public void b(int p0){
       q0 l;
       p0 tb = this.b;
       p0 op0 = null;
       if (tb.g != null) {
          int currentItem = tb.b.getCurrentItem();
          if (currentItem >= (this.b.g.size() - 1)) {
             currentItem = this.b.g.size() - 1;
          }
          if (p0 >= (this.b.f.get(currentItem).size() - 1)) {
             p0 = this.b.f.get(currentItem).size() - 1;
          }
          p0 tb1 = this.b;
          if (tb1.i == null) {
             currentItem = (tb1.d.getCurrentItem() >= (this.b.g.get(currentItem).get(p0).size() - 1))? this.b.g.get(currentItem).get(p0).size() - 1: this.b.d.getCurrentItem();
             op0 = currentItem;
          }
          tb = this.b;
          tb.d.setAdapter(new a(tb.g.get(tb.b.getCurrentItem()).get(p0)));
          this.b.d.setCurrentItem(op0);
          tb = this.b;
          l = tb.l;
          if (l != null) {
             l.a(tb.b.getCurrentItem(), p0, op0);
          }
       }else {
          l = tb.l;
          if (l != null) {
             l.a(tb.b.getCurrentItem(), p0, op0);
          }
       }
       return;
    }
}
