package com.yxcorp.login.userlogin.fragment.MultiRetrieveAccountSelectFragment;
import com.yxcorp.login.userlogin.fragment.LoginFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import r2d.c;
import m2d.a;
import com.yxcorp.login.userlogin.presenter.resetpassword.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import java.util.List;
import com.kwai.framework.model.user.User;
import y1d.v1;
import java.util.Map;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.app.Activity;
import java.io.Serializable;
import ekd.j0;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import com.yxcorp.login.http.response.ResetSelectResponse;
import zf6.l;
import ekd.i;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;

public class MultiRetrieveAccountSelectFragment extends LoginFragment	// class@001b36
{
    public List r;
    public Map s;
    public LoginUserResponse t;
    public ResetSelectResponse u;

    public void MultiRetrieveAccountSelectFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, MultiRetrieveAccountSelectFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new c());
       obj.U7(new a());
       obj.U7(new c());
       PatchProxy.onMethodExit(MultiRetrieveAccountSelectFragment.class, "3");
       return obj;
    }
    public ClientContent$ContentPackage Q3(){
       ClientContent$ContentPackage obj = PatchProxy.apply(null, this, MultiRetrieveAccountSelectFragment.class, "4");
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
       Object obj = PatchProxy.applyOneRefs(p0, this, MultiRetrieveAccountSelectFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new v1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, MultiRetrieveAccountSelectFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(MultiRetrieveAccountSelectFragment.class, new v1());
       }else {
          obj.put(MultiRetrieveAccountSelectFragment.class, null);
       }
       return obj;
    }
    public int getPage(){
       return 218;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiRetrieveAccountSelectFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       if (this.getActivity() != null) {
          Intent intent = this.getActivity().getIntent();
          LoginUserResponse loginUserRes = j0.e(intent, "KEY_LOGIN_MULTI_USER_RESPONSE");
          if (loginUserRes != null) {
             this.t = loginUserRes;
             this.r = loginUserRes.mMultiRetrieveUserInfo;
             this.s = loginUserRes.mTokenResetInfo;
          }
          this.u = j0.e(intent, "KEY_RESET_ACCOUNT_CHECKING");
          i.h(this.getActivity(), 0, l.r());
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MultiRetrieveAccountSelectFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0fe4, p1, false);
    }
}
