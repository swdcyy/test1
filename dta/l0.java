package dta.l0;
import wq6.f;
import java.lang.Object;
import android.view.MotionEvent;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import android.view.GestureDetector$OnDoubleTapListener;

public class l0	// class@00253c
{
    public final f a;
    public boolean b;
    public boolean c;
    public static boolean d;

    public void l0(f p0){
       super();
       this.a = p0;
    }
    public void a(MotionEvent p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l0.class, "5")) {
          return;
       }
       this.c = true;
       if (!q.f(p1)) {
          Iterator iterator = p1.iterator();
          do {
          } while (!iterator.hasNext() || iterator.next().onSingleTapConfirmed(p0));
       }
       return;
    }
}
