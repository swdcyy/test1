package com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.HomeLocalSizerViewPresenter$b;
import srb.b;
import com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.HomeLocalSizerViewPresenter;
import java.lang.Object;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import trb.a;
import java.lang.System;
import lrb.a;
import com.yxcorp.gifshow.local.sub.entrance.sizer.view.HomeLocalSizerView$SizerState;
import com.yxcorp.gifshow.local.sub.entrance.sizer.view.HomeLocalSizerView;
import p96.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.framework.location.k;
import tw5.d;
import fm7.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import bsb.a;
import com.yxcorp.gifshow.local.sub.entrance.sizer.model.NearbySubSizerResponse;
import com.yxcorp.gifshow.local.sub.entrance.sizer.sizermanager.LocalSizerDataProvider;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import bkc.a;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class HomeLocalSizerViewPresenter$b implements b	// class@001ac6
{
    public final HomeLocalSizerViewPresenter a;

    public void HomeLocalSizerViewPresenter$b(HomeLocalSizerViewPresenter p0){
       this.a = p0;
       super();
    }
    public void a(CityInfo p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLocalSizerViewPresenter$b.class, "2")) {
          return;
       }
       boolean b = true;
       a.e = b;
       a.f = System.currentTimeMillis();
       String str = "[SizerView] location success gps close, city=";
       boolean b1 = false;
       if (!a.b()) {
          a.g = System.currentTimeMillis();
          this.a.x.setCurrentState(HomeLocalSizerView$SizerState.NO_PERMISSION);
          a.a(b1);
          objArray = new Object[b1];
          a.C().w("ks.location.log:Local", str+p0+" | sizer state is NO_PERMISSION", objArray);
       }else {
          String str1 = " | sizer state is LOCATION_ERROR";
          if (!k.f() && !d.d(this.a.s.getTypeValue())) {
             a.g = System.currentTimeMillis();
             this.a.x.setCurrentState(HomeLocalSizerView$SizerState.NO_PERMISSION);
             a.a(b1);
             objArray = new Object[b1];
             a.C().w("ks.location.log:Local", str+p0+str1, objArray);
             return;
          }else {
             HomeLocalSizerViewPresenter$b ta1 = this.a;
             if (!TextUtils.n(ta1.v, ta1.s.e()) && !d.d(this.a.s.getTypeValue())) {
                ta1 = this.a;
                Objects.requireNonNull(ta1);
                if (!PatchProxy.applyVoidOneRefs(p0, ta1, HomeLocalSizerViewPresenter.class, "9")) {
                   if (a.k(p0)) {
                      if (ta1.t.getDataValue() == null && !TextUtils.x(a.f(ta1.s))) {
                         ta1.p.v(b);
                      }
                      Object[] objArray1 = new Object[b1];
                      a.C().w("ks.location.log:Local", "[SizerView] location success data valid£¬city="+p0, objArray1);
                      ta1.R8(b);
                   }else {
                      ta1.x.setCurrentState(HomeLocalSizerView$SizerState.NO_PERMISSION);
                      a.g = System.currentTimeMillis();
                      a.a(b1);
                      objArray = new Object[b1];
                      a.C().w("HomeLocalCurentCityBuilder", "locate failure£¬Return to Local,reason:valid city", objArray);
                      objArray = new Object[b1];
                      a.C().w("ks.location.log:Local", "[SizerView] location success£¬data inValid, city= "+p0+str1, objArray);
                   }
                }
             }else {
                this.a.x.setCurrentState(HomeLocalSizerView$SizerState.NORMAL);
                a.a(b1);
                objArray = new Object[b1];
                a.C().w("ks.location.log:Local", "[SizerView] location success no migrate, city="+p0+" | sizer state is NORMAL", objArray);
             }
          }
       }
       HomeLocalSizerViewPresenter$b ta = this.a;
       ta.v = ta.s.e();
       return;
    }
    public void onError(int p0,String p1){
       boolean b;
       HomeLocalSizerViewPresenter$b uob = HomeLocalSizerViewPresenter$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "3")) {
          return;
       }
       uob = this.a;
       Objects.requireNonNull(uob);
       HomeLocalSizerViewPresenter homeLocalSiz = HomeLocalSizerViewPresenter.class;
       if (!PatchProxy.isSupport(homeLocalSiz) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, uob, homeLocalSiz, "6")) {
          a.e = false;
          a.f = System.currentTimeMillis();
          Object[] obj = PatchProxy.apply(null, uob, homeLocalSiz, "19");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(!k.a("default") || !k.f()){
             Object[] objArray2 = new Object[false];
             a.C().w("ks.location.log:Local", "[SizerView] isNoPermissionState is NO_PERMISSION OR close gps", objArray2);
             b = true;
          }else {
             b = false;
          }
          if (b) {
             uob.x.setCurrentState(HomeLocalSizerView$SizerState.NO_PERMISSION);
             a.g = System.currentTimeMillis();
             a.b(true, Integer.valueOf(p0));
             Object[] objArray = new Object[false];
             a.C().w("ks.location.log:Local", "[SizerView] onLocationError sizer state is NO_PERMISSION", objArray);
          }else if(TextUtils.x(a.f(uob.s))){
             uob.x.setCurrentState(HomeLocalSizerView$SizerState.NO_PERMISSION);
             a.g = System.currentTimeMillis();
             a.b(true, Integer.valueOf(p0));
             obj = new Object[false];
             a.C().w("ks.location.log:Local", "[SizerView] onLocationError: errCode = "+p0+" | reason = "+p1+" | sizer state is LOCATION_ERROR", obj);
          }else {
             uob.x.setCurrentState(HomeLocalSizerView$SizerState.NORMAL);
             a.b(false, Integer.valueOf(p0));
             obj = new Object[false];
             a.C().w("ks.location.log:Local", "[SizerView] onLocationError : errCode = "+p0+"| reason = "+p1+" | sizer state is NORMAL", obj);
          }
          Object[] objArray1 = new Object[false];
          a.C().w("HomeLocalCurentCityBuilder", "locate failure£¬Return to Local, reason:"+p1, objArray1);
       }
       return;
    }
    public void onFinish(){
       if (PatchProxy.applyVoid(null, this, HomeLocalSizerViewPresenter$b.class, "4")) {
          return;
       }
       a.m(this.a.F);
       return;
    }
    public void onStart(){
       Object[] objArray1;
       if (PatchProxy.applyVoid(null, this, HomeLocalSizerViewPresenter$b.class, "1")) {
          return;
       }
       a.c = System.currentTimeMillis();
       int i = 0;
       Object[] objArray = new Object[i];
       a.C().w("HomeLocalCurentCityBuilder", "locating", objArray);
       if (!a.b()) {
          this.a.x.setCurrentState(HomeLocalSizerView$SizerState.NO_PERMISSION);
          objArray1 = new Object[i];
          a.C().w("ks.location.log:Local", "[SizerView] location start, gps close £¬sizer state is NO_PERMISSION", objArray1);
       }else {
          this.a.x.setCurrentState(HomeLocalSizerView$SizerState.LOCATING);
          objArray1 = new Object[i];
          a.C().w("ks.location.log:Local", "[SizerView] location start, sizer state is LOCATING", objArray1);
       }
       return;
    }
}
