package com.kwai.nearby.local.tab.present.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import id7.u;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import hd7.e;

public class b extends PresenterV2	// class@000ff1
{
    public e p;
    public BaseFragment q;

    public void b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.X7(this.q.Z0().subscribe(new u(this), Functions.e));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("HOME_LOCAL_TOP_TAB_VIEW");
       this.q = this.r8("FRAGMENT");
       return;
    }
}
