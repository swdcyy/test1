package com.alipay.android.phone.mrpc.core.b$a;
import org.apache.http.HttpRequestInterceptor;
import com.alipay.android.phone.mrpc.core.b;
import java.lang.Object;
import org.apache.http.HttpRequest;
import org.apache.http.protocol.HttpContext;
import com.alipay.android.phone.mrpc.core.b$b;
import org.apache.http.client.methods.HttpUriRequest;
import java.lang.String;

public final class b$a implements HttpRequestInterceptor	// class@000e45
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void b$a(b p0,byte p1){
       super(p0);
    }
    public final void process(HttpRequest p0,HttpContext p1){
       b$b uob = b.a(this.a);
       if (uob != null && (b$b.a(uob) && p0 instanceof HttpUriRequest)) {
          b$b.a(uob, b.a(p0));
       }
    label_001b :
       return;
    }
}
