package com.unionpay.t;
import com.kuaishou.webkit.WebViewClient;
import com.unionpay.WebViewJavascriptBridge;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import com.unionpay.utils.j;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import java.lang.Exception;

public final class t extends WebViewClient	// class@001006
{
    public final WebViewJavascriptBridge a;

    public void t(WebViewJavascriptBridge p0){
       this.a = p0;
       super();
    }
    public void t(WebViewJavascriptBridge p0,byte p1){
       super(p0);
    }
    public final void onPageFinished(WebView p0,String p1){
       j.a("test", "onPageFinished");
    }
    public final boolean shouldOverrideUrlLoading(WebView p0,String p1){
       j.a("uppay", "shouldOverrideUrlLoading£º"+p1);
       if (this.a.mAllowScheme != null && (!TextUtils.isEmpty(p1) && !p1.startsWith("http"))) {
          try{
             Intent intent = new Intent();
             intent.setAction("android.intent.action.VIEW");
             intent.setData(Uri.parse(p1));
             this.a.mContext.startActivity(intent);
             return true;
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       label_0045 :
          return super.shouldOverrideUrlLoading(p0, p1);
       }else {
          goto label_0045 ;
       }
    }
}
