package com.kuaishou.merchant.transaction.live.orderconfirmpanel.discountpanel.h;
import qvb.n0;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.discountpanel.LiveAudienceDiscountPanelFragment$a;
import java.lang.Object;
import java.util.List;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;

public class h extends n0	// class@0007f4
{
    public LiveAudienceDiscountPanelFragment$a m;

    public void h(LiveAudienceDiscountPanelFragment$a p0){
       super();
       this.m = p0;
    }
    public boolean B1(Object p0){
       return false;
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.just(this.m.b);
    }
    public void M1(Object p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "2")) {
       }else {
          p1.clear();
          p1.addAll(p0);
       }
       return;
    }
}
