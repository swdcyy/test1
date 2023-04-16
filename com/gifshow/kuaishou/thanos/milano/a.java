package com.gifshow.kuaishou.thanos.milano.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qh.d;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;

public class a extends PresenterV2	// class@0015d4
{
    public t p;
    public List q;

    public void a(List p0){
       super();
       this.q = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.X7(this.p.subscribe(new d(this), Functions.e));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.r8("DETAIL_ON_CONFIGURATION_CHANGED_EVENT");
       return;
    }
}
