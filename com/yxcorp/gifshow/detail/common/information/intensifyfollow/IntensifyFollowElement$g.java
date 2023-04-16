package com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$g;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.QCurrentUser;

public final class IntensifyFollowElement$g implements g	// class@001415
{
    public final IntensifyFollowElement b;

    public void IntensifyFollowElement$g(IntensifyFollowElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntensifyFollowElement$g.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.J0(p0);
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          p0 = (mE.isLogined() && p0.isFollowingOrFollowRequesting())? 1: null;
          if (p0) {
             this.b.M0(true);
          }else {
             this.b.z0();
          }
       }
       return;
    }
}
