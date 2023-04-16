package com.kuaishou.merchant.transaction.purchase.presenter.p;
import erd.g;
import com.kuaishou.merchant.transaction.purchase.presenter.r;
import java.lang.Object;
import com.kuaishou.merchant.transaction.base.live.model.PurchaseCreateOrderUnionResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.live.model.PurchaseCreateOrderUnionResponse$Data;
import java.lang.Long;
import ue4.n;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import um4.t;
import java.lang.Runnable;
import java.lang.System;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import com.kuaishou.merchant.transaction.purchase.presenter.PaymentMethodPanelPresenter$d;
import com.kuaishou.merchant.transaction.base.live.model.PurchasePageParams;
import k2b.e0;
import em4.m;

public final class p implements g	// class@000998
{
    public final r b;

    public void p(r p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       r r;
       p b = this.b;
       Object obj = p0;
       Objects.requireNonNull(b);
       if (PatchProxy.applyVoidOneRefs(obj, b, r.class, "14")) {
       }else {
          PurchaseCreateOrderUnionResponse mData = obj.mData;
          String str = (mData == null)? "": Long.toString(mData.mTid);
          int i = 1;
          n.a(i, str);
          String str1 = "CreateOrderPresenter";
          if (obj.mData == null) {
             a.A(MerchantTransactionLogBiz.PURCHASE, str1, "data null while creating order succeeded");
             b.O = i;
          }else {
             a.s(MerchantTransactionLogBiz.PURCHASE, str1, "createOrderSuccessfully");
             b.V8(new t(b, obj));
             mData = obj.mData;
             b.Q = mData.mTid;
             b.S = mData.mPayFlowControl;
             b.U = System.currentTimeMillis();
             r i1 = b.I;
             r q = b.Q;
             r = b.R;
             boolean b1 = (r != null && r.isServerSelectedAtMainLevel(b.t.b()))? true: false;
             m.k(i1, 1, q, null, r, b1, b.K.mPrevPageSelectedPayMethod, obj.mData.mBatchId, "");
          }
       }
       return;
    }
}
