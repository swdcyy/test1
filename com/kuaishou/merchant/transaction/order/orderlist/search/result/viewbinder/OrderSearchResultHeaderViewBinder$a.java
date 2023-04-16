package com.kuaishou.merchant.transaction.order.orderlist.search.result.viewbinder.OrderSearchResultHeaderViewBinder$a;
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

public class OrderSearchResultHeaderViewBinder$a extends m	// class@0008b6
{
    public final OrderSearchResultHeaderViewBinder c;

    public void OrderSearchResultHeaderViewBinder$a(OrderSearchResultHeaderViewBinder p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OrderSearchResultHeaderViewBinder$a.class, "1")) {
          return;
       }
       OrderSearchResultHeaderViewBinder$a tc = this.c;
       Objects.requireNonNull(tc);
       if (PatchProxy.applyVoidOneRefs(p0, tc, OrderSearchResultHeaderViewBinder.class, "7") || (tc.A.c.getValue() != null && tc.A.c.getValue().mCsIconInfo != null)) {
          tc.d9(tc.A.c.getValue().mCsIconInfo);
       }
    label_0043 :
       return;
    }
}
