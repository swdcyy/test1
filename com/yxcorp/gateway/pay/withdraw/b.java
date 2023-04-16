package com.yxcorp.gateway.pay.withdraw.b;
import erd.o;
import java.lang.Object;
import pv8.a;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gateway.pay.params.result.AuthThirdResult;
import java.lang.StringBuilder;
import lv8.g;
import brd.t;

public final class b implements o	// class@0012d7
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final Object apply(Object p0){
       if (TextUtils.equals(p0.a(), "9000") && TextUtils.equals(p0.e(), "200")) {
          p0 = AuthThirdResult.success(p0.e(), p0.f());
       }else {
          g.d("auth failed, error_code="+p0.e()+", status="+p0.a()+", memo="+p0.d());
          p0 = AuthThirdResult.fail(p0.e(), p0.d());
       }
       return t.just(p0);
    }
}
