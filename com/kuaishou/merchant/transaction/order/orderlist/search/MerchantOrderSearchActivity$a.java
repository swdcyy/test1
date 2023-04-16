package com.kuaishou.merchant.transaction.order.orderlist.search.MerchantOrderSearchActivity$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.kuaishou.merchant.transaction.order.orderlist.search.MerchantOrderSearchActivity;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ml4.a;

public class MerchantOrderSearchActivity$a implements ViewModelProvider$Factory	// class@0008ab
{
    public final MerchantOrderSearchActivity a;

    public void MerchantOrderSearchActivity$a(MerchantOrderSearchActivity p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       p0 = PatchProxy.applyOneRefs(p0, this, MerchantOrderSearchActivity$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new a();
    }
}
