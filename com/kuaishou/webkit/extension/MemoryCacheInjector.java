package com.kuaishou.webkit.extension.MemoryCacheInjector;
import java.lang.Object;
import com.kuaishou.webkit.internal.KsWebViewUtils;
import com.kuaishou.webkit.WebViewFactoryProvider;
import com.kuaishou.webkit.WebViewFactory;
import com.kuaishou.webkit.extension.KsWebExtensionStatics;
import java.lang.String;
import java.util.Map;

public abstract class MemoryCacheInjector	// class@0012f6
{

    public void MemoryCacheInjector(){
       super();
    }
    public static MemoryCacheInjector getInstance(){
       if (KsWebViewUtils.useSysWebView() || !MemoryCacheInjector.isSupported()) {
          return null;
       }
       return WebViewFactory.getProvider().getMemoryCacheInjector();
    }
    public static boolean isSupported(){
       return KsWebExtensionStatics.isMemoryCacheInjectorSupported();
    }
    public abstract void injectResource(String p0,int p1,Map p2,byte[] p3,byte[] p4);
    public abstract void injectResources(String[] p0,int p1,Map p2,byte[] p3,byte[] p4);
    public abstract void removeAllInjectedResources();
    public abstract void removeInjectedResources(String[] p0);
}
