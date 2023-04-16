package com.alipay.android.phone.mrpc.core.ad;
import org.apache.http.client.HttpRequestRetryHandler;
import java.lang.Object;
import java.io.IOException;
import org.apache.http.protocol.HttpContext;
import org.apache.http.NoHttpResponseException;
import java.net.SocketException;
import javax.net.ssl.SSLException;
import java.lang.String;
import java.lang.CharSequence;

public class ad implements HttpRequestRetryHandler	// class@000e44
{
    public static final String a;

    static {
       ad.a = "ad";
    }
    public void ad(){
       super();
    }
    public boolean retryRequest(IOException p0,int p1,HttpContext p2){
       if (p1 >= 3) {
          return false;
       }
       if (p0 instanceof NoHttpResponseException) {
          return true;
       }
       if (p0 instanceof SocketException || (p0 instanceof SSLException && (p0.getMessage() != null && (p0.getMessage()).contains("Broken pipe")))) {
          return true;
       }
       return false;
    }
}
