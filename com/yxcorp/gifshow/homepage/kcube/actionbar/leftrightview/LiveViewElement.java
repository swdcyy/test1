package com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.LiveViewElement;
import qsa.i;
import com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.LiveViewElement$liveView$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.ImageView;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import o56.a;
import java.lang.CharSequence;
import android.widget.ImageView$ScaleType;
import com.yxcorp.gifshow.homepage.experiment.HomeTabBarIconExperimentUtils;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import tkd.b;
import tkd.d;
import ayb.g;
import wq6.f;
import mr6.b;
import gsa.e0;

public final class LiveViewElement extends i	// class@0016f5
{
    public final p n;

    public void LiveViewElement(){
       super();
       this.n = s.c(new LiveViewElement$liveView$2(this));
    }
    public View c(ViewGroup p0){
       ImageView imageView = PatchProxy.applyOneRefs(p0, this, LiveViewElement.class, "2");
       if (imageView != PatchProxyResult.class) {
       }else {
          a.p(p0, "container");
          imageView = new ImageView(p0.getContext());
          imageView.setId(R.id.live_btn);
          imageView.setLayoutParams(new ViewGroup$LayoutParams(a1.d(R.dimen.arg_RES_7f07030d), a1.d(R.dimen.arg_RES_7f07030d)));
          if (a.d()) {
             imageView.setContentDescription(a1.p(R.string.arg_RES_7f101ce3));
          }
          imageView.setScaleType(ImageView$ScaleType.FIT_CENTER);
          imageView.setImageResource(HomeTabBarIconExperimentUtils.d(false));
       }
       return imageView;
    }
    public void u(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveViewElement.class, "4")) {
          return;
       }
       a.p(p0, "rootPresenter");
       p0.U7(d.a(-908290672).jd(this.f()));
       PatchProxy.onMethodExit(LiveViewElement.class, "4");
       return;
    }
    public void v(e0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveViewElement.class, "3")) {
          return;
       }
       a.p(p0, "homeTabBarViewInfo");
       this.w().setAlpha(p0.W);
       if (p0.E == null) {
          this.w().setImageResource(R.drawable.arg_RES_7f080ac1);
       }else {
          this.w().setImageResource(HomeTabBarIconExperimentUtils.d(false));
       }
       return;
    }
    public final ImageView w(){
       Object obj = PatchProxy.apply(null, this, LiveViewElement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n.getValue();
    }
}
