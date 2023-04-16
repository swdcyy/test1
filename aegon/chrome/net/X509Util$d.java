package aegon.chrome.net.X509Util$d;
import aegon.chrome.net.X509Util$c;
import javax.net.ssl.X509TrustManager;
import java.lang.Object;
import android.net.http.X509TrustManagerExtensions;
import java.security.cert.X509Certificate;
import java.lang.String;
import java.util.List;
import a0.n;
import java.security.cert.CertificateException;
import java.lang.Throwable;

public final class X509Util$d implements X509Util$c	// class@00008e
{
    public final X509TrustManagerExtensions a;

    public void X509Util$d(X509TrustManager p0){
       super();
       this.a = new X509TrustManagerExtensions(p0);
    }
    public List a(X509Certificate[] p0,String p1,String p2){
       try{
          return this.a.checkServerTrusted(p0, p1, p2);
       }catch(java.lang.RuntimeException e2){
          Object[] objArray = new Object[]{e2};
          n.a("X509Util", "checkServerTrusted\(\) unexpectedly threw: %s", objArray);
          throw new CertificateException(e2);
       }
    }
}
