package com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import java.lang.Object;
import android.app.Activity;
import android.content.res.Resources;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ii7.b;
import com.google.android.play.core.splitinstall.SplitInstallHelper;

public class AssetManagerHook	// class@00130c
{
    public static AssetManagerHook$b a;
    public static int b;

    public void AssetManagerHook(){
       super();
    }
    public static void loadSplitResourcesIfResourceOpening(Activity p0,Resources p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, AssetManagerHook.class, "1")) {
          return;
       }
       if (b.e) {
          SplitInstallHelper.loadResources(p0, p1);
       }
       return;
    }
}
