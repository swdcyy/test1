package com.yxcorp.gifshow.profile.presenter.profile.q;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.u;
import java.lang.Object;
import om6.d;
import java.util.Objects;
import brd.t;
import j4c.p;
import brd.w;
import erd.c;
import t45.d;
import brd.z;
import j4c.s;
import java.lang.String;
import z5c.l0;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class q implements g	// class@001589
{
    public final u b;
    public final boolean c;

    public void q(u p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       q tb = this.b;
       Objects.requireNonNull(tb);
       tb.X7(t.zip(p0.l5(), p0.Bs(), new p(tb)).observeOn(d.a).subscribeOn(d.c).subscribe(new s(tb, this.c), l0.a("MyProfileDraftsInfoPresenter")));
    }
}
