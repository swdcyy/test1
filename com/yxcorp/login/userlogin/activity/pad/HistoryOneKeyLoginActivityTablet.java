package com.yxcorp.login.userlogin.activity.pad.HistoryOneKeyLoginActivityTablet;
import com.yxcorp.login.userlogin.activity.HistoryOneKeyLoginActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class HistoryOneKeyLoginActivityTablet extends HistoryOneKeyLoginActivity	// class@001b15
{

    public void HistoryOneKeyLoginActivityTablet(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, HistoryOneKeyLoginActivityTablet.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}