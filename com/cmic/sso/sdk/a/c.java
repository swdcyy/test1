package com.cmic.sso.sdk.a.c;
import com.cmic.sso.sdk.a.b$a;
import android.content.Context;
import java.lang.Object;
import com.cmic.sso.sdk.a.a;
import com.cmic.sso.sdk.a;
import com.cmic.sso.sdk.a.b;
import java.lang.String;
import com.cmic.sso.sdk.e.k;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.cmic.sso.sdk.e.c;

public class c implements b$a	// class@000f22
{
    public a b;
    public a c;
    public b d;
    public Context e;
    public static c a;

    public void c(Context p0){
       super();
       this.e = p0;
       this.b();
    }
    public static c a(Context p0){
       if (c.a == null) {
          _monitor_enter(c.class);
          if (c.a == null) {
             c.a = new c(p0);
          }
          _monitor_exit(c.class);
       }
       return c.a;
    }
    public a a(){
       try{
          return this.b.m();
       }catch(java.lang.CloneNotSupportedException e0){
          return this.c;
       }
    }
    public void a(a p0){
       this.b = p0;
    }
    public void a(a p0){
       this.d.a(p0);
    }
    public final void b(){
       String str = k.b("sdk_config_version", "");
       if (!TextUtils.isEmpty(str) && ("quick_login_android_9.5.1").equals(str)) {
          b uob = b.a(false);
          this.d = uob;
          this.b = uob.b();
       }else {
          b uob1 = b.a(true);
          this.d = uob1;
          this.b = uob1.a();
          if (!TextUtils.isEmpty(str)) {
             this.c();
          }
       }
       this.d.a(this);
       this.c = this.d.a();
       return;
    }
    public final void c(){
       c.b("UmcConfigManager", "delete localConfig");
       this.d.c();
    }
}
