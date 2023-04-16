package com.meizu.cloud.pushsdk.d.f.e;
import java.lang.Object;
import java.lang.String;
import java.lang.System;
import java.lang.Long;
import java.util.Map;
import org.json.JSONObject;
import android.content.Context;
import com.meizu.cloud.pushsdk.d.f.c;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.lang.Boolean;
import java.lang.Exception;
import java.util.UUID;
import android.telephony.TelephonyManager;
import java.lang.StringBuilder;
import android.graphics.Point;
import android.view.WindowManager;
import android.view.Display;
import java.lang.Class;
import java.lang.reflect.Method;

public class e	// class@00152a
{
    public static final String a = "e";

    public void e(){
       super();
    }
    public static long a(String p0){
       long l1;
       long l = 0;
       int i = 0;
       while (i < p0.length()) {
          char c = p0.charAt(i);
          if (c <= 127) {
             l1 = 1;
          }else if(c <= 2047){
             l1 = 2;
          }else if(c >= 0xd800 && c <= 0xdfff){
             l = l + 4;
             i = i + 1;
          label_0035 :
             i = i + 1;
          }else if(c < 0xffff){
             l1 = 3;
          }else {
             l = l + 4;
             goto label_0035 ;
          }
          l = l + l1;
          goto label_0035 ;
       }
       return l;
    }
    public static Object a(Object p0){
       return p0;
    }
    public static String a(){
       return Long.toString(System.currentTimeMillis());
    }
    public static JSONObject a(Map p0){
       return new JSONObject(p0);
    }
    public static boolean a(long p0,long p1,long p2){
       boolean b = (p0 - (p1 - p2) > 0)? true: false;
       return b;
    }
    public static boolean a(Context p0){
       int i = 0;
       try{
          String a = e.a;
          Object[] objArray = new Object[i];
          c.c(a, "Checking tracker internet connectivity.", objArray);
          ConnectivityManager systemServic = p0.getSystemService("connectivity");
          if (systemServic == null) {
             return i;
          }
          NetworkInfo activeNetwor = systemServic.getActiveNetworkInfo();
          boolean b = (activeNetwor != null && activeNetwor.isConnected())? true: false;
          objArray = new Object[]{Boolean.valueOf(b)};
          c.b(a, "Tracker connection online: %s", objArray);
          return b;
       }catch(java.lang.Exception e6){
          Object[] objArray1 = new Object[1];
          objArray1[i] = e6.toString();
          c.a(e.a, "Security exception checking connection: %s", objArray1);
          return 1;
       }
    }
    public static String b(){
       return UUID.randomUUID().toString();
    }
    public static String b(Context p0){
       try{
          TelephonyManager systemServic = p0.getSystemService("phone");
          if (systemServic != null) {
             return systemServic.getNetworkOperatorName();
          }
       }catch(java.lang.Exception e3){
          Object[] objArray = new Object[]{e3.toString()};
          c.a(e.a, "getCarrier: %s", objArray);
       }
       return null;
    }
    public static String c(Context p0){
       String str = null;
       try{
          TelephonyManager systemServic = p0.getSystemService("phone");
          if (systemServic != null) {
             str = systemServic.getSimOperator();
          }
       }catch(java.lang.Exception e4){
          Object[] objArray = new Object[0];
          c.a(e.a, "getOperator error "+e4.getMessage(), objArray);
       }
       return str;
    }
    public static Point d(Context p0){
       int i;
       Point point = new Point();
       Point point1 = null;
       try{
          i = 0;
          WindowManager systemServic = p0.getSystemService("window");
          if (systemServic == null) {
             return point1;
          }else {
             Class[] uClassArray = new Class[1];
             uClassArray[i] = Point.class;
             Display.class.getMethod("getSize", uClassArray);
             systemServic.getDefaultDisplay().getSize(point);
          }
       }catch(java.lang.Exception e0){
          String a = e.a;
          Object[] objArray = new Object[i];
          c.a(a, "Display.getSize isn\'t available on older devices.", objArray);
          if (point1) {
             e0.x = point1.getWidth();
             e0.y = point1.getHeight();
          }else {
             Object[] objArray1 = new Object[i];
             c.a(a, "error get display", objArray1);
          }
       }
       return e0;
    }
}
