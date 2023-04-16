package com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedAutoRefreshPresenter$c;
import qvb.q;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedAutoRefreshPresenter;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import qvb.i;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.featured.detail.featured.t;
import com.yxcorp.gifshow.refresh.RefreshType;
import android.os.SystemClock;
import qvb.p;
import java.lang.Integer;
import java.lang.StringBuilder;
import lw6.a;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.concurrent.TimeUnit;
import brd.t;
import com.yxcorp.gifshow.featured.detail.featured.presenter.g;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class NasaFeaturedAutoRefreshPresenter$c implements q	// class@000f57
{
    public final NasaFeaturedAutoRefreshPresenter b;

    public void NasaFeaturedAutoRefreshPresenter$c(NasaFeaturedAutoRefreshPresenter p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(NasaFeaturedAutoRefreshPresenter$c.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, NasaFeaturedAutoRefreshPresenter$c.class, "3")) {
          return;
       }
       this.b.S8(false);
       return;
    }
    public void Z1(boolean p0,boolean p1){
       RefreshType refreshType;
       NasaFeaturedAutoRefreshPresenter$c uoc = NasaFeaturedAutoRefreshPresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoc, "1")) {
          return;
       }
       NasaFeaturedAutoRefreshPresenter$c tb = this.b;
       Objects.requireNonNull(tb);
       Object obj = PatchProxy.apply(null, tb, NasaFeaturedAutoRefreshPresenter.class, "15");
       if (obj != PatchProxyResult.class) {
          tb = obj.booleanValue();
       }else if(tb.s.X0() instanceof t){
          refreshType = tb.s.X0().u2();
          if (refreshType != RefreshType.BOTTOM_TAB_CLICK && (refreshType != RefreshType.BACK_CLICK && (refreshType != RefreshType.PULL_DOWN && (refreshType == RefreshType.TAB_CLICK || refreshType == RefreshType.FOREGROUND2)))) {
             refreshType = true;
          }
       }
       refreshType = false;
       if (tb) {
          tb.F = SystemClock.elapsedRealtime();
       }
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       NasaFeaturedAutoRefreshPresenter$c uoc = NasaFeaturedAutoRefreshPresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoc, "2")) {
          return;
       }
       NasaFeaturedAutoRefreshPresenter$c tb = this.b;
       NasaFeaturedAutoRefreshPresenter t = tb.t;
       int i = -1;
       if (t > i) {
          tb.t = i;
          Objects.requireNonNull(tb);
          NasaFeaturedAutoRefreshPresenter nasaFeatured = NasaFeaturedAutoRefreshPresenter.class;
          if (!PatchProxy.isSupport(nasaFeatured) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(t), tb, nasaFeatured, "13")) {
             nasaFeatured = tb.A;
             i = (nasaFeatured != RefreshType.LOGIN_REFRESH && (nasaFeatured == RefreshType.AGREE_PRIVACY_REFRESH || nasaFeatured == RefreshType.FOREGROUND2))? tb.s.a0(): tb.u;
             a.b("NasaFeaturedAutoRefresh", "needRemoveLastIndex = "+t+" lastSelectedIndex = "+i+" sourceType = "+tb.s.a());
             if (t > i) {
                int i1 = t + true;
                if (i1 <= tb.s.V0().size()) {
                   List list = tb.s.V0().subList((i + true), i1);
                   a.b("NasaFeaturedAutoRefresh", "removeList size = "+list.size());
                   NasaFeaturedAutoRefreshPresenter s = tb.s;
                   s.D1(list, s.U0(s.a0()), "NasaFeaturedAutoRefreshPresenter");
                }
             }
          }
       label_00c1 :
          this.b.S8(true);
       }
       if (p0) {
          NasaFeaturedAutoRefreshPresenter$c tb1 = this.b;
          tb1.u = 0;
          if (tb1.A == RefreshType.LOGIN_REFRESH) {
             tb1.S8(true);
          }
          tb1 = this.b;
          if (tb1.K == 10) {
             tb1.X7(t.timer(3, TimeUnit.SECONDS).subscribe(g.b, Functions.e));
          }
       }
       return;
    }
}
