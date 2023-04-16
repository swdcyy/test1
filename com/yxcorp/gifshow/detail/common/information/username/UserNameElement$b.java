package com.yxcorp.gifshow.detail.common.information.username.UserNameElement$b;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.username.UserNameElement;
import java.lang.Object;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;

public final class UserNameElement$b implements g	// class@001461
{
    public final UserNameElement b;

    public void UserNameElement$b(UserNameElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, UserNameElement$b.class, "1")) {
       }else if(UserNameElement.n0(this.b).isMine()){
          this.b.t0();
       }
       PatchProxy.onMethodExit(UserNameElement$b.class, "1");
       return;
    }
}
