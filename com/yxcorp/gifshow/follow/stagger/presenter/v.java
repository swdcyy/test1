package com.yxcorp.gifshow.follow.stagger.presenter.v;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import com.yxcorp.gifshow.follow.stagger.presenter.s;
import kga.c;
import erd.g;
import crd.b;
import eja.k0;
import com.yxcorp.gifshow.follow.stagger.presenter.t;
import erd.r;
import java.util.concurrent.TimeUnit;
import eja.l0;
import com.yxcorp.gifshow.autoplay.state.f;
import com.yxcorp.gifshow.follow.stagger.presenter.u;
import eja.j0;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import iha.b;

public class v extends PresenterV2	// class@001222
{
    public RecyclerFragment p;
    public b q;
    public f r;

    public void v(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, v.class, "2")) {
          return;
       }
       g a = c.a;
       this.X7(this.p.Vg().f().subscribe(s.b, a));
       this.X7(this.p.Vg().i().distinctUntilChanged().doOnNext(new k0(this)).filter(t.b).delay(200, TimeUnit.MILLISECONDS).subscribe(new l0(this)));
       this.X7(this.r.d().filter(u.b).subscribe(new j0(this), a));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.r8("FOLLOW_TAB_NOTIFY_INFO");
       this.r = this.r8("HOST_PLAY_STATE_MENU_SLIDE");
       return;
    }
}
