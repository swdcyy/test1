package com.kuaishou.live.longconnection.connector.j;
import java.lang.Runnable;
import com.kuaishou.live.longconnection.connector.k;
import java.lang.Object;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.String;
import if3.x;
import pf3.a;
import pf3.c;

public final class j implements Runnable	// class@000c70
{
    public final k b;
    public final int c;
    public final byte[] d;
    public final boolean e;
    public final boolean f;

    public void j(k p0,int p1,byte[] p2,boolean p3,boolean p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void run(){
       j tb = this.b;
       j tc = this.c;
       j td = this.d;
       j te = this.e;
       j tf = this.f;
       if (!tb.l(Integer.valueOf(tc))) {
          String str = "rawPayload:"+tc;
          x ox = new x(tb, tc, td, te, tf);
          long l = a.a("rawPayload:"+tc, v9);
          k v = tb.v;
          if (v != null) {
             v.a(str, l);
          }
       }
       return;
    }
}
