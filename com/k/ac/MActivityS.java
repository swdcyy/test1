package com.k.ac.MActivityS;
import com.k.ac.MActivityF;
import android.content.res.Resources;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public final class MActivityS extends MActivityF	// class@0006f1
{

    public void MActivityS(){
       super();
    }
    public Resources getResources(){
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
