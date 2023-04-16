package com.kuaishou.merchant.transaction.purchase.presenter.PaymentMethodPanelPresenter$4;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.merchant.transaction.purchase.presenter.PaymentMethodPanelPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;

public class PaymentMethodPanelPresenter$4 implements LifecycleObserver	// class@000954
{
    public final PaymentMethodPanelPresenter b;

    public void PaymentMethodPanelPresenter$4(PaymentMethodPanelPresenter p0){
       this.b = p0;
       super();
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, PaymentMethodPanelPresenter$4.class, "1")) {
          return;
       }
       PaymentMethodPanelPresenter$4 tb = this.b;
       if (tb.H != null) {
          tb.H = false;
          return;
       }else {
          tb.A.clear();
          this.b.P8();
          return;
       }
    }
}
