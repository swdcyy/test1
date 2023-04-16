package com.kuaishou.weapon.ks.bh;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Build$VERSION;
import android.content.Context;
import com.kuaishou.weapon.ks.k;
import android.telephony.TelephonyManager;
import com.kwai.privacykit.interceptor.ImeiInterceptor;
import java.io.Reader;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Throwable;
import com.kuaishou.weapon.ks.bb;
import com.kuaishou.weapon.ks.bs;
import java.io.FileReader;
import java.lang.Integer;
import java.lang.NoSuchMethodException;
import java.util.Locale;
import com.kuaishou.weapon.ks.d;
import android.os.LocaleList;
import com.kwai.privacykit.interceptor.ImsiInterceptor;
import android.net.Uri;
import android.content.ContentResolver;
import android.database.Cursor;
import com.kwai.framework.deviceid.a;
import android.telephony.SubscriptionManager;
import java.util.List;
import com.kwai.privacykit.interceptor.OtherInterceptors;
import java.util.Iterator;
import android.telephony.SubscriptionInfo;
import android.provider.Settings$Secure;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodInfo;
import java.lang.Long;
import android.bluetooth.BluetoothAdapter;
import java.lang.reflect.Field;
import android.app.ActivityManager;
import org.json.JSONArray;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.provider.Settings$System;
import android.content.pm.PackageManager;
import android.os.Build;

public class bh	// class@0011e4
{
    public static String a;
    public static String b;
    public static String c;
    public static String d;

