package com.kuaishou.merchant.transaction.purchase.presenter.AddressUIPresenter$6;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.merchant.transaction.purchase.presenter.AddressUIPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class AddressUIPresenter$6 implements LifecycleObserver	// class@000951
{
    public final AddressUIPresenter b;

    public void AddressUIPresenter$6(AddressUIPresenter p0){
       this.b = p0;
       super();
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, AddressUIPresenter$6.class, "1")) {
          return;
       }
       AddressUIPresenter$6 tb = this.b;
       if (tb.N != null) {
          tb.N = false;
          return;
       }else {
          tb.V8(tb.M, tb.K, true);
          return;
       }
    }
}
