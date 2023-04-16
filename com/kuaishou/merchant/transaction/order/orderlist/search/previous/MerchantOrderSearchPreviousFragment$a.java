package com.kuaishou.merchant.transaction.order.orderlist.search.previous.MerchantOrderSearchPreviousFragment$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.kuaishou.merchant.transaction.order.orderlist.search.previous.MerchantOrderSearchPreviousFragment;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import rl4.n;
import com.kuaishou.merchant.transaction.order.orderlist.search.model.SearchParams;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.merchant.transaction.order.orderlist.search.previous.a;
import java.util.HashMap;

public class MerchantOrderSearchPreviousFragment$a implements ViewModelProvider$Factory	// class@0008af
{
    public final MerchantOrderSearchPreviousFragment a;

    public void MerchantOrderSearchPreviousFragment$a(MerchantOrderSearchPreviousFragment p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       p0 = PatchProxy.applyOneRefs(p0, this, MerchantOrderSearchPreviousFragment$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       MerchantOrderSearchPreviousFragment$a ta = this.a;
       return new n(ta, ta.I, ta.L, ta.M.mPostParams);
    }
}
