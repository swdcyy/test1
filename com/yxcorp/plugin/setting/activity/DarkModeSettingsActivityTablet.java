package com.yxcorp.plugin.setting.activity.DarkModeSettingsActivityTablet;
import com.yxcorp.plugin.setting.activity.DarkModeSettingsActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class DarkModeSettingsActivityTablet extends DarkModeSettingsActivity	// class@000805
{

    public void DarkModeSettingsActivityTablet(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, DarkModeSettingsActivityTablet.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
