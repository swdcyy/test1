package c.t.m.g.bv;
import c.t.m.g.bv$a;
import android.content.Context;
import c.t.m.g.be;
import java.lang.String;
import java.lang.Object;
import c.t.m.g.cb;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.lang.StringBuilder;

public class bv	// class@000bfa
{

    public static bv$a a(){
       return bv.a(be.a());
    }
    public static bv$a a(Context p0){
       bv$a b;
       ConnectivityManager uConnectivit = cb.a("connectivity");
       NetworkInfo networkInfo = (uConnectivit == null)? null: uConnectivit.getActiveNetworkInfo();
       if (networkInfo == null || !networkInfo.isConnected()) {
          return bv$a.a;
       }else if(uConnectivit.isActiveNetworkMetered()){
          b = bv$a.b;
       }else {
          b = bv$a.c;
       }
       return b;
    }
    public static String b(){
       return bv.b(be.a());
    }
    public static String b(Context p0){
       String str = "UNKNOWN";
       ConnectivityManager uConnectivit = cb.a("connectivity");
       NetworkInfo networkInfo = (uConnectivit == null)? null: uConnectivit.getActiveNetworkInfo();
       if (networkInfo != null) {
          str = (networkInfo.getTypeName()).toUpperCase()+"["+networkInfo.getSubtypeName()+"]";
       }
       return str;
    }
}
