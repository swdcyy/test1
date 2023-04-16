package com.kwai.nearby.local.delegate.ActivityLocalDelegate;
import com.kwai.nearby.local.delegate.HomeLocalDelegateInterface;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import id7.e;
import hd7.e;
import krb.a;
import com.kwai.feature.api.social.nearby.LocalDelegateType;
import tw5.d;
import com.yxcorp.gifshow.local.sub.entrance.sizer.sizermanager.LocalSizerDataProvider;
import g2b.a;
import com.yxcorp.gifshow.local.sub.entrance.function.panel.manager.NearbyFunctionPanelProvider;
import z1b.a;
import vc7.d0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dd7.g1;
import uh5.e;
import dd7.k0;
import com.kwai.nearby.local.presenter.e;
import com.kwai.nearby.local.presenter.f;
import com.kwai.nearby.local.presenter.q;
import com.kwai.nearby.local.presenter.o;
import com.kwai.nearby.local.HomeLocalFragment;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.HomeItemRecoRealShowPresenter;
import com.kwai.nearby.local.presenter.t;
import yc7.a;
import z1.a;
import fm7.d;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper;
import dd7.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.i;
import wh5.c;
import com.kwai.nearby.local.presenter.secondary.b;
import com.kwai.nearby.local.presenter.a;
import dd7.i1;
import com.kwai.nearby.local.presenter.HomeLocalPermissionChangePresenter;
import dd7.l0;
import com.kwai.nearby.local.presenter.v;
import yc7.c;
import sc7.b0;
import jb5.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import java.lang.System;
import bsb.a;
import android.view.View;

public class ActivityLocalDelegate implements HomeLocalDelegateInterface	// class@000f85
{
    public HomeLocalFragment mFragment;
    public CityInfo mLastCityInfo;
    public e mTabCallerContext;
    public static final long serialVersionUID = 0x8af4781494417ca9;

    public void ActivityLocalDelegate(){
       super();
    }
    public final String a(String p0){
       ActivityLocalDelegate obj = PatchProxy.applyOneRefs(p0, this, ActivityLocalDelegate.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mFragment;
       if (obj != null && obj.getArguments() != null) {
          return this.mFragment.getArguments().getString(p0);
       }
       return null;
    }
    public e buildTabCallerContext(){
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, this, ActivityLocalDelegate.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new e(objArray, this.a("fromSourceData"));
       this.mTabCallerContext = obj;
       LocalDelegateType aCTIVITY_LOC = LocalDelegateType.ACTIVITY_LOCAL;
       obj.e = a.b().a(aCTIVITY_LOC);
       this.mTabCallerContext.i = a.a(aCTIVITY_LOC);
       this.mTabCallerContext.m = a.a(aCTIVITY_LOC);
       this.mTabCallerContext.c = new d0();
       return this.mTabCallerContext;
    }
    public void createItemPresenterExtra(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ActivityLocalDelegate.class, "2")) {
          return;
       }
       p0.U7(new g1());
       if (e.f()) {
          p0.U7(new k0());
       }
       p0.U7(new e(true));
       p0.U7(new f());
       p0.U7(new q());
       p0.U7(new o(this.mFragment));
       p0.U7(new HomeItemRecoRealShowPresenter());
       p0.U7(new t());
       p0.U7(d.b(new a(this)));
       if (LocalConfigKeyHelper.a()) {
          p0.U7(new c(this.mFragment));
       }
       p0.U7(new i(c.b(), "n"));
       p0.U7(new b(this.a("fromSource")));
       PatchProxy.onMethodExit(ActivityLocalDelegate.class, "2");
       return;
    }
    public void createLazyPresenterExtra(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ActivityLocalDelegate.class, "3")) {
          return;
       }
       p0.U7(new a(this.mFragment));
       p0.U7(new i1());
       p0.U7(new HomeLocalPermissionChangePresenter());
       p0.U7(new l0());
       p0.U7(new v());
       PatchProxy.onMethodExit(ActivityLocalDelegate.class, "3");
       return;
    }
    public void createPreLoadPresenter(PresenterV2 p0){
       c.a(this, p0);
    }
    public LocalDelegateType getType(){
       return LocalDelegateType.ACTIVITY_LOCAL;
    }
    public void handlePageListExtra(b0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityLocalDelegate.class, "4")) {
          return;
       }
       p0.M = true;
       p0.T2(false);
       String str = this.a("cityName");
       String str1 = this.a("cityId");
       p0.L = this.a("fromSourceData");
       if (!TextUtils.x(str)) {
          CityInfo uCityInfo = new CityInfo(str);
          uCityInfo.mRoamCityId = str1;
          this.mTabCallerContext.e.b(uCityInfo);
          p0.b3(uCityInfo);
          d.g(this.mTabCallerContext.e.getTypeValue(), System.currentTimeMillis());
       }else {
          this.mTabCallerContext.e.b(a.b());
       }
       return;
    }
    public void initHeaderView(View p0){
    }
    public void setOwner(HomeLocalFragment p0){
       this.mFragment = p0;
    }
}
