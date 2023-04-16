package com.vivo.push.util.y;
import com.vivo.push.util.d;
import java.util.HashMap;
import android.content.Context;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import com.vivo.push.util.p;
import com.vivo.push.util.x;
import com.vivo.push.util.v;

public final class y implements d	// class@0010c7
{
    public Context e;
    public d f;
    public boolean g;
    public static final HashMap a;
    public static final HashMap b;
    public static final HashMap c;
    public static y d;

    static {
       y.a = new HashMap();
       y.b = new HashMap();
       y.c = new HashMap();
    }
    public void y(Context p0){
       super();
       this.g = false;
       this.e = p0;
       this.g = this.a(p0);
       p.d("SystemCache", "init status is "+this.g+";  curCache is "+this.f);
    }
    public static synchronized y b(Context p0){
       _monitor_enter(y.class);
       if (y.d == null) {
          y.d = new y(p0.getApplicationContext());
       }
       _monitor_exit(y.class);
       return y.d;
    }
    public final String a(String p0,String p1){
       String str = y.c.get(p0);
       if (str == null) {
          y tf = this.f;
          if (tf != null) {
             return tf.a(p0, p1);
          }
       }
       return str;
    }
    public final void a(){
       x ox = new x();
       if (!ox.a(this.e)) {
          return;
       }
       ox.a();
       p.d("SystemCache", "sp cache is cleared");
       return;
    }
    public final boolean a(Context p0){
       v ov = new v();
       this.f = ov;
       boolean b = ov.a(p0);
       if (!b) {
          x ox = new x();
          this.f = ox;
          b = ox.a(p0);
       }
       if (!b) {
          this.f = null;
       }
       return b;
    }
    public final void b(String p0,String p1){
       y.c.put(p0, p1);
       if (this.g != null) {
          y tf = this.f;
          if (tf != null) {
             tf.b(p0, p1);
          }
       }
       return;
    }
}
