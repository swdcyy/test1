package com.unionpay.a.a;
import android.content.Context;
import java.lang.Object;
import javax.net.ssl.SSLContext;
import java.lang.String;
import javax.net.ssl.TrustManager;
import com.unionpay.a.b;
import javax.net.ssl.KeyManager;
import java.security.SecureRandom;
import java.io.IOException;
import java.lang.Exception;
import java.lang.Class;

public class a	// class@000fef
{
    public SSLContext a;
    public Context b;

    public void a(Context p0){
       super();
       this.a = null;
       this.b = p0;
    }
    public static SSLContext a(Context p0){
       try{
          SSLContext instance = SSLContext.getInstance("TLS");
          TrustManager[] trustManager = new TrustManager[]{new b(p0)};
          instance.init(null, trustManager, null);
          return instance;
       }catch(java.lang.Exception e4){
          throw new IOException(e4.getMessage());
       }
    }
    public final SSLContext a(){
       if (this.a == null) {
          this.a = a.a(this.b);
       }
       return this.a;
    }
    public boolean equals(Object p0){
       if (p0 != null && p0.getClass().equals(a.class)) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       return a.class.hashCode();
    }
}
