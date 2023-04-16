package f3a.j$b;
import android.view.ViewTreeObserver$OnPreDrawListener;
import f3a.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import f3a.i;
import java.util.Objects;
import java.lang.Integer;
import com.yxcorp.gifshow.fragment.e;
import g9c.d;
import g9c.d$c;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup$LayoutParams;

public class j$b implements ViewTreeObserver$OnPreDrawListener	// class@002286
{
    public final j b;

    public void j$b(j p0){
       this.b = p0;
       super();
    }
    public boolean onPreDraw(){
       j$b obj = PatchProxy.apply(null, this, j$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.r.getViewTreeObserver().removeOnPreDrawListener(this);
       obj = this.b;
       j q = obj.q;
       if (q instanceof i) {
          int height = obj.r.getHeight();
          Objects.requireNonNull(q);
          i oi = i.class;
          if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(height), q, oi, "6")) {
             e c = q.c;
             if (c != null) {
                d e = c.e;
                if (e != null) {
                   d$c a = e.a;
                   if (a != null) {
                      View view = a.get(0);
                      if (view != null) {
                         int height1 = view.getHeight();
                         i j = q.j;
                         if (j != null) {
                            ViewGroup$LayoutParams layoutParams = j.getLayoutParams();
                            if (layoutParams != null) {
                               layoutParams.height = height - height1;
                            }
                         }
                         i j1 = q.j;
                         if (j1 != null) {
                            j1.requestLayout();
                         }
                      }
                   }
                }
             }
          }
       }
       return true;
    }
}
