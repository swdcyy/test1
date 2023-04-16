package com.yxcorp.gifshow.relation.explore.presenter.h;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.explore.presenter.j;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jga.f$a;
import com.kwai.framework.model.user.User;
import jga.f;
import brd.t;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import hac.j0;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class h implements View$OnClickListener	// class@001850
{
    public final j b;

    public void h(j p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, j.class, "11")) {
       }else {
          f$a uoa = new f$a(tb.u, "76");
          uoa.o("ks://users/recommend/unfollow");
          tb.X7(FollowHelper.k(uoa.b()).subscribe(new j0(tb)));
       }
       return;
    }
}
