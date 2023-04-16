package k6a.n$a;
import java.lang.Runnable;
import k6a.n;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import k6a.n$e;
import java.util.Objects;
import java.lang.Integer;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewPropertyAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$l;
import k6a.q;
import android.animation.Animator$AnimatorListener;

public class n$a implements Runnable	// class@002bf5
{
    public final ArrayList b;
    public final n c;

    public void n$a(n p0,ArrayList p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoidWithListener(null, this, n$a.class, "1")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          n$e uoe = iterator.next();
          n$a tc = this.c;
          n$e a = uoe.a;
          n$e b = uoe.b;
          n$e c = uoe.c;
          n$e d = uoe.d;
          uoe = uoe.e;
          Objects.requireNonNull(tc);
          if (PatchProxy.isSupport2(n.class, "7")) {
             Object[] objArray = new Object[]{a,Integer.valueOf(b),Integer.valueOf(c),Integer.valueOf(d),Integer.valueOf(uoe)};
             if (PatchProxy.applyVoid(objArray, tc, n.class, "7")) {
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
          q oq = new q(tc, a, i, itemView, i1, viewProperty);
          viewProperty.setDuration(tc.n()).setListener(v13).start();
          PatchProxy.onMethodExit(n.class, "7");
       }
       this.b.clear();
       this.c.m.remove(this.b);
       PatchProxy.onMethodExit(n$a.class, "1");
       return;
    }
}
