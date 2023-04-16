package com.vivo.push.e$a;
import com.vivo.push.b.c;
import com.vivo.push.IPushActionListener;
import java.lang.Object;
import java.lang.String;
import com.vivo.push.util.p;
import java.lang.Runnable;

public final class e$a	// class@00107c
{
    public IPushActionListener a;
    public c b;
    public IPushActionListener c;
    public Runnable d;
    public Object[] e;

    public void e$a(c p0,IPushActionListener p1){
       super();
       this.b = p0;
       this.a = p1;
    }
    public final void a(){
       e$a td = this.d;
       if (td == null) {
          p.a("PushClientManager", "task is null");
          return;
       }else {
          td.run();
          return;
       }
    }
    public final void a(int p0,Object[] p1){
       this.e = p1;
       e$a tc = this.c;
       if (tc != null) {
          tc.onStateChanged(p0);
       }
       tc = this.a;
       if (tc != null) {
          tc.onStateChanged(p0);
       }
       return;
    }
    public final void a(IPushActionListener p0){
       this.c = p0;
    }
    public final void a(Runnable p0){
       this.d = p0;
    }
    public final Object[] b(){
       return this.e;
    }
}
