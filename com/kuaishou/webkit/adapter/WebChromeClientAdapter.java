package com.kuaishou.webkit.adapter.WebChromeClientAdapter;
import android.webkit.WebChromeClient;
import com.kuaishou.webkit.WebView;
import com.kuaishou.webkit.WebChromeClient;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.ValueCallback;
import com.kuaishou.webkit.adapter.ValueCallbackAdapter;
import com.kuaishou.webkit.ValueCallback;
import android.webkit.WebView;
import java.lang.String;
import android.webkit.ConsoleMessage;
import android.webkit.ConsoleMessage$MessageLevel;
import com.kuaishou.webkit.ConsoleMessage$MessageLevel;
import java.lang.Exception;
import com.kuaishou.webkit.ConsoleMessage;
import android.os.Message;
import com.kuaishou.webkit.WebView$WebViewTransport;
import java.lang.Object;
import java.util.Objects;
import android.os.Handler;
import com.kuaishou.webkit.adapter.WebChromeClientAdapter$r;
import java.lang.Runnable;
import android.webkit.WebStorage$QuotaUpdater;
import com.kuaishou.webkit.adapter.QuotaUpdaterAdapter;
import com.kuaishou.webkit.WebStorage$QuotaUpdater;
import android.webkit.GeolocationPermissions$Callback;
import com.kuaishou.webkit.adapter.WebChromeClientAdapter$GeolocationPermissionsCallback;
import com.kuaishou.webkit.GeolocationPermissions$Callback;
import android.webkit.JsResult;
import com.kuaishou.webkit.JsResult;
import com.kuaishou.webkit.adapter.WebChromeClientAdapter$JsResultReceiver;
import com.kuaishou.webkit.JsResult$ResultReceiver;
import android.webkit.JsPromptResult;
import com.kuaishou.webkit.JsPromptResult;
import com.kuaishou.webkit.adapter.WebChromeClientAdapter$JsPromptResultReceiver;
import android.webkit.PermissionRequest;
import com.kuaishou.webkit.adapter.PermissionRequestAdapter;
import com.kuaishou.webkit.PermissionRequest;
import android.webkit.WebChromeClient$CustomViewCallback;
import com.kuaishou.webkit.adapter.CustomViewCallbackAdapter;
import com.kuaishou.webkit.WebChromeClient$CustomViewCallback;
import android.webkit.WebChromeClient$FileChooserParams;
import com.kuaishou.webkit.adapter.FileChooserParamsAdapter;
import com.kuaishou.webkit.WebChromeClient$FileChooserParams;

public class WebChromeClientAdapter extends WebChromeClient	// class@0012bb
{
    public WebChromeClient mStub;
    public WebView mWebView;

