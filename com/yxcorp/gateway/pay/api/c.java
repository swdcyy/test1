package com.yxcorp.gateway.pay.api.c;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gateway.pay.params.result.AuthThirdResult;
import com.yxcorp.gateway.pay.api.PayManager;

public final class c implements o	// class@001222
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object apply(Object p0){
       return PayManager.lambda$authThirdPartyAccount$2(p0);
    }
}
