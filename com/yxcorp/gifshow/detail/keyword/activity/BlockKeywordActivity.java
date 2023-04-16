package com.yxcorp.gifshow.detail.keyword.activity.BlockKeywordActivity;
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
import com.yxcorp.gifshow.detail.keyword.fragment.BlockKeywordFragment;

public class BlockKeywordActivity extends SingleFragmentActivity	// class@001572
{
    public static final int y;

    public void BlockKeywordActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, BlockKeywordActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BlockKeywordActivity.class, "2")) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       return;
    }
    public Fragment u3(){
       Object obj = PatchProxy.apply(null, this, BlockKeywordActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BlockKeywordFragment();
    }
}
