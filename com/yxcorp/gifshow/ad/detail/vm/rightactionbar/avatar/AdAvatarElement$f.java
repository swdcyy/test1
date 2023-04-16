package com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$f;
import erd.g;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import qp7.x0;
import qp7.b;
import os7.a;
import java.lang.Boolean;

public final class AdAvatarElement$f implements g	// class@001712
{
    public final User b;
    public final AdAvatarElement c;

    public void AdAvatarElement$f(User p0,AdAvatarElement p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, AdAvatarElement$f.class, "1")) {
       }else {
          p0 = this.c;
          AdAvatarElement$f tb = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(tb, p0, AdAvatarElement.class, "10")) {
             if (!tb.isFollowingOrFollowRequesting()) {
                p0.x0();
             }else {
                p0.G = true;
                p0.E().n(Boolean.FALSE);
                p0.E().s(Boolean.TRUE);
             }
          }
          PatchProxy.onMethodExit(AdAvatarElement$f.class, "1");
       }
       return;
    }
}
