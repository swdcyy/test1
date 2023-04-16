package com.yxcorp.gifshow.detail.common.information.username.UserNameElement$c;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.username.UserNameElement;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class UserNameElement$c implements g	// class@001462
{
    public final UserNameElement b;

    public void UserNameElement$c(UserNameElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, UserNameElement$c.class, "1")) {
       }else {
          this.b.u0();
          PatchProxy.onMethodExit(UserNameElement$c.class, "1");
       }
       return;
    }
}
