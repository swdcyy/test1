package com.yxcorp.login.bind.ChangePhoneVerifyActivity;
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
import android.os.Bundle;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import androidx.fragment.app.Fragment;
import com.yxcorp.login.bind.fragment.PhoneVerifyFragment;

public class ChangePhoneVerifyActivity extends SingleFragmentActivity	// class@001a40
{
    public PhoneVerifyParams y;

    public void ChangePhoneVerifyActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ChangePhoneVerifyActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://bind/changephoneverify";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChangePhoneVerifyActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       return;
    }
    public Fragment u3(){
       Object obj = PatchProxy.apply(null, this, ChangePhoneVerifyActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PhoneVerifyFragment();
    }
}
