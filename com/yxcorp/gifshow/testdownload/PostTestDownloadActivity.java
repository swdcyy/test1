package com.yxcorp.gifshow.testdownload.PostTestDownloadActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;

public final class PostTestDownloadActivity extends GifshowActivity	// class@001d8b
{

    public void PostTestDownloadActivity(){
       super();
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, PostTestDownloadActivity.class, "2")) {
          return;
       }
       super.finish();
       this.overridePendingTransition(0, 0);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PostTestDownloadActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostTestDownloadActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.overridePendingTransition(0, 0);
       this.finish();
       return;
    }
}
