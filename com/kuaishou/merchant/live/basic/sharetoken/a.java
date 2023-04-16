package com.kuaishou.merchant.live.basic.sharetoken.a;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import p74.a;
import java.lang.String;
import o74.a;

public final class a implements g	// class@0018cc
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       a.l(MerchantLiveLogBiz.SHARE_TOKEN, "LiveMerchantAudienceShareTokenPresenter", "get jump params from share token error", p0);
    }
}
