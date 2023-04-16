package com.kuaishou.webkit.adapter.WebViewClientAdapter;
import android.webkit.WebViewClient;
import com.kuaishou.webkit.WebView;
import com.kuaishou.webkit.WebViewClient;
import android.webkit.WebView;
import java.lang.String;
import com.kuaishou.webkit.extension.KsWebExtensionStatics;
import android.os.Message;
import android.graphics.Bitmap;
import android.webkit.ClientCertRequest;
import com.kuaishou.webkit.adapter.ClientCertRequestAdapter;
import com.kuaishou.webkit.ClientCertRequest;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceError;
import com.kuaishou.webkit.adapter.WebResourceRequestAdapter;
import com.kuaishou.webkit.adapter.WebResourceErrorAdapter;
import com.kuaishou.webkit.WebResourceRequest;
import com.kuaishou.webkit.WebResourceError;
import android.webkit.HttpAuthHandler;
import com.kuaishou.webkit.adapter.HttpAuthHandlerAdapter;
import com.kuaishou.webkit.HttpAuthHandler;
import android.webkit.WebResourceResponse;
import com.kuaishou.webkit.WebResourceResponse;
import java.util.Map;
import java.io.InputStream;
import android.webkit.SslErrorHandler;
import android.net.http.SslError;
import com.kuaishou.webkit.adapter.SslErrorHandlerAdapter;
import com.kuaishou.webkit.SslErrorHandler;
import android.webkit.RenderProcessGoneDetail;
import com.kuaishou.webkit.adapter.RenderProcessGoneDetailAdapter;
import com.kuaishou.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import com.kuaishou.webkit.adapter.SafeBrowsingResponseAdapter;
import com.kuaishou.webkit.SafeBrowsingResponse;
import android.view.InputEvent;
import android.view.KeyEvent;
import java.lang.Exception;

public class WebViewClientAdapter extends WebViewClient	// class@0012c7
{
    public WebViewClient mStub;
    public WebView mWebView;

