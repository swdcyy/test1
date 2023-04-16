package ekd.r0;
import android.content.Context;
import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import ekd.p0;

public class r0	// class@000d73
{

    public static NetworkInfo a(Context p0){
       ConnectivityManager uConnectivit = p0.k(p0);
       NetworkInfo activeNetwor = (uConnectivit != null)? uConnectivit.getActiveNetworkInfo(): null;
       return activeNetwor;
    }
    public static NetworkInfo b(Context p0,int p1){
       ConnectivityManager uConnectivit = p0.k(p0);
       if (uConnectivit == null) {
          return null;
       }
       return uConnectivit.getNetworkInfo(p1);
    }
    public static boolean c(Context p0){
       int i = 0;
       NetworkInfo networkInfo = r0.b(p0, i);
       if (networkInfo != null && networkInfo.isConnected()) {
          i = true;
       }
       return i;
    }
    public static boolean d(Context p0){
       NetworkInfo networkInfo = r0.a(p0);
       boolean b = (networkInfo != null && networkInfo.isConnected())? true: false;
       return b;
    }
    public static boolean e(Context p0){
       int i = 1;
       NetworkInfo networkInfo = r0.b(p0, i);
       if (networkInfo == null || !networkInfo.isConnected()) {
          i = false;
       }
       return i;
    }
}
