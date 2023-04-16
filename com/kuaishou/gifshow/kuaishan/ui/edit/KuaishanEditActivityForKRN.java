package com.kuaishou.gifshow.kuaishan.ui.edit.KuaishanEditActivityForKRN;
import com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public final class KuaishanEditActivityForKRN extends KuaiShanEditActivityV2	// class@001abc
{

    public void KuaishanEditActivityForKRN(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, KuaishanEditActivityForKRN.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
