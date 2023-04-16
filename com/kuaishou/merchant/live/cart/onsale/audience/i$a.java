package com.kuaishou.merchant.live.cart.onsale.audience.i$a;
import uo7.b0;
import com.kuaishou.merchant.live.cart.onsale.audience.i;
import java.lang.Object;
import uo7.k;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fs3.c$c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import e34.b;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import d34.c;
import d34.b;
import java.lang.System;
import brd.t;
import k34.b0;
import k34.c0;
import erd.g;
import crd.b;

public class i$a implements b0	// class@001940
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public void a(k p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i$a.class, "2")) {
          return;
       }
       i e = this.a.e;
       if (e != null) {
          e.b();
       }
       b.o(1, 0, this.a.a);
       return;
    }
    public void b(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i$a.class, "1")) {
          return;
       }
       b.a().V0(this.a.c, 1, "", System.currentTimeMillis(), "KS_MERCHANT_WELFARE").subscribe(new b0(this), new c0(this));
       return;
    }
    public void c(k p0,ShareInitResponse$SharePanelElement p1,Throwable p2){
    }
}
