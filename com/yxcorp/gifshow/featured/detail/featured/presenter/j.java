package com.yxcorp.gifshow.featured.detail.featured.presenter.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import ekd.i;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import android.view.ViewGroup$MarginLayoutParams;
import android.app.Activity;
import android.content.Context;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import zda.c0;
import erd.g;
import crd.b;
import eda.l;
import zda.b0;
import lda.b0;
import zda.a0;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import wh5.c;
import xa5.a;
import android.animation.Animator;
import java.util.Set;
import android.view.View;
import ekd.m1;
import android.graphics.drawable.Drawable;
import lnc.a1;
import zda.z;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class j extends PresenterV2	// class@000f79
{
    public TextView p;
    public final long q;
    public final float r;
    public final float s;
    public AnimatorSet t;
    public Set u;
    public BaseFragment v;
    public SlidePlayViewModel w;

    public void j(){
       super();
       this.q = 500;
       this.r = 0x3f800000;
       this.s = 0x3f666666;
       this.u = new HashSet();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       this.w = SlidePlayViewModel.B0(this.v);
       if (i.c()) {
          ViewGroup$MarginLayoutParams layoutParams = this.p.getLayoutParams();
          Activity uActivity = null;
          if (this.getActivity() != null) {
             uActivity = n.A(this.getActivity());
          }
          layoutParams.topMargin = layoutParams.topMargin + uActivity;
          this.p.setLayoutParams(layoutParams);
       }
       this.u = new HashSet();
       this.R8();
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.X7(f.g(n.class, mAIN).subscribe(new c0(this)));
       t ot = f.g(l.class, mAIN);
       this.X7(ot.subscribe(new b0(this)));
       this.X7(f.f(b0.class).subscribe(new a0(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, j.class, "8")) {
          return;
       }
       j tt = this.t;
       if (tt != null) {
          tt.cancel();
          this.t.removeAllListeners();
          this.t = null;
       }
       return;
    }
    public final ObjectAnimator P8(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.p, p0, new float[3]{0x3f800000,0x3f666666,0x3f800000});
       objectAnimat.setRepeatCount(-1);
       objectAnimat.setRepeatMode(2);
       return objectAnimat;
    }
    public final void R8(){
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "6")) {
          return;
       }
       if (!QCurrentUser.ME.isLogined() && (!c.p() && !a.h(this.v))) {
          this.p.setVisibility(0);
          if (!PatchProxy.applyVoid(objArray, this, oj, "9")) {
             this.t = new AnimatorSet();
             Animator[] uAnimatorArr = new Animator[]{this.P8("scaleX"),this.P8("scaleY")};
             this.t.playTogether(uAnimatorArr);
             this.t.setDuration(1000);
             this.t.start();
          }
       }else {
          this.p.setVisibility(8);
          oj = this.t;
          if (oj != null) {
             oj.cancel();
             this.t.removeAllListeners();
             this.t = objArray;
          }
       }
       this.u.clear();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       TextView textView = m1.f(p0, R.id.featured_left_login);
       this.p = textView;
       textView.setBackgroundDrawable(a1.f(R.drawable.arg_RES_7f08198c));
       this.p.setOnClickListener(new z(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.v = this.r8("FRAGMENT");
       return;
    }
}
