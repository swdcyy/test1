package com.alipay.sdk.m.s.e$c;
import com.kuaishou.webkit.WebViewClient;
import com.alipay.sdk.m.s.e;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import com.alipay.sdk.m.s.e$f;
import android.graphics.Bitmap;
import com.kuaishou.webkit.SslErrorHandler;
import android.net.http.SslError;

public class e$c extends WebViewClient	// class@000eae
{
    public final e a;

    public void e$c(e p0){
       this.a = p0;
       super();
    }
    public void onPageFinished(WebView p0,String p1){
       if (!e.g(this.a).f(this.a, p1)) {
          super.onPageFinished(p0, p1);
       }
       return;
    }
    public void onPageStarted(WebView p0,String p1,Bitmap p2){
       if (!e.g(this.a).d(this.a, p1)) {
          super.onPageFinished(p0, p1);
       }
       return;
    }
    public void onReceivedError(WebView p0,int p1,String p2,String p3){
       if (!e.g(this.a).c(this.a, p1, p2, p3)) {
          super.onReceivedError(p0, p1, p2, p3);
       }
       return;
    }
    public void onReceivedSslError(WebView p0,SslErrorHandler p1,SslError p2){
       if (!e.g(this.a).i(this.a, p1, p2)) {
          super.onReceivedSslError(p0, p1, p2);
       }
       return;
    }
    public boolean shouldOverrideUrlLoading(WebView p0,String p1){
       if (!e.g(this.a).g(this.a, p1)) {
          return super.shouldOverrideUrlLoading(p0, p1);
       }
       return true;
    }
}
