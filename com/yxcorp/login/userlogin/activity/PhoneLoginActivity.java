package com.yxcorp.login.userlogin.activity.PhoneLoginActivity;
import com.yxcorp.login.userlogin.fragment.LoginFragment$a;
import com.yxcorp.login.userlogin.activity.LoginActivity;
import com.yxcorp.login.userlogin.fragment.MailLoginV2Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.userlogin.fragment.PhoneLoginV3Fragment;
import com.yxcorp.login.userlogin.fragment.LoginFragment;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.content.Intent;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Integer;
import oe6.e;
import oe6.b;

public class PhoneLoginActivity extends LoginActivity implements LoginFragment$a	// class@001b09
{
    public MailLoginV2Fragment A;
    public PhoneLoginV3Fragment B;
    public Bundle z;

    public void PhoneLoginActivity(){
       super();
    }
    public int B3(){
       if (this.y instanceof MailLoginV2Fragment) {
          return 1;
       }
       return 2;
    }
    public final void C3(){
       if (PatchProxy.applyVoid(null, this, PhoneLoginActivity.class, "4")) {
          return;
       }
       this.A = new MailLoginV2Fragment();
       return;
    }
    public final void D3(){
       if (PatchProxy.applyVoid(null, this, PhoneLoginActivity.class, "3")) {
          return;
       }
       this.B = new PhoneLoginV3Fragment();
       return;
    }
    public final void E3(LoginFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhoneLoginActivity.class, "8")) {
          return;
       }
       p0.setArguments(this.z);
       p0.S2(p0);
       p0.b2(1);
       if (this.y != p0) {
          e uoe = this.getSupportFragmentManager().beginTransaction();
          if (!p0.isAdded()) {
             uoe = uoe.s(this.y);
             uoe.f(R.id.fragment_container, p0);
             uoe.l();
          }else {
             uoe.s(this.y).E(p0).l();
          }
          this.getSupportFragmentManager().executePendingTransactions();
          this.y = p0;
       }
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PhoneLoginActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhoneLoginActivity.class, "1")) {
          return;
       }
       if (p0 != null) {
          this.getIntent().putExtra("login_with_phone", p0.getBoolean("login_with_phone", true));
       }
       super.onCreate(p0);
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhoneLoginActivity.class, "2")) {
          return;
       }
       super.onSaveInstanceState(p0);
       p0.putBoolean("login_with_phone", this.y instanceof PhoneLoginV3Fragment);
       return;
    }
    public Fragment u3(){
       ViewGroup obj = PatchProxy.apply(null, this, PhoneLoginActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.findViewById(R.id.fragment_container);
       Bundle extras = (this.getIntent().getExtras() != null)? this.getIntent().getExtras(): new Bundle();
       this.z = extras;
       if (extras.getBoolean("login_force_email", false) || !this.z.getBoolean("login_with_phone", true)) {
          this.C3();
          this.A.setArguments(this.z);
          this.y = this.A;
       }else {
          this.D3();
          this.B.setArguments(this.z);
          this.y = this.B;
       }
       return this.y;
    }
    public void v1(int p0){
       PhoneLoginActivity phoneLoginAc = PhoneLoginActivity.class;
       if (PatchProxy.isSupport(phoneLoginAc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, phoneLoginAc, "6")) {
          return;
       }
       boolean b = false;
       String str = "login_with_phone";
       if (p0 == 2) {
          if (this.B == null) {
             this.z.putBoolean(str, true);
             PhoneLoginActivity tz = this.z;
             if (!e.i() && b.A() == 2) {
                b = true;
             }
             tz.putBoolean("IS_PHONE_PASSWORD_LOGIN", b);
             this.D3();
          }
          this.E3(this.B);
       }else if(p0 == 1){
          if (this.A == null) {
             this.z.putBoolean(str, b);
             this.C3();
          }
          this.E3(this.A);
       }
       return;
    }
}
