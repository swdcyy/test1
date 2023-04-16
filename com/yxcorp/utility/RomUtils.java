package com.yxcorp.utility.RomUtils;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.utility.RomUtils$a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import android.os.Build;
import ekd.e0;
import java.io.File;
import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Reader;
import com.yxcorp.utility.Log;
import java.lang.Throwable;
import java.lang.Exception;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.RuntimeException;

public class RomUtils	// class@0013ff
{
    public static final ConcurrentHashMap a;
    public static String b;
    public static String c;
    public static String d;
    public static String e;
    public static String f;

    static {
       RomUtils.a = new ConcurrentHashMap();
    }
    public static boolean a(String p0){
       if (RomUtils.b == null) {
          RomUtils.y();
       }
       if (p0.equals("EMOTION") || p0.equals("MAGIC")) {
          return (RomUtils.h()).equals(p0);
       }else {
          return (RomUtils.b).equals(p0);
       }
    }
    public static String b(String p0){
       ConcurrentHashMap a = RomUtils.a;
       String str = a.get(p0);
       if (str == null) {
          str = RomUtils$a.a(p0);
          if (str == null) {
             str = "";
          }
          a.put(p0, str);
       }
       return str;
    }
    public static String c(){
       if (RomUtils.e == null) {
          RomUtils.y();
       }
       return RomUtils.e;
    }
    public static String d(){
       if (RomUtils.d == null) {
          RomUtils.y();
       }
       return RomUtils.d;
    }
    public static String e(){
       if (RomUtils.b == null) {
          RomUtils.y();
       }
       return RomUtils.b;
    }
    public static String f(){
       if (RomUtils.b == null) {
          RomUtils.y();
       }
       return RomUtils.h();
    }
    public static String g(String p0){
       p0 = RomUtils$a.a(p0);
       if (p0 != null) {
       }else {
          p0 = "";
       }
       return p0;
    }
    public static String h(){
       String b = RomUtils.b;
       if (b == null) {
          return "";
       }
       if (!b.equals("EMUI")) {
          return RomUtils.b;
       }
       b = RomUtils.b("ro.build.version.emui");
       String str = RomUtils.b("ro.build.version.magic");
       String str1 = "MagicUI";
       if (!b.contains(str1) && (str.contains(str1) || str.contains("MagicOS"))) {
          return "MAGIC";
       }
       if (!b.contains("EmotionUI")) {
          return RomUtils.b;
       }
       if (((RomUtils.b("ro.product.brand")).toLowerCase()).equals("honor")) {
          return "MAGIC";
       }
       return "EMOTION";
    }
    public static String i(){
       if (RomUtils.c == null) {
          RomUtils.y();
       }
       return RomUtils.c;
    }
    public static String j(){
       String str1;
       String str2;
       if (RomUtils.c == null) {
          RomUtils.y();
       }
       String str = "";
       if (RomUtils.n()) {
          str1 = RomUtils.i();
       label_0013 :
          str2 = str;
       }else if(RomUtils.s()){
          str1 = RomUtils.i();
          goto label_0013 ;
       }else if(RomUtils.q()){
          str1 = RomUtils.i();
          str2 = RomUtils.b("ro.miui.ui.version.code");
       }else if(RomUtils.w()){
          str1 = RomUtils.b("ro.vivo.os.name");
          str2 = RomUtils.i();
       }else {
          str1 = str;
          str2 = str1;
       }
       if (!TextUtils.isEmpty(str1) || !TextUtils.isEmpty(str2)) {
          str = str1+"#"+str2;
       }
       return str;
    }
    public static boolean k(){
       boolean b = (RomUtils.a("QIKU") || RomUtils.a("360"))? true: false;
       return b;
    }
    public static boolean l(){
       if (RomUtils.s() || RomUtils.t()) {
          return true;
       }
       if (!RomUtils.r()) {
          return false;
       }
       String str = RomUtils.b("ro.build.version.oplusrom");
       RomUtils.c = str;
       return (TextUtils.isEmpty(str) ^ true);
    }
    public static boolean m(){
       return RomUtils.a("EMOTION");
    }
    public static boolean n(){
       boolean b = true;
       if (RomUtils.a("EMUI")) {
          return b;
       }
       if (!RomUtils.m() && !RomUtils.p()) {
          b = false;
       }
       return b;
    }
    public static boolean o(){
       return RomUtils.a("FLYME");
    }
    public static boolean p(){
       return RomUtils.a("MAGIC");
    }
    public static boolean q(){
       return RomUtils.a("MIUI");
    }
    public static boolean r(){
       return RomUtils.a("OnePlus");
    }
    public static boolean s(){
       return RomUtils.a("OPPO");
    }
    public static boolean t(){
       return RomUtils.a("REALME");
    }
    public static boolean u(){
       return RomUtils.a("SAMSUNG");
    }
    public static boolean v(){
       return RomUtils.a("SMARTISAN");
    }
    public static boolean w(){
       return RomUtils.a("VIVO");
    }
    public static void x(){
       String dISPLAY = Build.DISPLAY;
       RomUtils.c = dISPLAY;
       if ((dISPLAY.toUpperCase()).contains("FLYME")) {
          RomUtils.b = "FLYME";
       }else {
          RomUtils.c = "unknown";
          RomUtils.b = (Build.MANUFACTURER).toUpperCase();
       }
       return;
    }
    public static void y(){
       String str2;
       BufferedWriter uBufferedWri;
       String str3;
       File uFile = new File(e0.b.getFilesDir(), "rom.dat");
       String str = "гд";
       if (uFile != null) {
          try{
             BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(new FileInputStream(uFile)));
             String str1 = uBufferedRea.readLine();
             if (str1 != null) {
                str1 = str1.trim();
                String[] stringArray = str1.split(str);
                if (stringArray.length == 4) {
                   RomUtils.b = stringArray[0];
                   RomUtils.c = stringArray[1];
                   RomUtils.d = stringArray[2];
                   RomUtils.e = stringArray[3];
                   Log.g("RomUtils", str1);
                   uBufferedRea.close();
                   return;
                }
             }
             uBufferedRea.close();
          }catch(java.lang.Exception e2){
             e2.printStackTrace();
          }
       }
    }
}
