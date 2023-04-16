package com.kwai.video.ksuploaderkit.utils.SSLSocketFactoryUtils;
import java.lang.Object;
import javax.net.ssl.SSLSocketFactory;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import javax.net.ssl.TrustManager;
import com.kwai.video.ksuploaderkit.utils.SSLSocketFactoryUtils$1;
import javax.net.ssl.SSLContext;
import javax.net.ssl.KeyManager;
import java.security.SecureRandom;
import java.lang.Exception;
import java.security.GeneralSecurityException;

public class SSLSocketFactoryUtils	// class@0009e4
{

    public void SSLSocketFactoryUtils(){
       super();
    }
    public static SSLSocketFactory getIgnoreAllSocketFactory(){
       TrustManager[] obj = PatchProxy.apply(null, null, SSLSocketFactoryUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 1;
       try{
          obj = new TrustManager[i];
          obj[0] = new SSLSocketFactoryUtils$1();
          SSLContext instance = SSLContext.getInstance("TLSv1");
          instance.init(null, obj, null);
          return instance.getSocketFactory();
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          return v1;
       }
    }
    public static SSLSocketFactory getStandardSocketFactory(){
       SSLContext obj = PatchProxy.apply(null, null, SSLSocketFactoryUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = SSLContext.getInstance("TLSv1");
          obj.init(null, null, null);
          return obj.getSocketFactory();
       }catch(java.security.KeyManagementException e0){
       }catch(java.security.NoSuchAlgorithmException e0){
       }
       e0.printStackTrace();
       return v1;
    }
}
