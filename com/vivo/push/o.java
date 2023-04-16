package com.vivo.push.o;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;
import android.content.Intent;
import com.vivo.push.a;
import com.vivo.push.util.p;
import android.os.Bundle;
import com.vivo.push.p;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Class;

public abstract class o	// class@00108f
{
    public int a;
    public String b;

    public void o(int p0){
       super();
       this.a = -1;
       if (p0 < 0) {
          throw new IllegalArgumentException("PushCommand: the value of command must > 0.");
       }
       this.a = p0;
       return;
    }
    public final String a(){
       return this.b;
    }
    public final void a(Intent p0){
       a uoa = a.a(p0);
       if (uoa == null) {
          p.b("PushCommand", "bundleWapper is null");
          return;
       }else {
          this.a(uoa);
          Bundle uBundle = uoa.b();
          if (uBundle != null) {
             p0.putExtras(uBundle);
          }
          return;
       }
    }
    public final void a(a p0){
       String str = p.a(this.a);
       if (str == null) {
          str = "";
       }
       p0.a("method", str);
       this.e(p0);
       return;
    }
    public final void a(String p0){
       this.b = p0;
    }
    public final int b(){
       return this.a;
    }
    public final void b(Intent p0){
       a uoa = a.a(p0);
       if (uoa == null) {
          p.b("PushCommand", "bundleWapper is null");
          return;
       }else {
          uoa.a("method", this.a);
          this.e(uoa);
          Bundle uBundle = uoa.b();
          if (uBundle != null) {
             p0.putExtras(uBundle);
          }
          return;
       }
    }
    public final void b(a p0){
       String str = p0.a();
       this.b = (!TextUtils.isEmpty(str))? str: p0.a("client_pkgname");
       this.d(p0);
       return;
    }
    public abstract void c(a p0);
    public boolean c(){
       return false;
    }
    public abstract void d(a p0);
    public final void e(a p0){
       p0.a("command", this.a);
       p0.a("client_pkgname", this.b);
       this.c(p0);
    }
    public String toString(){
       return this.getClass().getSimpleName();
    }
}
