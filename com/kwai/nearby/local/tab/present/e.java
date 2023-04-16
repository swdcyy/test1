package com.kwai.nearby.local.tab.present.e;
import erd.g;
import com.kwai.nearby.local.tab.present.HomeLocalTopTabDisplayPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vc7.d0;
import id7.w;
import java.lang.Runnable;
import ekd.k1;
import hd7.e;
import android.view.GestureDetector$OnDoubleTapListener;
import com.kwai.feature.api.social.nearby.model.roampanel.RoamPanelAction;
import mrd.a;

public final class e implements g	// class@000ff4
{
    public final HomeLocalTopTabDisplayPresenter b;

    public void e(HomeLocalTopTabDisplayPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       p0 = HomeLocalTopTabDisplayPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, p0, "6")) {
       }else if(tb.t.e() && tb.t.f()){
          tb.S8(true);
          k1.r(new w(tb), 150);
       }else if(PatchProxy.applyVoid(objArray, tb, p0, "8")){
          if (tb.u != null) {
             tb.s.b(false);
          }else {
             tb.P8(false);
          }
          if (tb.w != null) {
             tb.s.g(tb.C);
             tb.w = false;
          }
       }
       tb.r.onNext(RoamPanelAction.IMMEDIATE_COLLAPSE);
       return;
    }
}
