package com.vivo.push.i;
import com.vivo.push.IPushActionListener;
import com.vivo.push.e;
import java.lang.Object;
import java.lang.String;
import com.vivo.push.util.b;

public final class i implements IPushActionListener	// class@001083
{
    public final e a;

    public void i(e p0){
       this.a = p0;
       super();
    }
    public final void onStateChanged(int p0){
       if (!p0) {
          e.a(this.a, "");
          e.b(this.a).a("APP_TOKEN", "");
          e.c(this.a);
          e.d(this.a);
          return;
       }else {
          e.a(this.a, null);
          e.b(this.a).b("APP_TOKEN");
          return;
       }
    }
}
