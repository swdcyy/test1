package com.sina.weibo.sdk.web.a.b;
import com.kuaishou.webkit.WebViewClient;
import android.app.Activity;
import com.sina.weibo.sdk.web.a;
import com.sina.weibo.sdk.web.b.b;
import com.sina.weibo.sdk.auth.b;
import java.lang.String;
import android.content.Intent;
import android.os.Bundle;
import com.sina.weibo.sdk.share.ShareTransActivity;
import android.content.Context;
import java.lang.Class;
import com.kuaishou.webkit.WebView;
import android.graphics.Bitmap;
import com.kuaishou.webkit.WebResourceRequest;
import com.kuaishou.webkit.WebResourceError;
import java.lang.CharSequence;
import android.net.Uri;

public abstract class b extends WebViewClient	// class@000be0
{
    public b aA;
    public WbAuthListener aB;
    public b ax;
    public Activity ay;
    public a az;

    public void b(Activity p0,a p1,b p2){
       super();
       this.ax = b.b();
       this.ay = p0;
       this.az = p1;
       this.aA = p2;
    }
    public final void a(int p0,String p1){
       Bundle extras = this.ay.getIntent().getExtras();
       if (extras == null) {
          return;
       }
       Intent intent = new Intent(this.ay, ShareTransActivity.class);
       intent.setAction("com.sina.weibo.sdk.action.ACTION_SDK_REQ_ACTIVITY");
       intent.putExtras(extras);
       intent.putExtra("_weibo_resp_errcode", p0);
       intent.putExtra("_weibo_resp_errstr", p1);
       this.ay.setResult(-1, intent);
       return;
    }
    public final void m(String p0){
       this.a(0, p0);
    }
    public final void n(String p0){
       this.a(2, p0);
    }
    public final void o(String p0){
       this.a(1, p0);
    }
    public void onPageFinished(WebView p0,String p1){
       super.onPageFinished(p0, p1);
    }
    public void onPageStarted(WebView p0,String p1,Bitmap p2){
       super.onPageStarted(p0, p1, p2);
    }
    public void onReceivedError(WebView p0,WebResourceRequest p1,WebResourceError p2){
       super.onReceivedError(p0, p1, p2);
       b taz = this.az;
       if (taz != null) {
          p2.getErrorCode();
          p2.getDescription().toString();
          p1.getUrl();
          taz.p();
       }
       return;
    }
    public void p(String p0){
    }
    public void q(){
    }
    public boolean s(){
       return false;
    }
    public boolean shouldOverrideUrlLoading(WebView p0,WebResourceRequest p1){
       return super.shouldOverrideUrlLoading(p0, p1);
    }
}
