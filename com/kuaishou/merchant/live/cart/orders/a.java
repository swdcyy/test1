package com.kuaishou.merchant.live.cart.orders.a;
import qvb.f;
import java.lang.String;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qvb.n0;
import com.kuaishou.merchant.live.cart.orders.LiveShopOrderResponse;
import d34.c;
import d34.b;
import cjd.e;
import erd.o;

public class a extends f	// class@0019cc
{
    public String p;

    public void a(String p0){
       super();
       this.p = p0;
    }
    public t I1(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().getCursor();
       }
       return b.a().g1(this.p, objArray, 20).map(new e());
    }
}
