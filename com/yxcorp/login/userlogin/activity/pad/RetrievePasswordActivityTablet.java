package com.yxcorp.login.userlogin.activity.pad.RetrievePasswordActivityTablet;
import com.yxcorp.login.userlogin.activity.RetrievePasswordActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class RetrievePasswordActivityTablet extends RetrievePasswordActivity	// class@001b1d
{

    public void RetrievePasswordActivityTablet(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, RetrievePasswordActivityTablet.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}