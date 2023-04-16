package b8a.d1;
import r7a.g$c;
import com.yxcorp.gifshow.detail.slidev2.presenter.q;
import java.lang.Object;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.List;
import r7a.h;

public final class d1 implements g$c	// class@00039a
{
    public final q a;

    public void d1(q p0){
       this.a = p0;
    }
    public final void a(MotionEvent p0,boolean p1,int p2){
       Iterator iterator = this.a.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1, p2);
       }
       return;
    }
}
