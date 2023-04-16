package com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.BaseRefreshOrderViewBinder$1;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.BaseRefreshOrderViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.a;

public class BaseRefreshOrderViewBinder$1 implements LifecycleObserver	// class@00085f
{
    public final BaseRefreshOrderViewBinder b;

    public void BaseRefreshOrderViewBinder$1(BaseRefreshOrderViewBinder p0){
       this.b = p0;
       super();
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, BaseRefreshOrderViewBinder$1.class, "1")) {
          return;
       }
       BaseRefreshOrderViewBinder$1 tb = this.b;
       if (tb.s != null) {
          tb.s = false;
          return;
       }else {
          tb.W8(tb.S8().B);
          return;
       }
    }
}
