package com.kuaishou.merchant.transaction.order.orderlist.tab.event.c;
import sfc.a;
import com.kuaishou.merchant.transaction.order.orderlist.tab.event.d;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wl4.b;

public class c extends a	// class@0008c1
{
    public final d c;

    public void c(d p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       super.b(p0);
       this.c.b();
       return;
    }
}
