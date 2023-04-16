package com.yxcorp.gifshow.profile.presenter.profile.p;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.u;
import java.lang.Object;
import om6.d;
import java.util.Objects;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.profile.presenter.profile.r;
import java.lang.String;
import z5c.l0;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class p implements g	// class@001565
{
    public final u b;
    public final boolean c;

    public void p(u p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       p tb = this.b;
       Objects.requireNonNull(tb);
       tb.X7(p0.N60().observeOn(d.a).subscribeOn(d.c).subscribe(new r(tb, this.c), l0.a("MyProfileDraftsInfoPresenter")));
    }
}
