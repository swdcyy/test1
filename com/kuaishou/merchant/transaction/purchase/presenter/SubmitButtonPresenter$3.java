package com.kuaishou.merchant.transaction.purchase.presenter.SubmitButtonPresenter$3;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.merchant.transaction.purchase.presenter.SubmitButtonPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.purchase.model.BuyButton;

public class SubmitButtonPresenter$3 implements LifecycleObserver	// class@00095a
{
    public final SubmitButtonPresenter b;

    public void SubmitButtonPresenter$3(SubmitButtonPresenter p0){
       this.b = p0;
       super();
    }
    public void onResume(){
       BuyButton mText;
       if (PatchProxy.applyVoid(null, this, SubmitButtonPresenter$3.class, "1")) {
          return;
       }
       SubmitButtonPresenter$3 tb = this.b;
       if (tb.B != null) {
          tb.B = false;
          return;
       }else {
          SubmitButtonPresenter u = tb.u;
          SubmitButtonPresenter z = tb.z;
          if (z != null) {
             mText = z.mText;
             if (mText != null) {
             label_0022 :
                tb.R8(u, mText);
                return;
             }
          }
          mText = "Ã·Ωª∂©µ•";
          goto label_0022 ;
       }
    }
}
