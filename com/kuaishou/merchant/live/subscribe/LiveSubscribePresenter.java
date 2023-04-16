package com.kuaishou.merchant.live.subscribe.LiveSubscribePresenter;
import l74.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import ja6.a;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.merchant.live.subscribe.LiveSubscribePresenter$a;
import erd.g;
import com.kuaishou.merchant.live.subscribe.LiveSubscribePresenter$b;
import erd.r;
import com.kuaishou.merchant.live.subscribe.LiveSubscribePresenter$c;
import erd.o;
import com.kuaishou.merchant.live.subscribe.LiveSubscribePresenter$d;
import com.kuaishou.merchant.live.subscribe.LiveSubscribePresenter$e;
import com.kuaishou.merchant.live.subscribe.LiveSubscribePresenter$onBind$$inlined$subscribeBy$1;
import l74.p;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class LiveSubscribePresenter extends a	// class@001adb
{
    public BaseFragment p;
    public boolean q;
    public boolean r;

    public void LiveSubscribePresenter(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LiveSubscribePresenter.class, "2")) {
          return;
       }
       this.X7(RxBus.f.f(a.class).observeOn(d.a).doOnNext(LiveSubscribePresenter$a.b).filter(LiveSubscribePresenter$b.b).flatMap(new LiveSubscribePresenter$c(this)).filter(new LiveSubscribePresenter$d(this)).map(LiveSubscribePresenter$e.b).subscribe(new LiveSubscribePresenter$onBind$$inlined$subscribeBy$1(this), p.b));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveSubscribePresenter.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       return;
    }
}
