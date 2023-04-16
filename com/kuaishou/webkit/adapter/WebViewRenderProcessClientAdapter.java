package com.kuaishou.webkit.adapter.WebViewRenderProcessClientAdapter;
import android.webkit.WebViewRenderProcessClient;
import com.kuaishou.webkit.WebView;
import com.kuaishou.webkit.WebViewRenderProcessClient;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import com.kuaishou.webkit.adapter.WebViewRenderProcessAdapter;
import com.kuaishou.webkit.WebViewRenderProcess;

public class WebViewRenderProcessClientAdapter extends WebViewRenderProcessClient	// class@0012ca
{
    public WebViewRenderProcessClient mStub;
    public WebView mWebView;

    public void WebViewRenderProcessClientAdapter(WebView p0,WebViewRenderProcessClient p1){
       super();
       this.mWebView = p0;
       this.mStub = p1;
    }
    public WebViewRenderProcessClient getStub(){
       return this.mStub;
    }
    public void onRenderProcessResponsive(WebView p0,WebViewRenderProcess p1){
       WebViewRenderProcessClientAdapter tmStub = this.mStub;
       WebViewRenderProcessClientAdapter tmWebView = this.mWebView;
       WebViewRenderProcessAdapter webViewRende = (p1 != null)? new WebViewRenderProcessAdapter(p1): null;
       tmStub.onRenderProcessResponsive(tmWebView, webViewRende);
       return;
    }
    public void onRenderProcessUnresponsive(WebView p0,WebViewRenderProcess p1){
       WebViewRenderProcessClientAdapter tmStub = this.mStub;
       WebViewRenderProcessClientAdapter tmWebView = this.mWebView;
       WebViewRenderProcessAdapter webViewRende = (p1 != null)? new WebViewRenderProcessAdapter(p1): null;
       tmStub.onRenderProcessUnresponsive(tmWebView, webViewRende);
       return;
    }
}
