package com.yxcorp.gifshow.profile.presenter.profile.page.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.u;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import b5c.p;
import erd.g;
import crd.b;
import e06.b;
import b5c.q;
import com.kwai.framework.model.user.User;

public class e extends PresenterV2	// class@001588
{
    public User p;
    public boolean q;

    public void e(){
       super();
       this.q = false;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.X7(f.g(u.class, mAIN).subscribe(new p(this)));
       this.X7(f.g(b.class, mAIN).subscribe(new q(this)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.p = this.q8(User.class);
       return;
    }
}
