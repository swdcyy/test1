package com.kuaishou.merchant.transaction.order.orderlist.search.result.MerchantOrderSearchResultFragment$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.kuaishou.merchant.transaction.order.orderlist.search.result.MerchantOrderSearchResultFragment;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import ml4.a;
import ul4.d;
import com.kuaishou.merchant.transaction.order.orderlist.search.model.SearchParams;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import yk4.i;
import java.util.HashMap;

public class MerchantOrderSearchResultFragment$a implements ViewModelProvider$Factory	// class@0008b3
{
    public final MerchantOrderSearchResultFragment a;

    public void MerchantOrderSearchResultFragment$a(MerchantOrderSearchResultFragment p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       p0 = PatchProxy.applyOneRefs(p0, this, MerchantOrderSearchResultFragment$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       MerchantOrderSearchResultFragment$a ta = this.a;
       return new d(ta, ta.J, ta.L.mPostParams, ViewModelProviders.of(this.a.getActivity()).get(a.class));
    }
}
