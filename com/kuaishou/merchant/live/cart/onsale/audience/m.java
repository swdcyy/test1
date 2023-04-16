package com.kuaishou.merchant.live.cart.onsale.audience.m;
import erd.r;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.SCActionSignal;

public final class m implements r	// class@001948
{
    public static final m b;

    static {
       m.b = new m();
    }
    public void m(){
       super();
    }
    public final boolean test(Object p0){
       p0 = p0.commodityCardChange;
       boolean b = (p0 != null && p0.length > 0)? true: false;
       return b;
    }
}
