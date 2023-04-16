package ca7.q;
import javax.net.ssl.SSLSocketFactory;
import java.lang.String;
import javax.net.ssl.SSLContext;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;
import java.security.SecureRandom;
import java.security.GeneralSecurityException;

public class q	// class@000524
{

    public static SSLSocketFactory a(){
       KeyManager[] keyManagerAr = null;
       try{
          SSLContext instance = SSLContext.getInstance("TLSv1");
          instance.init(keyManagerAr, keyManagerAr, keyManagerAr);
          return instance.getSocketFactory();
       }catch(java.security.KeyManagementException e1){
       }catch(java.security.NoSuchAlgorithmException e1){
       }
       e1.printStackTrace();
       return keyManagerAr;
    }
}
