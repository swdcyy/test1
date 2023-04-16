package com.yxcorp.gifshow.detail.common.information.profilefollow.ProfileFollowElement$c;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.profilefollow.ProfileFollowElement;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class ProfileFollowElement$c implements g	// class@001434
{
    public final ProfileFollowElement b;

    public void ProfileFollowElement$c(ProfileFollowElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileFollowElement$c.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.p0(p0.booleanValue());
       }
       return;
    }
}
