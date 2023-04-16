package com.yxcorp.gifshow.detail.PhotoDetailActivityTablet;
import com.yxcorp.gifshow.detail.PhotoDetailActivity;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.res.Resources;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class PhotoDetailActivityTablet extends PhotoDetailActivity	// class@001341
{

    public void PhotoDetailActivityTablet(){
       super();
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoDetailActivityTablet.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(PhotoDetailActivityTablet.class, null);
       return objectsByTag;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailActivityTablet.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
