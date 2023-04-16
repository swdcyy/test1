package com.vivo.push.cache.c;
import java.lang.Object;
import android.content.Context;
import java.util.ArrayList;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.util.w;
import java.lang.String;
import java.util.List;
import com.vivo.push.util.y;
import com.vivo.push.util.g;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.vivo.push.util.p;
import java.util.Collection;
import java.lang.Throwable;

public abstract class c	// class@001054
{
    public List b;
    public Context c;
    public byte[] d;
    public byte[] e;
    public static final Object a;

    static {
       c.a = new Object();
    }
    public void c(Context p0){
       super();
       this.b = new ArrayList();
       this.c = ContextDelegate.getContext(p0);
       w ow = w.b();
       ow.a(this.c);
       this.d = ow.c();
       this.e = ow.d();
       this.c();
    }
    public abstract String a();
    public abstract List a(String p0);
    public final String b(){
       return y.b(this.c).a(this.a(), null);
    }
    public abstract String b(String p0);
    public final void c(){
       Object a = c.a;
       _monitor_enter(a);
       g.a(this.a());
       this.b.clear();
       this.c(this.b());
       _monitor_exit(a);
    }
    public final void c(String p0){
       String str = "ClientManager init ";
       if (TextUtils.isEmpty(p0)) {
          p.d("CacheSettings", str+this.a()+" strApps empty.");
          return;
       }else if(p0.length() > 0x2710){
          p.d("CacheSettings", "sync "+this.a()+" strApps lenght too large");
          this.d();
          return;
       }else {
          try{
             p.d("CacheSettings", str+this.a()+" strApps : "+p0);
             List list = this.a(this.b(p0));
             if (list != null) {
                this.b.addAll(list);
             }
             return;
          }catch(java.lang.Exception e5){
             this.d();
             p.d("CacheSettings", p.a(e5));
             return;
          }
       }
    }
    public final void d(){
       Object a = c.a;
       _monitor_enter(a);
       this.b.clear();
       this.d("");
       p.d("CacheSettings", "clear "+this.a()+" strApps");
       _monitor_exit(a);
    }
    public final void d(String p0){
       y.b(this.c).b(this.a(), p0);
    }
    public final byte[] e(){
       c td = this.d;
       if (td != null && td.length > 0) {
          return td;
       }
       return w.b().c();
    }
    public final byte[] f(){
       c te = this.e;
       if (te != null && te.length > 0) {
          return te;
       }
       return w.b().d();
    }
}
