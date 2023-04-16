package com.alipay.sdk.m.q.b;
import java.lang.String;
import s6.a;
import android.content.Context;
import java.util.List;
import com.alipay.sdk.m.q.b$b;
import java.util.Iterator;
import java.lang.Object;
import m6.a$b;
import com.alipay.sdk.app.EnvUtils;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.lang.Throwable;
import k6.a;
import java.lang.ref.WeakReference;
import java.util.Random;
import java.lang.StringBuilder;
import java.lang.Math;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.security.cert.CertificateFactory;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.math.BigInteger;
import java.lang.Character;
import java.net.URL;
import android.app.Activity;
import java.lang.Integer;
import com.alipay.sdk.m.f.c;
import j6.b;
import l6.a;
import java.net.URLDecoder;
import com.alipay.sdk.m.q.b$a;
import java.lang.Runnable;
import j6.a;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;
import java.util.HashMap;
import android.content.res.Resources;
import android.content.res.Configuration;
import java.util.Locale;
import m6.a;
import s6.b;
import android.app.Application;
import android.content.ContentResolver;
import com.kwai.framework.deviceid.a;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import android.os.Build$VERSION;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.Display;
import android.os.Process;
import u6.c;
import java.security.MessageDigest;
import java.lang.System;
import org.json.JSONObject;

public class b	// class@000e9f
{
    public static final String[] a;
    public static final char[] b;

