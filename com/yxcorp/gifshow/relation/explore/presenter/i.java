package com.yxcorp.gifshow.relation.explore.presenter.i;
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
import hac.g0;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class i implements View$OnClickListener	// class@001851
{
    public final j b;

    public void i(j p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, j.class, "12")) {
       }else {
          tb.X7(FollowHelper.k(new f$a(tb.u, "").b()).subscribe(new g0(tb)));
       }
       return;
    }
}
