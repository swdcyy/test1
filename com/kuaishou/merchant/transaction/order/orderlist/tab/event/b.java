package com.kuaishou.merchant.transaction.order.orderlist.tab.event.b;
import wl4.b;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.a;
import com.kuaishou.merchant.transaction.order.orderlist.tab.event.payload.TabBusinessPayload;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import wl4.a;
import com.kuaishou.merchant.transaction.order.orderlist.tab.event.a;
import erd.g;
import crd.b;

public abstract class b extends b	// class@0008c0
{

    public void b(Fragment p0,a p1){
       super(p0, p1);
    }
    public abstract t e(TabBusinessPayload p0);
    public abstract void f();
    public abstract void g(Object p0);
    public void onEvent(TabBusinessPayload p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, uob, "2")) {
          t ot = this.e(p0);
          if (ot == null) {
             this.b();
             a.s(MerchantTransactionLogBiz.ORDER, "BaseRequestBusinessEvent", "requestBusinessInfo, but request is null");
          }else {
             this.a(ot.subscribe(new a(this), new a(this)));
          }
       }
       return;
    }
}
