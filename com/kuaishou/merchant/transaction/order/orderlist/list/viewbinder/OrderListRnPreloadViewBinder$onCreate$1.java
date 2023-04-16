package com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.OrderListRnPreloadViewBinder$onCreate$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.OrderListRnPreloadViewBinder;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class OrderListRnPreloadViewBinder$onCreate$1 implements DefaultLifecycleObserver	// class@00089e
{
    public final OrderListRnPreloadViewBinder b;

    public void OrderListRnPreloadViewBinder$onCreate$1(OrderListRnPreloadViewBinder p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OrderListRnPreloadViewBinder$onCreate$1.class, "1")) {
          return;
       }
       this.b.S8();
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
