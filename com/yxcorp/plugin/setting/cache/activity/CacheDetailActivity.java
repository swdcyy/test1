package com.yxcorp.plugin.setting.cache.activity.CacheDetailActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.yxcorp.plugin.setting.cache.fragment.CacheDetailFragment;

public class CacheDetailActivity extends SingleFragmentActivity	// class@000828
{
    public Fragment y;
    public static final int z;

    public void CacheDetailActivity(){
       super();
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, CacheDetailActivity.class, "4")) {
          return;
       }
       this.setResult(-1, new Intent());
       super.finish();
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, CacheDetailActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return null;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CacheDetailActivity.class, "2")) {
          return;
       }
       super.onCreate(p0);
       return;
    }
    public Fragment u3(){
       CacheDetailFragment obj = PatchProxy.apply(null, this, CacheDetailActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getIntent() == null || this.getIntent().getExtras() == null) {
          return new CacheDetailFragment();
       }
       obj = new CacheDetailFragment();
       this.y = obj;
       obj.setArguments(this.getIntent().getExtras());
       return this.y;
    }
    public boolean y3(){
       return true;
    }
}
