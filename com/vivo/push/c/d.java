package com.vivo.push.c.d;
import android.content.Context;
import java.lang.Object;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.c.e;
import com.vivo.push.c.a;
import com.vivo.push.c.b;

public class d	// class@00104e
{
    public b a;
    public c b;
    public Context c;
    public static d d;

    public void d(Context p0){
       super();
       if (this.a == null) {
          p0 = ContextDelegate.getContext(p0.getApplicationContext());
          this.c = p0;
          this.a = new e(p0);
       }
       if (this.b == null) {
          this.b = new a();
       }
       return;
    }
    public static d a(Context p0){
       if (d.d == null) {
          _monitor_enter(d.class);
          if (d.d == null && p0 != null) {
             d.d = new d(p0);
          }
          _monitor_exit(d.class);
       }
       return d.d;
    }
    public final b a(){
       return this.a;
    }
}
