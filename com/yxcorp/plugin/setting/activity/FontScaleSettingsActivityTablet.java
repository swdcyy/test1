package com.yxcorp.plugin.setting.activity.FontScaleSettingsActivityTablet;
import com.yxcorp.plugin.setting.activity.FontScaleSettingsActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class FontScaleSettingsActivityTablet extends FontScaleSettingsActivity	// class@000809
{

    public void FontScaleSettingsActivityTablet(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, FontScaleSettingsActivityTablet.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
