package com.yxcorp.login.userlogin.fragment.g;
import erd.g;
import com.yxcorp.login.userlogin.fragment.h;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import mw4.a;
import v0d.j;
import com.yxcorp.login.util.LoginPageLauncher;
import com.yxcorp.login.util.LoginPageLauncher$LoginType;
import com.yxcorp.login.util.LoginPageLauncher$a;
import android.content.Context;
import com.kwai.feature.api.social.login.model.LoginParams;
import y1d.b3;
import n3d.a;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.yxcorp.login.util.ActivityPendingLaunchUtil$PendingCategory;
import com.yxcorp.login.loginaction.LoginHelper;
import com.kwai.framework.model.user.QCurrentUser;
import android.content.Intent;
import com.kwai.library.widget.popup.common.c;

public final class g implements g	// class@001b52
{
    public final h b;

    public void g(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       LoginUserResponse loginUserRes = p0;
       Objects.requireNonNull(tb);
       LoginUserResponse mIsNewThirdP = loginUserRes.mIsNewThirdPlatformUser;
       p0 = h.class;
       if (!PatchProxy.isSupport(p0) || !PatchProxy.applyVoidTwoRefs(loginUserRes, Boolean.valueOf(mIsNewThirdP), tb, p0, "5")) {
          if (mIsNewThirdP != null && (a.g() || j.b())) {
             LoginHelper.g(ActivityContext.g().e(), loginUserRes, mIsNewThirdP, null, "auto_dialog", false);
             if (QCurrentUser.ME.isLogined()) {
                p0 = tb.u;
                if (p0 != null) {
                   p0.onActivityCallback(0, -1, null);
                }
             }
             if (tb.s.D()) {
                tb.s.o();
             }
          }else {
             p0 = LoginPageLauncher.i.a(LoginPageLauncher$LoginType.REGISTER_USER_INFO_SETTING);
             p0.b(tb.r);
             p0.g(tb.g);
             p0.i(260);
             p0.h(new b3(tb, loginUserRes, mIsNewThirdP));
             p0.f();
          }
       }
       return;
    }
}
