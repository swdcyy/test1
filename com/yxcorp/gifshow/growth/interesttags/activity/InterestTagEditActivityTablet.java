package com.yxcorp.gifshow.growth.interesttags.activity.InterestTagEditActivityTablet;
import com.yxcorp.gifshow.growth.interesttags.activity.InterestTagEditActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public final class InterestTagEditActivityTablet extends InterestTagEditActivity	// class@0013c5
{

    public void InterestTagEditActivityTablet(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, InterestTagEditActivityTablet.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
