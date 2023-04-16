package com.kuaishou.webkit.extension.KsWebView$1;
import com.kuaishou.webkit.extension.KsWebSettings;
import com.kuaishou.webkit.extension.KsWebView;
import com.kuaishou.webkit.WebSettings;
import com.kuaishou.webkit.WebView;

public class KsWebView$1 extends KsWebSettings	// class@0012e0
{
    public final KsWebView this$0;

    public void KsWebView$1(KsWebView p0){
       this.this$0 = p0;
       super();
    }
    public WebSettings getSetting(){
       return this.this$0.getWebView().getSettings();
    }
}
