package com.facebook.react.bridge.JSBundleLoader$6;
import com.facebook.react.bridge.JSBundleLoader;
import java.lang.String;
import com.facebook.react.bridge.JSBundleLoaderDelegate;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class JSBundleLoader$6 extends JSBundleLoader	// class@0011d3
{
    public final String val$proxySourceURL;
    public final String val$realSourceURL;

    public void JSBundleLoader$6(String p0,String p1){
       this.val$realSourceURL = p0;
       this.val$proxySourceURL = p1;
       super();
    }
    public String loadScript(JSBundleLoaderDelegate p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JSBundleLoader$6.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.setSourceURLs(this.val$realSourceURL, this.val$proxySourceURL);
       return this.val$realSourceURL;
    }
}
