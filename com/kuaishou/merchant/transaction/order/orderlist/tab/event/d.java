package com.kuaishou.merchant.transaction.order.orderlist.tab.event.d;
import com.kuaishou.merchant.transaction.order.orderlist.tab.event.b;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.a;
import java.util.HashMap;
import com.kuaishou.merchant.transaction.order.orderlist.tab.event.payload.TabBusinessPayload;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ll4.b;
import ll4.a;
import java.util.Map;
import cjd.e;
import erd.o;
import com.kuaishou.merchant.transaction.order.orderlist.tab.event.model.ExtendTimeOptionResponse;
import java.lang.CharSequence;
import e17.i;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.MerchantEventModel;
import wl4.b;
import wl4.c;
import com.kuaishou.merchant.transaction.order.orderlist.tab.event.c;
import erd.g;
import crd.b;

public class d extends b	// class@0008c2
{
    public HashMap h;

    public void d(Fragment p0,a p1){
       super(p0, p1);
       this.h = new HashMap();
    }
    public t e(TabBusinessPayload p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.h = p0.mParams;
       return a.a().j(this.h).map(new e());
    }
    public void f(){
    }
    public void g(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else if(p0.mValidTime != 1){
          i.d(R.style.arg_RES_7f11066a, p0.mMsg);
          this.d(null);
       }else {
          this.h.put("extendTime", String.valueOf(p0.mOptionalExtendTime[0]));
          this.a(a.a().p(this.h).map(new e()).subscribe(new c(this), new c(this)));
       }
       return;
    }
}
