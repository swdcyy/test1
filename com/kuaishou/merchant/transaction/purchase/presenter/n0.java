package com.kuaishou.merchant.transaction.purchase.presenter.n0;
import erd.g;
import com.kuaishou.merchant.transaction.purchase.presenter.o0;
import java.lang.Object;
import com.kuaishou.merchant.transaction.base.payment.PrepayResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.StringBuilder;
import com.kuaishou.merchant.transaction.base.payment.PrepayData;
import p74.a;
import o74.a;
import java.lang.System;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import vm4.e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import um4.x1;
import java.lang.Runnable;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import k2b.e0;
import em4.m;
import java.lang.RuntimeException;
import lnc.a1;

public final class n0 implements g	// class@00098f
{
    public final o0 b;

    public void n0(o0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       PrepayData mMerchantId;
       n0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, o0.class, "7")) {
       }else {
          MerchantTransactionLogBiz pURCHASE = MerchantTransactionLogBiz.PURCHASE;
          StringBuilder str = "onPrepaySuccess: merchantId ";
          String str1 = "null";
          if (p0 != null) {
             PrepayResponse mData = p0.mData;
             if (mData != null) {
                mMerchantId = mData.mMerchantId;
             label_002b :
                str = str+mMerchantId+", prepayNo ";
                if (p0 != null) {
                   mData = p0.mData;
                   if (mData != null) {
                      str1 = mData.mPrepayNo;
                   }
                }
                str1 = "PrepayPresenter";
                a.s(pURCHASE, str1, str+str1);
                tb.E = System.currentTimeMillis();
                boolean b = true;
                if (p0 != null) {
                   mData = p0.mData;
                   if (mData != null && mData.mNeedJumpLandingPage != null) {
                      mData = 1;
                   label_005b :
                      if (mData) {
                         e.f(tb.getActivity(), p0.mData.mPayLandingPageLink);
                         tb.y = b;
                      }else if(p0 != null){
                         mData = p0.mData;
                         if (mData != null && mData.isBankTransferPay()) {
                            tb.R8();
                            tb.y = b;
                         }
                      }
                      if (p0 != null) {
                         mData = p0.mData;
                         if (mData != null && (!TextUtils.x(mData.mMerchantId) && !TextUtils.x(p0.mData.mPrepayNo))) {
                            tb.y = b;
                            tb.S8(new x1(tb, p0));
                            m.p(tb.t, 1, e.e(tb.C), tb.B, null, tb.D);
                         }
                      }
                      tb.y = b;
                      a.s(pURCHASE, str1, "onPrepaySuccess: data invalid");
                      throw new RuntimeException(a1.p(0x7f1033b5));
                   }
                }
                mData = null;
                goto label_005b ;
             }
          }
          mMerchantId = str1;
          goto label_002b ;
       }
       return;
    }
}
