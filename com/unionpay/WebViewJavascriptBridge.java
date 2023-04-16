package com.unionpay.WebViewJavascriptBridge;
import java.io.Serializable;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import com.unionpay.u;
import java.lang.Object;
import java.util.HashMap;
import com.kuaishou.webkit.WebSettings;
import java.lang.String;
import java.lang.Throwable;
import com.unionpay.t;
import com.kuaishou.webkit.WebViewClient;
import com.unionpay.s;
import com.kuaishou.webkit.WebChromeClient;
import java.io.InputStream;
import java.util.Scanner;
import java.io.IOException;
import java.util.Map;
import org.json.JSONObject;
import java.lang.StringBuilder;
import com.unionpay.utils.j;
import com.unionpay.q;
import java.lang.Runnable;
import com.unionpay.v;
import com.unionpay.r;
import com.unionpay.p;
import java.lang.Exception;
import java.lang.CharSequence;
import java.lang.Class;

public class WebViewJavascriptBridge implements Serializable	// class@000fee
{
    public u _messageHandler;
    public Map _messageHandlers;
    public Map _responseCallbacks;
    public long _uniqueId;
    public boolean mAllowScheme;
    public Activity mContext;
    public WebView mWebView;

    public void WebViewJavascriptBridge(Activity p0,WebView p1,u p2){
       super();
       this.mAllowScheme = false;
       this.mContext = p0;
       this.mWebView = p1;
       this._messageHandler = p2;
       this._messageHandlers = new HashMap();
       this._responseCallbacks = new HashMap();
       this._uniqueId = 0;
       WebSettings settings = this.mWebView.getSettings();
       settings.setJavaScriptEnabled(true);
       settings.setSavePassword(false);
       settings.setAllowFileAccess(false);
       settings.setDomStorageEnabled(true);
       this.mWebView.removeJavascriptInterface("accessibility");
       this.mWebView.removeJavascriptInterface("accessibilityTraversal");
       this.mWebView.removeJavascriptInterface("searchBoxJavaBridge_");
       this.mWebView.addJavascriptInterface(this, "_WebViewJavascriptBridge");
       this.mWebView.setWebViewClient(new t(this, false));
       this.mWebView.setWebChromeClient(new s(this, false));
       return;
    }
    public static String convertStreamToString(InputStream p0){
       String str = "";
       try{
          Scanner scanner = new Scanner(p0, "UTF-8").useDelimiter("\\A");
          if (scanner.hasNext()) {
             str = scanner.next();
          }
          p0.close();
       }catch(java.io.IOException e3){
          e3.printStackTrace();
       }
       return str;
    }
    public void _callbackJs(String p0,String p1){
       HashMap hashMap = new HashMap();
       hashMap.put("responseId", p0);
       hashMap.put("responseData", p1);
       this._dispatchMessage(hashMap);
    }
    public final void _dispatchMessage(Map p0){
       String str = new JSONObject(p0).toString();
       j.a("test", "sending:"+str);
       Object[] objArray = new Object[]{this.doubleEscapeString(str)};
       this.mContext.runOnUiThread(new q(this, String.format("javascript:WebViewJavascriptBridge._handleMessageFromJava\(\'%s\'\);", objArray)));
    }
    public void _handleMessageFromJs(String p0,String p1,String p2,String p3,String p4){
       u ou;
       if (p1 != null) {
          this._responseCallbacks.get(p1).a(p2);
          this._responseCallbacks.remove(p1);
          return;
       }else {
          r or = null;
          if (p3 != null) {
             or = new r(this, p3);
          }
          if (p4 != null) {
             ou = this._messageHandlers.get(p4);
             if (ou == null) {
                j.b("test", "WVJB Warning: No handler for "+p4);
                return;
             }
          }else {
             ou = this._messageHandler;
          }
          try{
             this.mContext.runOnUiThread(new p(this, ou, p0, or));
             return;
          }catch(java.lang.Exception e2){
             j.b(p2, "WebViewJavascriptBridge: WARNING: java handler threw. "+e2.getMessage());
             return;
          }
       }
    }
    public final void _sendData(String p0,v p1,String p2){
       HashMap hashMap = new HashMap();
       hashMap.put("data", p0);
       if (p1 != null) {
          long l = this._uniqueId + 1;
          this._uniqueId = l;
          p0 = "java_cb_"+l;
          this._responseCallbacks.put(p0, p1);
          hashMap.put("callbackId", p0);
       }
       if (p2 != null) {
          hashMap.put("handlerName", p2);
       }
       this._dispatchMessage(hashMap);
       return;
    }
    public void callHandler(String p0){
       this.callHandler(p0, null, null);
    }
    public void callHandler(String p0,String p1){
       this.callHandler(p0, p1, null);
    }
    public void callHandler(String p0,String p1,v p2){
       this._sendData(p1, p2, p0);
    }
    public final String doubleEscapeString(String p0){
       return (((((p0.replace("\\", "\\\\")).replace("\"", "\\\"")).replace("\'", "\\\'")).replace("\n", "\\n")).replace("\r", "\\r")).replace("\f", "\\f");
    }
    public final void loadWebViewJavascriptBridgeJs(WebView p0){
       p0.loadUrl("javascript:"+WebViewJavascriptBridge.convertStreamToString(this.getClass().getResourceAsStream("res/webviewjavascriptbridge.js")));
    }
    public void registerHandler(String p0,u p1){
       this._messageHandlers.put(p0, p1);
    }
    public void send(String p0){
       this.send(p0, null);
    }
    public void send(String p0,v p1){
       this._sendData(p0, p1, null);
    }
    public void setAllowScheme(boolean p0){
       this.mAllowScheme = p0;
    }
}
