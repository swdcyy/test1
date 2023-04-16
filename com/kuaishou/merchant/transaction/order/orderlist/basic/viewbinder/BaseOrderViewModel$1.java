package com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.BaseOrderViewModel$1;
import java.util.LinkedList;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.BaseOrderViewModel;
import android.util.Pair;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.merchant.transaction.order.orderlist.basic.model.OrderListGuessLikeBackwardCardFrequencyControlModel;
import java.lang.StringBuilder;
import java.util.Iterator;

public class BaseOrderViewModel$1 extends LinkedList	// class@00085c
{
    public final BaseOrderViewModel this$0;

    public void BaseOrderViewModel$1(BaseOrderViewModel p0){
       this.this$0 = p0;
       super();
    }
    public boolean add(Pair p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseOrderViewModel$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = super.add(p0);
       if (this.size() > this.this$0.m.mMinClickNum) {
          this.remove();
       }
       return b;
    }
    public boolean add(Object p0){
       return this.add(p0);
    }
    public String toString(){
       StringBuilder obj = PatchProxy.apply(null, this, BaseOrderViewModel$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "[";
       Iterator iterator = this.iterator();
       while (iterator.hasNext()) {
          obj = obj+iterator.next();
          if (iterator.hasNext()) {
             obj = obj+", ";
          }
       }
       return obj+"]";
    }
}
