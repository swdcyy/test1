package com.yxcorp.gifshow.profile.presenter.profile.page.dialog.g;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.h;
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
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.f;
import z5c.l0;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class g implements g	// class@00157e
{
    public final h b;

    public void g(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, h.class, "3")) {
       }else if(tb.s != null){
          tb.s = false;
          tb.X7(t.timer(3, TimeUnit.SECONDS).observeOn(d.a).subscribe(new f(tb), l0.a));
       }
       return;
    }
}
