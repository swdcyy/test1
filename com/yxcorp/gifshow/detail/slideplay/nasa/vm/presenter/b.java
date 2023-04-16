package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import y6a.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.util.rx.RxBus;
import qra.e;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import y6a.f;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class b extends PresenterV2	// class@001810
{
    public QPhoto p;
    public BaseFragment q;
    public final Runnable r;

    public void b(){
       super();
       this.r = new g(this);
    }
    public void E8(){
       if (PatchProxy.applyVoidWithListener(null, this, b.class, "2")) {
          return;
       }
       k1.m(this.r);
       k1.r(this.r, 300);
       this.X7(RxBus.f.g(e.class, RxBus$ThreadMode.MAIN).subscribe(new f(this)));
       PatchProxy.onMethodExit(b.class, "2");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, b.class, "3")) {
          return;
       }
       k1.m(this.r);
       PatchProxy.onMethodExit(b.class, "3");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, b.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.t8("DETAIL_FRAGMENT");
       PatchProxy.onMethodExit(b.class, "1");
       return;
    }
}
