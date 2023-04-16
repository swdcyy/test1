package com.sina.weibo.sdk.a.d;
import com.sina.weibo.sdk.a.c;
import android.content.Context;
import java.lang.String;
import com.sina.weibo.sdk.net.c;
import com.sina.weibo.sdk.net.HttpManager;
import java.lang.Object;
import java.lang.System;
import com.sina.weibo.sdk.net.e$a;
import com.sina.weibo.sdk.net.e;
import com.sina.weibo.sdk.net.b;
import com.sina.weibo.sdk.net.d;
import com.sina.weibo.sdk.net.f;
import com.sina.weibo.sdk.net.a;
import java.lang.Throwable;

public final class d extends c	// class@000b98
{
    public Context Z;
    public c aa;
    public Throwable ab;
    public String ac;
    public String ad;
    public String ae;

    public void d(Context p0,String p1,String p2,String p3,c p4){
       super();
       this.Z = p0;
       this.ac = p1;
       this.ad = p2;
       this.ae = p3;
       this.aa = p4;
    }
    public final String d(String p0){
       return HttpManager.a(this.Z, "", this.ae, this.ad, p0);
    }
    public final Object l(){
       return this.n();
    }
    public final String n(){
       String str = String.valueOf((System.currentTimeMillis() / 1000));
       e$a uoa = new e$a();
       uoa.i = "https://service.weibo.com/share/mobilesdk_uppic.php";
       e$a uoa1 = uoa.a("oauth_timestamp", str).a("oauth_sign", this.d(str)).b("appKey", this.ad).b("oauth_timestamp", str);
       e$a uoa2 = uoa1.b("oauth_sign", this.d(str));
       String str1 = new b().a(uoa2.b("img", this.ac).e()).f();
       return str1;
    }
    public final void onPostExecute(Object p0){
       d tab = this.ab;
       if (tab != null) {
          p0 = this.aa;
          if (p0 != null) {
             p0.onError(tab);
          }
          return;
       }else {
          tab = this.aa;
          if (tab != null) {
             tab.a(p0);
          }
          return;
       }
    }
}
