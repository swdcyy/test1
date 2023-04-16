package com.kuaishou.merchant.live.cart.onsale.audience.i$b;
import mhc.n0;
import com.kuaishou.merchant.live.cart.onsale.audience.i;
import com.kwai.framework.model.feed.BaseFeed;
import uo7.k;
import rq4.d;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mhc.n1;
import fs3.c$c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import e34.b;

public class i$b extends n0	// class@001941
{
    public final i c;

    public void i$b(i p0,BaseFeed p1){
       this.c = p0;
       super(p1);
    }
    public void f(k p0,d p1){
    }
    public void m(k p0,ShareInitResponse$SharePanelElement p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, i$b.class, "1")) {
          return;
       }
       super.m(p0, p1, p2);
       i e = this.c.e;
       if (e != null) {
          e.b();
       }
       b.o(1, 0, this.c.a);
       return;
    }
}
