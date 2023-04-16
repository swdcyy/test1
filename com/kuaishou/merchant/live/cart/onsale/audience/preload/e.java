package com.kuaishou.merchant.live.cart.onsale.audience.preload.e;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gateway.pay.api.PayManager;

public final class e implements Runnable	// class@001977
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void run(){
       PayManager.getInstance().preQueryPromotion();
    }
}
