package com.kuaishou.webkit.WebViewClient;
import java.lang.Object;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import android.os.Message;
import android.graphics.Bitmap;
import com.kuaishou.webkit.ClientCertRequest;
import com.kuaishou.webkit.WebResourceRequest;
import com.kuaishou.webkit.WebResourceError;
import java.lang.CharSequence;
import android.net.Uri;
import com.kuaishou.webkit.HttpAuthHandler;
import com.kuaishou.webkit.WebResourceResponse;
import com.kuaishou.webkit.SslErrorHandler;
import android.net.http.SslError;
import com.kuaishou.webkit.RenderProcessGoneDetail;
import android.text.TextUtils;
import com.kuaishou.webkit.internal.EventReporter;
import com.kuaishou.webkit.SafeBrowsingResponse;
import android.view.InputEvent;
import android.view.KeyEvent;

public class WebViewClient	// class@001290
{

    public void WebViewClient(){
       super();
    }
    public void doUpdateVisitedHistory(WebView p0,String p1,boolean p2){
    }
    public void onFormResubmission(WebView p0,Message p1,Message p2){
       p1.sendToTarget();
    }
    public void onLoadResource(WebView p0,String p1){
    }
    public void onPageCommitVisible(WebView p0,String p1){
    }
    public void onPageFinished(WebView p0,String p1){
    }
    public void onPageStarted(WebView p0,String p1,Bitmap p2){
    }
    public void onReceivedClientCertRequest(WebView p0,ClientCertRequest p1){
       p1.cancel();
    }
    public void onReceivedError(WebView p0,int p1,String p2,String p3){
    }
    public void onReceivedError(WebView p0,WebResourceRequest p1,WebResourceError p2){
       if (p1.isForMainFrame()) {
          this.onReceivedError(p0, p2.getErrorCode(), p2.getDescription().toString(), p1.getUrl().toString());
       }
       return;
    }
    public void onReceivedHttpAuthRequest(WebView p0,HttpAuthHandler p1,String p2,String p3){
       p1.cancel();
    }
    public void onReceivedHttpError(WebView p0,WebResourceRequest p1,WebResourceResponse p2){
    }
    public void onReceivedLoginRequest(WebView p0,String p1,String p2,String p3){
    }
    public void onReceivedSslError(WebView p0,SslErrorHandler p1,SslError p2){
       p1.cancel();
    }
    public boolean onRenderProcessGone(WebView p0,RenderProcessGoneDetail p1){
       try{
          String url = p0.getUrl();
          if (TextUtils.isEmpty(url)) {
             url = "null";
          }
          EventReporter.onEvent("core_renderer_crash", "url", url);
          return true;
       }catch(java.lang.Exception e0){
       }
    }
    public void onSafeBrowsingHit(WebView p0,WebResourceRequest p1,int p2,SafeBrowsingResponse p3){
       p3.showInterstitial(true);
    }
    public void onScaleChanged(WebView p0,float p1,float p2){
    }
    public void onTooManyRedirects(WebView p0,Message p1,Message p2){
       p1.sendToTarget();
    }
    public void onUnhandledInputEvent(WebView p0,InputEvent p1){
       if (p1 instanceof KeyEvent) {
          this.onUnhandledKeyEvent(p0, p1);
          return;
       }else {
          this.onUnhandledInputEventInternal(p0, p1);
          return;
       }
    }
    public final void onUnhandledInputEventInternal(WebView p0,InputEvent p1){
    }
    public void onUnhandledKeyEvent(WebView p0,KeyEvent p1){
       this.onUnhandledInputEventInternal(p0, p1);
    }
    public WebResourceResponse shouldInterceptRequest(WebView p0,WebResourceRequest p1){
       return this.shouldInterceptRequest(p0, p1.getUrl().toString());
    }
    public WebResourceResponse shouldInterceptRequest(WebView p0,String p1){
       return null;
    }
    public boolean shouldOverrideKeyEvent(WebView p0,KeyEvent p1){
       return false;
    }
    public boolean shouldOverrideUrlLoading(WebView p0,WebResourceRequest p1){
       return this.shouldOverrideUrlLoading(p0, p1.getUrl().toString());
    }
    public boolean shouldOverrideUrlLoading(WebView p0,String p1){
       return false;
    }
}
