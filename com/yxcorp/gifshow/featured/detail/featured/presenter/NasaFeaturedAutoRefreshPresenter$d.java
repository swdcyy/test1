package com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedAutoRefreshPresenter$d;
import d6a.a;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedAutoRefreshPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import android.os.SystemClock;
import java.lang.Long;
import java.lang.Number;
import q2b.h$b;
import k2b.e0;
import k2b.u1;

public class NasaFeaturedAutoRefreshPresenter$d extends a	// class@000f58
{
    public final NasaFeaturedAutoRefreshPresenter b;

    public void NasaFeaturedAutoRefreshPresenter$d(NasaFeaturedAutoRefreshPresenter p0){
       this.b = p0;
       super();
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NasaFeaturedAutoRefreshPresenter$d.class, "1")) {
          return;
       }
       NasaFeaturedAutoRefreshPresenter$d tb = this.b;
       if (tb.F > 0) {
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, NasaFeaturedAutoRefreshPresenter.class, "18")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "REFRESH_CONTENT_TIME_COST";
             i3 oi3 = i3.f();
             oi3.c("time_cost", Long.valueOf((SystemClock.elapsedRealtime() - tb.F)));
             uElementPack.params = oi3.toString();
             h$b uob = h$b.d(0, 0);
             uob.k(uElementPack);
             u1.p0("", tb.p, uob);
          }
          this.b.F = 0;
       }
       return;
    }
}
