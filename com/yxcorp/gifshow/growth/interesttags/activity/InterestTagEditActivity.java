package com.yxcorp.gifshow.growth.interesttags.activity.InterestTagEditActivity;
import com.yxcorp.gifshow.growth.interest.activity.BaseInterestTagEditActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class InterestTagEditActivity extends BaseInterestTagEditActivity	// class@0013c4
{

    public void InterestTagEditActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, InterestTagEditActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
