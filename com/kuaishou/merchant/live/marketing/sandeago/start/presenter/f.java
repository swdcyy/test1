package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.f;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import p74.a;
import java.lang.String;
import o74.a;
import com.kuaishou.merchant.live.marketing.sandeago.model.StartSandeagoCategoryInfoResponse;

public final class f implements o	// class@001a76
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final Object apply(Object p0){
       a.l(MerchantLiveLogBiz.LIVE_SANDEAGO, "LiveAnchorStartSandeagoCategoryPresenter", "fetch category info error", p0);
       return new StartSandeagoCategoryInfoResponse();
    }
}
