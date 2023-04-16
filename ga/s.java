package ga.s;
import ka.b;
import ga.y;
import java.lang.Object;
import com.contrarywind.view.WheelView;
import ea.d;
import java.util.List;
import aa.a;
import ia.a;

public class s implements b	// class@002085
{
    public final y b;

    public void s(y p0){
       this.b = p0;
       super();
    }
    public void b(int p0){
       int currentItem;
       s tb = this.b;
       if (tb.f == null) {
          y l = tb.l;
          if (l != null) {
             l.a(tb.b.getCurrentItem(), 0, 0);
          }
       }else if(tb.i == null){
          currentItem = tb.c.getCurrentItem();
          if (currentItem >= (this.b.f.get(p0).size() - 1)) {
             currentItem = this.b.f.get(p0).size() - 1;
          }
       }else {
          currentItem = 0;
       }
       s tb1 = this.b;
       tb1.c.setAdapter(new a(tb1.f.get(p0)));
       this.b.c.setCurrentItem(currentItem);
       tb1 = this.b;
       if (tb1.g != null) {
          tb1.k.b(currentItem);
       }else {
          y l1 = tb1.l;
          if (l1 != null) {
             l1.a(p0, currentItem, 0);
          }
       }
       return;
    }
}
