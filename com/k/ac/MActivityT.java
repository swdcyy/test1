package com.k.ac.MActivityT;
import com.k.ac.MActivityF;
import android.content.res.Resources;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public final class MActivityT extends MActivityF	// class@0006f2
{

    public void MActivityT(){
       super();
    }
    public Resources getResources(){
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
