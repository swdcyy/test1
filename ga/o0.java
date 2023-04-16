package ga.o0;
import ka.b;
import ga.q0;
import java.lang.Object;
import com.contrarywind.view.WheelView;
import ea.d;
import java.util.List;
import aa.a;
import ia.a;

public class o0 implements b	// class@00207c
{
    public final q0 b;

    public void o0(q0 p0){
       this.b = p0;
       super();
    }
    public void b(int p0){
       int currentItem;
       o0 tb = this.b;
       if (tb.f == null) {
          q0 l = tb.l;
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
       o0 tb1 = this.b;
       tb1.c.setAdapter(new a(tb1.f.get(p0)));
       this.b.c.setCurrentItem(currentItem);
       tb1 = this.b;
       if (tb1.g != null) {
          tb1.k.b(currentItem);
       }else {
          q0 l1 = tb1.l;
          if (l1 != null) {
             l1.a(p0, currentItem, 0);
          }
       }
       return;
    }
}
