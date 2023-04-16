package com.vivo.push.util.x;
import com.vivo.push.util.d;
import java.lang.Object;
import java.lang.String;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import com.vivo.push.util.p;
import android.content.SharedPreferences$Editor;
import com.vivo.push.util.b;
import android.content.Context;
import oe6.o;

public final class x implements d	// class@0010c6
{
    public SharedPreferences c;
    public static String a = "SpCache";
    public static String b = "com.vivo.push.cache";

    public void x(){
       super();
    }
    public final String a(String p0,String p1){
       p1 = this.c.getString(p0, p1);
       p.d(x.a, "getString "+p0+" is "+p1);
       return p1;
    }
    public final void a(){
       SharedPreferences$Editor uEditor = this.c.edit();
       if (uEditor != null) {
          uEditor.clear();
          b.a(uEditor);
       }
       p.d(x.a, "system cache is cleared");
       return;
    }
    public final boolean a(Context p0){
       if (this.c == null) {
          this.c = o.c(p0, x.b, 0);
       }
       return true;
    }
    public final void b(String p0,String p1){
       SharedPreferences$Editor uEditor = this.c.edit();
       if (uEditor != null) {
          uEditor.putString(p0, p1);
          b.a(uEditor);
          p.d(x.a, ("putString by ").concat(String.valueOf(p0)));
          return;
       }else {
          p.b(x.a, ("putString error by ").concat(String.valueOf(p0)));
          return;
       }
    }
}
