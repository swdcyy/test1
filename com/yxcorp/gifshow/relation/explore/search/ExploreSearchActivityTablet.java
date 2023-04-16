package com.yxcorp.gifshow.relation.explore.search.ExploreSearchActivityTablet;
import com.yxcorp.gifshow.relation.explore.search.ExploreSearchActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class ExploreSearchActivityTablet extends ExploreSearchActivity	// class@00186d
{

    public void ExploreSearchActivityTablet(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ExploreSearchActivityTablet.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
