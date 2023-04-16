package com.yxcorp.login.userlogin.presenter.kwaiapplogin.g;
import g2d.c0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.userlogin.presenter.kwaiapplogin.g$a;
import android.view.View$OnClickListener;
import android.widget.Button;
import com.yxcorp.login.util.LoginPageLauncher;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.login.util.LoginPageLauncher$a;
import kotlin.jvm.internal.a;
import com.yxcorp.login.util.LoginPageLauncher$FromPage;
import com.yxcorp.login.userlogin.presenter.kwaiapplogin.g$b;
import android.view.View$OnTouchListener;
import android.view.View;
import ekd.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.social.login.model.LoginParams;
import com.yxcorp.login.userlogin.fragment.KwaiAppLoginV2Fragment;

public class g extends c0	// class@001bca
{
    public Button s;
    public LoginParams t;
    public KwaiAppLoginV2Fragment u;
    public LoginPageLauncher$FromPage v;

    public void g(){
       super();
    }
    public void E8(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "3")) {
          return;
       }
       this.s.setOnClickListener(new g$a(this));
       g tv = this.v;
       LoginPageLauncher$a obj = PatchProxy.applyOneRefs(tv, objArray, LoginPageLauncher.class, "12");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = LoginPageLauncher.i;
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.applyOneRefs(tv, obj, LoginPageLauncher$a.class, "4");
          if (obj1 != PatchProxyResult.class) {
             b = obj1.booleanValue();
          }else {
             a.p(tv, "fromPage");
             b = (tv == LoginPageLauncher$FromPage.PHONE_ONE_KEY || tv == LoginPageLauncher$FromPage.DIALOG_PHONE_ONE_KEY)? true: false;
          }
       }
       if (b) {
          this.s.setText(R.string.arg_RES_7f103b45);
       }else {
          this.s.setText(R.string.arg_RES_7f104fb8);
       }
       this.s.setOnTouchListener(new g$b(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       super.doBindView(p0);
       this.s = m1.f(p0, 0x7f0a0556);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       super.j8();
       this.t = this.t8("LOGIN_PAGE_PARAMS");
       this.u = this.t8("FRAGMENT");
       this.v = this.r8("KEY_LOGIN_FROM_PAGE");
       return;
    }
}
