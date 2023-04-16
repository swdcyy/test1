package com.yxcorp.login.debuglogin.DebugLoginActivity;
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
import androidx.fragment.app.Fragment;
import com.yxcorp.login.debuglogin.DebugLoginFragment;

public class DebugLoginActivity extends SingleFragmentActivity	// class@001aa6
{
    public DebugLoginFragment y;
    public static final int z;

    public void DebugLoginActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, DebugLoginActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public Fragment u3(){
       Object obj = PatchProxy.apply(null, this, DebugLoginActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.y == null) {
          this.y = new DebugLoginFragment();
       }
       return this.y;
    }
}
