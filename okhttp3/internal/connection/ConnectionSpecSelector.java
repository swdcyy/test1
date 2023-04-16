package okhttp3.internal.connection.ConnectionSpecSelector;
import java.util.List;
import java.lang.Object;
import javax.net.ssl.SSLSocket;
import okhttp3.ConnectionSpec;
import okhttp3.internal.Internal;
import java.net.UnknownServiceException;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.Arrays;
import java.io.IOException;
import java.net.ProtocolException;
import java.io.InterruptedIOException;
import javax.net.ssl.SSLHandshakeException;
import java.lang.Throwable;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLException;

public final class ConnectionSpecSelector	// class@0020a9
{
    public final List connectionSpecs;
    public boolean isFallback;
    public boolean isFallbackPossible;
    public int nextModeIndex;

    public void ConnectionSpecSelector(List p0){
       super();
       this.nextModeIndex = 0;
       this.connectionSpecs = p0;
    }
    public ConnectionSpec configureSecureSocket(SSLSocket p0){
       ConnectionSpec uConnectionS;
       ConnectionSpecSelector tnextModeInd = this.nextModeIndex;
       int i = this.connectionSpecs.size();
       while (true) {
          if (tnextModeInd < i) {
             uConnectionS = this.connectionSpecs.get(tnextModeInd);
             if (uConnectionS.isCompatible(p0)) {
                this.nextModeIndex = tnextModeInd + 1;
             label_0021 :
                if (uConnectionS == null) {
                   throw new UnknownServiceException("Unable to find acceptable protocols. isFallback="+this.isFallback+", modes="+this.connectionSpecs+", supported protocols="+Arrays.toString(p0.getEnabledProtocols()));
                }
                break ;
             }else {
                tnextModeInd = tnextModeInd + 1;
             }
          }else {
             uConnectionS = null;
             goto label_0021 ;
          }
       }
       this.isFallbackPossible = this.isFallbackPossible(p0);
       Internal.instance.apply(uConnectionS, p0, this.isFallback);
       return uConnectionS;
    }
    public boolean connectionFailed(IOException p0){
       boolean b = true;
       this.isFallback = b;
       if (this.isFallbackPossible == null) {
          return false;
       }
       if (p0 instanceof ProtocolException) {
          return false;
       }
       if (p0 instanceof InterruptedIOException) {
          return false;
       }
       if ((v1 = p0 instanceof SSLHandshakeException) && p0.getCause() instanceof CertificateException) {
          return false;
       }
       if (p0 instanceof SSLPeerUnverifiedException) {
          return false;
       }
       if (v1 || (!p0 instanceof SSLProtocolException && !p0 instanceof SSLException)) {
          b = false;
       }
    label_0031 :
       return b;
    }
    public final boolean isFallbackPossible(SSLSocket p0){
       ConnectionSpecSelector tnextModeInd = this.nextModeIndex;
       while (true) {
          if (tnextModeInd >= this.connectionSpecs.size()) {
             return false;
          }
          if (this.connectionSpecs.get(tnextModeInd).isCompatible(p0)) {
             break ;
          }else {
             tnextModeInd = tnextModeInd + 1;
          }
       }
       return true;
    }
}
