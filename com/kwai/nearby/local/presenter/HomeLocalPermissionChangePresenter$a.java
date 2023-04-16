package com.kwai.nearby.local.presenter.HomeLocalPermissionChangePresenter$a;
import srb.b;
import com.kwai.nearby.local.presenter.HomeLocalPermissionChangePresenter;
import java.lang.Object;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tw5.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fm7.d;
import xl8.b;
import o96.u;
import java.util.Objects;
import bsb.a;
import vc7.d0;
import java.lang.Boolean;
import mrd.a;
import srb.a;
import lrb.a;

public class HomeLocalPermissionChangePresenter$a implements b	// class@000fa4
{
    public final HomeLocalPermissionChangePresenter a;

    public void HomeLocalPermissionChangePresenter$a(HomeLocalPermissionChangePresenter p0){
       this.a = p0;
       super();
    }
    public void a(CityInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLocalPermissionChangePresenter$a.class, "1")) {
          return;
       }
       HomeLocalPermissionChangePresenter$a ta = this.a;
       if (!TextUtils.n(ta.v, ta.t.e()) && !d.d(this.a.t.getTypeValue())) {
          this.a.u.d(p0);
          if (!u.h()) {
             ta = this.a;
             Objects.requireNonNull(ta);
             if (PatchProxy.applyVoidOneRefs(p0, ta, HomeLocalPermissionChangePresenter.class, "5") || (a.k(p0) && !d.d(ta.t.getTypeValue()))) {
                HomeLocalPermissionChangePresenter r = ta.r;
                Objects.requireNonNull(r);
                d0 uod0 = d0.class;
                if (!PatchProxy.isSupport(uod0) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, r, uod0, "9")) {
                   r.e.onNext(Boolean.TRUE);
                }
                ta.r.j(p0);
                ta.r.i(true);
             }
          }
       }
       HomeLocalPermissionChangePresenter$a ta1 = this.a;
       ta1.v = ta1.t.e();
       return;
    }
    public void onError(int p0,String p1){
       a.a(this, p0, p1);
    }
    public void onFinish(){
       if (PatchProxy.applyVoid(null, this, HomeLocalPermissionChangePresenter$a.class, "2")) {
          return;
       }
       a.m(this.a.x);
       return;
    }
    public void onStart(){
       a.c(this);
    }
}
