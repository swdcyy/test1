package com.yxcorp.login.userlogin.activity.VerifyPhoneV2Activity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.os.Bundle;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import androidx.fragment.app.Fragment;
import com.yxcorp.login.userlogin.fragment.PhoneVerifyV2Fragment;

public class VerifyPhoneV2Activity extends SingleFragmentActivity	// class@001b12
{
    public PhoneVerifyParams y;

    public void VerifyPhoneV2Activity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, VerifyPhoneV2Activity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://VerifyPhoneV2Activity";
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, VerifyPhoneV2Activity.class, "3")) {
          return;
       }
       super.onBackPressed();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "CLICK_TO_CANCEL";
       u1.u(1, uElementPack, null);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VerifyPhoneV2Activity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       return;
    }
    public Fragment u3(){
       Object obj = PatchProxy.apply(null, this, VerifyPhoneV2Activity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PhoneVerifyV2Fragment();
    }
}
