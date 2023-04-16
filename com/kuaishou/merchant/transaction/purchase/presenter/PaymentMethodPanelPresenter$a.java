package com.kuaishou.merchant.transaction.purchase.presenter.PaymentMethodPanelPresenter$a;
import com.kuaishou.merchant.transaction.purchase.presenter.PaymentMethodPanelPresenter$d;
import com.kuaishou.merchant.transaction.purchase.presenter.PaymentMethodPanelPresenter;
import java.lang.Object;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import ue4.o;
import java.util.Collection;
import ekd.q;
import java.util.List;

public class PaymentMethodPanelPresenter$a implements PaymentMethodPanelPresenter$d	// class@000955
{
    public final PaymentMethodPanelPresenter a;

    public void PaymentMethodPanelPresenter$a(PaymentMethodPanelPresenter p0){
       this.a = p0;
       super();
    }
    public PaymentMethodInfo a(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, PaymentMethodPanelPresenter$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (o.u(this.a.y) && !q.f(this.a.u)) {
          int i = 0;
          while (i < this.a.u.size()) {
             if (this.a.u.get(i).mSelected != null) {
                return this.a.u.get(i);
             }
             i = i + 1;
          }
       }
       return objArray;
    }
    public PaymentMethodInfo b(){
       return this.a.z;
    }
}
