package okhttp3.internal.tls.CertificateChainCleaner;
import java.lang.Object;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.platform.Platform;
import java.security.cert.X509Certificate;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.TrustRootIndex;
import java.util.List;
import java.lang.String;

public abstract class CertificateChainCleaner	// class@0020df
{

    public void CertificateChainCleaner(){
       super();
    }
    public static CertificateChainCleaner get(X509TrustManager p0){
       return Platform.get().buildCertificateChainCleaner(p0);
    }
    public static CertificateChainCleaner get(X509Certificate[] p0){
       return new BasicCertificateChainCleaner(new BasicTrustRootIndex(p0));
    }
    public abstract List clean(List p0,String p1);
}
