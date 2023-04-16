package com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedAutoRefreshPresenter$f;
import ov5.a;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedAutoRefreshPresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import kda.e;
import q87.c;
import tkd.b;
import tkd.d;
import pv5.c;
import ayb.i;

public class NasaFeaturedAutoRefreshPresenter$f implements a	// class@000f5a
{
    public final NasaFeaturedAutoRefreshPresenter a;

    public void NasaFeaturedAutoRefreshPresenter$f(NasaFeaturedAutoRefreshPresenter p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,int p1,boolean p2){
       if (PatchProxy.isSupport(NasaFeaturedAutoRefreshPresenter$f.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, NasaFeaturedAutoRefreshPresenter$f.class, "1")) {
          return;
       }
       if (p0) {
          Object[] objArray = new Object[0];
          e.C().w("NasaFeaturedAutoRefresh", "launchLoginListener removed", objArray);
          d.a(0x6154d94e).wX(this.a.R);
          p0.C = false;
          if (d.a(0x4f878389).op()) {
             p0.B = p1;
          }
       }
       return;
    }
    public void b(int p0,boolean p1){
    }
}
