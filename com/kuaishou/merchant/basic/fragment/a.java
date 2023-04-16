package com.kuaishou.merchant.basic.fragment.a;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import java.lang.String;
import o74.a;

public final class a implements g	// class@0015bc
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       a.l(MerchantCommonLogBiz.PERFMONITOR, "MerchantPagePerfLogger", "fragment lifecycle error", p0);
    }
}
