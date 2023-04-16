package com.yxcorp.gifshow.featured.detail.featured.presenter.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.IconifyImageButton;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import zda.y;
import erd.g;
import crd.b;
import eda.l;
import zda.x;
import ekd.i;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.view.ViewGroup$MarginLayoutParams;
import android.app.Activity;
import android.content.Context;
import com.yxcorp.utility.n;
import com.kwai.framework.model.user.QCurrentUser;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.homepage.experiment.HomeTabBarIconExperimentUtils;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.yxcorp.gifshow.image.KwaiImageView;
import zda.w;
import android.view.View$OnClickListener;
import io.reactivex.subjects.PublishSubject;

public class i extends PresenterV2	// class@000f78
{
    public IconifyImageButton p;
    public PublishSubject q;
    public Drawable r;

    public void i(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i.class, "4")) {
          return;
       }
       this.P8();
       this.p.setDotDrawable(R.drawable.arg_RES_7f081988);
       this.R8();
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.X7(f.g(n.class, mAIN).subscribe(new y(this)));
       this.X7(f.g(l.class, mAIN).subscribe(new x(this)));
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, i.class, "5")) {
          return;
       }
       if (i.c()) {
          ViewGroup$MarginLayoutParams layoutParams = this.p.getLayoutParams();
          Activity uActivity = null;
          if (this.getActivity() != null) {
             uActivity = n.A(this.getActivity());
          }
          layoutParams.topMargin = layoutParams.topMargin + uActivity;
          this.p.setLayoutParams(layoutParams);
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, i.class, "8")) {
          return;
       }
       if (!QCurrentUser.ME.isLogined()) {
          this.p.setVisibility(8);
       }else {
          this.p.setVisibility(0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       IconifyImageButton iconifyImage = m1.f(p0, R.id.featured_left_hamburger);
       this.p = iconifyImage;
       iconifyImage.setImageDrawable(a1.f(HomeTabBarIconExperimentUtils.c()));
       this.p.setOnClickListener(new w(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.q = this.r8("LONG_ATLAS_OPEN_STATE_CHANGE_OBSERVABLE");
       return;
    }
}
