package com.yxcorp.gifshow.activity.URLRouterActivity;
import android.app.Activity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.content.Context;
import o56.f;

public class URLRouterActivity extends Activity	// class@001036
{

    public void URLRouterActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, URLRouterActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, URLRouterActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       f.e(this, this.getIntent().getData());
       this.finish();
       return;
    }
}
