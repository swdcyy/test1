package com.kuaishou.merchant.transaction.order.orderlist.search.result.viewbinder.OrderSearchResultHeaderViewBinder$1;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.merchant.transaction.order.orderlist.search.result.viewbinder.OrderSearchResultHeaderViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ul4.d;
import com.kuaishou.ksmvvm.command.KSCommand;

public class OrderSearchResultHeaderViewBinder$1 implements LifecycleObserver	// class@0008b5
{
    public final OrderSearchResultHeaderViewBinder b;

    public void OrderSearchResultHeaderViewBinder$1(OrderSearchResultHeaderViewBinder p0){
       this.b = p0;
       super();
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, OrderSearchResultHeaderViewBinder$1.class, "1")) {
          return;
       }
       OrderSearchResultHeaderViewBinder$1 tb = this.b;
       if (tb.C != null) {
          tb.C = false;
          return;
       }else {
          tb.B.J.a();
          return;
       }
    }
}
