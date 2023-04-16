package com.kuaishou.merchant.transaction.purchase.presenter.r0;
import oj0.a;
import com.kuaishou.merchant.transaction.purchase.presenter.u0;
import java.lang.Object;
import java.util.Map;
import java.util.Objects;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.StringBuilder;
import java.lang.String;
import p74.a;
import o74.a;
import java.lang.Boolean;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import um4.i2;
import java.lang.Runnable;

public final class r0 implements a	// class@0009a5
{
    public final u0 b;

    public void r0(u0 p0){
       this.b = p0;
    }
    public final void W(Map p0){
       r0 tb = this.b;
       Objects.requireNonNull(tb);
       MerchantTransactionLogBiz pURCHASE = MerchantTransactionLogBiz.PURCHASE;
       a.s(pURCHASE, "RNPanelPresenter", "receive EVENT_LOADING_NOTICE, value "+p0);
       if (p0 == null) {
          a.g(pURCHASE, "RNPanelPresenter", "receive EVENT_LOADING_NOTICE, value null");
       }else {
          p0 = p0.get("MerchantPurchaseLoadingData");
          if (p0 instanceof Boolean && tb.getActivity() != null) {
             tb.getActivity().runOnUiThread(new i2(tb, p0));
          }else {
             a.g(pURCHASE, "RNPanelPresenter", "receive EVENT_LOADING_NOTICE, invalid param or activity state");
          }
       }
       return;
    }
}
