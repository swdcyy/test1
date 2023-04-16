package fw8.f;
import nc5.c;
import com.yxcorp.gifshow.activity.f;
import java.lang.Object;
import java.util.Objects;
import tra.b;
import java.lang.String;
import q87.c;
import wq6.h;
import zr6.e;
import wq6.d;
import com.yxcorp.gifshow.util.rx.RxBus;
import jsa.j;
import ro5.a;
import sta.n;

public final class f implements c	// class@00235c
{
    public final f b;

    public void f(f p0){
       this.b = p0;
    }
    public final void onUpdate(int p0,int p1){
       boolean b;
       f tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       b.C().w("ActivityTabLifecycleAwareness", "receive red dot", objArray);
       tb.r();
       b = tb.n().isSelected();
       if (!b && p1 > 0) {
          RxBus.f.b(new j(1, 0));
          a.q(tb.n());
       }
       if (b && tb.n().s()) {
          n.a(tb.j);
       }
       return;
    }
}
