package com.yxcorp.gifshow.detail.common.information.username.UserNameElement$i;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.username.UserNameElement;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qp7.x0;
import qp7.b;
import sr7.t;
import com.kwai.framework.model.user.User;
import lu7.f;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.res.Resources;
import android.app.Activity;

public final class UserNameElement$i implements g	// class@001468
{
    public final UserNameElement b;

    public void UserNameElement$i(UserNameElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserNameElement$i.class, "1")) {
       }else {
          a.p(p0, "o");
          String str = f.a(UserNameElement.n0(this.b).getUser());
          a.o(str, "UserExt.getAliasName\(mPhoto.user\)");
          this.b.E().i(str, this.b.p0().getResources().getColor(R.color.arg_RES_7f061c32));
          this.b.u0();
       }
       return;
    }
}
