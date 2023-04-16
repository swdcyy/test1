package ekd.u0;
import ekd.e0;
import java.lang.String;
import java.lang.Object;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.os.Build$VERSION;
import android.telephony.SubscriptionManager;
import java.lang.Boolean;
import java.util.HashMap;
import ukd.a;
import java.lang.Integer;
import java.lang.RuntimeException;
import com.kwai.privacykit.interceptor.ImeiInterceptor;
import android.net.Uri;
import android.content.ContentResolver;
import android.database.Cursor;
import ekd.u0$a;
import com.kwai.performance.fluency.ipcproxy.lib.b;
import android.os.Process;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Exception;

public class u0	// class@00156e
{
    public static TelephonyManager a;
    public static SubscriptionManager b;
    public static String c;
    public static Boolean d;
    public static HashMap e;
    public static String f;
    public static Boolean g;
    public static HashMap h;
    public static String i;
    public static Boolean j;
    public static HashMap k;
    public static HashMap l;
    public static String m;
    public static Boolean n;
    public static List o;
    public static Boolean p;
    public static Boolean q;

    static {
       u0.a = e0.b.getSystemService("phone");
       if (Build$VERSION.SDK_INT >= 22) {
          u0.b = e0.b.getSystemService("telephony_subscription_service");
       }
       Boolean fALSE = Boolean.FALSE;
       u0.d = fALSE;
       u0.e = new HashMap();
       u0.g = fALSE;
       u0.h = new HashMap();
       u0.j = fALSE;
       u0.k = new HashMap();
       u0.l = new HashMap();
       u0.n = fALSE;
       u0.p = fALSE;
       u0.q = null;
    }
    public void u0(){
       super();
    }
    public static int a(Context p0){
       int i = -1;
       if (Build$VERSION.SDK_INT >= 22) {
          SubscriptionManager systemServic = p0.getSystemService("telephony_subscription_service");
          try{
             Object[] objArray = new Object[0];
             i = a.a(systemServic, "getDefaultDataPhoneId", objArray).intValue();
          }catch(java.lang.RuntimeException e3){
             e3.printStackTrace();
          }
       }
    }
    public static int b(Context p0){
       int i;
       if (Build$VERSION.SDK_INT >= 22) {
          SubscriptionManager systemServic = p0.getSystemService("telephony_subscription_service");
          try{
             Object[] objArray = new Object[0];
             i = a.a(systemServic, "getDefaultDataSubscriptionId", objArray).intValue();
          label_0023 :
             return i;
          }catch(java.lang.RuntimeException e2){
             e2.printStackTrace();
          }
          i = -1;
          goto label_0023 ;
       }else {
          goto label_0022 ;
       }
    }
    public static String c(int p0){
       if (Build$VERSION.SDK_INT < 26 || !u0.g(e0.b)) {
          return null;
       }
       try{
          return ImeiInterceptor.getMeid(u0.a, p0);
       }catch(java.lang.Exception e0){
       }
    }
    public static int d(int p0,Context p1){
       Cursor uCursor;
       Uri uri = Uri.parse("content://telephony/siminfo");
       ContentResolver contentResol = p1.getContentResolver();
       try{
          int i = 0;
          String[] stringArray = new String[]{"_id","sim_id"};
          String[] stringArray1 = new String[]{String.valueOf(p0)};
          uCursor = contentResol.query(uri, stringArray, "sim_id = ?", stringArray1, null);
          if (uCursor != null && uCursor.moveToFirst()) {
             uCursor.close();
             return uCursor.getInt(uCursor.getColumnIndex("_id"));
          }else if(uCursor != null){
          }
          return -1;
       }catch(java.lang.Exception e0){
          if (uCursor) {
          }else {
             goto label_0048 ;
          }
       }
       uCursor.close();
       goto label_0048 ;
    }
    public static String e(int p0,Context p1){
       u0$a a;
       String str;
       if (u0.e.containsKey(Integer.valueOf(p0)) && u0.e.get(Integer.valueOf(p0)).a != null) {
          a = u0.e.get(Integer.valueOf(p0)).a;
       }else if(u0.i().booleanValue() && (u0.e.containsKey(Integer.valueOf(p0)) && u0.e.get(Integer.valueOf(p0)).b.booleanValue())){
          a = u0.e.get(Integer.valueOf(p0)).a;
       }else {
          HashMap hashMap = null;
          if (!u0.g(e0.b)) {
             str = hashMap;
          }else {
             Object[] objArray = new Object[]{Integer.valueOf(p0)};
             str = a.a(u0.a, "getSubscriberId", objArray);
          }
          u0.e.put(Integer.valueOf(p0), new u0$a(str, Boolean.TRUE));
          a = str;
       }
       return a;
    }
    public static String f(Context p0){
       try{
          return b.q();
       }catch(java.lang.Exception e0){
          return "";
       }
    }
    public static boolean g(Context p0){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (!p0.checkPermission("android.permission.READ_PHONE_STATE", Process.myPid(), Process.myUid())) {
          b = true;
       }
       return b;
    }
    public static boolean h(String p0){
       boolean b = (!TextUtils.equals(p0, "46000") && (TextUtils.equals(p0, "46002") || TextUtils.equals(p0, "46007")))? true: false;
       return b;
    }
    public static Boolean i(){
       Boolean fALSE;
       if (u0.q == null) {
          try{
             Class uClass = Class.forName("android.os.SystemProperties");
             int i = 1;
             Class[] uClassArray = new Class[i];
             uClassArray[0] = String.class;
             Object[] objArray = new Object[i];
             objArray[0] = "ro.miui.ui.version.name";
             String str = uClass.getDeclaredMethod("get", uClassArray).invoke(uClass, objArray);
             if (!TextUtils.isEmpty(str)) {
                try{
                   if (str.length() < 2) {
                      fALSE = Boolean.FALSE;
                   }else if(Integer.valueOf(str.substring(i)).intValue() >= 12){
                      i = false;
                   }
                   fALSE = Boolean.valueOf(i);
                }catch(java.lang.NumberFormatException e0){
                   fALSE = Boolean.FALSE;
                }
             }
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
          fALSE = Boolean.FALSE;
       }
       return u0.q;
    }
    public static boolean j(String p0){
       boolean b = (p0 != null && (p0.startsWith("46001") || p0.startsWith("46009")))? true: false;
       return b;
    }
}
