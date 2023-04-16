package okhttp3.internal.tls.TrustRootIndex;
import java.security.cert.X509Certificate;

public interface abstract TrustRootIndex	// class@0020e1
{

    X509Certificate findByIssuerAndSignature(X509Certificate p0);
}
