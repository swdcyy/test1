package com.yxcorp.plugin.setting.cache.activity.hide.TopCacheActivity;
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
import com.yxcorp.plugin.setting.cache.fragment.hide.TopCacheFragment;

public class TopCacheActivity extends SingleFragmentActivity	// class@00082b
{
    public static final int y;

    public void TopCacheActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, TopCacheActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public Fragment u3(){
       Object obj = PatchProxy.apply(null, this, TopCacheActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TopCacheFragment();
    }
}
