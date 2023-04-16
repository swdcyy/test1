package d5c.g0$b;
import androidx.recyclerview.widget.RecyclerView$r;
import d5c.g0;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import l17.a;
import java.util.Objects;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import android.view.View;
import android.widget.ImageView;
import com.kwai.framework.model.user.User;
import z5c.y1;
import k2b.f3;
import lnc.i3;
import k2b.e0;
import s1c.o;
import d5c.u;
import java.lang.Runnable;
import ekd.k1;
import android.widget.TextView;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.drawable.Drawable;
import zf6.j;
import android.animation.Animator;

public class g0$b extends RecyclerView$r	// class@0020f2
{
    public final g0 a;

    public void g0$b(g0 p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       g0 s;
       if (PatchProxy.isSupport(g0$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, g0$b.class, "1")) {
          return;
       }
       g0$b ta = this.a;
       ta.W0 = ta.c1.c();
       ta = this.a;
       g0 b1 = ta.b1;
       Objects.requireNonNull(ta);
       g0 og0 = g0.class;
       if (!PatchProxy.isSupport(og0) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(b1), ta, og0, "35")) {
          PagerSlidingTabStrip$d uod = ta.Y8(b1);
          if (uod != null) {
             boolean b = true;
             if (b1 == b && ta.T == null) {
                View view = uod.b();
                if (view != null) {
                   if (ta.k9()) {
                      if (ta.Y0 == null) {
                         ta.X0 = view.findViewById(0x7f0a3c8b);
                         ta.Y0 = view.findViewById(0x7f0a3c85);
                         s = ta.s;
                         String id = ta.p.getId();
                         if (!PatchProxy.applyVoidTwoRefs(s, id, null, y1.class, "139")) {
                            f3 uof3 = f3.j("BACK_TO_TOP_ITEM");
                            i3 oi3 = i3.f();
                            oi3.d("visited_uid", id);
                            uof3.m(oi3.e());
                            uof3.h(s);
                         }
                         if (!o.n()) {
                            k1.r(new u(ta), 250);
                         }
                      }
                      ta.e1 = b;
                      ta.Y0.setAlpha(0x3f800000);
                      ta.Y0.setVisibility(0);
                      s = ta.Y0;
                      if (!PatchProxy.applyVoidTwoRefs(view, s, ta, og0, "40")) {
                         view = 0x7f070295;
                         if ((((view.getMeasuredWidth() - view.findViewById(0x7f0a3caa).getMeasuredWidth()) / 2) - a1.e(2.00f)) < a1.d(view)) {
                            ConstraintLayout$LayoutParams layoutParams = s.getLayoutParams();
                            layoutParams.width = a1.d(0x7f070271);
                            layoutParams.height = a1.d(view);
                            layoutParams.leftMargin = 0;
                            s.setLayoutParams(layoutParams);
                            s.setImageDrawable(j.m(s, R.drawable.arg_RES_7f0822b5));
                         }
                      }
                   }else {
                      b1 = ta.Y0;
                      if (b1 != null && (!b1.getVisibility() && ta.e1 != null)) {
                         ta.e1 = false;
                         ta.R8().start();
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
