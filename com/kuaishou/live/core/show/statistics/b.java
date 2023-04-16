package com.kuaishou.live.core.show.statistics.b;
import c12.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import ekd.k1;
import t02.a0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import bk2.b;
import java.lang.Runnable;

public class b extends f	// class@001096
{
    public a0 K;
    public static String sLivePresenterClassName = "LiveHistoryPresenter";

    public void b(){
       super();
    }
    public void Q(boolean p0){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, b.class, "3")) {
          return;
       }
       k1.n(this);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       super.j8();
       this.K = this.q8(a0.class);
       return;
    }
    public void x(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       k1.s(new b(this), this, 5000);
       return;
    }
}
