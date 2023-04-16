package com.kuaishou.commercial.splash.playable.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ez.s0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ez.t0;
import com.kuaishou.commercial.splash.playable.l;
import erd.g;
import crd.b;
import brd.t;
import ez.u0;
import java.lang.Runnable;
import ekd.k1;
import im8.f;
import com.kwai.framework.player.core.b;
import com.kwai.framework.player.core.b$b;
import android.view.View;
import yx.j0;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import com.kuaishou.commercial.splash.playable.m$a;
import android.animation.Animator$AnimatorListener;
import android.app.Activity;
import android.view.ViewGroup;
import io.reactivex.subjects.PublishSubject;

public class m extends PresenterV2	// class@0015c8
{
    public final b$b p;
    public ViewGroup q;
    public PublishSubject r;
    public f s;
    public f t;
    public boolean u;

    public void m(){
       super();
       this.p = new s0(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m.class, "3")) {
          return;
       }
       this.X7(this.r.subscribe(new t0(this), l.b));
       k1.r(new u0(this), 50);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, m.class, "4")) {
          return;
       }
       if (this.s.get() != null) {
          this.s.get().O(this.p);
       }
       return;
    }
    public final void P8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashFullsOnWebPres", "startAlphaAnim", objArray);
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, View.ALPHA, new float[2]{0x3f800000,0});
       objectAnimat.setDuration(500);
       objectAnimat.addListener(new m$a(this, p0));
       objectAnimat.start();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       this.q = this.getActivity().findViewById(0x7f0a3177);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.r = this.r8("POPUP_HOLDER_VISIBLE_STATE_CHANGED");
       this.s = this.x8("SPLASH_VIDEO_PLAYER");
       this.t = this.x8("PLAYABLE_LOGGER");
       return;
    }
}
