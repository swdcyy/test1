package com.yxcorp.gifshow.albumwrapper.AlbumGifshowActivityTablet;
import com.yxcorp.gifshow.albumwrapper.AlbumGifshowActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class AlbumGifshowActivityTablet extends AlbumGifshowActivity	// class@001b46
{

    public void AlbumGifshowActivityTablet(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, AlbumGifshowActivityTablet.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
