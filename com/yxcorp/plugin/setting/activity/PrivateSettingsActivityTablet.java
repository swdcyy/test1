package com.yxcorp.plugin.setting.activity.PrivateSettingsActivityTablet;
import com.yxcorp.plugin.setting.activity.PrivateSettingsActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class PrivateSettingsActivityTablet extends PrivateSettingsActivity	// class@00080e
{

    public void PrivateSettingsActivityTablet(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PrivateSettingsActivityTablet.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
