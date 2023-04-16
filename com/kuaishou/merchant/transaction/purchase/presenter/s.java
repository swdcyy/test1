package com.kuaishou.merchant.transaction.purchase.presenter.s;
import java.lang.Runnable;
import com.kuaishou.merchant.transaction.purchase.presenter.r$d;
import com.kuaishou.merchant.transaction.base.live.model.PurchaseCreateOrderUnionResponse;
import com.google.gson.JsonObject;
import java.lang.Object;
import java.util.Objects;
import wkd.b;
import com.kwai.framework.network.sntp.a;
import java.lang.Long;
import java.lang.System;
import com.kuaishou.merchant.transaction.base.live.model.PurchaseCreateOrderUnionResponse$Data;
import java.lang.Math;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.StringBuilder;
import java.lang.String;
import p74.a;
import o74.a;
import com.kuaishou.merchant.transaction.purchase.presenter.r;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import um4.v;
import erd.a;
import com.kuaishou.merchant.transaction.purchase.presenter.q;
import erd.g;
import um4.x;
import com.kuaishou.merchant.transaction.purchase.presenter.r$c;
import com.kuaishou.merchant.transaction.purchase.presenter.r$a;

public final class s implements Runnable	// class@0009a8
{
    public final r$d b;
    public final PurchaseCreateOrderUnionResponse c;
    public final JsonObject d;

    public void s(r$d p0,PurchaseCreateOrderUnionResponse p1,JsonObject p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       s tb = this.b;
       s tc = this.c;
       s td = this.d;
       Objects.requireNonNull(tb);
       Long longx = b.a(0x3b1f7b44).a();
       long l = (longx != null)? longx.longValue(): System.currentTimeMillis() + 2000;
       long l1 = Math.max(0, (tc.mData.mNT - l));
       MerchantTransactionLogBiz pURCHASE = MerchantTransactionLogBiz.PURCHASE;
       String str = "CreateOrderPresenter";
       a.s(pURCHASE, str, "CreateOrderAct: schedule, nt "+tc.mData.mNT+", current "+l+", delay "+l1);
       r$d i = tb.i;
       Objects.requireNonNull(i);
       r or = r.class;
       if (!PatchProxy.isSupport(or) || !PatchProxy.applyVoidTwoRefs(td, Long.valueOf(l1), i, or, "11")) {
          a.s(pURCHASE, str, "createOrderAct: act "+td+",  delay "+l1);
          b9.a(i.N);
          i.N = t.timer(Math.max(0, l1), TimeUnit.MILLISECONDS).observeOn(d.a).doFinally(new v(i)).doOnNext(q.b).subscribe(new x(i, td), new r$c(i, null));
       }
       return;
    }
}
