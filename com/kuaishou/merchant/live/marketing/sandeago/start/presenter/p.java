package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.p;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import p74.a;
import java.lang.String;
import o74.a;

public final class p implements g	// class@001a85
{
    public static final p b;

    static {
       p.b = new p();
    }
    public void p(){
       super();
    }
    public final void accept(Object p0){
       a.l(MerchantLiveLogBiz.LIVE_SANDEAGO, "LiveAnchorStartSandeagoPresenter", "sandeago publish", p0);
    }
}
