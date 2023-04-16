package b0.c;
import android.content.Context;
import java.lang.String;
import a0.s;
import java.lang.Throwable;
import android.content.pm.ApplicationInfo;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.net.ConnectivityManager$NetworkCallback;
import android.os.Handler;

public final class c	// class@0002aa
{

    public static Context a(Context p0,String p1){
       s.a().close();
       return p0.createContextForSplit(p1);
    }
    public static String[] b(ApplicationInfo p0){
       return p0.splitNames;
    }
    public static void c(ConnectivityManager p0,NetworkRequest p1,ConnectivityManager$NetworkCallback p2,Handler p3){
       p0.registerNetworkCallback(p1, p2, p3);
    }
}
