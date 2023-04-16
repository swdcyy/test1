package com.facebook.react.bridge.JSBundleLoader$2;
import com.facebook.react.bridge.JSBundleLoader;
import android.content.Context;
import java.lang.String;
import com.facebook.react.bridge.JSBundleLoaderDelegate;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.res.AssetManager;

public final class JSBundleLoader$2 extends JSBundleLoader	// class@0011cf
{
    public final String val$assetUrl;
    public final String val$cacheKey;
    public final Context val$context;
    public final boolean val$loadSynchronously;

    public void JSBundleLoader$2(Context p0,String p1,boolean p2,String p3){
       this.val$context = p0;
       this.val$assetUrl = p1;
       this.val$loadSynchronously = p2;
       this.val$cacheKey = p3;
       super();
    }
    public String loadScript(JSBundleLoaderDelegate p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JSBundleLoader$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.loadScriptFromAssets(this.val$context.getAssets(), this.val$assetUrl, this.val$loadSynchronously, this.val$cacheKey);
       return this.val$assetUrl;
    }
}
