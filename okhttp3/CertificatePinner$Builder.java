package okhttp3.CertificatePinner$Builder;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.util.Objects;
import okhttp3.CertificatePinner$Pin;
import java.util.List;
import okhttp3.CertificatePinner;
import java.util.LinkedHashSet;
import java.util.Collection;
import java.util.Set;
import okhttp3.internal.tls.CertificateChainCleaner;

public final class CertificatePinner$Builder	// class@002062
{
    public final List pins;

    public void CertificatePinner$Builder(){
       super();
       this.pins = new ArrayList();
    }
    public CertificatePinner$Builder add(String p0,String[] p1){
       Objects.requireNonNull(p0, "pattern == null");
       int len = p1.length;
       for (int i = 0; i < len; i = i + 1) {
          this.pins.add(new CertificatePinner$Pin(p0, p1[i]));
       }
       return this;
    }
    public CertificatePinner build(){
       return new CertificatePinner(new LinkedHashSet(this.pins), null);
    }
}
