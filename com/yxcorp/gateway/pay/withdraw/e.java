package com.yxcorp.gateway.pay.withdraw.e;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gateway.pay.params.result.AuthThirdResult;

public final class e implements o	// class@0012da
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final Object apply(Object p0){
       return AuthThirdResult.fail(null, "");
    }
}
