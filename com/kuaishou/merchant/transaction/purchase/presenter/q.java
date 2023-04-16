package com.kuaishou.merchant.transaction.purchase.presenter.q;
import erd.g;
import java.lang.Object;
import java.lang.Long;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.System;
import p74.a;
import o74.a;

public final class q implements g	// class@00099c
{
    public static final q b;

    static {
       q.b = new q();
    }
    public void q(){
       super();
    }
    public final void accept(Object p0){
       a.s(MerchantTransactionLogBiz.PURCHASE, "CreateOrderPresenter", "CreateOrderAct: execute "+System.currentTimeMillis());
    }
}
