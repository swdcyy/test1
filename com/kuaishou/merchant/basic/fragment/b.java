package com.kuaishou.merchant.basic.fragment.b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import java.lang.String;
import o74.a;

public final class b implements g	// class@0015bd
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       a.l(MerchantCommonLogBiz.PERFMONITOR, "MerchantPagePerfLogger", "fragment fps lifecycle error", p0);
    }
}
