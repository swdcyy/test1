package com.yxcorp.login.userlogin.fragment.MultiLoginAccountSelectFragment;
import com.yxcorp.login.userlogin.fragment.LoginFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import m2d.b;
import m2d.a;
import m2d.e;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import java.util.List;
import com.kwai.framework.model.user.User;
import y1d.p1;
import java.util.Map;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.app.Activity;
import java.io.Serializable;
import ekd.j0;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;

public class MultiLoginAccountSelectFragment extends LoginFragment	// class@001b35
{
    public List r;
    public Map s;
    public String t;
    public int u;

    public void MultiLoginAccountSelectFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, MultiLoginAccountSelectFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new b());
       obj.U7(new a());
       obj.U7(new e());
       PatchProxy.onMethodExit(MultiLoginAccountSelectFragment.class, "3");
       return obj;
    }
    public ClientContent$ContentPackage Q3(){
       ClientContent$ContentPackage obj = PatchProxy.apply(null, this, MultiLoginAccountSelectFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.Q3();
       ClientContent$BatchUserPackage uBatchUserPa = new ClientContent$BatchUserPackage();
       ClientContent$UserPackage[] userPackageA = new ClientContent$UserPackage[2];
       for (int i = 0; i < 2; i = i + 1) {
          ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
          userPackage.identity = this.r.get(i).getId();
          userPackageA[i] = userPackage;
       }
       uBatchUserPa.userPackage = userPackageA;
       obj.batchUserPackage = uBatchUserPa;
       return obj;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MultiLoginAccountSelectFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, MultiLoginAccountSelectFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(MultiLoginAccountSelectFragment.class, new p1());
       }else {
          obj.put(MultiLoginAccountSelectFragment.class, null);
       }
       return obj;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiLoginAccountSelectFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       if (this.getActivity() != null) {
          Intent intent = this.getActivity().getIntent();
          LoginUserResponse loginUserRes = j0.e(intent, "KEY_LOGIN_MULTI_USER_RESPONSE");
          if (loginUserRes != null) {
             this.r = loginUserRes.mMultiUserInfo;
             this.s = loginUserRes.mTokenLoginInfo;
             this.t = j0.f(intent, "KEY_LOGIN_MULTI_USER_FULL_PHONE");
             this.u = j0.b(intent, "KEY_MULTI_ACCOUNT_LOGIN_SOURCE", 0);
          }
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MultiLoginAccountSelectFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0fe3, p1, false);
    }
}
