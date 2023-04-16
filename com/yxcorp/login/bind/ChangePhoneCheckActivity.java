package com.yxcorp.login.bind.ChangePhoneCheckActivity;
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
import android.content.Intent;
import com.yxcorp.login.bind.fragment.ChangePhoneLoadingFragment;

public class ChangePhoneCheckActivity extends SingleFragmentActivity	// class@001a3f
{
    public static final int y;

    public void ChangePhoneCheckActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ChangePhoneCheckActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://bind/changephonecheck";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChangePhoneCheckActivity.class, "2")) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       return;
    }
    public Fragment u3(){
       Object[] objArray = null;
       Bundle obj = PatchProxy.apply(objArray, this, ChangePhoneCheckActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getIntent().getExtras();
       ChangePhoneLoadingFragment uChangePhone = PatchProxy.applyOneRefs(obj, objArray, ChangePhoneLoadingFragment.class, "1");
       if (uChangePhone != PatchProxyResult.class) {
       }else {
          uChangePhone = new ChangePhoneLoadingFragment();
          uChangePhone.setArguments(obj);
       }
       return uChangePhone;
    }
}
