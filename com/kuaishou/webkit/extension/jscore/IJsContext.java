package com.kuaishou.webkit.extension.jscore.IJsContext;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.webkit.extension.jscore.PackageFile$EvaluateCallback;
import com.kuaishou.webkit.extension.jscore.JsClient;

public interface abstract IJsContext	// class@0012fc
{

    void addJavascriptInterface(Object p0,Object p1,String p2);
    void destroy();
    void evaluateJavascript(String p0);
    void evaluateJsList(long p0,String[] p1,boolean p2);
    void evaluateJsList(long p0,String[] p1,boolean p2,PackageFile$EvaluateCallback[] p3);
    boolean importScripts(String p0);
    void initScriptPath(String p0,String p1,String p2);
    void loadUrl(String p0);
    void removeJavascriptInterface(String p0);
    void setData(String p0,String p1);
    void setJsClient(JsClient p0);
}
