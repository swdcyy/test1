package com.yxcorp.gifshow.growth.home.pymk.widget.a$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.growth.home.pymk.widget.a;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import com.yxcorp.gifshow.growth.home.pymk.widget.a$d;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewPropertyAnimator;
import android.view.View;
import com.yxcorp.gifshow.growth.home.pymk.widget.b;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.growth.home.pymk.widget.c;

public class a$b implements Runnable	// class@0013ac
{
    public final ArrayList b;
    public final a c;

    public void a$b(a p0,ArrayList p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       a$d a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$b.class, "1")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          a$d uod = iterator.next();
          a$b tc = this.c;
          Objects.requireNonNull(tc);
          if (PatchProxy.applyVoidOneRefs(uod, tc, a.class, "9")) {
             continue ;
          }else {
             a = uod.a;
             Object[] objArray1 = (a == null)? objArray: a.itemView;
             a$d b = uod.b;
             RecyclerView$ViewHolder itemView = (b != null)? b.itemView: objArray;
             float f = 0;
             if (objArray1 != null) {
                ViewPropertyAnimator viewProperty = objArray1.animate().setDuration(tc.m());
                tc.r.add(uod.a);
                int i = uod.e - uod.c;
                viewProperty.translationX((float)i);
                i = uod.f - uod.d;
                viewProperty.translationY((float)i);
                viewProperty.alpha(f).setListener(new b(tc, uod, viewProperty, objArray1)).start();
             }
             if (itemView != null) {
                ViewPropertyAnimator viewProperty1 = itemView.animate();
                tc.r.add(uod.b);
                viewProperty1.translationX(f).translationY(f).setDuration(tc.m()).alpha(0x3f800000).setListener(new c(tc, uod, viewProperty1, itemView)).start();
             }
          }
       }
       this.b.clear();
       this.c.n.remove(this.b);
       return;
    }
}
