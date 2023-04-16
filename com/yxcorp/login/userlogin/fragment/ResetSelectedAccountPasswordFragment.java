package com.yxcorp.login.userlogin.fragment.ResetSelectedAccountPasswordFragment;
import hka.a;
import com.yxcorp.login.userlogin.fragment.LoginFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e2d.u1;
import com.yxcorp.login.userlogin.presenter.resetpassword.o;
import r2d.h0;
import r2d.i0;
import com.yxcorp.login.userlogin.presenter.resetpassword.u;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.feature.api.social.login.model.LoginParams;
import h3b.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kwai.framework.model.user.User;
import y1d.i5;
import java.util.Map;
import java.lang.Boolean;
import o1d.p;
import o1d.i;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.app.Activity;
import java.io.Serializable;
import ekd.j0;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import android.os.Parcelable;
import org.parceler.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.activity.GifshowActivity;
import zf6.l;
import ekd.i;
import i2b.a;

public class ResetSelectedAccountPasswordFragment extends LoginFragment implements a	// class@001b46
{
    public User r;
    public Map s;

    public void ResetSelectedAccountPasswordFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, ResetSelectedAccountPasswordFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new u1());
       obj.U7(new o());
       obj.U7(new h0());
       obj.U7(new i0());
       obj.U7(new u());
       PatchProxy.onMethodExit(ResetSelectedAccountPasswordFragment.class, "3");
       return obj;
    }
    public ClientContent$ContentPackage Q3(){
       LoginFragment obj = PatchProxy.apply(null, this, ResetSelectedAccountPasswordFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.l;
       if (obj.mLoginSource == null) {
          obj.mLoginSource = a.e();
       }
       ClientContent$ContentPackage uContentPack = super.Q3();
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       userPackage.identity = this.r.getId();
       uContentPack.userPackage = userPackage;
       return uContentPack;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ResetSelectedAccountPasswordFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i5();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, ResetSelectedAccountPasswordFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(ResetSelectedAccountPasswordFragment.class, new i5());
       }else {
          obj.put(ResetSelectedAccountPasswordFragment.class, null);
       }
       return obj;
    }
    public boolean onBackPressed(){
       Object[] objArray = null;
       ClientContent$ContentPackage obj = PatchProxy.apply(objArray, this, ResetSelectedAccountPasswordFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.Q3();
       if (!PatchProxy.applyVoidOneRefs(obj, objArray, p.class, "2")) {
          i.a("", 2, 0x76c6, obj);
       }
       return false;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResetSelectedAccountPasswordFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       if (this.getActivity() != null) {
          Intent intent = this.getActivity().getIntent();
          LoginUserResponse loginUserRes = j0.e(intent, "KEY_LOGIN_SELECTED_USER_RESPONSE");
          if (loginUserRes != null) {
             this.r = b.a(j0.d(intent, "KEY_LOGIN_SELECTED_USER_INFO"));
             this.s = loginUserRes.mTokenResetInfo;
          }
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ResetSelectedAccountPasswordFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().F2(this);
       }
       i.h(this.getActivity(), 0, l.r());
       return a.g(p0, 0x7f0d131d, p1, 0);
    }
}
