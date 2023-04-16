package k6a.n$c;
import java.lang.Runnable;
import k6a.n;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.util.Objects;
import android.view.ViewPropertyAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$l;
import k6a.p;
import android.animation.Animator$AnimatorListener;

public class n$c implements Runnable	// class@002bf7
{
    public final ArrayList b;
    public final n c;

    public void n$c(n p0,ArrayList p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoidWithListener(null, this, n$c.class, "1")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          RecyclerView$ViewHolder viewHolder = iterator.next();
          n$c tc = this.c;
          Objects.requireNonNull(tc);
          if (PatchProxy.applyVoidOneRefsWithListener(viewHolder, tc, n.class, "5")) {
             continue ;
          }else {
             RecyclerView$ViewHolder itemView = viewHolder.itemView;
             ViewPropertyAnimator viewProperty = itemView.animate();
             tc.o.add(viewHolder);
             viewProperty.alpha(0x3f800000).scaleY(0x3f800000).scaleX(0x3f800000).setDuration(tc.l()).setListener(new p(tc, viewHolder, itemView, viewProperty)).start();
             PatchProxy.onMethodExit(n.class, "5");
          }
       }
       this.b.clear();
       this.c.l.remove(this.b);
       PatchProxy.onMethodExit(n$c.class, "1");
       return;
    }
}
