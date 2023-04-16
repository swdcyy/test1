package com.yxcorp.gifshow.profile.presenter.profile.page.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import b5c.h;
import erd.o;
import com.yxcorp.gifshow.profile.presenter.profile.page.a;
import erd.r;
import b5c.e;
import z5c.l0;
import erd.g;
import crd.b;
import j5c.c;
import b5c.g;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.state.e;
import b5c.f;
import s1c.j1;
import b5c.c;
import java.util.Set;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.q;
import b5c.i;
import b5c.d;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.profile.util.b;

public class b extends PresenterV2	// class@00156a
{
    public j1 p;
    public c q;
    public User r;
    public RxPageBus s;
    public BaseFragment t;
    public b u;
    public boolean v;
    public String w;

    public void b(){
       super();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "2")) {
          return;
       }
       g a = l0.a;
       this.X7(this.s.f("PROFILE_REFRESH").map(new h(this)).filter(a.b).subscribe(new e(this), a));
       this.X7(this.q.e().subscribe(new g(this), l0.a("ProfileDataUpdatePresenter")));
       b tq = this.q;
       Objects.requireNonNull(tq);
       t ot = PatchProxy.apply(objArray, tq, c.class, "6");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = tq.b().filter(e.b);
       }
       this.X7(ot.subscribe(new f(this), a));
       tq = this.p;
       if (tq != null) {
          tq.e.add(new c(this));
       }
       this.X7(RxBus.f.f(q.class).filter(new i(this)).subscribe(new d(this), a));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.s8(j1.class);
       this.q = this.r8("PROFILE_LOAD_STATE");
       this.r = this.q8(User.class);
       this.s = this.r8("PROFILE_PAGE_RXBUS");
       this.t = this.r8("PROFILE_FRAGMENT");
       this.u = this.q8(b.class);
       return;
    }
}
