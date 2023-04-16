package com.kwai.nearby.local.container.LocalSecondaryActivity;
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
import android.net.Uri;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.nearby.local.container.NearbySecondaryContainerFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class LocalSecondaryActivity extends SingleFragmentActivity	// class@000f82
{

    public void LocalSecondaryActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LocalSecondaryActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalSecondaryActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       return;
    }
    public Fragment u3(){
       LocalSecondaryActivity localSeconda = LocalSecondaryActivity.class;
       Intent obj = PatchProxy.apply(null, this, localSeconda, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getIntent();
       if (obj != null) {
          Uri data = obj.getData();
          if (data != null) {
             if (data.isHierarchical()) {
                NearbySecondaryContainerFragment nearbySecond = PatchProxy.apply(null, this, localSeconda, "3");
                if (nearbySecond != PatchProxyResult.class) {
                }else {
                   nearbySecond = new NearbySecondaryContainerFragment();
                }
                return nearbySecond;
             }else {
                this.finish();
                return null;
             }
          }
       }
       this.finish();
       return null;
    }
}
