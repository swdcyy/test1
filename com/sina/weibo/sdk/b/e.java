package com.sina.weibo.sdk.b.e;
import java.lang.String;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import com.sina.weibo.sdk.b.d;
import java.lang.Exception;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Bundle;
import java.net.URL;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.io.UnsupportedEncodingException;
import java.lang.StringBuilder;
import android.os.Build;
import android.os.Build$VERSION;

public final class e	// class@000bb8
{
    public static char[] ak;
    public static byte[] al;

    static {
       int i3;
       e.ak = ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=").toCharArray();
       int i = 256;
       byte[] uobyteArray = new byte[i];
       e.al = uobyteArray;
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          e.al[i1] = -1;
       }
       for (i = 65; i <= 90; i = i + 1) {
          int i2 = i - 65;
          e.al[i] = (byte)i2;
       }
       i = 97;
       for (i1 = 97; i1 <= 122; i1 = i1 + 1) {
          i3 = i1 + 26;
          i3 = i3 - i;
          e.al[i1] = (byte)i3;
       }
       i = 48;
       for (i1 = 48; i1 <= 57; i1 = i1 + 1) {
          i3 = i1 + 52;
          i3 = i3 - i;
          e.al[i1] = (byte)i3;
       }
       byte[] al = e.al;
       al[43] = 62;
       al[47] = 63;
    }
    public static int a(int p0,Context p1){
       return (int)(((float)p0 * c.c(p1.getResources()).density) + 0x3f000000);
    }
    public static String b(Context p0,String p1){
       try{
          PackageInfo packageInfo = p0.getPackageManager().getPackageInfo(p1, 64);
          if (packageInfo != null) {
             packageInfo = packageInfo.signatures;
             if (packageInfo != null && packageInfo.length > 0) {
                return d.a(packageInfo[0].toByteArray());
             }
          }
       }catch(android.content.pm.PackageManager$NameNotFoundException e1){
          e1.printStackTrace();
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
       }
       return null;
    }
    public static byte[] b(byte[] p0){
       char c;
       byte[] uobyteArray = new byte[(((p0.length + 2) / 3) * 4)];
       int i = 0;
       int i1 = 0;
       while (i < p0.length) {
          int i2 = p0[i] & 0x00ff;
          i2 = i2 << 8;
          int i3 = i + 1;
          int i4 = 1;
          if (i3 < p0.length) {
             i3 = p0[i3] & 0x00ff;
             i2 = i2 | i3;
             c = 1;
          }else {
             c = 0;
          }
          i2 = i2 << 8;
          int i5 = i + 2;
          if (i5 < p0.length) {
             i5 = p0[i5] & 0x00ff;
             i2 = i2 | i5;
          }else {
             i4 = 0;
          }
          i5 = i1 + 3;
          char[] ak = e.ak;
          int i6 = 64;
          i4 = (i4)? i2 & 0x3f: 64;
          uobyteArray[i5] = (byte)ak[i4];
          i2 = i2 >> 6;
          i5 = i1 + 2;
          if (c) {
             i6 = i2 & 0x3f;
          }
          uobyteArray[i5] = (byte)ak[i6];
          i2 = i2 >> 6;
          i3 = i1 + 1;
          i5 = i2 & 0x3f;
          uobyteArray[i3] = (byte)ak[i5];
          i2 = i2 >> 6;
          i3 = i1 + 0;
          i2 = i2 & 0x3f;
          uobyteArray[i3] = (byte)ak[i2];
          i = i + 3;
          i1 = i1 + 4;
       }
       return uobyteArray;
    }
    public static Bundle g(String p0){
       try{
          return e.i(new URL(p0).getQuery());
       }catch(java.net.MalformedURLException e1){
          e1.printStackTrace();
          return null;
       }
    }
    public static Bundle h(String p0){
       try{
          return e.i(new URI(p0).getQuery());
       }catch(java.net.URISyntaxException e1){
          e1.printStackTrace();
          return null;
       }
    }
    public static Bundle i(String p0){
       Bundle uBundle = new Bundle();
       if (p0 != null) {
          String[] stringArray = p0.split("&");
          int len = stringArray.length;
          int i = 0;
          while (i < len) {
             String[] stringArray1 = (stringArray[i]).split("=");
             try{
                if (stringArray1.length == 2) {
                   uBundle.putString(URLDecoder.decode(stringArray1[0], "UTF-8"), URLDecoder.decode(stringArray1[1], "UTF-8"));
                }else if(stringArray1.length == 1){
                   uBundle.putString(URLDecoder.decode(stringArray1[0], "UTF-8"), "");
                }
             }catch(java.io.UnsupportedEncodingException e4){
                e4.printStackTrace();
             }
             i = i + 1;
          }
       }
       return uBundle;
    }
    public static String o(){
       return Build.MANUFACTURER+"-"+Build.MODEL+"_"+Build$VERSION.RELEASE+"_"+"weibosdk"+"_"+"0041005000"+"_android";
    }
}
