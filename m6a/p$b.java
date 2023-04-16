package m6a.p$b;
import java.lang.Runnable;
import m6a.p;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import m6a.p$d;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.RecyclerView$l;
import android.view.ViewPropertyAnimator;
import android.view.View;
import android.animation.TimeInterpolator;
import m6a.t;
import android.animation.Animator$AnimatorListener;
import m6a.u;

public class p$b implements Runnable	// class@002f59
{
    public final ArrayList b;
    public final p c;

    public void p$b(p p0,ArrayList p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       Iterator iterator1;
       p$b uob = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, uob, p$b.class, "1")) {
          return;
       }
       Iterator iterator = uob.b.iterator();
       while (iterator.hasNext()) {
          p$d uod = iterator.next();
          p$b c = uob.c;
          Objects.requireNonNull(c);
          if (PatchProxy.applyVoidOneRefsWithListener(uod, c, p.class, "9")) {
             iterator1 = iterator;
          }else {
             p$d a = uod.a;
             Object[] objArray1 = (a == null)? objArray: a.itemView;
             p$d b = uod.b;
             RecyclerView$ViewHolder itemView = (b != null)? b.itemView: objArray;
             long l = c.m() / 3;
             long l1 = c.m() - l;
             if (objArray1 != null) {
                ViewPropertyAnimator viewProperty = objArray1.animate().setDuration(l).setInterpolator(c.s);
                c.r.add(uod.a);
                int i = uod.e - uod.c;
                viewProperty.translationX((float)i);
                i = uod.f - uod.d;
                viewProperty.translationY((float)i);
                iterator1 = iterator;
                viewProperty.scaleX(0x3f733333).scaleY(0x3f733333).setStartDelay(0).setListener(new t(c, uod, viewProperty, objArray1)).start();
             }else {
                iterator1 = iterator;
             }
             if (itemView != null) {
                ViewPropertyAnimator viewProperty1 = itemView.animate().setInterpolator(c.s);
                c.r.add(uod.b);
                viewProperty1.translationX(0).translationY(0).scaleX(0x3f800000).scaleY(0x3f800000).setDuration(l1).setStartDelay(l).setListener(new u(c, itemView, uod, viewProperty1)).start();
             }
             PatchProxy.onMethodExit(p.class, "9");
          }
          objArray = null;
          uob = this;
          iterator = iterator1;
       }
       uob.b.clear();
       uob.c.n.remove(uob.b);
       PatchProxy.onMethodExit(p$b.class, "1");
       return;
    }
}
