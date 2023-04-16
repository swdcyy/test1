package com.kuaishou.webkit.WebView$WebViewTransport;
import com.kuaishou.webkit.WebView;
import java.lang.Object;

public class WebView$WebViewTransport	// class@00128d
{
    public WebView mWebview;
    public final WebView this$0;

    public void WebView$WebViewTransport(WebView p0){
       this.this$0 = p0;
       super();
    }
    public synchronized WebView getWebView(){
       return this.mWebview;
    }
    public synchronized void setWebView(WebView p0){
       this.mWebview = p0;
    }
}
