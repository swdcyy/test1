package com.kuaishou.webkit.WebViewFactory$WebViewContextWrapper;
import android.view.ContextThemeWrapper;
import android.content.Context;
import java.lang.ClassLoader;
import android.content.res.Resources;
import android.content.res.AssetManager;

public class WebViewFactory$WebViewContextWrapper extends ContextThemeWrapper	// class@001298
{
    public ClassLoader mClassLoader;
    public Resources mWebViewResources;

    public void WebViewFactory$WebViewContextWrapper(Context p0,ClassLoader p1,Resources p2){
       super(p0, 0x1030128);
       this.mWebViewResources = p2;
       this.mClassLoader = p1;
    }
    public AssetManager getAssets(){
       return this.mWebViewResources.getAssets();
    }
    public ClassLoader getClassLoader(){
       return this.mClassLoader;
    }
    public Resources getResources(){
       return this.mWebViewResources;
    }
}
