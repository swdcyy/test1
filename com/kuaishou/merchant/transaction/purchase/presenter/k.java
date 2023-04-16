package com.kuaishou.merchant.transaction.purchase.presenter.k;
import oj0.a;
import com.kuaishou.merchant.transaction.purchase.presenter.r;
import java.lang.Object;
import java.util.Map;
import java.util.Objects;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.StringBuilder;
import java.lang.String;
import p74.a;
import o74.a;
import ue4.q;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import um4.r;
import java.lang.Runnable;

public final class k implements a	// class@000988
{
    public final r b;

    public void k(r p0){
       this.b = p0;
    }
    public final void W(Map p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       a.s(MerchantTransactionLogBiz.PURCHASE, "CreateOrderPresenter", "receive EVENT_SUBMIT_ORDER, value "+p0);
       if (p0 == null) {
       }else if(q.a(p0, tb.P, true) && tb.getActivity() != null){
          tb.getActivity().runOnUiThread(new r(tb));
       }
       return;
    }
}
