package com.loc.bj$e;
import javax.net.ssl.HostnameVerifier;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import javax.net.ssl.SSLSession;
import javax.net.ssl.HttpsURLConnection;

public final class bj$e implements HostnameVerifier	// class@001399
{
    public String a;
    public String b;

    public void bj$e(){
       super();
    }
    public void bj$e(byte p0){
       super();
    }
    public final String a(){
       return this.b;
    }
    public final void a(String p0){
       if (!TextUtils.isEmpty(this.a)) {
          String str = ":";
          if (p0.contains(str)) {
             String[] stringArray = p0.split(str);
             if (stringArray != null && stringArray.length > 0) {
                this.a = stringArray[0];
                return;
             }
          }
       }
       this.a = p0;
       return;
    }
    public final void b(String p0){
       this.b = p0;
    }
    public final boolean verify(String p0,SSLSession p1){
       HostnameVerifier defaultHostn = HttpsURLConnection.getDefaultHostnameVerifier();
       if (!TextUtils.isEmpty(this.a)) {
          return (this.a).equals(p0);
       }
       if (!TextUtils.isEmpty(this.b)) {
          return defaultHostn.verify(this.b, p1);
       }
       return defaultHostn.verify(p0, p1);
    }
}
