package com.yxcorp.gifshow.follow.stagger.presenter.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.follow.stagger.presenter.i$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.follow.stagger.presenter.h;
import erd.r;
import brd.t;
import eja.u;
import kga.c;
import erd.g;
import crd.b;
import qvb.q;
import qvb.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import mb5.r;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import qvb.f;
import io.reactivex.subjects.PublishSubject;

public class i extends PresenterV2	// class@001214
{
    public RecyclerFragment p;
    public f q;
    public PublishSubject r;
    public r s;
    public final q t;

    public void i(){
       super();
       this.t = new i$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       i tr = this.r;
       if (tr != null) {
          this.X7(tr.filter(h.b).subscribe(new u(this), c.a));
       }
       this.q.h(this.t);
       this.s.d(this.p, this.q);
       this.s.a(this.p.Vg().g(), this.p.Vg().a());
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       this.s = new r(4, "HomeFollow");
       return;
    }
    public void J8(){
       i oi = i.class;
       if (PatchProxy.applyVoid(null, this, oi, "4")) {
          return;
       }
       this.q.f(this.t);
       if (!PatchProxy.applyVoid(null, this, oi, "5")) {
          this.s.b();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.r8("PAGE_LIST");
       this.r = this.t8("HOME_FOLLOW_LAZY_INIT_SUBJECT");
       return;
    }
}
