package com.kwai.nearby.local.tab.present.HomeLocalVisitCheckPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import pr6.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import dsb.a;
import brd.t;
import com.kwai.nearby.local.tab.present.HomeLocalVisitCheckPresenter$a;
import erd.g;
import crd.b;
import orb.a;
import android.app.Activity;
import android.content.Context;
import o56.f;
import androidx.fragment.app.FragmentActivity;
import za5.a;
import kotlin.jvm.internal.a;
import dsb.d;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import oo5.e;
import java.lang.Integer;
import java.lang.Number;
import zq6.r;
import rn5.a;
import zq6.p;
import sn5.e;
import com.google.common.base.Optional;
import oo5.b;
import ok.h;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import ro5.c0;
import com.kwai.nearby.local.tab.present.HomeLocalVisitCheckPresenter$handleVisitSource$1;
import msd.l;

public final class HomeLocalVisitCheckPresenter extends PresenterV2	// class@000fef
{
    public final d p;

    public void HomeLocalVisitCheckPresenter(d p0){
       super();
       this.p = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, HomeLocalVisitCheckPresenter.class, "1")) {
          return;
       }
       this.P8();
       this.X7(RxBus.f.f(a.class).subscribe(new HomeLocalVisitCheckPresenter$a(this)));
       return;
    }
    public final void P8(){
       int b;
       TabIdentifier d;
       a uoa = a.class;
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, this, HomeLocalVisitCheckPresenter.class, str)) {
          return;
       }
       if (!f.b(this.getActivity())) {
          return;
       }
       a uoa1 = a.o0(this.getActivity());
       a.o(uoa1, "HomeDataViewModel.get\(ac\x20\x02ity as FragmentActivity?\)\x00");
       if (uoa1.q0() == 4) {
          d.b(256);
       }
       uoa1 = a.a;
       HomeLocalVisitCheckPresenter tp = this.p;
       Objects.requireNonNull(uoa1);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(tp, uoa1, uoa, "3");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(tp != null){
          if (uoa1.a(tp)) {
             if (PatchProxy.isSupport(e.class)) {
                Object obj1 = PatchProxy.applyTwoRefs(tp, Integer.valueOf(4), objArray, e.class, str);
                if (obj1 != patchProxyRe) {
                   b = obj1.intValue();
                label_0093 :
                   if (b == 1) {
                      b = true;
                   }
                }
             }
             b = Optional.fromNullable(e.a(tp, 4).d(a.i)).transform(b.b).or(Integer.valueOf(0)).intValue();
             goto label_0093 ;
          }else if(uoa1.b(tp)){
             b = c0.C(tp, b.d);
          }
       }
       b = false;
       if (b) {
          d.b(16);
       }
       HomeLocalVisitCheckPresenter tp1 = this.p;
       HomeLocalVisitCheckPresenter$handleVisitSource$1 iNSTANCE = HomeLocalVisitCheckPresenter$handleVisitSource$1.INSTANCE;
       Objects.requireNonNull(uoa1);
       if (!PatchProxy.applyVoidTwoRefs(tp1, iNSTANCE, uoa1, uoa, "4")) {
          a.p(iNSTANCE, "action");
          if (tp1 != null) {
             if (uoa1.a(tp1)) {
                if (e.c(tp1, 4) && e.d(tp1, 4)) {
                   iNSTANCE.invoke(Integer.valueOf(1));
                }else if(e.c(tp1, 4)){
                   iNSTANCE.invoke(Integer.valueOf(2));
                }else if(e.d(tp1, 4)){
                   iNSTANCE.invoke(Integer.valueOf(3));
                }
             }else if(uoa1.b(tp1)){
                d = b.d;
                if (c0.b(tp1, d) && c0.A(tp1, d)) {
                   iNSTANCE.invoke(Integer.valueOf(1));
                }else if(c0.A(tp1, d)){
                   iNSTANCE.invoke(Integer.valueOf(3));
                }else if(c0.b(tp1, d)){
                   iNSTANCE.invoke(Integer.valueOf(2));
                }
             }
          }
       }
       return;
    }
}
