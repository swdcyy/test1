package b0.a;
import android.net.ConnectivityManager;
import android.net.Network;
import android.security.NetworkSecurityPolicy;

public final class a	// class@0002a8
{

    public static Network a(ConnectivityManager p0){
       try{
          return p0.getActiveNetwork();
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public static long b(Network p0){
       return p0.getNetworkHandle();
    }
    public static boolean c(){
       return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }
    public static void d(ConnectivityManager p0,Network p1,boolean p2){
       p0.reportNetworkConnectivity(null, p2);
    }
}
