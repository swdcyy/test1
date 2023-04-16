package com.unionpay.s;
import com.kuaishou.webkit.WebChromeClient;
import com.unionpay.WebViewJavascriptBridge;
import com.kuaishou.webkit.ConsoleMessage;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import com.kuaishou.webkit.JsResult;
import android.content.Context;
import java.lang.CharSequence;
import android.widget.Toast;

public final class s extends WebChromeClient	// class@001005
{
    public final WebViewJavascriptBridge a;

    public void s(WebViewJavascriptBridge p0){
       this.a = p0;
       super();
    }
    public void s(WebViewJavascriptBridge p0,byte p1){
       super(p0);
    }
    public final boolean onConsoleMessage(ConsoleMessage p0){
       return true;
    }
    public final boolean onJsAlert(WebView p0,String p1,String p2,JsResult p3){
       p3.cancel();
       Toast.makeText(this.a.mContext, p2, 0).show();
       return true;
    }
}
