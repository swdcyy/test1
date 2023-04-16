package lnc.b6;
import android.content.Context;
import ekd.u0;
import java.lang.String;
import java.lang.Object;
import android.telephony.TelephonyManager;
import java.lang.Integer;
import ukd.a;
import java.lang.Exception;
import android.os.Build$VERSION;
import android.telephony.SubscriptionManager;
import java.lang.CharSequence;

public final class b6	// class@001db7
{

    public static int a(Context p0){
       int i = u0.b(p0);
       if (i == -1) {
          int i1 = u0.a(p0);
          if (i1 != -1) {
             i = u0.d(i1, p0);
          }
       }
       return i;
    }
    public static String b(Context p0,int p1){
       try{
          Object[] objArray = new Object[]{Integer.valueOf(p1)};
          return a.a(p0.getSystemService("phone"), "getNetworkOperator", objArray);
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
          return "";
       }
    }
    public static int c(Context p0,int p1){
       if (Build$VERSION.SDK_INT >= 22) {
          SubscriptionManager systemServic = p0.getSystemService("telephony_subscription_service");
          try{
             Object[] objArray = new Object[]{Integer.valueOf(p1)};
             systemServic = a.a(systemServic, "getSubId", objArray);
             if (systemServic != null) {
                return systemServic[0];
             }
          }catch(java.lang.Exception e3){
             e3.printStackTrace();
          }
       }
    }
    public static boolean d(Context p0){
       int simState = p0.getSystemService("phone").getSimState();
       if (simState && simState != 1) {
          return true;
       }
       return false;
    }
    public static boolean e(String p0,String p1){
       boolean b = false;
       if (p0.length() != p1.length()) {
          return b;
       }
       if (p0.contains("*")) {
          p0 = p0.substring((p0.lastIndexOf(42) + 1));
          if (p1.contains(p0.substring(b, p0.indexOf(42))) && p1.contains(p0)) {
             b = true;
          }
       }
       return b;
    }
}
