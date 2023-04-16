package com.alipay.android.phone.mrpc.core.f;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import com.alipay.android.phone.mrpc.core.d;
import java.lang.Object;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

public final class f implements ConnectionKeepAliveStrategy	// class@000e4b
{
    public final d a;

    public void f(d p0){
       this.a = p0;
       super();
    }
    public final long getKeepAliveDuration(HttpResponse p0,HttpContext p1){
       return 0x2bf20;
    }
}
