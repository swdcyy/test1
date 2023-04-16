package com.yxcorp.login.userlogin.presenter.resetpassword.b;
import android.view.View$OnClickListener;
import com.yxcorp.login.userlogin.presenter.resetpassword.c;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.yxcorp.login.userlogin.fragment.LoginFragment;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.login.userlogin.f;
import com.yxcorp.login.http.response.ResetSelectResponse;
import com.yxcorp.login.bind.ResetAccountCheckActivity;
import android.content.Intent;
import android.content.Context;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.login.util.LoginPageLauncher;
import com.yxcorp.login.util.LoginPageLauncher$LoginType;
import com.yxcorp.login.util.LoginPageLauncher$a;
import r2d.d;
import com.yxcorp.login.util.LoginPageLauncher$b;
import r2d.e;
import n3d.a;

public final class b implements View$OnClickListener	// class@001bd6
{
    public final c b;
    public final int c;

    public void b(c p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       b tb = this.b;
       b tc = this.c;
       Objects.requireNonNull(tb);
       c uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(tc), tb, uoc, "4")) {
          User user = tb.r.get(tc);
          if (!PatchProxy.applyVoidOneRefs(user, tb, uoc, "5")) {
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
             userPackage.identity = user.getId();
             uContentPack.userPackage = userPackage;
             tb.v.gh("choose_account", 1350, uContentPack);
          }
          Activity activity = tb.getActivity();
          if (tb.u != null && f.b()) {
             if (activity != null) {
                c u = tb.u;
                u.mUserIndex = tc;
                ResetAccountCheckActivity resetAccount = ResetAccountCheckActivity.class;
                if (!PatchProxy.applyVoidTwoRefs(activity, u, null, resetAccount, "1")) {
                   Intent intent = new Intent(activity, resetAccount);
                   SerializableHook.putExtra(intent, "KEY_RESET_ACCOUNT_CHECKING", u);
                   activity.startActivity(intent);
                }
                if (!activity.isFinishing()) {
                   activity.finish();
                }
             }
          }else {
             LoginPageLauncher loginPageLau = LoginPageLauncher.i.a(LoginPageLauncher$LoginType.RESET_SELECT_ACCOUNT_PASSWORD);
             loginPageLau.b(tb.getContext());
             loginPageLau.c(new d(tb, user));
             loginPageLau.i(0);
             loginPageLau.h(new e(tb));
             loginPageLau.f();
          }
       }
    label_00a8 :
       return;
    }
}
