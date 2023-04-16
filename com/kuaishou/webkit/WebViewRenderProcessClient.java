package com.kuaishou.webkit.WebViewRenderProcessClient;
import java.lang.Object;
import com.kuaishou.webkit.WebView;
import com.kuaishou.webkit.WebViewRenderProcess;

public abstract class WebViewRenderProcessClient	// class@0012a1
{

    public void WebViewRenderProcessClient(){
       super();
    }
    public abstract void onRenderProcessResponsive(WebView p0,WebViewRenderProcess p1);
    public abstract void onRenderProcessUnresponsive(WebView p0,WebViewRenderProcess p1);
}
