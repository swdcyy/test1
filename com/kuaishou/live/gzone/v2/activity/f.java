package com.kuaishou.live.gzone.v2.activity.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import fq5.b;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.kuaishou.live.gzone.v2.activity.f$a;
import erd.g;
import crd.b;
import w53.p;
import mq5.h;
import mq5.b;
import y43.a;
import k67.b;
import w53.r;
import com.kuaishou.live.gzone.v2.activity.g;
import w53.q;

public class f extends PresenterV2	// class@001cbd
{
    public a p;
    public b q;
    public b r;
    public e s;
    public i t;
    public h u;

    public void f(){
       super();
    }
    public void E8(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "2")) {
          return;
       }
       this.X7(this.q.b().m().subscribe(new f$a(this)));
       p op = new p(this);
       this.u = op;
       this.r.Km(op);
       if (!PatchProxy.applyVoid(objArray, this, uof, "4")) {
          a d = this.p.d;
          if (d != null) {
             this.X7(d.ua().subscribe(new r(this), new g(this)));
             this.X7(this.p.d.Ff().subscribe(new q(this)));
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       this.r.le(this.u);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       a uoa = this.q8(a.class);
       this.p = uoa;
       this.q = uoa.m;
       this.r = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       return;
    }
}
