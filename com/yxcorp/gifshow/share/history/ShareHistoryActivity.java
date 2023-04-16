package com.yxcorp.gifshow.share.history.ShareHistoryActivity;
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
import com.yxcorp.gifshow.share.history.ShareHistoryFragment;
import android.content.Intent;
import android.os.Bundle;

public class ShareHistoryActivity extends SingleFragmentActivity	// class@001bab
{
    public static final int y;

    public void ShareHistoryActivity(){
       super();
    }
    public int M(){
       return 4;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ShareHistoryActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String o(){
       return "SHARE_HISTORY";
    }
    public Fragment u3(){
       ShareHistoryFragment obj = PatchProxy.apply(null, this, ShareHistoryActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ShareHistoryFragment();
       obj.setArguments(this.getIntent().getExtras());
       return obj;
    }
    public boolean y3(){
       return true;
    }
}
