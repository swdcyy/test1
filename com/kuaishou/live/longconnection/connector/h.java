package com.kuaishou.live.longconnection.connector.h;
import erd.g;
import com.kuaishou.live.longconnection.connector.k;
import lf3.g;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.Integer;
import mf3.b;
import java.util.Iterator;
import com.google.protobuf.nano.MessageNano;
import android.os.Handler;
import if3.v;
import java.lang.Runnable;
import com.kuaishou.live.longconnection.connector.RunnablePipeline;
import if3.w;

public final class h implements g	// class@000c6e
{
    public final k b;
    public final int c;
    public final boolean d;
    public final g e;

    public void h(k p0,int p1,boolean p2,g p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       h tb = this.b;
       h tc = this.c;
       h td = this.d;
       h te = this.e;
       Object[] objArray = new Object[]{Integer.valueOf(tc)};
       b.a(tb.g(), "dispatchStickyMessagesImmediately subscribe", objArray);
       p0 = p0.iterator();
       while (p0.hasNext()) {
          MessageNano messageNano = p0.next();
          if (td != null) {
             tb.k().post(new v(tb, tc, te, messageNano));
          }else {
             tb.j().a(new w(tb, tc, te, messageNano));
          }
       }
       return;
    }
}
