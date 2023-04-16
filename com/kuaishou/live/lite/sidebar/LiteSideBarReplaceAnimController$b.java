package com.kuaishou.live.lite.sidebar.LiteSideBarReplaceAnimController$b;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.lite.sidebar.LiteSideBarReplaceAnimController;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.view.View;
import java.util.List;
import com.kuaishou.live.lite.sidebar.e$a;
import msd.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.lite.sidebar.e$b;

public final class LiteSideBarReplaceAnimController$b extends AnimatorListenerAdapter	// class@000b2b
{
    public final LiteSideBarReplaceAnimController a;
    public final ViewGroup b;
    public final FrameLayout c;
    public final View d;
    public final View e;
    public final List f;
    public final e$a g;
    public final e$a h;
    public final a i;

    public void LiteSideBarReplaceAnimController$b(LiteSideBarReplaceAnimController p0,ViewGroup p1,FrameLayout p2,View p3,View p4,List p5,e$a p6,e$a p7,a p8){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiteSideBarReplaceAnimController$b.class, "1")) {
          return;
       }
       LiteSideBarReplaceAnimController$b ta = this.a;
       LiteSideBarReplaceAnimController$b tb = this.b;
       LiteSideBarReplaceAnimController$b tc = this.c;
       LiteSideBarReplaceAnimController$b td = this.d;
       LiteSideBarReplaceAnimController$b te = this.e;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidFourRefs(tb, tc, td, te, ta, LiteSideBarReplaceAnimController.class, "3")) {
          tc.removeView(td);
          tc.removeView(te);
          int i = tb.indexOfChild(tc);
          tb.removeViewAt(i);
          tb.addView(te, i);
       }
       Iterator iterator = this.f.iterator();
       while (iterator.hasNext()) {
          iterator.next().invoke();
       }
       this.g.h();
       this.h.h();
       this.i.invoke();
       return;
    }
}
