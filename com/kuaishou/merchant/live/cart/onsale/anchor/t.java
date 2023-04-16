package com.kuaishou.merchant.live.cart.onsale.anchor.t;
import erd.g;
import com.kuaishou.merchant.live.cart.onsale.anchor.LiveAnchorOnSaleFragment;
import fs3.g;
import java.lang.Object;
import ixc.c;
import f34.f;
import crd.b;
import ok.h;
import lnc.b9;

public final class t implements g	// class@001918
{
    public final LiveAnchorOnSaleFragment b;
    public final g c;

    public void t(LiveAnchorOnSaleFragment p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       t tb = this.b;
       tb.r = b9.c(tb.r, new f(tb, this.c));
    }
}
