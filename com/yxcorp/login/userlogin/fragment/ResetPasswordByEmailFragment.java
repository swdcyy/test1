package com.yxcorp.login.userlogin.fragment.ResetPasswordByEmailFragment;
import com.yxcorp.login.userlogin.fragment.ResetPsdFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.login.userlogin.presenter.resetpassword.g;
import com.yxcorp.login.userlogin.presenter.resetpassword.h;
import com.yxcorp.login.userlogin.presenter.resetpassword.q;
import com.yxcorp.login.userlogin.f;
import y1d.d5;
import java.lang.Number;
import java.util.Map;

public class ResetPasswordByEmailFragment extends ResetPsdFragment	// class@001b43
{

    public void ResetPasswordByEmailFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, ResetPasswordByEmailFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new g());
       obj.U7(new h());
       obj.U7(new q(false));
       if (f.b()) {
          obj.U7(new d5());
       }
       PatchProxy.onMethodExit(ResetPasswordByEmailFragment.class, "2");
       return obj;
    }
    public int getLayoutResId(){
       Object obj = PatchProxy.apply(null, this, ResetPasswordByEmailFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (f.b())? 0x7f0d131a: 0x7f0d1319;
       return i;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ResetPasswordByEmailFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(ResetPasswordByEmailFragment.class, null);
       return objectsByTag;
    }
}
