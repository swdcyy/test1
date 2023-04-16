package com.yxcorp.gifshow.detail.common.information.profilefollow.ProfileFollowElement$g;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.profilefollow.ProfileFollowElement;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.b;

public final class ProfileFollowElement$g implements g	// class@001438
{
    public final ProfileFollowElement b;

    public void ProfileFollowElement$g(ProfileFollowElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileFollowElement$g.class, "1")) {
       }else if(p0.intValue() > 0){
          this.b.b0();
       }else {
          this.b.c0();
       }
       return;
    }
}
