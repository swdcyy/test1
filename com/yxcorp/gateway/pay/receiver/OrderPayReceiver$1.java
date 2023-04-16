package com.yxcorp.gateway.pay.receiver.OrderPayReceiver$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gateway.pay.receiver.a;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lv8.g;
import androidx.lifecycle.Lifecycle;

public class OrderPayReceiver$1 implements LifecycleObserver	// class@001262
{
    public final LifecycleOwner b;
    public final a c;

    public void OrderPayReceiver$1(a p0,LifecycleOwner p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, OrderPayReceiver$1.class, "1")) {
          return;
       }
       g.d("OrderPayReceiver lifecycleOwner onDestroy");
       this.c.b = null;
       this.b.getLifecycle().removeObserver(this);
       return;
    }
}
