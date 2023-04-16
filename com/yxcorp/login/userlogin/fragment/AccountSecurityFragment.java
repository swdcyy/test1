package com.yxcorp.login.userlogin.fragment.AccountSecurityFragment;
import hka.a;
import com.yxcorp.login.userlogin.fragment.LoginFragment;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import b3d.n;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import android.os.Build$VERSION;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f2d.d;
import f2d.h;
import com.yxcorp.login.userlogin.presenter.accountsecurity.t;
import com.kwai.sdk.switchconfig.a;
import f2d.j;
import androidx.fragment.app.Fragment;
import com.yxcorp.login.userlogin.presenter.accountsecurity.n;
import com.yxcorp.login.userlogin.presenter.accountsecurity.o;
import com.yxcorp.login.userlogin.presenter.accountsecurity.BindThirdPlatformPresenter;
import f2d.i;
import com.yxcorp.login.userlogin.presenter.accountsecurity.p;
import com.yxcorp.login.userlogin.presenter.accountsecurity.q;
import com.yxcorp.login.userlogin.presenter.accountsecurity.LoginDeviceManagementPresenter;
import com.yxcorp.login.userlogin.presenter.accountsecurity.a;
import com.yxcorp.login.userlogin.presenter.accountsecurity.v;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$FeatureSwitchPackage;
import com.kwai.framework.accountsecurity.d;
import java.util.Map;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import i2b.a;

public class AccountSecurityFragment extends LoginFragment implements a	// class@001b2a
{

    public void AccountSecurityFragment(){
       super();
    }
    public static boolean jh(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AccountSecurityFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean i = n.b(p0).a();
       Log.g("setting", "deviceSupportTouchID state: "+i);
       i = (Build$VERSION.SDK_INT >= 24 && (!i || i == 11))? true: false;
       return i;
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, AccountSecurityFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new d());
       obj.U7(new h());
       obj.U7(new t());
       if (!a.t().d("disableOpenApiAccountDeauthorize", false)) {
          obj.U7(new j());
       }
       if (AccountSecurityFragment.jh(this.requireContext())) {
          obj.U7(new n());
       }
       obj.U7(new o());
       obj.U7(new BindThirdPlatformPresenter());
       obj.U7(new i());
       obj.U7(new p());
       obj.U7(new q());
       obj.U7(new LoginDeviceManagementPresenter());
       obj.U7(new a());
       obj.U7(new v());
       PatchProxy.onMethodExit(AccountSecurityFragment.class, "3");
       return obj;
    }
    public ClientContent$ContentPackage Nf(){
       ClientContent$ContentPackage obj = PatchProxy.apply(null, this, AccountSecurityFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       ClientContent$FeatureSwitchPackage uFeatureSwit = new ClientContent$FeatureSwitchPackage();
       uFeatureSwit.name = "ACCOUNT_PROTECTION";
       boolean b = (d.c() == -1)? true: false;
       uFeatureSwit.on = b;
       obj.featureSwitchPackage = uFeatureSwit;
       return obj;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AccountSecurityFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(AccountSecurityFragment.class, null);
       return objectsByTag;
    }
    public boolean onBackPressed(){
       return false;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AccountSecurityFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AccountSecurityFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().F2(this);
       }
       return a.g(p0, 0x7f0d0020, p1, false);
    }
}
