package com.kuaishou.webkit.extension.jscore.PackageFile;
import java.lang.Object;
import java.lang.String;
import java.lang.IllegalArgumentException;
import com.kuaishou.webkit.extension.jscore.PackageFile$Callback;
import com.kuaishou.webkit.WebViewFactoryProvider;
import com.kuaishou.webkit.WebViewFactory;
import com.kuaishou.webkit.extension.KsWebExtensionStatics;
import com.kuaishou.webkit.WebView;
import com.kuaishou.webkit.extension.jscore.PackageFile$EvaluateCallback;
import com.kuaishou.webkit.extension.jscore.JsContext;

public abstract class PackageFile	// class@001307
{

    public void PackageFile(){
       super();
    }
    public static void checkParam(String p0){
       if (p0 != null && !p0.isEmpty()) {
          return;
       }
       throw new IllegalArgumentException("Create Package failed, due to pkgFilePath is empty");
    }
    public static PackageFile createAsync(String p0,String p1,String p2,PackageFile$Callback p3){
       PackageFile.checkParam(p0);
       return WebViewFactory.getProvider().createPackageFile(p0, p1, p2, p3);
    }
    public static PackageFile createSync(String p0,String p1,String p2){
       PackageFile.checkParam(p0);
       return WebViewFactory.getProvider().createPackageFile(p0, p1, p2);
    }
    public static boolean isEvaluateJsListWithCallbackSupported(){
       return KsWebExtensionStatics.isPackageFileEvaluateJsListWithCallbackSupported();
    }
    public static boolean isLoadScriptSyncSupported(){
       return KsWebExtensionStatics.isLoadScriptSyncFromPackageFileSupported();
    }
    public static boolean isSupported(){
       return PackageFile.isEvaluateJsListWithCallbackSupported();
    }
    public abstract void compileJsList(WebView p0,String[] p1);
    public abstract void compileJsList(WebView p0,String[] p1,PackageFile$EvaluateCallback[] p2);
    public abstract void compileJsList(JsContext p0,String[] p1);
    public abstract void compileJsList(JsContext p0,String[] p1,PackageFile$EvaluateCallback[] p2);
    public abstract void destroy();
    public abstract void evaluateJsList(WebView p0,String[] p1);
    public abstract void evaluateJsList(WebView p0,String[] p1,PackageFile$EvaluateCallback[] p2);
    public abstract void evaluateJsList(JsContext p0,String[] p1);
    public abstract void evaluateJsList(JsContext p0,String[] p1,PackageFile$EvaluateCallback[] p2);
    public abstract String[] getFileList();
    public abstract boolean isValid();
    public abstract String readFile(String p0);
}
