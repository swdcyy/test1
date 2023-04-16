package com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.OrderListCommonViewBinder$1;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.OrderListCommonViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kl4.m;
import com.kuaishou.ksmvvm.command.KSCommand;

public class OrderListCommonViewBinder$1 implements LifecycleObserver	// class@00089b
{
    public final OrderListCommonViewBinder b;

    public void OrderListCommonViewBinder$1(OrderListCommonViewBinder p0){
       this.b = p0;
       super();
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, OrderListCommonViewBinder$1.class, "1")) {
          return;
       }
       OrderListCommonViewBinder$1 tb = this.b;
       if (tb.w != null) {
          tb.w = false;
          return;
       }else {
          tb.v.l.a();
          return;
       }
    }
}
