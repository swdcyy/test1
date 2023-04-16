package com.yxcorp.gifshow.init.module.d0;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.init.module.GiftStoreInitModule;
import o56.d;
import com.kuaishou.gifshow.network.degrade.RequestTiming;

public final class d0 implements Runnable	// class@0019b8
{
    public static final d0 b;

    static {
       d0.b = new d0();
    }
    public void d0(){
       super();
    }
    public final void run(){
       if (d.i) {
          GiftStoreInitModule.n0(RequestTiming.LOGIN);
       }
       return;
    }
}
