package jg9.f$d;
import ekd.f$j;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import jg9.t0;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictrueItem;
import msd.l;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import jg9.t0$b;
import jg9.u0;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.f;
import com.yxcorp.gifshow.camera.record.widget.RoundedImageView;
import com.yxcorp.utility.n;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class f$d extends f$j	// class@002a95
{
    public final ViewGroup a;
    public final FrameLayout b;
    public final t0 c;
    public final MultiTakePictrueItem d;
    public final l e;

    public void f$d(ViewGroup p0,FrameLayout p1,t0 p2,MultiTakePictrueItem p3,l p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$d.class, "2")) {
          return;
       }
       a.p(p0, "animation");
       this.a.removeView(this.b);
       this.c.M0().remove(this.d.c());
       f$d tc = this.c;
       f$d td = this.d;
       f$d te = this.e;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidTwoRefs(td, te, tc, t0.class, "8")) {
          a.p(td, "item");
          a.p(te, "endAction");
          int i = -1;
          int i1 = tc.e.size();
          int i2 = 0;
          while (i2 < i1) {
             if (a.g(tc.e.get(i2), td)) {
                i = i2;
                break ;
             }
             i2 = i2 + 1;
          }
          if (i >= 0) {
             RecyclerView$ViewHolder viewHolder = tc.j.findViewHolderForAdapterPosition(i);
             if (viewHolder == null || !viewHolder instanceof t0$b) {
                tc.l0(i);
             }else {
                f.F(tc.j, new u0(tc, te));
                n.Y(viewHolder.b(), 0, 0);
                n.Y(viewHolder.a(), 0, 0);
             }
          }
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$d.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       this.a.addView(this.b);
       return;
    }
}
