package com.yxcorp.gifshow.homepage.presenter.HomeLogoutSwitchAndRefreshPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ko5.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.homepage.presenter.HomeLogoutSwitchAndRefreshPresenter$onBind$1;
import yta.g0;
import msd.l;
import erd.g;
import crd.b;
import io.reactivex.subjects.PublishSubject;

public final class HomeLogoutSwitchAndRefreshPresenter extends PresenterV2	// class@001790
{
    public PublishSubject p;
    public final b q;

    public void HomeLogoutSwitchAndRefreshPresenter(b p0){
       a.p(p0, "mTabManager");
       super();
       this.q = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, HomeLogoutSwitchAndRefreshPresenter.class, "2")) {
          return;
       }
       this.X7(RxBus.f.f(n.class).observeOn(d.a).subscribe(new g0(new HomeLogoutSwitchAndRefreshPresenter$onBind$1(this))));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, HomeLogoutSwitchAndRefreshPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("SWITCH_TAB_OBSERVER");
       return;
    }
}
