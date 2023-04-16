package com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsActivity;
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
import com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment;

public class LiveSensitiveWordsActivity extends SingleFragmentActivity	// class@000f44
{

    public void LiveSensitiveWordsActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LiveSensitiveWordsActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://sensitivewords";
    }
    public Fragment u3(){
       Object obj = PatchProxy.apply(null, this, LiveSensitiveWordsActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveSensitiveWordsFragment();
    }
}
