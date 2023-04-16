package com.kuaishou.merchant.transaction.order.orderlist.search.result.viewbinder.OrderSearchResultHeaderViewBinder$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.order.orderlist.search.result.viewbinder.OrderSearchResultHeaderViewBinder;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ml4.a;
import androidx.lifecycle.LiveData;
import com.kuaishou.merchant.transaction.order.orderlist.search.model.SearchParams;
import com.kuaishou.merchant.transaction.order.orderlist.list.model.ServiceEntryInfo;

public class OrderSearchResultHeaderViewBinder$b extends m	// class@0008b7
{
    public final OrderSearchResultHeaderViewBinder c;

    public void OrderSearchResultHeaderViewBinder$b(OrderSearchResultHeaderViewBinder p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OrderSearchResultHeaderViewBinder$b.class, "1")) {
          return;
       }
       OrderSearchResultHeaderViewBinder$b tc = this.c;
       Objects.requireNonNull(tc);
       if (PatchProxy.applyVoidOneRefs(p0, tc, OrderSearchResultHeaderViewBinder.class, "8") || (tc.A.c.getValue() != null && tc.A.c.getValue().mAfterSaleIconInfo != null)) {
          tc.d9(tc.A.c.getValue().mAfterSaleIconInfo);
       }
    label_0043 :
       return;
    }
}
