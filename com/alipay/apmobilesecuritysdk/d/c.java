package com.alipay.apmobilesecuritysdk.d.c;
import android.content.Context;
import java.util.Map;
import java.lang.String;
import y6.a;
import java.util.HashMap;
import com.alipay.apmobilesecuritysdk.e.f;
import com.alipay.apmobilesecuritysdk.e.e;
import java.lang.Object;
import android.telephony.TelephonyManager;
import com.kwai.privacykit.interceptor.ImeiInterceptor;
import java.lang.System;
import com.kwai.privacykit.interceptor.ImsiInterceptor;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiInfo;
import com.kwai.privacykit.interceptor.MacAddressInterceptor;
import android.content.ContentResolver;
import com.kwai.framework.deviceid.a;
import x6.a;
import org.json.JSONObject;
import com.alipay.apmobilesecuritysdk.f.a;
import java.lang.Throwable;
import com.alipay.apmobilesecuritysdk.c.a;
import android.hardware.SensorManager;
import java.util.List;
import java.lang.StringBuilder;
import java.util.Iterator;
import android.hardware.Sensor;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.Integer;
import java.io.FileInputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.LineNumberReader;
import java.io.Reader;
import y6.b;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.lang.CharSequence;
import android.os.Environment;
import android.os.StatFs;
import java.lang.Class;
import java.lang.reflect.Method;
import org.json.JSONArray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.OutputStream;
import android.util.Base64;
import java.util.LinkedHashMap;
import java.util.Set;
import android.os.Build;
import java.lang.reflect.Field;
import android.os.SystemClock;
import android.app.KeyguardManager;
import java.lang.Math;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import java.util.TimeZone;
import java.util.Locale;

public final class c	// class@000e69
{

    public static Map a(Context p0){
       a f;
       a e;
       a h;
       int i;
       SensorManager systemServic;
       List sensorList;
       Iterator iterator;
       Sensor sensor;
       DisplayMetrics uDisplayMetr;
       int i1;
       FileInputStream uFileInputSt;
       InputStreamReader inputStreamR;
       LineNumberReader lineNumberRe;
       String str4;
       String str5;
       String str6;
       int i2;
       FileReader uFileReader;
       BufferedReader uBufferedRea;
       FileReader uFileReader1;
       BufferedReader uBufferedRea1;
       long l;
       StatFs statFs;
       long l1;
       TelephonyManager systemServic1;
       Class uClass;
       Sensor obj1;
       Class[] uClassArray;
       Object[] objArray;
       JSONArray jSONArray;
       SensorManager systemServic2;
       List sensorList1;
       Iterator iterator1;
       JSONObject jSONObject1;
       String[] stringArray;
       int i3;
       LinkedHashMap linkedHashMa;
       Iterator iterator2;
       LineNumberReader lineNumberRe1;
       char c;
       String str8;
       Class[] uClassArray1;
       char c1;
       String str9;
       String[] stringArray1;
       int i4;
       LinkedHashMap linkedHashMa1;
       Iterator iterator3;
       char c2;
       Intent intent;
       int intExtra;
       String[] stringArray2;
       long l2;
       ByteArrayInputStream uByteArrayIn;
       ByteArrayOutputStream uByteArrayOu;
       GZIPOutputStream gZIPOutputSt;
       int i5;
       byte[] uobyteArray;
       FileReader uFileReader2;
       String[] stringArray3;
       Context uContext = p0;
       String str = String.class;
       a uoa = a.c();
       HashMap hashMap = new HashMap();
       f uof = e.a(p0);
       _monitor_enter(uoa);
       if (a.a(uoa.b)) {
          f = uoa.f;
          if (f == null) {
          label_0020 :
             if (a.b(uContext, "android.permission.READ_PHONE_STATE")) {
                String obj = "";
             }else {
                TelephonyManager systemServic4 = uContext.getSystemService("phone");
                if (systemServic4 != null) {
                   uoa.f = ImeiInterceptor.getDeviceId(systemServic4);
                }
                if (uoa.f == null) {
                   uoa.f = "";
                }
                uoa.b = System.currentTimeMillis();
                f = uoa.f;
             }
          }
       }else {
          goto label_0020 ;
       }
       _monitor_exit(uoa);
       _monitor_enter(uoa);
       if (a.a(uoa.a)) {
          e = uoa.e;
          if (e == null) {
          label_005b :
             if (a.b(uContext, "android.permission.READ_PHONE_STATE")) {
                String str3 = "";
             }else {
                TelephonyManager systemServic3 = uContext.getSystemService("phone");
                if (systemServic3 != null) {
                   uoa.e = ImsiInterceptor.getSubscriberId(systemServic3);
                }
                if (uoa.e == null) {
                   uoa.e = "";
                }
                uoa.a = System.currentTimeMillis();
                e = uoa.e;
             }
          }
       }else {
          goto label_005b ;
       }
       _monitor_exit(uoa);
       _monitor_enter(uoa);
       if (a.a(uoa.d)) {
          h = uoa.h;
          if (h == null) {
          label_0096 :
             if (a.b(uContext, "android.permission.ACCESS_WIFI_STATE")) {
                h = "";
             }else {
                String macAddress = MacAddressInterceptor.getMacAddress(uContext.getSystemService("wifi").getConnectionInfo());
                uoa.h = macAddress;
                if (macAddress != null && (!macAddress.length() || ("02:00:00:00:00:00").equals(uoa.h))) {
                   macAddress = a.m();
                }else {
                   uoa.d = System.currentTimeMillis();
                   h = uoa.h;
                }
             }
          }
       }else {
          goto label_0096 ;
       }
       _monitor_exit(uoa);
       String str1 = "";
       StringBuilder str2 = a.g(p0.getContentResolver(), "android_id");
       if (str2 != null) {
          str1 = str2;
       }
       if (uof != null) {
          if (a.c(f)) {
             f = uof.a();
          }
          if (a.c(e)) {
             e = uof.b();
          }
          if (a.c(h)) {
             h = uof.c();
          }
          if (a.c(str1)) {
             str1 = uof.e();
          }
       }
       f uof1 = new f(f, e, h, "", str1);
       if (uContext) {
          try{
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("imei", uof.a());
             jSONObject.put("imsi", uof.b());
             try{
                String str7 = "mac";
                jSONObject.put(str7, uof.c());
                jSONObject.put("bluetoothmac", uof.d());
                jSONObject.put("gsi", uof.e());
                String str10 = jSONObject.toString();
                a.a("device_feature_file_name", "device_feature_file_key", str10);
                a.a(uContext, "device_feature_prefs_name", "device_feature_prefs_key", str10);
             }catch(java.lang.Exception e0){
                a.a(e0);
             }
          }catch(java.lang.Exception e0){
          }
       }
    }
}
