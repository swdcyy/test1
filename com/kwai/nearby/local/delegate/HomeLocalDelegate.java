package com.kwai.nearby.local.delegate.HomeLocalDelegate;
import com.kwai.nearby.local.delegate.HomeLocalDelegateInterface;
import java.lang.Object;
import id7.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import hd7.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper;
import com.yxcorp.utility.SystemUtil;
import com.kwai.nearby.local.presenter.LocalDebugPresenter;
import dd7.b;
import dd7.g1;
import uh5.e;
import dd7.k0;
import com.kwai.nearby.local.HomeLocalFragment;
import com.kwai.nearby.local.presenter.e;
import com.kwai.nearby.local.presenter.o;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.HomeItemRecoRealShowPresenter;
import com.kwai.nearby.local.presenter.t;
import yc7.b;
import z1.a;
import fm7.d;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import as6.a;
import cb5.c0;
import dd7.s0;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.i;
import wh5.c;
import com.kwai.nearby.local.presenter.a;
import dd7.i1;
import com.kwai.nearby.local.presenter.HomeLocalPermissionChangePresenter;
import dd7.l0;
import dd7.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import dd7.x0;
import com.kwai.nearby.local.presenter.w;
import com.kwai.nearby.local.presenter.v;
import com.kwai.nearby.local.tab.present.b;
import com.kwai.nearby.local.presenter.f;
import com.kwai.feature.api.social.nearby.LocalDelegateType;
import sc7.b0;
import android.view.View;

public class HomeLocalDelegate implements HomeLocalDelegateInterface	// class@000f86
{
    public HomeLocalFragment mFragment;
    public CityInfo mLastCityInfo;
    public e mTabCallerContext;

    public void HomeLocalDelegate(){
       super();
    }
    public e buildTabCallerContext(){
       e obj = PatchProxy.apply(null, this, HomeLocalDelegate.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.c(this.mFragment.getActivity());
       this.mTabCallerContext = obj;
       return obj;
    }
    public void createItemPresenterExtra(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, HomeLocalDelegate.class, "2")) {
          return;
       }
       if (LocalConfigKeyHelper.l()) {
          if (SystemUtil.I()) {
             p0.U7(new LocalDebugPresenter());
          }
          p0.U7(new b());
       }
       p0.U7(new g1());
       if (e.f()) {
          p0.U7(new k0());
       }
       if (!this.mFragment.ci()) {
          p0.U7(new e());
       }
       p0.U7(new o(this.mFragment));
       p0.U7(new HomeItemRecoRealShowPresenter());
       p0.U7(new t());
       p0.U7(d.b(new b(this)));
       if (!this.mFragment.ci()) {
          if (a.n(this.mFragment, b.z)) {
             p0.U7(new c0(this.mFragment, 0));
          }else {
             p0.U7(new c0(this.mFragment));
          }
          p0.U7(new s0());
       }
       p0.U7(new i(c.b(), "n"));
       PatchProxy.onMethodExit(HomeLocalDelegate.class, "2");
       return;
    }
    public void createLazyPresenterExtra(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, HomeLocalDelegate.class, "3")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefsWithListener(p0, this, HomeLocalDelegate.class, "4")) {
          if (!this.mFragment.ci()) {
             p0.U7(new a(this.mFragment));
          }
          p0.U7(new i1());
          p0.U7(new HomeLocalPermissionChangePresenter());
          p0.U7(new l0());
          if (LocalConfigKeyHelper.a()) {
             p0.U7(new c(this.mFragment));
          }
          p0.U7(new x0());
          p0.U7(new w(this.mFragment));
          p0.U7(new v());
          p0.U7(new b());
          p0.U7(new f());
          PatchProxy.onMethodExit(HomeLocalDelegate.class, "4");
       }
       PatchProxy.onMethodExit(HomeLocalDelegate.class, "3");
       return;
    }
    public void createPreLoadPresenter(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, HomeLocalDelegate.class, "5")) {
          return;
       }
       p0.U7(new e());
       if (a.n(this.mFragment, b.z)) {
          p0.U7(new c0(this.mFragment, 0));
       }else {
          p0.U7(new c0(this.mFragment));
       }
       p0.U7(new s0());
       p0.U7(new a(this.mFragment));
       PatchProxy.onMethodExit(HomeLocalDelegate.class, "5");
       return;
    }
    public LocalDelegateType getType(){
       return LocalDelegateType.HOME_LOCAL;
    }
    public void handlePageListExtra(b0 p0){
    }
    public void initHeaderView(View p0){
    }
    public void setOwner(HomeLocalFragment p0){
       this.mFragment = p0;
    }
}
