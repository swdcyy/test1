package com.alipay.android.phone.mrpc.core.e;
import org.apache.http.impl.client.DefaultRedirectHandler;
import com.alipay.android.phone.mrpc.core.d;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;
import org.apache.http.StatusLine;

public final class e extends DefaultRedirectHandler	// class@000e4a
{
    public int a;
    public final d b;

    public void e(d p0){
       this.b = p0;
       super();
    }
    public final boolean isRedirectRequested(HttpResponse p0,HttpContext p1){
       this.a = this.a + 1;
       boolean b = super.isRedirectRequested(p0, p1);
       if (!b && this.a < 5) {
          int statusCode = p0.getStatusLine().getStatusCode();
          if (statusCode == 301 || statusCode == 302) {
             return 1;
          }
       }
       return b;
    }
}
