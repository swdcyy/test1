package ga.t;
import ka.b;
import ga.y;
import java.lang.Object;
import com.contrarywind.view.WheelView;
import java.util.List;
import aa.a;
import ia.a;
import ea.d;

public class t implements b	// class@002087
{
    public final y b;

    public void t(y p0){
       this.b = p0;
       super();
    }
    public void b(int p0){
       y l;
       t tb = this.b;
       t ot = null;
       if (tb.g != null) {
          int currentItem = tb.b.getCurrentItem();
          if (currentItem >= (this.b.g.size() - 1)) {
             currentItem = this.b.g.size() - 1;
          }
          if (p0 >= (this.b.f.get(currentItem).size() - 1)) {
             p0 = this.b.f.get(currentItem).size() - 1;
          }
          t tb1 = this.b;
          if (tb1.i == null) {
             currentItem = (tb1.d.getCurrentItem() >= (this.b.g.get(currentItem).get(p0).size() - 1))? this.b.g.get(currentItem).get(p0).size() - 1: this.b.d.getCurrentItem();
             ot = currentItem;
          }
          tb = this.b;
          tb.d.setAdapter(new a(tb.g.get(tb.b.getCurrentItem()).get(p0)));
          this.b.d.setCurrentItem(ot);
          tb = this.b;
          l = tb.l;
          if (l != null) {
             l.a(tb.b.getCurrentItem(), p0, ot);
          }
       }else {
          l = tb.l;
          if (l != null) {
             l.a(tb.b.getCurrentItem(), p0, ot);
          }
       }
       return;
    }
}
