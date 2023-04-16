package com.alipay.android.phone.mrpc.core.d;
import org.apache.http.impl.client.DefaultHttpClient;
import com.alipay.android.phone.mrpc.core.b;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpParams;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import com.alipay.android.phone.mrpc.core.f;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.auth.AuthSchemeRegistry;
import java.lang.String;
import java.lang.Object;
import org.apache.http.cookie.CookieSpecRegistry;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.HttpRequestInterceptor;
import com.alipay.android.phone.mrpc.core.b$a;
import org.apache.http.client.RedirectHandler;
import com.alipay.android.phone.mrpc.core.e;

public final class d extends DefaultHttpClient	// class@000e49
{
    public final b a;

    public void d(b p0,ClientConnectionManager p1,HttpParams p2){
       this.a = p0;
       super(p1, p2);
    }
    public final ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy(){
       return new f(this);
    }
    public final HttpContext createHttpContext(){
       BasicHttpContext uBasicHttpCo = new BasicHttpContext();
       uBasicHttpCo.setAttribute("http.authscheme-registry", this.getAuthSchemes());
       uBasicHttpCo.setAttribute("http.cookiespec-registry", this.getCookieSpecs());
       uBasicHttpCo.setAttribute("http.auth.credentials-provider", this.getCredentialsProvider());
       return uBasicHttpCo;
    }
    public final BasicHttpProcessor createHttpProcessor(){
       BasicHttpProcessor uBasicHttpPr = super.createHttpProcessor();
       uBasicHttpPr.addRequestInterceptor(b.a());
       uBasicHttpPr.addRequestInterceptor(new b$a(this.a, 0));
       return uBasicHttpPr;
    }
    public final RedirectHandler createRedirectHandler(){
       return new e(this);
    }
}
