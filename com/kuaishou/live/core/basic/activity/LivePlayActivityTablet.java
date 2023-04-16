package com.kuaishou.live.core.basic.activity.LivePlayActivityTablet;
import com.kuaishou.live.core.basic.activity.LivePlayActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public final class LivePlayActivityTablet extends LivePlayActivity	// class@00180c
{
    public HashMap O;

    public void LivePlayActivityTablet(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LivePlayActivityTablet.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
