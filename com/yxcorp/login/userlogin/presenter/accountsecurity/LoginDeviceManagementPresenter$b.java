package com.yxcorp.login.userlogin.presenter.accountsecurity.LoginDeviceManagementPresenter$b;
import android.view.View$OnClickListener;
import com.yxcorp.login.userlogin.presenter.accountsecurity.LoginDeviceManagementPresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import wkd.b;
import nf6.i;
import android.net.Uri;
import ekd.w0;
import android.content.Context;
import android.content.Intent;

public final class LoginDeviceManagementPresenter$b implements View$OnClickListener	// class@001ba1
{
    public final LoginDeviceManagementPresenter b;

    public void LoginDeviceManagementPresenter$b(LoginDeviceManagementPresenter p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LoginDeviceManagementPresenter$b.class, "1")) {
          return;
       }
       if (this.b.getActivity() != null) {
          Activity activity = this.b.getActivity();
          a.m(activity);
          a.o(activity, "activity!!");
          if (!activity.isFinishing()) {
             Intent intent = b.a(0x66dce92a).a(this.b.getActivity(), w0.f(this.b.P8()));
             if (intent != null) {
                Activity activity1 = this.b.getActivity();
                a.m(activity1);
                activity1.startActivity(intent);
             }
             PatchProxy.onMethodExit(LoginDeviceManagementPresenter$b.class, "1");
             return;
          }
       }
       PatchProxy.onMethodExit(LoginDeviceManagementPresenter$b.class, "1");
       return;
    }
}
