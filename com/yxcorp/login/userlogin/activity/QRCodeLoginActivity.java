package com.yxcorp.login.userlogin.activity.QRCodeLoginActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import com.yxcorp.login.userlogin.fragment.QRCodeLoginFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import androidx.fragment.app.Fragment;

public class QRCodeLoginActivity extends SingleFragmentActivity	// class@001b0b
{
    public QRCodeLoginFragment y;

    public void QRCodeLoginActivity(){
       super();
       this.y = new QRCodeLoginFragment();
    }
    public int f(){
       Object obj = PatchProxy.apply(null, this, QRCodeLoginActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.y.f();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, QRCodeLoginActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       Object obj = PatchProxy.apply(null, this, QRCodeLoginActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.y.getUrl();
    }
    public Fragment u3(){
       return this.y;
    }
}
