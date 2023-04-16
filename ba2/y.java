package ba2.y;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.live.core.show.hourlytrank.h;
import java.lang.Object;
import java.util.Collection;
import ekd.q;
import ba2.r;
import java.util.Iterator;
import java.util.Set;
import ba2.p;

public final class y implements ViewTreeObserver$OnGlobalLayoutListener	// class@0003b6
{
    public final h b;

    public void y(h p0){
       this.b = p0;
    }
    public final void onGlobalLayout(){
       y tb = this.b;
       if (q.f(tb.d1)) {
       }else {
          int i = tb.j1.b();
          if (i != tb.c1) {
             tb.c1 = i;
             Iterator iterator = tb.d1.iterator();
             while (iterator.hasNext()) {
                iterator.next().a(tb.c1);
             }
          }
       }
       return;
    }
}
