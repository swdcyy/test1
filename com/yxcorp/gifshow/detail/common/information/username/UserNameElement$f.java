package com.yxcorp.gifshow.detail.common.information.username.UserNameElement$f;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.username.UserNameElement;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qp7.x0;
import qp7.b;
import sr7.t;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.res.Resources;
import android.app.Activity;

public final class UserNameElement$f implements g	// class@001465
{
    public final UserNameElement b;

    public void UserNameElement$f(UserNameElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserNameElement$f.class, "1")) {
       }else {
          a.p(p0, "name");
          this.b.E().i(p0, this.b.p0().getResources().getColor(R.color.arg_RES_7f061c32));
          this.b.s0();
       }
       return;
    }
}
