package com.yxcorp.gifshow.third.DyActivityJT;
import com.yxcorp.gifshow.third.DyActivityJF;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public final class DyActivityJT extends DyActivityJF	// class@001d8f
{

    public void DyActivityJT(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, DyActivityJT.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
