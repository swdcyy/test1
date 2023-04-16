package com.yxcorp.gifshow.relation.explore.activity.ExploreFriendActivityTablet;
import com.yxcorp.gifshow.relation.explore.activity.ExploreFriendActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class ExploreFriendActivityTablet extends ExploreFriendActivity	// class@0017ed
{

    public void ExploreFriendActivityTablet(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ExploreFriendActivityTablet.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
