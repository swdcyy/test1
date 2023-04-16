package com.kuaishou.weapon.ks.bl;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.weapon.ks.bh;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Throwable;
import android.util.DisplayMetrics;
import android.os.Build;
import android.content.Context;
import android.view.WindowManager;
import android.view.Display;
import android.graphics.Point;
import java.lang.Math;
import java.lang.StringBuilder;
import java.lang.Runtime;
import java.lang.Process;
import java.io.InputStream;
import java.lang.System;
import android.telephony.TelephonyManager;
import android.os.Build$VERSION;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class bl	// class@0011e8
{

    public void bl(){
       super();
    }
    public static String A(){
       String str = bh.a("persist.service.bdroid.bdaddr");
       if (TextUtils.isEmpty(str)) {
          str = "RISK_GET_FIELD_EMPTY";
       }
       return str;
    }
    public static String B(){
       Class uClass = Class.forName("android.os.SystemProperties");
       Class[] uClassArray = new Class[]{String.class};
       Object[] objArray = new Object[]{"gsm.version.baseband"};
       String str = uClass.getMethod("get", uClassArray).invoke(uClass, objArray);
       if (TextUtils.isEmpty(str)) {
          str = "RISK_GET_FIELD_EMPTY";
       }
       return str;
    }
    public static float a(DisplayMetrics p0){
       if (p0 == null) {
          return 0;
       }
       return p0.xdpi;
    }
    public static String a(){
       String mANUFACTURER = Build.MANUFACTURER;
       if (TextUtils.isEmpty(mANUFACTURER)) {
          mANUFACTURER = "RISK_GET_FIELD_EMPTY";
       }
       return mANUFACTURER;
    }
    public static String a(Context p0){
       Display defaultDispl = p0.getSystemService("window").getDefaultDisplay();
       defaultDispl.getMetrics(new DisplayMetrics());
       Point point = new Point();
       defaultDispl.getRealSize(point);
       Point x = point.x;
       point = point.y;
       float f = bl.a(bl.e(p0));
       float f1 = bl.b(bl.e(p0));
       int i = 0;
       if (!f - i || !f1 - i) {
          return "";
       }
       int i1 = Math.round((((float)x / f) * 0x40228f5c)) * 10;
       int i2 = Math.round((((float)point / f1) * 0x40228f5c)) * 10;
       if (i1 > i2) {
          return i2+"mm * "+i1+"mm";
       }
       return i1+"mm * "+i2+"mm";
    }
    public static float b(DisplayMetrics p0){
       if (p0 == null) {
          return 0;
       }
       return p0.ydpi;
    }
    public static String b(){
       String bRAND = Build.BRAND;
       if (TextUtils.isEmpty(bRAND)) {
          bRAND = "RISK_GET_FIELD_EMPTY";
       }
       return bRAND;
    }
    public static String b(Context p0){
       Display defaultDispl = p0.getSystemService("window").getDefaultDisplay();
       defaultDispl.getMetrics(new DisplayMetrics());
       Point point = new Point();
       defaultDispl.getRealSize(point);
       Point x = point.x;
       point = point.y;
       if (x > point) {
          return point+"*"+x;
       }
       return x+"*"+point;
    }
    public static String c(){
       String mODEL = Build.MODEL;
       if (TextUtils.isEmpty(mODEL)) {
          mODEL = "RISK_GET_FIELD_EMPTY";
       }
       return mODEL;
    }
    public static String c(Context p0){
       object oobject = null;
       Process process = Runtime.getRuntime().exec("cat /proc/version");
       InputStream inputStream = process.getInputStream();
       byte[] uobyteArray = new byte[1024];
       int i = inputStream.read(uobyteArray);
       byte[] uobyteArray1 = new byte[i];
       System.arraycopy(uobyteArray, 0, uobyteArray1, 0, i);
       String str = new String(uobyteArray1, "utf-8");
       i = str.indexOf("version");
       if (i != -1) {
          String[] stringArray = (str.substring(i)).split(" ");
          if (1 < stringArray.length) {
             oobject = stringArray[1];
          }
       }
       if (TextUtils.isEmpty(oobject)) {
          inputStream.close();
          process.destroy();
          return "RISK_GET_FIELD_EMPTY";
       }else {
          inputStream.close();
          process.destroy();
          return oobject;
       }
    }
    public static int d(Context p0){
       TelephonyManager systemServic = p0.getSystemService("phone");
       if (systemServic == null) {
          return -1;
       }
       return systemServic.isNetworkRoaming();
    }
    public static String d(){
       String hARDWARE = Build.HARDWARE;
       if (TextUtils.isEmpty(hARDWARE)) {
          hARDWARE = "RISK_GET_FIELD_EMPTY";
       }
       return hARDWARE;
    }
    public static DisplayMetrics e(Context p0){
       DisplayMetrics uDisplayMetr = new DisplayMetrics();
       p0.getSystemService("window").getDefaultDisplay().getMetrics(uDisplayMetr);
       return uDisplayMetr;
    }
    public static String e(){
       String pRODUCT = Build.PRODUCT;
       if (TextUtils.isEmpty(pRODUCT)) {
          pRODUCT = "RISK_GET_FIELD_EMPTY";
       }
       return pRODUCT;
    }
    public static String f(){
       String dEVICE = Build.DEVICE;
       if (TextUtils.isEmpty(dEVICE)) {
          dEVICE = "RISK_GET_FIELD_EMPTY";
       }
       return dEVICE;
    }
    public static String g(){
       String bOARD = Build.BOARD;
       if (TextUtils.isEmpty(bOARD)) {
          bOARD = "RISK_GET_FIELD_EMPTY";
       }
       return bOARD;
    }
    public static String h(){
       String hOST = Build.HOST;
       if (TextUtils.isEmpty(hOST)) {
          hOST = "RISK_GET_FIELD_EMPTY";
       }
       return hOST;
    }
    public static String i(){
       String uSER = Build.USER;
       if (TextUtils.isEmpty(uSER)) {
          uSER = "RISK_GET_FIELD_EMPTY";
       }
       return uSER;
    }
    public static String j(){
       String tYPE = Build.TYPE;
       if (TextUtils.isEmpty(tYPE)) {
          tYPE = "RISK_GET_FIELD_EMPTY";
       }
       return tYPE;
    }
    public static String k(){
       String tAGS = Build.TAGS;
       if (TextUtils.isEmpty(tAGS)) {
          tAGS = "RISK_GET_FIELD_EMPTY";
       }
       return tAGS;
    }
    public static String l(){
       String bOOTLOADER = Build.BOOTLOADER;
       if (TextUtils.isEmpty(bOOTLOADER)) {
          bOOTLOADER = "RISK_GET_FIELD_EMPTY";
       }
       return bOOTLOADER;
    }
    public static String m(){
       String iD = Build.ID;
       if (TextUtils.isEmpty(iD)) {
          iD = "RISK_GET_FIELD_EMPTY";
       }
       return iD;
    }
    public static String n(){
       String dISPLAY = Build.DISPLAY;
       if (TextUtils.isEmpty(dISPLAY)) {
          dISPLAY = "RISK_GET_FIELD_EMPTY";
       }
       return dISPLAY;
    }
    public static String o(){
       String cODENAME = Build$VERSION.CODENAME;
       if (TextUtils.isEmpty(cODENAME)) {
          cODENAME = "RISK_GET_FIELD_EMPTY";
       }
       return cODENAME;
    }
    public static String p(){
       String str = bh.a("rild.libpath");
       if (TextUtils.isEmpty(str)) {
          str = "RISK_GET_FIELD_EMPTY";
       }
       return str;
    }
    public static String q(){
       String rELEASE = Build$VERSION.RELEASE;
       if (TextUtils.isEmpty(rELEASE)) {
          rELEASE = "RISK_GET_FIELD_EMPTY";
       }
       return rELEASE;
    }
    public static int r(){
       return Build$VERSION.SDK_INT;
    }
    public static String s(){
       String fINGERPRINT = Build.FINGERPRINT;
       if (TextUtils.isEmpty(fINGERPRINT)) {
          fINGERPRINT = "RISK_GET_FIELD_EMPTY";
       }
       return fINGERPRINT;
    }
    public static String t(){
       String property = System.getProperty("http.agent");
       if (TextUtils.isEmpty(property)) {
          property = "RISK_GET_FIELD_EMPTY";
       }
       return property;
    }
    public static String u(){
       Process process = Runtime.getRuntime().exec("uname -a");
       InputStream inputStream = (!process.waitFor())? process.getInputStream(): process.getErrorStream();
       BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(inputStream), 512);
       String str = uBufferedRea.readLine();
       uBufferedRea.close();
       if (inputStream != null) {
          inputStream.close();
       }
       process.destroy();
       return str;
    }
    public static String v(){
       String rADIO = Build.RADIO;
       if (TextUtils.isEmpty(rADIO)) {
          rADIO = "RISK_GET_FIELD_EMPTY";
       }
       return rADIO;
    }
    public static String w(){
       String str = bh.a("ro.build.description");
       if (TextUtils.isEmpty(str)) {
          str = "RISK_GET_FIELD_EMPTY";
       }
       return str;
    }
    public static String x(){
       String iNCREMENTAL = Build$VERSION.INCREMENTAL;
       if (TextUtils.isEmpty(iNCREMENTAL)) {
          iNCREMENTAL = "RISK_GET_FIELD_EMPTY";
       }
       return iNCREMENTAL;
    }
    public static String y(){
       String str = bh.a("ro.product.name");
       if (TextUtils.isEmpty(str)) {
          str = "RISK_GET_FIELD_EMPTY";
       }
       return str;
    }
    public static String z(){
       String str = bh.a("dalvik.vm.heapgrowthlimit");
       if (TextUtils.isEmpty(str)) {
          str = "RISK_GET_FIELD_EMPTY";
       }
       return str;
    }
}
