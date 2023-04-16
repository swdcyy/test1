package com.vivo.push.g;
import com.vivo.push.IPushActionListener;
import com.vivo.push.e;
import com.vivo.push.e$a;
import java.lang.Object;
import java.lang.String;
import com.vivo.push.util.p;
import com.vivo.push.util.b;

public final class g implements IPushActionListener	// class@001081
{
    public final e$a a;
    public final e b;

    public void g(e p0,e$a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final void onStateChanged(int p0){
       if (!p0) {
          Object[] objArray = this.a.b();
          if (objArray == null || !objArray.length) {
             p.a("PushClientManager", "bind app result is null");
             return;
          }else {
             this.b.a(this.a.b()[0]);
             return;
          }
       }else {
          e.a(this.b, null);
          e.b(this.b).b("APP_TOKEN");
          return;
       }
    }
}
