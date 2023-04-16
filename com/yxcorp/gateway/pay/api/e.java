package com.yxcorp.gateway.pay.api.e;
import com.yxcorp.retrofit.c$b;
import java.lang.Object;
import okhttp3.Request;
import java.util.Map;
import java.lang.String;
import android.util.Pair;
import hv8.c;
import yid.f;

public final class e implements c$b	// class@001224
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public final Pair a(Request p0,Map p1,Map p2,String p3){
       return c.g(p0, p1, p2, p3);
    }
    public Pair b(String p0,String p1){
       return f.a(this, p0, p1);
    }
}
