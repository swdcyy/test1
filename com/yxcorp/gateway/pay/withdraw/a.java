package com.yxcorp.gateway.pay.withdraw.a;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gateway.pay.response.BindResult;

public final class a implements o	// class@0012d6
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object apply(Object p0){
       return BindResult.fail(p0.getMessage());
    }
}
