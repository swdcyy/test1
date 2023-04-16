package com.sina.weibo.sdk.web.a.d;
import com.sina.weibo.sdk.web.a.b;
import android.app.Activity;
import com.sina.weibo.sdk.web.a;
import com.sina.weibo.sdk.web.b.b;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import android.graphics.Bitmap;
import com.kuaishou.webkit.WebResourceRequest;
import android.net.Uri;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Bundle;
import com.sina.weibo.sdk.b.e;
import java.lang.Object;

public final class d extends b	// class@000be2
{

    public void d(Activity p0,a p1,b p2){
       super(p0, p1, p2);
    }
    public final void onPageFinished(WebView p0,String p1){
       super.onPageFinished(p0, p1);
    }
    public final void onPageStarted(WebView p0,String p1,Bitmap p2){
       super.onPageStarted(p0, p1, p2);
    }
    public final void p(String p0){
       this.n(p0);
    }
    public final void q(){
       this.o("cancel share!!!");
       b taz = this.az;
       if (taz != null) {
          taz.q();
       }
       return;
    }
    public final boolean s(){
       this.q();
       return true;
    }
    public final boolean shouldOverrideUrlLoading(WebView p0,WebResourceRequest p1){
       String str = p1.getUrl().toString();
       if (TextUtils.isEmpty(str) || !str.startsWith("sinaweibo://browser/close")) {
          return false;
       }
       Bundle uBundle = e.h(str);
       if (uBundle != null) {
          String str1 = uBundle.getString("code");
          str = uBundle.getString("msg");
          if (TextUtils.isEmpty(str1)) {
             this.o("code is null!!!");
          }else if(("0").equals(str1)){
             this.m(str);
          }else {
             this.n(str);
          }
       }else {
          this.n("bundle is null!!!");
       }
       b taz = this.az;
       if (taz != null) {
          taz.q();
       }
       return true;
    }
    public final boolean shouldOverrideUrlLoading(WebView p0,String p1){
       if (TextUtils.isEmpty(p1) || !p1.startsWith("sinaweibo://browser/close")) {
          return false;
       }
       Bundle uBundle = e.h(p1);
       if (uBundle != null) {
          String str = uBundle.getString("msg");
          if (("0").equals(uBundle.getString("code"))) {
             this.m(str);
          }else {
             this.n(str);
          }
       }else {
          this.n("bundle is null!!!");
       }
       b taz = this.az;
       if (taz != null) {
          taz.q();
       }
       return true;
    }
}
