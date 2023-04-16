package com.tencent.open.a$a;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import java.lang.Number;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Float;
import java.lang.Boolean;

public class a$a	// class@000f39
{
    public WeakReference a;
    public long b;
    public String c;

    public void a$a(WebView p0,long p1,String p2){
       super();
       this.a = new WeakReference(p0);
       this.b = p1;
       this.c = p2;
    }
    public void a(){
       WebView webView = this.a.get();
       if (webView == null) {
          return;
       }
       webView.loadUrl("javascript:window.JsBridge&&JsBridge.callback\("+this.b+",{\'r\':1,\'result\':\'no such method\'}\)");
       return;
    }
    public void a(Object p0){
       WebView webView = this.a.get();
       if (webView == null) {
          return;
       }
       if (p0 instanceof String) {
          String str = "\'";
          p0 = str+(p0.replace("\\", "\\\\")).replace(str, "\\\'")+str;
       }else if(!p0 instanceof Number && (!p0 instanceof Long && (!p0 instanceof Integer && (p0 instanceof Double || p0 instanceof Float)))){
          p0 = p0.toString();
       }else if(p0 instanceof Boolean){
          p0 = p0.toString();
       }else {
          p0 = "\'undefined\'";
       }
       webView.loadUrl("javascript:window.JsBridge&&JsBridge.callback\("+this.b+",{\'r\':0,\'result\':"+p0+"}\);");
       return;
    }
    public void a(String p0){
       WebView webView = this.a.get();
       if (webView != null) {
          webView.loadUrl("javascript:"+p0);
       }
       return;
    }
}
