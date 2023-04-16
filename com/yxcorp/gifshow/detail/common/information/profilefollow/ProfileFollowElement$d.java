package com.yxcorp.gifshow.detail.common.information.profilefollow.ProfileFollowElement$d;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.profilefollow.ProfileFollowElement;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qp7.x0;
import qp7.b;
import mr7.n;
import java.util.Objects;
import java.lang.Boolean;
import pp7.b;
import com.kwai.slide.play.detail.information.profilefollow.ProfileFollowManager;

public final class ProfileFollowElement$d implements g	// class@001435
{
    public final ProfileFollowElement b;

    public void ProfileFollowElement$d(ProfileFollowElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileFollowElement$d.class, str)) {
       }else {
          a.o(p0, "it");
          if (p0.isFollowingOrFollowRequesting()) {
             p0 = this.b.E();
             Objects.requireNonNull(p0);
             n on = n.class;
             if (!PatchProxy.isSupport(on) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, p0, on, str)) {
                p0.d.f(Boolean.TRUE);
             }
             p0 = ProfileFollowElement.n0(this.b);
             Objects.requireNonNull(p0);
             ProfileFollowManager profileFollo = ProfileFollowManager.class;
             if (!PatchProxy.isSupport(profileFollo) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, p0, profileFollo, "2")) {
                p0.c = true;
                p0.c();
             }
          }
       }
       return;
    }
}
