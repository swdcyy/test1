package com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.OrderListRnPreloadViewBinder;
import rk0.b;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.OrderListRnPreloadViewBinder$onCreate$1;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LifecycleObserver;
import android.os.Build$VERSION;
import bm4.b;
import android.os.Looper;
import android.os.MessageQueue;
import com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.OrderListRnPreloadViewBinder$a;
import android.os.MessageQueue$IdleHandler;

public final class OrderListRnPreloadViewBinder extends b	// class@00089f
{
    public DefaultLifecycleObserver s;

    public void OrderListRnPreloadViewBinder(Fragment p0){
       super(p0);
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, OrderListRnPreloadViewBinder.class, "1")) {
          return;
       }
       this.s = new OrderListRnPreloadViewBinder$onCreate$1(this);
       FragmentActivity activity = this.R8().getActivity();
       if (activity != null) {
          Lifecycle lifecycle = activity.getLifecycle();
          if (lifecycle != null) {
             OrderListRnPreloadViewBinder ts = this.s;
             if (ts == null) {
                a.S("mLifecycleObserver");
             }
             lifecycle.addObserver(ts);
          }
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, OrderListRnPreloadViewBinder.class, "2")) {
          return;
       }
       FragmentActivity activity = this.R8().getActivity();
       if (activity != null) {
          Lifecycle lifecycle = activity.getLifecycle();
          if (lifecycle != null) {
             OrderListRnPreloadViewBinder ts = this.s;
             if (ts == null) {
                a.S("mLifecycleObserver");
             }
             lifecycle.removeObserver(ts);
          }
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, OrderListRnPreloadViewBinder.class, "3")) {
          return;
       }
       if (Build$VERSION.SDK_INT >= 23 && b.a()) {
          Looper.getMainLooper().getQueue().addIdleHandler(OrderListRnPreloadViewBinder$a.a);
       }
       return;
    }
}