    public void bh(){
       super();
    }
    public static String a(){
       if (!TextUtils.isEmpty(bh.c)) {
          return bh.c;
       }
       if (Build$VERSION.SDK_INT >= 26) {
          bh.c = bh.c();
       }
       if (TextUtils.isEmpty(bh.c)) {
          String str = bh.b();
          if (!TextUtils.isEmpty(str)) {
             bh.c = (str.toUpperCase()).substring(0, 17);
          }
       }
       if (TextUtils.isEmpty(bh.c)) {
          bh.c = bh.c();
       }
       return bh.c;
    }
    public static String a(Context p0){
       if (k.a(p0, "android.permission.READ_PHONE_STATE") == -1) {
          return "RISK_AUTH_FAILED";
       }
       TelephonyManager systemServic = p0.getSystemService("phone");
       if (systemServic == null) {
          return "RISK_SERVICE_OBJECT_NULL";
       }
       String deviceId = ImeiInterceptor.getDeviceId(systemServic);
       if (TextUtils.isEmpty(deviceId)) {
          deviceId = "RISK_GET_FIELD_EMPTY";
       }
       return deviceId;
    }
    public static String a(Context p0,int p1){
       if (k.a(p0, "android.permission.READ_PHONE_STATE") == -1) {
          return "RISK_AUTH_FAILED";
       }
       TelephonyManager systemServic = p0.getSystemService("phone");
       if (systemServic == null) {
          return "RISK_SERVICE_OBJECT_NULL";
       }
       String deviceId = ImeiInterceptor.getDeviceId(systemServic, p1);
       if (TextUtils.isEmpty(deviceId)) {
          deviceId = "RISK_GET_FIELD_EMPTY";
       }
       return deviceId;
    }
    public static String a(Reader p0){
       StringBuilder str = "";
       char[] uocharArray = new char[4096];
       int i = p0.read(uocharArray);
       while (i >= 0) {
          str = str+uocharArray;
       }
       return str;
    }
    public static String a(String p0){
       Class uClass = Class.forName("android.os.SystemProperties");
       Class[] uClassArray = new Class[]{String.class};
       Object[] objArray = new Object[]{p0};
       p0 = uClass.getMethod("get", uClassArray).invoke(uClass, objArray);
       return p0;
    }
    public static Method a(Class p0,String p1,Class[] p2){
       Method method = bh.b(p0, p1, p2);
       method.setAccessible(true);
       return method;
    }
    public static void a(Throwable p0){
       if (bb.a()) {
          bs.a(p0);
       }
       return;
    }
    public static String b(){
       FileReader uFileReader = new FileReader("/sys/class/net/eth0/address");
       String str = bh.a(uFileReader);
       uFileReader.close();
       return str;
    }
    public static String b(Context p0){
       if (k.a(p0, "android.permission.READ_PHONE_STATE") == -1) {
          return "RISK_AUTH_FAILED";
       }
       TelephonyManager systemServic = p0.getSystemService("phone");
       if (systemServic == null) {
          return "RISK_SERVICE_OBJECT_NULL";
       }
       String imei = ImeiInterceptor.getImei(systemServic);
       if (TextUtils.isEmpty(imei)) {
          imei = "RISK_GET_FIELD_EMPTY";
       }
       return imei;
    }
    public static String b(Context p0,int p1){
       if (k.a(p0, "android.permission.READ_PHONE_STATE") == -1) {
          return "RISK_AUTH_FAILED";
       }
       TelephonyManager systemServic = p0.getSystemService("phone");
       String str = "RISK_SERVICE_OBJECT_NULL";
       if (systemServic == null) {
          return str;
       }
       Class[] uClassArray = new Class[]{Integer.TYPE};
       Method method = systemServic.getClass().getMethod("getImei", uClassArray);
       if (method == null) {
          return str;
       }
       Object[] objArray = new Object[]{Integer.valueOf(p1)};
       String str1 = method.invoke(systemServic, objArray);
       if (TextUtils.isEmpty(str1)) {
          str1 = "RISK_GET_FIELD_EMPTY";
       }
       return str1;
    }
    public static Method b(Class p0,String p1,Class[] p2){
       Method method = p0.getMethod(p1, p2);
       if (method != null) {
          return method;
       }
    label_000b :
       if (p0 != null) {
          try{
             method = p0.getDeclaredMethod(p1, p2);
             method.setAccessible(true);
             return method;
          }catch(java.lang.NoSuchMethodException e0){
             bh.a(e0);
             p0 = p0.getSuperclass();
             goto label_000b ;
          }
       }else {
          throw new NoSuchMethodException();
       }
    }
    public static String c(){
       return null;
    }
    public static String c(Context p0){
       if (k.a(p0, "android.permission.READ_PHONE_STATE") == -1) {
          return "RISK_AUTH_FAILED";
       }
       TelephonyManager systemServic = p0.getSystemService("phone");
       String str = "RISK_SERVICE_OBJECT_NULL";
       if (systemServic == null) {
          return str;
       }
       Class[] uClassArray = new Class[0];
       Method method = systemServic.getClass().getMethod("getImei", uClassArray);
       if (method == null) {
          return str;
       }
       Object[] objArray = new Object[0];
       String str1 = method.invoke(systemServic, objArray);
       if (TextUtils.isEmpty(str1)) {
          str1 = "RISK_GET_FIELD_EMPTY";
       }
       return str1;
    }
    public static String c(Context p0,int p1){
       if (k.a(p0, "android.permission.READ_PHONE_STATE") == -1) {
          return "RISK_AUTH_FAILED";
       }
       TelephonyManager systemServic = p0.getSystemService("phone");
       if (systemServic == null) {
          return "RISK_SERVICE_OBJECT_NULL";
       }
       String imei = ImeiInterceptor.getImei(systemServic, p1);
       if (TextUtils.isEmpty(imei)) {
          imei = "RISK_GET_FIELD_EMPTY";
       }
       return imei;
    }
    public static String d(){
       Locale default = Locale.getDefault();
       return default.getLanguage()+"-"+default.getCountry();
    }
    public static String d(Context p0){
       String str = bh.a(p0);
       d uod = d.a(p0);
       if (!TextUtils.isEmpty(str) && !str.contains("RISK_")) {
          uod.a("plc001_kbp_ie", str, true);
          return str;
       }else {
          str = bh.c(p0);
          if (!TextUtils.isEmpty(str) && !str.contains("RISK_")) {
             uod.a("plc001_kbp_ie", str, true);
             return str;
          }else {
             String str1 = bh.b(p0);
             if (!TextUtils.isEmpty(str1) && !str1.contains("RISK_")) {
                uod.a("plc001_kbp_ie", str1, true);
             }
             return str1;
          }
       }
    }
    public static String d(Context p0,int p1){
       String str = bh.a(p0, p1);
       if (!TextUtils.isEmpty(str) && !str.contains("RISK_")) {
          return str;
       }
       str = bh.b(p0, p1);
       if (!TextUtils.isEmpty(str) && !str.contains("RISK_")) {
          return str;
       }
       return bh.c(p0, p1);
    }
    public static String e(){
       Locale locale = (Build$VERSION.SDK_INT >= 24)? LocaleList.getDefault().get(0): Locale.getDefault();
       return locale.getLanguage()+"-"+locale.getCountry();
    }
    public static String e(Context p0){
       if (k.a(p0, "android.permission.READ_PHONE_STATE") == -1) {
          return "RISK_AUTH_FAILED";
       }
       TelephonyManager systemServic = p0.getSystemService("phone");
       String str = "RISK_GET_FIELD_EMPTY";
       if (systemServic == null) {
          return str;
       }
       String subscriberId = ImsiInterceptor.getSubscriberId(systemServic);
       if (TextUtils.isEmpty(subscriberId)) {
          return str;
       }
       d.a(p0).a("plc001_kbp_is", subscriberId, true);
       return subscriberId;
    }
    public static String e(Context p0,int p1){
       if (k.a(p0, "android.permission.READ_PHONE_STATE") == -1) {
          return "RISK_AUTH_FAILED";
       }
       TelephonyManager systemServic = p0.getSystemService("phone");
       String str = "RISK_SERVICE_OBJECT_NULL";
       if (systemServic == null) {
          return str;
       }
       Class[] uClassArray = new Class[]{Integer.TYPE};
       Method method = systemServic.getClass().getMethod("getSimSerialNumber", uClassArray);
       if (method == null) {
          return str;
       }
       method.setAccessible(1);
       Object[] objArray = new Object[]{Integer.valueOf(p1)};
       systemServic = method.invoke(systemServic, objArray);
       if (systemServic == null) {
          return "RISK_GET_FIELD_EMPTY";
       }
       return systemServic.toString();
    }
    public static String f(Context p0){
       if (k.a(p0, "android.permission.READ_PHONE_STATE") == -1) {
          return "RISK_AUTH_FAILED";
       }
       TelephonyManager systemServic = p0.getSystemService("phone");
       if (systemServic == null) {
          return "RISK_SERVICE_OBJECT_NULL";
       }
       String simSerialNum = systemServic.getSimSerialNumber();
       if (TextUtils.isEmpty(simSerialNum)) {
          simSerialNum = "RISK_GET_FIELD_EMPTY";
       }
       return simSerialNum;
    }
    public static String f(Context p0,int p1){
       String str1;
       if (k.a(p0, "android.permission.READ_PHONE_STATE") == -1) {
          return "RISK_AUTH_FAILED";
       }
       Uri uri = Uri.parse("content://telephony/siminfo");
       String str = "RISK_SERVICE_OBJECT_NULL";
       if (uri == null) {
          return str;
       }
       ContentResolver contentResol = p0.getContentResolver();
       if (contentResol == null) {
          return str;
       }
       String[] stringArray = new String[]{"_id","sim_id","icc_id","display_name"};
       String[] stringArray1 = new String[0];
       Cursor uCursor = contentResol.query(uri, stringArray, "0=0", stringArray1, null);
       if (uCursor == null) {
       label_0057 :
          return str;
       }
       while (true) {
          if (!uCursor.moveToNext()) {
             return "RISK_EXCEPTION_HAPPEN";
          }
          if (uCursor.getInt(uCursor.getColumnIndex("sim_id")) == p1) {
             str1 = uCursor.getString(uCursor.getColumnIndex("icc_id"));
             if (TextUtils.isEmpty(str1)) {
                str1 = "RISK_GET_FIELD_EMPTY";
                break ;
             }
             break ;
          }
       }
       return str1;
    }
    public static String g(Context p0){
       String str = a.g(p0.getContentResolver(), "android_id");
       if (TextUtils.isEmpty(str)) {
          str = "RISK_GET_FIELD_EMPTY";
       }
       return str;
    }
    public static String g(Context p0,int p1){
       String str1;
       String str = "RISK_GET_FIELD_EMPTY";
       if (Build$VERSION.SDK_INT > 22) {
          SubscriptionManager systemServic = p0.getSystemService("telephony_subscription_service");
          str1 = "RISK_SERVICE_OBJECT_NULL";
          if (systemServic == null) {
             return str1;
          }else if(k.a(p0, "android.permission.READ_PHONE_STATE") == -1){
             return "RISK_AUTH_FAILED";
          }else {
             List activeSubscr = OtherInterceptors.getActiveSubscriptionInfoList(systemServic);
             if (activeSubscr != null) {
                Iterator iterator = activeSubscr.iterator();
                str1 = "";
                while (iterator.hasNext()) {
                   SubscriptionInfo subscription = iterator.next();
                   if (subscription != null && subscription.getSubscriptionId() == p1) {
                      str1 = subscription.getIccId();
                      if (TextUtils.isEmpty(str1)) {
                         str1 = str;
                      }
                   }
                }
             }
          }
       }else {
          str1 = str;
       }
       if (!TextUtils.isEmpty(str1)) {
          str = str1;
       }
       if (p1 == 1) {
          bh.a = str;
       }
       if (p1 == 2) {
          bh.b = str;
       }
       return str;
    }
    public static String h(Context p0,int p1){
       String a;
       String str = bh.e(p0, p1);
       if (!TextUtils.isEmpty(str) && !str.contains("RISK_")) {
          return str;
       }
       str = bh.f(p0, (p1 - 1));
       if (!TextUtils.isEmpty(str) && !str.contains("RISK_")) {
          return str;
       }
       if (p1 == 1 && (!TextUtils.isEmpty(bh.a) || !TextUtils.isEmpty(bh.b))) {
          a = bh.a;
       }else if(p1 == 2 && (!TextUtils.isEmpty(bh.a) || !TextUtils.isEmpty(bh.b))){
          a = bh.b;
       }else {
          a = bh.g(p0, p1);
       }
       return a;
    }
    public static boolean h(Context p0){
       int i = 0;
       if (Settings$Secure.getInt(p0.getContentResolver(), "adb_enabled", i) > 0) {
          i = true;
       }
       return i;
    }
    public static String i(Context p0){
       try{
          StringBuilder str = "";
          Iterator iterator = p0.getSystemService("input_method").getInputMethodList().iterator();
          while (iterator.hasNext()) {
             str = str+iterator.next().getId()+";";
          }
          if (TextUtils.isEmpty(str)) {
             return "RISK_GET_FIELD_EMPTY";
          }
          String str1 = str;
          if (str1.endsWith(";")) {
             str1 = str1.substring(0, (str1.length() - 1));
          }
          return str1;
       }catch(java.lang.Exception e0){
          return "RISK_EXCEPTION_HAPPEN";
       }
    }
    public static String i(Context p0,int p1){
       Class[] uClassArray;
       Method method;
       Object[] objArray;
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 23 && k.a(p0, "android.permission.READ_PHONE_STATE") == -1) {
          return "RISK_AUTH_FAILED";
       }
       TelephonyManager systemServic = p0.getSystemService("phone");
       String str = "RISK_SERVICE_OBJECT_NULL";
       if (systemServic == null) {
          return str;
       }
       Class uClass = null;
       Class class = systemServic.getClass();
       if (sDK_INT > 21) {
          uClassArray = new Class[]{Integer.TYPE};
          method = class.getMethod("getSubscriberId", uClassArray);
          if (method == null) {
             return str;
          }else {
             objArray = new Object[]{Integer.valueOf(p1)};
             systemServic = method.invoke(systemServic, objArray);
          }
       }else if(sDK_INT == 21){
          uClassArray = new Class[]{Long.TYPE};
          method = class.getMethod("getSubscriberId", uClassArray);
          if (method == null) {
             return str;
          }else {
             objArray = new Object[]{Long.valueOf((long)p1)};
             systemServic = method.invoke(systemServic, objArray);
          }
       }else if(TextUtils.isEmpty(uClass) || uClass == null){
          return "RISK_GET_FIELD_EMPTY";
       }else {
          return uClass;
       }
       uClass = systemServic;
       goto label_0066 ;
    }
    public static String j(Context p0){
       if (Settings$Secure.getInt(p0.getContentResolver(), "accessibility_enabled", 0) != 1) {
          return "RISK_SWITCH_CLOSED";
       }
       String str = a.g(p0.getContentResolver(), "enabled_accessibility_services");
       if (TextUtils.isEmpty(str)) {
          str = "RISK_GET_FIELD_EMPTY";
       }
       return str;
    }
    public static String k(Context p0){
       BluetoothAdapter defaultAdapt = BluetoothAdapter.getDefaultAdapter();
       if (defaultAdapt == null) {
          return "RISK_SERVICE_OBJECT_NULL";
       }
       String address = defaultAdapt.getAddress();
       if (TextUtils.isEmpty(address)) {
          address = "RISK_GET_FIELD_EMPTY";
       }
       return address;
    }
    public static String l(Context p0){
       BluetoothAdapter defaultAdapt = BluetoothAdapter.getDefaultAdapter();
       Field declaredFiel = defaultAdapt.getClass().getDeclaredField("mService");
       declaredFiel.setAccessible(true);
       String obj = declaredFiel.get(defaultAdapt);
       String str = "RISK_SERVICE_OBJECT_NULL";
       if (obj == null) {
          return str;
       }
       Class[] uClassArray = new Class[0];
       Method method = obj.getClass().getMethod("getAddress", uClassArray);
       if (method == null) {
          return str;
       }
       Object[] objArray = new Object[0];
       obj = method.invoke(obj, objArray);
       if (obj == null) {
          return str;
       }
       obj = obj.toString();
       if (TextUtils.isEmpty(obj)) {
          return "RISK_GET_FIELD_EMPTY";
       }
       return obj;
    }
    public static String m(Context p0){
       int i = (!k.a(p0, "android.permission.BLUETOOTH"))? 1: 0;
       if (Build$VERSION.SDK_INT >= 23) {
          String str = a.g(p0.getContentResolver(), "bluetooth_address");
          if (!TextUtils.isEmpty(str)) {
             return str;
          }else if(i){
             return bh.l(p0);
          }else {
             return "RISK_AUTH_FAILED";
          }
       }else if(i){
          return bh.k(p0);
       }else {
          return "RISK_AUTH_FAILED";
       }
    }
    public static String n(Context p0){
       ActivityManager systemServic = p0.getSystemService("activity");
       String str = "RISK_SERVICE_OBJECT_NULL";
       if (systemServic == null) {
          return str;
       }
       List runningAppPr = systemServic.getRunningAppProcesses();
       if (runningAppPr == null) {
          return str;
       }
       JSONArray jSONArray = new JSONArray();
       Iterator iterator = runningAppPr.iterator();
       while (iterator.hasNext()) {
          ActivityManager$RunningAppProcessInfo runningAppPr1 = iterator.next();
          if (runningAppPr1 == null) {
             continue ;
          }
          jSONArray.put(runningAppPr1.processName);
       }
       String str1 = jSONArray.toString();
       if (TextUtils.isEmpty(str1)) {
          str1 = "RISK_GET_FIELD_EMPTY";
       }
       return str1;
    }
    public static int o(Context p0){
       TelephonyManager systemServic = p0.getSystemService("phone");
       if (systemServic == null) {
          return -1;
       }
       return systemServic.getPhoneCount();
    }
    public static int p(Context p0){
       SubscriptionManager systemServic = p0.getSystemService("telephony_subscription_service");
       if (systemServic == null) {
          return -1;
       }
       return systemServic.getActiveSubscriptionInfoCountMax();
    }
    public static int q(Context p0){
       int intx;
       int i = 255;
       try{
          intx = Settings$System.getInt(p0.getContentResolver(), "screen_brightness", i);
       }catch(java.lang.Exception e0){
          intx = 0;
       }
       return intx;
    }
    public static String r(Context p0){
       StringBuilder str = "";
       try{
          PackageManager packageManag = p0.getPackageManager();
          String[] stringArray = new String[]{"android.hardware.camera","android.hardware.camera.autofocus","android.hardware.camera.flash","android.hardware.location","android.hardware.location.gps","android.hardware.location.network","android.hardware.microphone","android.hardware.sensor.compass","android.hardware.sensor.accelerometer","android.hardware.sensor.light","android.hardware.sensor.proximity","android.hardware.telephony","android.hardware.telephony.cdma","android.hardware.telephony.gsm","android.hardware.touchscreen","android.hardware.touchscreen.multitouch","android.hardware.touchscreen.multitouch.distinct","android.hardware.camera.front","android.hardware.wifi","android.hardware.bluetooth","android.hardware.nfc","android.hardware.fingerprint","android.hardware.biometrics.face","android.hardware.screen.portrait","android.hardware.screen.landscape","android.hardware.faketouch","android.hardware.audio.output"};
          int i = 0;
          while (i < 27) {
             String str1 = (packageManag.hasSystemFeature(stringArray[i]))? "1": "0";
             str = str+str1;
             i = i + 1;
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static String s(Context p0){
       String str = "RISK_GET_FIELD_EMPTY";
       try{
          if (k.a(p0, "android.permission.READ_PHONE_STATE") == -1) {
             return "RISK_AUTH_FAILED";
          }else if(Build$VERSION.SDK_INT >= 26){
             if (TextUtils.isEmpty(bh.d)) {
                str = Build.getSerial();
                bh.d = str;
             }else {
                str = bh.d;
             }
          }else {
             str = Build.SERIAL;
             if (TextUtils.isEmpty(str) || str.contains("unknown")) {
                str = bh.a("ro.serialno");
             }
          }
       }catch(java.lang.Exception e2){
          bh.d = "RISK_EXCEPTION_HAPPEN";
          bh.a(e2);
       }
       return str;
    }
}
