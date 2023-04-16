package com.yxcorp.gifshow.gepush.v2.DyActivityS;
import com.yxcorp.gifshow.gepush.v2.DyActivityF;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public final class DyActivityS extends DyActivityF	// class@0012d7
{

    public void DyActivityS(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, DyActivityS.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
