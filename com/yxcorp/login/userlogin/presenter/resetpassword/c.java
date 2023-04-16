package com.yxcorp.login.userlogin.presenter.resetpassword.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.ArrayList;
import android.view.View;
import com.yxcorp.login.userlogin.presenter.resetpassword.b;
import android.view.View$OnClickListener;
import ekd.m1;
import java.util.Map;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import com.yxcorp.login.userlogin.fragment.MultiRetrieveAccountSelectFragment;
import com.yxcorp.login.http.response.ResetSelectResponse;

public class c extends PresenterV2	// class@001bd7
{
    public View p;
    public View q;
    public List r;
    public Map s;
    public LoginUserResponse t;
    public ResetSelectResponse u;
    public MultiRetrieveAccountSelectFragment v;

    public void c(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       int i = 2;
       if (this.r.size() == i) {
          ArrayList uArrayList = new ArrayList(i);
          uArrayList.add(this.p);
          uArrayList.add(this.q);
          for (i = 0; i < uArrayList.size(); i = i + 1) {
             uArrayList.get(i).setOnClickListener(new b(this, i));
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0353);
       this.q = m1.f(p0, 0x7f0a0354);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.r = this.r8("LOGIN_MULTI_USER_INFO");
       this.s = this.r8("LOGIN_MULTI_USER_TOKEN");
       this.t = this.r8("LOGIN_MULTI_USER_RESPONSE");
       this.v = this.r8("FRAGMENT");
       this.u = this.t8("RESET_ACCOUNT_CHECK_RESPONSE");
       return;
    }
}
