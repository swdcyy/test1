package com.unionpay.utils.b;
import com.unionpay.utils.c;
import android.content.Context;
import java.lang.String;
import com.unionpay.utils.UPUtils;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;
import com.unionpay.utils.i;
import java.lang.Integer;
import android.util.Base64;
import java.lang.StringBuilder;
import java.lang.Object;
import org.json.JSONArray;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.Signature;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.security.MessageDigest;
import java.security.cert.CertificateEncodingException;
import java.security.NoSuchAlgorithmException;

public final class b	// class@00100a
{
    public static HashMap a;

    static {
       b.a = new c();
    }
    public static String a(Context p0){
       String str5;
       JSONArray jSONArray;
       int i1;
       Object obj;
       int i2;
       String str = "sePayConf";
       String str1 = "configs";
       String str2 = UPUtils.a(p0, str1);
       String str3 = UPUtils.a(p0, "mode");
       String str4 = UPUtils.a(p0, "or");
       int i = 0;
       if (!TextUtils.isEmpty(str2) && (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4))) {
          try{
             JSONObject jSONObject = new JSONObject(str2);
             str2 = i.a(jSONObject, "sign");
             try{
                i2 = Integer.parseInt(str3);
             }catch(java.lang.NumberFormatException e0){
                i2 = 0;
             }
             str5 = new String(Base64.decode(jSONObject.getString(str1), 2));
             str1 = (jSONObject.has(e0))? new String(Base64.decode(jSONObject.getString(e0), 2)): "";
             if (TextUtils.isEmpty(str1)) {
                str1 = "";
             }
             str4 = b.a(UPUtils.a(str5+str1+str4));
             str = UPUtils.forConfig(i2, str2);
             if (!TextUtils.isEmpty(str) && str.equals(str4)) {
             }
          }catch(java.lang.Exception e0){
          }
       }
    label_008f :
       str5 = "";
    }
    public static String a(InputStream p0,String p1){
       String str = null;
       if (p0 == null) {
          return str;
       }
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       byte[] uobyteArray = new byte[2048];
       int i = p0.read(uobyteArray);
       while (i > 0) {
          uByteArrayOu.write(uobyteArray, 0, i);
       }
       return uByteArrayOu.toString(p1);
    }
    public static String a(String p0){
       String str = "";
       if (p0 == null) {
          return str;
       }
       char[] uocharArray = ("0123456789ABCDEF").toCharArray();
       String str1 = str;
       byte[] bytes = p0.getBytes();
       int len = bytes.length;
       for (int i = 0; i < len; i = i + 1) {
          int b = bytes[i];
          int i1 = b & 0x00f0;
          i1 = i1 >> 4;
          b = b & 0x0f;
          str1 = str1+uocharArray[i1]+uocharArray[b];
       }
       return (str1).trim();
    }
    public static String a(byte[] p0){
       StringBuilder str = new StringBuilder((p0.length * 2));
       int i = 0;
       while (i < p0.length) {
          String str1 = Integer.toHexString(p0[i]);
          int i1 = str1.length();
          if (i1 == 1) {
             str1 = "0"+str1;
          }
          if (i1 > 2) {
             int i2 = i1 - 2;
             str1 = str1.substring(i2, i1);
          }
          str = str+str1.toUpperCase();
          int i3 = p0.length - 1;
          if (i < i3) {
             str = str+':';
          }
          i = i + 1;
       }
       return str;
    }
    public static boolean a(Context p0,String p1){
       int i = 0;
       if (!TextUtils.isEmpty(p1)) {
          try{
             p0.getPackageManager().getPackageInfo(p1, i);
             i = true;
          }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          }
       }
       return i;
    }
    public static String b(Context p0,String p1){
       int i;
       PackageInfo packageInfo;
       ByteArrayInputStream uByteArrayIn;
       CertificateFactory instance;
       X509Certificate x509Certific;
       String str1;
       String str = "";
       try{
          PackageManager packageManag = p0.getPackageManager();
          try{
             i = 0;
             packageInfo = packageManag.getPackageInfo(p1, 64);
          }catch(android.content.pm.PackageManager$NameNotFoundException e3){
             e3.printStackTrace();
             packageInfo = i;
          }
          byte[] uobyteArray = packageInfo.signatures[0].toByteArray();
          try{
             uByteArrayIn = new ByteArrayInputStream(uobyteArray);
             instance = CertificateFactory.getInstance("X509");
          }catch(java.security.cert.CertificateException e3){
             e3.printStackTrace();
             instance = i;
          }catch(java.lang.Exception e0){
          label_005c :
             return e0;
          }
          try{
             x509Certific = instance.generateCertificate(uByteArrayIn);
          }catch(java.security.cert.CertificateException e3){
             e3.printStackTrace();
             x509Certific = i;
          }catch(java.lang.Exception e0){
          }
          try{
             str1 = b.a(MessageDigest.getInstance("SHA1").digest(x509Certific.getEncoded()));
          }catch(java.security.NoSuchAlgorithmException e3){
             e3.printStackTrace();
          }catch(java.security.cert.CertificateEncodingException e3){
             e3.printStackTrace();
          }catch(java.lang.Exception e0){
          }
          return str1.replaceAll(":", str);
       }catch(java.lang.Exception e0){
       }
    }
    public static String c(Context p0,String p1){
       PackageInfo versionName = (!TextUtils.isEmpty(p1))? p0.getPackageManager().getPackageInfo(p1, 0).versionName: "";
    }
}
