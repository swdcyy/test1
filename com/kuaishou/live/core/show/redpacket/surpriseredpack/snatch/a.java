package com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.a;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.a$a;
import java.lang.Object;
import android.view.ViewGroup;
import ki2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.util.Objects;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.g;
import android.widget.ImageView;
import android.view.animation.Animation;
import android.animation.ObjectAnimator;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.f;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder;
import android.graphics.drawable.Animatable;
import com.airbnb.lottie.LottieAnimationView;
import android.animation.AnimatorSet;

public class a	// class@000fb2
{
    public g a;
    public f b;
    public int c;
    public ViewGroup d;
    public ViewGroup e;
    public a$a f;
    public AnimatorSet g;

    public void a(a$a p0){
       super();
       this.c = 1;
       this.f = p0;
    }
    public final void a(ViewGroup p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "4")) {
          return;
       }
       p0.removeAllViews();
       p0.addView(p1.b());
       return;
    }
    public void b(){
       String str = "5";
       if (PatchProxy.applyVoid(null, this, a.class, str)) {
          return;
       }
       a ta = this.a;
       if (ta != null) {
          Objects.requireNonNull(ta);
          g og = g.class;
          if (!PatchProxy.applyVoid(null, ta, og, "4") && !PatchProxy.applyVoid(null, ta, og, "3")) {
             og = ta.g;
             if (og != null) {
                og.setVisibility(8);
             }
             og = ta.i;
             if (og != null) {
                og.cancel();
                ta.i = null;
             }
             og = ta.j;
             if (og != null) {
                og.cancel();
                ta.j = null;
             }
          }
       }
       ta = this.b;
       if (ta != null) {
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, f.class, str)) {
             ta.o.f();
             f i = ta.i;
             if (i != null) {
                i.stop();
                ta.i = null;
             }
             i = ta.k;
             if (i != null) {
                i.f();
                ta.k = null;
             }
             i = ta.j;
             if (i != null && i.isRunning()) {
                ta.j.cancel();
                ta.j = null;
             }
          }
       }
       ta = this.g;
       if (ta != null) {
          ta.cancel();
          this.g = null;
       }
       return;
    }
}
