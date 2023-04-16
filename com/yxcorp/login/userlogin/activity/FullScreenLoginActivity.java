package com.yxcorp.login.userlogin.activity.FullScreenLoginActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.utility.RomUtils;
import qka.a;
import android.os.Build$VERSION;
import android.view.Window;
import android.app.Activity;
import qka.b;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.login.userlogin.fragment.LoginFragment;
import o1d.m;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import android.os.Bundle;
import com.yxcorp.login.userlogin.loginentryhelper.LoginEntrancePageManager;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import com.yxcorp.login.userlogin.fragment.FullScreenLoginFragment;

public class FullScreenLoginActivity extends SingleFragmentActivity	// class@001b03
{
    public FullScreenLoginFragment y;
    public j z;

    public void FullScreenLoginActivity(){
       super();
    }
    public int M(){
       return 1;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, FullScreenLoginActivity.class, "5")) {
          return;
       }
       super.finish();
       if (RomUtils.n() && (a.a() && Build$VERSION.SDK_INT < 28)) {
          b.b(this.getWindow());
       }
    label_0028 :
       return;
    }
    public int getPage(){
       return 0x7d43;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, FullScreenLoginActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onBackPressed(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FullScreenLoginActivity.class, "6")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = this.y.Q3();
       if (!PatchProxy.applyVoidOneRefs(uContentPack, objArray, m.class, "1")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = 824;
          u1.u(1, uElementPack, uContentPack);
       }
       this.finish();
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FullScreenLoginActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       b.a(this.getWindow());
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, FullScreenLoginActivity.class, "3")) {
          return;
       }
       super.onResume();
       b.a(this.getWindow());
       LoginEntrancePageManager.e.b();
       return;
    }
    public void onWindowFocusChanged(boolean p0){
       FullScreenLoginActivity uFullScreenL = FullScreenLoginActivity.class;
       if (PatchProxy.isSupport(uFullScreenL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uFullScreenL, "4")) {
          return;
       }
       super.onWindowFocusChanged(p0);
       if (p0) {
          b.a(this.getWindow());
       }
       return;
    }
    public Fragment u3(){
       Bundle obj = PatchProxy.apply(null, this, FullScreenLoginActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.getIntent().getExtras() != null)? this.getIntent().getExtras(): new Bundle();
       FullScreenLoginFragment uFullScreenL = new FullScreenLoginFragment();
       this.y = uFullScreenL;
       uFullScreenL.setArguments(obj);
       return this.y;
    }
}
