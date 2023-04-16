package com.unionpay.r;
import com.unionpay.v;
import com.unionpay.WebViewJavascriptBridge;
import java.lang.String;
import java.lang.Object;

public final class r implements v	// class@001004
{
    public final WebViewJavascriptBridge a;
    public final String b;

    public void r(WebViewJavascriptBridge p0,String p1){
       this.a = p0;
       this.b = p1;
    }
    public final void a(String p0){
       this.a._callbackJs(this.b, p0);
    }
}
