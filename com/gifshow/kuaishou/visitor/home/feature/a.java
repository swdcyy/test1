package com.gifshow.kuaishou.visitor.home.feature.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import zh5.a;
import brd.t;
import t45.d;
import brd.z;
import wh.b;
import erd.g;
import crd.b;

public class a extends PresenterV2	// class@0015e0
{

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.X7(RxBus.f.f(a.class).observeOn(d.a).subscribe(new b(this)));
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, a.class, "3");
    }
}
