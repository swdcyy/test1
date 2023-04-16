package e1a.c$b;
import android.animation.AnimatorListenerAdapter;
import th0.n;
import e1a.c;
import android.view.View;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import java.lang.NullPointerException;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import android.view.animation.Interpolator;

public final class c$b extends AnimatorListenerAdapter	// class@002042
{
    public final n a;
    public final c b;
    public final View c;
    public final Ref$BooleanRef d;
    public final View e;
    public final int f;
    public final View g;
    public final Ref$FloatRef h;

    public void c$b(n p0,c p1,View p2,Ref$BooleanRef p3,View p4,int p5,View p6,Ref$FloatRef p7){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       super();
    }
    public void onAnimationEnd(Animator p0){
       View view;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c$b.class, "2")) {
          return;
       }
       if (this.d.element != null) {
          c$b tc = this.c;
          a.o(tc, "atlasContainer");
          ViewGroup$LayoutParams layoutParams = tc.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.bottomMargin = a1.d(0x7f07031f);
             tc.setLayoutParams(layoutParams);
          }else {
             PatchProxy.onMethodExit(c$b.class, "2");
             throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          }
       }
       view = this.g.findViewById(R.id.photo_detail_bottom_comment_panel_container);
       a.o(view, "bottomBarContainer");
       view.setBackground(null);
       PatchProxy.onMethodExit(c$b.class, "2");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c$b.class, "1")) {
          return;
       }
       c$b tb = this.b;
       if (tb.b == null) {
          tb.b = true;
          if (this.d.element == null) {
             RecyclerView recyclerView = this.g.findViewById(R.id.recycler_view);
             if (recyclerView != null) {
                recyclerView.smoothScrollBy(0, (int)this.h.element, this.a, (int)400);
             }
          }
       }
       PatchProxy.onMethodExit(c$b.class, "1");
       return;
    }
}
