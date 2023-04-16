package com.yxcorp.login.userlogin.presenter.accountsecurity.LoginDeviceManagementPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.login.userlogin.presenter.accountsecurity.LoginDeviceManagementPresenter$a;
import nsd.u;
import com.yxcorp.login.userlogin.presenter.accountsecurity.LoginDeviceManagementPresenter$jumpLink$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import com.yxcorp.login.userlogin.presenter.accountsecurity.LoginDeviceManagementPresenter$b;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import ekd.m1;

public final class LoginDeviceManagementPresenter extends PresenterV2	// class@001ba3
{
    public final p p;
    public View q;
    public static final LoginDeviceManagementPresenter$a r;

    static {
       LoginDeviceManagementPresenter.r = new LoginDeviceManagementPresenter$a(null);
    }
    public void LoginDeviceManagementPresenter(){
       super();
       this.p = s.c(LoginDeviceManagementPresenter$jumpLink$2.INSTANCE);
    }
    public void E8(){
       LoginDeviceManagementPresenter tq;
       if (PatchProxy.applyVoid(null, this, LoginDeviceManagementPresenter.class, "3")) {
          return;
       }
       if (TextUtils.x(this.P8())) {
          tq = this.q;
          if (tq != null) {
             tq.setVisibility(8);
          }
       }else {
          tq = this.q;
          if (tq != null) {
             tq.setVisibility(0);
             tq.setOnClickListener(new LoginDeviceManagementPresenter$b(this));
          }
       }
       return;
    }
    public final String P8(){
       Object obj = PatchProxy.apply(null, this, LoginDeviceManagementPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.getValue();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LoginDeviceManagementPresenter.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a2973);
       return;
    }
}
