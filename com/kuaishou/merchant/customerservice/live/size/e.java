package com.kuaishou.merchant.customerservice.live.size.e;
import erd.r;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.SCActionSignal;

public final class e implements r	// class@001678
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final boolean test(Object p0){
       p0 = p0.commodityCardChange;
       boolean b = (p0 != null && p0.length > 0)? true: false;
       return b;
    }
}
