package com.kuaishou.merchant.transaction.purchase.presenter.PaymentMethodPanelPresenter$c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.merchant.transaction.purchase.presenter.PaymentMethodPanelPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class PaymentMethodPanelPresenter$c implements ViewTreeObserver$OnGlobalLayoutListener	// class@000957
{
    public final PaymentMethodPanelPresenter b;

    public void PaymentMethodPanelPresenter$c(PaymentMethodPanelPresenter p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, PaymentMethodPanelPresenter$c.class, "1")) {
          return;
       }
       this.b.P8();
       this.b.R8();
       return;
    }
}
