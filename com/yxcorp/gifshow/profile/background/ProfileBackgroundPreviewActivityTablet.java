package com.yxcorp.gifshow.profile.background.ProfileBackgroundPreviewActivityTablet;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPreviewActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class ProfileBackgroundPreviewActivityTablet extends ProfileBackgroundPreviewActivity	// class@00122a
{

    public void ProfileBackgroundPreviewActivityTablet(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ProfileBackgroundPreviewActivityTablet.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
