package com.kuaishou.merchant.live.f;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.RetrofitException;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import p74.a;
import java.lang.String;
import o74.a;

public final class f implements g	// class@001a1a
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final void accept(Object p0){
       if (!p0 instanceof RetrofitException) {
          a.l(MerchantLiveLogBiz.TRUST_BUBBLE, "LiveAudienceTrustBubblePresenter", "consume bubble request like fail", p0);
       }
       return;
    }
}
