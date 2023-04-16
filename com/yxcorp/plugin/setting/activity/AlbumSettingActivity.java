package com.yxcorp.plugin.setting.activity.AlbumSettingActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
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
import com.yxcorp.plugin.setting.fragment.AlbumSettingFragment;

public class AlbumSettingActivity extends SingleFragmentActivity	// class@0007fb
{
    public BaseFragment y;
    public static final int z;

    public void AlbumSettingActivity(){
       super();
    }
    public int M(){
       return 1;
    }
    public int f(){
       AlbumSettingActivity obj = PatchProxy.apply(null, this, AlbumSettingActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.y;
       int i = (obj != null)? obj.f(): 0;
       return i;
    }
    public int getPage(){
       AlbumSettingActivity obj = PatchProxy.apply(null, this, AlbumSettingActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.y;
       int page = (obj != null)? obj.getPage(): 45;
       return page;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, AlbumSettingActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       AlbumSettingActivity obj = PatchProxy.apply(null, this, AlbumSettingActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       String url = (obj != null)? obj.getUrl(): "";
       return url;
    }
    public String o(){
       AlbumSettingActivity obj = PatchProxy.apply(null, this, AlbumSettingActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       String str = (obj != null)? obj.o(): "";
       return str;
    }
    public Fragment u3(){
       AlbumSettingFragment obj = PatchProxy.apply(null, this, AlbumSettingActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PatchProxy.apply(null, null, AlbumSettingFragment.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = new AlbumSettingFragment();
       }
       this.y = obj;
       return obj;
    }
    public boolean y3(){
       return true;
    }
}