    public void WebChromeClientAdapter(WebView p0,WebChromeClient p1){
       super();
       this.mWebView = p0;
       this.mStub = p1;
    }
    public Bitmap getDefaultVideoPoster(){
       return this.mStub.getDefaultVideoPoster();
    }
    public WebChromeClient getStub(){
       return this.mStub;
    }
    public View getVideoLoadingProgressView(){
       return this.mStub.getVideoLoadingProgressView();
    }
    public void getVisitedHistory(ValueCallback p0){
       WebChromeClientAdapter tmStub = this.mStub;
       ValueCallbackAdapter valueCallbac = (p0 != null)? new ValueCallbackAdapter(p0): null;
       tmStub.getVisitedHistory(valueCallbac);
       return;
    }
    public void onCloseWindow(WebView p0){
       this.mStub.onCloseWindow(this.mWebView);
    }
    public void onConsoleMessage(String p0,int p1,String p2){
       this.mStub.onConsoleMessage(p0, p1, p2);
    }
    public boolean onConsoleMessage(ConsoleMessage p0){
       ConsoleMessage$MessageLevel messageLevel;
       ConsoleMessage uConsoleMess;
       if (p0 != null) {
          try{
             messageLevel = ConsoleMessage$MessageLevel.valueOf(p0.messageLevel().toString());
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
             messageLevel = ConsoleMessage$MessageLevel.TIP;
          }
          uConsoleMess = new ConsoleMessage(p0.message(), p0.sourceId(), p0.lineNumber(), messageLevel);
       }else {
          uConsoleMess = null;
       }
       return this.mStub.onConsoleMessage(uConsoleMess);
    }
    public boolean onCreateWindow(WebView p0,boolean p1,boolean p2,Message p3){
       WebChromeClientAdapter tmWebView = this.mWebView;
       Objects.requireNonNull(tmWebView);
       WebView$WebViewTransport webViewTrans = new WebView$WebViewTransport(tmWebView);
       webViewTrans.setWebView(this.mWebView);
       p3 = Message.obtain(p3.getTarget(), new WebChromeClientAdapter$r(this, webViewTrans, p3, this));
       p3.obj = webViewTrans;
       return this.mStub.onCreateWindow(this.mWebView, p1, p2, p3);
    }
    public void onExceededDatabaseQuota(String p0,String p1,long p2,long p3,long p4,WebStorage$QuotaUpdater p5){
       WebStorage$QuotaUpdater quotaUpdater = p5;
       WebChromeClientAdapter mStub = this.mStub;
       QuotaUpdaterAdapter quotaUpdater1 = (quotaUpdater)? new QuotaUpdaterAdapter(quotaUpdater): null;
       mStub.onExceededDatabaseQuota(p0, p1, p2, p3, p4, quotaUpdater1);
       return;
    }
    public void onGeolocationPermissionsHidePrompt(){
       this.mStub.onGeolocationPermissionsHidePrompt();
    }
    public void onGeolocationPermissionsShowPrompt(String p0,GeolocationPermissions$Callback p1){
       WebChromeClientAdapter tmStub = this.mStub;
       WebChromeClientAdapter$GeolocationPermissionsCallback geolocationP = (p1 != null)? new WebChromeClientAdapter$GeolocationPermissionsCallback(this, p1): null;
       tmStub.onGeolocationPermissionsShowPrompt(p0, geolocationP);
       return;
    }
    public void onHideCustomView(){
       this.mStub.onHideCustomView();
    }
    public boolean onJsAlert(WebView p0,String p1,String p2,JsResult p3){
       WebChromeClientAdapter tmStub = this.mStub;
       WebChromeClientAdapter tmWebView = this.mWebView;
       JsResult jsResult = (p3 != null)? new JsResult(new WebChromeClientAdapter$JsResultReceiver(this, p3)): null;
       return tmStub.onJsAlert(tmWebView, p1, p2, jsResult);
    }
    public boolean onJsBeforeUnload(WebView p0,String p1,String p2,JsResult p3){
       WebChromeClientAdapter tmStub = this.mStub;
       WebChromeClientAdapter tmWebView = this.mWebView;
       JsResult jsResult = (p3 != null)? new JsResult(new WebChromeClientAdapter$JsResultReceiver(this, p3)): null;
       return tmStub.onJsBeforeUnload(tmWebView, p1, p2, jsResult);
    }
    public boolean onJsConfirm(WebView p0,String p1,String p2,JsResult p3){
       WebChromeClientAdapter tmStub = this.mStub;
       WebChromeClientAdapter tmWebView = this.mWebView;
       JsResult jsResult = (p3 != null)? new JsResult(new WebChromeClientAdapter$JsResultReceiver(this, p3)): null;
       return tmStub.onJsConfirm(tmWebView, p1, p2, jsResult);
    }
    public boolean onJsPrompt(WebView p0,String p1,String p2,String p3,JsPromptResult p4){
       WebChromeClientAdapter tmStub = this.mStub;
       WebChromeClientAdapter tmWebView = this.mWebView;
       JsPromptResult jsPromptResu = (p4 != null)? new JsPromptResult(new WebChromeClientAdapter$JsPromptResultReceiver(this, p4)): false;
       return tmStub.onJsPrompt(tmWebView, p1, p2, p3, jsPromptResu);
    }
    public boolean onJsTimeout(){
       return this.mStub.onJsTimeout();
    }
    public void onPermissionRequest(PermissionRequest p0){
       WebChromeClientAdapter tmStub = this.mStub;
       PermissionRequestAdapter permissionRe = (p0 != null)? new PermissionRequestAdapter(p0): null;
       tmStub.onPermissionRequest(permissionRe);
       return;
    }
    public void onPermissionRequestCanceled(PermissionRequest p0){
       WebChromeClientAdapter tmStub = this.mStub;
       PermissionRequestAdapter permissionRe = (p0 != null)? new PermissionRequestAdapter(p0): null;
       tmStub.onPermissionRequestCanceled(permissionRe);
       return;
    }
    public void onProgressChanged(WebView p0,int p1){
       this.mStub.onProgressChanged(this.mWebView, p1);
    }
    public void onReachedMaxAppCacheSize(long p0,long p1,WebStorage$QuotaUpdater p2){
       WebChromeClientAdapter tmStub = this.mStub;
       QuotaUpdaterAdapter quotaUpdater = (p2 != null)? new QuotaUpdaterAdapter(p2): null;
       tmStub.onReachedMaxAppCacheSize(p0, p1, quotaUpdater);
       return;
    }
    public void onReceivedIcon(WebView p0,Bitmap p1){
       this.mStub.onReceivedIcon(this.mWebView, p1);
    }
    public void onReceivedTitle(WebView p0,String p1){
       this.mStub.onReceivedTitle(this.mWebView, p1);
    }
    public void onReceivedTouchIconUrl(WebView p0,String p1,boolean p2){
       this.mStub.onReceivedTouchIconUrl(this.mWebView, p1, p2);
    }
    public void onRequestFocus(WebView p0){
       this.mStub.onRequestFocus(this.mWebView);
    }
    public void onShowCustomView(View p0,int p1,WebChromeClient$CustomViewCallback p2){
       WebChromeClientAdapter tmStub = this.mStub;
       CustomViewCallbackAdapter uCustomViewC = (p2 != null)? new CustomViewCallbackAdapter(p2): null;
       tmStub.onShowCustomView(p0, p1, uCustomViewC);
       return;
    }
    public void onShowCustomView(View p0,WebChromeClient$CustomViewCallback p1){
       WebChromeClientAdapter tmStub = this.mStub;
       CustomViewCallbackAdapter uCustomViewC = (p1 != null)? new CustomViewCallbackAdapter(p1): null;
       tmStub.onShowCustomView(p0, uCustomViewC);
       return;
    }
    public boolean onShowFileChooser(WebView p0,ValueCallback p1,WebChromeClient$FileChooserParams p2){
       WebChromeClientAdapter tmStub = this.mStub;
       WebChromeClientAdapter tmWebView = this.mWebView;
       FileChooserParamsAdapter uFileChooser = null;
       ValueCallbackAdapter valueCallbac = (p1 != null)? new ValueCallbackAdapter(p1): uFileChooser;
       if (p2 != null) {
          uFileChooser = new FileChooserParamsAdapter(p2);
       }
       return tmStub.onShowFileChooser(tmWebView, valueCallbac, uFileChooser);
    }
}
