package com.kuaishou.merchant.live.cart.onsale.audience.l;
import erd.o;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import brd.t;

public final class l implements o	// class@001947
{
    public static final l b;

    static {
       l.b = new l();
    }
    public void l(){
       super();
    }
    public final Object apply(Object p0){
       return t.fromArray(p0.commodityCardChange);
    }
}
