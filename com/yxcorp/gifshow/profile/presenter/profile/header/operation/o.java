package com.yxcorp.gifshow.profile.presenter.profile.header.operation.o;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.p;
import java.lang.Object;
import com.kwai.framework.model.user.UserProfile;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.profile.util.o;
import com.kwai.framework.model.user.UserOwnerCount;
import com.kwai.framework.model.user.UserProfileMissUInfo;
import u3c.h;
import com.kwai.framework.model.user.User$FollowStatus;
import android.view.View;
import z5c.y1;
import brd.t;
import bn.a;
import java.util.concurrent.TimeUnit;
import s4c.b1;
import z5c.l0;
import crd.b;
import s1c.j1;
import java.util.Set;

public final class o implements g	// class@001511
{
    public final p b;

    public void o(p p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, p.class, "7")) {
       }else if(!o.v(p0, tb.v)){
          boolean b = true;
          if (p0.mOwnerCount.mPhoto == null) {
             tb.E = b;
          }
          UserProfileMissUInfo userProfileM = h.j(p0);
          boolean b1 = (userProfileM != null && userProfileM.mShowAlreadyMissUStatus != null)? true: false;
          tb.P8(b1);
          p t = tb.t;
          tb.R8();
          if (o.w(p0, tb.v) || (tb.v.mFollowStatus == User$FollowStatus.UNFOLLOW || tb.E != null)) {
             t.setVisibility(8);
          }
          if (!t.getVisibility()) {
             if (b1) {
                y1.y(b, 1243, tb.v.getId());
             }else {
                y1.z(b, 1209, tb.v.getId(), "MIDDLE");
             }
          }
          a.b(t).throttleFirst(1, TimeUnit.SECONDS).subscribe(new b1(tb), l0.a);
          tb.u.c.add(tb.F);
       }
       return;
    }
}
