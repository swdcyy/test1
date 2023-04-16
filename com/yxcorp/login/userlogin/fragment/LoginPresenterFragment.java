package com.yxcorp.login.userlogin.fragment.LoginPresenterFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.os.Bundle;
import im8.c;

public abstract class LoginPresenterFragment extends BaseFragment	// class@001b31
{
    public PresenterV2 j;

    public void LoginPresenterFragment(){
       super();
    }
    public PresenterV2 B2(){
       Object obj = PatchProxy.applyWithListener(null, this, LoginPresenterFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(LoginPresenterFragment.class, "2");
       return new PresenterV2();
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LoginPresenterFragment.class, "3")) {
          return;
       }
       super.onDestroyView();
       this.j.destroy();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LoginPresenterFragment.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       PresenterV2 presenterV2 = this.B2();
       this.j = presenterV2;
       presenterV2.f(p0);
       Object[] objArray = new Object[]{new c("FRAGMENT", this),this};
       this.j.i(objArray);
       return;
    }
}
