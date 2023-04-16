package com.kuaishou.webkit.adapter.WebChromeClientAdapter$r;
import java.lang.Runnable;
import com.kuaishou.webkit.adapter.WebChromeClientAdapter;
import com.kuaishou.webkit.WebView$WebViewTransport;
import android.os.Message;
import java.lang.Object;
import com.kuaishou.webkit.WebView;
import android.webkit.WebView$WebViewTransport;
import android.view.View;
import android.webkit.WebView;

public class WebChromeClientAdapter$r implements Runnable	// class@0012ba
{
    public final Message message;
    public final WebChromeClientAdapter this$0;
    public final WebChromeClientAdapter webChromeClientAdapter;
    public final WebView$WebViewTransport webViewTransport;

    public void WebChromeClientAdapter$r(WebChromeClientAdapter p0,WebView$WebViewTransport p1,Message p2,WebChromeClientAdapter p3){
       this.this$0 = p0;
       super();
       this.webViewTransport = p1;
       this.message = p2;
       this.webChromeClientAdapter = p3;
    }
    public void run(){
       WebView webView = this.webViewTransport.getWebView();
       if (webView != null) {
          this.message.obj.setWebView(webView.getView());
       }
       this.message.sendToTarget();
       return;
    }
}
