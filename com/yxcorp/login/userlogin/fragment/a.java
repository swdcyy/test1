package com.yxcorp.login.userlogin.fragment.a;
import erd.g;
import com.yxcorp.login.userlogin.fragment.b;
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
import y1d.h;
import n3d.a;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.yxcorp.login.util.ActivityPendingLaunchUtil$PendingCategory;
import com.yxcorp.login.loginaction.LoginHelper;
import com.kwai.framework.model.user.QCurrentUser;
import android.content.Intent;
import com.kwai.library.widget.popup.common.c;

public final class a implements g	// class@001b4b
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       LoginUserResponse loginUserRes = p0;
       Objects.requireNonNull(tb);
       LoginUserResponse mIsNewThirdP = loginUserRes.mIsNewThirdPlatformUser;
       p0 = b.class;
       if (!PatchProxy.isSupport(p0) || !PatchProxy.applyVoidTwoRefs(loginUserRes, Boolean.valueOf(mIsNewThirdP), tb, p0, "4")) {
          if (mIsNewThirdP != null && (a.g() || j.b())) {
             LoginHelper.g(ActivityContext.g().e(), loginUserRes, mIsNewThirdP, null, "auto_dialog", false);
             if (QCurrentUser.ME.isLogined()) {
                p0 = tb.t;
                if (p0 != null) {
                   p0.onActivityCallback(0, -1, null);
                }
             }
             if (tb.r.D()) {
                tb.r.o();
             }
          }else {
             p0 = LoginPageLauncher.i.a(LoginPageLauncher$LoginType.REGISTER_USER_INFO_SETTING);
             p0.b(tb.s);
             p0.g(tb.g);
             p0.i(260);
             p0.h(new h(tb, loginUserRes, mIsNewThirdP));
             p0.f();
          }
       }
       return;
    }
}