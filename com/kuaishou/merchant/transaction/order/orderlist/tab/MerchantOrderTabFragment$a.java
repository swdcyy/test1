package com.kuaishou.merchant.transaction.order.orderlist.tab.MerchantOrderTabFragment$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.kuaishou.merchant.transaction.order.orderlist.tab.MerchantOrderTabFragment;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import com.kwai.robust.PatchProxyResult;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zl4.a;
import java.util.Objects;
import java.util.HashMap;
import java.util.Map;
import ekd.q;
import android.net.Uri;
import ekd.x0;
import ot3.h0;
import vl4.j;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.merchant.transaction.order.orderlist.tab.a;
import com.kuaishou.merchant.transaction.order.orderlist.tab.model.OrderCommodityResponse;

public class MerchantOrderTabFragment$a implements ViewModelProvider$Factory	// class@0008bb
{
    public final MerchantOrderTabFragment a;

    public void MerchantOrderTabFragment$a(MerchantOrderTabFragment p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyOneRefs(p0, this, MerchantOrderTabFragment$a.class, "1");
       if (p0 != patchProxyRe) {
          return p0;
       }
       MerchantOrderTabFragment$a ta = this.a;
       MerchantOrderTabFragment o = ta.O;
       MerchantOrderTabFragment l = ta.L;
       MerchantOrderTabFragment k = ta.K;
       Objects.requireNonNull(ta);
       HashMap hashMap = PatchProxy.apply(null, ta, MerchantOrderTabFragment.class, "20");
       if (hashMap != patchProxyRe) {
       }else {
          HashMap hashMap1 = new HashMap();
          if (!q.h(ta.P)) {
             hashMap1.putAll(ta.P);
          }
          h0.b(x0.f(ta.J), hashMap1);
          hashMap = hashMap1;
       }
       a uoa = new a(o, ta, l, k, hashMap);
       return p0;
    }
}
