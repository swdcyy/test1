package com.kuaishou.merchant.transaction.order.orderlist.tab.model.a;
import com.kuaishou.merchant.transaction.order.orderlist.tab.model.OrderTabItemInfo$ItemInfo;
import com.kuaishou.merchant.transaction.order.orderlist.tab.model.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.s0;
import java.lang.Number;

public class a	// class@0008e7
{
    public OrderTabItemInfo$ItemInfo a;
    public long b;
    public long c;
    public long d;
    public int e;
    public long f;

    public void a(OrderTabItemInfo$ItemInfo p0,long p1,long p2,long p3,int p4,long p5,a$a p6){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public boolean equals(Object p0){
       a uoa = a.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (p0 == null || uoa != p0.getClass()) {
          return false;
       }
       return s0.a(this.a, p0.a);
    }
    public int hashCode(){
       a obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj == null)? 0: obj.hashCode();
       return i;
    }
}
