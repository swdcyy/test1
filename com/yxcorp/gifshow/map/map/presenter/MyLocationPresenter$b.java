package com.yxcorp.gifshow.map.map.presenter.MyLocationPresenter$b;
import yz6.f$c;
import com.yxcorp.gifshow.map.map.presenter.MyLocationPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.r0;
import tkd.b;
import tkd.d;
import g07.a;
import yz6.d;
import f07.b;
import kotlin.jvm.internal.a;
import yz6.m;
import yz6.l;
import yz6.f;

public final class MyLocationPresenter$b implements f$c	// class@001cc0
{
    public final MyLocationPresenter a;

    public void MyLocationPresenter$b(MyLocationPresenter p0){
       this.a = p0;
       super();
    }
    public final void onMapLoaded(){
       if (PatchProxy.applyVoid(null, this, MyLocationPresenter$b.class, "1")) {
          return;
       }
       if (!r0.d(this.a.getContext())) {
          d uod = d.a(-115370941).wY().g(new b(0x404145fd7a13c255, 0x405b3bdf0d413123)).e(-1).f(1);
          a.o(uod, "PluginManager.get\(KMapPl¡­or\(Color.WHITE\).radius\(1\)");
          MyLocationPresenter q = this.a.q;
          if (q != null) {
             q.q(uod);
          }
       }
       return;
    }
}
