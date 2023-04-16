package com.yxcorp.gifshow.home.block.topbar.actionbar.element.HomeBlockBackgroundViewElement;
import yra.a;
import com.yxcorp.gifshow.home.block.topbar.actionbar.element.HomeBlockBackgroundViewElement$backgroundSwitchView$2;
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
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gsa.e0;

public final class HomeBlockBackgroundViewElement extends a	// class@00164f
{
    public final p m;

    public void HomeBlockBackgroundViewElement(){
       super();
       this.m = s.c(new HomeBlockBackgroundViewElement$backgroundSwitchView$2(this));
    }
    public View c(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HomeBlockBackgroundViewElement.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "container");
       ViewGroup$LayoutParams layoutParams = new ViewGroup$LayoutParams(-1, -1);
       return new View(p0.getContext());
    }
    public void u(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, HomeBlockBackgroundViewElement.class, "4")) {
          return;
       }
       a.p(p0, "rootPresenter");
       PatchProxy.onMethodExit(HomeBlockBackgroundViewElement.class, "4");
       return;
    }
    public void v(e0 p0){
       HomeBlockBackgroundViewElement homeBlockBac = HomeBlockBackgroundViewElement.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, homeBlockBac, "3")) {
          return;
       }
       a.p(p0, "homeTabBarViewInfo");
       View view = PatchProxy.apply(null, this, homeBlockBac, "1");
       if (view == PatchProxyResult.class) {
          view = this.m.getValue();
       }
       view.setBackgroundColor(p0.k);
       return;
    }
}
