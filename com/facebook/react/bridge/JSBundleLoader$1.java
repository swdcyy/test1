package com.facebook.react.bridge.JSBundleLoader$1;
import com.facebook.react.bridge.JSBundleLoader;
import android.content.Context;
import java.lang.String;
import com.facebook.react.bridge.JSBundleLoaderDelegate;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.res.AssetManager;

public final class JSBundleLoader$1 extends JSBundleLoader	// class@0011ce
{
    public final String val$assetUrl;
    public final Context val$context;
    public final boolean val$loadSynchronously;
    public final String val$sourceUrl;

    public void JSBundleLoader$1(Context p0,String p1,String p2,boolean p3){
       this.val$context = p0;
       this.val$assetUrl = p1;
       this.val$sourceUrl = p2;
       this.val$loadSynchronously = p3;
       super();
    }
    public String loadScript(JSBundleLoaderDelegate p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JSBundleLoader$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.loadScriptFromAssets(this.val$context.getAssets(), this.val$assetUrl, this.val$sourceUrl, this.val$loadSynchronously);
       return this.val$assetUrl;
    }
}
