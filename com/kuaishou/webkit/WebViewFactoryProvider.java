package com.kuaishou.webkit.WebViewFactoryProvider;
import android.content.Context;
import java.lang.String;
import java.io.File;
import com.kuaishou.webkit.extension.jscore.IJsContext;
import com.kuaishou.webkit.extension.jscore.PackageFile;
import com.kuaishou.webkit.extension.jscore.PackageFile$Callback;
import com.kuaishou.webkit.WebView;
import com.kuaishou.webkit.WebView$PrivateAccess;
import com.kuaishou.webkit.WebViewProvider;
import com.kuaishou.webkit.CookieManager;
import java.lang.Object;
import android.os.Bundle;
import com.kuaishou.webkit.GeolocationPermissions;
import com.kuaishou.webkit.extension.MemoryCacheInjector;
import com.kuaishou.webkit.ServiceWorkerController;
import com.kuaishou.webkit.WebViewFactoryProvider$Statics;
import com.kuaishou.webkit.TokenBindingService;
import com.kuaishou.webkit.TracingController;
import com.kuaishou.webkit.WebIconDatabase;
import com.kuaishou.webkit.WebStorage;
import java.lang.ClassLoader;
import com.kuaishou.webkit.WebViewDatabase;

public interface abstract WebViewFactoryProvider	// class@00129b
{

    IJsContext createJsContext(Context p0,String p1,File p2,String p3);
    PackageFile createPackageFile(String p0,String p1,String p2);
    PackageFile createPackageFile(String p0,String p1,String p2,PackageFile$Callback p3);
    WebViewProvider createWebView(WebView p0,WebView$PrivateAccess p1);
    CookieManager getCookieManager();
    Object getExtensionSetting(int p0);
    Object getExtensionSetting(int p0,Bundle p1);
    GeolocationPermissions getGeolocationPermissions();
    MemoryCacheInjector getMemoryCacheInjector();
    ServiceWorkerController getServiceWorkerController();
    WebViewFactoryProvider$Statics getStatics();
    TokenBindingService getTokenBindingService();
    TracingController getTracingController();
    WebIconDatabase getWebIconDatabase();
    WebStorage getWebStorage();
    ClassLoader getWebViewClassLoader();
    WebViewDatabase getWebViewDatabase(Context p0);
    boolean setExtensionSetting(int p0,Bundle p1);
    boolean setExtensionSetting(int p0,Object p1);
}
