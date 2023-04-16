package com.kuaishou.merchant.transaction.purchase.presenter.s0;
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
import ue4.q;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import um4.g2;
import java.lang.Runnable;

public final class s0 implements a	// class@0009a7
{
    public final u0 b;

    public void s0(u0 p0){
       this.b = p0;
    }
    public final void W(Map p0){
       s0 tb = this.b;
       Objects.requireNonNull(tb);
       a.s(MerchantTransactionLogBiz.PURCHASE, "RNPanelPresenter", "receive EVENT_REFRESH_PURCHASE_PAGE, value "+p0);
       if (p0 == null) {
       }else if(q.a(p0, tb.s, true) && tb.getActivity() != null){
          tb.getActivity().runOnUiThread(new g2(tb));
       }
       return;
    }
}
