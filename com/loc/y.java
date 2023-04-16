package com.loc.y;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import com.loc.x;
import com.loc.af;
import com.loc.o$a;
import com.loc.o;
import com.loc.ac;
import com.loc.z;

public class y	// class@001472
{
    public final Context b;
    public final String c;
    public static y a;

    public void y(Context p0){
       super();
       this.b = p0.getApplicationContext();
       this.c = af.a(x.c("RYW1hcF9kZXZpY2VfYWRpdQ"));
    }
    public static y a(Context p0){
       if (y.a == null) {
          _monitor_enter(y.class);
          if (y.a == null) {
             y.a = new y(p0);
          }
          _monitor_exit(y.class);
       }
       return y.a;
    }
    public synchronized final void a(){
       if (o.c() == null) {
          o.a(ac.a());
       }
       return;
    }
    public final void a(String p0){
       z.a(this.b).a(this.c);
       z.a(this.b).b(p0);
    }
}
