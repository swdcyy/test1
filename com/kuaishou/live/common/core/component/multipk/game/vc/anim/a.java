package com.kuaishou.live.common.core.component.multipk.game.vc.anim.a;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.common.core.component.multipk.game.vc.anim.a$a;
import nsd.u;
import android.view.ViewGroup;
import kt1.h;
import ht1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import ekd.m1;
import com.kuaishou.live.common.core.component.multipk.game.vc.anim.LiveMultiPkGameWithBottomAreaAnimView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.multipk.game.vc.anim.a$b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import msd.a;
import java.lang.Integer;
import qrd.l1;
import pu1.k;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.animation.AnimatorSet;
import android.widget.TextView;
import java.lang.CharSequence;
import crd.b;
import lnc.b9;

public final class a extends ViewController	// class@0015f8
{
    public final LiveMultiPkGameWithBottomAreaAnimView j;
    public int k;
    public final Object l;
    public AnimatorSet m;
    public b n;
    public final h o;
    public final a p;
    public static final a$a q;

    static {
       a.q = new a$a(null);
    }
    public void a(ViewGroup p0,h p1,a p2){
       a.p(p0, "containerView");
       a.p(p1, "gameAnimViewModel");
       a.p(p2, "skinManager");
       super();
       this.o = p1;
       this.p = p2;
       View view = m1.f(p0, R.id.live_multi_game_anim_with_bottom_area_view);
       a.o(view, "ViewBindUtils.bindWidget¡­with_bottom_area_view\n  \)");
       this.j = view;
       this.l = new Object();
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.o.b.observe(this, new a$b(this));
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.W2(8);
       this.X2();
       return;
    }
    public final void V2(int p0,a p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "10")) {
          return;
       }
       p0 = p0 | this.k;
       this.k = p0;
       if (p0 == 7 && p1 != null) {
          p1.invoke();
       }
       return;
    }
    public final void W2(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "5")) {
          return;
       }
       this.j.setVisibility(p0);
       return;
    }
    public final void X2(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.k = 7;
       k b = k.b;
       b.g(this.j.getMainAnimView(), this.l);
       b.g(this.j.getBottomLeftTopIconView(), this.l);
       a tm = this.m;
       if (tm != null && (tm != null && tm.isRunning() == true)) {
          tm = this.m;
          if (tm != null) {
             tm.end();
          }
       }
       this.j.getBottomTextView().setText("");
       this.j.getBottomTextView().setAlpha(0x3f800000);
       b9.a(this.n);
       return;
    }
}
