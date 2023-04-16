package com.yxcorp.plugin.setting.activity.CommentSettingActivity;
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
import com.yxcorp.plugin.setting.fragment.CommentSettingFragment;

public class CommentSettingActivity extends SingleFragmentActivity	// class@000801
{
    public BaseFragment y;
    public static final int z;

    public void CommentSettingActivity(){
       super();
    }
    public int M(){
       return 1;
    }
    public int f(){
       CommentSettingActivity obj = PatchProxy.apply(null, this, CommentSettingActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.y;
       int i = (obj != null)? obj.f(): 0;
       return i;
    }
    public int getPage(){
       return 45;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, CommentSettingActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       CommentSettingActivity obj = PatchProxy.apply(null, this, CommentSettingActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       String url = (obj != null)? obj.getUrl(): "";
       return url;
    }
    public Fragment u3(){
       CommentSettingFragment obj = PatchProxy.apply(null, this, CommentSettingActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PatchProxy.apply(null, null, CommentSettingFragment.class, "8");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = new CommentSettingFragment();
       }
       this.y = obj;
       return obj;
    }
    public boolean y3(){
       return true;
    }
}
