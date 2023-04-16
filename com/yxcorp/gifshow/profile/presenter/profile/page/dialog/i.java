package com.yxcorp.gifshow.profile.presenter.profile.page.dialog.i;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.j;
import java.lang.Object;
import com.kwai.framework.model.user.UserProfile;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import c5c.p;
import z5c.l0;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class i implements g	// class@001580
{
    public final j b;

    public void i(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, j.class, "4")) {
       }else if(tb.t != null){
          tb.t = false;
          tb.X7(t.timer(3, TimeUnit.SECONDS).observeOn(d.a).subscribe(new p(tb), l0.a));
       }
       return;
    }
}
