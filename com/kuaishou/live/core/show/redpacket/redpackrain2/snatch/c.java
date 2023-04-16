package com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.c;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.c$b;
import java.lang.Object;
import jh2.m;
import android.view.ViewGroup;
import th2.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.util.Objects;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.i;
import com.kuaishou.live.core.show.redpacket.redpackrain2.widget.LiveRedPackRainSnatchView;
import android.widget.ImageView;
import android.view.animation.Animation;
import crd.b;
import lnc.b9;
import android.animation.ObjectAnimator;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.e;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder;
import android.animation.AnimatorSet;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.k;
import android.animation.Animator;
import android.media.SoundPool;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.c$a;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import th2.q;
import android.animation.AnimatorListenerAdapter;
import android.animation.Animator$AnimatorListener;

public class c	// class@000f21
{
    public i a;
    public e b;
    public k c;
    public int d;
    public ViewGroup e;
    public ViewGroup f;
    public c$b g;
    public AnimatorSet h;
    public m i;

    public void c(c$b p0){
       super();
       this.d = 0;
       this.i = new m();
       this.g = p0;
    }
    public final void a(ViewGroup p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "6")) {
          return;
       }
       p0.removeAllViews();
       p0.addView(p1.b());
       return;
    }
    public void b(){
       i i;
       if (PatchProxy.applyVoid(null, this, c.class, "7")) {
          return;
       }
       c ta = this.a;
       if (ta != null) {
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, i.class, "4")) {
             i = ta.i;
             if (i != null && !PatchProxy.applyVoid(null, i, LiveRedPackRainSnatchView.class, "18")) {
                i.b();
                if (!PatchProxy.applyVoid(null, i, LiveRedPackRainSnatchView.class, "16")) {
                   i.g.setVisibility(8);
                   LiveRedPackRainSnatchView j = i.j;
                   if (j != null) {
                      j.cancel();
                   }
                   i.j = null;
                }
             }
             b9.a(ta.l);
             i = ta.m;
             if (i != null && i.isRunning()) {
                ta.m.cancel();
                ta.m = null;
             }
          }
       }
       ta = this.b;
       if (ta != null) {
          Objects.requireNonNull(ta);
          e uoe = e.class;
          if (!PatchProxy.applyVoid(null, ta, uoe, "24")) {
             ta.c.f();
             e s = ta.s;
             if (s != null) {
                s.dispose();
                ta.s = null;
             }
             if (!PatchProxy.applyVoid(null, ta, uoe, "26")) {
                uoe = ta.t;
                if (uoe != null && uoe.isRunning()) {
                   ta.t.cancel();
                   ta.t = null;
                }
             }
          }
       }
    label_009b :
       ta = this.c;
       if (ta != null) {
          ta.c();
       }
       ta = this.h;
       if (ta != null) {
          ta.cancel();
          this.h = null;
       }
       ta = this.i;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, m.class, "3")) {
          m f = ta.f;
          if (f != null) {
             f.cancel();
          }
          f = ta.g;
          if (f != null) {
             f.release();
          }
          ta.g = null;
       }
       return;
    }
    public void c(){
       i c;
       String str = "5";
       if (PatchProxy.applyVoid(null, this, c.class, str)) {
          return;
       }
       int i = 0;
       this.f.setVisibility(i);
       this.a(this.f, this.b);
       c ta = this.a;
       c$a uoa = new c$a(this);
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(uoa, ta, i.class, str)) {
          if (!ta.c.getMeasuredHeight()) {
             ta.c.measure(i, i);
          }
          int[] ointArray = new int[2];
          ta.c.getLocationOnScreen(ointArray);
          c = ta.c;
          float[] uofloatArray = new float[]{c.getTranslationY(),(float)((- ta.c.getMeasuredHeight()) - ointArray[1])};
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(c, View.TRANSLATION_Y, uofloatArray);
          ta.m = objectAnimat;
          objectAnimat.setDuration(250);
          ta.m.setInterpolator(new AccelerateDecelerateInterpolator());
          ta.m.addListener(new q(ta, uoa));
          ta.m.start();
          ta.e.setVisibility(8);
       }
       return;
    }
}
