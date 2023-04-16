package c.t.m.g.ee;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import c.t.m.g.ef;

public class ee	// class@000c67
{

    public static boolean a(Context p0){
       try{
          NetworkInfo activeNetwor = p0.getSystemService("connectivity").getActiveNetworkInfo();
          if (activeNetwor != null && activeNetwor.getType() == 1) {
             return true;
          }
          return false;
       }catch(java.lang.Exception e0){
       }
    }
    public static int b(Context p0){
       ConnectivityManager systemServic = p0.getSystemService("connectivity");
       if (ef.a(systemServic)) {
          return -1;
       }
       try{
          NetworkInfo activeNetwor = systemServic.getActiveNetworkInfo();
          if (activeNetwor != null) {
             return activeNetwor.getType();
          }
          return -1;
       }catch(java.lang.Exception e0){
       }
    }
    public static String c(Context p0){
       int i = ee.b(p0);
       String str = "none";
       if (i == -1) {
       }else if(!i){
          str = "mobile";
       }else if(i == 1){
          str = "wifi";
       }
       return str;
    }
    public static boolean d(Context p0){
       ConnectivityManager systemServic = p0.getSystemService("connectivity");
       boolean b = false;
       if (ef.a(systemServic)) {
          return b;
       }
       try{
          NetworkInfo networkInfo = systemServic.getNetworkInfo(b);
          NetworkInfo networkInfo1 = systemServic.getNetworkInfo(1);
          if (networkInfo1 != null) {
             boolean b1 = networkInfo1.isConnected();
             b = (!b1 && networkInfo != null)? networkInfo.isConnected(): b1;
          }
       label_0029 :
          return b;
       }catch(java.lang.Exception e0){
       }
    }
}
