package com.kuaishou.live.core.show.statistics.d;
import k51.c;
import bk2.g;
import com.kuaishou.live.core.show.statistics.d$a;
import com.kuaishou.live.core.show.statistics.d$b;
import com.kuaishou.live.core.show.statistics.d$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import brd.t;
import t45.d;
import brd.z;
import bk2.i;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import t02.a0;
import com.kuaishou.live.core.show.statistics.c;
import erd.r;
import bk2.h;
import io.reactivex.internal.functions.Functions;
import mq5.h;
import mq5.b;
import kq5.b;
import p91.m;
import androidx.fragment.app.c$b;
import wq5.a;
import kp3.e;
import bk2.f;
import bk2.j;
import eoc.f;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import es3.a;
import bk2.k;
import tkd.b;
import tkd.d;
import yt5.h;
import yt5.e;
import java.util.Set;

public class d extends c	// class@00109b
{
    public a0 p;
    public e q;
    public Set r;
    public e s;
    public final h t;
    public final c$b u;
    public b v;
    public c w;
    public static String sLivePresenterClassName = "LiveTaskStatisticsPresenter";

    public void d(){
       super();
       this.t = new g(this);
       this.u = new d$a(this);
       this.v = new d$b(this);
       this.w = new d$c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.X7(RxBus.f.f(n.class).observeOn(d.a).subscribe(new i(this)));
       this.X7(this.p.u.filter(c.b).subscribe(new h(this), Functions.e));
       this.p.D2.Km(this.t);
       this.p.Z2.k().c(this.u);
       this.q.k(this.v);
       this.X7(f.a(f.class, new j(this)));
       this.p.y2.P4(this.w);
       this.X7(f.a(a.class, new k(this)));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.s = d.a(-459035871).R();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       this.p.D2.le(this.t);
       this.p.Z2.k().a(this.u);
       this.q.y(this.v);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.q = this.r8("LIVE_SIDE_BAR_MOVEMENT");
       this.r = this.t8("AWARD_LIVE_REWARDED_USER_ID_SET");
       return;
    }
}
