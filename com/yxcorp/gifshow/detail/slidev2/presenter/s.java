package com.yxcorp.gifshow.detail.slidev2.presenter.s;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.l0;
import b8a.f1;
import erd.g;
import crd.b;
import xx9.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class s extends PresenterV2	// class@0019d3
{
    public l0 p;
    public BaseFragment q;

    public void s(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, s.class, "2")) {
          return;
       }
       this.X7(this.p.s2.h(new f1(this)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
          return;
       }
       this.p = this.q8(l0.class);
       this.q = this.r8("FRAGMENT");
       return;
    }
}
