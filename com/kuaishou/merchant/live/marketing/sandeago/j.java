package com.kuaishou.merchant.live.marketing.sandeago.j;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.merchant.live.marketing.sandeago.o;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import p74.a;
import java.lang.String;
import o74.a;
import java.lang.CharSequence;
import e17.i;

public final class j implements g	// class@001a40
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public final void accept(Object p0){
       a.g(MerchantLiveLogBiz.LIVE_SANDEAGO, "closeCurrentSandeago", "stop sandeago failed, because of turn mode off");
       i.d(R.style.arg_RES_7f110668, p0.getMessage());
    }
}
