package com.yxcorp.gifshow.gepush.v2.DyActivityT;
import com.yxcorp.gifshow.gepush.v2.DyActivityF;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public final class DyActivityT extends DyActivityF	// class@0012d8
{

    public void DyActivityT(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, DyActivityT.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
