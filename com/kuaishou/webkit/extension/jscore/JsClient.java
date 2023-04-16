package com.kuaishou.webkit.extension.jscore.JsClient;
import java.lang.String;

public interface abstract JsClient	// class@0012fe
{

    void onConsoleMessage(String p0,int p1,int p2,String p3);
    void onJsException(String p0,String p1,String p2);
}
