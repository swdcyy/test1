package com.yxcorp.gifshow.homepage.kcube.actionbar.bottom.element.BottomBackgroundElement;
import ssa.b;
import com.yxcorp.gifshow.homepage.kcube.actionbar.bottom.element.BottomBackgroundElement$backgroundSwitchView$2;
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
import kotlin.jvm.internal.a;
import com.kwai.feature.api.feed.home.wrapper.kcube.widget.ImageSwitchView;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import sn5.a;
import pua.a;

public final class BottomBackgroundElement extends b	// class@0016ef
{
    public final p m;

    public void BottomBackgroundElement(){
       super();
       this.m = s.c(new BottomBackgroundElement$backgroundSwitchView$2(this));
    }
    public View c(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BottomBackgroundElement.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "container");
       ViewGroup$LayoutParams layoutParams = new ViewGroup$LayoutParams(-1, -1);
       return new ImageSwitchView(p0.getContext());
    }
    public void u(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, BottomBackgroundElement.class, "3")) {
          return;
       }
       a.p(p0, "rootPresenter");
       PatchProxy.onMethodExit(BottomBackgroundElement.class, "3");
       return;
    }
    public void v(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomBackgroundElement.class, "2")) {
          return;
       }
       a.p(p0, "bottomBarScheme");
       this.w().setBackgroundColor(p0.a);
       ImageSwitchView imageSwitchV = this.w();
       a q = p0.q;
       if (q == null) {
          q = p0.p;
       }
       imageSwitchV.setLeftBackground(q);
       imageSwitchV = this.w();
       q = p0.r;
       if (q == null) {
          q = p0.p;
       }
       imageSwitchV.setRightBackground(q);
       this.w().setProgress(p0.B);
       return;
    }
    public final ImageSwitchView w(){
       Object obj = PatchProxy.apply(null, this, BottomBackgroundElement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m.getValue();
    }
}
