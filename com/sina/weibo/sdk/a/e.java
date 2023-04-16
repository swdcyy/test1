package com.sina.weibo.sdk.a.e;
import com.sina.weibo.sdk.a.c;
import java.lang.String;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.net.c;
import java.lang.Object;
import com.sina.weibo.sdk.net.e$a;
import com.sina.weibo.sdk.net.e;
import com.sina.weibo.sdk.net.b;
import com.sina.weibo.sdk.net.d;
import com.sina.weibo.sdk.net.f;
import com.sina.weibo.sdk.net.a;
import java.lang.Throwable;

public final class e extends c	// class@000b99
{
    public c aa;
    public Throwable ab;
    public String ad;
    public Oauth2AccessToken af;

    public void e(String p0,Oauth2AccessToken p1,c p2){
       super();
       this.ad = p0;
       this.af = p1;
       this.aa = p2;
    }
    public final Object l(){
       return this.n();
    }
    public final String n(){
       e$a uoa = new e$a();
       uoa.i = "https://api.weibo.com/oauth2/access_token";
       String str = new b().a(uoa.b("client_id", this.ad).b("appKey", this.ad).b("grant_type", "refresh_token").b("refresh_token", this.af.getRefreshToken()).e()).f();
       return str;
    }
    public final void onPostExecute(Object p0){
       e tab = this.ab;
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
