package com.yxcorp.login.userlogin.fragment.ResetPasswordByPhoneFragment;
import com.yxcorp.login.userlogin.fragment.ResetPsdFragment;
import io.reactivex.subjects.PublishSubject;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e2d.j;
import com.yxcorp.login.userlogin.presenter.resetpassword.q;
import com.yxcorp.login.userlogin.f;
import y1d.d5;
import com.yxcorp.login.userlogin.presenter.resetpassword.n;
import com.yxcorp.login.userlogin.presenter.resetpassword.r;
import com.yxcorp.login.userlogin.presenter.resetpassword.k;
import java.lang.Number;
import y1d.c5;
import java.util.Map;

public class ResetPasswordByPhoneFragment extends ResetPsdFragment	// class@001b44
{
    public PublishSubject t;
    public String u;

    public void ResetPasswordByPhoneFragment(){
       super();
       this.t = PublishSubject.g();
       this.u = "+86";
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, ResetPasswordByPhoneFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new j());
       obj.U7(new q(true));
       if (f.b()) {
          obj.U7(new d5());
          obj.U7(new n());
       }else {
          obj.U7(new r());
          obj.U7(new k());
       }
       PatchProxy.onMethodExit(ResetPasswordByPhoneFragment.class, "2");
       return obj;
    }
    public int getLayoutResId(){
       Object obj = PatchProxy.apply(null, this, ResetPasswordByPhoneFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (f.b())? 0x7f0d131c: 0x7f0d131b;
       return i;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ResetPasswordByPhoneFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c5();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, ResetPasswordByPhoneFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(ResetPasswordByPhoneFragment.class, new c5());
       }else {
          obj.put(ResetPasswordByPhoneFragment.class, null);
       }
       return obj;
    }
}
