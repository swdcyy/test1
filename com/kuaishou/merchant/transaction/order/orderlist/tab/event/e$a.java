package com.kuaishou.merchant.transaction.order.orderlist.tab.event.e$a;
import sfc.a;
import com.kuaishou.merchant.transaction.order.orderlist.tab.event.e;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wl4.b;

public class e$a extends a	// class@0008c3
{
    public final e c;

    public void e$a(e p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       super.b(p0);
       this.c.b();
       return;
    }
}
