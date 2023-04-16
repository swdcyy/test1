package com.kuaishou.webkit.WebChromeClient;
import java.lang.Object;
import android.graphics.Bitmap;
import android.view.View;
import com.kuaishou.webkit.ValueCallback;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import com.kuaishou.webkit.ConsoleMessage;
import android.os.Message;
import com.kuaishou.webkit.WebStorage$QuotaUpdater;
import com.kuaishou.webkit.GeolocationPermissions$Callback;
import com.kuaishou.webkit.JsResult;
import com.kuaishou.webkit.JsPromptResult;
import com.kuaishou.webkit.PermissionRequest;
import com.kuaishou.webkit.WebChromeClient$CustomViewCallback;
import com.kuaishou.webkit.WebChromeClient$FileChooserParams;

public class WebChromeClient	// class@001268
{

    public void WebChromeClient(){
       super();
    }
    public Bitmap getDefaultVideoPoster(){
       return null;
    }
    public View getVideoLoadingProgressView(){
       return null;
    }
    public void getVisitedHistory(ValueCallback p0){
    }
    public void onCloseWindow(WebView p0){
    }
    public void onConsoleMessage(String p0,int p1,String p2){
    }
    public boolean onConsoleMessage(ConsoleMessage p0){
       this.onConsoleMessage(p0.message(), p0.lineNumber(), p0.sourceId());
       return false;
    }
    public boolean onCreateWindow(WebView p0,boolean p1,boolean p2,Message p3){
       return false;
    }
    public void onExceededDatabaseQuota(String p0,String p1,long p2,long p3,long p4,WebStorage$QuotaUpdater p5){
       p5.updateQuota(p2);
    }
    public void onGeolocationPermissionsHidePrompt(){
    }
    public void onGeolocationPermissionsShowPrompt(String p0,GeolocationPermissions$Callback p1){
    }
    public void onHideCustomView(){
    }
    public boolean onJsAlert(WebView p0,String p1,String p2,JsResult p3){
       return false;
    }
    public boolean onJsBeforeUnload(WebView p0,String p1,String p2,JsResult p3){
       return false;
    }
    public boolean onJsConfirm(WebView p0,String p1,String p2,JsResult p3){
       return false;
    }
    public boolean onJsPrompt(WebView p0,String p1,String p2,String p3,JsPromptResult p4){
       return false;
    }
    public boolean onJsTimeout(){
       return true;
    }
    public void onPermissionRequest(PermissionRequest p0){
       p0.deny();
    }
    public void onPermissionRequestCanceled(PermissionRequest p0){
    }
    public void onProgressChanged(WebView p0,int p1){
    }
    public void onReachedMaxAppCacheSize(long p0,long p1,WebStorage$QuotaUpdater p2){
       p2.updateQuota(p1);
    }
    public void onReceivedIcon(WebView p0,Bitmap p1){
    }
    public void onReceivedTitle(WebView p0,String p1){
    }
    public void onReceivedTouchIconUrl(WebView p0,String p1,boolean p2){
    }
    public void onRequestFocus(WebView p0){
    }
    public void onShowCustomView(View p0,int p1,WebChromeClient$CustomViewCallback p2){
    }
    public void onShowCustomView(View p0,WebChromeClient$CustomViewCallback p1){
    }
    public boolean onShowFileChooser(WebView p0,ValueCallback p1,WebChromeClient$FileChooserParams p2){
       return false;
    }
    public void openFileChooser(ValueCallback p0,String p1,String p2){
       p0.onReceiveValue(null);
    }
}
