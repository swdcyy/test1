package com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$e;
import erd.g;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;

public final class AdAvatarElement$e implements g	// class@001711
{
    public final User b;
    public final AdAvatarElement c;

    public void AdAvatarElement$e(User p0,AdAvatarElement p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, AdAvatarElement$e.class, "1")) {
       }else if(TextUtils.n(this.b.mId, p0.b)){
          p0 = p0.a;
          a.o(p0, "it.targetUser");
          f.m(AdAvatarElement.n0(this.c).getUser(), p0.getFollowStatus());
       }
       PatchProxy.onMethodExit(AdAvatarElement$e.class, "1");
       return;
    }
}
