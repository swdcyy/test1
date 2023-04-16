package com.loc.l;
import android.content.Context;
import java.lang.String;
import java.lang.Throwable;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.loc.cj;
import com.loc.l$1;
import com.loc.ck;
import com.loc.cl;
import java.lang.Object;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import com.loc.ak;
import com.loc.w;
import com.loc.x;
import com.loc.an;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.lang.StringBuffer;
import java.lang.Integer;
import java.util.Locale;
import com.loc.m;
import com.loc.al;
import java.io.File;
import java.io.FileInputStream;
import android.os.Bundle;

public final class l	// class@00144a
{
    public static String a;
    public static boolean b;
    public static String c;
    public static String d;
    public static String e;
    public static String f;

    public static String a(Context p0){
       return l.h(p0);
    }
    public static void a(Context p0,String p1){
       if (TextUtils.isEmpty(p1)) {
          return;
       }
       l.f = p1;
       if (p0 != null) {
          cj.a().b(new l$1(p0, p1));
       }
       return;
    }
    public static void a(String p0){
       l.d = p0;
    }
    public static boolean a(){
       if (l.b) {
          return true;
       }
       if (l.b(l.a)) {
          l.b = true;
          return true;
       }else if(!TextUtils.isEmpty(l.a)){
          l.b = false;
          l.a = null;
          return false;
       }else if(l.b(l.d)){
          l.b = true;
          return true;
       }else if(!TextUtils.isEmpty(l.d)){
          l.b = false;
          l.d = null;
          return false;
       }else {
          return true;
       }
    }
    public static String b(Context p0){
       if (!("").equals(l.c)) {
          return l.c;
       }
       PackageManager packageManag = p0.getPackageManager();
       l.c = packageManag.getApplicationLabel(packageManag.getApplicationInfo(p0.getPackageName(), 0));
       return l.c;
    }
    public static boolean b(String p0){
       if (TextUtils.isEmpty(p0)) {
          return false;
       }
       p0.toCharArray();
       char[] uocharArray = p0.toCharArray();
       int len = uocharArray.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return true;
          }
          char c = uocharArray[i];
          if (65 > c || (c > 'z' && (48 > c || (c > ':' && c != '.')))) {
             break ;
          }else {
             i = i + 1;
          }
       }
       an.b(x.a(), p0, "errorPackage");
       return false;
    }
    public static String c(Context p0){
       String d = l.d;
       if (d != null && !("").equals(d)) {
          return l.d;
       }
       d = p0.getPackageName();
       l.d = d;
       if (!l.b(d)) {
          l.d = p0.getPackageName();
       }
       return l.d;
    }
    public static String d(Context p0){
       if (!("").equals(l.e)) {
          return l.e;
       }
       l.e = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 0).versionName;
       String e = l.e;
       if (e == null) {
          return "";
       }
       return e;
    }
    public static String e(Context p0){
       PackageInfo packageInfo = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 64);
       int i = 0;
       byte[] uobyteArray = MessageDigest.getInstance(x.c("IU0hBMQ")).digest(packageInfo.signatures[i].toByteArray());
       StringBuffer str = "";
       for (; i < uobyteArray.length; i = i + 1) {
          int i1 = uobyteArray[i] & 0x00ff;
          String str1 = (Integer.toHexString(i1)).toUpperCase(Locale.US);
          if (str1.length() == 1) {
             str = str+"0";
          }
          str = str+str1+":";
       }
       PackageInfo packageName = packageInfo.packageName;
       if (l.b(packageName)) {
          packageName = packageInfo.packageName;
       }
       if (!TextUtils.isEmpty(l.d)) {
          packageName = l.c(p0);
       }
       String str2 = str+packageName;
       l.a = str2;
       return str2;
    }
    public static String f(Context p0){
       m.a(p0);
       return l.h(p0);
    }
    public static String g(Context p0){
       File uFile = new File(al.c(p0, "k.store"));
       String str = "";
       if (!uFile.exists()) {
          return str;
       }
       FileInputStream uFileInputSt = new FileInputStream(uFile);
       byte[] uobyteArray = new byte[uFileInputSt.available()];
       uFileInputSt.read(uobyteArray);
       String str1 = x.a(uobyteArray);
       if (str1.length() == 32) {
          str = str1;
       }
       uFileInputSt.close();
       return str;
    }
    public static String h(Context p0){
       String f = l.f;
       if (f == null || f.equals("")) {
          ApplicationInfo applicationI = p0.getPackageManager().getApplicationInfo(p0.getPackageName(), 128);
          if (applicationI != null) {
             applicationI = applicationI.metaData;
             if (applicationI != null) {
                f = applicationI.getString("com.amap.api.v2.apikey");
                l.f = f;
                if (f == null) {
                   l.f = l.g(p0);
                }
             }
          }
          return l.f;
       }
       return l.f;
    }
}
