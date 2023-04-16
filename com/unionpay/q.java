package com.unionpay.q;
import java.lang.Runnable;
import com.unionpay.WebViewJavascriptBridge;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.webkit.WebView;

public final class q implements Runnable	// class@001003
{
    public final String a;
    public final WebViewJavascriptBridge b;

    public void q(WebViewJavascriptBridge p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final void run(){
       this.b.mWebView.loadUrl(this.a);
    }
}
