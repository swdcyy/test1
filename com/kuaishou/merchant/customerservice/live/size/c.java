package com.kuaishou.merchant.customerservice.live.size.c;
import erd.o;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import brd.t;

public final class c implements o	// class@001676
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object apply(Object p0){
       return t.fromArray(p0.commodityCardChange);
    }
}
