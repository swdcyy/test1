package com.kuaishou.webkit.extension.jscore.JsContext;
import java.util.HashSet;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import android.os.Looper;
import com.kuaishou.webkit.internal.KsWebViewUtils;
import com.kuaishou.webkit.WebViewFactoryProvider;
import com.kuaishou.webkit.WebViewFactory;
import java.io.File;
import com.kuaishou.webkit.extension.jscore.IJsContext;
import java.lang.Exception;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import com.kuaishou.webkit.extension.jscore.PackageFile$EvaluateCallback;
import com.kuaishou.webkit.extension.jscore.JsClient;

public final class JsContext	// class@001300
{
    public IJsContext mJsContext;
    public String mName;
    public static HashSet sNames;

    static {
       JsContext.sNames = new HashSet();
    }
    public void JsContext(Context p0,String p1){
       super();
       if (p1 == null || !p1.length()) {
          throw new IllegalArgumentException("Create JsContext failed:Name can not be empty.");
       }
       if (JsContext.sNames.contains(p1)) {
          throw new IllegalArgumentException("Create JsContext failed:Name can not be duplicated.");
       }
       this.mName = p1;
       JsContext.sNames.add(p1);
       if (Looper.getMainLooper() != Looper.myLooper()) {
          throw new IllegalArgumentException("Create JsContext failed:JsContext must be created on Main Thread.");
       }
       if (KsWebViewUtils.useSysWebView()) {
          throw new IllegalArgumentException("Create JsContext failed:KsWebView load failed.");
       }
       try{
          this.mJsContext = WebViewFactory.getProvider().createJsContext(p0, p1, null, null);
          return;
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
          throw new IllegalArgumentException("Create JsContext failed:"+e3.toString());
       }
    }
    public void addJavascriptInterface(Object p0,String p1){
       this.mJsContext.addJavascriptInterface(this.mJsContext, p0, p1);
    }
    public void crashMe(){
       this.mJsContext.setData("__crash_me", "1");
    }
    public void destroy(){
       this.mJsContext.destroy();
       JsContext.sNames.remove(this.mName);
       this.mName = null;
       this.mJsContext = null;
    }
    public void evaluateJavascript(String p0){
       this.mJsContext.evaluateJavascript(p0);
    }
    public void evaluateJsList(long p0,String[] p1,boolean p2){
       this.mJsContext.evaluateJsList(p0, p1, p2);
    }
    public void evaluateJsList(long p0,String[] p1,boolean p2,PackageFile$EvaluateCallback[] p3){
       this.mJsContext.evaluateJsList(p0, p1, p2, p3);
    }
    public boolean importScripts(String p0){
       return this.mJsContext.importScripts(p0);
    }
    public void initScriptPath(String p0,String p1,String p2){
       this.mJsContext.initScriptPath(p0, p1, p2);
    }
    public void loadUrl(String p0){
       this.mJsContext.loadUrl(p0);
    }
    public void preCachedApi(String p0,Object p1){
       try{
          this.mJsContext.setData("__cache_api|"+p0, p1.toString());
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void removeJavascriptInterface(String p0){
       this.mJsContext.removeJavascriptInterface(p0);
    }
    public void setAPILog(int p0){
       this.mJsContext.setData("__api_log", p0);
    }
    public void setClient(JsClient p0){
       this.mJsContext.setJsClient(p0);
    }
    public void setCustomData(String p0,String p1){
       this.mJsContext.setData("__custom_data|"+p0, p1);
    }
    public void setData(String p0,String p1){
       if (!p0.startsWith("__")) {
          return;
       }
       throw new IllegalArgumentException("setData\'s key can not satrt with \'__\'!");
    }
    public void setStorageId(String p0){
       this.mJsContext.setData("__storage_id", p0);
    }
}
