package com.yxcorp.gifshow.detail.common.information.username.UserNameElement$g;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.username.UserNameElement;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.x0;
import qp7.b;
import sr7.t;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.User;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.res.Resources;
import android.app.Activity;

public final class UserNameElement$g implements g	// class@001466
{
    public final UserNameElement b;

    public void UserNameElement$g(UserNameElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserNameElement$g.class, "1")) {
       }else {
          User mName = UserNameElement.n0(this.b).getUser().mName;
          a.o(mName, "mPhoto.user.mName");
          this.b.E().i(mName, this.b.p0().getResources().getColor(R.color.arg_RES_7f061c32));
          this.b.s0();
       }
       return;
    }
}