    static {
       String[] stringArray = new String[]{"10.1.5.1013151","10.1.5.1013148"};
       b.a = stringArray;
       b.b = new char[64]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','+','/'};
    }
    public static b$b a(a p0,Context p1,List p2){
       String str1;
       b$b uob1;
       if (p2 == null) {
          return null;
       }
       Iterator iterator = p2.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          a$b uob = iterator.next();
          if (uob == null) {
             continue ;
          }else {
             a$b a = uob.a;
             a$b b = uob.b;
             uob = uob.c;
             String str = "auth";
             if (EnvUtils.a() && ("com.eg.android.AlipayGphone").equals(a)) {
                a = "com.eg.android.AlipayGphoneRC";
             }
             PackageInfo packageInfo = p1.getPackageManager().getPackageInfo(a, 192);
             boolean b1 = false;
             if (packageInfo == null) {
                str1 = "info == null";
             }else {
                PackageInfo signatures = packageInfo.signatures;
                if (signatures == null) {
                   str1 = "info.signatures == null";
                }else if(signatures.length <= 0){
                   str1 = "info.signatures.length <= 0";
                }else {
                   b1 = true;
                   str1 = "";
                }
             }
             if (!b1) {
                a.h(p0, str, "NotIncludeSignatures", str1);
             }
             uob1 = (!b1 || packageInfo == null)? null: new b$b(packageInfo, b, uob);
             if (uob1 != null && (!uob1.b(p0) && !uob1.a())) {
                break ;
             }
          }
       }
       return uob1;
    }
    public static Object b(WeakReference p0){
       p0 = (p0 == null)? null: p0.get();
       return p0;
    }
    public static String c(int p0){
       double d1;
       Random random = new Random();
       StringBuilder str = "";
       int i = 0;
       while (i < p0) {
          int i1 = random.nextInt(3);
          double d = 25.00f;
          if (i1) {
             if (i1 != Double.MIN_VALUE) {
                if (i1 == -0.00f) {
                   str = str+String.valueOf(new Random().nextInt(10));
                }
             }else {
                d1 = Math.random() * d;
                d1 = d1 + 97.00f;
                str = str+String.valueOf((char)(int)Math.round(d1));
             }
          }else {
             d1 = Math.random() * d;
             d1 = d1 + 65.00f;
             str = str+String.valueOf((char)(int)Math.round(d1));
          }
          i = i + 1;
       }
       return str;
    }
    public static String d(String p0,String p1,String p2){
       int i = p2.indexOf(p0) + p0.length();
       if (i <= p0.length()) {
          return "";
       }
       int i1 = 0;
       if (!TextUtils.isEmpty(p1)) {
          i1 = p2.indexOf(p1, i);
       }
       if (i1 < 1) {
          return p2.substring(i);
       }else {
          return p2.substring(i, i1);
       }
    }
    public static String e(a p0,byte[] p1){
       try{
          PublicKey publicKey = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(p1)).getPublicKey();
          if (publicKey instanceof RSAPublicKey) {
             BigInteger modulus = publicKey.getModulus();
             if (modulus != null) {
                return modulus.toString(16);
             }
          }
       }catch(java.lang.Exception e3){
          a.d(p0, "auth", "GetPublicKeyFromSignEx", e3);
       }
       return null;
    }
    public static String f(byte[] p0){
       StringBuilder str = new StringBuilder((p0.length * 2));
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          int b = p0[i];
          int i1 = b & 0x00f0;
          i1 = i1 >> 4;
          b = b & 0x0f;
          str = str+Character.forDigit(i1, 16)+Character.forDigit(b, 16);
       }
       return str;
    }
    public static boolean g(a p0,String p1){
       p1 = new URL(p1).getHost();
       if (p1.endsWith("alipay.com") || p1.endsWith("alipay.net")) {
          return true;
       }
       return false;
    }
    public static boolean h(a p0,String p1,Activity p2){
       c uoc;
       int i1;
       String str = "&";
       String str1 = "";
       String str2 = "&end_code=";
       if (TextUtils.isEmpty(p1)) {
          return true;
       }
       String str3 = "alipays://platformapi/startApp?";
       if ((p1.toLowerCase()).startsWith(str3.toLowerCase()) || (p1.toLowerCase()).startsWith(("intent://platformapi/startapp?").toLowerCase())) {
          b$b uob = b.a(p0, p2, a.d);
          if (uob == null || (!uob.a() && !uob.b(p0))) {
             if (p1.startsWith("intent://platformapi/startapp")) {
                p1 = p1.replaceFirst("intent://platformapi/startapp\\?", str3);
             }
             p2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(p1)));
          }
       label_0162 :
          return true;
       }else if(TextUtils.equals(p1, "sdklite://h5quit") || TextUtils.equals(p1, "http://m.alipay.com/?action=h5quit")){
          b.c(b.a());
          p2.finish();
          return true;
       }else {
          String str4 = "sdklite://h5quit?result=";
          if (!p1.startsWith(str4)) {
             return 0;
          }
          try{
             String str5 = p1.substring((p1.indexOf(str4) + 24));
             int i = Integer.parseInt(str5.substring((str5.lastIndexOf(str2) + 10)));
             if (i == c.c.b() || i == c.j.b()) {
                if (a.c) {
                   p1 = URLDecoder.decode(p1);
                   String str6 = URLDecoder.decode(p1);
                   int i2 = p1.indexOf("&return_url=") + 12;
                   str4 = (str6.substring((str6.indexOf(str4) + 24), str6.lastIndexOf(str2))).split("&return_url=")[0]+"&return_url="+p1.substring(i2, p1.indexOf(str, i2))+p1.substring(p1.indexOf(str, i2));
                }else {
                   p1 = URLDecoder.decode(p1);
                   str4 = p1.substring((p1.indexOf(str4) + 24), p1.lastIndexOf(str2));
                }
                c uoc1 = c.b(i);
                int i3 = uoc1.b();
                b.c(b.b(i3, uoc1.a(), str4));
             }else {
                uoc = c.b(c.d.b());
                i1 = uoc.b();
                b.c(b.b(i1, uoc.a(), str1));
             }
          }catch(java.lang.Exception e0){
             uoc = c.b(c.h.b());
             i1 = uoc.b();
             b.c(b.b(i1, uoc.a(), str1));
          }
          p2.runOnUiThread(new b$a(p2));
          return true;
       }
    }
    public static String i(){
       if (EnvUtils.a()) {
          return "com.eg.android.AlipayGphoneRC";
       }
       return a.d.get(0).a;
    }
    public static Map j(String p0){
       HashMap hashMap = new HashMap();
       String[] stringArray = p0.split("&");
       int len = stringArray.length;
       int i = 0;
       while (i < len) {
          object oobject = stringArray[i];
          int i1 = oobject.indexOf("=", 1);
          if (-1 != i1) {
             i1 = i1 + 1;
             hashMap.put(oobject.substring(0, i1), URLDecoder.decode(oobject.substring(i1)));
          }
          i = i + 1;
       }
       return hashMap;
    }
    public static Map k(a p0,String p1){
       HashMap hashMap = new HashMap(4);
       int i = p1.indexOf(63);
       if (i != -1 && i < (p1.length() - 1)) {
          String[] stringArray = (p1.substring((i + 1))).split("&");
          i = stringArray.length;
          int i1 = 0;
          while (i1 < i) {
             object oobject = stringArray[i1];
             int i2 = oobject.indexOf(61, 1);
             if (i2 != -1) {
                int i3 = oobject.length() - 1;
                if (i2 < i3) {
                   i2 = i2 + 1;
                   hashMap.put(oobject.substring(0, i2), b.p(p0, oobject.substring(i2)));
                }
             }
             i1 = i1 + 1;
          }
       }
       return hashMap;
    }
    public static boolean l(a p0,Context p1,List p2){
       String str;
       Iterator iterator = p2.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          a$b uob = iterator.next();
          if (uob == null) {
             continue ;
          }else {
             try{
                uob = uob.a;
                if (EnvUtils.a() && ("com.eg.android.AlipayGphone").equals(uob)) {
                   str = "com.eg.android.AlipayGphoneRC";
                }
                PackageManager packageManag = p1.getPackageManager();
                int i = 128;
                if (packageManag.getPackageInfo(str, i) != null) {
                   break ;
                }
             }catch(android.content.pm.PackageManager$NameNotFoundException e0){
             }
          }
       }
       return true;
    }
    public static String m(Context p0){
       return p0.getResources().getConfiguration().locale.toString();
    }
    public static int n(String p0){
       String str = a.A().n();
       int i = 0;
       if (TextUtils.isEmpty(str)) {
          return i;
       }
       String str1 = "";
       str = a.g(b.d().b().getContentResolver(), str);
       if (str != null) {
          str1 = str;
       }
       if (str1.contains(p0)) {
          i = 2;
       }
       int i1 = i | 0x01;
       return i1;
    }
    public static String o(){
       String str = "\n";
       String str1 = "Unavailable";
       try{
          BufferedReader uBufferedRea = new BufferedReader(new FileReader("/proc/version"), 256);
          String str2 = uBufferedRea.readLine();
          uBufferedRea.close();
          Matcher matcher = Pattern.compile("\\w+\\s+\\w+\\s+\([^\\s]+\)\\s+\\\(\([^\\s@]+\(?:@[^\\s.]+\)?\)[^\)]*\\\)\\s+\\\(\(?:[^\(]*\\\([^\)]*\\\)\)?[^\)]*\\\)\\s+\([^\\s]+\)\\s+\(?:PREEMPT\\s+\)?\(.+\)").matcher(str2);
          if (matcher.matches()) {
             int i2 = 4;
             if (matcher.groupCount() >= i2) {
                str1 = matcher.group(1)+str+matcher.group(2)+" "+matcher.group(3)+str+matcher.group(i2);
             }
          }
          int i = str1.indexOf("-");
          if (i != -1) {
             str1 = str1.substring(0, i);
          }
          int i1 = str1.indexOf(e0);
          if (i1 != -1) {
             str1 = str1.substring(0, i1);
          }
          return "Linux "+str1;
       }catch(java.io.IOException e0){
       }
    }
    public static String p(a p0,String p1){
       try{
          return URLDecoder.decode(p1, "utf-8");
       }catch(java.io.UnsupportedEncodingException e3){
          a.d(p0, "biz", "H5PayDataAnalysisError", e3);
          return "";
       }
    }
    public static String q(){
       return "Android "+Build$VERSION.RELEASE;
    }
    public static String r(Context p0){
       DisplayMetrics uDisplayMetr = new DisplayMetrics();
       p0.getApplicationContext().getSystemService("window").getDefaultDisplay().getMetrics(uDisplayMetr);
       return uDisplayMetr.widthPixels+"*"+uDisplayMetr.heightPixels;
    }
    public static int s(){
       int i = Process.myUid();
       return i;
    }
    public static String t(String p0){
       byte[] uobyteArray;
       try{
          MessageDigest instance = MessageDigest.getInstance("SHA-256");
          instance.update(p0.getBytes());
          uobyteArray = instance.digest();
          if (uobyteArray.length > 16) {
             byte[] uobyteArray1 = new byte[16];
             System.arraycopy(uobyteArray, 0, uobyteArray1, 0, 16);
             uobyteArray = b.f(uobyteArray1);
          }else {
             uobyteArray = b.f(uobyteArray);
          }
       }catch(java.security.NoSuchAlgorithmException e0){
          uobyteArray = "";
       }
       return uobyteArray;
    }
    public static JSONObject u(String p0){
       JSONObject jSONObject = new JSONObject(p0);
       return jSONObject;
    }
    public static boolean v(Context p0){
       PackageInfo packageInfo = p0.getPackageManager().getPackageInfo(b.i(), 128);
       if (packageInfo == null) {
          return false;
       }
       if (packageInfo.versionCode < 99) {
          return true;
       }
       return false;
    }
    public static String w(String p0){
       Uri uri = Uri.parse(p0);
       String authority = uri.getAuthority();
       Object[] objArray = new Object[]{authority,uri.getPath()};
       return String.format("%s%s", objArray);
    }
}
