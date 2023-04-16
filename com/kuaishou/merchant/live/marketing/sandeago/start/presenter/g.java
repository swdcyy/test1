package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.g;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import p74.a;
import java.lang.String;
import o74.a;
import com.kuaishou.merchant.live.marketing.sandeago.model.SandeagoPropValueResponse;

public final class g implements o	// class@001a77
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final Object apply(Object p0){
       a.l(MerchantLiveLogBiz.LIVE_SANDEAGO, "LiveAnchorStartSandeagoCategoryPresenter", "fetch prop values info error", p0);
       return new SandeagoPropValueResponse();
    }
}
