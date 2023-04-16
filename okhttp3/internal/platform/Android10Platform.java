package okhttp3.internal.platform.Android10Platform;
import okhttp3.internal.platform.AndroidPlatform;
import java.lang.Class;
import okhttp3.internal.platform.OptionalMethod;
import okhttp3.internal.platform.Platform;
import java.lang.String;
import javax.net.ssl.SSLSocket;
import java.util.List;
import javax.net.ssl.SSLParameters;
import java.lang.Object;
import java.io.IOException;
import java.lang.Throwable;
import android.net.ssl.SSLSockets;

public class Android10Platform extends AndroidPlatform	// class@0020d1
{

    public void Android10Platform(Class p0){
       super(p0, null, null, null, null);
    }
    public static Platform buildIfSupported(){
       if (!Platform.isAndroid()) {
          return null;
       }
       try{
          if (AndroidPlatform.getSdkInt() >= 29) {
             return new Android10Platform(Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
          }
          return null;
       }catch(java.lang.ClassNotFoundException e0){
       }
    }
    public void configureTlsExtensions(SSLSocket p0,String p1,List p2){
       try{
          this.enableSessionTickets(p0);
          SSLParameters sSLParameter = p0.getSSLParameters();
          String[] stringArray = new String[0];
          sSLParameter.setApplicationProtocols(Platform.alpnProtocolNames(p2).toArray(stringArray));
          p0.setSSLParameters(sSLParameter);
          return;
       }catch(java.lang.IllegalArgumentException e2){
          throw new IOException("Android internal error", e2);
       }
    }
    public final void enableSessionTickets(SSLSocket p0){
       if (SSLSockets.isSupportedSocket(p0)) {
          SSLSockets.setUseSessionTickets(p0, true);
       }
       return;
    }
    public String getSelectedProtocol(SSLSocket p0){
       String applicationP = p0.getApplicationProtocol();
       if (applicationP == null || applicationP.isEmpty()) {
          return null;
       }
       return applicationP;
    }
}
