package com.kuaishou.merchant.transaction.order.orderlist.tab.event.a;
import sfc.a;
import com.kuaishou.merchant.transaction.order.orderlist.tab.event.b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import wl4.b;

public class a extends a	// class@0008bf
{
    public final b c;

    public void a(b p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       super.b(p0);
       a.l(MerchantTransactionLogBiz.ORDER, "BaseRequestBusinessEvent", "request error", p0);
       this.c.b();
       this.c.f();
       this.c.b();
       return;
    }
}
