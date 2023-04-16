package m6a.p$a;
import java.lang.Runnable;
import m6a.p;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import m6a.p$e;
import java.util.Objects;
import java.lang.Integer;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewPropertyAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$l;
import m6a.s;
import android.animation.Animator$AnimatorListener;

public class p$a implements Runnable	// class@002f58
{
    public final ArrayList b;
    public final p c;

    public void p$a(p p0,ArrayList p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoidWithListener(null, this, p$a.class, "1")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          p$e uoe = iterator.next();
          p$a tc = this.c;
          p$e a = uoe.a;
          p$e b = uoe.b;
          p$e c = uoe.c;
          p$e d = uoe.d;
          uoe = uoe.e;
          Objects.requireNonNull(tc);
          if (PatchProxy.isSupport2(p.class, "7")) {
             Object[] objArray = new Object[]{a,Integer.valueOf(b),Integer.valueOf(c),Integer.valueOf(d),Integer.valueOf(uoe)};
             if (PatchProxy.applyVoid(objArray, tc, p.class, "7")) {
                continue ;
             }
          }
          RecyclerView$ViewHolder itemView = a.itemView;
          int i = d - b;
          int i1 = uoe - c;
          float f = 0;
          if (i) {
             itemView.animate().translationX(f);
          }
          if (i1) {
             itemView.animate().translationY(f);
          }
          ViewPropertyAnimator viewProperty = itemView.animate();
          tc.p.add(a);
          s os = new s(tc, a, i, itemView, i1, viewProperty);
          viewProperty.setDuration(tc.n()).setListener(v13).start();
          PatchProxy.onMethodExit(p.class, "7");
       }
       this.b.clear();
       this.c.m.remove(this.b);
       PatchProxy.onMethodExit(p$a.class, "1");
       return;
    }
}
