package com.yxcorp.gifshow.growth.home.pymk.widget.a$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.growth.home.pymk.widget.a;
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
import wna.d;
import android.animation.Animator$AnimatorListener;

public class a$c implements Runnable	// class@0013ad
{
    public final ArrayList b;
    public final a c;

    public void a$c(a p0,ArrayList p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$c.class, "1")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          RecyclerView$ViewHolder viewHolder = iterator.next();
          a$c tc = this.c;
          Objects.requireNonNull(tc);
          if (PatchProxy.applyVoidOneRefs(viewHolder, tc, a.class, "5")) {
             continue ;
          }else {
             RecyclerView$ViewHolder itemView = viewHolder.itemView;
             ViewPropertyAnimator viewProperty = itemView.animate();
             tc.o.add(viewHolder);
             viewProperty.alpha(0x3f000000).setDuration(500).setListener(new d(tc, viewHolder, itemView, viewProperty)).start();
          }
       }
       this.b.clear();
       this.c.l.remove(this.b);
       return;
    }
}
