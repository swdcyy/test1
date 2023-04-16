package com.kuaishou.live.core.basic.activity.LiveSlideActivityTablet;
import com.kuaishou.live.core.basic.activity.LiveSlideActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public final class LiveSlideActivityTablet extends LiveSlideActivity	// class@001828
{
    public HashMap I;

    public void LiveSlideActivityTablet(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LiveSlideActivityTablet.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
