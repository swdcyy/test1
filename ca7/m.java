package ca7.m;
import java.lang.String;
import java.net.URLEncoder;
import java.lang.RuntimeException;
import java.lang.Throwable;
import android.content.Context;
import android.net.NetworkInfo;
import java.lang.Object;
import android.net.ConnectivityManager;
import ekd.p0;
import com.yxcorp.utility.NetworkUtilsCached;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;

public final class m	// class@0003a1
{
    public static Pattern a;

    public static String a(String p0){
       try{
          return URLEncoder.encode(p0, "utf-8");
       }catch(java.io.UnsupportedEncodingException e2){
          throw new RuntimeException("Error encoding url", e2);
       }
    }
    public static NetworkInfo b(Context p0){
       ConnectivityManager systemServic = p0.getSystemService("connectivity");
       if (systemServic == null) {
          return null;
       }
       try{
          return systemServic.getActiveNetworkInfo();
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
    public static String c(Context p0){
       String g;
       NetworkInfo networkInfo = m.b(p0);
       if (networkInfo != null) {
          int type = networkInfo.getType();
          if (type) {
             if (type == 1) {
                return "WIFI";
             }
          }else if(p0.b){
             NetworkUtilsCached.p();
             g = NetworkUtilsCached.g;
          }else {
             g = p0.v(p0);
          }
          g = (TextUtils.isEmpty(g))? "MOBILE": "MOBILE_"+g;
          return g.toUpperCase();
       }
       return "unknown";
    }
    public static boolean d(Context p0){
       boolean b = false;
       try{
          ConnectivityManager systemServic = p0.getSystemService("connectivity");
          if (systemServic == null) {
             return b;
          }
          NetworkInfo activeNetwor = systemServic.getActiveNetworkInfo();
          if (activeNetwor != null && activeNetwor.isConnected()) {
             b = true;
          }
       label_0019 :
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
}
