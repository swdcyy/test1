package com.yxcorp.gifshow.profile.presenter.profile.header.name.b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.profile.presenter.profile.header.name.d;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import z5c.b0;
import k2b.e0;
import z5c.y1;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import r4c.y;
import ou7.h$b;
import ou7.h;

public final class b implements View$OnClickListener	// class@0014f3
{
    public final d b;

    public void b(d p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, d.class, "6")) {
       }else if(tb.v.isBanned() || !tb.v.isFollowingOrFollowRequesting()){
          y1.j0(tb.r, "setting_alias_profile_action", tb.v.getId(), 993);
          h.b(tb.getContext(), tb.v, b0.g(tb.v.getId()), new y(tb));
       }
       return;
    }
}