    public void WebViewClientAdapter(WebView p0,WebViewClient p1){
       super();
       this.mWebView = p0;
       this.mStub = p1;
    }
    public void doUpdateVisitedHistory(WebView p0,String p1,boolean p2){
       this.mStub.doUpdateVisitedHistory(this.mWebView, p1, p2);
       KsWebExtensionStatics.onPageLoad(p1, 4, true, "");
    }
    public WebViewClient getStub(){
       return this.mStub;
    }
    public void onFormResubmission(WebView p0,Message p1,Message p2){
       this.mStub.onFormResubmission(this.mWebView, p1, p2);
    }
    public void onLoadResource(WebView p0,String p1){
       this.mStub.onLoadResource(this.mWebView, p1);
    }
    public void onPageCommitVisible(WebView p0,String p1){
       this.mStub.onPageCommitVisible(this.mWebView, p1);
    }
    public void onPageFinished(WebView p0,String p1){
       this.mStub.onPageFinished(this.mWebView, p1);
       KsWebExtensionStatics.onPageLoad(p1, 2, true, "");
    }
    public void onPageStarted(WebView p0,String p1,Bitmap p2){
       this.mStub.onPageStarted(this.mWebView, p1, p2);
       KsWebExtensionStatics.onPageLoad(p1, 1, 1, "");
    }
    public void onReceivedClientCertRequest(WebView p0,ClientCertRequest p1){
       WebViewClientAdapter tmStub = this.mStub;
       WebViewClientAdapter tmWebView = this.mWebView;
       ClientCertRequestAdapter uClientCertR = (p1 != null)? new ClientCertRequestAdapter(p1): null;
       tmStub.onReceivedClientCertRequest(tmWebView, uClientCertR);
       return;
    }
    public void onReceivedError(WebView p0,int p1,String p2,String p3){
       this.mStub.onReceivedError(this.mWebView, p1, p2, p3);
    }
    public void onReceivedError(WebView p0,WebResourceRequest p1,WebResourceError p2){
       WebViewClientAdapter tmStub = this.mStub;
       WebViewClientAdapter tmWebView = this.mWebView;
       WebResourceErrorAdapter webResourceE = null;
       WebResourceRequestAdapter webResourceR = (p1 != null)? new WebResourceRequestAdapter(p1): webResourceE;
       if (p2 != null) {
          webResourceE = new WebResourceErrorAdapter(p2);
       }
       tmStub.onReceivedError(tmWebView, webResourceR, webResourceE);
       return;
    }
    public void onReceivedHttpAuthRequest(WebView p0,HttpAuthHandler p1,String p2,String p3){
       WebViewClientAdapter tmStub = this.mStub;
       WebViewClientAdapter tmWebView = this.mWebView;
       HttpAuthHandlerAdapter httpAuthHand = (p1 != null)? new HttpAuthHandlerAdapter(p1): null;
       tmStub.onReceivedHttpAuthRequest(tmWebView, httpAuthHand, p2, p3);
       return;
    }
    public void onReceivedHttpError(WebView p0,WebResourceRequest p1,WebResourceResponse p2){
       WebResourceRequestAdapter webResourceR = null;
       if (p2 != null) {
          WebResourceResponse webResourceR1 = new WebResourceResponse(false, p2.getMimeType(), p2.getEncoding(), p2.getStatusCode(), p2.getReasonPhrase(), p2.getResponseHeaders(), p2.getData());
       }else {
          WebResourceRequestAdapter webResourceR2 = webResourceR;
       }
       WebViewClientAdapter tmStub = this.mStub;
       WebViewClientAdapter tmWebView = this.mWebView;
       if (p1 != null) {
          webResourceR = new WebResourceRequestAdapter(p1);
       }
       tmStub.onReceivedHttpError(tmWebView, webResourceR, v8);
       return;
    }
    public void onReceivedLoginRequest(WebView p0,String p1,String p2,String p3){
       this.mStub.onReceivedLoginRequest(this.mWebView, p1, p2, p3);
    }
    public void onReceivedSslError(WebView p0,SslErrorHandler p1,SslError p2){
       WebViewClientAdapter tmStub = this.mStub;
       WebViewClientAdapter tmWebView = this.mWebView;
       SslErrorHandlerAdapter sslErrorHand = (p1 != null)? new SslErrorHandlerAdapter(p1): null;
       tmStub.onReceivedSslError(tmWebView, sslErrorHand, p2);
       return;
    }
    public boolean onRenderProcessGone(WebView p0,RenderProcessGoneDetail p1){
       WebViewClientAdapter tmStub = this.mStub;
       WebViewClientAdapter tmWebView = this.mWebView;
       RenderProcessGoneDetailAdapter renderProces = (p1 != null)? new RenderProcessGoneDetailAdapter(p1): null;
       return tmStub.onRenderProcessGone(tmWebView, renderProces);
    }
    public void onSafeBrowsingHit(WebView p0,WebResourceRequest p1,int p2,SafeBrowsingResponse p3){
       WebViewClientAdapter tmStub = this.mStub;
       WebViewClientAdapter tmWebView = this.mWebView;
       SafeBrowsingResponseAdapter safeBrowsing = null;
       WebResourceRequestAdapter webResourceR = (p1 != null)? new WebResourceRequestAdapter(p1): safeBrowsing;
       if (p3 != null) {
          safeBrowsing = new SafeBrowsingResponseAdapter(p3);
       }
       tmStub.onSafeBrowsingHit(tmWebView, webResourceR, p2, safeBrowsing);
       return;
    }
    public void onScaleChanged(WebView p0,float p1,float p2){
       this.mStub.onScaleChanged(this.mWebView, p1, p2);
    }
    public void onTooManyRedirects(WebView p0,Message p1,Message p2){
       this.mStub.onTooManyRedirects(this.mWebView, p1, p2);
    }
    public void onUnhandledInputEvent(WebView p0,InputEvent p1){
       this.mStub.onUnhandledInputEvent(this.mWebView, p1);
    }
    public void onUnhandledKeyEvent(WebView p0,KeyEvent p1){
       this.mStub.onUnhandledKeyEvent(this.mWebView, p1);
    }
    public WebResourceResponse shouldInterceptRequest(WebView p0,WebResourceRequest p1){
       WebViewClientAdapter tmStub = this.mStub;
       WebViewClientAdapter tmWebView = this.mWebView;
       WebResourceRequestAdapter webResourceR = (p1 != null)? new WebResourceRequestAdapter(p1): null;
       WebResourceResponse webResourceR1 = tmStub.shouldInterceptRequest(tmWebView, webResourceR);
       if (webResourceR1 == null) {
          return null;
       }else {
          return this.toSysWebResourceResponse(webResourceR1);
       }
    }
    public WebResourceResponse shouldInterceptRequest(WebView p0,String p1){
       WebResourceResponse webResourceR = this.mStub.shouldInterceptRequest(this.mWebView, p1);
       if (webResourceR == null) {
          return null;
       }
       return this.toSysWebResourceResponse(webResourceR);
    }
    public boolean shouldOverrideKeyEvent(WebView p0,KeyEvent p1){
       return this.mStub.shouldOverrideKeyEvent(this.mWebView, p1);
    }
    public boolean shouldOverrideUrlLoading(WebView p0,WebResourceRequest p1){
       WebViewClientAdapter tmStub = this.mStub;
       WebViewClientAdapter tmWebView = this.mWebView;
       WebResourceRequestAdapter webResourceR = (p1 != null)? new WebResourceRequestAdapter(p1): null;
       return tmStub.shouldOverrideUrlLoading(tmWebView, webResourceR);
    }
    public boolean shouldOverrideUrlLoading(WebView p0,String p1){
       return this.mStub.shouldOverrideUrlLoading(this.mWebView, p1);
    }
    public final WebResourceResponse toSysWebResourceResponse(WebResourceResponse p0){
       WebResourceResponse webResourceR = new WebResourceResponse(p0.getMimeType(), p0.getEncoding(), p0.getData());
       Map responseHead = p0.getResponseHeaders();
       try{
          webResourceR.setResponseHeaders(responseHead);
          webResourceR.setStatusCodeAndReasonPhrase(p0.getStatusCode(), p0.getReasonPhrase());
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
       }
       return webResourceR;
    }
}
