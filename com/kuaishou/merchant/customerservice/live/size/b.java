package com.kuaishou.merchant.customerservice.live.size.b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.merchant.customerservice.CustomerServiceLogBiz;
import p74.a;
import java.lang.String;
import o74.a;

public final class b implements g	// class@001675
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       a.l(CustomerServiceLogBiz.LIVE_SIZE, "LiveCustomerServiceSizeDataController", "commodity change sc message error: ", p0);
    }
}
