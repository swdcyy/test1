package com.kuaishou.commercial.splash.playable.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ez.p;
import android.view.View;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bz.c;
import io.reactivex.subjects.PublishSubject;
import android.view.animation.ScaleAnimation;
import android.view.animation.AlphaAnimation;
import ez.s;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import im8.f;
import ez.m;
import tkd.b;
import tkd.d;
import nl9.h0;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.SplashInfo;
import tw.l;
import com.kuaishou.android.model.ads.SplashInfo$SplashPlayableInfo;
import com.kuaishou.android.model.ads.SplashInfo$PlayablePopupInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.graphics.drawable.PaintDrawable;
import lnc.a1;
import g59.p;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import com.kuaishou.commercial.splash.playable.a;
import android.view.View$OnClickListener;
import ez.o;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import ez.q;
import com.kuaishou.commercial.splash.playable.b;
import erd.g;
import crd.b;
import brd.t;
import ekd.m1;

public class c extends PresenterV2	// class@0015bb
{
    public BaseFeed p;
    public TextView q;
    public FrameLayout r;
    public ViewGroup s;
    public View t;
    public PublishSubject u;
    public f v;
    public boolean w;
    public SplashInfo$PlayablePopupInfo x;
    public final a y;

    public void c(){
       super();
       this.y = new p(this);
    }
    public static void P8(c p0,View p1){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(p1, p0, c.class, "7")) {
       }else if(p0.w != null){
          p0.w = true;
          int i = 2;
          if (p1 == p0.s) {
             p0.u.onNext(new c(i, 3));
          }else {
             p0.u.onNext(new c(i, i));
          }
          ScaleAnimation scaleAnimati = new ScaleAnimation(0x3f800000, 0.10f, 0x3f800000, 0.10f, 1, 0x3f000000, 1, 0x3f000000);
          v0.setDuration(300);
          AlphaAnimation uAlphaAnimat = new AlphaAnimation(0x3f800000, 0);
          uAlphaAnimat.setDuration(300);
          v0.setAnimationListener(new s(p0));
          p0.r.startAnimation(v0);
          p0.s.startAnimation(uAlphaAnimat);
          if (p1 == p0.s) {
             c v = p0.v;
             if (v != null && v.get() != null) {
                p0.v.get().d();
             }
          }
       }
       return;
    }
    public void E8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       if (!d.a(-536296199).bY(this.p)) {
          return;
       }
       SplashInfo splashInfo = l.e(this.p);
       if (l.i(splashInfo)) {
          return;
       }
       SplashInfo$SplashPlayableInfo mPlayablePop = splashInfo.mPlayableInfo.mPlayablePopupInfo;
       this.x = mPlayablePop;
       SplashInfo$PlayablePopupInfo mPopupMateri = mPlayablePop.mPopupMaterialType;
       int i = 1;
       if (mPopupMateri != i && mPopupMateri != 2) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "5")) {
          if (TextUtils.x(this.x.mButtonTitle)) {
             this.q.setVisibility(8);
          }else {
             this.q.setText(this.x.mButtonTitle);
             if (!PatchProxy.applyVoid(objArray, this, uoc, "6")) {
                PaintDrawable paintDrawabl = new PaintDrawable(p.b(this.x.mButtonColorHex, a1.a(0x7f0600e8)));
                PaintDrawable paintDrawabl1 = new PaintDrawable(p.b(this.x.mButtonColorHex, a1.a(0x7f0600e8)));
                paintDrawabl.setAlpha(204);
                paintDrawabl.setCornerRadius((float)a1.e(25.00f));
                paintDrawabl1.setCornerRadius((float)a1.e(25.00f));
                StateListDrawable stateListDra = new StateListDrawable();
                int[] ointArray = new int[i];
                ointArray[0] = 0x10100a7;
                stateListDra.addState(ointArray, paintDrawabl);
                stateListDra.addState(StateSet.WILD_CARD, paintDrawabl1);
                this.q.setBackground(stateListDra);
                this.q.setTextColor(p.b(this.x.mButtonTitleColorHex, a1.a(R.color.arg_RES_7f061fd5)));
             }
             this.q.setOnClickListener(new a(this));
          }
          this.r.setClickable(false);
          this.s.setOnClickListener(new o(this));
          this.t.setOnClickListener(new o(this));
       }
       Activity activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          activity.F2(this.y);
       }
       this.X7(this.u.subscribe(new q(this, activity), b.b));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a30e7);
       this.r = m1.f(p0, 0x7f0a30ed);
       this.s = m1.f(p0, 0x7f0a3177);
       this.t = m1.f(p0, 0x7f0a30e8);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.s8(BaseFeed.class);
       this.u = this.r8("POPUP_HOLDER_VISIBLE_STATE_CHANGED");
       this.v = this.x8("PLAYABLE_LOGGER");
       return;
    }
}
